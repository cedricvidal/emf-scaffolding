/*
* generated by Xtext
*/
package org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.emf.scaffolding.language.services.EMFScaffoldingDSLGrammarAccess;

public class EMFScaffoldingDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private EMFScaffoldingDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal.InternalEMFScaffoldingDSLParser createParser() {
		org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal.InternalEMFScaffoldingDSLParser result = new org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal.InternalEMFScaffoldingDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getScaffoldingElementAccess().getAlternatives(), "rule__ScaffoldingElement__Alternatives");
					put(grammarAccess.getWhenBlockAccess().getAlternatives_2(), "rule__WhenBlock__Alternatives_2");
					put(grammarAccess.getBindingAccess().getAlternatives(), "rule__Binding__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getPrimitiveLiteralAccess().getAlternatives(), "rule__PrimitiveLiteral__Alternatives");
					put(grammarAccess.getThenBlockAccess().getAlternatives_1(), "rule__ThenBlock__Alternatives_1");
					put(grammarAccess.getThenBlockAccess().getAlternatives_2(), "rule__ThenBlock__Alternatives_2");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getSetterAccess().getAlternatives_1(), "rule__Setter__Alternatives_1");
					put(grammarAccess.getSymbolAccess().getAlternatives(), "rule__Symbol__Alternatives");
					put(grammarAccess.getScaffoldingAccess().getGroup(), "rule__Scaffolding__Group__0");
					put(grammarAccess.getScaffoldAccess().getGroup(), "rule__Scaffold__Group__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getWhenBlockAccess().getGroup(), "rule__WhenBlock__Group__0");
					put(grammarAccess.getWhenBlockAccess().getGroup_2_0(), "rule__WhenBlock__Group_2_0__0");
					put(grammarAccess.getMatchAccess().getGroup(), "rule__Match__Group__0");
					put(grammarAccess.getMatchAccess().getGroup_0(), "rule__Match__Group_0__0");
					put(grammarAccess.getMatchAccess().getGroup_2(), "rule__Match__Group_2__0");
					put(grammarAccess.getMatchAccess().getGroup_2_1(), "rule__Match__Group_2_1__0");
					put(grammarAccess.getMatchAccess().getGroup_2_1_1(), "rule__Match__Group_2_1_1__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getParamAccess().getGroup_1(), "rule__Param__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpressionHighAccess().getGroup(), "rule__ExpressionHigh__Group__0");
					put(grammarAccess.getExpressionHighAccess().getGroup_1(), "rule__ExpressionHigh__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4(), "rule__TerminalExpression__Group_4__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4_3(), "rule__TerminalExpression__Group_4_3__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4_3_1(), "rule__TerminalExpression__Group_4_3_1__0");
					put(grammarAccess.getSymbolRefAccess().getGroup(), "rule__SymbolRef__Group__0");
					put(grammarAccess.getSymbolRefAccess().getGroup_2(), "rule__SymbolRef__Group_2__0");
					put(grammarAccess.getPrimitiveLiteralAccess().getGroup_3(), "rule__PrimitiveLiteral__Group_3__0");
					put(grammarAccess.getPrimitiveLiteralAccess().getGroup_4(), "rule__PrimitiveLiteral__Group_4__0");
					put(grammarAccess.getPrimitiveLiteralAccess().getGroup_5(), "rule__PrimitiveLiteral__Group_5__0");
					put(grammarAccess.getSelectorSegmentAccess().getGroup(), "rule__SelectorSegment__Group__0");
					put(grammarAccess.getThenBlockAccess().getGroup(), "rule__ThenBlock__Group__0");
					put(grammarAccess.getThenBlockAccess().getGroup_2_0(), "rule__ThenBlock__Group_2_0__0");
					put(grammarAccess.getThenBlockAccess().getGroup_2_0_1(), "rule__ThenBlock__Group_2_0_1__0");
					put(grammarAccess.getCreateStatementAccess().getGroup(), "rule__CreateStatement__Group__0");
					put(grammarAccess.getCreateStatementAccess().getGroup_0(), "rule__CreateStatement__Group_0__0");
					put(grammarAccess.getCreateClassAccess().getGroup(), "rule__CreateClass__Group__0");
					put(grammarAccess.getCreateClassAccess().getGroup_2(), "rule__CreateClass__Group_2__0");
					put(grammarAccess.getCreateClassAccess().getGroup_2_1(), "rule__CreateClass__Group_2_1__0");
					put(grammarAccess.getCreateClassAccess().getGroup_2_1_1(), "rule__CreateClass__Group_2_1_1__0");
					put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
					put(grammarAccess.getListLiteralAccess().getGroup(), "rule__ListLiteral__Group__0");
					put(grammarAccess.getListLiteralAccess().getGroup_2(), "rule__ListLiteral__Group_2__0");
					put(grammarAccess.getListLiteralAccess().getGroup_2_1(), "rule__ListLiteral__Group_2_1__0");
					put(grammarAccess.getSetterAccess().getGroup(), "rule__Setter__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup(), "rule__UpdateStatement__Group__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup_2(), "rule__UpdateStatement__Group_2__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup_2_1(), "rule__UpdateStatement__Group_2_1__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup_2_1_1(), "rule__UpdateStatement__Group_2_1_1__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getOperationFQNAccess().getGroup(), "rule__OperationFQN__Group__0");
					put(grammarAccess.getOperationFQNAccess().getGroup_2(), "rule__OperationFQN__Group_2__0");
					put(grammarAccess.getOperationFQNAccess().getGroup_2_1(), "rule__OperationFQN__Group_2_1__0");
					put(grammarAccess.getScaffoldingAccess().getScaffoldAssignment_0(), "rule__Scaffolding__ScaffoldAssignment_0");
					put(grammarAccess.getScaffoldingAccess().getElementsAssignment_1(), "rule__Scaffolding__ElementsAssignment_1");
					put(grammarAccess.getScaffoldAccess().getRefPackageAssignment_1(), "rule__Scaffold__RefPackageAssignment_1");
					put(grammarAccess.getRuleAccess().getNameAssignment_1(), "rule__Rule__NameAssignment_1");
					put(grammarAccess.getRuleAccess().getWhenAssignment_2(), "rule__Rule__WhenAssignment_2");
					put(grammarAccess.getRuleAccess().getThenAssignment_3(), "rule__Rule__ThenAssignment_3");
					put(grammarAccess.getWhenBlockAccess().getMatchesAssignment_2_0_1(), "rule__WhenBlock__MatchesAssignment_2_0_1");
					put(grammarAccess.getWhenBlockAccess().getMatchesAssignment_2_1(), "rule__WhenBlock__MatchesAssignment_2_1");
					put(grammarAccess.getMatchAccess().getVarAssignment_0_0(), "rule__Match__VarAssignment_0_0");
					put(grammarAccess.getMatchAccess().getTypeAssignment_1(), "rule__Match__TypeAssignment_1");
					put(grammarAccess.getMatchAccess().getParamsAssignment_2_1_0(), "rule__Match__ParamsAssignment_2_1_0");
					put(grammarAccess.getMatchAccess().getParamsAssignment_2_1_1_1(), "rule__Match__ParamsAssignment_2_1_1_1");
					put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
					put(grammarAccess.getParamAccess().getPropertyAssignment_0(), "rule__Param__PropertyAssignment_0");
					put(grammarAccess.getParamAccess().getVarAssignment_1_1(), "rule__Param__VarAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getOpAssignment_1_1(), "rule__Expression__OpAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
					put(grammarAccess.getExpressionHighAccess().getOpAssignment_1_1(), "rule__ExpressionHigh__OpAssignment_1_1");
					put(grammarAccess.getExpressionHighAccess().getRightAssignment_1_2(), "rule__ExpressionHigh__RightAssignment_1_2");
					put(grammarAccess.getTerminalExpressionAccess().getExpAssignment_2_2(), "rule__TerminalExpression__ExpAssignment_2_2");
					put(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_4_1(), "rule__TerminalExpression__FunctionAssignment_4_1");
					put(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_0(), "rule__TerminalExpression__ArgumentsAssignment_4_3_0");
					put(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_1_1(), "rule__TerminalExpression__ArgumentsAssignment_4_3_1_1");
					put(grammarAccess.getSymbolRefAccess().getRefAssignment_1(), "rule__SymbolRef__RefAssignment_1");
					put(grammarAccess.getSymbolRefAccess().getSegmentAssignment_2_1(), "rule__SymbolRef__SegmentAssignment_2_1");
					put(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_3_1(), "rule__PrimitiveLiteral__ValueAssignment_3_1");
					put(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_4_1(), "rule__PrimitiveLiteral__ValueAssignment_4_1");
					put(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_5_1(), "rule__PrimitiveLiteral__ValueAssignment_5_1");
					put(grammarAccess.getSelectorSegmentAccess().getAttributeRefAssignment_1(), "rule__SelectorSegment__AttributeRefAssignment_1");
					put(grammarAccess.getSelectorSegmentAccess().getNextAssignment_2(), "rule__SelectorSegment__NextAssignment_2");
					put(grammarAccess.getFeatureRefAccess().getFeatureAssignment(), "rule__FeatureRef__FeatureAssignment");
					put(grammarAccess.getThenBlockAccess().getStatementsAssignment_2_0_1_0(), "rule__ThenBlock__StatementsAssignment_2_0_1_0");
					put(grammarAccess.getThenBlockAccess().getStatementsAssignment_2_1(), "rule__ThenBlock__StatementsAssignment_2_1");
					put(grammarAccess.getCreateStatementAccess().getVarAssignment_0_0(), "rule__CreateStatement__VarAssignment_0_0");
					put(grammarAccess.getCreateStatementAccess().getExpressionAssignment_1(), "rule__CreateStatement__ExpressionAssignment_1");
					put(grammarAccess.getCreateClassAccess().getTypeAssignment_1(), "rule__CreateClass__TypeAssignment_1");
					put(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_0(), "rule__CreateClass__SettersAssignment_2_1_0");
					put(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_1_1(), "rule__CreateClass__SettersAssignment_2_1_1_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getListLiteralAccess().getItemsAssignment_2_0(), "rule__ListLiteral__ItemsAssignment_2_0");
					put(grammarAccess.getListLiteralAccess().getItemsAssignment_2_1_1(), "rule__ListLiteral__ItemsAssignment_2_1_1");
					put(grammarAccess.getSetterAccess().getPropertyAssignment_0(), "rule__Setter__PropertyAssignment_0");
					put(grammarAccess.getSetterAccess().getExpressionAssignment_2(), "rule__Setter__ExpressionAssignment_2");
					put(grammarAccess.getSetterAccess().getGuardAssignment_3(), "rule__Setter__GuardAssignment_3");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getJavaClassAssignment_2(), "rule__Function__JavaClassAssignment_2");
					put(grammarAccess.getFunctionAccess().getOperationAssignment_4(), "rule__Function__OperationAssignment_4");
					put(grammarAccess.getUpdateStatementAccess().getVarRefAssignment_1(), "rule__UpdateStatement__VarRefAssignment_1");
					put(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_0(), "rule__UpdateStatement__SettersAssignment_2_1_0");
					put(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_1_1(), "rule__UpdateStatement__SettersAssignment_2_1_1_1");
					put(grammarAccess.getSymbolStructureAccess().getNameAssignment(), "rule__SymbolStructure__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal.InternalEMFScaffoldingDSLParser typedParser = (org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal.InternalEMFScaffoldingDSLParser) parser;
			typedParser.entryRuleScaffolding();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public EMFScaffoldingDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EMFScaffoldingDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
