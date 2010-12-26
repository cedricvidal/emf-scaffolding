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

import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseConfiguration;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.compiler.ResourceTypeBuilderRegistry;
import org.drools.definition.KnowledgePackage;
import org.drools.io.ResourceFactory;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;

public class ESLCompiler {

	static {
		ResourceTypeBuilderRegistry.getInstance().register(ScaffoldingExecutionEnvironment.ESL, new ESLBuilder());
	}

	public KnowledgeBase compile(InputStream eslStream, ClassLoader cl) {
		//ClassLoader cl = ESLCompiler.class.getClassLoader();
		Properties properties = new Properties();
		KnowledgeBaseConfiguration kBaseConfig = KnowledgeBaseFactory.newKnowledgeBaseConfiguration(properties, cl);
		//KnowledgeBaseConfiguration kBaseConfig = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase(kBaseConfig);

		KnowledgeBuilderConfiguration kBuilderConfig = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		// kBuilderConfig.setProperty("drools.dialect.java.compiler", "JANINO");
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(kBuilderConfig);
		kbuilder.add(ResourceFactory.newInputStreamResource(eslStream), ScaffoldingExecutionEnvironment.ESL);

		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);

		return kbase;
	}

}
