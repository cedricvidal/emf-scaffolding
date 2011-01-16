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
package org.eclipselabs.emf.scaffolding.tests.acceptance.soa;

import static org.eclipselabs.emf.scaffolding.tests.soa.builder.SoaBuilders.buildComponent;
import static org.eclipselabs.emf.scaffolding.tests.soa.builder.SoaBuilders.buildDAO;
import static org.eclipselabs.emf.scaffolding.tests.soa.builder.SoaBuilders.buildEntity;
import static org.eclipselabs.emf.scaffolding.tests.soa.builder.SoaBuilders.buildLink;
import static org.eclipselabs.emf.scaffolding.tests.soa.builder.SoaBuilders.buildMethod;
import static org.eclipselabs.emf.scaffolding.tests.soa.builder.SoaBuilders.buildPackage;
import static org.eclipselabs.emf.scaffolding.tests.soa.builder.SoaBuilders.buildService;
import static org.eclipselabs.emf.scaffolding.tests.soa.builder.SoaBuilders.buildSlot;
import static org.eclipselabs.emf.scaffolding.tests.util.ModelAssert.assertMatch;

import org.drools.KnowledgeBase;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emf.scaffolding.runtime.ScaffoldingExecutionEnvironment;
import org.eclipselabs.emf.scaffolding.runtime.internal.compiler.ESLCompiler;
import org.eclipselabs.emf.scaffolding.tests.BaseTest;
import org.eclipselabs.emf.scaffolding.tests.resources.Resources;
import org.eclipselabs.emf.scaffolding.tests.soa.Package;
import org.eclipselabs.emf.scaffolding.tests.soa.builder.EntityBuilder;
import org.eclipselabs.emf.scaffolding.tests.soa.builder.PackageBuilder;
import org.eclipselabs.emf.scaffolding.tests.soa.builder.ServiceBuilder;
import org.eclipselabs.emf.scaffolding.tests.soa.builder.SlotBuilder;
import org.junit.Test;

public class SoaAcceptanceTest extends BaseTest {

	@Test
	public void oneEntityGeneratesThemAll() throws Exception {
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.createResource(URI.createURI("model.xmi"));

		PackageBuilder pkg = buildPackage("birds");
		res.getContents().add(pkg.end());

		ESLCompiler compiler = new ESLCompiler();
		// TODO maybe create a ScallfoldBase to encapsulate KnowledgeBase
		KnowledgeBase kbase = compiler.compile(Resources.class
				.getResourceAsStream("SOA.esl"),
				SoaAcceptanceTest.class.getClassLoader());

		// Init Exec environment
		ScaffoldingExecutionEnvironment execEnv = new ScaffoldingExecutionEnvironment(
				kbase);
		execEnv.register(pkg.end());

		pkg.addElements(buildEntity("user"));

		Package expected = buildExpectedModel();

		assertMatch(expected, pkg.end());

	}

	protected Package buildExpectedModel() {
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.createResource(URI.createURI("expected.xmi"));

		EntityBuilder user = buildEntity("user");

		ServiceBuilder userDaoService = buildService("userDaoService")
			.addMethods(buildMethod("createUser"))
			.addMethods(buildMethod("findUser"))
			.addMethods(buildMethod("updateUser"))
			.addMethods(buildMethod("deleteUser"));

		ServiceBuilder userBusinessService = buildService("userBusinessService")
			.addMethods(buildMethod("createUser"))
			.addMethods(buildMethod("findUser"))
			.addMethods(buildMethod("updateUser"))
			.addMethods(buildMethod("deleteUser"));

		SlotBuilder userDaoOutputSlot = buildSlot("userDao")
			.withImplements(userDaoService);

		SlotBuilder userServiceDaoInputSlot = buildSlot("userDao")
			.withImplements(userDaoService);

		PackageBuilder pkg = buildPackage("birds")
			.addElements(user)
			.addElements(buildDAO("userDao")
				.withEntity(user)
				.addElements(userDaoService)
				.addOutputs(userDaoOutputSlot)
				)
			.addElements(buildComponent("userBusinessServiceComponent")
				.addElements(userBusinessService)
				.addOutputs(buildSlot("userService")
					.withImplements(userBusinessService)
					)
				.addInputs(userServiceDaoInputSlot)
				)
			.addElements(buildLink("userDaoLink")
				.withInput(userServiceDaoInputSlot)
				.withOutput(userDaoOutputSlot)
				)
			;

		res.getContents().add(pkg.end());
		return pkg.end();
	}

}
