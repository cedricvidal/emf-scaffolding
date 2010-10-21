/*******************************************************************************
 * Copyright (c) 2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Vidal - initial API and implementation
 *     Jerome Benois - Rewrite compiler and runtime based on new Drools Knowledge API
 *******************************************************************************/
package org.eclipselabs.emf.scaffolding.runtime.internal.compiler;

import java.io.IOException;

import org.drools.builder.ResourceConfiguration;
import org.drools.builder.ResourceType;
import org.drools.compiler.DroolsError;
import org.drools.compiler.PackageBuilder;
import org.drools.compiler.PackageBuilderErrors;
import org.drools.compiler.ResourceTypeBuilder;
import org.drools.io.Resource;
import org.drools.lang.DrlDumper;
import org.drools.lang.descr.AndDescr;
import org.drools.lang.descr.BaseDescr;
import org.drools.lang.descr.FieldConstraintDescr;
import org.drools.lang.descr.ImportDescr;
import org.drools.lang.descr.LiteralRestrictionDescr;
import org.drools.lang.descr.PackageDescr;
import org.drools.lang.descr.PatternDescr;
import org.drools.lang.descr.RuleDescr;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Expression;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRefLiteral;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ScaffoldingElement;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ThenBlock;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock;

public class ESLBuilder implements ResourceTypeBuilder {

	private PackageBuilder packageBuilder;

	@Override
	public void setPackageBuilder(PackageBuilder packageBuilder) {
		this.packageBuilder = packageBuilder;
	}

	@Override
	public void addKnowledgeResource(Resource resource, ResourceType type, ResourceConfiguration configuration) {
		ESLParser parser = new ESLParser();
		try {
			Scaffolding scaffolding = parser.parse(resource.getInputStream());
			build(packageBuilder, scaffolding);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void build(PackageBuilder packageBuilder, Scaffolding scaffolding) {
		// String nsURI = scaffolding.getScaffold().getRefPackage();
		// TODO remove hard coding
		PackageDescr packageDescr = new PackageDescr("namespace1");
		packageDescr.addImport(new ImportDescr("org.eclipselabs.emf.scaffolding.tests.model1.DAO"));
		packageDescr.addImport(new ImportDescr("org.eclipselabs.emf.scaffolding.tests.model1.Model1Factory"));
		for (ScaffoldingElement element : scaffolding.getElements()) {
			if (element instanceof Rule) {
				Rule rule = (Rule) element;
				packageDescr.addRule(createRule(packageDescr, rule));
				packageBuilder.addPackage(packageDescr);
				if (packageBuilder.hasErrors()) {
					PackageBuilderErrors errors = packageBuilder.getErrors();
					for (DroolsError error : errors.getErrors()) {
						System.err.println(error);
					}
				}
			}
		}
		System.out.println(new DrlDumper().dump(packageDescr));

	}

	private RuleDescr createRule(PackageDescr packageDescr, Rule rule) {
		RuleDescr ruleDescr = new RuleDescr(rule.getName());
		ruleDescr.setLhs(createCondition(packageDescr, rule.getWhen()));
		ruleDescr.setConsequence(createConsequence(rule.getThen()));
		return ruleDescr;
	}

	private AndDescr createCondition(PackageDescr packageDescr, WhenBlock condition) {
		AndDescr andDescr = new AndDescr();
		for (Match match : condition.getMatches()) {
			PatternDescr patternDescr = new PatternDescr(match.getType().getName(), "$" + match.getVar().getName());
			packageDescr.addImport(new ImportDescr(match.getType().getInstanceClassName()));
			for (Param param : match.getParams()) {
				patternDescr.addConstraint(createConstraint(param));
			}
			andDescr.addDescr(patternDescr);
		}
		return andDescr;
	}

	private BaseDescr createConstraint(Param param) {
		Expression expr = param.getProperty();
		// TODO add variable assignment in order to store the result of
		// constraint evaluation : Entity( name : name != null )
		Variable var = param.getVar();
		PatternDescr patternDescr = new PatternDescr();
		patternDescr.setIdentifier(var.getName());
		if (expr instanceof Operation) {
			Operation op = (Operation) expr;
			String fieldName = ((FeatureRefLiteral) op.getLeft()).getRef().getName();
			// (name
			FieldConstraintDescr fieldConstraintDescr = new FieldConstraintDescr(fieldName);
			// != null)
			if (op.getRight() == null) {
				LiteralRestrictionDescr literalRestrictionDescr = new LiteralRestrictionDescr(op.getOp(), null);
				fieldConstraintDescr.addRestriction(literalRestrictionDescr);
			} else {
				// TODO
			}
			return fieldConstraintDescr;
		}
		return patternDescr;
	}

	private Object createConsequence(ThenBlock consequence) {
		// TODO compile consequence
		StringBuffer sb = new StringBuffer();
		sb.append("System.out.println( \"Scaffolding DAO for entity \"); \n");
		sb.append("DAO dao = Model1Factory.eINSTANCE.createDAO(); \n");
		sb.append("//dao.setName(name + \"Dao\"); \n");
		sb.append("dao.setEntity($e); \n");
		sb.append("dao.setApplication($e.getApplication()); \n");
		String javaCode = sb.toString();
		return javaCode;
	}
}
