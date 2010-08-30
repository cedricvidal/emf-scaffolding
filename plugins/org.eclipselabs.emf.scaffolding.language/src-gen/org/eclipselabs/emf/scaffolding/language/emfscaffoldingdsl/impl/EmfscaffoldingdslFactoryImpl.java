/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.emf.scaffolding.language.emfscaffoldingdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfscaffoldingdslFactoryImpl extends EFactoryImpl implements EmfscaffoldingdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmfscaffoldingdslFactory init()
  {
    try
    {
      EmfscaffoldingdslFactory theEmfscaffoldingdslFactory = (EmfscaffoldingdslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/emf/scaffolding/1.0.0"); 
      if (theEmfscaffoldingdslFactory != null)
      {
        return theEmfscaffoldingdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EmfscaffoldingdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfscaffoldingdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EmfscaffoldingdslPackage.SCAFFOLDING: return createScaffolding();
      case EmfscaffoldingdslPackage.SCAFFOLDING_ELEMENT: return createScaffoldingElement();
      case EmfscaffoldingdslPackage.SCAFFOLD: return createScaffold();
      case EmfscaffoldingdslPackage.RULE: return createRule();
      case EmfscaffoldingdslPackage.WHEN_BLOCK: return createWhenBlock();
      case EmfscaffoldingdslPackage.BINDING: return createBinding();
      case EmfscaffoldingdslPackage.MATCH: return createMatch();
      case EmfscaffoldingdslPackage.VARIABLE: return createVariable();
      case EmfscaffoldingdslPackage.PARAM: return createParam();
      case EmfscaffoldingdslPackage.BINDING_EXPRESSION: return createBindingExpression();
      case EmfscaffoldingdslPackage.FEATURE_REF_LITERAL: return createFeatureRefLiteral();
      case EmfscaffoldingdslPackage.THEN_BLOCK: return createThenBlock();
      case EmfscaffoldingdslPackage.STATEMENT: return createStatement();
      case EmfscaffoldingdslPackage.CREATE_STATEMENT: return createCreateStatement();
      case EmfscaffoldingdslPackage.CREATE_CLASS: return createCreateClass();
      case EmfscaffoldingdslPackage.STRING_LITERAL: return createStringLiteral();
      case EmfscaffoldingdslPackage.LIST_LITERAL: return createListLiteral();
      case EmfscaffoldingdslPackage.VAR_REF_LITERAL: return createVarRefLiteral();
      case EmfscaffoldingdslPackage.SETTER: return createSetter();
      case EmfscaffoldingdslPackage.EXPRESSION: return createExpression();
      case EmfscaffoldingdslPackage.FUNCTION: return createFunction();
      case EmfscaffoldingdslPackage.UPDATE_STATEMENT: return createUpdateStatement();
      case EmfscaffoldingdslPackage.BINDING_OPERATION: return createBindingOperation();
      case EmfscaffoldingdslPackage.FUNCTION_LITERAL: return createFunctionLiteral();
      case EmfscaffoldingdslPackage.INT_LITERAL: return createIntLiteral();
      case EmfscaffoldingdslPackage.OPERATION: return createOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scaffolding createScaffolding()
  {
    ScaffoldingImpl scaffolding = new ScaffoldingImpl();
    return scaffolding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaffoldingElement createScaffoldingElement()
  {
    ScaffoldingElementImpl scaffoldingElement = new ScaffoldingElementImpl();
    return scaffoldingElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scaffold createScaffold()
  {
    ScaffoldImpl scaffold = new ScaffoldImpl();
    return scaffold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenBlock createWhenBlock()
  {
    WhenBlockImpl whenBlock = new WhenBlockImpl();
    return whenBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Match createMatch()
  {
    MatchImpl match = new MatchImpl();
    return match;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingExpression createBindingExpression()
  {
    BindingExpressionImpl bindingExpression = new BindingExpressionImpl();
    return bindingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureRefLiteral createFeatureRefLiteral()
  {
    FeatureRefLiteralImpl featureRefLiteral = new FeatureRefLiteralImpl();
    return featureRefLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThenBlock createThenBlock()
  {
    ThenBlockImpl thenBlock = new ThenBlockImpl();
    return thenBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateStatement createCreateStatement()
  {
    CreateStatementImpl createStatement = new CreateStatementImpl();
    return createStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateClass createCreateClass()
  {
    CreateClassImpl createClass = new CreateClassImpl();
    return createClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListLiteral createListLiteral()
  {
    ListLiteralImpl listLiteral = new ListLiteralImpl();
    return listLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRefLiteral createVarRefLiteral()
  {
    VarRefLiteralImpl varRefLiteral = new VarRefLiteralImpl();
    return varRefLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Setter createSetter()
  {
    SetterImpl setter = new SetterImpl();
    return setter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateStatement createUpdateStatement()
  {
    UpdateStatementImpl updateStatement = new UpdateStatementImpl();
    return updateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingOperation createBindingOperation()
  {
    BindingOperationImpl bindingOperation = new BindingOperationImpl();
    return bindingOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionLiteral createFunctionLiteral()
  {
    FunctionLiteralImpl functionLiteral = new FunctionLiteralImpl();
    return functionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfscaffoldingdslPackage getEmfscaffoldingdslPackage()
  {
    return (EmfscaffoldingdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EmfscaffoldingdslPackage getPackage()
  {
    return EmfscaffoldingdslPackage.eINSTANCE;
  }

} //EmfscaffoldingdslFactoryImpl
