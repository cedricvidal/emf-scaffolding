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
   * The number of structural features of the '<em>Scaffolding Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAFFOLDING_ELEMENT_FEATURE_COUNT = 0;

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
   * The feature id for the '<em><b>Ref Package</b></em>' reference.
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
  int RULE__NAME = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__WHEN = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__THEN = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 3;

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
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SymbolImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__NAME = 0;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = 1;

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
  int VARIABLE__NAME = SYMBOL__NAME;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ExpressionImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFeatureRef()
   * @generated
   */
  int FEATURE_REF = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REF__NAME = SYMBOL__NAME;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REF__FEATURE = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REF_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

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
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

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
  int LIST_LITERAL__ITEMS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SetterImpl <em>Setter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SetterImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getSetter()
   * @generated
   */
  int SETTER = 17;

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
  int FUNCTION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Java Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__JAVA_CLASS = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__OPERATION = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = SCAFFOLDING_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.UpdateStatementImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getUpdateStatement()
   * @generated
   */
  int UPDATE_STATEMENT = 19;

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
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.OperationImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 21;

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
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.NotExpressionImpl <em>Not Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.NotExpressionImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getNotExpression()
   * @generated
   */
  int NOT_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

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
  int FUNCTION_LITERAL__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LITERAL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SymbolRefImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getSymbolRef()
   * @generated
   */
  int SYMBOL_REF = 24;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symbol Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.IntLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BooleanLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FloatLiteralImpl
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold <em>Scaffold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scaffold</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold
   * @generated
   */
  EClass getScaffold();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold#getRefPackage <em>Ref Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Package</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Scaffold#getRefPackage()
   * @see #getScaffold()
   * @generated
   */
  EReference getScaffold_RefPackage();

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
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRef <em>Feature Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Ref</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRef
   * @generated
   */
  EClass getFeatureRef();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRef#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FeatureRef#getFeature()
   * @see #getFeatureRef()
   * @generated
   */
  EReference getFeatureRef_Feature();

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
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function#getJavaClass <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Java Class</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function#getJavaClass()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_JavaClass();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operation</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Function#getOperation()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Operation();

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
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Symbol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.Symbol#getName()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Name();

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
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Expression</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.NotExpression
   * @generated
   */
  EClass getNotExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.NotExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.NotExpression#getExp()
   * @see #getNotExpression()
   * @generated
   */
  EReference getNotExpression_Exp();

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
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FunctionLiteral#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FunctionLiteral#getArguments()
   * @see #getFunctionLiteral()
   * @generated
   */
  EReference getFunctionLiteral_Arguments();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Ref</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SymbolRef
   * @generated
   */
  EClass getSymbolRef();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SymbolRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.SymbolRef#getRef()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Ref();

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
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EAttribute getFloatLiteral_Value();

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
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldImpl <em>Scaffold</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ScaffoldImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getScaffold()
     * @generated
     */
    EClass SCAFFOLD = eINSTANCE.getScaffold();

    /**
     * The meta object literal for the '<em><b>Ref Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCAFFOLD__REF_PACKAGE = eINSTANCE.getScaffold_RefPackage();

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
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.ExpressionImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FeatureRefImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFeatureRef()
     * @generated
     */
    EClass FEATURE_REF = eINSTANCE.getFeatureRef();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_REF__FEATURE = eINSTANCE.getFeatureRef_Feature();

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
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FunctionImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Java Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__JAVA_CLASS = eINSTANCE.getFunction_JavaClass();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__OPERATION = eINSTANCE.getFunction_Operation();

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
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SymbolImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getSymbol()
     * @generated
     */
    EClass SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

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

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.NotExpressionImpl <em>Not Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.NotExpressionImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getNotExpression()
     * @generated
     */
    EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EXPRESSION__EXP = eINSTANCE.getNotExpression_Exp();

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
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_LITERAL__ARGUMENTS = eINSTANCE.getFunctionLiteral_Arguments();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.SymbolRefImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getSymbolRef()
     * @generated
     */
    EClass SYMBOL_REF = eINSTANCE.getSymbolRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF__REF = eINSTANCE.getSymbolRef_Ref();

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
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.BooleanLiteralImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.FloatLiteralImpl
     * @see org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl.EmfscaffoldingdslPackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

  }

} //EmfscaffoldingdslPackage
