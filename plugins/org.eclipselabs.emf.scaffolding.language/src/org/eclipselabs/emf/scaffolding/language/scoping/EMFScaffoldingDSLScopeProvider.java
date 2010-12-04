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
import static com.google.common.collect.Iterables.transform;
import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslPackage;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Symbol;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SymbolRef;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock;
import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefImpl;
import org.eclipselabs.emf.scaffolding.language.util.ESLIterators;

import com.google.common.collect.Iterators;

/**
 * This class contains scoping description for the EMFScaffoldingDSL language.
 * 
 */
public class EMFScaffoldingDSLScopeProvider extends
		AbstractDeclarativeScopeProvider {

	IScope scope_EClass(Scaffolding context, EReference eReference) {
		EPackage pkg = getPackage(context);
		if (pkg != null) {
			return scopeFor(filter(asIterable(pkg.eAllContents()), EClass.class));
		}
		return IScope.NULLSCOPE;
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
		return scopeFor(asIterable(Iterators.filter(context.eAllContents(),
				Variable.class)));
	}

	public static EReference changeRefType(EReference ref, EClass primitiveType) {
		EClass containingClassClone = EcoreUtil.copy(ref.getEContainingClass());
		EReference primitiveTypeRef = (EReference) containingClassClone.getEStructuralFeature(ref.getFeatureID());
		primitiveTypeRef.setEType(primitiveType);
		return primitiveTypeRef;
	}

	IScope scope_SymbolRef_ref(final Match context, EReference eReference) {
		IScope parent = getScope(context.eContainer(), eReference);
		EClass type = context.getType();
		if(type != null) {
			Iterable<Symbol> symbols = createSymbolsForFeatures(type.getEAllStructuralFeatures(), context);
			return scopeFor(symbols, parent);
		} else {
			return parent;
		}
	}

	/**
	 * Since {@link EStructuralFeature}s are not {@link Symbol}s, we need to
	 * adapt them in order to integrate them in the scope as {@link Symbol}.
	 * This allows to avoid using untyped {@link EObject} references in the DSL.
	 * 
	 * @param features
	 * @param context
	 * @return
	 */
	protected Iterable<Symbol> createSymbolsForFeatures(
			EList<EStructuralFeature> features, final Match context) {
		return transform(features, new com.google.common.base.Function<EStructuralFeature, Symbol>() {
			@Override
			public Symbol apply(EStructuralFeature from) {
				ScopeFeatureRef scopeFeatureRef = new ScopeFeatureRef();
				scopeFeatureRef.setFeature(from);

				tryAddingScopeFeatureRefToContextResourceSet(context, scopeFeatureRef);

				return scopeFeatureRef;
			}

		});
	}

	/**
	 * This implementation of {@link Symbol} delegates computation of its name
	 * to the referenced feature's name
	 */
	private static class ScopeFeatureRef extends FeatureRefImpl implements Symbol {
		@Override
		public String getName() {
			return getFeature() != null ? getFeature().getName() : null;
		}
	}

	protected void tryAddingScopeFeatureRefToContextResourceSet(
			final Match context, ScopeFeatureRef scopeFeatureRef) {
		Resource contextResource = context.eResource();
		ResourceSet contextResourceSet = contextResource != null ? contextResource.getResourceSet() : null;
		Resource res = contextResourceSet != null ? contextResourceSet.createResource(URI.createURI("scopeFeatureRefResource.xmi")) : null;
		if(res != null) {
			res.getContents().add(scopeFeatureRef);
		}
	}

	IScope scope_SymbolRef_ref(SymbolRef context, EReference eReference) {
		return getScope(context.eContainer(), changeRefType(eReference, EmfscaffoldingdslPackage.Literals.SYMBOL));
	}

	IScope scope_UpdateStatement_varRef(UpdateStatement context,
			EReference reference) {
		Rule rule = Iterators.filter(ESLIterators.ancestors(context), Rule.class).next();
		WhenBlock when = rule.getWhen();
		return scopeFor(asIterable(Iterators.filter(when.eAllContents(),
				Variable.class)));
	}

	private IScope attributes(Match context) {
		EClass type = context.getType();
		if (type != null) {
			return scopeFor(type.getEAllStructuralFeatures());
		}
		return null;
	}

	private IScope attributes(CreateClass context) {
		EClass type = context.getType();
		if (type != null) {
			return scopeFor(type.getEAllStructuralFeatures());
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
			return scopeFor(type.getEAllStructuralFeatures());
		}
		return null;
	}

	private EPackage getPackage(Scaffolding context) {
		Scaffold scaffold = context.getScaffold();
		return scaffold != null ? scaffold.getRefPackage() : null;
	}

	/**
	 * Looks up {@link EPackage}s in the {@link EPackage.Registry}.
	 * 
	 * @param e
	 * @param ref
	 * @return
	 */
	IScope scope_EPackage(Scaffolding e, EReference ref) {
		List<EPackage> packages = new ArrayList<EPackage>();

		// to prevent from ConcurrentModificationException which might occur on the keySet while calling Registry#Registry(String)
		HashSet<String> names = new HashSet<String>(EPackage.Registry.INSTANCE.keySet());

		for (String name : names) {
			EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(name);
			packages.add(pkg);
		}
		return scopeFor(packages, PackageNameResolver.INSTANCE, IScope.NULLSCOPE);
	}

	private static <T> Iterable<T> asIterable(Iterator<T> classes) {
		ArrayList<T> list = new ArrayList<T>();
		Iterators.addAll(list, classes);
		return list;
	}

	private static class PackageNameResolver implements com.google.common.base.Function<EPackage, String> {

		public static PackageNameResolver INSTANCE = new PackageNameResolver();

		@Override
		public String apply(EPackage from) {
			return from.getNsURI();
		}
	}

	private static class OperationNameResolver implements com.google.common.base.Function<JvmOperation, String> {

		public static OperationNameResolver INSTANCE = new OperationNameResolver();

		@Override
		public String apply(JvmOperation from) {
			return from.getSimpleName();
		}
		
	}

	IScope scope_JvmOperation(Function context, EReference eReference) {
		JvmGenericType javaClass = context.getJavaClass();
		if (javaClass != null) {
			Iterable<JvmOperation> operations = filter(javaClass.getMembers(), JvmOperation.class);
			return new SimpleScope(Scopes.scopedElementsFor(operations, OperationNameResolver.INSTANCE));
		}
		return null;
	}

}
