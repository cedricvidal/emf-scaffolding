/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.EmfscaffoldingdslFactory
 * @model kind="package"
 * @generated
 */
public interface EmfscaffoldingdslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "emfscaffoldingdsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/emf/scaffolding/1.0.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "emfscaffoldingdsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmfscaffoldingdslPackage eINSTANCE = org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingImpl <em>Scaffolding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getScaffolding()
   * @generated
   */
  int SCAFFOLDING = 0;

  /**
   * The feature id for the '<em><b>Scaffold</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAFFOLDING__SCAFFOLD = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAFFOLDING__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Scaffolding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAFFOLDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingElementImpl <em>Scaffolding Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingElementImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getScaffoldingElement()
   * @generated
   */
  int SCAFFOLDING_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAFFOLDING_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Scaffolding Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAFFOLDING_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldImpl <em>Scaffold</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getScaffold()
   * @generated
   */
  int SCAFFOLD = 2;

  /**
   * The feature id for the '<em><b>Ref Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAFFOLD__REF_PACKAGE = 0;

  /**
   * The number of structural features of the '<em>Scaffold</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAFFOLD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.RuleImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getRule()
   * @generated
   */
  int RULE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = SCAFFOLDING_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__WHEN = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__THEN = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.WhenBlockImpl <em>When Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.WhenBlockImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getWhenBlock()
   * @generated
   */
  int WHEN_BLOCK = 4;

  /**
   * The feature id for the '<em><b>Matches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_BLOCK__MATCHES = 0;

  /**
   * The number of structural features of the '<em>When Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 5;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.MatchImpl <em>Match</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.MatchImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getMatch()
   * @generated
   */
  int MATCH = 6;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH__VAR = BINDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH__TYPE = BINDING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH__PARAMS = BINDING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Match</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_FEATURE_COUNT = BINDING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.VariableImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ParamImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getParam()
   * @generated
   */
  int PARAM = 8;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__PROPERTY = BINDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__VAR = BINDING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingExpressionImpl <em>Binding Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingExpressionImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getBindingExpression()
   * @generated
   */
  int BINDING_EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Binding Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefLiteralImpl <em>Feature Ref Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFeatureRefLiteral()
   * @generated
   */
  int FEATURE_REF_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REF_LITERAL__REF = BINDING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Ref Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REF_LITERAL_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ThenBlockImpl <em>Then Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ThenBlockImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getThenBlock()
   * @generated
   */
  int THEN_BLOCK = 11;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Then Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.StatementImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 12;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = BINDING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.CreateStatementImpl <em>Create Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.CreateStatementImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getCreateStatement()
   * @generated
   */
  int CREATE_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_STATEMENT__VAR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ExpressionImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 19;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.CreateClassImpl <em>Create Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.CreateClassImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getCreateClass()
   * @generated
   */
  int CREATE_CLASS = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CLASS__TYPE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CLASS__SETTERS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CLASS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.StringLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = BINDING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ListLiteralImpl <em>List Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ListLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getListLiteral()
   * @generated
   */
  int LIST_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__ITEMS = BINDING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.VarRefLiteralImpl <em>Var Ref Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.VarRefLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getVarRefLiteral()
   * @generated
   */
  int VAR_REF_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_LITERAL__VAR_REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Ref Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SetterImpl <em>Setter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SetterImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getSetter()
   * @generated
   */
  int SETTER = 18;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER__GUARD = 2;

  /**
   * The number of structural features of the '<em>Setter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = SCAFFOLDING_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Java Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__JAVA_CLASS = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.UpdateStatementImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getUpdateStatement()
   * @generated
   */
  int UPDATE_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__VAR_REF = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__SETTERS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingOperationImpl <em>Binding Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingOperationImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getBindingOperation()
   * @generated
   */
  int BINDING_OPERATION = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_OPERATION__LEFT = BINDING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_OPERATION__OP = BINDING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_OPERATION__RIGHT = BINDING_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binding Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_OPERATION_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionLiteralImpl <em>Function Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFunctionLiteral()
   * @generated
   */
  int FUNCTION_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LITERAL__FUNCTION = BINDING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LITERAL__EXP = BINDING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LITERAL_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.IntLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = BINDING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = BINDING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.OperationImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding <em>Scaffolding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scaffolding</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding
   * @generated
   */
  EClass getScaffolding();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding#getScaffold <em>Scaffold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scaffold</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding#getScaffold()
   * @see #getScaffolding()
   * @generated
   */
  EReference getScaffolding_Scaffold();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffolding#getElements()
   * @see #getScaffolding()
   * @generated
   */
  EReference getScaffolding_Elements();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ScaffoldingElement <em>Scaffolding Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scaffolding Element</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ScaffoldingElement
   * @generated
   */
  EClass getScaffoldingElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ScaffoldingElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ScaffoldingElement#getName()
   * @see #getScaffoldingElement()
   * @generated
   */
  EAttribute getScaffoldingElement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold <em>Scaffold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scaffold</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold
   * @generated
   */
  EClass getScaffold();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold#getRefPackage <em>Ref Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref Package</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold#getRefPackage()
   * @see #getScaffold()
   * @generated
   */
  EAttribute getScaffold_RefPackage();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule#getWhen()
   * @see #getRule()
   * @generated
   */
  EReference getRule_When();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Rule#getThen()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Then();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock <em>When Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Block</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock
   * @generated
   */
  EClass getWhenBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock#getMatches <em>Matches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Matches</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.WhenBlock#getMatches()
   * @see #getWhenBlock()
   * @generated
   */
  EReference getWhenBlock_Matches();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match
   * @generated
   */
  EClass getMatch();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match#getVar()
   * @see #getMatch()
   * @generated
   */
  EReference getMatch_Var();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match#getType()
   * @see #getMatch()
   * @generated
   */
  EReference getMatch_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Match#getParams()
   * @see #getMatch()
   * @generated
   */
  EReference getMatch_Params();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param#getProperty()
   * @see #getParam()
   * @generated
   */
  EReference getParam_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Param#getVar()
   * @see #getParam()
   * @generated
   */
  EReference getParam_Var();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingExpression <em>Binding Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding Expression</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingExpression
   * @generated
   */
  EClass getBindingExpression();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRefLiteral <em>Feature Ref Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Ref Literal</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRefLiteral
   * @generated
   */
  EClass getFeatureRefLiteral();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRefLiteral#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRefLiteral#getRef()
   * @see #getFeatureRefLiteral()
   * @generated
   */
  EReference getFeatureRefLiteral_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ThenBlock <em>Then Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then Block</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ThenBlock
   * @generated
   */
  EClass getThenBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ThenBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ThenBlock#getStatements()
   * @see #getThenBlock()
   * @generated
   */
  EReference getThenBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateStatement <em>Create Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Statement</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateStatement
   * @generated
   */
  EClass getCreateStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateStatement#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateStatement#getVar()
   * @see #getCreateStatement()
   * @generated
   */
  EReference getCreateStatement_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateStatement#getExpression()
   * @see #getCreateStatement()
   * @generated
   */
  EReference getCreateStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass <em>Create Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Class</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass
   * @generated
   */
  EClass getCreateClass();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass#getType()
   * @see #getCreateClass()
   * @generated
   */
  EReference getCreateClass_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.CreateClass#getSetters()
   * @see #getCreateClass()
   * @generated
   */
  EReference getCreateClass_Setters();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ListLiteral <em>List Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Literal</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ListLiteral
   * @generated
   */
  EClass getListLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ListLiteral#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.ListLiteral#getItems()
   * @see #getListLiteral()
   * @generated
   */
  EReference getListLiteral_Items();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.VarRefLiteral <em>Var Ref Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Ref Literal</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.VarRefLiteral
   * @generated
   */
  EClass getVarRefLiteral();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.VarRefLiteral#getVarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var Ref</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.VarRefLiteral#getVarRef()
   * @see #getVarRefLiteral()
   * @generated
   */
  EReference getVarRefLiteral_VarRef();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter <em>Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Setter</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter
   * @generated
   */
  EClass getSetter();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter#getProperty()
   * @see #getSetter()
   * @generated
   */
  EReference getSetter_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter#getExpression()
   * @see #getSetter()
   * @generated
   */
  EReference getSetter_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter#isGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Guard</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Setter#isGuard()
   * @see #getSetter()
   * @generated
   */
  EAttribute getSetter_Guard();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function#getJavaClass <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Class</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function#getJavaClass()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_JavaClass();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement <em>Update Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Statement</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement
   * @generated
   */
  EClass getUpdateStatement();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement#getVarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var Ref</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement#getVarRef()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_VarRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.UpdateStatement#getSetters()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_Setters();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingOperation <em>Binding Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding Operation</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingOperation
   * @generated
   */
  EClass getBindingOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingOperation#getLeft()
   * @see #getBindingOperation()
   * @generated
   */
  EReference getBindingOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingOperation#getOp()
   * @see #getBindingOperation()
   * @generated
   */
  EAttribute getBindingOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BindingOperation#getRight()
   * @see #getBindingOperation()
   * @generated
   */
  EReference getBindingOperation_Right();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FunctionLiteral <em>Function Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Literal</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FunctionLiteral
   * @generated
   */
  EClass getFunctionLiteral();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FunctionLiteral#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FunctionLiteral#getFunction()
   * @see #getFunctionLiteral()
   * @generated
   */
  EReference getFunctionLiteral_Function();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FunctionLiteral#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FunctionLiteral#getExp()
   * @see #getFunctionLiteral()
   * @generated
   */
  EReference getFunctionLiteral_Exp();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation#getOp()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EmfscaffoldingdslFactory getEmfscaffoldingdslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingImpl <em>Scaffolding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getScaffolding()
     * @generated
     */
    EClass SCAFFOLDING = eINSTANCE.getScaffolding();

    /**
     * The meta object literal for the '<em><b>Scaffold</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCAFFOLDING__SCAFFOLD = eINSTANCE.getScaffolding_Scaffold();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCAFFOLDING__ELEMENTS = eINSTANCE.getScaffolding_Elements();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingElementImpl <em>Scaffolding Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldingElementImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getScaffoldingElement()
     * @generated
     */
    EClass SCAFFOLDING_ELEMENT = eINSTANCE.getScaffoldingElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCAFFOLDING_ELEMENT__NAME = eINSTANCE.getScaffoldingElement_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldImpl <em>Scaffold</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getScaffold()
     * @generated
     */
    EClass SCAFFOLD = eINSTANCE.getScaffold();

    /**
     * The meta object literal for the '<em><b>Ref Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCAFFOLD__REF_PACKAGE = eINSTANCE.getScaffold_RefPackage();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.RuleImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__WHEN = eINSTANCE.getRule_When();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__THEN = eINSTANCE.getRule_Then();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.WhenBlockImpl <em>When Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.WhenBlockImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getWhenBlock()
     * @generated
     */
    EClass WHEN_BLOCK = eINSTANCE.getWhenBlock();

    /**
     * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_BLOCK__MATCHES = eINSTANCE.getWhenBlock_Matches();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.MatchImpl <em>Match</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.MatchImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getMatch()
     * @generated
     */
    EClass MATCH = eINSTANCE.getMatch();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH__VAR = eINSTANCE.getMatch_Var();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH__TYPE = eINSTANCE.getMatch_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH__PARAMS = eINSTANCE.getMatch_Params();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.VariableImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ParamImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__PROPERTY = eINSTANCE.getParam_Property();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__VAR = eINSTANCE.getParam_Var();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingExpressionImpl <em>Binding Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingExpressionImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getBindingExpression()
     * @generated
     */
    EClass BINDING_EXPRESSION = eINSTANCE.getBindingExpression();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefLiteralImpl <em>Feature Ref Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefLiteralImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFeatureRefLiteral()
     * @generated
     */
    EClass FEATURE_REF_LITERAL = eINSTANCE.getFeatureRefLiteral();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_REF_LITERAL__REF = eINSTANCE.getFeatureRefLiteral_Ref();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ThenBlockImpl <em>Then Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ThenBlockImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getThenBlock()
     * @generated
     */
    EClass THEN_BLOCK = eINSTANCE.getThenBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEN_BLOCK__STATEMENTS = eINSTANCE.getThenBlock_Statements();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.StatementImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.CreateStatementImpl <em>Create Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.CreateStatementImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getCreateStatement()
     * @generated
     */
    EClass CREATE_STATEMENT = eINSTANCE.getCreateStatement();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_STATEMENT__VAR = eINSTANCE.getCreateStatement_Var();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_STATEMENT__EXPRESSION = eINSTANCE.getCreateStatement_Expression();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.CreateClassImpl <em>Create Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.CreateClassImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getCreateClass()
     * @generated
     */
    EClass CREATE_CLASS = eINSTANCE.getCreateClass();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_CLASS__TYPE = eINSTANCE.getCreateClass_Type();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_CLASS__SETTERS = eINSTANCE.getCreateClass_Setters();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.StringLiteralImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ListLiteralImpl <em>List Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ListLiteralImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getListLiteral()
     * @generated
     */
    EClass LIST_LITERAL = eINSTANCE.getListLiteral();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL__ITEMS = eINSTANCE.getListLiteral_Items();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.VarRefLiteralImpl <em>Var Ref Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.VarRefLiteralImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getVarRefLiteral()
     * @generated
     */
    EClass VAR_REF_LITERAL = eINSTANCE.getVarRefLiteral();

    /**
     * The meta object literal for the '<em><b>Var Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_REF_LITERAL__VAR_REF = eINSTANCE.getVarRefLiteral_VarRef();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SetterImpl <em>Setter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SetterImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getSetter()
     * @generated
     */
    EClass SETTER = eINSTANCE.getSetter();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTER__PROPERTY = eINSTANCE.getSetter_Property();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTER__EXPRESSION = eINSTANCE.getSetter_Expression();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTER__GUARD = eINSTANCE.getSetter_Guard();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ExpressionImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Java Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__JAVA_CLASS = eINSTANCE.getFunction_JavaClass();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.UpdateStatementImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getUpdateStatement()
     * @generated
     */
    EClass UPDATE_STATEMENT = eINSTANCE.getUpdateStatement();

    /**
     * The meta object literal for the '<em><b>Var Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__VAR_REF = eINSTANCE.getUpdateStatement_VarRef();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__SETTERS = eINSTANCE.getUpdateStatement_Setters();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingOperationImpl <em>Binding Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BindingOperationImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getBindingOperation()
     * @generated
     */
    EClass BINDING_OPERATION = eINSTANCE.getBindingOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_OPERATION__LEFT = eINSTANCE.getBindingOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_OPERATION__OP = eINSTANCE.getBindingOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_OPERATION__RIGHT = eINSTANCE.getBindingOperation_Right();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionLiteralImpl <em>Function Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionLiteralImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFunctionLiteral()
     * @generated
     */
    EClass FUNCTION_LITERAL = eINSTANCE.getFunctionLiteral();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_LITERAL__FUNCTION = eINSTANCE.getFunctionLiteral_Function();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_LITERAL__EXP = eINSTANCE.getFunctionLiteral_Exp();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.IntLiteralImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.OperationImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OP = eINSTANCE.getOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

  }

} //EmfscaffoldingdslPackage
