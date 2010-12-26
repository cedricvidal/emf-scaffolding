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
package org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.EMFScaffoldingSessionPackage;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Input;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Output;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingFile;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.ScaffoldingSession;
import org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.Trash;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaffolding Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingSessionImpl#getScaffoldingFile <em>Scaffolding File</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingSessionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingSessionImpl#getTrash <em>Trash</em>}</li>
 *   <li>{@link org.eclipselabs.emf.scaffolding.session.emfscaffoldingsession.impl.ScaffoldingSessionImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScaffoldingSessionImpl extends EObjectImpl implements ScaffoldingSession {
	/**
	 * The cached value of the '{@link #getScaffoldingFile() <em>Scaffolding File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaffoldingFile()
	 * @generated
	 * @ordered
	 */
	protected ScaffoldingFile scaffoldingFile;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getTrash() <em>Trash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrash()
	 * @generated
	 * @ordered
	 */
	protected Trash trash;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaffoldingSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFScaffoldingSessionPackage.Literals.SCAFFOLDING_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaffoldingFile getScaffoldingFile() {
		return scaffoldingFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaffoldingFile(ScaffoldingFile newScaffoldingFile, NotificationChain msgs) {
		ScaffoldingFile oldScaffoldingFile = scaffoldingFile;
		scaffoldingFile = newScaffoldingFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE, oldScaffoldingFile, newScaffoldingFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaffoldingFile(ScaffoldingFile newScaffoldingFile) {
		if (newScaffoldingFile != scaffoldingFile) {
			NotificationChain msgs = null;
			if (scaffoldingFile != null)
				msgs = ((InternalEObject)scaffoldingFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE, null, msgs);
			if (newScaffoldingFile != null)
				msgs = ((InternalEObject)newScaffoldingFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE, null, msgs);
			msgs = basicSetScaffoldingFile(newScaffoldingFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE, newScaffoldingFile, newScaffoldingFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trash getTrash() {
		return trash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrash(Trash newTrash, NotificationChain msgs) {
		Trash oldTrash = trash;
		trash = newTrash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH, oldTrash, newTrash);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrash(Trash newTrash) {
		if (newTrash != trash) {
			NotificationChain msgs = null;
			if (trash != null)
				msgs = ((InternalEObject)trash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH, null, msgs);
			if (newTrash != null)
				msgs = ((InternalEObject)newTrash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH, null, msgs);
			msgs = basicSetTrash(newTrash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH, newTrash, newTrash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE:
				return basicSetScaffoldingFile(null, msgs);
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH:
				return basicSetTrash(null, msgs);
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE:
				return getScaffoldingFile();
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__INPUTS:
				return getInputs();
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH:
				return getTrash();
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__OUTPUTS:
				return getOutputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE:
				setScaffoldingFile((ScaffoldingFile)newValue);
				return;
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH:
				setTrash((Trash)newValue);
				return;
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Output>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE:
				setScaffoldingFile((ScaffoldingFile)null);
				return;
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__INPUTS:
				getInputs().clear();
				return;
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH:
				setTrash((Trash)null);
				return;
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__OUTPUTS:
				getOutputs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__SCAFFOLDING_FILE:
				return scaffoldingFile != null;
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__TRASH:
				return trash != null;
			case EMFScaffoldingSessionPackage.SCAFFOLDING_SESSION__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScaffoldingSessionImpl
