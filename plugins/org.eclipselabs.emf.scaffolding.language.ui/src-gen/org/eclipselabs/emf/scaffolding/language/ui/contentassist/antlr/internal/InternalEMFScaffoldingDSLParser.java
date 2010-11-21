package org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipselabs.emf.scaffolding.language.services.EMFScaffoldingDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEMFScaffoldingDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_OPERATOR_LOW_PRIORITY", "RULE_OPERATOR_HIGH_PRIORITY", "RULE_INT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'null'", "'then'", "'->'", "':'", "'+='", "'scaffold'", "'rule'", "'when'", "'{'", "'}'", "'('", "')'", "','", "'!'", "'new'", "'['", "']'", "'$'", "'function'", "'#'", "'update'", "'.'", "'guard'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_OPERATOR_LOW_PRIORITY=6;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=8;
    public static final int RULE_OPERATOR_HIGH_PRIORITY=7;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;

        public InternalEMFScaffoldingDSLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g"; }


     
     	private EMFScaffoldingDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EMFScaffoldingDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleScaffolding
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:61:1: entryRuleScaffolding : ruleScaffolding EOF ;
    public final void entryRuleScaffolding() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:62:1: ( ruleScaffolding EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:63:1: ruleScaffolding EOF
            {
             before(grammarAccess.getScaffoldingRule()); 
            pushFollow(FOLLOW_ruleScaffolding_in_entryRuleScaffolding61);
            ruleScaffolding();
            _fsp--;

             after(grammarAccess.getScaffoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaffolding68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleScaffolding


    // $ANTLR start ruleScaffolding
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:70:1: ruleScaffolding : ( ( rule__Scaffolding__Group__0 ) ) ;
    public final void ruleScaffolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:74:2: ( ( ( rule__Scaffolding__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:75:1: ( ( rule__Scaffolding__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:75:1: ( ( rule__Scaffolding__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:76:1: ( rule__Scaffolding__Group__0 )
            {
             before(grammarAccess.getScaffoldingAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:77:1: ( rule__Scaffolding__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:77:2: rule__Scaffolding__Group__0
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__0_in_ruleScaffolding94);
            rule__Scaffolding__Group__0();
            _fsp--;


            }

             after(grammarAccess.getScaffoldingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScaffolding


    // $ANTLR start entryRuleScaffoldingElement
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:89:1: entryRuleScaffoldingElement : ruleScaffoldingElement EOF ;
    public final void entryRuleScaffoldingElement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:90:1: ( ruleScaffoldingElement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:91:1: ruleScaffoldingElement EOF
            {
             before(grammarAccess.getScaffoldingElementRule()); 
            pushFollow(FOLLOW_ruleScaffoldingElement_in_entryRuleScaffoldingElement121);
            ruleScaffoldingElement();
            _fsp--;

             after(grammarAccess.getScaffoldingElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaffoldingElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleScaffoldingElement


    // $ANTLR start ruleScaffoldingElement
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:98:1: ruleScaffoldingElement : ( ( rule__ScaffoldingElement__Alternatives ) ) ;
    public final void ruleScaffoldingElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:102:2: ( ( ( rule__ScaffoldingElement__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:103:1: ( ( rule__ScaffoldingElement__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:103:1: ( ( rule__ScaffoldingElement__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:104:1: ( rule__ScaffoldingElement__Alternatives )
            {
             before(grammarAccess.getScaffoldingElementAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:105:1: ( rule__ScaffoldingElement__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:105:2: rule__ScaffoldingElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ScaffoldingElement__Alternatives_in_ruleScaffoldingElement154);
            rule__ScaffoldingElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getScaffoldingElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScaffoldingElement


    // $ANTLR start entryRuleScaffold
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:117:1: entryRuleScaffold : ruleScaffold EOF ;
    public final void entryRuleScaffold() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:118:1: ( ruleScaffold EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:119:1: ruleScaffold EOF
            {
             before(grammarAccess.getScaffoldRule()); 
            pushFollow(FOLLOW_ruleScaffold_in_entryRuleScaffold181);
            ruleScaffold();
            _fsp--;

             after(grammarAccess.getScaffoldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaffold188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleScaffold


    // $ANTLR start ruleScaffold
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:126:1: ruleScaffold : ( ( rule__Scaffold__Group__0 ) ) ;
    public final void ruleScaffold() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:130:2: ( ( ( rule__Scaffold__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:131:1: ( ( rule__Scaffold__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:131:1: ( ( rule__Scaffold__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:132:1: ( rule__Scaffold__Group__0 )
            {
             before(grammarAccess.getScaffoldAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:133:1: ( rule__Scaffold__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:133:2: rule__Scaffold__Group__0
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__0_in_ruleScaffold214);
            rule__Scaffold__Group__0();
            _fsp--;


            }

             after(grammarAccess.getScaffoldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScaffold


    // $ANTLR start entryRuleRule
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:145:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:146:1: ( ruleRule EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:147:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule241);
            ruleRule();
            _fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRule


    // $ANTLR start ruleRule
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:154:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:158:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:159:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:159:1: ( ( rule__Rule__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:160:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:161:1: ( rule__Rule__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:161:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule274);
            rule__Rule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRule


    // $ANTLR start entryRuleWhenBlock
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:173:1: entryRuleWhenBlock : ruleWhenBlock EOF ;
    public final void entryRuleWhenBlock() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:174:1: ( ruleWhenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:175:1: ruleWhenBlock EOF
            {
             before(grammarAccess.getWhenBlockRule()); 
            pushFollow(FOLLOW_ruleWhenBlock_in_entryRuleWhenBlock301);
            ruleWhenBlock();
            _fsp--;

             after(grammarAccess.getWhenBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenBlock308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleWhenBlock


    // $ANTLR start ruleWhenBlock
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:182:1: ruleWhenBlock : ( ( rule__WhenBlock__Group__0 ) ) ;
    public final void ruleWhenBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:186:2: ( ( ( rule__WhenBlock__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:187:1: ( ( rule__WhenBlock__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:187:1: ( ( rule__WhenBlock__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:188:1: ( rule__WhenBlock__Group__0 )
            {
             before(grammarAccess.getWhenBlockAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:189:1: ( rule__WhenBlock__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:189:2: rule__WhenBlock__Group__0
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__0_in_ruleWhenBlock334);
            rule__WhenBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getWhenBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleWhenBlock


    // $ANTLR start entryRuleMatch
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:203:1: entryRuleMatch : ruleMatch EOF ;
    public final void entryRuleMatch() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:204:1: ( ruleMatch EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:205:1: ruleMatch EOF
            {
             before(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_ruleMatch_in_entryRuleMatch363);
            ruleMatch();
            _fsp--;

             after(grammarAccess.getMatchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatch370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMatch


    // $ANTLR start ruleMatch
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:212:1: ruleMatch : ( ( rule__Match__Group__0 ) ) ;
    public final void ruleMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:216:2: ( ( ( rule__Match__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:217:1: ( ( rule__Match__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:217:1: ( ( rule__Match__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:218:1: ( rule__Match__Group__0 )
            {
             before(grammarAccess.getMatchAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:219:1: ( rule__Match__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:219:2: rule__Match__Group__0
            {
            pushFollow(FOLLOW_rule__Match__Group__0_in_ruleMatch396);
            rule__Match__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMatchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMatch


    // $ANTLR start entryRuleVariable
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:231:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:232:1: ( ruleVariable EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:233:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable423);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:240:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:244:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:245:1: ( ( rule__Variable__NameAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:245:1: ( ( rule__Variable__NameAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:246:1: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:247:1: ( rule__Variable__NameAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:247:2: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_in_ruleVariable456);
            rule__Variable__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleParam
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:259:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:260:1: ( ruleParam EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:261:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam483);
            ruleParam();
            _fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleParam


    // $ANTLR start ruleParam
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:268:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:272:2: ( ( ( rule__Param__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:273:1: ( ( rule__Param__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:273:1: ( ( rule__Param__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:274:1: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:275:1: ( rule__Param__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:275:2: rule__Param__Group__0
            {
            pushFollow(FOLLOW_rule__Param__Group__0_in_ruleParam516);
            rule__Param__Group__0();
            _fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParam


    // $ANTLR start entryRuleBindingExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:287:1: entryRuleBindingExpression : ruleBindingExpression EOF ;
    public final void entryRuleBindingExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:288:1: ( ruleBindingExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:289:1: ruleBindingExpression EOF
            {
             before(grammarAccess.getBindingExpressionRule()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_entryRuleBindingExpression543);
            ruleBindingExpression();
            _fsp--;

             after(grammarAccess.getBindingExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingExpression550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBindingExpression


    // $ANTLR start ruleBindingExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:296:1: ruleBindingExpression : ( ( rule__BindingExpression__Group__0 ) ) ;
    public final void ruleBindingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:300:2: ( ( ( rule__BindingExpression__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:301:1: ( ( rule__BindingExpression__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:301:1: ( ( rule__BindingExpression__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:302:1: ( rule__BindingExpression__Group__0 )
            {
             before(grammarAccess.getBindingExpressionAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:303:1: ( rule__BindingExpression__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:303:2: rule__BindingExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__0_in_ruleBindingExpression576);
            rule__BindingExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBindingExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBindingExpression


    // $ANTLR start entryRuleBindingExpressionHigh
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:315:1: entryRuleBindingExpressionHigh : ruleBindingExpressionHigh EOF ;
    public final void entryRuleBindingExpressionHigh() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:316:1: ( ruleBindingExpressionHigh EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:317:1: ruleBindingExpressionHigh EOF
            {
             before(grammarAccess.getBindingExpressionHighRule()); 
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_entryRuleBindingExpressionHigh603);
            ruleBindingExpressionHigh();
            _fsp--;

             after(grammarAccess.getBindingExpressionHighRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingExpressionHigh610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBindingExpressionHigh


    // $ANTLR start ruleBindingExpressionHigh
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:324:1: ruleBindingExpressionHigh : ( ( rule__BindingExpressionHigh__Group__0 ) ) ;
    public final void ruleBindingExpressionHigh() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:328:2: ( ( ( rule__BindingExpressionHigh__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:329:1: ( ( rule__BindingExpressionHigh__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:329:1: ( ( rule__BindingExpressionHigh__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:330:1: ( rule__BindingExpressionHigh__Group__0 )
            {
             before(grammarAccess.getBindingExpressionHighAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:331:1: ( rule__BindingExpressionHigh__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:331:2: rule__BindingExpressionHigh__Group__0
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__0_in_ruleBindingExpressionHigh636);
            rule__BindingExpressionHigh__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBindingExpressionHighAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBindingExpressionHigh


    // $ANTLR start entryRuleBindingTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:343:1: entryRuleBindingTerminalExpression : ruleBindingTerminalExpression EOF ;
    public final void entryRuleBindingTerminalExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:344:1: ( ruleBindingTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:345:1: ruleBindingTerminalExpression EOF
            {
             before(grammarAccess.getBindingTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_entryRuleBindingTerminalExpression663);
            ruleBindingTerminalExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingTerminalExpression670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBindingTerminalExpression


    // $ANTLR start ruleBindingTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:352:1: ruleBindingTerminalExpression : ( ( rule__BindingTerminalExpression__Alternatives ) ) ;
    public final void ruleBindingTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:356:2: ( ( ( rule__BindingTerminalExpression__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:357:1: ( ( rule__BindingTerminalExpression__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:357:1: ( ( rule__BindingTerminalExpression__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:358:1: ( rule__BindingTerminalExpression__Alternatives )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:359:1: ( rule__BindingTerminalExpression__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:359:2: rule__BindingTerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Alternatives_in_ruleBindingTerminalExpression696);
            rule__BindingTerminalExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBindingTerminalExpression


    // $ANTLR start entryRuleExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:371:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:372:1: ( ruleExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:373:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression723);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:380:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:384:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:385:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:385:1: ( ( rule__Expression__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:386:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:387:1: ( rule__Expression__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:387:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression756);
            rule__Expression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleExpressionHigh
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:399:1: entryRuleExpressionHigh : ruleExpressionHigh EOF ;
    public final void entryRuleExpressionHigh() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:400:1: ( ruleExpressionHigh EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:401:1: ruleExpressionHigh EOF
            {
             before(grammarAccess.getExpressionHighRule()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh783);
            ruleExpressionHigh();
            _fsp--;

             after(grammarAccess.getExpressionHighRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionHigh790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpressionHigh


    // $ANTLR start ruleExpressionHigh
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:408:1: ruleExpressionHigh : ( ( rule__ExpressionHigh__Group__0 ) ) ;
    public final void ruleExpressionHigh() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:412:2: ( ( ( rule__ExpressionHigh__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:413:1: ( ( rule__ExpressionHigh__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:413:1: ( ( rule__ExpressionHigh__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:414:1: ( rule__ExpressionHigh__Group__0 )
            {
             before(grammarAccess.getExpressionHighAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:415:1: ( rule__ExpressionHigh__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:415:2: rule__ExpressionHigh__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__0_in_ruleExpressionHigh816);
            rule__ExpressionHigh__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExpressionHighAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpressionHigh


    // $ANTLR start entryRuleTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:427:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:428:1: ( ruleTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:429:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression843);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:436:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:440:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:441:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:441:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:442:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:443:1: ( rule__TerminalExpression__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:443:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression876);
            rule__TerminalExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRulePrimitiveLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:455:1: entryRulePrimitiveLiteral : rulePrimitiveLiteral EOF ;
    public final void entryRulePrimitiveLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:456:1: ( rulePrimitiveLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:457:1: rulePrimitiveLiteral EOF
            {
             before(grammarAccess.getPrimitiveLiteralRule()); 
            pushFollow(FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral903);
            rulePrimitiveLiteral();
            _fsp--;

             after(grammarAccess.getPrimitiveLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveLiteral910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePrimitiveLiteral


    // $ANTLR start rulePrimitiveLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:464:1: rulePrimitiveLiteral : ( ( rule__PrimitiveLiteral__Alternatives ) ) ;
    public final void rulePrimitiveLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:468:2: ( ( ( rule__PrimitiveLiteral__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:469:1: ( ( rule__PrimitiveLiteral__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:469:1: ( ( rule__PrimitiveLiteral__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:470:1: ( rule__PrimitiveLiteral__Alternatives )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:471:1: ( rule__PrimitiveLiteral__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:471:2: rule__PrimitiveLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Alternatives_in_rulePrimitiveLiteral936);
            rule__PrimitiveLiteral__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrimitiveLiteral


    // $ANTLR start entryRuleFeatureRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:483:1: entryRuleFeatureRefLiteral : ruleFeatureRefLiteral EOF ;
    public final void entryRuleFeatureRefLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:484:1: ( ruleFeatureRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:485:1: ruleFeatureRefLiteral EOF
            {
             before(grammarAccess.getFeatureRefLiteralRule()); 
            pushFollow(FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral963);
            ruleFeatureRefLiteral();
            _fsp--;

             after(grammarAccess.getFeatureRefLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRefLiteral970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFeatureRefLiteral


    // $ANTLR start ruleFeatureRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:492:1: ruleFeatureRefLiteral : ( ( rule__FeatureRefLiteral__RefAssignment ) ) ;
    public final void ruleFeatureRefLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:496:2: ( ( ( rule__FeatureRefLiteral__RefAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:497:1: ( ( rule__FeatureRefLiteral__RefAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:497:1: ( ( rule__FeatureRefLiteral__RefAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:498:1: ( rule__FeatureRefLiteral__RefAssignment )
            {
             before(grammarAccess.getFeatureRefLiteralAccess().getRefAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:499:1: ( rule__FeatureRefLiteral__RefAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:499:2: rule__FeatureRefLiteral__RefAssignment
            {
            pushFollow(FOLLOW_rule__FeatureRefLiteral__RefAssignment_in_ruleFeatureRefLiteral996);
            rule__FeatureRefLiteral__RefAssignment();
            _fsp--;


            }

             after(grammarAccess.getFeatureRefLiteralAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFeatureRefLiteral


    // $ANTLR start entryRuleThenBlock
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:511:1: entryRuleThenBlock : ruleThenBlock EOF ;
    public final void entryRuleThenBlock() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:512:1: ( ruleThenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:513:1: ruleThenBlock EOF
            {
             before(grammarAccess.getThenBlockRule()); 
            pushFollow(FOLLOW_ruleThenBlock_in_entryRuleThenBlock1023);
            ruleThenBlock();
            _fsp--;

             after(grammarAccess.getThenBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenBlock1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleThenBlock


    // $ANTLR start ruleThenBlock
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:520:1: ruleThenBlock : ( ( rule__ThenBlock__Group__0 ) ) ;
    public final void ruleThenBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:524:2: ( ( ( rule__ThenBlock__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:525:1: ( ( rule__ThenBlock__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:525:1: ( ( rule__ThenBlock__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:526:1: ( rule__ThenBlock__Group__0 )
            {
             before(grammarAccess.getThenBlockAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:527:1: ( rule__ThenBlock__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:527:2: rule__ThenBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0_in_ruleThenBlock1056);
            rule__ThenBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getThenBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleThenBlock


    // $ANTLR start entryRuleStatement
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:539:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:540:1: ( ruleStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:541:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1083);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:548:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:552:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:553:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:553:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:554:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:555:1: ( rule__Statement__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:555:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement1116);
            rule__Statement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleCreateStatement
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:567:1: entryRuleCreateStatement : ruleCreateStatement EOF ;
    public final void entryRuleCreateStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:568:1: ( ruleCreateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:569:1: ruleCreateStatement EOF
            {
             before(grammarAccess.getCreateStatementRule()); 
            pushFollow(FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement1143);
            ruleCreateStatement();
            _fsp--;

             after(grammarAccess.getCreateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateStatement1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCreateStatement


    // $ANTLR start ruleCreateStatement
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:576:1: ruleCreateStatement : ( ( rule__CreateStatement__Group__0 ) ) ;
    public final void ruleCreateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:580:2: ( ( ( rule__CreateStatement__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:581:1: ( ( rule__CreateStatement__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:581:1: ( ( rule__CreateStatement__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:582:1: ( rule__CreateStatement__Group__0 )
            {
             before(grammarAccess.getCreateStatementAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:583:1: ( rule__CreateStatement__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:583:2: rule__CreateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0_in_ruleCreateStatement1176);
            rule__CreateStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCreateStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCreateStatement


    // $ANTLR start entryRuleCreateClass
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:595:1: entryRuleCreateClass : ruleCreateClass EOF ;
    public final void entryRuleCreateClass() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:596:1: ( ruleCreateClass EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:597:1: ruleCreateClass EOF
            {
             before(grammarAccess.getCreateClassRule()); 
            pushFollow(FOLLOW_ruleCreateClass_in_entryRuleCreateClass1203);
            ruleCreateClass();
            _fsp--;

             after(grammarAccess.getCreateClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateClass1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCreateClass


    // $ANTLR start ruleCreateClass
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:604:1: ruleCreateClass : ( ( rule__CreateClass__Group__0 ) ) ;
    public final void ruleCreateClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:608:2: ( ( ( rule__CreateClass__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:609:1: ( ( rule__CreateClass__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:609:1: ( ( rule__CreateClass__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:610:1: ( rule__CreateClass__Group__0 )
            {
             before(grammarAccess.getCreateClassAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:611:1: ( rule__CreateClass__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:611:2: rule__CreateClass__Group__0
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0_in_ruleCreateClass1236);
            rule__CreateClass__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCreateClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCreateClass


    // $ANTLR start entryRuleStringLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:623:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:624:1: ( ruleStringLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:625:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1263);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:632:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:636:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:637:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:637:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:638:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:639:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:639:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1296);
            rule__StringLiteral__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleNullLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:651:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:652:1: ( ruleNullLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:653:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1323);
            ruleNullLiteral();
            _fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNullLiteral


    // $ANTLR start ruleNullLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:660:1: ruleNullLiteral : ( 'null' ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:664:2: ( ( 'null' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:665:1: ( 'null' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:665:1: ( 'null' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:666:1: 'null'
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword()); 
            match(input,15,FOLLOW_15_in_ruleNullLiteral1357); 
             after(grammarAccess.getNullLiteralAccess().getNullKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNullLiteral


    // $ANTLR start entryRuleListLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:681:1: entryRuleListLiteral : ruleListLiteral EOF ;
    public final void entryRuleListLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:682:1: ( ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:683:1: ruleListLiteral EOF
            {
             before(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral1385);
            ruleListLiteral();
            _fsp--;

             after(grammarAccess.getListLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral1392); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleListLiteral


    // $ANTLR start ruleListLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:690:1: ruleListLiteral : ( ( rule__ListLiteral__Group__0 ) ) ;
    public final void ruleListLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:694:2: ( ( ( rule__ListLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:695:1: ( ( rule__ListLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:695:1: ( ( rule__ListLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:696:1: ( rule__ListLiteral__Group__0 )
            {
             before(grammarAccess.getListLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:697:1: ( rule__ListLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:697:2: rule__ListLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1418);
            rule__ListLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleListLiteral


    // $ANTLR start entryRuleVarRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:709:1: entryRuleVarRefLiteral : ruleVarRefLiteral EOF ;
    public final void entryRuleVarRefLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:710:1: ( ruleVarRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:711:1: ruleVarRefLiteral EOF
            {
             before(grammarAccess.getVarRefLiteralRule()); 
            pushFollow(FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral1445);
            ruleVarRefLiteral();
            _fsp--;

             after(grammarAccess.getVarRefLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRefLiteral1452); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVarRefLiteral


    // $ANTLR start ruleVarRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:718:1: ruleVarRefLiteral : ( ( rule__VarRefLiteral__Group__0 ) ) ;
    public final void ruleVarRefLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:722:2: ( ( ( rule__VarRefLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:1: ( ( rule__VarRefLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:1: ( ( rule__VarRefLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:724:1: ( rule__VarRefLiteral__Group__0 )
            {
             before(grammarAccess.getVarRefLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:725:1: ( rule__VarRefLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:725:2: rule__VarRefLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__VarRefLiteral__Group__0_in_ruleVarRefLiteral1478);
            rule__VarRefLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVarRefLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVarRefLiteral


    // $ANTLR start entryRuleSetter
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:737:1: entryRuleSetter : ruleSetter EOF ;
    public final void entryRuleSetter() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:738:1: ( ruleSetter EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:739:1: ruleSetter EOF
            {
             before(grammarAccess.getSetterRule()); 
            pushFollow(FOLLOW_ruleSetter_in_entryRuleSetter1505);
            ruleSetter();
            _fsp--;

             after(grammarAccess.getSetterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetter1512); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSetter


    // $ANTLR start ruleSetter
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:746:1: ruleSetter : ( ( rule__Setter__Group__0 ) ) ;
    public final void ruleSetter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:750:2: ( ( ( rule__Setter__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:751:1: ( ( rule__Setter__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:751:1: ( ( rule__Setter__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:752:1: ( rule__Setter__Group__0 )
            {
             before(grammarAccess.getSetterAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:753:1: ( rule__Setter__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:753:2: rule__Setter__Group__0
            {
            pushFollow(FOLLOW_rule__Setter__Group__0_in_ruleSetter1538);
            rule__Setter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSetterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSetter


    // $ANTLR start entryRuleFunction
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:765:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:766:1: ( ruleFunction EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:767:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1565);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1572); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:774:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:778:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:779:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:779:1: ( ( rule__Function__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:780:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:781:1: ( rule__Function__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:781:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction1598);
            rule__Function__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleUpdateStatement
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:793:1: entryRuleUpdateStatement : ruleUpdateStatement EOF ;
    public final void entryRuleUpdateStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:794:1: ( ruleUpdateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:795:1: ruleUpdateStatement EOF
            {
             before(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1625);
            ruleUpdateStatement();
            _fsp--;

             after(grammarAccess.getUpdateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1632); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUpdateStatement


    // $ANTLR start ruleUpdateStatement
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:802:1: ruleUpdateStatement : ( ( rule__UpdateStatement__Group__0 ) ) ;
    public final void ruleUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:806:2: ( ( ( rule__UpdateStatement__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:807:1: ( ( rule__UpdateStatement__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:807:1: ( ( rule__UpdateStatement__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:808:1: ( rule__UpdateStatement__Group__0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:809:1: ( rule__UpdateStatement__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:809:2: rule__UpdateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0_in_ruleUpdateStatement1658);
            rule__UpdateStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUpdateStatement


    // $ANTLR start entryRuleFQN
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:821:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:822:1: ( ruleFQN EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:823:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1685);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1692); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFQN


    // $ANTLR start ruleFQN
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:830:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:834:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:835:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:835:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:836:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:837:1: ( rule__FQN__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:837:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1718);
            rule__FQN__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFQN


    // $ANTLR start rule__ScaffoldingElement__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:851:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );
    public final void rule__ScaffoldingElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:855:1: ( ( ruleRule ) | ( ruleFunction ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("851:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:856:1: ( ruleRule )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:856:1: ( ruleRule )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:857:1: ruleRule
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1756);
                    ruleRule();
                    _fsp--;

                     after(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:862:6: ( ruleFunction )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:862:6: ( ruleFunction )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:863:1: ruleFunction
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1773);
                    ruleFunction();
                    _fsp--;

                     after(grammarAccess.getScaffoldingElementAccess().getFunctionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ScaffoldingElement__Alternatives


    // $ANTLR start rule__WhenBlock__Alternatives_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:873:1: rule__WhenBlock__Alternatives_1 : ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) );
    public final void rule__WhenBlock__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:877:1: ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("873:1: rule__WhenBlock__Alternatives_1 : ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:878:1: ( ( rule__WhenBlock__Group_1_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:878:1: ( ( rule__WhenBlock__Group_1_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:879:1: ( rule__WhenBlock__Group_1_0__0 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getGroup_1_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:880:1: ( rule__WhenBlock__Group_1_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:880:2: rule__WhenBlock__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__0_in_rule__WhenBlock__Alternatives_11805);
                    rule__WhenBlock__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getWhenBlockAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:884:6: ( ( rule__WhenBlock__MatchesAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:884:6: ( ( rule__WhenBlock__MatchesAssignment_1_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:885:1: ( rule__WhenBlock__MatchesAssignment_1_1 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_1_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:886:1: ( rule__WhenBlock__MatchesAssignment_1_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:886:2: rule__WhenBlock__MatchesAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_1_1_in_rule__WhenBlock__Alternatives_11823);
                    rule__WhenBlock__MatchesAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getWhenBlockAccess().getMatchesAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Alternatives_1


    // $ANTLR start rule__BindingTerminalExpression__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:896:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ruleFeatureRefLiteral ) | ( ( rule__BindingTerminalExpression__Group_2__0 ) ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );
    public final void rule__BindingTerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:900:1: ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ruleFeatureRefLiteral ) | ( ( rule__BindingTerminalExpression__Group_2__0 ) ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==25) ) {
                    alt3=4;
                }
                else if ( (LA3_2==EOF||(LA3_2>=RULE_OPERATOR_LOW_PRIORITY && LA3_2<=RULE_OPERATOR_HIGH_PRIORITY)||LA3_2==18||(LA3_2>=26 && LA3_2<=27)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("896:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ruleFeatureRefLiteral ) | ( ( rule__BindingTerminalExpression__Group_2__0 ) ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 15:
            case 30:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("896:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ruleFeatureRefLiteral ) | ( ( rule__BindingTerminalExpression__Group_2__0 ) ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:901:1: ( ( rule__BindingTerminalExpression__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:901:1: ( ( rule__BindingTerminalExpression__Group_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:902:1: ( rule__BindingTerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:903:1: ( rule__BindingTerminalExpression__Group_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:903:2: rule__BindingTerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__0_in_rule__BindingTerminalExpression__Alternatives1857);
                    rule__BindingTerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:907:6: ( ruleFeatureRefLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:907:6: ( ruleFeatureRefLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:908:1: ruleFeatureRefLiteral
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getFeatureRefLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFeatureRefLiteral_in_rule__BindingTerminalExpression__Alternatives1875);
                    ruleFeatureRefLiteral();
                    _fsp--;

                     after(grammarAccess.getBindingTerminalExpressionAccess().getFeatureRefLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:913:6: ( ( rule__BindingTerminalExpression__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:913:6: ( ( rule__BindingTerminalExpression__Group_2__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:914:1: ( rule__BindingTerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_2()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:915:1: ( rule__BindingTerminalExpression__Group_2__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:915:2: rule__BindingTerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_2__0_in_rule__BindingTerminalExpression__Alternatives1892);
                    rule__BindingTerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:919:6: ( ( rule__BindingTerminalExpression__Group_3__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:919:6: ( ( rule__BindingTerminalExpression__Group_3__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:920:1: ( rule__BindingTerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:921:1: ( rule__BindingTerminalExpression__Group_3__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:921:2: rule__BindingTerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__0_in_rule__BindingTerminalExpression__Alternatives1910);
                    rule__BindingTerminalExpression__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:925:6: ( rulePrimitiveLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:925:6: ( rulePrimitiveLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:926:1: rulePrimitiveLiteral
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_rule__BindingTerminalExpression__Alternatives1928);
                    rulePrimitiveLiteral();
                    _fsp--;

                     after(grammarAccess.getBindingTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Alternatives


    // $ANTLR start rule__TerminalExpression__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:936:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleVarRefLiteral ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:940:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleVarRefLiteral ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
                {
                alt4=5;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 15:
            case 30:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("936:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleVarRefLiteral ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:941:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:941:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:942:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:943:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:943:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1960);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:947:6: ( ruleVarRefLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:947:6: ( ruleVarRefLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:948:1: ruleVarRefLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getVarRefLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVarRefLiteral_in_rule__TerminalExpression__Alternatives1978);
                    ruleVarRefLiteral();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getVarRefLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:953:6: ( ruleCreateClass )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:953:6: ( ruleCreateClass )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:954:1: ruleCreateClass
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives1995);
                    ruleCreateClass();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:959:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:959:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:960:1: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:961:1: ( rule__TerminalExpression__Group_3__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:961:2: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives2012);
                    rule__TerminalExpression__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:965:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:965:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:966:1: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:967:1: ( rule__TerminalExpression__Group_4__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:967:2: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives2030);
                    rule__TerminalExpression__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:971:6: ( rulePrimitiveLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:971:6: ( rulePrimitiveLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:972:1: rulePrimitiveLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_rule__TerminalExpression__Alternatives2048);
                    rulePrimitiveLiteral();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Alternatives


    // $ANTLR start rule__PrimitiveLiteral__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:982:1: rule__PrimitiveLiteral__Alternatives : ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) );
    public final void rule__PrimitiveLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:986:1: ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case RULE_INT:
                {
                alt5=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt5=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("982:1: rule__PrimitiveLiteral__Alternatives : ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:987:1: ( ruleListLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:987:1: ( ruleListLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:988:1: ruleListLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__PrimitiveLiteral__Alternatives2080);
                    ruleListLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:993:6: ( ruleStringLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:993:6: ( ruleStringLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:994:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__PrimitiveLiteral__Alternatives2097);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:999:6: ( ruleNullLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:999:6: ( ruleNullLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1000:1: ruleNullLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__PrimitiveLiteral__Alternatives2114);
                    ruleNullLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1005:6: ( ( rule__PrimitiveLiteral__Group_3__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1005:6: ( ( rule__PrimitiveLiteral__Group_3__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1006:1: ( rule__PrimitiveLiteral__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_3()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1007:1: ( rule__PrimitiveLiteral__Group_3__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1007:2: rule__PrimitiveLiteral__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__0_in_rule__PrimitiveLiteral__Alternatives2131);
                    rule__PrimitiveLiteral__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1011:6: ( ( rule__PrimitiveLiteral__Group_4__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1011:6: ( ( rule__PrimitiveLiteral__Group_4__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1012:1: ( rule__PrimitiveLiteral__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_4()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1013:1: ( rule__PrimitiveLiteral__Group_4__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1013:2: rule__PrimitiveLiteral__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__0_in_rule__PrimitiveLiteral__Alternatives2149);
                    rule__PrimitiveLiteral__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1017:6: ( ( rule__PrimitiveLiteral__Group_5__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1017:6: ( ( rule__PrimitiveLiteral__Group_5__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1018:1: ( rule__PrimitiveLiteral__Group_5__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_5()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1019:1: ( rule__PrimitiveLiteral__Group_5__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1019:2: rule__PrimitiveLiteral__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__0_in_rule__PrimitiveLiteral__Alternatives2167);
                    rule__PrimitiveLiteral__Group_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Alternatives


    // $ANTLR start rule__ThenBlock__Alternatives_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1028:1: rule__ThenBlock__Alternatives_0 : ( ( 'then' ) | ( '->' ) );
    public final void rule__ThenBlock__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1032:1: ( ( 'then' ) | ( '->' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1028:1: rule__ThenBlock__Alternatives_0 : ( ( 'then' ) | ( '->' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1033:1: ( 'then' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1033:1: ( 'then' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1034:1: 'then'
                    {
                     before(grammarAccess.getThenBlockAccess().getThenKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__ThenBlock__Alternatives_02201); 
                     after(grammarAccess.getThenBlockAccess().getThenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1041:6: ( '->' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1041:6: ( '->' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1042:1: '->'
                    {
                     before(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__ThenBlock__Alternatives_02221); 
                     after(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Alternatives_0


    // $ANTLR start rule__ThenBlock__Alternatives_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1054:1: rule__ThenBlock__Alternatives_1 : ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) );
    public final void rule__ThenBlock__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1058:1: ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=RULE_INT && LA7_0<=RULE_FLOAT)||LA7_0==15||LA7_0==25||(LA7_0>=28 && LA7_0<=30)||LA7_0==32||LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1054:1: rule__ThenBlock__Alternatives_1 : ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1059:1: ( ( rule__ThenBlock__Group_1_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1059:1: ( ( rule__ThenBlock__Group_1_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1060:1: ( rule__ThenBlock__Group_1_0__0 )
                    {
                     before(grammarAccess.getThenBlockAccess().getGroup_1_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1061:1: ( rule__ThenBlock__Group_1_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1061:2: rule__ThenBlock__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__0_in_rule__ThenBlock__Alternatives_12255);
                    rule__ThenBlock__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getThenBlockAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1065:6: ( ( rule__ThenBlock__StatementsAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1065:6: ( ( rule__ThenBlock__StatementsAssignment_1_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1066:1: ( rule__ThenBlock__StatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1067:1: ( rule__ThenBlock__StatementsAssignment_1_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1067:2: rule__ThenBlock__StatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_1_1_in_rule__ThenBlock__Alternatives_12273);
                    rule__ThenBlock__StatementsAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Alternatives_1


    // $ANTLR start rule__Statement__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1076:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1080:1: ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||(LA8_0>=RULE_INT && LA8_0<=RULE_FLOAT)||LA8_0==15||LA8_0==25||(LA8_0>=28 && LA8_0<=30)||LA8_0==32) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1076:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1081:1: ( ruleCreateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1081:1: ( ruleCreateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1082:1: ruleCreateStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2306);
                    ruleCreateStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1087:6: ( ruleUpdateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1087:6: ( ruleUpdateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1088:1: ruleUpdateStatement
                    {
                     before(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2323);
                    ruleUpdateStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Alternatives


    // $ANTLR start rule__Setter__Alternatives_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1098:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );
    public final void rule__Setter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1102:1: ( ( ':' ) | ( '+=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1098:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1103:1: ( ':' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1103:1: ( ':' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1104:1: ':'
                    {
                     before(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 
                    match(input,18,FOLLOW_18_in_rule__Setter__Alternatives_12356); 
                     after(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1111:6: ( '+=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1111:6: ( '+=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1112:1: '+='
                    {
                     before(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1()); 
                    match(input,19,FOLLOW_19_in_rule__Setter__Alternatives_12376); 
                     after(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Alternatives_1


    // $ANTLR start rule__Scaffolding__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1126:1: rule__Scaffolding__Group__0 : rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 ;
    public final void rule__Scaffolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1130:1: ( rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1131:2: rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02408);
            rule__Scaffolding__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02411);
            rule__Scaffolding__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffolding__Group__0


    // $ANTLR start rule__Scaffolding__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1138:1: rule__Scaffolding__Group__0__Impl : ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) ;
    public final void rule__Scaffolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1142:1: ( ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1143:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1143:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1144:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1145:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1145:2: rule__Scaffolding__ScaffoldAssignment_0
            {
            pushFollow(FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2438);
            rule__Scaffolding__ScaffoldAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getScaffoldingAccess().getScaffoldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffolding__Group__0__Impl


    // $ANTLR start rule__Scaffolding__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1155:1: rule__Scaffolding__Group__1 : rule__Scaffolding__Group__1__Impl ;
    public final void rule__Scaffolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1159:1: ( rule__Scaffolding__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1160:2: rule__Scaffolding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12468);
            rule__Scaffolding__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffolding__Group__1


    // $ANTLR start rule__Scaffolding__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1166:1: rule__Scaffolding__Group__1__Impl : ( ( rule__Scaffolding__ElementsAssignment_1 )* ) ;
    public final void rule__Scaffolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1170:1: ( ( ( rule__Scaffolding__ElementsAssignment_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1171:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1171:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1172:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            {
             before(grammarAccess.getScaffoldingAccess().getElementsAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1173:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1173:2: rule__Scaffolding__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2495);
            	    rule__Scaffolding__ElementsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getScaffoldingAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffolding__Group__1__Impl


    // $ANTLR start rule__Scaffold__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1187:1: rule__Scaffold__Group__0 : rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 ;
    public final void rule__Scaffold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1191:1: ( rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1192:2: rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02530);
            rule__Scaffold__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02533);
            rule__Scaffold__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffold__Group__0


    // $ANTLR start rule__Scaffold__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1199:1: rule__Scaffold__Group__0__Impl : ( 'scaffold' ) ;
    public final void rule__Scaffold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1203:1: ( ( 'scaffold' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1204:1: ( 'scaffold' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1204:1: ( 'scaffold' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1205:1: 'scaffold'
            {
             before(grammarAccess.getScaffoldAccess().getScaffoldKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Scaffold__Group__0__Impl2561); 
             after(grammarAccess.getScaffoldAccess().getScaffoldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffold__Group__0__Impl


    // $ANTLR start rule__Scaffold__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1218:1: rule__Scaffold__Group__1 : rule__Scaffold__Group__1__Impl ;
    public final void rule__Scaffold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1222:1: ( rule__Scaffold__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1223:2: rule__Scaffold__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12592);
            rule__Scaffold__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffold__Group__1


    // $ANTLR start rule__Scaffold__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1229:1: rule__Scaffold__Group__1__Impl : ( ( rule__Scaffold__RefPackageAssignment_1 ) ) ;
    public final void rule__Scaffold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1233:1: ( ( ( rule__Scaffold__RefPackageAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1234:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1234:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1235:1: ( rule__Scaffold__RefPackageAssignment_1 )
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1236:1: ( rule__Scaffold__RefPackageAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1236:2: rule__Scaffold__RefPackageAssignment_1
            {
            pushFollow(FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2619);
            rule__Scaffold__RefPackageAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getScaffoldAccess().getRefPackageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffold__Group__1__Impl


    // $ANTLR start rule__Rule__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1250:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1254:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1255:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02653);
            rule__Rule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02656);
            rule__Rule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__0


    // $ANTLR start rule__Rule__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1262:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1266:1: ( ( 'rule' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1267:1: ( 'rule' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1267:1: ( 'rule' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1268:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Rule__Group__0__Impl2684); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__0__Impl


    // $ANTLR start rule__Rule__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1281:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1285:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1286:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12715);
            rule__Rule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12718);
            rule__Rule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__1


    // $ANTLR start rule__Rule__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1293:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1297:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1298:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1298:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1299:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1300:1: ( rule__Rule__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1300:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2745);
            rule__Rule__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__1__Impl


    // $ANTLR start rule__Rule__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1310:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1314:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1315:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22775);
            rule__Rule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22778);
            rule__Rule__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__2


    // $ANTLR start rule__Rule__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1322:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__WhenAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1326:1: ( ( ( rule__Rule__WhenAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1327:1: ( ( rule__Rule__WhenAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1327:1: ( ( rule__Rule__WhenAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1328:1: ( rule__Rule__WhenAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getWhenAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1329:1: ( rule__Rule__WhenAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1329:2: rule__Rule__WhenAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2805);
            rule__Rule__WhenAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getWhenAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__2__Impl


    // $ANTLR start rule__Rule__Group__3
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1339:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1343:1: ( rule__Rule__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1344:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32835);
            rule__Rule__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__3


    // $ANTLR start rule__Rule__Group__3__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1350:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ThenAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1354:1: ( ( ( rule__Rule__ThenAssignment_3 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1355:1: ( ( rule__Rule__ThenAssignment_3 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1355:1: ( ( rule__Rule__ThenAssignment_3 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1356:1: ( rule__Rule__ThenAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getThenAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1357:1: ( rule__Rule__ThenAssignment_3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1357:2: rule__Rule__ThenAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl2862);
            rule__Rule__ThenAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getThenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__3__Impl


    // $ANTLR start rule__WhenBlock__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1375:1: rule__WhenBlock__Group__0 : rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 ;
    public final void rule__WhenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1379:1: ( rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1380:2: rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__02900);
            rule__WhenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__02903);
            rule__WhenBlock__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group__0


    // $ANTLR start rule__WhenBlock__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1387:1: rule__WhenBlock__Group__0__Impl : ( 'when' ) ;
    public final void rule__WhenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1391:1: ( ( 'when' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1392:1: ( 'when' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1392:1: ( 'when' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1393:1: 'when'
            {
             before(grammarAccess.getWhenBlockAccess().getWhenKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__WhenBlock__Group__0__Impl2931); 
             after(grammarAccess.getWhenBlockAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group__0__Impl


    // $ANTLR start rule__WhenBlock__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1406:1: rule__WhenBlock__Group__1 : rule__WhenBlock__Group__1__Impl ;
    public final void rule__WhenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1410:1: ( rule__WhenBlock__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1411:2: rule__WhenBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__12962);
            rule__WhenBlock__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group__1


    // $ANTLR start rule__WhenBlock__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1417:1: rule__WhenBlock__Group__1__Impl : ( ( rule__WhenBlock__Alternatives_1 ) ) ;
    public final void rule__WhenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1421:1: ( ( ( rule__WhenBlock__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1422:1: ( ( rule__WhenBlock__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1422:1: ( ( rule__WhenBlock__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1423:1: ( rule__WhenBlock__Alternatives_1 )
            {
             before(grammarAccess.getWhenBlockAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1424:1: ( rule__WhenBlock__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1424:2: rule__WhenBlock__Alternatives_1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Alternatives_1_in_rule__WhenBlock__Group__1__Impl2989);
            rule__WhenBlock__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getWhenBlockAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group__1__Impl


    // $ANTLR start rule__WhenBlock__Group_1_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1438:1: rule__WhenBlock__Group_1_0__0 : rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1 ;
    public final void rule__WhenBlock__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1442:1: ( rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1443:2: rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__0__Impl_in_rule__WhenBlock__Group_1_0__03023);
            rule__WhenBlock__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__1_in_rule__WhenBlock__Group_1_0__03026);
            rule__WhenBlock__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group_1_0__0


    // $ANTLR start rule__WhenBlock__Group_1_0__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1450:1: rule__WhenBlock__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__WhenBlock__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1454:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1455:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1455:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1456:1: '{'
            {
             before(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__WhenBlock__Group_1_0__0__Impl3054); 
             after(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group_1_0__0__Impl


    // $ANTLR start rule__WhenBlock__Group_1_0__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1469:1: rule__WhenBlock__Group_1_0__1 : rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2 ;
    public final void rule__WhenBlock__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1473:1: ( rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1474:2: rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__1__Impl_in_rule__WhenBlock__Group_1_0__13085);
            rule__WhenBlock__Group_1_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__2_in_rule__WhenBlock__Group_1_0__13088);
            rule__WhenBlock__Group_1_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group_1_0__1


    // $ANTLR start rule__WhenBlock__Group_1_0__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1481:1: rule__WhenBlock__Group_1_0__1__Impl : ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* ) ;
    public final void rule__WhenBlock__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1485:1: ( ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1486:1: ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1486:1: ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1487:1: ( rule__WhenBlock__MatchesAssignment_1_0_1 )*
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_1_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1488:1: ( rule__WhenBlock__MatchesAssignment_1_0_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1488:2: rule__WhenBlock__MatchesAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_1_0_1_in_rule__WhenBlock__Group_1_0__1__Impl3115);
            	    rule__WhenBlock__MatchesAssignment_1_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWhenBlockAccess().getMatchesAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group_1_0__1__Impl


    // $ANTLR start rule__WhenBlock__Group_1_0__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1498:1: rule__WhenBlock__Group_1_0__2 : rule__WhenBlock__Group_1_0__2__Impl ;
    public final void rule__WhenBlock__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1502:1: ( rule__WhenBlock__Group_1_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1503:2: rule__WhenBlock__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__2__Impl_in_rule__WhenBlock__Group_1_0__23146);
            rule__WhenBlock__Group_1_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group_1_0__2


    // $ANTLR start rule__WhenBlock__Group_1_0__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1509:1: rule__WhenBlock__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__WhenBlock__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1513:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1514:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1514:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1515:1: '}'
            {
             before(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_1_0_2()); 
            match(input,24,FOLLOW_24_in_rule__WhenBlock__Group_1_0__2__Impl3174); 
             after(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group_1_0__2__Impl


    // $ANTLR start rule__Match__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1534:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1538:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1539:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__03211);
            rule__Match__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__1_in_rule__Match__Group__03214);
            rule__Match__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group__0


    // $ANTLR start rule__Match__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1546:1: rule__Match__Group__0__Impl : ( ( rule__Match__Group_0__0 )? ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1550:1: ( ( ( rule__Match__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1551:1: ( ( rule__Match__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1551:1: ( ( rule__Match__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1552:1: ( rule__Match__Group_0__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1553:1: ( rule__Match__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==18) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1553:2: rule__Match__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3241);
                    rule__Match__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group__0__Impl


    // $ANTLR start rule__Match__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1563:1: rule__Match__Group__1 : rule__Match__Group__1__Impl rule__Match__Group__2 ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1567:1: ( rule__Match__Group__1__Impl rule__Match__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1568:2: rule__Match__Group__1__Impl rule__Match__Group__2
            {
            pushFollow(FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13272);
            rule__Match__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13275);
            rule__Match__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group__1


    // $ANTLR start rule__Match__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1575:1: rule__Match__Group__1__Impl : ( ( rule__Match__TypeAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1579:1: ( ( ( rule__Match__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1580:1: ( ( rule__Match__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1580:1: ( ( rule__Match__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1581:1: ( rule__Match__TypeAssignment_1 )
            {
             before(grammarAccess.getMatchAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1582:1: ( rule__Match__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1582:2: rule__Match__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3302);
            rule__Match__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMatchAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group__1__Impl


    // $ANTLR start rule__Match__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1592:1: rule__Match__Group__2 : rule__Match__Group__2__Impl ;
    public final void rule__Match__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1596:1: ( rule__Match__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1597:2: rule__Match__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23332);
            rule__Match__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group__2


    // $ANTLR start rule__Match__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1603:1: rule__Match__Group__2__Impl : ( ( rule__Match__Group_2__0 )? ) ;
    public final void rule__Match__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1607:1: ( ( ( rule__Match__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1608:1: ( ( rule__Match__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1608:1: ( ( rule__Match__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1609:1: ( rule__Match__Group_2__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1610:1: ( rule__Match__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1610:2: rule__Match__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3359);
                    rule__Match__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group__2__Impl


    // $ANTLR start rule__Match__Group_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1626:1: rule__Match__Group_0__0 : rule__Match__Group_0__0__Impl rule__Match__Group_0__1 ;
    public final void rule__Match__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1630:1: ( rule__Match__Group_0__0__Impl rule__Match__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1631:2: rule__Match__Group_0__0__Impl rule__Match__Group_0__1
            {
            pushFollow(FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03396);
            rule__Match__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03399);
            rule__Match__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_0__0


    // $ANTLR start rule__Match__Group_0__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1638:1: rule__Match__Group_0__0__Impl : ( ( rule__Match__VarAssignment_0_0 ) ) ;
    public final void rule__Match__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1642:1: ( ( ( rule__Match__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1643:1: ( ( rule__Match__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1643:1: ( ( rule__Match__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1644:1: ( rule__Match__VarAssignment_0_0 )
            {
             before(grammarAccess.getMatchAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1645:1: ( rule__Match__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1645:2: rule__Match__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3426);
            rule__Match__VarAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getMatchAccess().getVarAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_0__0__Impl


    // $ANTLR start rule__Match__Group_0__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1655:1: rule__Match__Group_0__1 : rule__Match__Group_0__1__Impl ;
    public final void rule__Match__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1659:1: ( rule__Match__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1660:2: rule__Match__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13456);
            rule__Match__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_0__1


    // $ANTLR start rule__Match__Group_0__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1666:1: rule__Match__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Match__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1670:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1671:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1671:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1672:1: ':'
            {
             before(grammarAccess.getMatchAccess().getColonKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__Match__Group_0__1__Impl3484); 
             after(grammarAccess.getMatchAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_0__1__Impl


    // $ANTLR start rule__Match__Group_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1689:1: rule__Match__Group_2__0 : rule__Match__Group_2__0__Impl rule__Match__Group_2__1 ;
    public final void rule__Match__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1693:1: ( rule__Match__Group_2__0__Impl rule__Match__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1694:2: rule__Match__Group_2__0__Impl rule__Match__Group_2__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03519);
            rule__Match__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03522);
            rule__Match__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2__0


    // $ANTLR start rule__Match__Group_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1701:1: rule__Match__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Match__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1705:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1706:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1706:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1707:1: '('
            {
             before(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Match__Group_2__0__Impl3550); 
             after(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2__0__Impl


    // $ANTLR start rule__Match__Group_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1720:1: rule__Match__Group_2__1 : rule__Match__Group_2__1__Impl rule__Match__Group_2__2 ;
    public final void rule__Match__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1724:1: ( rule__Match__Group_2__1__Impl rule__Match__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1725:2: rule__Match__Group_2__1__Impl rule__Match__Group_2__2
            {
            pushFollow(FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13581);
            rule__Match__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13584);
            rule__Match__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2__1


    // $ANTLR start rule__Match__Group_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1732:1: rule__Match__Group_2__1__Impl : ( ( rule__Match__Group_2_1__0 )? ) ;
    public final void rule__Match__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1736:1: ( ( ( rule__Match__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1737:1: ( ( rule__Match__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1737:1: ( ( rule__Match__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1738:1: ( rule__Match__Group_2_1__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1739:1: ( rule__Match__Group_2_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=RULE_INT && LA14_0<=RULE_FLOAT)||LA14_0==15||LA14_0==25||LA14_0==28||LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1739:2: rule__Match__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3611);
                    rule__Match__Group_2_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2__1__Impl


    // $ANTLR start rule__Match__Group_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1749:1: rule__Match__Group_2__2 : rule__Match__Group_2__2__Impl ;
    public final void rule__Match__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1753:1: ( rule__Match__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1754:2: rule__Match__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23642);
            rule__Match__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2__2


    // $ANTLR start rule__Match__Group_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1760:1: rule__Match__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Match__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1764:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1765:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1765:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1766:1: ')'
            {
             before(grammarAccess.getMatchAccess().getRightParenthesisKeyword_2_2()); 
            match(input,26,FOLLOW_26_in_rule__Match__Group_2__2__Impl3670); 
             after(grammarAccess.getMatchAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2__2__Impl


    // $ANTLR start rule__Match__Group_2_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1785:1: rule__Match__Group_2_1__0 : rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 ;
    public final void rule__Match__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1789:1: ( rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1790:2: rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03707);
            rule__Match__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03710);
            rule__Match__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2_1__0


    // $ANTLR start rule__Match__Group_2_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1797:1: rule__Match__Group_2_1__0__Impl : ( ( rule__Match__ParamsAssignment_2_1_0 ) ) ;
    public final void rule__Match__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1801:1: ( ( ( rule__Match__ParamsAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1802:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1802:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1803:1: ( rule__Match__ParamsAssignment_2_1_0 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1804:1: ( rule__Match__ParamsAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1804:2: rule__Match__ParamsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3737);
            rule__Match__ParamsAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getMatchAccess().getParamsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2_1__0__Impl


    // $ANTLR start rule__Match__Group_2_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1814:1: rule__Match__Group_2_1__1 : rule__Match__Group_2_1__1__Impl ;
    public final void rule__Match__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1818:1: ( rule__Match__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1819:2: rule__Match__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13767);
            rule__Match__Group_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2_1__1


    // $ANTLR start rule__Match__Group_2_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1825:1: rule__Match__Group_2_1__1__Impl : ( ( rule__Match__Group_2_1_1__0 )* ) ;
    public final void rule__Match__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1829:1: ( ( ( rule__Match__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1830:1: ( ( rule__Match__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1830:1: ( ( rule__Match__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1831:1: ( rule__Match__Group_2_1_1__0 )*
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1832:1: ( rule__Match__Group_2_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1832:2: rule__Match__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3794);
            	    rule__Match__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMatchAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2_1__1__Impl


    // $ANTLR start rule__Match__Group_2_1_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1846:1: rule__Match__Group_2_1_1__0 : rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 ;
    public final void rule__Match__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1850:1: ( rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1851:2: rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__03829);
            rule__Match__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__03832);
            rule__Match__Group_2_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2_1_1__0


    // $ANTLR start rule__Match__Group_2_1_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1858:1: rule__Match__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Match__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1862:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1863:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1863:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1864:1: ','
            {
             before(grammarAccess.getMatchAccess().getCommaKeyword_2_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Match__Group_2_1_1__0__Impl3860); 
             after(grammarAccess.getMatchAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2_1_1__0__Impl


    // $ANTLR start rule__Match__Group_2_1_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1877:1: rule__Match__Group_2_1_1__1 : rule__Match__Group_2_1_1__1__Impl ;
    public final void rule__Match__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1881:1: ( rule__Match__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1882:2: rule__Match__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__13891);
            rule__Match__Group_2_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2_1_1__1


    // $ANTLR start rule__Match__Group_2_1_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1888:1: rule__Match__Group_2_1_1__1__Impl : ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) ;
    public final void rule__Match__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1892:1: ( ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1893:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1893:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1894:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1895:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1895:2: rule__Match__ParamsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl3918);
            rule__Match__ParamsAssignment_2_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getMatchAccess().getParamsAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__Group_2_1_1__1__Impl


    // $ANTLR start rule__Param__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1909:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1913:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1914:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03952);
            rule__Param__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03955);
            rule__Param__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__Group__0


    // $ANTLR start rule__Param__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1921:1: rule__Param__Group__0__Impl : ( ( rule__Param__PropertyAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1925:1: ( ( ( rule__Param__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1926:1: ( ( rule__Param__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1926:1: ( ( rule__Param__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1927:1: ( rule__Param__PropertyAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1928:1: ( rule__Param__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1928:2: rule__Param__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl3982);
            rule__Param__PropertyAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParamAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__Group__0__Impl


    // $ANTLR start rule__Param__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1938:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1942:1: ( rule__Param__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1943:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__14012);
            rule__Param__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__Group__1


    // $ANTLR start rule__Param__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1949:1: rule__Param__Group__1__Impl : ( ( rule__Param__Group_1__0 )? ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1953:1: ( ( ( rule__Param__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1954:1: ( ( rule__Param__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1954:1: ( ( rule__Param__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1955:1: ( rule__Param__Group_1__0 )?
            {
             before(grammarAccess.getParamAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1956:1: ( rule__Param__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1956:2: rule__Param__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl4039);
                    rule__Param__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__Group__1__Impl


    // $ANTLR start rule__Param__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1970:1: rule__Param__Group_1__0 : rule__Param__Group_1__0__Impl rule__Param__Group_1__1 ;
    public final void rule__Param__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1974:1: ( rule__Param__Group_1__0__Impl rule__Param__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1975:2: rule__Param__Group_1__0__Impl rule__Param__Group_1__1
            {
            pushFollow(FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__04074);
            rule__Param__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__04077);
            rule__Param__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__Group_1__0


    // $ANTLR start rule__Param__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1982:1: rule__Param__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Param__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1986:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1987:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1987:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1988:1: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Param__Group_1__0__Impl4105); 
             after(grammarAccess.getParamAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__Group_1__0__Impl


    // $ANTLR start rule__Param__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2001:1: rule__Param__Group_1__1 : rule__Param__Group_1__1__Impl ;
    public final void rule__Param__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2005:1: ( rule__Param__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2006:2: rule__Param__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__14136);
            rule__Param__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__Group_1__1


    // $ANTLR start rule__Param__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2012:1: rule__Param__Group_1__1__Impl : ( ( rule__Param__VarAssignment_1_1 ) ) ;
    public final void rule__Param__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2016:1: ( ( ( rule__Param__VarAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2017:1: ( ( rule__Param__VarAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2017:1: ( ( rule__Param__VarAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2018:1: ( rule__Param__VarAssignment_1_1 )
            {
             before(grammarAccess.getParamAccess().getVarAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2019:1: ( rule__Param__VarAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2019:2: rule__Param__VarAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl4163);
            rule__Param__VarAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getParamAccess().getVarAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__Group_1__1__Impl


    // $ANTLR start rule__BindingExpression__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2033:1: rule__BindingExpression__Group__0 : rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1 ;
    public final void rule__BindingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2037:1: ( rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2038:2: rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__0__Impl_in_rule__BindingExpression__Group__04197);
            rule__BindingExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group__1_in_rule__BindingExpression__Group__04200);
            rule__BindingExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group__0


    // $ANTLR start rule__BindingExpression__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2045:1: rule__BindingExpression__Group__0__Impl : ( ruleBindingExpressionHigh ) ;
    public final void rule__BindingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2049:1: ( ( ruleBindingExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2050:1: ( ruleBindingExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2050:1: ( ruleBindingExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2051:1: ruleBindingExpressionHigh
            {
             before(grammarAccess.getBindingExpressionAccess().getBindingExpressionHighParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpression__Group__0__Impl4227);
            ruleBindingExpressionHigh();
            _fsp--;

             after(grammarAccess.getBindingExpressionAccess().getBindingExpressionHighParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group__0__Impl


    // $ANTLR start rule__BindingExpression__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2062:1: rule__BindingExpression__Group__1 : rule__BindingExpression__Group__1__Impl ;
    public final void rule__BindingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2066:1: ( rule__BindingExpression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2067:2: rule__BindingExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__1__Impl_in_rule__BindingExpression__Group__14256);
            rule__BindingExpression__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group__1


    // $ANTLR start rule__BindingExpression__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2073:1: rule__BindingExpression__Group__1__Impl : ( ( rule__BindingExpression__Group_1__0 )? ) ;
    public final void rule__BindingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2077:1: ( ( ( rule__BindingExpression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2078:1: ( ( rule__BindingExpression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2078:1: ( ( rule__BindingExpression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2079:1: ( rule__BindingExpression__Group_1__0 )?
            {
             before(grammarAccess.getBindingExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2080:1: ( rule__BindingExpression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2080:2: rule__BindingExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingExpression__Group_1__0_in_rule__BindingExpression__Group__1__Impl4283);
                    rule__BindingExpression__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBindingExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group__1__Impl


    // $ANTLR start rule__BindingExpression__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2094:1: rule__BindingExpression__Group_1__0 : rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1 ;
    public final void rule__BindingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2098:1: ( rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2099:2: rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__0__Impl_in_rule__BindingExpression__Group_1__04318);
            rule__BindingExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group_1__1_in_rule__BindingExpression__Group_1__04321);
            rule__BindingExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group_1__0


    // $ANTLR start rule__BindingExpression__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2106:1: rule__BindingExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2110:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2111:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2111:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2112:1: ()
            {
             before(grammarAccess.getBindingExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2113:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2115:1: 
            {
            }

             after(grammarAccess.getBindingExpressionAccess().getOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group_1__0__Impl


    // $ANTLR start rule__BindingExpression__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2125:1: rule__BindingExpression__Group_1__1 : rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2 ;
    public final void rule__BindingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2129:1: ( rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2130:2: rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__1__Impl_in_rule__BindingExpression__Group_1__14379);
            rule__BindingExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group_1__2_in_rule__BindingExpression__Group_1__14382);
            rule__BindingExpression__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group_1__1


    // $ANTLR start rule__BindingExpression__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2137:1: rule__BindingExpression__Group_1__1__Impl : ( ( rule__BindingExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BindingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2141:1: ( ( ( rule__BindingExpression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2142:1: ( ( rule__BindingExpression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2142:1: ( ( rule__BindingExpression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2143:1: ( rule__BindingExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBindingExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2144:1: ( rule__BindingExpression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2144:2: rule__BindingExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BindingExpression__OpAssignment_1_1_in_rule__BindingExpression__Group_1__1__Impl4409);
            rule__BindingExpression__OpAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getBindingExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group_1__1__Impl


    // $ANTLR start rule__BindingExpression__Group_1__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2154:1: rule__BindingExpression__Group_1__2 : rule__BindingExpression__Group_1__2__Impl ;
    public final void rule__BindingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2158:1: ( rule__BindingExpression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2159:2: rule__BindingExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__2__Impl_in_rule__BindingExpression__Group_1__24439);
            rule__BindingExpression__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group_1__2


    // $ANTLR start rule__BindingExpression__Group_1__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2165:1: rule__BindingExpression__Group_1__2__Impl : ( ( rule__BindingExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BindingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2169:1: ( ( ( rule__BindingExpression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2170:1: ( ( rule__BindingExpression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2170:1: ( ( rule__BindingExpression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2171:1: ( rule__BindingExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBindingExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2172:1: ( rule__BindingExpression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2172:2: rule__BindingExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingExpression__RightAssignment_1_2_in_rule__BindingExpression__Group_1__2__Impl4466);
            rule__BindingExpression__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getBindingExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__Group_1__2__Impl


    // $ANTLR start rule__BindingExpressionHigh__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2188:1: rule__BindingExpressionHigh__Group__0 : rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1 ;
    public final void rule__BindingExpressionHigh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2192:1: ( rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2193:2: rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__0__Impl_in_rule__BindingExpressionHigh__Group__04502);
            rule__BindingExpressionHigh__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__1_in_rule__BindingExpressionHigh__Group__04505);
            rule__BindingExpressionHigh__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group__0


    // $ANTLR start rule__BindingExpressionHigh__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2200:1: rule__BindingExpressionHigh__Group__0__Impl : ( ruleBindingTerminalExpression ) ;
    public final void rule__BindingExpressionHigh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2204:1: ( ( ruleBindingTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2205:1: ( ruleBindingTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2205:1: ( ruleBindingTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2206:1: ruleBindingTerminalExpression
            {
             before(grammarAccess.getBindingExpressionHighAccess().getBindingTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_rule__BindingExpressionHigh__Group__0__Impl4532);
            ruleBindingTerminalExpression();
            _fsp--;

             after(grammarAccess.getBindingExpressionHighAccess().getBindingTerminalExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group__0__Impl


    // $ANTLR start rule__BindingExpressionHigh__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2217:1: rule__BindingExpressionHigh__Group__1 : rule__BindingExpressionHigh__Group__1__Impl ;
    public final void rule__BindingExpressionHigh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2221:1: ( rule__BindingExpressionHigh__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2222:2: rule__BindingExpressionHigh__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__1__Impl_in_rule__BindingExpressionHigh__Group__14561);
            rule__BindingExpressionHigh__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group__1


    // $ANTLR start rule__BindingExpressionHigh__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2228:1: rule__BindingExpressionHigh__Group__1__Impl : ( ( rule__BindingExpressionHigh__Group_1__0 )? ) ;
    public final void rule__BindingExpressionHigh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2232:1: ( ( ( rule__BindingExpressionHigh__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2233:1: ( ( rule__BindingExpressionHigh__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2233:1: ( ( rule__BindingExpressionHigh__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2234:1: ( rule__BindingExpressionHigh__Group_1__0 )?
            {
             before(grammarAccess.getBindingExpressionHighAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2235:1: ( rule__BindingExpressionHigh__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2235:2: rule__BindingExpressionHigh__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__0_in_rule__BindingExpressionHigh__Group__1__Impl4588);
                    rule__BindingExpressionHigh__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBindingExpressionHighAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group__1__Impl


    // $ANTLR start rule__BindingExpressionHigh__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2249:1: rule__BindingExpressionHigh__Group_1__0 : rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1 ;
    public final void rule__BindingExpressionHigh__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2253:1: ( rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2254:2: rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__0__Impl_in_rule__BindingExpressionHigh__Group_1__04623);
            rule__BindingExpressionHigh__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__1_in_rule__BindingExpressionHigh__Group_1__04626);
            rule__BindingExpressionHigh__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group_1__0


    // $ANTLR start rule__BindingExpressionHigh__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2261:1: rule__BindingExpressionHigh__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingExpressionHigh__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2265:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2266:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2266:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2267:1: ()
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2268:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2270:1: 
            {
            }

             after(grammarAccess.getBindingExpressionHighAccess().getOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group_1__0__Impl


    // $ANTLR start rule__BindingExpressionHigh__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2280:1: rule__BindingExpressionHigh__Group_1__1 : rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2 ;
    public final void rule__BindingExpressionHigh__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2284:1: ( rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2285:2: rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__1__Impl_in_rule__BindingExpressionHigh__Group_1__14684);
            rule__BindingExpressionHigh__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__2_in_rule__BindingExpressionHigh__Group_1__14687);
            rule__BindingExpressionHigh__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group_1__1


    // $ANTLR start rule__BindingExpressionHigh__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2292:1: rule__BindingExpressionHigh__Group_1__1__Impl : ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) ) ;
    public final void rule__BindingExpressionHigh__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2296:1: ( ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2297:1: ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2297:1: ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2298:1: ( rule__BindingExpressionHigh__OpAssignment_1_1 )
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2299:1: ( rule__BindingExpressionHigh__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2299:2: rule__BindingExpressionHigh__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__OpAssignment_1_1_in_rule__BindingExpressionHigh__Group_1__1__Impl4714);
            rule__BindingExpressionHigh__OpAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getBindingExpressionHighAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group_1__1__Impl


    // $ANTLR start rule__BindingExpressionHigh__Group_1__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2309:1: rule__BindingExpressionHigh__Group_1__2 : rule__BindingExpressionHigh__Group_1__2__Impl ;
    public final void rule__BindingExpressionHigh__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2313:1: ( rule__BindingExpressionHigh__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2314:2: rule__BindingExpressionHigh__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__2__Impl_in_rule__BindingExpressionHigh__Group_1__24744);
            rule__BindingExpressionHigh__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group_1__2


    // $ANTLR start rule__BindingExpressionHigh__Group_1__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2320:1: rule__BindingExpressionHigh__Group_1__2__Impl : ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) ) ;
    public final void rule__BindingExpressionHigh__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2324:1: ( ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2325:1: ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2325:1: ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2326:1: ( rule__BindingExpressionHigh__RightAssignment_1_2 )
            {
             before(grammarAccess.getBindingExpressionHighAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2327:1: ( rule__BindingExpressionHigh__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2327:2: rule__BindingExpressionHigh__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__RightAssignment_1_2_in_rule__BindingExpressionHigh__Group_1__2__Impl4771);
            rule__BindingExpressionHigh__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getBindingExpressionHighAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__Group_1__2__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2343:1: rule__BindingTerminalExpression__Group_0__0 : rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1 ;
    public final void rule__BindingTerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2347:1: ( rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2348:2: rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__0__Impl_in_rule__BindingTerminalExpression__Group_0__04807);
            rule__BindingTerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__1_in_rule__BindingTerminalExpression__Group_0__04810);
            rule__BindingTerminalExpression__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_0__0


    // $ANTLR start rule__BindingTerminalExpression__Group_0__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2355:1: rule__BindingTerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BindingTerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2359:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2360:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2360:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2361:1: '('
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__BindingTerminalExpression__Group_0__0__Impl4838); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_0__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_0__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2374:1: rule__BindingTerminalExpression__Group_0__1 : rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2 ;
    public final void rule__BindingTerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2378:1: ( rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2379:2: rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__1__Impl_in_rule__BindingTerminalExpression__Group_0__14869);
            rule__BindingTerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__2_in_rule__BindingTerminalExpression__Group_0__14872);
            rule__BindingTerminalExpression__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_0__1


    // $ANTLR start rule__BindingTerminalExpression__Group_0__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2386:1: rule__BindingTerminalExpression__Group_0__1__Impl : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2390:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2391:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2391:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2392:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getBindingExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__Group_0__1__Impl4899);
            ruleBindingExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionAccess().getBindingExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_0__1__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_0__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2403:1: rule__BindingTerminalExpression__Group_0__2 : rule__BindingTerminalExpression__Group_0__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2407:1: ( rule__BindingTerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2408:2: rule__BindingTerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__2__Impl_in_rule__BindingTerminalExpression__Group_0__24928);
            rule__BindingTerminalExpression__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_0__2


    // $ANTLR start rule__BindingTerminalExpression__Group_0__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2414:1: rule__BindingTerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BindingTerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2418:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2419:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2419:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2420:1: ')'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__BindingTerminalExpression__Group_0__2__Impl4956); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_0__2__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2439:1: rule__BindingTerminalExpression__Group_2__0 : rule__BindingTerminalExpression__Group_2__0__Impl rule__BindingTerminalExpression__Group_2__1 ;
    public final void rule__BindingTerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2443:1: ( rule__BindingTerminalExpression__Group_2__0__Impl rule__BindingTerminalExpression__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2444:2: rule__BindingTerminalExpression__Group_2__0__Impl rule__BindingTerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_2__0__Impl_in_rule__BindingTerminalExpression__Group_2__04993);
            rule__BindingTerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_2__1_in_rule__BindingTerminalExpression__Group_2__04996);
            rule__BindingTerminalExpression__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_2__0


    // $ANTLR start rule__BindingTerminalExpression__Group_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2451:1: rule__BindingTerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__BindingTerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2455:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2456:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2456:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2457:1: ()
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getNotExpressionAction_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2458:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2460:1: 
            {
            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getNotExpressionAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_2__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2470:1: rule__BindingTerminalExpression__Group_2__1 : rule__BindingTerminalExpression__Group_2__1__Impl rule__BindingTerminalExpression__Group_2__2 ;
    public final void rule__BindingTerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2474:1: ( rule__BindingTerminalExpression__Group_2__1__Impl rule__BindingTerminalExpression__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2475:2: rule__BindingTerminalExpression__Group_2__1__Impl rule__BindingTerminalExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_2__1__Impl_in_rule__BindingTerminalExpression__Group_2__15054);
            rule__BindingTerminalExpression__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_2__2_in_rule__BindingTerminalExpression__Group_2__15057);
            rule__BindingTerminalExpression__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_2__1


    // $ANTLR start rule__BindingTerminalExpression__Group_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2482:1: rule__BindingTerminalExpression__Group_2__1__Impl : ( '!' ) ;
    public final void rule__BindingTerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2486:1: ( ( '!' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2487:1: ( '!' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2487:1: ( '!' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2488:1: '!'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExclamationMarkKeyword_2_1()); 
            match(input,28,FOLLOW_28_in_rule__BindingTerminalExpression__Group_2__1__Impl5085); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getExclamationMarkKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_2__1__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2501:1: rule__BindingTerminalExpression__Group_2__2 : rule__BindingTerminalExpression__Group_2__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2505:1: ( rule__BindingTerminalExpression__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2506:2: rule__BindingTerminalExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_2__2__Impl_in_rule__BindingTerminalExpression__Group_2__25116);
            rule__BindingTerminalExpression__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_2__2


    // $ANTLR start rule__BindingTerminalExpression__Group_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2512:1: rule__BindingTerminalExpression__Group_2__2__Impl : ( ( rule__BindingTerminalExpression__ExpAssignment_2_2 ) ) ;
    public final void rule__BindingTerminalExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2516:1: ( ( ( rule__BindingTerminalExpression__ExpAssignment_2_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2517:1: ( ( rule__BindingTerminalExpression__ExpAssignment_2_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2517:1: ( ( rule__BindingTerminalExpression__ExpAssignment_2_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2518:1: ( rule__BindingTerminalExpression__ExpAssignment_2_2 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_2_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2519:1: ( rule__BindingTerminalExpression__ExpAssignment_2_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2519:2: rule__BindingTerminalExpression__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ExpAssignment_2_2_in_rule__BindingTerminalExpression__Group_2__2__Impl5143);
            rule__BindingTerminalExpression__ExpAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_2__2__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2535:1: rule__BindingTerminalExpression__Group_3__0 : rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1 ;
    public final void rule__BindingTerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2539:1: ( rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2540:2: rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__0__Impl_in_rule__BindingTerminalExpression__Group_3__05179);
            rule__BindingTerminalExpression__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__1_in_rule__BindingTerminalExpression__Group_3__05182);
            rule__BindingTerminalExpression__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3__0


    // $ANTLR start rule__BindingTerminalExpression__Group_3__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2547:1: rule__BindingTerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__BindingTerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2551:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2552:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2552:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2553:1: ()
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2554:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2556:1: 
            {
            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2566:1: rule__BindingTerminalExpression__Group_3__1 : rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2 ;
    public final void rule__BindingTerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2570:1: ( rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2571:2: rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__1__Impl_in_rule__BindingTerminalExpression__Group_3__15240);
            rule__BindingTerminalExpression__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__2_in_rule__BindingTerminalExpression__Group_3__15243);
            rule__BindingTerminalExpression__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3__1


    // $ANTLR start rule__BindingTerminalExpression__Group_3__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2578:1: rule__BindingTerminalExpression__Group_3__1__Impl : ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2582:1: ( ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2583:1: ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2583:1: ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2584:1: ( rule__BindingTerminalExpression__FunctionAssignment_3_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionAssignment_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2585:1: ( rule__BindingTerminalExpression__FunctionAssignment_3_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2585:2: rule__BindingTerminalExpression__FunctionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__FunctionAssignment_3_1_in_rule__BindingTerminalExpression__Group_3__1__Impl5270);
            rule__BindingTerminalExpression__FunctionAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getFunctionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3__1__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2595:1: rule__BindingTerminalExpression__Group_3__2 : rule__BindingTerminalExpression__Group_3__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2599:1: ( rule__BindingTerminalExpression__Group_3__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2600:2: rule__BindingTerminalExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__2__Impl_in_rule__BindingTerminalExpression__Group_3__25300);
            rule__BindingTerminalExpression__Group_3__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3__2


    // $ANTLR start rule__BindingTerminalExpression__Group_3__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2606:1: rule__BindingTerminalExpression__Group_3__2__Impl : ( ( rule__BindingTerminalExpression__Group_3_2__0 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2610:1: ( ( ( rule__BindingTerminalExpression__Group_3_2__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2611:1: ( ( rule__BindingTerminalExpression__Group_3_2__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2611:1: ( ( rule__BindingTerminalExpression__Group_3_2__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2612:1: ( rule__BindingTerminalExpression__Group_3_2__0 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2613:1: ( rule__BindingTerminalExpression__Group_3_2__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2613:2: rule__BindingTerminalExpression__Group_3_2__0
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_2__0_in_rule__BindingTerminalExpression__Group_3__2__Impl5327);
            rule__BindingTerminalExpression__Group_3_2__0();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3__2__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2629:1: rule__BindingTerminalExpression__Group_3_2__0 : rule__BindingTerminalExpression__Group_3_2__0__Impl rule__BindingTerminalExpression__Group_3_2__1 ;
    public final void rule__BindingTerminalExpression__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2633:1: ( rule__BindingTerminalExpression__Group_3_2__0__Impl rule__BindingTerminalExpression__Group_3_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2634:2: rule__BindingTerminalExpression__Group_3_2__0__Impl rule__BindingTerminalExpression__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_2__0__Impl_in_rule__BindingTerminalExpression__Group_3_2__05363);
            rule__BindingTerminalExpression__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_2__1_in_rule__BindingTerminalExpression__Group_3_2__05366);
            rule__BindingTerminalExpression__Group_3_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3_2__0


    // $ANTLR start rule__BindingTerminalExpression__Group_3_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2641:1: rule__BindingTerminalExpression__Group_3_2__0__Impl : ( '(' ) ;
    public final void rule__BindingTerminalExpression__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2645:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2646:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2646:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2647:1: '('
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_3_2_0()); 
            match(input,25,FOLLOW_25_in_rule__BindingTerminalExpression__Group_3_2__0__Impl5394); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3_2__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2660:1: rule__BindingTerminalExpression__Group_3_2__1 : rule__BindingTerminalExpression__Group_3_2__1__Impl rule__BindingTerminalExpression__Group_3_2__2 ;
    public final void rule__BindingTerminalExpression__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2664:1: ( rule__BindingTerminalExpression__Group_3_2__1__Impl rule__BindingTerminalExpression__Group_3_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2665:2: rule__BindingTerminalExpression__Group_3_2__1__Impl rule__BindingTerminalExpression__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_2__1__Impl_in_rule__BindingTerminalExpression__Group_3_2__15425);
            rule__BindingTerminalExpression__Group_3_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_2__2_in_rule__BindingTerminalExpression__Group_3_2__15428);
            rule__BindingTerminalExpression__Group_3_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3_2__1


    // $ANTLR start rule__BindingTerminalExpression__Group_3_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2672:1: rule__BindingTerminalExpression__Group_3_2__1__Impl : ( ( rule__BindingTerminalExpression__ExpAssignment_3_2_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2676:1: ( ( ( rule__BindingTerminalExpression__ExpAssignment_3_2_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2677:1: ( ( rule__BindingTerminalExpression__ExpAssignment_3_2_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2677:1: ( ( rule__BindingTerminalExpression__ExpAssignment_3_2_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2678:1: ( rule__BindingTerminalExpression__ExpAssignment_3_2_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_3_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2679:1: ( rule__BindingTerminalExpression__ExpAssignment_3_2_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2679:2: rule__BindingTerminalExpression__ExpAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ExpAssignment_3_2_1_in_rule__BindingTerminalExpression__Group_3_2__1__Impl5455);
            rule__BindingTerminalExpression__ExpAssignment_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3_2__1__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2689:1: rule__BindingTerminalExpression__Group_3_2__2 : rule__BindingTerminalExpression__Group_3_2__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2693:1: ( rule__BindingTerminalExpression__Group_3_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2694:2: rule__BindingTerminalExpression__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_2__2__Impl_in_rule__BindingTerminalExpression__Group_3_2__25485);
            rule__BindingTerminalExpression__Group_3_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3_2__2


    // $ANTLR start rule__BindingTerminalExpression__Group_3_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2700:1: rule__BindingTerminalExpression__Group_3_2__2__Impl : ( ')' ) ;
    public final void rule__BindingTerminalExpression__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2704:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2705:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2705:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2706:1: ')'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_3_2_2()); 
            match(input,26,FOLLOW_26_in_rule__BindingTerminalExpression__Group_3_2__2__Impl5513); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_3_2__2__Impl


    // $ANTLR start rule__Expression__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2725:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2729:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2730:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05550);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05553);
            rule__Expression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__0


    // $ANTLR start rule__Expression__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2737:1: rule__Expression__Group__0__Impl : ( ruleExpressionHigh ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2741:1: ( ( ruleExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2742:1: ( ruleExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2742:1: ( ruleExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2743:1: ruleExpressionHigh
            {
             before(grammarAccess.getExpressionAccess().getExpressionHighParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_rule__Expression__Group__0__Impl5580);
            ruleExpressionHigh();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionHighParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__0__Impl


    // $ANTLR start rule__Expression__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2754:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2758:1: ( rule__Expression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2759:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15609);
            rule__Expression__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__1


    // $ANTLR start rule__Expression__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2765:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2769:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2770:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2770:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2771:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2772:1: ( rule__Expression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2772:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5636);
                    rule__Expression__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__1__Impl


    // $ANTLR start rule__Expression__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2786:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2790:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2791:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05671);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05674);
            rule__Expression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__0


    // $ANTLR start rule__Expression__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2798:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2802:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2803:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2803:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2804:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2805:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2807:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__0__Impl


    // $ANTLR start rule__Expression__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2817:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2821:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2822:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15732);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__15735);
            rule__Expression__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__1


    // $ANTLR start rule__Expression__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2829:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2833:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2834:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2834:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2835:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2836:1: ( rule__Expression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2836:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl5762);
            rule__Expression__OpAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__1__Impl


    // $ANTLR start rule__Expression__Group_1__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2846:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2850:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2851:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__25792);
            rule__Expression__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__2


    // $ANTLR start rule__Expression__Group_1__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2857:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2861:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2862:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2862:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2863:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2864:1: ( rule__Expression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2864:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl5819);
            rule__Expression__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__2__Impl


    // $ANTLR start rule__ExpressionHigh__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2880:1: rule__ExpressionHigh__Group__0 : rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1 ;
    public final void rule__ExpressionHigh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2884:1: ( rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2885:2: rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__0__Impl_in_rule__ExpressionHigh__Group__05855);
            rule__ExpressionHigh__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group__1_in_rule__ExpressionHigh__Group__05858);
            rule__ExpressionHigh__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group__0


    // $ANTLR start rule__ExpressionHigh__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2892:1: rule__ExpressionHigh__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__ExpressionHigh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2896:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2897:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2897:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2898:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionHighAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__ExpressionHigh__Group__0__Impl5885);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getExpressionHighAccess().getTerminalExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group__0__Impl


    // $ANTLR start rule__ExpressionHigh__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2909:1: rule__ExpressionHigh__Group__1 : rule__ExpressionHigh__Group__1__Impl ;
    public final void rule__ExpressionHigh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2913:1: ( rule__ExpressionHigh__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2914:2: rule__ExpressionHigh__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__1__Impl_in_rule__ExpressionHigh__Group__15914);
            rule__ExpressionHigh__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group__1


    // $ANTLR start rule__ExpressionHigh__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2920:1: rule__ExpressionHigh__Group__1__Impl : ( ( rule__ExpressionHigh__Group_1__0 )? ) ;
    public final void rule__ExpressionHigh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2924:1: ( ( ( rule__ExpressionHigh__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2925:1: ( ( rule__ExpressionHigh__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2925:1: ( ( rule__ExpressionHigh__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2926:1: ( rule__ExpressionHigh__Group_1__0 )?
            {
             before(grammarAccess.getExpressionHighAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2927:1: ( rule__ExpressionHigh__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2927:2: rule__ExpressionHigh__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__0_in_rule__ExpressionHigh__Group__1__Impl5941);
                    rule__ExpressionHigh__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionHighAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group__1__Impl


    // $ANTLR start rule__ExpressionHigh__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2941:1: rule__ExpressionHigh__Group_1__0 : rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1 ;
    public final void rule__ExpressionHigh__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2945:1: ( rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2946:2: rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__0__Impl_in_rule__ExpressionHigh__Group_1__05976);
            rule__ExpressionHigh__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__1_in_rule__ExpressionHigh__Group_1__05979);
            rule__ExpressionHigh__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group_1__0


    // $ANTLR start rule__ExpressionHigh__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2953:1: rule__ExpressionHigh__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionHigh__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2957:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2958:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2958:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2959:1: ()
            {
             before(grammarAccess.getExpressionHighAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2960:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2962:1: 
            {
            }

             after(grammarAccess.getExpressionHighAccess().getOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group_1__0__Impl


    // $ANTLR start rule__ExpressionHigh__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2972:1: rule__ExpressionHigh__Group_1__1 : rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2 ;
    public final void rule__ExpressionHigh__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2976:1: ( rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2977:2: rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__1__Impl_in_rule__ExpressionHigh__Group_1__16037);
            rule__ExpressionHigh__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__2_in_rule__ExpressionHigh__Group_1__16040);
            rule__ExpressionHigh__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group_1__1


    // $ANTLR start rule__ExpressionHigh__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2984:1: rule__ExpressionHigh__Group_1__1__Impl : ( ( rule__ExpressionHigh__OpAssignment_1_1 ) ) ;
    public final void rule__ExpressionHigh__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2988:1: ( ( ( rule__ExpressionHigh__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2989:1: ( ( rule__ExpressionHigh__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2989:1: ( ( rule__ExpressionHigh__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2990:1: ( rule__ExpressionHigh__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionHighAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2991:1: ( rule__ExpressionHigh__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2991:2: rule__ExpressionHigh__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__OpAssignment_1_1_in_rule__ExpressionHigh__Group_1__1__Impl6067);
            rule__ExpressionHigh__OpAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getExpressionHighAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group_1__1__Impl


    // $ANTLR start rule__ExpressionHigh__Group_1__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3001:1: rule__ExpressionHigh__Group_1__2 : rule__ExpressionHigh__Group_1__2__Impl ;
    public final void rule__ExpressionHigh__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3005:1: ( rule__ExpressionHigh__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3006:2: rule__ExpressionHigh__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__2__Impl_in_rule__ExpressionHigh__Group_1__26097);
            rule__ExpressionHigh__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group_1__2


    // $ANTLR start rule__ExpressionHigh__Group_1__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3012:1: rule__ExpressionHigh__Group_1__2__Impl : ( ( rule__ExpressionHigh__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionHigh__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3016:1: ( ( ( rule__ExpressionHigh__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3017:1: ( ( rule__ExpressionHigh__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3017:1: ( ( rule__ExpressionHigh__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3018:1: ( rule__ExpressionHigh__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionHighAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3019:1: ( rule__ExpressionHigh__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3019:2: rule__ExpressionHigh__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__RightAssignment_1_2_in_rule__ExpressionHigh__Group_1__2__Impl6124);
            rule__ExpressionHigh__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getExpressionHighAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__Group_1__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3035:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3039:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3040:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__06160);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__06163);
            rule__TerminalExpression__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__0


    // $ANTLR start rule__TerminalExpression__Group_0__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3047:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3051:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3052:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3052:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3053:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__TerminalExpression__Group_0__0__Impl6191); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3066:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3070:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3071:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__16222);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__16225);
            rule__TerminalExpression__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__1


    // $ANTLR start rule__TerminalExpression__Group_0__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3078:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3082:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3083:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3083:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3084:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl6252);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3095:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3099:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3100:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__26281);
            rule__TerminalExpression__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__2


    // $ANTLR start rule__TerminalExpression__Group_0__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3106:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3110:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3111:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3111:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3112:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__TerminalExpression__Group_0__2__Impl6309); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_3__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3131:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3135:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3136:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__06346);
            rule__TerminalExpression__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__06349);
            rule__TerminalExpression__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__0


    // $ANTLR start rule__TerminalExpression__Group_3__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3143:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3147:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3148:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3148:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3149:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3150:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3152:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_3__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3162:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2 ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3166:1: ( rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3167:2: rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__16407);
            rule__TerminalExpression__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__2_in_rule__TerminalExpression__Group_3__16410);
            rule__TerminalExpression__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__1


    // $ANTLR start rule__TerminalExpression__Group_3__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3174:1: rule__TerminalExpression__Group_3__1__Impl : ( '!' ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3178:1: ( ( '!' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3179:1: ( '!' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3179:1: ( '!' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3180:1: '!'
            {
             before(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_3_1()); 
            match(input,28,FOLLOW_28_in_rule__TerminalExpression__Group_3__1__Impl6438); 
             after(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_3__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3193:1: rule__TerminalExpression__Group_3__2 : rule__TerminalExpression__Group_3__2__Impl ;
    public final void rule__TerminalExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3197:1: ( rule__TerminalExpression__Group_3__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3198:2: rule__TerminalExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__2__Impl_in_rule__TerminalExpression__Group_3__26469);
            rule__TerminalExpression__Group_3__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__2


    // $ANTLR start rule__TerminalExpression__Group_3__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3204:1: rule__TerminalExpression__Group_3__2__Impl : ( ( rule__TerminalExpression__ExpAssignment_3_2 ) ) ;
    public final void rule__TerminalExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3208:1: ( ( ( rule__TerminalExpression__ExpAssignment_3_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3209:1: ( ( rule__TerminalExpression__ExpAssignment_3_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3209:1: ( ( rule__TerminalExpression__ExpAssignment_3_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3210:1: ( rule__TerminalExpression__ExpAssignment_3_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpAssignment_3_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3211:1: ( rule__TerminalExpression__ExpAssignment_3_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3211:2: rule__TerminalExpression__ExpAssignment_3_2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ExpAssignment_3_2_in_rule__TerminalExpression__Group_3__2__Impl6496);
            rule__TerminalExpression__ExpAssignment_3_2();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getExpAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_4__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3227:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3231:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3232:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__06532);
            rule__TerminalExpression__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__06535);
            rule__TerminalExpression__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__0


    // $ANTLR start rule__TerminalExpression__Group_4__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3239:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3243:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3244:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3244:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3245:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3246:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3248:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_4__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3258:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3262:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3263:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__16593);
            rule__TerminalExpression__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__16596);
            rule__TerminalExpression__Group_4__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__1


    // $ANTLR start rule__TerminalExpression__Group_4__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3270:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3274:1: ( ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3275:1: ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3275:1: ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3276:1: ( rule__TerminalExpression__FunctionAssignment_4_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_4_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3277:1: ( rule__TerminalExpression__FunctionAssignment_4_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3277:2: rule__TerminalExpression__FunctionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__FunctionAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl6623);
            rule__TerminalExpression__FunctionAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_4__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3287:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3291:1: ( rule__TerminalExpression__Group_4__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3292:2: rule__TerminalExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__26653);
            rule__TerminalExpression__Group_4__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__2


    // $ANTLR start rule__TerminalExpression__Group_4__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3298:1: rule__TerminalExpression__Group_4__2__Impl : ( ( rule__TerminalExpression__Group_4_2__0 ) ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3302:1: ( ( ( rule__TerminalExpression__Group_4_2__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3303:1: ( ( rule__TerminalExpression__Group_4_2__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3303:1: ( ( rule__TerminalExpression__Group_4_2__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3304:1: ( rule__TerminalExpression__Group_4_2__0 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3305:1: ( rule__TerminalExpression__Group_4_2__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3305:2: rule__TerminalExpression__Group_4_2__0
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2__0_in_rule__TerminalExpression__Group_4__2__Impl6680);
            rule__TerminalExpression__Group_4_2__0();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3321:1: rule__TerminalExpression__Group_4_2__0 : rule__TerminalExpression__Group_4_2__0__Impl rule__TerminalExpression__Group_4_2__1 ;
    public final void rule__TerminalExpression__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3325:1: ( rule__TerminalExpression__Group_4_2__0__Impl rule__TerminalExpression__Group_4_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3326:2: rule__TerminalExpression__Group_4_2__0__Impl rule__TerminalExpression__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2__0__Impl_in_rule__TerminalExpression__Group_4_2__06716);
            rule__TerminalExpression__Group_4_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2__1_in_rule__TerminalExpression__Group_4_2__06719);
            rule__TerminalExpression__Group_4_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2__0


    // $ANTLR start rule__TerminalExpression__Group_4_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3333:1: rule__TerminalExpression__Group_4_2__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3337:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3338:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3338:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3339:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2_0()); 
            match(input,25,FOLLOW_25_in_rule__TerminalExpression__Group_4_2__0__Impl6747); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3352:1: rule__TerminalExpression__Group_4_2__1 : rule__TerminalExpression__Group_4_2__1__Impl rule__TerminalExpression__Group_4_2__2 ;
    public final void rule__TerminalExpression__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3356:1: ( rule__TerminalExpression__Group_4_2__1__Impl rule__TerminalExpression__Group_4_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3357:2: rule__TerminalExpression__Group_4_2__1__Impl rule__TerminalExpression__Group_4_2__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2__1__Impl_in_rule__TerminalExpression__Group_4_2__16778);
            rule__TerminalExpression__Group_4_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2__2_in_rule__TerminalExpression__Group_4_2__16781);
            rule__TerminalExpression__Group_4_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2__1


    // $ANTLR start rule__TerminalExpression__Group_4_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3364:1: rule__TerminalExpression__Group_4_2__1__Impl : ( ( rule__TerminalExpression__Group_4_2_1__0 )? ) ;
    public final void rule__TerminalExpression__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3368:1: ( ( ( rule__TerminalExpression__Group_4_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3369:1: ( ( rule__TerminalExpression__Group_4_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3369:1: ( ( rule__TerminalExpression__Group_4_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3370:1: ( rule__TerminalExpression__Group_4_2_1__0 )?
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3371:1: ( rule__TerminalExpression__Group_4_2_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||(LA21_0>=RULE_INT && LA21_0<=RULE_FLOAT)||LA21_0==15||LA21_0==25||(LA21_0>=28 && LA21_0<=30)||LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3371:2: rule__TerminalExpression__Group_4_2_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2_1__0_in_rule__TerminalExpression__Group_4_2__1__Impl6808);
                    rule__TerminalExpression__Group_4_2_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalExpressionAccess().getGroup_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3381:1: rule__TerminalExpression__Group_4_2__2 : rule__TerminalExpression__Group_4_2__2__Impl ;
    public final void rule__TerminalExpression__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3385:1: ( rule__TerminalExpression__Group_4_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3386:2: rule__TerminalExpression__Group_4_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2__2__Impl_in_rule__TerminalExpression__Group_4_2__26839);
            rule__TerminalExpression__Group_4_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2__2


    // $ANTLR start rule__TerminalExpression__Group_4_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3392:1: rule__TerminalExpression__Group_4_2__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3396:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3397:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3397:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3398:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_2_2()); 
            match(input,26,FOLLOW_26_in_rule__TerminalExpression__Group_4_2__2__Impl6867); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_2_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3417:1: rule__TerminalExpression__Group_4_2_1__0 : rule__TerminalExpression__Group_4_2_1__0__Impl rule__TerminalExpression__Group_4_2_1__1 ;
    public final void rule__TerminalExpression__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3421:1: ( rule__TerminalExpression__Group_4_2_1__0__Impl rule__TerminalExpression__Group_4_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3422:2: rule__TerminalExpression__Group_4_2_1__0__Impl rule__TerminalExpression__Group_4_2_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2_1__0__Impl_in_rule__TerminalExpression__Group_4_2_1__06904);
            rule__TerminalExpression__Group_4_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2_1__1_in_rule__TerminalExpression__Group_4_2_1__06907);
            rule__TerminalExpression__Group_4_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2_1__0


    // $ANTLR start rule__TerminalExpression__Group_4_2_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3429:1: rule__TerminalExpression__Group_4_2_1__0__Impl : ( ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_0 ) ) ;
    public final void rule__TerminalExpression__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3433:1: ( ( ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3434:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3434:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3435:1: ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_0 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3436:1: ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3436:2: rule__TerminalExpression__ArgumentsAssignment_4_2_1_0
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_2_1_0_in_rule__TerminalExpression__Group_4_2_1__0__Impl6934);
            rule__TerminalExpression__ArgumentsAssignment_4_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2_1__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_2_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3446:1: rule__TerminalExpression__Group_4_2_1__1 : rule__TerminalExpression__Group_4_2_1__1__Impl ;
    public final void rule__TerminalExpression__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3450:1: ( rule__TerminalExpression__Group_4_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3451:2: rule__TerminalExpression__Group_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2_1__1__Impl_in_rule__TerminalExpression__Group_4_2_1__16964);
            rule__TerminalExpression__Group_4_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2_1__1


    // $ANTLR start rule__TerminalExpression__Group_4_2_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3457:1: rule__TerminalExpression__Group_4_2_1__1__Impl : ( ( rule__TerminalExpression__Group_4_2_1_1__0 )* ) ;
    public final void rule__TerminalExpression__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3461:1: ( ( ( rule__TerminalExpression__Group_4_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3462:1: ( ( rule__TerminalExpression__Group_4_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3462:1: ( ( rule__TerminalExpression__Group_4_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3463:1: ( rule__TerminalExpression__Group_4_2_1_1__0 )*
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3464:1: ( rule__TerminalExpression__Group_4_2_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3464:2: rule__TerminalExpression__Group_4_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2_1_1__0_in_rule__TerminalExpression__Group_4_2_1__1__Impl6991);
            	    rule__TerminalExpression__Group_4_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTerminalExpressionAccess().getGroup_4_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2_1__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_2_1_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3478:1: rule__TerminalExpression__Group_4_2_1_1__0 : rule__TerminalExpression__Group_4_2_1_1__0__Impl rule__TerminalExpression__Group_4_2_1_1__1 ;
    public final void rule__TerminalExpression__Group_4_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3482:1: ( rule__TerminalExpression__Group_4_2_1_1__0__Impl rule__TerminalExpression__Group_4_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3483:2: rule__TerminalExpression__Group_4_2_1_1__0__Impl rule__TerminalExpression__Group_4_2_1_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2_1_1__0__Impl_in_rule__TerminalExpression__Group_4_2_1_1__07026);
            rule__TerminalExpression__Group_4_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2_1_1__1_in_rule__TerminalExpression__Group_4_2_1_1__07029);
            rule__TerminalExpression__Group_4_2_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2_1_1__0


    // $ANTLR start rule__TerminalExpression__Group_4_2_1_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3490:1: rule__TerminalExpression__Group_4_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__TerminalExpression__Group_4_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3494:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3495:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3495:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3496:1: ','
            {
             before(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_2_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__TerminalExpression__Group_4_2_1_1__0__Impl7057); 
             after(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2_1_1__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_2_1_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3509:1: rule__TerminalExpression__Group_4_2_1_1__1 : rule__TerminalExpression__Group_4_2_1_1__1__Impl ;
    public final void rule__TerminalExpression__Group_4_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3513:1: ( rule__TerminalExpression__Group_4_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3514:2: rule__TerminalExpression__Group_4_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_2_1_1__1__Impl_in_rule__TerminalExpression__Group_4_2_1_1__17088);
            rule__TerminalExpression__Group_4_2_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2_1_1__1


    // $ANTLR start rule__TerminalExpression__Group_4_2_1_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3520:1: rule__TerminalExpression__Group_4_2_1_1__1__Impl : ( ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_4_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3524:1: ( ( ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3525:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3525:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3526:1: ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3527:1: ( rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3527:2: rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1_in_rule__TerminalExpression__Group_4_2_1_1__1__Impl7115);
            rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4_2_1_1__1__Impl


    // $ANTLR start rule__PrimitiveLiteral__Group_3__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3541:1: rule__PrimitiveLiteral__Group_3__0 : rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1 ;
    public final void rule__PrimitiveLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3545:1: ( rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3546:2: rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__0__Impl_in_rule__PrimitiveLiteral__Group_3__07149);
            rule__PrimitiveLiteral__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__1_in_rule__PrimitiveLiteral__Group_3__07152);
            rule__PrimitiveLiteral__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_3__0


    // $ANTLR start rule__PrimitiveLiteral__Group_3__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3553:1: rule__PrimitiveLiteral__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3557:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3558:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3558:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3559:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getIntLiteralAction_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3560:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3562:1: 
            {
            }

             after(grammarAccess.getPrimitiveLiteralAccess().getIntLiteralAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_3__0__Impl


    // $ANTLR start rule__PrimitiveLiteral__Group_3__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3572:1: rule__PrimitiveLiteral__Group_3__1 : rule__PrimitiveLiteral__Group_3__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3576:1: ( rule__PrimitiveLiteral__Group_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3577:2: rule__PrimitiveLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__1__Impl_in_rule__PrimitiveLiteral__Group_3__17210);
            rule__PrimitiveLiteral__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_3__1


    // $ANTLR start rule__PrimitiveLiteral__Group_3__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3583:1: rule__PrimitiveLiteral__Group_3__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3587:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3588:1: ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3588:1: ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3589:1: ( rule__PrimitiveLiteral__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3590:1: ( rule__PrimitiveLiteral__ValueAssignment_3_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3590:2: rule__PrimitiveLiteral__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_3_1_in_rule__PrimitiveLiteral__Group_3__1__Impl7237);
            rule__PrimitiveLiteral__ValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_3__1__Impl


    // $ANTLR start rule__PrimitiveLiteral__Group_4__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3604:1: rule__PrimitiveLiteral__Group_4__0 : rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1 ;
    public final void rule__PrimitiveLiteral__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3608:1: ( rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3609:2: rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__0__Impl_in_rule__PrimitiveLiteral__Group_4__07271);
            rule__PrimitiveLiteral__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__1_in_rule__PrimitiveLiteral__Group_4__07274);
            rule__PrimitiveLiteral__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_4__0


    // $ANTLR start rule__PrimitiveLiteral__Group_4__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3616:1: rule__PrimitiveLiteral__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3620:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3621:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3621:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3622:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getBooleanLiteralAction_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3623:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3625:1: 
            {
            }

             after(grammarAccess.getPrimitiveLiteralAccess().getBooleanLiteralAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_4__0__Impl


    // $ANTLR start rule__PrimitiveLiteral__Group_4__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3635:1: rule__PrimitiveLiteral__Group_4__1 : rule__PrimitiveLiteral__Group_4__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3639:1: ( rule__PrimitiveLiteral__Group_4__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3640:2: rule__PrimitiveLiteral__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__1__Impl_in_rule__PrimitiveLiteral__Group_4__17332);
            rule__PrimitiveLiteral__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_4__1


    // $ANTLR start rule__PrimitiveLiteral__Group_4__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3646:1: rule__PrimitiveLiteral__Group_4__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3650:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3651:1: ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3651:1: ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3652:1: ( rule__PrimitiveLiteral__ValueAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_4_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3653:1: ( rule__PrimitiveLiteral__ValueAssignment_4_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3653:2: rule__PrimitiveLiteral__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_4_1_in_rule__PrimitiveLiteral__Group_4__1__Impl7359);
            rule__PrimitiveLiteral__ValueAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_4__1__Impl


    // $ANTLR start rule__PrimitiveLiteral__Group_5__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3667:1: rule__PrimitiveLiteral__Group_5__0 : rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1 ;
    public final void rule__PrimitiveLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3671:1: ( rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3672:2: rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__0__Impl_in_rule__PrimitiveLiteral__Group_5__07393);
            rule__PrimitiveLiteral__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__1_in_rule__PrimitiveLiteral__Group_5__07396);
            rule__PrimitiveLiteral__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_5__0


    // $ANTLR start rule__PrimitiveLiteral__Group_5__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3679:1: rule__PrimitiveLiteral__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3683:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3684:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3684:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3685:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getFloatLiteralAction_5_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3686:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3688:1: 
            {
            }

             after(grammarAccess.getPrimitiveLiteralAccess().getFloatLiteralAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_5__0__Impl


    // $ANTLR start rule__PrimitiveLiteral__Group_5__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3698:1: rule__PrimitiveLiteral__Group_5__1 : rule__PrimitiveLiteral__Group_5__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3702:1: ( rule__PrimitiveLiteral__Group_5__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3703:2: rule__PrimitiveLiteral__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__1__Impl_in_rule__PrimitiveLiteral__Group_5__17454);
            rule__PrimitiveLiteral__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_5__1


    // $ANTLR start rule__PrimitiveLiteral__Group_5__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3709:1: rule__PrimitiveLiteral__Group_5__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3713:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3714:1: ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3714:1: ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3715:1: ( rule__PrimitiveLiteral__ValueAssignment_5_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_5_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3716:1: ( rule__PrimitiveLiteral__ValueAssignment_5_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3716:2: rule__PrimitiveLiteral__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_5_1_in_rule__PrimitiveLiteral__Group_5__1__Impl7481);
            rule__PrimitiveLiteral__ValueAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__Group_5__1__Impl


    // $ANTLR start rule__ThenBlock__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3730:1: rule__ThenBlock__Group__0 : rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 ;
    public final void rule__ThenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3734:1: ( rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3735:2: rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__07515);
            rule__ThenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__07518);
            rule__ThenBlock__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group__0


    // $ANTLR start rule__ThenBlock__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3742:1: rule__ThenBlock__Group__0__Impl : ( ( rule__ThenBlock__Alternatives_0 ) ) ;
    public final void rule__ThenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3746:1: ( ( ( rule__ThenBlock__Alternatives_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3747:1: ( ( rule__ThenBlock__Alternatives_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3747:1: ( ( rule__ThenBlock__Alternatives_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3748:1: ( rule__ThenBlock__Alternatives_0 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3749:1: ( rule__ThenBlock__Alternatives_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3749:2: rule__ThenBlock__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_0_in_rule__ThenBlock__Group__0__Impl7545);
            rule__ThenBlock__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getThenBlockAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group__0__Impl


    // $ANTLR start rule__ThenBlock__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3759:1: rule__ThenBlock__Group__1 : rule__ThenBlock__Group__1__Impl ;
    public final void rule__ThenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3763:1: ( rule__ThenBlock__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3764:2: rule__ThenBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__17575);
            rule__ThenBlock__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group__1


    // $ANTLR start rule__ThenBlock__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3770:1: rule__ThenBlock__Group__1__Impl : ( ( rule__ThenBlock__Alternatives_1 ) ) ;
    public final void rule__ThenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3774:1: ( ( ( rule__ThenBlock__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3775:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3775:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3776:1: ( rule__ThenBlock__Alternatives_1 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3777:1: ( rule__ThenBlock__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3777:2: rule__ThenBlock__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl7602);
            rule__ThenBlock__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getThenBlockAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group__1__Impl


    // $ANTLR start rule__ThenBlock__Group_1_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3791:1: rule__ThenBlock__Group_1_0__0 : rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1 ;
    public final void rule__ThenBlock__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3795:1: ( rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3796:2: rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__0__Impl_in_rule__ThenBlock__Group_1_0__07636);
            rule__ThenBlock__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__1_in_rule__ThenBlock__Group_1_0__07639);
            rule__ThenBlock__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0__0


    // $ANTLR start rule__ThenBlock__Group_1_0__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3803:1: rule__ThenBlock__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__ThenBlock__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3807:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3808:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3808:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3809:1: '{'
            {
             before(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__ThenBlock__Group_1_0__0__Impl7667); 
             after(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0__0__Impl


    // $ANTLR start rule__ThenBlock__Group_1_0__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3822:1: rule__ThenBlock__Group_1_0__1 : rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2 ;
    public final void rule__ThenBlock__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3826:1: ( rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3827:2: rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__1__Impl_in_rule__ThenBlock__Group_1_0__17698);
            rule__ThenBlock__Group_1_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__2_in_rule__ThenBlock__Group_1_0__17701);
            rule__ThenBlock__Group_1_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0__1


    // $ANTLR start rule__ThenBlock__Group_1_0__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3834:1: rule__ThenBlock__Group_1_0__1__Impl : ( ( rule__ThenBlock__StatementsAssignment_1_0_1 )* ) ;
    public final void rule__ThenBlock__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3838:1: ( ( ( rule__ThenBlock__StatementsAssignment_1_0_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3839:1: ( ( rule__ThenBlock__StatementsAssignment_1_0_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3839:1: ( ( rule__ThenBlock__StatementsAssignment_1_0_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3840:1: ( rule__ThenBlock__StatementsAssignment_1_0_1 )*
            {
             before(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3841:1: ( rule__ThenBlock__StatementsAssignment_1_0_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||(LA23_0>=RULE_INT && LA23_0<=RULE_FLOAT)||LA23_0==15||LA23_0==25||(LA23_0>=28 && LA23_0<=30)||LA23_0==32||LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3841:2: rule__ThenBlock__StatementsAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_1_0_1_in_rule__ThenBlock__Group_1_0__1__Impl7728);
            	    rule__ThenBlock__StatementsAssignment_1_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0__1__Impl


    // $ANTLR start rule__ThenBlock__Group_1_0__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3851:1: rule__ThenBlock__Group_1_0__2 : rule__ThenBlock__Group_1_0__2__Impl ;
    public final void rule__ThenBlock__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3855:1: ( rule__ThenBlock__Group_1_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3856:2: rule__ThenBlock__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__2__Impl_in_rule__ThenBlock__Group_1_0__27759);
            rule__ThenBlock__Group_1_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0__2


    // $ANTLR start rule__ThenBlock__Group_1_0__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3862:1: rule__ThenBlock__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__ThenBlock__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3866:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3867:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3867:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3868:1: '}'
            {
             before(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_1_0_2()); 
            match(input,24,FOLLOW_24_in_rule__ThenBlock__Group_1_0__2__Impl7787); 
             after(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0__2__Impl


    // $ANTLR start rule__CreateStatement__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3887:1: rule__CreateStatement__Group__0 : rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 ;
    public final void rule__CreateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3891:1: ( rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3892:2: rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__07824);
            rule__CreateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__07827);
            rule__CreateStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__Group__0


    // $ANTLR start rule__CreateStatement__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3899:1: rule__CreateStatement__Group__0__Impl : ( ( rule__CreateStatement__Group_0__0 )? ) ;
    public final void rule__CreateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3903:1: ( ( ( rule__CreateStatement__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3904:1: ( ( rule__CreateStatement__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3904:1: ( ( rule__CreateStatement__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3905:1: ( rule__CreateStatement__Group_0__0 )?
            {
             before(grammarAccess.getCreateStatementAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3906:1: ( rule__CreateStatement__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==18) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3906:2: rule__CreateStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl7854);
                    rule__CreateStatement__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreateStatementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__Group__0__Impl


    // $ANTLR start rule__CreateStatement__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3916:1: rule__CreateStatement__Group__1 : rule__CreateStatement__Group__1__Impl ;
    public final void rule__CreateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3920:1: ( rule__CreateStatement__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3921:2: rule__CreateStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__17885);
            rule__CreateStatement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__Group__1


    // $ANTLR start rule__CreateStatement__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3927:1: rule__CreateStatement__Group__1__Impl : ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) ;
    public final void rule__CreateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3931:1: ( ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3932:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3932:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3933:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3934:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3934:2: rule__CreateStatement__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl7912);
            rule__CreateStatement__ExpressionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCreateStatementAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__Group__1__Impl


    // $ANTLR start rule__CreateStatement__Group_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3948:1: rule__CreateStatement__Group_0__0 : rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 ;
    public final void rule__CreateStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3952:1: ( rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3953:2: rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__07946);
            rule__CreateStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__07949);
            rule__CreateStatement__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__Group_0__0


    // $ANTLR start rule__CreateStatement__Group_0__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3960:1: rule__CreateStatement__Group_0__0__Impl : ( ( rule__CreateStatement__VarAssignment_0_0 ) ) ;
    public final void rule__CreateStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3964:1: ( ( ( rule__CreateStatement__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3965:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3965:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3966:1: ( rule__CreateStatement__VarAssignment_0_0 )
            {
             before(grammarAccess.getCreateStatementAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3967:1: ( rule__CreateStatement__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3967:2: rule__CreateStatement__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl7976);
            rule__CreateStatement__VarAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getCreateStatementAccess().getVarAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__Group_0__0__Impl


    // $ANTLR start rule__CreateStatement__Group_0__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3977:1: rule__CreateStatement__Group_0__1 : rule__CreateStatement__Group_0__1__Impl ;
    public final void rule__CreateStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3981:1: ( rule__CreateStatement__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3982:2: rule__CreateStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__18006);
            rule__CreateStatement__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__Group_0__1


    // $ANTLR start rule__CreateStatement__Group_0__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3988:1: rule__CreateStatement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__CreateStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3992:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3993:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3993:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3994:1: ':'
            {
             before(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__CreateStatement__Group_0__1__Impl8034); 
             after(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__Group_0__1__Impl


    // $ANTLR start rule__CreateClass__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4011:1: rule__CreateClass__Group__0 : rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 ;
    public final void rule__CreateClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4015:1: ( rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4016:2: rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__08069);
            rule__CreateClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__08072);
            rule__CreateClass__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group__0


    // $ANTLR start rule__CreateClass__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4023:1: rule__CreateClass__Group__0__Impl : ( 'new' ) ;
    public final void rule__CreateClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4027:1: ( ( 'new' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4028:1: ( 'new' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4028:1: ( 'new' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4029:1: 'new'
            {
             before(grammarAccess.getCreateClassAccess().getNewKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__CreateClass__Group__0__Impl8100); 
             after(grammarAccess.getCreateClassAccess().getNewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group__0__Impl


    // $ANTLR start rule__CreateClass__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4042:1: rule__CreateClass__Group__1 : rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 ;
    public final void rule__CreateClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4046:1: ( rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4047:2: rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__18131);
            rule__CreateClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__18134);
            rule__CreateClass__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group__1


    // $ANTLR start rule__CreateClass__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4054:1: rule__CreateClass__Group__1__Impl : ( ( rule__CreateClass__TypeAssignment_1 ) ) ;
    public final void rule__CreateClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4058:1: ( ( ( rule__CreateClass__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4059:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4059:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4060:1: ( rule__CreateClass__TypeAssignment_1 )
            {
             before(grammarAccess.getCreateClassAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4061:1: ( rule__CreateClass__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4061:2: rule__CreateClass__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl8161);
            rule__CreateClass__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCreateClassAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group__1__Impl


    // $ANTLR start rule__CreateClass__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4071:1: rule__CreateClass__Group__2 : rule__CreateClass__Group__2__Impl ;
    public final void rule__CreateClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4075:1: ( rule__CreateClass__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4076:2: rule__CreateClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__28191);
            rule__CreateClass__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group__2


    // $ANTLR start rule__CreateClass__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4082:1: rule__CreateClass__Group__2__Impl : ( ( rule__CreateClass__Group_2__0 )? ) ;
    public final void rule__CreateClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4086:1: ( ( ( rule__CreateClass__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4087:1: ( ( rule__CreateClass__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4087:1: ( ( rule__CreateClass__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4088:1: ( rule__CreateClass__Group_2__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4089:1: ( rule__CreateClass__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4089:2: rule__CreateClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl8218);
                    rule__CreateClass__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreateClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group__2__Impl


    // $ANTLR start rule__CreateClass__Group_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4105:1: rule__CreateClass__Group_2__0 : rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 ;
    public final void rule__CreateClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4109:1: ( rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4110:2: rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__08255);
            rule__CreateClass__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__08258);
            rule__CreateClass__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2__0


    // $ANTLR start rule__CreateClass__Group_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4117:1: rule__CreateClass__Group_2__0__Impl : ( '{' ) ;
    public final void rule__CreateClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4121:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4122:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4122:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4123:1: '{'
            {
             before(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__CreateClass__Group_2__0__Impl8286); 
             after(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2__0__Impl


    // $ANTLR start rule__CreateClass__Group_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4136:1: rule__CreateClass__Group_2__1 : rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 ;
    public final void rule__CreateClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4140:1: ( rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4141:2: rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__18317);
            rule__CreateClass__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__18320);
            rule__CreateClass__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2__1


    // $ANTLR start rule__CreateClass__Group_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4148:1: rule__CreateClass__Group_2__1__Impl : ( ( rule__CreateClass__Group_2_1__0 )? ) ;
    public final void rule__CreateClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4152:1: ( ( ( rule__CreateClass__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4153:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4153:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4154:1: ( rule__CreateClass__Group_2_1__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4155:1: ( rule__CreateClass__Group_2_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4155:2: rule__CreateClass__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl8347);
                    rule__CreateClass__Group_2_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreateClassAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2__1__Impl


    // $ANTLR start rule__CreateClass__Group_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4165:1: rule__CreateClass__Group_2__2 : rule__CreateClass__Group_2__2__Impl ;
    public final void rule__CreateClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4169:1: ( rule__CreateClass__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4170:2: rule__CreateClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__28378);
            rule__CreateClass__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2__2


    // $ANTLR start rule__CreateClass__Group_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4176:1: rule__CreateClass__Group_2__2__Impl : ( '}' ) ;
    public final void rule__CreateClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4180:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4181:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4181:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4182:1: '}'
            {
             before(grammarAccess.getCreateClassAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__CreateClass__Group_2__2__Impl8406); 
             after(grammarAccess.getCreateClassAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2__2__Impl


    // $ANTLR start rule__CreateClass__Group_2_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4201:1: rule__CreateClass__Group_2_1__0 : rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 ;
    public final void rule__CreateClass__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4205:1: ( rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4206:2: rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__08443);
            rule__CreateClass__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__08446);
            rule__CreateClass__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2_1__0


    // $ANTLR start rule__CreateClass__Group_2_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4213:1: rule__CreateClass__Group_2_1__0__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) ;
    public final void rule__CreateClass__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4217:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4218:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4218:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4219:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4220:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4220:2: rule__CreateClass__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl8473);
            rule__CreateClass__SettersAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2_1__0__Impl


    // $ANTLR start rule__CreateClass__Group_2_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4230:1: rule__CreateClass__Group_2_1__1 : rule__CreateClass__Group_2_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4234:1: ( rule__CreateClass__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4235:2: rule__CreateClass__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__18503);
            rule__CreateClass__Group_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2_1__1


    // $ANTLR start rule__CreateClass__Group_2_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4241:1: rule__CreateClass__Group_2_1__1__Impl : ( ( rule__CreateClass__Group_2_1_1__0 )* ) ;
    public final void rule__CreateClass__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4245:1: ( ( ( rule__CreateClass__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4246:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4246:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4247:1: ( rule__CreateClass__Group_2_1_1__0 )*
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4248:1: ( rule__CreateClass__Group_2_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4248:2: rule__CreateClass__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl8530);
            	    rule__CreateClass__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCreateClassAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2_1__1__Impl


    // $ANTLR start rule__CreateClass__Group_2_1_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4262:1: rule__CreateClass__Group_2_1_1__0 : rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 ;
    public final void rule__CreateClass__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4266:1: ( rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4267:2: rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__08565);
            rule__CreateClass__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__08568);
            rule__CreateClass__Group_2_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2_1_1__0


    // $ANTLR start rule__CreateClass__Group_2_1_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4274:1: rule__CreateClass__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__CreateClass__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4278:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4279:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4279:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4280:1: ','
            {
             before(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__CreateClass__Group_2_1_1__0__Impl8596); 
             after(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2_1_1__0__Impl


    // $ANTLR start rule__CreateClass__Group_2_1_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4293:1: rule__CreateClass__Group_2_1_1__1 : rule__CreateClass__Group_2_1_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4297:1: ( rule__CreateClass__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4298:2: rule__CreateClass__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__18627);
            rule__CreateClass__Group_2_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2_1_1__1


    // $ANTLR start rule__CreateClass__Group_2_1_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4304:1: rule__CreateClass__Group_2_1_1__1__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__CreateClass__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4308:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4309:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4309:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4310:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4311:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4311:2: rule__CreateClass__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl8654);
            rule__CreateClass__SettersAssignment_2_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__Group_2_1_1__1__Impl


    // $ANTLR start rule__ListLiteral__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4325:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4329:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4330:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__08688);
            rule__ListLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__08691);
            rule__ListLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group__0


    // $ANTLR start rule__ListLiteral__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4337:1: rule__ListLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4341:1: ( ( '[' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4342:1: ( '[' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4342:1: ( '[' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4343:1: '['
            {
             before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ListLiteral__Group__0__Impl8719); 
             after(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group__0__Impl


    // $ANTLR start rule__ListLiteral__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4356:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4360:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4361:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__18750);
            rule__ListLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__18753);
            rule__ListLiteral__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group__1


    // $ANTLR start rule__ListLiteral__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4368:1: rule__ListLiteral__Group__1__Impl : ( ( rule__ListLiteral__Group_1__0 )? ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4372:1: ( ( ( rule__ListLiteral__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4373:1: ( ( rule__ListLiteral__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4373:1: ( ( rule__ListLiteral__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4374:1: ( rule__ListLiteral__Group_1__0 )?
            {
             before(grammarAccess.getListLiteralAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4375:1: ( rule__ListLiteral__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||(LA28_0>=RULE_INT && LA28_0<=RULE_FLOAT)||LA28_0==15||LA28_0==25||(LA28_0>=28 && LA28_0<=30)||LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4375:2: rule__ListLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ListLiteral__Group_1__0_in_rule__ListLiteral__Group__1__Impl8780);
                    rule__ListLiteral__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListLiteralAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group__1__Impl


    // $ANTLR start rule__ListLiteral__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4385:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4389:1: ( rule__ListLiteral__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4390:2: rule__ListLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__28811);
            rule__ListLiteral__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group__2


    // $ANTLR start rule__ListLiteral__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4396:1: rule__ListLiteral__Group__2__Impl : ( ']' ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4400:1: ( ( ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4401:1: ( ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4401:1: ( ']' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4402:1: ']'
            {
             before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__ListLiteral__Group__2__Impl8839); 
             after(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group__2__Impl


    // $ANTLR start rule__ListLiteral__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4421:1: rule__ListLiteral__Group_1__0 : rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1 ;
    public final void rule__ListLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4425:1: ( rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4426:2: rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1__0__Impl_in_rule__ListLiteral__Group_1__08876);
            rule__ListLiteral__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_1__1_in_rule__ListLiteral__Group_1__08879);
            rule__ListLiteral__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group_1__0


    // $ANTLR start rule__ListLiteral__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4433:1: rule__ListLiteral__Group_1__0__Impl : ( ( rule__ListLiteral__ItemsAssignment_1_0 ) ) ;
    public final void rule__ListLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4437:1: ( ( ( rule__ListLiteral__ItemsAssignment_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4438:1: ( ( rule__ListLiteral__ItemsAssignment_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4438:1: ( ( rule__ListLiteral__ItemsAssignment_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4439:1: ( rule__ListLiteral__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4440:1: ( rule__ListLiteral__ItemsAssignment_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4440:2: rule__ListLiteral__ItemsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_1_0_in_rule__ListLiteral__Group_1__0__Impl8906);
            rule__ListLiteral__ItemsAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getItemsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group_1__0__Impl


    // $ANTLR start rule__ListLiteral__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4450:1: rule__ListLiteral__Group_1__1 : rule__ListLiteral__Group_1__1__Impl ;
    public final void rule__ListLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4454:1: ( rule__ListLiteral__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4455:2: rule__ListLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1__1__Impl_in_rule__ListLiteral__Group_1__18936);
            rule__ListLiteral__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group_1__1


    // $ANTLR start rule__ListLiteral__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4461:1: rule__ListLiteral__Group_1__1__Impl : ( ( rule__ListLiteral__Group_1_1__0 )* ) ;
    public final void rule__ListLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4465:1: ( ( ( rule__ListLiteral__Group_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4466:1: ( ( rule__ListLiteral__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4466:1: ( ( rule__ListLiteral__Group_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4467:1: ( rule__ListLiteral__Group_1_1__0 )*
            {
             before(grammarAccess.getListLiteralAccess().getGroup_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4468:1: ( rule__ListLiteral__Group_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4468:2: rule__ListLiteral__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__0_in_rule__ListLiteral__Group_1__1__Impl8963);
            	    rule__ListLiteral__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getListLiteralAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group_1__1__Impl


    // $ANTLR start rule__ListLiteral__Group_1_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4482:1: rule__ListLiteral__Group_1_1__0 : rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1 ;
    public final void rule__ListLiteral__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4486:1: ( rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4487:2: rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__0__Impl_in_rule__ListLiteral__Group_1_1__08998);
            rule__ListLiteral__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__1_in_rule__ListLiteral__Group_1_1__09001);
            rule__ListLiteral__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group_1_1__0


    // $ANTLR start rule__ListLiteral__Group_1_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4494:1: rule__ListLiteral__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ListLiteral__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4498:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4499:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4499:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4500:1: ','
            {
             before(grammarAccess.getListLiteralAccess().getCommaKeyword_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__ListLiteral__Group_1_1__0__Impl9029); 
             after(grammarAccess.getListLiteralAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group_1_1__0__Impl


    // $ANTLR start rule__ListLiteral__Group_1_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4513:1: rule__ListLiteral__Group_1_1__1 : rule__ListLiteral__Group_1_1__1__Impl ;
    public final void rule__ListLiteral__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4517:1: ( rule__ListLiteral__Group_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4518:2: rule__ListLiteral__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__1__Impl_in_rule__ListLiteral__Group_1_1__19060);
            rule__ListLiteral__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group_1_1__1


    // $ANTLR start rule__ListLiteral__Group_1_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4524:1: rule__ListLiteral__Group_1_1__1__Impl : ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) ) ;
    public final void rule__ListLiteral__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4528:1: ( ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4529:1: ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4529:1: ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4530:1: ( rule__ListLiteral__ItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4531:1: ( rule__ListLiteral__ItemsAssignment_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4531:2: rule__ListLiteral__ItemsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_1_1_1_in_rule__ListLiteral__Group_1_1__1__Impl9087);
            rule__ListLiteral__ItemsAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getItemsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group_1_1__1__Impl


    // $ANTLR start rule__VarRefLiteral__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4545:1: rule__VarRefLiteral__Group__0 : rule__VarRefLiteral__Group__0__Impl rule__VarRefLiteral__Group__1 ;
    public final void rule__VarRefLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4549:1: ( rule__VarRefLiteral__Group__0__Impl rule__VarRefLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4550:2: rule__VarRefLiteral__Group__0__Impl rule__VarRefLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__VarRefLiteral__Group__0__Impl_in_rule__VarRefLiteral__Group__09121);
            rule__VarRefLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarRefLiteral__Group__1_in_rule__VarRefLiteral__Group__09124);
            rule__VarRefLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarRefLiteral__Group__0


    // $ANTLR start rule__VarRefLiteral__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4557:1: rule__VarRefLiteral__Group__0__Impl : ( '$' ) ;
    public final void rule__VarRefLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4561:1: ( ( '$' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4562:1: ( '$' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4562:1: ( '$' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4563:1: '$'
            {
             before(grammarAccess.getVarRefLiteralAccess().getDollarSignKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__VarRefLiteral__Group__0__Impl9152); 
             after(grammarAccess.getVarRefLiteralAccess().getDollarSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarRefLiteral__Group__0__Impl


    // $ANTLR start rule__VarRefLiteral__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4576:1: rule__VarRefLiteral__Group__1 : rule__VarRefLiteral__Group__1__Impl ;
    public final void rule__VarRefLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4580:1: ( rule__VarRefLiteral__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4581:2: rule__VarRefLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarRefLiteral__Group__1__Impl_in_rule__VarRefLiteral__Group__19183);
            rule__VarRefLiteral__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarRefLiteral__Group__1


    // $ANTLR start rule__VarRefLiteral__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4587:1: rule__VarRefLiteral__Group__1__Impl : ( ( rule__VarRefLiteral__VarRefAssignment_1 ) ) ;
    public final void rule__VarRefLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4591:1: ( ( ( rule__VarRefLiteral__VarRefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4592:1: ( ( rule__VarRefLiteral__VarRefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4592:1: ( ( rule__VarRefLiteral__VarRefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4593:1: ( rule__VarRefLiteral__VarRefAssignment_1 )
            {
             before(grammarAccess.getVarRefLiteralAccess().getVarRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4594:1: ( rule__VarRefLiteral__VarRefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4594:2: rule__VarRefLiteral__VarRefAssignment_1
            {
            pushFollow(FOLLOW_rule__VarRefLiteral__VarRefAssignment_1_in_rule__VarRefLiteral__Group__1__Impl9210);
            rule__VarRefLiteral__VarRefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVarRefLiteralAccess().getVarRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarRefLiteral__Group__1__Impl


    // $ANTLR start rule__Setter__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4608:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4612:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4613:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
            {
            pushFollow(FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__09244);
            rule__Setter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__09247);
            rule__Setter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Group__0


    // $ANTLR start rule__Setter__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4620:1: rule__Setter__Group__0__Impl : ( ( rule__Setter__PropertyAssignment_0 ) ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4624:1: ( ( ( rule__Setter__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4625:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4625:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4626:1: ( rule__Setter__PropertyAssignment_0 )
            {
             before(grammarAccess.getSetterAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4627:1: ( rule__Setter__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4627:2: rule__Setter__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl9274);
            rule__Setter__PropertyAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSetterAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Group__0__Impl


    // $ANTLR start rule__Setter__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4637:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4641:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4642:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
            {
            pushFollow(FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__19304);
            rule__Setter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__19307);
            rule__Setter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Group__1


    // $ANTLR start rule__Setter__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4649:1: rule__Setter__Group__1__Impl : ( ( rule__Setter__Alternatives_1 ) ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4653:1: ( ( ( rule__Setter__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4654:1: ( ( rule__Setter__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4654:1: ( ( rule__Setter__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4655:1: ( rule__Setter__Alternatives_1 )
            {
             before(grammarAccess.getSetterAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4656:1: ( rule__Setter__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4656:2: rule__Setter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl9334);
            rule__Setter__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getSetterAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Group__1__Impl


    // $ANTLR start rule__Setter__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4666:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4670:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4671:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
            {
            pushFollow(FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__29364);
            rule__Setter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__29367);
            rule__Setter__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Group__2


    // $ANTLR start rule__Setter__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4678:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__ExpressionAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4682:1: ( ( ( rule__Setter__ExpressionAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4683:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4683:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4684:1: ( rule__Setter__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getExpressionAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4685:1: ( rule__Setter__ExpressionAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4685:2: rule__Setter__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl9394);
            rule__Setter__ExpressionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSetterAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Group__2__Impl


    // $ANTLR start rule__Setter__Group__3
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4695:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4699:1: ( rule__Setter__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4700:2: rule__Setter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__39424);
            rule__Setter__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Group__3


    // $ANTLR start rule__Setter__Group__3__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4706:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__GuardAssignment_3 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4710:1: ( ( ( rule__Setter__GuardAssignment_3 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4711:1: ( ( rule__Setter__GuardAssignment_3 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4711:1: ( ( rule__Setter__GuardAssignment_3 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4712:1: ( rule__Setter__GuardAssignment_3 )?
            {
             before(grammarAccess.getSetterAccess().getGuardAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4713:1: ( rule__Setter__GuardAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4713:2: rule__Setter__GuardAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl9451);
                    rule__Setter__GuardAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetterAccess().getGuardAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__Group__3__Impl


    // $ANTLR start rule__Function__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4731:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4735:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4736:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__09490);
            rule__Function__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__09493);
            rule__Function__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__0


    // $ANTLR start rule__Function__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4743:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4747:1: ( ( 'function' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4748:1: ( 'function' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4748:1: ( 'function' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4749:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Function__Group__0__Impl9521); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__0__Impl


    // $ANTLR start rule__Function__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4762:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4766:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4767:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__19552);
            rule__Function__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__19555);
            rule__Function__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__1


    // $ANTLR start rule__Function__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4774:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4778:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4779:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4779:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4780:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4781:1: ( rule__Function__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4781:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl9582);
            rule__Function__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__1__Impl


    // $ANTLR start rule__Function__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4791:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4795:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4796:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__29612);
            rule__Function__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__29615);
            rule__Function__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__2


    // $ANTLR start rule__Function__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4803:1: rule__Function__Group__2__Impl : ( ( rule__Function__JavaClassAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4807:1: ( ( ( rule__Function__JavaClassAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4808:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4808:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4809:1: ( rule__Function__JavaClassAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4810:1: ( rule__Function__JavaClassAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4810:2: rule__Function__JavaClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl9642);
            rule__Function__JavaClassAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getJavaClassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__2__Impl


    // $ANTLR start rule__Function__Group__3
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4820:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4824:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4825:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__39672);
            rule__Function__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__39675);
            rule__Function__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__3


    // $ANTLR start rule__Function__Group__3__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4832:1: rule__Function__Group__3__Impl : ( '#' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4836:1: ( ( '#' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4837:1: ( '#' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4837:1: ( '#' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4838:1: '#'
            {
             before(grammarAccess.getFunctionAccess().getNumberSignKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Function__Group__3__Impl9703); 
             after(grammarAccess.getFunctionAccess().getNumberSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__3__Impl


    // $ANTLR start rule__Function__Group__4
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4851:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4855:1: ( rule__Function__Group__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4856:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__49734);
            rule__Function__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__4


    // $ANTLR start rule__Function__Group__4__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4862:1: rule__Function__Group__4__Impl : ( ( rule__Function__OperationAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4866:1: ( ( ( rule__Function__OperationAssignment_4 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4867:1: ( ( rule__Function__OperationAssignment_4 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4867:1: ( ( rule__Function__OperationAssignment_4 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4868:1: ( rule__Function__OperationAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getOperationAssignment_4()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4869:1: ( rule__Function__OperationAssignment_4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4869:2: rule__Function__OperationAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__OperationAssignment_4_in_rule__Function__Group__4__Impl9761);
            rule__Function__OperationAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOperationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__Group__4__Impl


    // $ANTLR start rule__UpdateStatement__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4889:1: rule__UpdateStatement__Group__0 : rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 ;
    public final void rule__UpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4893:1: ( rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4894:2: rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__09801);
            rule__UpdateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__09804);
            rule__UpdateStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group__0


    // $ANTLR start rule__UpdateStatement__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4901:1: rule__UpdateStatement__Group__0__Impl : ( 'update' ) ;
    public final void rule__UpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4905:1: ( ( 'update' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4906:1: ( 'update' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4906:1: ( 'update' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4907:1: 'update'
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__UpdateStatement__Group__0__Impl9832); 
             after(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group__0__Impl


    // $ANTLR start rule__UpdateStatement__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4920:1: rule__UpdateStatement__Group__1 : rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 ;
    public final void rule__UpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4924:1: ( rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4925:2: rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__19863);
            rule__UpdateStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__19866);
            rule__UpdateStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group__1


    // $ANTLR start rule__UpdateStatement__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4932:1: rule__UpdateStatement__Group__1__Impl : ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) ;
    public final void rule__UpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4936:1: ( ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4937:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4937:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4938:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4939:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4939:2: rule__UpdateStatement__VarRefAssignment_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl9893);
            rule__UpdateStatement__VarRefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getVarRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group__1__Impl


    // $ANTLR start rule__UpdateStatement__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4949:1: rule__UpdateStatement__Group__2 : rule__UpdateStatement__Group__2__Impl ;
    public final void rule__UpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4953:1: ( rule__UpdateStatement__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4954:2: rule__UpdateStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__29923);
            rule__UpdateStatement__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group__2


    // $ANTLR start rule__UpdateStatement__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4960:1: rule__UpdateStatement__Group__2__Impl : ( ( rule__UpdateStatement__Group_2__0 )? ) ;
    public final void rule__UpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4964:1: ( ( ( rule__UpdateStatement__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4965:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4965:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4966:1: ( rule__UpdateStatement__Group_2__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4967:1: ( rule__UpdateStatement__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4967:2: rule__UpdateStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl9950);
                    rule__UpdateStatement__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group__2__Impl


    // $ANTLR start rule__UpdateStatement__Group_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4983:1: rule__UpdateStatement__Group_2__0 : rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 ;
    public final void rule__UpdateStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4987:1: ( rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4988:2: rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__09987);
            rule__UpdateStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__09990);
            rule__UpdateStatement__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2__0


    // $ANTLR start rule__UpdateStatement__Group_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4995:1: rule__UpdateStatement__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UpdateStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4999:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5000:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5000:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5001:1: '{'
            {
             before(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__UpdateStatement__Group_2__0__Impl10018); 
             after(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2__0__Impl


    // $ANTLR start rule__UpdateStatement__Group_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5014:1: rule__UpdateStatement__Group_2__1 : rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 ;
    public final void rule__UpdateStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5018:1: ( rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5019:2: rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__110049);
            rule__UpdateStatement__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__110052);
            rule__UpdateStatement__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2__1


    // $ANTLR start rule__UpdateStatement__Group_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5026:1: rule__UpdateStatement__Group_2__1__Impl : ( ( rule__UpdateStatement__Group_2_1__0 )? ) ;
    public final void rule__UpdateStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5030:1: ( ( ( rule__UpdateStatement__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5031:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5031:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5032:1: ( rule__UpdateStatement__Group_2_1__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5033:1: ( rule__UpdateStatement__Group_2_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5033:2: rule__UpdateStatement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl10079);
                    rule__UpdateStatement__Group_2_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateStatementAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2__1__Impl


    // $ANTLR start rule__UpdateStatement__Group_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5043:1: rule__UpdateStatement__Group_2__2 : rule__UpdateStatement__Group_2__2__Impl ;
    public final void rule__UpdateStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5047:1: ( rule__UpdateStatement__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5048:2: rule__UpdateStatement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__210110);
            rule__UpdateStatement__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2__2


    // $ANTLR start rule__UpdateStatement__Group_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5054:1: rule__UpdateStatement__Group_2__2__Impl : ( '}' ) ;
    public final void rule__UpdateStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5058:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5059:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5059:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5060:1: '}'
            {
             before(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__UpdateStatement__Group_2__2__Impl10138); 
             after(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2__2__Impl


    // $ANTLR start rule__UpdateStatement__Group_2_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5079:1: rule__UpdateStatement__Group_2_1__0 : rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 ;
    public final void rule__UpdateStatement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5083:1: ( rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5084:2: rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__010175);
            rule__UpdateStatement__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__010178);
            rule__UpdateStatement__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2_1__0


    // $ANTLR start rule__UpdateStatement__Group_2_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5091:1: rule__UpdateStatement__Group_2_1__0__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) ;
    public final void rule__UpdateStatement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5095:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5096:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5096:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5097:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5098:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5098:2: rule__UpdateStatement__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl10205);
            rule__UpdateStatement__SettersAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2_1__0__Impl


    // $ANTLR start rule__UpdateStatement__Group_2_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5108:1: rule__UpdateStatement__Group_2_1__1 : rule__UpdateStatement__Group_2_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5112:1: ( rule__UpdateStatement__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5113:2: rule__UpdateStatement__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__110235);
            rule__UpdateStatement__Group_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2_1__1


    // $ANTLR start rule__UpdateStatement__Group_2_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5119:1: rule__UpdateStatement__Group_2_1__1__Impl : ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) ;
    public final void rule__UpdateStatement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5123:1: ( ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5124:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5124:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5125:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5126:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5126:2: rule__UpdateStatement__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl10262);
            	    rule__UpdateStatement__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getUpdateStatementAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2_1__1__Impl


    // $ANTLR start rule__UpdateStatement__Group_2_1_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5140:1: rule__UpdateStatement__Group_2_1_1__0 : rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 ;
    public final void rule__UpdateStatement__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5144:1: ( rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5145:2: rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__010297);
            rule__UpdateStatement__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__010300);
            rule__UpdateStatement__Group_2_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2_1_1__0


    // $ANTLR start rule__UpdateStatement__Group_2_1_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5152:1: rule__UpdateStatement__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__UpdateStatement__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5156:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5157:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5157:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5158:1: ','
            {
             before(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__UpdateStatement__Group_2_1_1__0__Impl10328); 
             after(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2_1_1__0__Impl


    // $ANTLR start rule__UpdateStatement__Group_2_1_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5171:1: rule__UpdateStatement__Group_2_1_1__1 : rule__UpdateStatement__Group_2_1_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5175:1: ( rule__UpdateStatement__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5176:2: rule__UpdateStatement__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__110359);
            rule__UpdateStatement__Group_2_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2_1_1__1


    // $ANTLR start rule__UpdateStatement__Group_2_1_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5182:1: rule__UpdateStatement__Group_2_1_1__1__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__UpdateStatement__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5186:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5187:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5187:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5188:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5189:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5189:2: rule__UpdateStatement__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl10386);
            rule__UpdateStatement__SettersAssignment_2_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__Group_2_1_1__1__Impl


    // $ANTLR start rule__FQN__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5203:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5207:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5208:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__010420);
            rule__FQN__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__010423);
            rule__FQN__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group__0


    // $ANTLR start rule__FQN__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5215:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5219:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5220:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5220:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5221:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl10450); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group__0__Impl


    // $ANTLR start rule__FQN__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5232:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5236:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5237:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__110479);
            rule__FQN__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group__1


    // $ANTLR start rule__FQN__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5243:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5247:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5248:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5248:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5249:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5250:1: ( rule__FQN__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5250:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl10506);
            	    rule__FQN__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group__1__Impl


    // $ANTLR start rule__FQN__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5264:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5268:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5269:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__010541);
            rule__FQN__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__010544);
            rule__FQN__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group_1__0


    // $ANTLR start rule__FQN__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5276:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5280:1: ( ( '.' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5281:1: ( '.' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5281:1: ( '.' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5282:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__FQN__Group_1__0__Impl10572); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group_1__0__Impl


    // $ANTLR start rule__FQN__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5295:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5299:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5300:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__110603);
            rule__FQN__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group_1__1


    // $ANTLR start rule__FQN__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5306:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5310:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5311:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5311:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5312:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl10630); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group_1__1__Impl


    // $ANTLR start rule__Scaffolding__ScaffoldAssignment_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5331:1: rule__Scaffolding__ScaffoldAssignment_0 : ( ruleScaffold ) ;
    public final void rule__Scaffolding__ScaffoldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5335:1: ( ( ruleScaffold ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5336:1: ( ruleScaffold )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5336:1: ( ruleScaffold )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5337:1: ruleScaffold
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldScaffoldParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_010671);
            ruleScaffold();
            _fsp--;

             after(grammarAccess.getScaffoldingAccess().getScaffoldScaffoldParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffolding__ScaffoldAssignment_0


    // $ANTLR start rule__Scaffolding__ElementsAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5346:1: rule__Scaffolding__ElementsAssignment_1 : ( ruleScaffoldingElement ) ;
    public final void rule__Scaffolding__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5350:1: ( ( ruleScaffoldingElement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5351:1: ( ruleScaffoldingElement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5351:1: ( ruleScaffoldingElement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5352:1: ruleScaffoldingElement
            {
             before(grammarAccess.getScaffoldingAccess().getElementsScaffoldingElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_110702);
            ruleScaffoldingElement();
            _fsp--;

             after(grammarAccess.getScaffoldingAccess().getElementsScaffoldingElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffolding__ElementsAssignment_1


    // $ANTLR start rule__Scaffold__RefPackageAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5361:1: rule__Scaffold__RefPackageAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Scaffold__RefPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5365:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5366:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5366:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5367:1: RULE_STRING
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_110733); 
             after(grammarAccess.getScaffoldAccess().getRefPackageSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scaffold__RefPackageAssignment_1


    // $ANTLR start rule__Rule__NameAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5376:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5380:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5381:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5381:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5382:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_110764); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__NameAssignment_1


    // $ANTLR start rule__Rule__WhenAssignment_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5391:1: rule__Rule__WhenAssignment_2 : ( ruleWhenBlock ) ;
    public final void rule__Rule__WhenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5395:1: ( ( ruleWhenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5396:1: ( ruleWhenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5396:1: ( ruleWhenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5397:1: ruleWhenBlock
            {
             before(grammarAccess.getRuleAccess().getWhenWhenBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_210795);
            ruleWhenBlock();
            _fsp--;

             after(grammarAccess.getRuleAccess().getWhenWhenBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__WhenAssignment_2


    // $ANTLR start rule__Rule__ThenAssignment_3
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5406:1: rule__Rule__ThenAssignment_3 : ( ruleThenBlock ) ;
    public final void rule__Rule__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5410:1: ( ( ruleThenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5411:1: ( ruleThenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5411:1: ( ruleThenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5412:1: ruleThenBlock
            {
             before(grammarAccess.getRuleAccess().getThenThenBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_310826);
            ruleThenBlock();
            _fsp--;

             after(grammarAccess.getRuleAccess().getThenThenBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__ThenAssignment_3


    // $ANTLR start rule__WhenBlock__MatchesAssignment_1_0_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5421:1: rule__WhenBlock__MatchesAssignment_1_0_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5425:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5426:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5426:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5427:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_0_110857);
            ruleMatch();
            _fsp--;

             after(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__MatchesAssignment_1_0_1


    // $ANTLR start rule__WhenBlock__MatchesAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5436:1: rule__WhenBlock__MatchesAssignment_1_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5440:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5441:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5441:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5442:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_110888);
            ruleMatch();
            _fsp--;

             after(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__MatchesAssignment_1_1


    // $ANTLR start rule__Match__VarAssignment_0_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5451:1: rule__Match__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__Match__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5455:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5456:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5456:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5457:1: ruleVariable
            {
             before(grammarAccess.getMatchAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_010919);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getMatchAccess().getVarVariableParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__VarAssignment_0_0


    // $ANTLR start rule__Match__TypeAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5466:1: rule__Match__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Match__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5470:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5471:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5471:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5472:1: ( RULE_ID )
            {
             before(grammarAccess.getMatchAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5473:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5474:1: RULE_ID
            {
             before(grammarAccess.getMatchAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_110954); 
             after(grammarAccess.getMatchAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMatchAccess().getTypeEClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__TypeAssignment_1


    // $ANTLR start rule__Match__ParamsAssignment_2_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5485:1: rule__Match__ParamsAssignment_2_1_0 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5489:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5490:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5490:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5491:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_010989);
            ruleParam();
            _fsp--;

             after(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__ParamsAssignment_2_1_0


    // $ANTLR start rule__Match__ParamsAssignment_2_1_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5500:1: rule__Match__ParamsAssignment_2_1_1_1 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5504:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5505:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5505:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5506:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_111020);
            ruleParam();
            _fsp--;

             after(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Match__ParamsAssignment_2_1_1_1


    // $ANTLR start rule__Variable__NameAssignment
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5515:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5519:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5520:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5520:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5521:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment11051); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment


    // $ANTLR start rule__Param__PropertyAssignment_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5530:1: rule__Param__PropertyAssignment_0 : ( ruleBindingExpression ) ;
    public final void rule__Param__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5534:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5535:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5535:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5536:1: ruleBindingExpression
            {
             before(grammarAccess.getParamAccess().getPropertyBindingExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__Param__PropertyAssignment_011082);
            ruleBindingExpression();
            _fsp--;

             after(grammarAccess.getParamAccess().getPropertyBindingExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__PropertyAssignment_0


    // $ANTLR start rule__Param__VarAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5545:1: rule__Param__VarAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__Param__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5549:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5550:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5550:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5551:1: ruleVariable
            {
             before(grammarAccess.getParamAccess().getVarVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_111113);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getParamAccess().getVarVariableParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Param__VarAssignment_1_1


    // $ANTLR start rule__BindingExpression__OpAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5560:1: rule__BindingExpression__OpAssignment_1_1 : ( RULE_OPERATOR_LOW_PRIORITY ) ;
    public final void rule__BindingExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5564:1: ( ( RULE_OPERATOR_LOW_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5565:1: ( RULE_OPERATOR_LOW_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5565:1: ( RULE_OPERATOR_LOW_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5566:1: RULE_OPERATOR_LOW_PRIORITY
            {
             before(grammarAccess.getBindingExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__BindingExpression__OpAssignment_1_111144); 
             after(grammarAccess.getBindingExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__OpAssignment_1_1


    // $ANTLR start rule__BindingExpression__RightAssignment_1_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5575:1: rule__BindingExpression__RightAssignment_1_2 : ( ruleBindingExpression ) ;
    public final void rule__BindingExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5579:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5580:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5580:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5581:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingExpressionAccess().getRightBindingExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingExpression__RightAssignment_1_211175);
            ruleBindingExpression();
            _fsp--;

             after(grammarAccess.getBindingExpressionAccess().getRightBindingExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpression__RightAssignment_1_2


    // $ANTLR start rule__BindingExpressionHigh__OpAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5590:1: rule__BindingExpressionHigh__OpAssignment_1_1 : ( RULE_OPERATOR_HIGH_PRIORITY ) ;
    public final void rule__BindingExpressionHigh__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5594:1: ( ( RULE_OPERATOR_HIGH_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5595:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5595:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5596:1: RULE_OPERATOR_HIGH_PRIORITY
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__BindingExpressionHigh__OpAssignment_1_111206); 
             after(grammarAccess.getBindingExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__OpAssignment_1_1


    // $ANTLR start rule__BindingExpressionHigh__RightAssignment_1_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5605:1: rule__BindingExpressionHigh__RightAssignment_1_2 : ( ruleBindingExpressionHigh ) ;
    public final void rule__BindingExpressionHigh__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5609:1: ( ( ruleBindingExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5610:1: ( ruleBindingExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5610:1: ( ruleBindingExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5611:1: ruleBindingExpressionHigh
            {
             before(grammarAccess.getBindingExpressionHighAccess().getRightBindingExpressionHighParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpressionHigh__RightAssignment_1_211237);
            ruleBindingExpressionHigh();
            _fsp--;

             after(grammarAccess.getBindingExpressionHighAccess().getRightBindingExpressionHighParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingExpressionHigh__RightAssignment_1_2


    // $ANTLR start rule__BindingTerminalExpression__ExpAssignment_2_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5620:1: rule__BindingTerminalExpression__ExpAssignment_2_2 : ( ruleBindingTerminalExpression ) ;
    public final void rule__BindingTerminalExpression__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5624:1: ( ( ruleBindingTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5625:1: ( ruleBindingTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5625:1: ( ruleBindingTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5626:1: ruleBindingTerminalExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingTerminalExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_rule__BindingTerminalExpression__ExpAssignment_2_211268);
            ruleBindingTerminalExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingTerminalExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__ExpAssignment_2_2


    // $ANTLR start rule__BindingTerminalExpression__FunctionAssignment_3_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5635:1: rule__BindingTerminalExpression__FunctionAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__BindingTerminalExpression__FunctionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5639:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5640:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5640:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5641:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionCrossReference_3_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5642:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5643:1: RULE_ID
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BindingTerminalExpression__FunctionAssignment_3_111303); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__FunctionAssignment_3_1


    // $ANTLR start rule__BindingTerminalExpression__ExpAssignment_3_2_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5654:1: rule__BindingTerminalExpression__ExpAssignment_3_2_1 : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__ExpAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5658:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5659:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5659:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5660:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingExpressionParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ExpAssignment_3_2_111338);
            ruleBindingExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingExpressionParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__ExpAssignment_3_2_1


    // $ANTLR start rule__Expression__OpAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5669:1: rule__Expression__OpAssignment_1_1 : ( RULE_OPERATOR_LOW_PRIORITY ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5673:1: ( ( RULE_OPERATOR_LOW_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5674:1: ( RULE_OPERATOR_LOW_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5674:1: ( RULE_OPERATOR_LOW_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5675:1: RULE_OPERATOR_LOW_PRIORITY
            {
             before(grammarAccess.getExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__Expression__OpAssignment_1_111369); 
             after(grammarAccess.getExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__OpAssignment_1_1


    // $ANTLR start rule__Expression__RightAssignment_1_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5684:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5688:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5689:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5689:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5690:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_211400);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__RightAssignment_1_2


    // $ANTLR start rule__ExpressionHigh__OpAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5699:1: rule__ExpressionHigh__OpAssignment_1_1 : ( RULE_OPERATOR_HIGH_PRIORITY ) ;
    public final void rule__ExpressionHigh__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5703:1: ( ( RULE_OPERATOR_HIGH_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5704:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5704:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5705:1: RULE_OPERATOR_HIGH_PRIORITY
            {
             before(grammarAccess.getExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__ExpressionHigh__OpAssignment_1_111431); 
             after(grammarAccess.getExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__OpAssignment_1_1


    // $ANTLR start rule__ExpressionHigh__RightAssignment_1_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5714:1: rule__ExpressionHigh__RightAssignment_1_2 : ( ruleExpressionHigh ) ;
    public final void rule__ExpressionHigh__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5718:1: ( ( ruleExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5719:1: ( ruleExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5719:1: ( ruleExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5720:1: ruleExpressionHigh
            {
             before(grammarAccess.getExpressionHighAccess().getRightExpressionHighParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_rule__ExpressionHigh__RightAssignment_1_211462);
            ruleExpressionHigh();
            _fsp--;

             after(grammarAccess.getExpressionHighAccess().getRightExpressionHighParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExpressionHigh__RightAssignment_1_2


    // $ANTLR start rule__TerminalExpression__ExpAssignment_3_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5729:1: rule__TerminalExpression__ExpAssignment_3_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__ExpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5733:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5734:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5734:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5735:1: ruleTerminalExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__TerminalExpression__ExpAssignment_3_211493);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ExpAssignment_3_2


    // $ANTLR start rule__TerminalExpression__FunctionAssignment_4_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5744:1: rule__TerminalExpression__FunctionAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__FunctionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5748:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5749:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5749:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5750:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_4_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5751:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5752:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_4_111528); 
             after(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__FunctionAssignment_4_1


    // $ANTLR start rule__TerminalExpression__ArgumentsAssignment_4_2_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5763:1: rule__TerminalExpression__ArgumentsAssignment_4_2_1_0 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgumentsAssignment_4_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5767:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5768:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5768:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5769:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_2_1_011563);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ArgumentsAssignment_4_2_1_0


    // $ANTLR start rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5778:1: rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5782:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5783:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5783:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5784:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_111594);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1


    // $ANTLR start rule__PrimitiveLiteral__ValueAssignment_3_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5793:1: rule__PrimitiveLiteral__ValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5797:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5798:1: ( RULE_INT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5798:1: ( RULE_INT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5799:1: RULE_INT
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrimitiveLiteral__ValueAssignment_3_111625); 
             after(grammarAccess.getPrimitiveLiteralAccess().getValueINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__ValueAssignment_3_1


    // $ANTLR start rule__PrimitiveLiteral__ValueAssignment_4_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5808:1: rule__PrimitiveLiteral__ValueAssignment_4_1 : ( RULE_BOOLEAN ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5812:1: ( ( RULE_BOOLEAN ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5813:1: ( RULE_BOOLEAN )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5813:1: ( RULE_BOOLEAN )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5814:1: RULE_BOOLEAN
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueBOOLEANTerminalRuleCall_4_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__PrimitiveLiteral__ValueAssignment_4_111656); 
             after(grammarAccess.getPrimitiveLiteralAccess().getValueBOOLEANTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__ValueAssignment_4_1


    // $ANTLR start rule__PrimitiveLiteral__ValueAssignment_5_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5823:1: rule__PrimitiveLiteral__ValueAssignment_5_1 : ( RULE_FLOAT ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5827:1: ( ( RULE_FLOAT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5828:1: ( RULE_FLOAT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5828:1: ( RULE_FLOAT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5829:1: RULE_FLOAT
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueFLOATTerminalRuleCall_5_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__PrimitiveLiteral__ValueAssignment_5_111687); 
             after(grammarAccess.getPrimitiveLiteralAccess().getValueFLOATTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveLiteral__ValueAssignment_5_1


    // $ANTLR start rule__FeatureRefLiteral__RefAssignment
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5838:1: rule__FeatureRefLiteral__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FeatureRefLiteral__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5842:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5843:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5843:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5844:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureRefLiteralAccess().getRefEStructuralFeatureCrossReference_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5845:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5846:1: RULE_ID
            {
             before(grammarAccess.getFeatureRefLiteralAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureRefLiteral__RefAssignment11722); 
             after(grammarAccess.getFeatureRefLiteralAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getFeatureRefLiteralAccess().getRefEStructuralFeatureCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureRefLiteral__RefAssignment


    // $ANTLR start rule__ThenBlock__StatementsAssignment_1_0_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5857:1: rule__ThenBlock__StatementsAssignment_1_0_1 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5861:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5862:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5862:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5863:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_0_111757);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__StatementsAssignment_1_0_1


    // $ANTLR start rule__ThenBlock__StatementsAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5872:1: rule__ThenBlock__StatementsAssignment_1_1 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5876:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5877:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5877:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5878:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_111788);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__StatementsAssignment_1_1


    // $ANTLR start rule__CreateStatement__VarAssignment_0_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5887:1: rule__CreateStatement__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__CreateStatement__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5891:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5892:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5892:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5893:1: ruleVariable
            {
             before(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_011819);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__VarAssignment_0_0


    // $ANTLR start rule__CreateStatement__ExpressionAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5902:1: rule__CreateStatement__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__CreateStatement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5906:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5907:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5907:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5908:1: ruleExpression
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_111850);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateStatement__ExpressionAssignment_1


    // $ANTLR start rule__CreateClass__TypeAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5917:1: rule__CreateClass__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CreateClass__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5921:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5922:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5922:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5923:1: ( RULE_ID )
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5924:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5925:1: RULE_ID
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_111885); 
             after(grammarAccess.getCreateClassAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__TypeAssignment_1


    // $ANTLR start rule__CreateClass__SettersAssignment_2_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5936:1: rule__CreateClass__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5940:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5941:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5941:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5942:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_011920);
            ruleSetter();
            _fsp--;

             after(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__SettersAssignment_2_1_0


    // $ANTLR start rule__CreateClass__SettersAssignment_2_1_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5951:1: rule__CreateClass__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5955:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5956:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5956:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5957:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_111951);
            ruleSetter();
            _fsp--;

             after(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CreateClass__SettersAssignment_2_1_1_1


    // $ANTLR start rule__StringLiteral__ValueAssignment
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5966:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5970:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5971:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5971:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5972:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11982); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringLiteral__ValueAssignment


    // $ANTLR start rule__ListLiteral__ItemsAssignment_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5981:1: rule__ListLiteral__ItemsAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5985:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5986:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5986:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5987:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_012013);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__ItemsAssignment_1_0


    // $ANTLR start rule__ListLiteral__ItemsAssignment_1_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5996:1: rule__ListLiteral__ItemsAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6000:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6001:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6001:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6002:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_1_112044);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__ItemsAssignment_1_1_1


    // $ANTLR start rule__VarRefLiteral__VarRefAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6011:1: rule__VarRefLiteral__VarRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarRefLiteral__VarRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6015:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6016:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6016:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6017:1: ( RULE_ID )
            {
             before(grammarAccess.getVarRefLiteralAccess().getVarRefVariableCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6018:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6019:1: RULE_ID
            {
             before(grammarAccess.getVarRefLiteralAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarRefLiteral__VarRefAssignment_112079); 
             after(grammarAccess.getVarRefLiteralAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVarRefLiteralAccess().getVarRefVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarRefLiteral__VarRefAssignment_1


    // $ANTLR start rule__Setter__PropertyAssignment_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6030:1: rule__Setter__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Setter__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6034:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6035:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6035:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6036:1: ( RULE_ID )
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6037:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6038:1: RULE_ID
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_012118); 
             after(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__PropertyAssignment_0


    // $ANTLR start rule__Setter__ExpressionAssignment_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6049:1: rule__Setter__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Setter__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6053:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6054:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6054:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6055:1: ruleExpression
            {
             before(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_212153);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__ExpressionAssignment_2


    // $ANTLR start rule__Setter__GuardAssignment_3
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6064:1: rule__Setter__GuardAssignment_3 : ( ( 'guard' ) ) ;
    public final void rule__Setter__GuardAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6068:1: ( ( ( 'guard' ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6069:1: ( ( 'guard' ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6069:1: ( ( 'guard' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6070:1: ( 'guard' )
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6071:1: ( 'guard' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6072:1: 'guard'
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Setter__GuardAssignment_312189); 
             after(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 

            }

             after(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Setter__GuardAssignment_3


    // $ANTLR start rule__Function__NameAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6087:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6091:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6092:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6092:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6093:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_112228); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__NameAssignment_1


    // $ANTLR start rule__Function__JavaClassAssignment_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6102:1: rule__Function__JavaClassAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Function__JavaClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6106:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6107:1: ( ( ruleFQN ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6107:1: ( ( ruleFQN ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6108:1: ( ruleFQN )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeCrossReference_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6109:1: ( ruleFQN )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6110:1: ruleFQN
            {
             before(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Function__JavaClassAssignment_212263);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__JavaClassAssignment_2


    // $ANTLR start rule__Function__OperationAssignment_4
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6121:1: rule__Function__OperationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Function__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6125:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6126:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6126:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6127:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getOperationJvmOperationCrossReference_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6128:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6129:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getOperationJvmOperationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__OperationAssignment_412302); 
             after(grammarAccess.getFunctionAccess().getOperationJvmOperationIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getOperationJvmOperationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Function__OperationAssignment_4


    // $ANTLR start rule__UpdateStatement__VarRefAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6140:1: rule__UpdateStatement__VarRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UpdateStatement__VarRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6144:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6145:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6145:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6146:1: ( RULE_ID )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6147:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6148:1: RULE_ID
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_112341); 
             after(grammarAccess.getUpdateStatementAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__VarRefAssignment_1


    // $ANTLR start rule__UpdateStatement__SettersAssignment_2_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6159:1: rule__UpdateStatement__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6163:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6164:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6164:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6165:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_012376);
            ruleSetter();
            _fsp--;

             after(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__SettersAssignment_2_1_0


    // $ANTLR start rule__UpdateStatement__SettersAssignment_2_1_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6174:1: rule__UpdateStatement__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6178:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6179:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6179:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6180:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_112407);
            ruleSetter();
            _fsp--;

             after(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UpdateStatement__SettersAssignment_2_1_1_1


 

    public static final BitSet FOLLOW_ruleScaffolding_in_entryRuleScaffolding61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffolding68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__0_in_ruleScaffolding94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_entryRuleScaffoldingElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffoldingElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScaffoldingElement__Alternatives_in_ruleScaffoldingElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_entryRuleScaffold181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffold188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__0_in_ruleScaffold214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_entryRuleWhenBlock301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenBlock308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__0_in_ruleWhenBlock334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_entryRuleMatch363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatch370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__0_in_ruleMatch396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_in_ruleVariable456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0_in_ruleParam516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_entryRuleBindingExpression543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingExpression550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__0_in_ruleBindingExpression576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_entryRuleBindingExpressionHigh603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingExpressionHigh610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__0_in_ruleBindingExpressionHigh636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_entryRuleBindingTerminalExpression663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingTerminalExpression670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Alternatives_in_ruleBindingTerminalExpression696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionHigh790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__0_in_ruleExpressionHigh816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteral910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Alternatives_in_rulePrimitiveLiteral936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRefLiteral970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRefLiteral__RefAssignment_in_ruleFeatureRefLiteral996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_entryRuleThenBlock1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenBlock1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0_in_ruleThenBlock1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateStatement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0_in_ruleCreateStatement1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_entryRuleCreateClass1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateClass1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0_in_ruleCreateClass1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleNullLiteral1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRefLiteral1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__Group__0_in_ruleVarRefLiteral1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_entryRuleSetter1505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetter1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0_in_ruleSetter1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0_in_ruleUpdateStatement1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__0_in_rule__WhenBlock__Alternatives_11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_1_1_in_rule__WhenBlock__Alternatives_11823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__0_in_rule__BindingTerminalExpression__Alternatives1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_rule__BindingTerminalExpression__Alternatives1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_2__0_in_rule__BindingTerminalExpression__Alternatives1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__0_in_rule__BindingTerminalExpression__Alternatives1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_rule__BindingTerminalExpression__Alternatives1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_rule__TerminalExpression__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_rule__TerminalExpression__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__PrimitiveLiteral__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__PrimitiveLiteral__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__PrimitiveLiteral__Alternatives2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__0_in_rule__PrimitiveLiteral__Alternatives2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__0_in_rule__PrimitiveLiteral__Alternatives2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__0_in_rule__PrimitiveLiteral__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ThenBlock__Alternatives_02201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ThenBlock__Alternatives_02221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__0_in_rule__ThenBlock__Alternatives_12255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_1_1_in_rule__ThenBlock__Alternatives_12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Setter__Alternatives_12356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Setter__Alternatives_12376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02408 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2495 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Scaffold__Group__0__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group__0__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12715 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22775 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__02900 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__02903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__WhenBlock__Group__0__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__12962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Alternatives_1_in_rule__WhenBlock__Group__1__Impl2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__0__Impl_in_rule__WhenBlock__Group_1_0__03023 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__1_in_rule__WhenBlock__Group_1_0__03026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WhenBlock__Group_1_0__0__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__1__Impl_in_rule__WhenBlock__Group_1_0__13085 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__2_in_rule__WhenBlock__Group_1_0__13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_1_0_1_in_rule__WhenBlock__Group_1_0__1__Impl3115 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__2__Impl_in_rule__WhenBlock__Group_1_0__23146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__WhenBlock__Group_1_0__2__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__03211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Match__Group__1_in_rule__Match__Group__03214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13272 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Match__Group_0__1__Impl3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03519 = new BitSet(new long[]{0x0000000056008730L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Match__Group_2__0__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13581 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Match__Group_2__2__Impl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03707 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3794 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__03829 = new BitSet(new long[]{0x0000000052008730L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__03832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Match__Group_2_1_1__0__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__13891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03952 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__14012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__04074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__04077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Param__Group_1__0__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__14136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__0__Impl_in_rule__BindingExpression__Group__04197 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__1_in_rule__BindingExpression__Group__04200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpression__Group__0__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__1__Impl_in_rule__BindingExpression__Group__14256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__0_in_rule__BindingExpression__Group__1__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__0__Impl_in_rule__BindingExpression__Group_1__04318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__1_in_rule__BindingExpression__Group_1__04321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__1__Impl_in_rule__BindingExpression__Group_1__14379 = new BitSet(new long[]{0x0000000052008730L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__2_in_rule__BindingExpression__Group_1__14382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__OpAssignment_1_1_in_rule__BindingExpression__Group_1__1__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__2__Impl_in_rule__BindingExpression__Group_1__24439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__RightAssignment_1_2_in_rule__BindingExpression__Group_1__2__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__0__Impl_in_rule__BindingExpressionHigh__Group__04502 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__1_in_rule__BindingExpressionHigh__Group__04505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_rule__BindingExpressionHigh__Group__0__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__1__Impl_in_rule__BindingExpressionHigh__Group__14561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__0_in_rule__BindingExpressionHigh__Group__1__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__0__Impl_in_rule__BindingExpressionHigh__Group_1__04623 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__1_in_rule__BindingExpressionHigh__Group_1__04626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__1__Impl_in_rule__BindingExpressionHigh__Group_1__14684 = new BitSet(new long[]{0x0000000052008730L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__2_in_rule__BindingExpressionHigh__Group_1__14687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__OpAssignment_1_1_in_rule__BindingExpressionHigh__Group_1__1__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__2__Impl_in_rule__BindingExpressionHigh__Group_1__24744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__RightAssignment_1_2_in_rule__BindingExpressionHigh__Group_1__2__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__0__Impl_in_rule__BindingTerminalExpression__Group_0__04807 = new BitSet(new long[]{0x0000000052008730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__1_in_rule__BindingTerminalExpression__Group_0__04810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BindingTerminalExpression__Group_0__0__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__1__Impl_in_rule__BindingTerminalExpression__Group_0__14869 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__2_in_rule__BindingTerminalExpression__Group_0__14872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__Group_0__1__Impl4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__2__Impl_in_rule__BindingTerminalExpression__Group_0__24928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BindingTerminalExpression__Group_0__2__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_2__0__Impl_in_rule__BindingTerminalExpression__Group_2__04993 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_2__1_in_rule__BindingTerminalExpression__Group_2__04996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_2__1__Impl_in_rule__BindingTerminalExpression__Group_2__15054 = new BitSet(new long[]{0x0000000052008730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_2__2_in_rule__BindingTerminalExpression__Group_2__15057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BindingTerminalExpression__Group_2__1__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_2__2__Impl_in_rule__BindingTerminalExpression__Group_2__25116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ExpAssignment_2_2_in_rule__BindingTerminalExpression__Group_2__2__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__0__Impl_in_rule__BindingTerminalExpression__Group_3__05179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__1_in_rule__BindingTerminalExpression__Group_3__05182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__1__Impl_in_rule__BindingTerminalExpression__Group_3__15240 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__2_in_rule__BindingTerminalExpression__Group_3__15243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__FunctionAssignment_3_1_in_rule__BindingTerminalExpression__Group_3__1__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__2__Impl_in_rule__BindingTerminalExpression__Group_3__25300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_2__0_in_rule__BindingTerminalExpression__Group_3__2__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_2__0__Impl_in_rule__BindingTerminalExpression__Group_3_2__05363 = new BitSet(new long[]{0x0000000052008730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_2__1_in_rule__BindingTerminalExpression__Group_3_2__05366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BindingTerminalExpression__Group_3_2__0__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_2__1__Impl_in_rule__BindingTerminalExpression__Group_3_2__15425 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_2__2_in_rule__BindingTerminalExpression__Group_3_2__15428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ExpAssignment_3_2_1_in_rule__BindingTerminalExpression__Group_3_2__1__Impl5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_2__2__Impl_in_rule__BindingTerminalExpression__Group_3_2__25485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BindingTerminalExpression__Group_3_2__2__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05550 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_rule__Expression__Group__0__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05671 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15732 = new BitSet(new long[]{0x0000000172008730L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__15735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__25792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__0__Impl_in_rule__ExpressionHigh__Group__05855 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__1_in_rule__ExpressionHigh__Group__05858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__ExpressionHigh__Group__0__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__1__Impl_in_rule__ExpressionHigh__Group__15914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__0_in_rule__ExpressionHigh__Group__1__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__0__Impl_in_rule__ExpressionHigh__Group_1__05976 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__1_in_rule__ExpressionHigh__Group_1__05979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__1__Impl_in_rule__ExpressionHigh__Group_1__16037 = new BitSet(new long[]{0x0000000172008730L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__2_in_rule__ExpressionHigh__Group_1__16040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__OpAssignment_1_1_in_rule__ExpressionHigh__Group_1__1__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__2__Impl_in_rule__ExpressionHigh__Group_1__26097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__RightAssignment_1_2_in_rule__ExpressionHigh__Group_1__2__Impl6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__06160 = new BitSet(new long[]{0x0000000172008730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__06163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TerminalExpression__Group_0__0__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__16222 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__16225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__26281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TerminalExpression__Group_0__2__Impl6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__06346 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__06349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__16407 = new BitSet(new long[]{0x0000000172008730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__2_in_rule__TerminalExpression__Group_3__16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TerminalExpression__Group_3__1__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__2__Impl_in_rule__TerminalExpression__Group_3__26469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ExpAssignment_3_2_in_rule__TerminalExpression__Group_3__2__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__06532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__06535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__16593 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__16596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__FunctionAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__26653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2__0_in_rule__TerminalExpression__Group_4__2__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2__0__Impl_in_rule__TerminalExpression__Group_4_2__06716 = new BitSet(new long[]{0x0000000176008730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2__1_in_rule__TerminalExpression__Group_4_2__06719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TerminalExpression__Group_4_2__0__Impl6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2__1__Impl_in_rule__TerminalExpression__Group_4_2__16778 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2__2_in_rule__TerminalExpression__Group_4_2__16781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2_1__0_in_rule__TerminalExpression__Group_4_2__1__Impl6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2__2__Impl_in_rule__TerminalExpression__Group_4_2__26839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TerminalExpression__Group_4_2__2__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2_1__0__Impl_in_rule__TerminalExpression__Group_4_2_1__06904 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2_1__1_in_rule__TerminalExpression__Group_4_2_1__06907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_2_1_0_in_rule__TerminalExpression__Group_4_2_1__0__Impl6934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2_1__1__Impl_in_rule__TerminalExpression__Group_4_2_1__16964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2_1_1__0_in_rule__TerminalExpression__Group_4_2_1__1__Impl6991 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2_1_1__0__Impl_in_rule__TerminalExpression__Group_4_2_1_1__07026 = new BitSet(new long[]{0x0000000172008730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2_1_1__1_in_rule__TerminalExpression__Group_4_2_1_1__07029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TerminalExpression__Group_4_2_1_1__0__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_2_1_1__1__Impl_in_rule__TerminalExpression__Group_4_2_1_1__17088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_1_in_rule__TerminalExpression__Group_4_2_1_1__1__Impl7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__0__Impl_in_rule__PrimitiveLiteral__Group_3__07149 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__1_in_rule__PrimitiveLiteral__Group_3__07152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__1__Impl_in_rule__PrimitiveLiteral__Group_3__17210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_3_1_in_rule__PrimitiveLiteral__Group_3__1__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__0__Impl_in_rule__PrimitiveLiteral__Group_4__07271 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__1_in_rule__PrimitiveLiteral__Group_4__07274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__1__Impl_in_rule__PrimitiveLiteral__Group_4__17332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_4_1_in_rule__PrimitiveLiteral__Group_4__1__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__0__Impl_in_rule__PrimitiveLiteral__Group_5__07393 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__1_in_rule__PrimitiveLiteral__Group_5__07396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__1__Impl_in_rule__PrimitiveLiteral__Group_5__17454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_5_1_in_rule__PrimitiveLiteral__Group_5__1__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__07515 = new BitSet(new long[]{0x0000000972808730L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__07518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_0_in_rule__ThenBlock__Group__0__Impl7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__17575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl7602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__0__Impl_in_rule__ThenBlock__Group_1_0__07636 = new BitSet(new long[]{0x0000000973008730L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__1_in_rule__ThenBlock__Group_1_0__07639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ThenBlock__Group_1_0__0__Impl7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__1__Impl_in_rule__ThenBlock__Group_1_0__17698 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__2_in_rule__ThenBlock__Group_1_0__17701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_1_0_1_in_rule__ThenBlock__Group_1_0__1__Impl7728 = new BitSet(new long[]{0x0000000972008732L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__2__Impl_in_rule__ThenBlock__Group_1_0__27759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ThenBlock__Group_1_0__2__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__07824 = new BitSet(new long[]{0x0000000172008730L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__07827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__17885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__07946 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__07949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__18006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CreateStatement__Group_0__1__Impl8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__08069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__08072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CreateClass__Group__0__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__18131 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__18134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__28191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__08255 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__08258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CreateClass__Group_2__0__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__18317 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__18320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__28378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CreateClass__Group_2__2__Impl8406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__08443 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__08446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__18503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl8530 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__08565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__08568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CreateClass__Group_2_1_1__0__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__18627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__08688 = new BitSet(new long[]{0x00000001F2008730L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__08691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ListLiteral__Group__0__Impl8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__18750 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__18753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__0_in_rule__ListLiteral__Group__1__Impl8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__28811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ListLiteral__Group__2__Impl8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__0__Impl_in_rule__ListLiteral__Group_1__08876 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__1_in_rule__ListLiteral__Group_1__08879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_1_0_in_rule__ListLiteral__Group_1__0__Impl8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__1__Impl_in_rule__ListLiteral__Group_1__18936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__0_in_rule__ListLiteral__Group_1__1__Impl8963 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__0__Impl_in_rule__ListLiteral__Group_1_1__08998 = new BitSet(new long[]{0x0000000172008730L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__1_in_rule__ListLiteral__Group_1_1__09001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ListLiteral__Group_1_1__0__Impl9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__1__Impl_in_rule__ListLiteral__Group_1_1__19060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_1_1_1_in_rule__ListLiteral__Group_1_1__1__Impl9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__Group__0__Impl_in_rule__VarRefLiteral__Group__09121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__Group__1_in_rule__VarRefLiteral__Group__09124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VarRefLiteral__Group__0__Impl9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__Group__1__Impl_in_rule__VarRefLiteral__Group__19183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__VarRefAssignment_1_in_rule__VarRefLiteral__Group__1__Impl9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__09244 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__09247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__19304 = new BitSet(new long[]{0x0000000172008730L});
    public static final BitSet FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__19307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__29364 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__29367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__39424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__09490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__09493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Function__Group__0__Impl9521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__19552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl9582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__29612 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__29615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl9642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__39672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__39675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Function__Group__3__Impl9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__49734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OperationAssignment_4_in_rule__Function__Group__4__Impl9761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__09801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__09804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UpdateStatement__Group__0__Impl9832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__19863 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__19866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl9893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__29923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__09987 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__09990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UpdateStatement__Group_2__0__Impl10018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__110049 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__110052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl10079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__210110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UpdateStatement__Group_2__2__Impl10138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__010175 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__010178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__110235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl10262 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__010297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__010300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UpdateStatement__Group_2_1_1__0__Impl10328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__110359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl10386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__010420 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__010423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl10450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__110479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl10506 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__010541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__010544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FQN__Group_1__0__Impl10572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__110603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_010671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_110702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_110733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_110764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_210795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_310826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_0_110857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_110888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_010919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_110954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_010989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_111020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment11051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__Param__PropertyAssignment_011082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_111113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__BindingExpression__OpAssignment_1_111144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingExpression__RightAssignment_1_211175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__BindingExpressionHigh__OpAssignment_1_111206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpressionHigh__RightAssignment_1_211237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_rule__BindingTerminalExpression__ExpAssignment_2_211268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BindingTerminalExpression__FunctionAssignment_3_111303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ExpAssignment_3_2_111338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__Expression__OpAssignment_1_111369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_211400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__ExpressionHigh__OpAssignment_1_111431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_rule__ExpressionHigh__RightAssignment_1_211462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__TerminalExpression__ExpAssignment_3_211493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_4_111528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_2_1_011563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_2_1_1_111594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrimitiveLiteral__ValueAssignment_3_111625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__PrimitiveLiteral__ValueAssignment_4_111656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__PrimitiveLiteral__ValueAssignment_5_111687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureRefLiteral__RefAssignment11722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_0_111757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_111788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_011819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_111850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_111885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_011920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_111951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_012013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_1_112044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarRefLiteral__VarRefAssignment_112079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_012118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_212153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Setter__GuardAssignment_312189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_112228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Function__JavaClassAssignment_212263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__OperationAssignment_412302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_112341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_012376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_112407 = new BitSet(new long[]{0x0000000000000002L});

}