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
package org.eclipselabs.emf.scaffolding.language.scoping;

import static com.google.common.collect.Iterables.filter;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock;
import org.eclipselabs.emf.scaffolding.language.util.Queries;

import com.google.common.collect.Iterators;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class EMFScaffoldingDSLScopeProvider extends
		AbstractDeclarativeScopeProvider {

	IScope scope_EClass(Scaffolding context, EReference eReference) {
		EPackage pkg = getPackage(context);
		if (pkg != null) {
			Iterator<EClass> classes = Iterators.filter(pkg.eAllContents(),
					EClass.class);
			Iterable<EClass> list = asIterable(classes);
			return createScope(list);
		}
		return null;
	}

	// IScope scope_Param_property(Param context, EReference reference) {
	// Match match = (Match) context.eContainer();
	// return attributes(match);
	// }
	//
	// IScope scope_Setter_property(Setter context, EReference reference) {
	// CreateClass match = (CreateClass) context.eContainer();
	// return attributes(match);
	// }

	private SimpleScope createScope(Iterable<? extends EObject> list) {
		return new SimpleScope(Scopes.scopedElementsFor(list));
	}

	IScope scope_EStructuralFeature(Match context, EReference eReference) {
		return attributes(context);
	}

	IScope scope_EStructuralFeature(CreateClass context, EReference eReference) {
		return attributes(context);
	}

	IScope scope_EStructuralFeature(UpdateStatement context,
			EReference eReference) {
		return attributes(context);
	}

	IScope scope_Variable(Rule context, EReference eReference) {
		return createScope(asIterable(Iterators.filter(context.eAllContents(),
				Variable.class)));
	}

	IScope scope_UpdateStatement_varRef(UpdateStatement context,
			EReference reference) {
		Rule rule = filter(Queries.ancestors(context), Rule.class).iterator()
				.next();
		WhenBlock when = rule.getWhen();
		return createScope(asIterable(Iterators.filter(when.eAllContents(),
				Variable.class)));
	}

	private IScope attributes(Match context) {
		EClass type = context.getType();
		if (type != null) {
			return createScope(type.getEAllStructuralFeatures());
		}
		return null;
	}

	private IScope attributes(CreateClass context) {
		EClass type = context.getType();
		if (type != null) {
			return createScope(type.getEAllStructuralFeatures());
		}
		return null;
	}

	private IScope attributes(UpdateStatement context) {
		Variable var = context.getVarRef();
		EClass type = null;
		if (var != null) {
			if (var.eContainer() instanceof Match) {
				Match match = (Match) var.eContainer();
				type = match.getType();
			}
		}
		if (type != null) {
			return createScope(type.getEAllStructuralFeatures());
		}
		return null;
	}

	private EPackage getPackage(Scaffolding context) {
		Scaffold scaffold = context.getScaffold();
		String pkgName = null;
		EPackage pkg = null;

		if (scaffold != null) {
			pkgName = scaffold.getRefPackage();
		}
		if (pkgName != null) {
			pkg = EPackage.Registry.INSTANCE.getEPackage(pkgName);
		}
		return pkg;
	}

	private static <T> Iterable<T> asIterable(Iterator<T> classes) {
		ArrayList<T> list = new ArrayList<T>();
		Iterators.addAll(list, classes);
		return list;
	}

	static class OperationNamingStrategy implements com.google.common.base.Function<JvmOperation, String> {
		public static OperationNamingStrategy INSTANCE = new OperationNamingStrategy();
		@Override
		public String apply(JvmOperation from) {
			return from.getSimpleName();
		}
		
	}

	IScope scope_JvmOperation(Function context, EReference eReference) {
		JvmGenericType javaClass = context.getJavaClass();
		if (javaClass != null) {
			Iterable<JvmOperation> operations = filter(javaClass.getMembers(), JvmOperation.class);
			return new SimpleScope(Scopes.scopedElementsFor(operations, OperationNamingStrategy.INSTANCE));
		}
		return null;
	}

}
