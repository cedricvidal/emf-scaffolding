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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_OPERATOR_LOW_PRIORITY", "RULE_OPERATOR_HIGH_PRIORITY", "RULE_INT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'then'", "'->'", "':'", "'+='", "'scaffold'", "'rule'", "'when'", "'{'", "'}'", "'('", "')'", "','", "'!'", "';'", "'new'", "'null'", "'['", "']'", "'function'", "'#'", "'update'", "'.'", "'guard'"
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


    // $ANTLR start entryRuleSymbolRef
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:455:1: entryRuleSymbolRef : ruleSymbolRef EOF ;
    public final void entryRuleSymbolRef() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:456:1: ( ruleSymbolRef EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:457:1: ruleSymbolRef EOF
            {
             before(grammarAccess.getSymbolRefRule()); 
            pushFollow(FOLLOW_ruleSymbolRef_in_entryRuleSymbolRef903);
            ruleSymbolRef();
            _fsp--;

             after(grammarAccess.getSymbolRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolRef910); 

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
    // $ANTLR end entryRuleSymbolRef


    // $ANTLR start ruleSymbolRef
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:464:1: ruleSymbolRef : ( ( rule__SymbolRef__Group__0 ) ) ;
    public final void ruleSymbolRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:468:2: ( ( ( rule__SymbolRef__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:469:1: ( ( rule__SymbolRef__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:469:1: ( ( rule__SymbolRef__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:470:1: ( rule__SymbolRef__Group__0 )
            {
             before(grammarAccess.getSymbolRefAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:471:1: ( rule__SymbolRef__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:471:2: rule__SymbolRef__Group__0
            {
            pushFollow(FOLLOW_rule__SymbolRef__Group__0_in_ruleSymbolRef936);
            rule__SymbolRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSymbolRefAccess().getGroup()); 

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
    // $ANTLR end ruleSymbolRef


    // $ANTLR start entryRulePrimitiveLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:483:1: entryRulePrimitiveLiteral : rulePrimitiveLiteral EOF ;
    public final void entryRulePrimitiveLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:484:1: ( rulePrimitiveLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:485:1: rulePrimitiveLiteral EOF
            {
             before(grammarAccess.getPrimitiveLiteralRule()); 
            pushFollow(FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral963);
            rulePrimitiveLiteral();
            _fsp--;

             after(grammarAccess.getPrimitiveLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveLiteral970); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:492:1: rulePrimitiveLiteral : ( ( rule__PrimitiveLiteral__Alternatives ) ) ;
    public final void rulePrimitiveLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:496:2: ( ( ( rule__PrimitiveLiteral__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:497:1: ( ( rule__PrimitiveLiteral__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:497:1: ( ( rule__PrimitiveLiteral__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:498:1: ( rule__PrimitiveLiteral__Alternatives )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:499:1: ( rule__PrimitiveLiteral__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:499:2: rule__PrimitiveLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Alternatives_in_rulePrimitiveLiteral996);
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


    // $ANTLR start entryRuleFeatureRef
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:511:1: entryRuleFeatureRef : ruleFeatureRef EOF ;
    public final void entryRuleFeatureRef() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:512:1: ( ruleFeatureRef EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:513:1: ruleFeatureRef EOF
            {
             before(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef1023);
            ruleFeatureRef();
            _fsp--;

             after(grammarAccess.getFeatureRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef1030); 

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
    // $ANTLR end entryRuleFeatureRef


    // $ANTLR start ruleFeatureRef
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:520:1: ruleFeatureRef : ( ( rule__FeatureRef__FeatureAssignment ) ) ;
    public final void ruleFeatureRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:524:2: ( ( ( rule__FeatureRef__FeatureAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:525:1: ( ( rule__FeatureRef__FeatureAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:525:1: ( ( rule__FeatureRef__FeatureAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:526:1: ( rule__FeatureRef__FeatureAssignment )
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:527:1: ( rule__FeatureRef__FeatureAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:527:2: rule__FeatureRef__FeatureAssignment
            {
            pushFollow(FOLLOW_rule__FeatureRef__FeatureAssignment_in_ruleFeatureRef1056);
            rule__FeatureRef__FeatureAssignment();
            _fsp--;


            }

             after(grammarAccess.getFeatureRefAccess().getFeatureAssignment()); 

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
    // $ANTLR end ruleFeatureRef


    // $ANTLR start entryRuleThenBlock
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:539:1: entryRuleThenBlock : ruleThenBlock EOF ;
    public final void entryRuleThenBlock() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:540:1: ( ruleThenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:541:1: ruleThenBlock EOF
            {
             before(grammarAccess.getThenBlockRule()); 
            pushFollow(FOLLOW_ruleThenBlock_in_entryRuleThenBlock1083);
            ruleThenBlock();
            _fsp--;

             after(grammarAccess.getThenBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenBlock1090); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:548:1: ruleThenBlock : ( ( rule__ThenBlock__Group__0 ) ) ;
    public final void ruleThenBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:552:2: ( ( ( rule__ThenBlock__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:553:1: ( ( rule__ThenBlock__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:553:1: ( ( rule__ThenBlock__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:554:1: ( rule__ThenBlock__Group__0 )
            {
             before(grammarAccess.getThenBlockAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:555:1: ( rule__ThenBlock__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:555:2: rule__ThenBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0_in_ruleThenBlock1116);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:567:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:568:1: ( ruleStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:569:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1143);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1150); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:576:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:580:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:581:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:581:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:582:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:583:1: ( rule__Statement__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:583:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement1176);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:595:1: entryRuleCreateStatement : ruleCreateStatement EOF ;
    public final void entryRuleCreateStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:596:1: ( ruleCreateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:597:1: ruleCreateStatement EOF
            {
             before(grammarAccess.getCreateStatementRule()); 
            pushFollow(FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement1203);
            ruleCreateStatement();
            _fsp--;

             after(grammarAccess.getCreateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateStatement1210); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:604:1: ruleCreateStatement : ( ( rule__CreateStatement__Group__0 ) ) ;
    public final void ruleCreateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:608:2: ( ( ( rule__CreateStatement__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:609:1: ( ( rule__CreateStatement__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:609:1: ( ( rule__CreateStatement__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:610:1: ( rule__CreateStatement__Group__0 )
            {
             before(grammarAccess.getCreateStatementAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:611:1: ( rule__CreateStatement__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:611:2: rule__CreateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0_in_ruleCreateStatement1236);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:623:1: entryRuleCreateClass : ruleCreateClass EOF ;
    public final void entryRuleCreateClass() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:624:1: ( ruleCreateClass EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:625:1: ruleCreateClass EOF
            {
             before(grammarAccess.getCreateClassRule()); 
            pushFollow(FOLLOW_ruleCreateClass_in_entryRuleCreateClass1263);
            ruleCreateClass();
            _fsp--;

             after(grammarAccess.getCreateClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateClass1270); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:632:1: ruleCreateClass : ( ( rule__CreateClass__Group__0 ) ) ;
    public final void ruleCreateClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:636:2: ( ( ( rule__CreateClass__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:637:1: ( ( rule__CreateClass__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:637:1: ( ( rule__CreateClass__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:638:1: ( rule__CreateClass__Group__0 )
            {
             before(grammarAccess.getCreateClassAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:639:1: ( rule__CreateClass__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:639:2: rule__CreateClass__Group__0
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0_in_ruleCreateClass1296);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:651:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:652:1: ( ruleStringLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:653:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1323);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1330); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:660:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:664:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:665:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:665:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:666:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:667:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:667:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1356);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:679:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:680:1: ( ruleNullLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:681:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1383);
            ruleNullLiteral();
            _fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1390); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:688:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:692:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:693:1: ( ( rule__NullLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:693:1: ( ( rule__NullLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:694:1: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:695:1: ( rule__NullLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:695:2: rule__NullLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1416);
            rule__NullLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNullLiteralAccess().getGroup()); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:707:1: entryRuleListLiteral : ruleListLiteral EOF ;
    public final void entryRuleListLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:708:1: ( ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:709:1: ruleListLiteral EOF
            {
             before(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral1443);
            ruleListLiteral();
            _fsp--;

             after(grammarAccess.getListLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral1450); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:716:1: ruleListLiteral : ( ( rule__ListLiteral__Group__0 ) ) ;
    public final void ruleListLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:720:2: ( ( ( rule__ListLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:721:1: ( ( rule__ListLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:721:1: ( ( rule__ListLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:722:1: ( rule__ListLiteral__Group__0 )
            {
             before(grammarAccess.getListLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:1: ( rule__ListLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:2: rule__ListLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1476);
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


    // $ANTLR start entryRuleSetter
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:735:1: entryRuleSetter : ruleSetter EOF ;
    public final void entryRuleSetter() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:736:1: ( ruleSetter EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:737:1: ruleSetter EOF
            {
             before(grammarAccess.getSetterRule()); 
            pushFollow(FOLLOW_ruleSetter_in_entryRuleSetter1503);
            ruleSetter();
            _fsp--;

             after(grammarAccess.getSetterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetter1510); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:744:1: ruleSetter : ( ( rule__Setter__Group__0 ) ) ;
    public final void ruleSetter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:748:2: ( ( ( rule__Setter__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:749:1: ( ( rule__Setter__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:749:1: ( ( rule__Setter__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:750:1: ( rule__Setter__Group__0 )
            {
             before(grammarAccess.getSetterAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:751:1: ( rule__Setter__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:751:2: rule__Setter__Group__0
            {
            pushFollow(FOLLOW_rule__Setter__Group__0_in_ruleSetter1536);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:763:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:764:1: ( ruleFunction EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:765:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1563);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1570); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:772:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:776:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:777:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:777:1: ( ( rule__Function__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:778:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:779:1: ( rule__Function__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:779:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction1596);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:791:1: entryRuleUpdateStatement : ruleUpdateStatement EOF ;
    public final void entryRuleUpdateStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:792:1: ( ruleUpdateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:793:1: ruleUpdateStatement EOF
            {
             before(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1623);
            ruleUpdateStatement();
            _fsp--;

             after(grammarAccess.getUpdateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1630); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:800:1: ruleUpdateStatement : ( ( rule__UpdateStatement__Group__0 ) ) ;
    public final void ruleUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:804:2: ( ( ( rule__UpdateStatement__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:805:1: ( ( rule__UpdateStatement__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:805:1: ( ( rule__UpdateStatement__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:806:1: ( rule__UpdateStatement__Group__0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:807:1: ( rule__UpdateStatement__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:807:2: rule__UpdateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0_in_ruleUpdateStatement1656);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:819:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:820:1: ( ruleFQN EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:821:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1683);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1690); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:828:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:832:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:833:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:833:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:834:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:835:1: ( rule__FQN__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:835:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1716);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:853:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );
    public final void rule__ScaffoldingElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:857:1: ( ( ruleRule ) | ( ruleFunction ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("853:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:858:1: ( ruleRule )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:858:1: ( ruleRule )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:859:1: ruleRule
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1758);
                    ruleRule();
                    _fsp--;

                     after(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:864:6: ( ruleFunction )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:864:6: ( ruleFunction )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:865:1: ruleFunction
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1775);
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


    // $ANTLR start rule__WhenBlock__Alternatives_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:875:1: rule__WhenBlock__Alternatives_2 : ( ( ( rule__WhenBlock__Group_2_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_2_1 ) ) );
    public final void rule__WhenBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:879:1: ( ( ( rule__WhenBlock__Group_2_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("875:1: rule__WhenBlock__Alternatives_2 : ( ( ( rule__WhenBlock__Group_2_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_2_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:880:1: ( ( rule__WhenBlock__Group_2_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:880:1: ( ( rule__WhenBlock__Group_2_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:881:1: ( rule__WhenBlock__Group_2_0__0 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getGroup_2_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:882:1: ( rule__WhenBlock__Group_2_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:882:2: rule__WhenBlock__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__0_in_rule__WhenBlock__Alternatives_21807);
                    rule__WhenBlock__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getWhenBlockAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:886:6: ( ( rule__WhenBlock__MatchesAssignment_2_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:886:6: ( ( rule__WhenBlock__MatchesAssignment_2_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:887:1: ( rule__WhenBlock__MatchesAssignment_2_1 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_2_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:888:1: ( rule__WhenBlock__MatchesAssignment_2_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:888:2: rule__WhenBlock__MatchesAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_2_1_in_rule__WhenBlock__Alternatives_21825);
                    rule__WhenBlock__MatchesAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getWhenBlockAccess().getMatchesAssignment_2_1()); 

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
    // $ANTLR end rule__WhenBlock__Alternatives_2


    // $ANTLR start rule__BindingTerminalExpression__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:898:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ( rule__BindingTerminalExpression__Group_1__0 ) ) | ( ruleSymbolRef ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );
    public final void rule__BindingTerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:902:1: ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ( rule__BindingTerminalExpression__Group_1__0 ) ) | ( ruleSymbolRef ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==EOF||(LA3_3>=RULE_OPERATOR_LOW_PRIORITY && LA3_3<=RULE_OPERATOR_HIGH_PRIORITY)||LA3_3==17||(LA3_3>=25 && LA3_3<=26)) ) {
                    alt3=3;
                }
                else if ( (LA3_3==24) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("898:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ( rule__BindingTerminalExpression__Group_1__0 ) ) | ( ruleSymbolRef ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 30:
            case 31:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("898:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ( rule__BindingTerminalExpression__Group_1__0 ) ) | ( ruleSymbolRef ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:903:1: ( ( rule__BindingTerminalExpression__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:903:1: ( ( rule__BindingTerminalExpression__Group_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:904:1: ( rule__BindingTerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:905:1: ( rule__BindingTerminalExpression__Group_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:905:2: rule__BindingTerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__0_in_rule__BindingTerminalExpression__Alternatives1859);
                    rule__BindingTerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:909:6: ( ( rule__BindingTerminalExpression__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:909:6: ( ( rule__BindingTerminalExpression__Group_1__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:910:1: ( rule__BindingTerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:911:1: ( rule__BindingTerminalExpression__Group_1__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:911:2: rule__BindingTerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__0_in_rule__BindingTerminalExpression__Alternatives1877);
                    rule__BindingTerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:915:6: ( ruleSymbolRef )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:915:6: ( ruleSymbolRef )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:916:1: ruleSymbolRef
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getSymbolRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSymbolRef_in_rule__BindingTerminalExpression__Alternatives1895);
                    ruleSymbolRef();
                    _fsp--;

                     after(grammarAccess.getBindingTerminalExpressionAccess().getSymbolRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:921:6: ( ( rule__BindingTerminalExpression__Group_3__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:921:6: ( ( rule__BindingTerminalExpression__Group_3__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:922:1: ( rule__BindingTerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:923:1: ( rule__BindingTerminalExpression__Group_3__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:923:2: rule__BindingTerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__0_in_rule__BindingTerminalExpression__Alternatives1912);
                    rule__BindingTerminalExpression__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:927:6: ( rulePrimitiveLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:927:6: ( rulePrimitiveLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:928:1: rulePrimitiveLiteral
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_rule__BindingTerminalExpression__Alternatives1930);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:938:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:942:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==EOF||(LA4_4>=RULE_OPERATOR_LOW_PRIORITY && LA4_4<=RULE_OPERATOR_HIGH_PRIORITY)||LA4_4==20||LA4_4==23||(LA4_4>=25 && LA4_4<=26)||LA4_4==28||(LA4_4>=32 && LA4_4<=33)||LA4_4==37) ) {
                    alt4=4;
                }
                else if ( (LA4_4==24) ) {
                    alt4=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("938:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 30:
            case 31:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("938:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:943:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:943:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:944:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:945:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:945:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1962);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:949:6: ( ruleCreateClass )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:949:6: ( ruleCreateClass )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:950:1: ruleCreateClass
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives1980);
                    ruleCreateClass();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:955:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:955:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:956:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:957:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:957:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1997);
                    rule__TerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:961:6: ( ruleSymbolRef )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:961:6: ( ruleSymbolRef )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:962:1: ruleSymbolRef
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getSymbolRefParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSymbolRef_in_rule__TerminalExpression__Alternatives2015);
                    ruleSymbolRef();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getSymbolRefParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:967:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:967:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:968:1: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:969:1: ( rule__TerminalExpression__Group_4__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:969:2: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives2032);
                    rule__TerminalExpression__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:973:6: ( rulePrimitiveLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:973:6: ( rulePrimitiveLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:974:1: rulePrimitiveLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_rule__TerminalExpression__Alternatives2050);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:984:1: rule__PrimitiveLiteral__Alternatives : ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) );
    public final void rule__PrimitiveLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:988:1: ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 30:
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
                    new NoViableAltException("984:1: rule__PrimitiveLiteral__Alternatives : ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:989:1: ( ruleListLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:989:1: ( ruleListLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:990:1: ruleListLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__PrimitiveLiteral__Alternatives2082);
                    ruleListLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:995:6: ( ruleStringLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:995:6: ( ruleStringLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:996:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__PrimitiveLiteral__Alternatives2099);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1001:6: ( ruleNullLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1001:6: ( ruleNullLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1002:1: ruleNullLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__PrimitiveLiteral__Alternatives2116);
                    ruleNullLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1007:6: ( ( rule__PrimitiveLiteral__Group_3__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1007:6: ( ( rule__PrimitiveLiteral__Group_3__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1008:1: ( rule__PrimitiveLiteral__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_3()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1009:1: ( rule__PrimitiveLiteral__Group_3__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1009:2: rule__PrimitiveLiteral__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__0_in_rule__PrimitiveLiteral__Alternatives2133);
                    rule__PrimitiveLiteral__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1013:6: ( ( rule__PrimitiveLiteral__Group_4__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1013:6: ( ( rule__PrimitiveLiteral__Group_4__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1014:1: ( rule__PrimitiveLiteral__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_4()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1015:1: ( rule__PrimitiveLiteral__Group_4__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1015:2: rule__PrimitiveLiteral__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__0_in_rule__PrimitiveLiteral__Alternatives2151);
                    rule__PrimitiveLiteral__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1019:6: ( ( rule__PrimitiveLiteral__Group_5__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1019:6: ( ( rule__PrimitiveLiteral__Group_5__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1020:1: ( rule__PrimitiveLiteral__Group_5__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_5()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1021:1: ( rule__PrimitiveLiteral__Group_5__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1021:2: rule__PrimitiveLiteral__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__0_in_rule__PrimitiveLiteral__Alternatives2169);
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


    // $ANTLR start rule__ThenBlock__Alternatives_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1030:1: rule__ThenBlock__Alternatives_1 : ( ( 'then' ) | ( '->' ) );
    public final void rule__ThenBlock__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1034:1: ( ( 'then' ) | ( '->' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1030:1: rule__ThenBlock__Alternatives_1 : ( ( 'then' ) | ( '->' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1035:1: ( 'then' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1035:1: ( 'then' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1036:1: 'then'
                    {
                     before(grammarAccess.getThenBlockAccess().getThenKeyword_1_0()); 
                    match(input,15,FOLLOW_15_in_rule__ThenBlock__Alternatives_12203); 
                     after(grammarAccess.getThenBlockAccess().getThenKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1043:6: ( '->' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1043:6: ( '->' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1044:1: '->'
                    {
                     before(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__ThenBlock__Alternatives_12223); 
                     after(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 

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


    // $ANTLR start rule__ThenBlock__Alternatives_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1056:1: rule__ThenBlock__Alternatives_2 : ( ( ( rule__ThenBlock__Group_2_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_2_1 ) ) );
    public final void rule__ThenBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1060:1: ( ( ( rule__ThenBlock__Group_2_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_2_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=RULE_INT && LA7_0<=RULE_FLOAT)||LA7_0==24||LA7_0==27||(LA7_0>=29 && LA7_0<=31)||LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1056:1: rule__ThenBlock__Alternatives_2 : ( ( ( rule__ThenBlock__Group_2_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_2_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1061:1: ( ( rule__ThenBlock__Group_2_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1061:1: ( ( rule__ThenBlock__Group_2_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1062:1: ( rule__ThenBlock__Group_2_0__0 )
                    {
                     before(grammarAccess.getThenBlockAccess().getGroup_2_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1063:1: ( rule__ThenBlock__Group_2_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1063:2: rule__ThenBlock__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__0_in_rule__ThenBlock__Alternatives_22257);
                    rule__ThenBlock__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getThenBlockAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1067:6: ( ( rule__ThenBlock__StatementsAssignment_2_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1067:6: ( ( rule__ThenBlock__StatementsAssignment_2_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1068:1: ( rule__ThenBlock__StatementsAssignment_2_1 )
                    {
                     before(grammarAccess.getThenBlockAccess().getStatementsAssignment_2_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1069:1: ( rule__ThenBlock__StatementsAssignment_2_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1069:2: rule__ThenBlock__StatementsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_2_1_in_rule__ThenBlock__Alternatives_22275);
                    rule__ThenBlock__StatementsAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getThenBlockAccess().getStatementsAssignment_2_1()); 

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
    // $ANTLR end rule__ThenBlock__Alternatives_2


    // $ANTLR start rule__Statement__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1078:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1082:1: ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||(LA8_0>=RULE_INT && LA8_0<=RULE_FLOAT)||LA8_0==24||LA8_0==27||(LA8_0>=29 && LA8_0<=31)) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1078:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1083:1: ( ruleCreateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1083:1: ( ruleCreateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1084:1: ruleCreateStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2308);
                    ruleCreateStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1089:6: ( ruleUpdateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1089:6: ( ruleUpdateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1090:1: ruleUpdateStatement
                    {
                     before(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2325);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1100:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );
    public final void rule__Setter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1104:1: ( ( ':' ) | ( '+=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1100:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1105:1: ( ':' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1105:1: ( ':' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1106:1: ':'
                    {
                     before(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 
                    match(input,17,FOLLOW_17_in_rule__Setter__Alternatives_12358); 
                     after(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1113:6: ( '+=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1113:6: ( '+=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1114:1: '+='
                    {
                     before(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1()); 
                    match(input,18,FOLLOW_18_in_rule__Setter__Alternatives_12378); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1129:1: rule__Scaffolding__Group__0 : rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 ;
    public final void rule__Scaffolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1133:1: ( rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1134:2: rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02411);
            rule__Scaffolding__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02414);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1141:1: rule__Scaffolding__Group__0__Impl : ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) ;
    public final void rule__Scaffolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1145:1: ( ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1146:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1146:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1147:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1148:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1148:2: rule__Scaffolding__ScaffoldAssignment_0
            {
            pushFollow(FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2441);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1158:1: rule__Scaffolding__Group__1 : rule__Scaffolding__Group__1__Impl ;
    public final void rule__Scaffolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1162:1: ( rule__Scaffolding__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1163:2: rule__Scaffolding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12471);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1169:1: rule__Scaffolding__Group__1__Impl : ( ( rule__Scaffolding__ElementsAssignment_1 )* ) ;
    public final void rule__Scaffolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1173:1: ( ( ( rule__Scaffolding__ElementsAssignment_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1174:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1174:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1175:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            {
             before(grammarAccess.getScaffoldingAccess().getElementsAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1176:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1176:2: rule__Scaffolding__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2498);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1190:1: rule__Scaffold__Group__0 : rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 ;
    public final void rule__Scaffold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1194:1: ( rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1195:2: rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02533);
            rule__Scaffold__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02536);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1202:1: rule__Scaffold__Group__0__Impl : ( 'scaffold' ) ;
    public final void rule__Scaffold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1206:1: ( ( 'scaffold' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1207:1: ( 'scaffold' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1207:1: ( 'scaffold' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1208:1: 'scaffold'
            {
             before(grammarAccess.getScaffoldAccess().getScaffoldKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Scaffold__Group__0__Impl2564); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1221:1: rule__Scaffold__Group__1 : rule__Scaffold__Group__1__Impl ;
    public final void rule__Scaffold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1225:1: ( rule__Scaffold__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1226:2: rule__Scaffold__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12595);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1232:1: rule__Scaffold__Group__1__Impl : ( ( rule__Scaffold__RefPackageAssignment_1 ) ) ;
    public final void rule__Scaffold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1236:1: ( ( ( rule__Scaffold__RefPackageAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1237:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1237:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1238:1: ( rule__Scaffold__RefPackageAssignment_1 )
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1239:1: ( rule__Scaffold__RefPackageAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1239:2: rule__Scaffold__RefPackageAssignment_1
            {
            pushFollow(FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2622);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1253:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1257:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1258:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02656);
            rule__Rule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02659);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1265:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1269:1: ( ( 'rule' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1270:1: ( 'rule' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1270:1: ( 'rule' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1271:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Rule__Group__0__Impl2687); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1284:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1288:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1289:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12718);
            rule__Rule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12721);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1296:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1300:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1301:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1301:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1302:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1303:1: ( rule__Rule__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1303:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2748);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1313:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1317:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1318:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22778);
            rule__Rule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22781);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1325:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__WhenAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1329:1: ( ( ( rule__Rule__WhenAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1330:1: ( ( rule__Rule__WhenAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1330:1: ( ( rule__Rule__WhenAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1331:1: ( rule__Rule__WhenAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getWhenAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1332:1: ( rule__Rule__WhenAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1332:2: rule__Rule__WhenAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2808);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1342:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1346:1: ( rule__Rule__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1347:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32838);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1353:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ThenAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1357:1: ( ( ( rule__Rule__ThenAssignment_3 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1358:1: ( ( rule__Rule__ThenAssignment_3 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1358:1: ( ( rule__Rule__ThenAssignment_3 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1359:1: ( rule__Rule__ThenAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getThenAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1360:1: ( rule__Rule__ThenAssignment_3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1360:2: rule__Rule__ThenAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl2865);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1378:1: rule__WhenBlock__Group__0 : rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 ;
    public final void rule__WhenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1382:1: ( rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1383:2: rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__02903);
            rule__WhenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__02906);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1390:1: rule__WhenBlock__Group__0__Impl : ( () ) ;
    public final void rule__WhenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1394:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1395:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1395:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1396:1: ()
            {
             before(grammarAccess.getWhenBlockAccess().getWhenBlockAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1397:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1399:1: 
            {
            }

             after(grammarAccess.getWhenBlockAccess().getWhenBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhenBlock__Group__0__Impl


    // $ANTLR start rule__WhenBlock__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1409:1: rule__WhenBlock__Group__1 : rule__WhenBlock__Group__1__Impl rule__WhenBlock__Group__2 ;
    public final void rule__WhenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1413:1: ( rule__WhenBlock__Group__1__Impl rule__WhenBlock__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1414:2: rule__WhenBlock__Group__1__Impl rule__WhenBlock__Group__2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__12964);
            rule__WhenBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group__2_in_rule__WhenBlock__Group__12967);
            rule__WhenBlock__Group__2();
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1421:1: rule__WhenBlock__Group__1__Impl : ( 'when' ) ;
    public final void rule__WhenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1425:1: ( ( 'when' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1426:1: ( 'when' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1426:1: ( 'when' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1427:1: 'when'
            {
             before(grammarAccess.getWhenBlockAccess().getWhenKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__WhenBlock__Group__1__Impl2995); 
             after(grammarAccess.getWhenBlockAccess().getWhenKeyword_1()); 

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


    // $ANTLR start rule__WhenBlock__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1440:1: rule__WhenBlock__Group__2 : rule__WhenBlock__Group__2__Impl ;
    public final void rule__WhenBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1444:1: ( rule__WhenBlock__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1445:2: rule__WhenBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__2__Impl_in_rule__WhenBlock__Group__23026);
            rule__WhenBlock__Group__2__Impl();
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
    // $ANTLR end rule__WhenBlock__Group__2


    // $ANTLR start rule__WhenBlock__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1451:1: rule__WhenBlock__Group__2__Impl : ( ( rule__WhenBlock__Alternatives_2 ) ) ;
    public final void rule__WhenBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1455:1: ( ( ( rule__WhenBlock__Alternatives_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1456:1: ( ( rule__WhenBlock__Alternatives_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1456:1: ( ( rule__WhenBlock__Alternatives_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1457:1: ( rule__WhenBlock__Alternatives_2 )
            {
             before(grammarAccess.getWhenBlockAccess().getAlternatives_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1458:1: ( rule__WhenBlock__Alternatives_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1458:2: rule__WhenBlock__Alternatives_2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Alternatives_2_in_rule__WhenBlock__Group__2__Impl3053);
            rule__WhenBlock__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getWhenBlockAccess().getAlternatives_2()); 

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
    // $ANTLR end rule__WhenBlock__Group__2__Impl


    // $ANTLR start rule__WhenBlock__Group_2_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1474:1: rule__WhenBlock__Group_2_0__0 : rule__WhenBlock__Group_2_0__0__Impl rule__WhenBlock__Group_2_0__1 ;
    public final void rule__WhenBlock__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1478:1: ( rule__WhenBlock__Group_2_0__0__Impl rule__WhenBlock__Group_2_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1479:2: rule__WhenBlock__Group_2_0__0__Impl rule__WhenBlock__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__0__Impl_in_rule__WhenBlock__Group_2_0__03089);
            rule__WhenBlock__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__1_in_rule__WhenBlock__Group_2_0__03092);
            rule__WhenBlock__Group_2_0__1();
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
    // $ANTLR end rule__WhenBlock__Group_2_0__0


    // $ANTLR start rule__WhenBlock__Group_2_0__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1486:1: rule__WhenBlock__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__WhenBlock__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1490:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1491:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1491:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1492:1: '{'
            {
             before(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            match(input,22,FOLLOW_22_in_rule__WhenBlock__Group_2_0__0__Impl3120); 
             after(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_2_0_0()); 

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
    // $ANTLR end rule__WhenBlock__Group_2_0__0__Impl


    // $ANTLR start rule__WhenBlock__Group_2_0__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1505:1: rule__WhenBlock__Group_2_0__1 : rule__WhenBlock__Group_2_0__1__Impl rule__WhenBlock__Group_2_0__2 ;
    public final void rule__WhenBlock__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1509:1: ( rule__WhenBlock__Group_2_0__1__Impl rule__WhenBlock__Group_2_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1510:2: rule__WhenBlock__Group_2_0__1__Impl rule__WhenBlock__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__1__Impl_in_rule__WhenBlock__Group_2_0__13151);
            rule__WhenBlock__Group_2_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__2_in_rule__WhenBlock__Group_2_0__13154);
            rule__WhenBlock__Group_2_0__2();
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
    // $ANTLR end rule__WhenBlock__Group_2_0__1


    // $ANTLR start rule__WhenBlock__Group_2_0__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1517:1: rule__WhenBlock__Group_2_0__1__Impl : ( ( rule__WhenBlock__MatchesAssignment_2_0_1 )* ) ;
    public final void rule__WhenBlock__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1521:1: ( ( ( rule__WhenBlock__MatchesAssignment_2_0_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1522:1: ( ( rule__WhenBlock__MatchesAssignment_2_0_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1522:1: ( ( rule__WhenBlock__MatchesAssignment_2_0_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1523:1: ( rule__WhenBlock__MatchesAssignment_2_0_1 )*
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_2_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1524:1: ( rule__WhenBlock__MatchesAssignment_2_0_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1524:2: rule__WhenBlock__MatchesAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_2_0_1_in_rule__WhenBlock__Group_2_0__1__Impl3181);
            	    rule__WhenBlock__MatchesAssignment_2_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWhenBlockAccess().getMatchesAssignment_2_0_1()); 

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
    // $ANTLR end rule__WhenBlock__Group_2_0__1__Impl


    // $ANTLR start rule__WhenBlock__Group_2_0__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1534:1: rule__WhenBlock__Group_2_0__2 : rule__WhenBlock__Group_2_0__2__Impl ;
    public final void rule__WhenBlock__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1538:1: ( rule__WhenBlock__Group_2_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1539:2: rule__WhenBlock__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__2__Impl_in_rule__WhenBlock__Group_2_0__23212);
            rule__WhenBlock__Group_2_0__2__Impl();
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
    // $ANTLR end rule__WhenBlock__Group_2_0__2


    // $ANTLR start rule__WhenBlock__Group_2_0__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1545:1: rule__WhenBlock__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__WhenBlock__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1549:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1550:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1550:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1551:1: '}'
            {
             before(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_2_0_2()); 
            match(input,23,FOLLOW_23_in_rule__WhenBlock__Group_2_0__2__Impl3240); 
             after(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_2_0_2()); 

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
    // $ANTLR end rule__WhenBlock__Group_2_0__2__Impl


    // $ANTLR start rule__Match__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1570:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1574:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1575:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__03277);
            rule__Match__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__1_in_rule__Match__Group__03280);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1582:1: rule__Match__Group__0__Impl : ( ( rule__Match__Group_0__0 )? ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1586:1: ( ( ( rule__Match__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1587:1: ( ( rule__Match__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1587:1: ( ( rule__Match__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1588:1: ( rule__Match__Group_0__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1589:1: ( rule__Match__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==17) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1589:2: rule__Match__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3307);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1599:1: rule__Match__Group__1 : rule__Match__Group__1__Impl rule__Match__Group__2 ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1603:1: ( rule__Match__Group__1__Impl rule__Match__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1604:2: rule__Match__Group__1__Impl rule__Match__Group__2
            {
            pushFollow(FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13338);
            rule__Match__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13341);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1611:1: rule__Match__Group__1__Impl : ( ( rule__Match__TypeAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1615:1: ( ( ( rule__Match__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1616:1: ( ( rule__Match__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1616:1: ( ( rule__Match__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1617:1: ( rule__Match__TypeAssignment_1 )
            {
             before(grammarAccess.getMatchAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1618:1: ( rule__Match__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1618:2: rule__Match__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3368);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1628:1: rule__Match__Group__2 : rule__Match__Group__2__Impl ;
    public final void rule__Match__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1632:1: ( rule__Match__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1633:2: rule__Match__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23398);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1639:1: rule__Match__Group__2__Impl : ( ( rule__Match__Group_2__0 )? ) ;
    public final void rule__Match__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1643:1: ( ( ( rule__Match__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1644:1: ( ( rule__Match__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1644:1: ( ( rule__Match__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1645:1: ( rule__Match__Group_2__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1646:1: ( rule__Match__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1646:2: rule__Match__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3425);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1662:1: rule__Match__Group_0__0 : rule__Match__Group_0__0__Impl rule__Match__Group_0__1 ;
    public final void rule__Match__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1666:1: ( rule__Match__Group_0__0__Impl rule__Match__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1667:2: rule__Match__Group_0__0__Impl rule__Match__Group_0__1
            {
            pushFollow(FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03462);
            rule__Match__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03465);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1674:1: rule__Match__Group_0__0__Impl : ( ( rule__Match__VarAssignment_0_0 ) ) ;
    public final void rule__Match__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1678:1: ( ( ( rule__Match__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1679:1: ( ( rule__Match__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1679:1: ( ( rule__Match__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1680:1: ( rule__Match__VarAssignment_0_0 )
            {
             before(grammarAccess.getMatchAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1681:1: ( rule__Match__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1681:2: rule__Match__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3492);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1691:1: rule__Match__Group_0__1 : rule__Match__Group_0__1__Impl ;
    public final void rule__Match__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1695:1: ( rule__Match__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1696:2: rule__Match__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13522);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1702:1: rule__Match__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Match__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1706:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1707:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1707:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1708:1: ':'
            {
             before(grammarAccess.getMatchAccess().getColonKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__Match__Group_0__1__Impl3550); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1725:1: rule__Match__Group_2__0 : rule__Match__Group_2__0__Impl rule__Match__Group_2__1 ;
    public final void rule__Match__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1729:1: ( rule__Match__Group_2__0__Impl rule__Match__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1730:2: rule__Match__Group_2__0__Impl rule__Match__Group_2__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03585);
            rule__Match__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03588);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1737:1: rule__Match__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Match__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1741:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1742:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1742:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1743:1: '('
            {
             before(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Match__Group_2__0__Impl3616); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1756:1: rule__Match__Group_2__1 : rule__Match__Group_2__1__Impl rule__Match__Group_2__2 ;
    public final void rule__Match__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1760:1: ( rule__Match__Group_2__1__Impl rule__Match__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1761:2: rule__Match__Group_2__1__Impl rule__Match__Group_2__2
            {
            pushFollow(FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13647);
            rule__Match__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13650);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1768:1: rule__Match__Group_2__1__Impl : ( ( rule__Match__Group_2_1__0 )? ) ;
    public final void rule__Match__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1772:1: ( ( ( rule__Match__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1773:1: ( ( rule__Match__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1773:1: ( ( rule__Match__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1774:1: ( rule__Match__Group_2_1__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1775:1: ( rule__Match__Group_2_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=RULE_INT && LA14_0<=RULE_FLOAT)||LA14_0==24||LA14_0==27||(LA14_0>=30 && LA14_0<=31)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1775:2: rule__Match__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3677);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1785:1: rule__Match__Group_2__2 : rule__Match__Group_2__2__Impl ;
    public final void rule__Match__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1789:1: ( rule__Match__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1790:2: rule__Match__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23708);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1796:1: rule__Match__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Match__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1800:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1801:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1801:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1802:1: ')'
            {
             before(grammarAccess.getMatchAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__Match__Group_2__2__Impl3736); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1821:1: rule__Match__Group_2_1__0 : rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 ;
    public final void rule__Match__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1825:1: ( rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1826:2: rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03773);
            rule__Match__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03776);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1833:1: rule__Match__Group_2_1__0__Impl : ( ( rule__Match__ParamsAssignment_2_1_0 ) ) ;
    public final void rule__Match__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1837:1: ( ( ( rule__Match__ParamsAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1838:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1838:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1839:1: ( rule__Match__ParamsAssignment_2_1_0 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1840:1: ( rule__Match__ParamsAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1840:2: rule__Match__ParamsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3803);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1850:1: rule__Match__Group_2_1__1 : rule__Match__Group_2_1__1__Impl ;
    public final void rule__Match__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1854:1: ( rule__Match__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1855:2: rule__Match__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13833);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1861:1: rule__Match__Group_2_1__1__Impl : ( ( rule__Match__Group_2_1_1__0 )* ) ;
    public final void rule__Match__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1865:1: ( ( ( rule__Match__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1866:1: ( ( rule__Match__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1866:1: ( ( rule__Match__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1867:1: ( rule__Match__Group_2_1_1__0 )*
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1868:1: ( rule__Match__Group_2_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1868:2: rule__Match__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3860);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1882:1: rule__Match__Group_2_1_1__0 : rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 ;
    public final void rule__Match__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1886:1: ( rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1887:2: rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__03895);
            rule__Match__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__03898);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1894:1: rule__Match__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Match__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1898:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1899:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1899:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1900:1: ','
            {
             before(grammarAccess.getMatchAccess().getCommaKeyword_2_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Match__Group_2_1_1__0__Impl3926); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1913:1: rule__Match__Group_2_1_1__1 : rule__Match__Group_2_1_1__1__Impl ;
    public final void rule__Match__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1917:1: ( rule__Match__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1918:2: rule__Match__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__13957);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1924:1: rule__Match__Group_2_1_1__1__Impl : ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) ;
    public final void rule__Match__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1928:1: ( ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1929:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1929:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1930:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1931:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1931:2: rule__Match__ParamsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl3984);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1945:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1949:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1950:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__04018);
            rule__Param__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__04021);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1957:1: rule__Param__Group__0__Impl : ( ( rule__Param__PropertyAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1961:1: ( ( ( rule__Param__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1962:1: ( ( rule__Param__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1962:1: ( ( rule__Param__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1963:1: ( rule__Param__PropertyAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1964:1: ( rule__Param__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1964:2: rule__Param__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl4048);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1974:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1978:1: ( rule__Param__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1979:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__14078);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1985:1: rule__Param__Group__1__Impl : ( ( rule__Param__Group_1__0 )? ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1989:1: ( ( ( rule__Param__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1990:1: ( ( rule__Param__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1990:1: ( ( rule__Param__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1991:1: ( rule__Param__Group_1__0 )?
            {
             before(grammarAccess.getParamAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1992:1: ( rule__Param__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1992:2: rule__Param__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl4105);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2006:1: rule__Param__Group_1__0 : rule__Param__Group_1__0__Impl rule__Param__Group_1__1 ;
    public final void rule__Param__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2010:1: ( rule__Param__Group_1__0__Impl rule__Param__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2011:2: rule__Param__Group_1__0__Impl rule__Param__Group_1__1
            {
            pushFollow(FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__04140);
            rule__Param__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__04143);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2018:1: rule__Param__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Param__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2022:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2023:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2023:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2024:1: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Param__Group_1__0__Impl4171); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2037:1: rule__Param__Group_1__1 : rule__Param__Group_1__1__Impl ;
    public final void rule__Param__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2041:1: ( rule__Param__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2042:2: rule__Param__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__14202);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2048:1: rule__Param__Group_1__1__Impl : ( ( rule__Param__VarAssignment_1_1 ) ) ;
    public final void rule__Param__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2052:1: ( ( ( rule__Param__VarAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2053:1: ( ( rule__Param__VarAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2053:1: ( ( rule__Param__VarAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2054:1: ( rule__Param__VarAssignment_1_1 )
            {
             before(grammarAccess.getParamAccess().getVarAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2055:1: ( rule__Param__VarAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2055:2: rule__Param__VarAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl4229);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2069:1: rule__BindingExpression__Group__0 : rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1 ;
    public final void rule__BindingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2073:1: ( rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2074:2: rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__0__Impl_in_rule__BindingExpression__Group__04263);
            rule__BindingExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group__1_in_rule__BindingExpression__Group__04266);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2081:1: rule__BindingExpression__Group__0__Impl : ( ruleBindingExpressionHigh ) ;
    public final void rule__BindingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2085:1: ( ( ruleBindingExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2086:1: ( ruleBindingExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2086:1: ( ruleBindingExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2087:1: ruleBindingExpressionHigh
            {
             before(grammarAccess.getBindingExpressionAccess().getBindingExpressionHighParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpression__Group__0__Impl4293);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2098:1: rule__BindingExpression__Group__1 : rule__BindingExpression__Group__1__Impl ;
    public final void rule__BindingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2102:1: ( rule__BindingExpression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2103:2: rule__BindingExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__1__Impl_in_rule__BindingExpression__Group__14322);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2109:1: rule__BindingExpression__Group__1__Impl : ( ( rule__BindingExpression__Group_1__0 )? ) ;
    public final void rule__BindingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2113:1: ( ( ( rule__BindingExpression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2114:1: ( ( rule__BindingExpression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2114:1: ( ( rule__BindingExpression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2115:1: ( rule__BindingExpression__Group_1__0 )?
            {
             before(grammarAccess.getBindingExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2116:1: ( rule__BindingExpression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2116:2: rule__BindingExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingExpression__Group_1__0_in_rule__BindingExpression__Group__1__Impl4349);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2130:1: rule__BindingExpression__Group_1__0 : rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1 ;
    public final void rule__BindingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2134:1: ( rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2135:2: rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__0__Impl_in_rule__BindingExpression__Group_1__04384);
            rule__BindingExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group_1__1_in_rule__BindingExpression__Group_1__04387);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2142:1: rule__BindingExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2146:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2147:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2147:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2148:1: ()
            {
             before(grammarAccess.getBindingExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2149:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2151:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2161:1: rule__BindingExpression__Group_1__1 : rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2 ;
    public final void rule__BindingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2165:1: ( rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2166:2: rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__1__Impl_in_rule__BindingExpression__Group_1__14445);
            rule__BindingExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group_1__2_in_rule__BindingExpression__Group_1__14448);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2173:1: rule__BindingExpression__Group_1__1__Impl : ( ( rule__BindingExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BindingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2177:1: ( ( ( rule__BindingExpression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2178:1: ( ( rule__BindingExpression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2178:1: ( ( rule__BindingExpression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2179:1: ( rule__BindingExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBindingExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2180:1: ( rule__BindingExpression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2180:2: rule__BindingExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BindingExpression__OpAssignment_1_1_in_rule__BindingExpression__Group_1__1__Impl4475);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2190:1: rule__BindingExpression__Group_1__2 : rule__BindingExpression__Group_1__2__Impl ;
    public final void rule__BindingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2194:1: ( rule__BindingExpression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2195:2: rule__BindingExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__2__Impl_in_rule__BindingExpression__Group_1__24505);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2201:1: rule__BindingExpression__Group_1__2__Impl : ( ( rule__BindingExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BindingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2205:1: ( ( ( rule__BindingExpression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2206:1: ( ( rule__BindingExpression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2206:1: ( ( rule__BindingExpression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2207:1: ( rule__BindingExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBindingExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2208:1: ( rule__BindingExpression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2208:2: rule__BindingExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingExpression__RightAssignment_1_2_in_rule__BindingExpression__Group_1__2__Impl4532);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2224:1: rule__BindingExpressionHigh__Group__0 : rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1 ;
    public final void rule__BindingExpressionHigh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2228:1: ( rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2229:2: rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__0__Impl_in_rule__BindingExpressionHigh__Group__04568);
            rule__BindingExpressionHigh__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__1_in_rule__BindingExpressionHigh__Group__04571);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2236:1: rule__BindingExpressionHigh__Group__0__Impl : ( ruleBindingTerminalExpression ) ;
    public final void rule__BindingExpressionHigh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2240:1: ( ( ruleBindingTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2241:1: ( ruleBindingTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2241:1: ( ruleBindingTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2242:1: ruleBindingTerminalExpression
            {
             before(grammarAccess.getBindingExpressionHighAccess().getBindingTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_rule__BindingExpressionHigh__Group__0__Impl4598);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2253:1: rule__BindingExpressionHigh__Group__1 : rule__BindingExpressionHigh__Group__1__Impl ;
    public final void rule__BindingExpressionHigh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2257:1: ( rule__BindingExpressionHigh__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2258:2: rule__BindingExpressionHigh__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__1__Impl_in_rule__BindingExpressionHigh__Group__14627);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2264:1: rule__BindingExpressionHigh__Group__1__Impl : ( ( rule__BindingExpressionHigh__Group_1__0 )? ) ;
    public final void rule__BindingExpressionHigh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2268:1: ( ( ( rule__BindingExpressionHigh__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2269:1: ( ( rule__BindingExpressionHigh__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2269:1: ( ( rule__BindingExpressionHigh__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2270:1: ( rule__BindingExpressionHigh__Group_1__0 )?
            {
             before(grammarAccess.getBindingExpressionHighAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2271:1: ( rule__BindingExpressionHigh__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2271:2: rule__BindingExpressionHigh__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__0_in_rule__BindingExpressionHigh__Group__1__Impl4654);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2285:1: rule__BindingExpressionHigh__Group_1__0 : rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1 ;
    public final void rule__BindingExpressionHigh__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2289:1: ( rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2290:2: rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__0__Impl_in_rule__BindingExpressionHigh__Group_1__04689);
            rule__BindingExpressionHigh__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__1_in_rule__BindingExpressionHigh__Group_1__04692);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2297:1: rule__BindingExpressionHigh__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingExpressionHigh__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2301:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2302:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2302:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2303:1: ()
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2304:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2306:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2316:1: rule__BindingExpressionHigh__Group_1__1 : rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2 ;
    public final void rule__BindingExpressionHigh__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2320:1: ( rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2321:2: rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__1__Impl_in_rule__BindingExpressionHigh__Group_1__14750);
            rule__BindingExpressionHigh__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__2_in_rule__BindingExpressionHigh__Group_1__14753);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2328:1: rule__BindingExpressionHigh__Group_1__1__Impl : ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) ) ;
    public final void rule__BindingExpressionHigh__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2332:1: ( ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2333:1: ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2333:1: ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2334:1: ( rule__BindingExpressionHigh__OpAssignment_1_1 )
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2335:1: ( rule__BindingExpressionHigh__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2335:2: rule__BindingExpressionHigh__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__OpAssignment_1_1_in_rule__BindingExpressionHigh__Group_1__1__Impl4780);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2345:1: rule__BindingExpressionHigh__Group_1__2 : rule__BindingExpressionHigh__Group_1__2__Impl ;
    public final void rule__BindingExpressionHigh__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2349:1: ( rule__BindingExpressionHigh__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2350:2: rule__BindingExpressionHigh__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__2__Impl_in_rule__BindingExpressionHigh__Group_1__24810);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2356:1: rule__BindingExpressionHigh__Group_1__2__Impl : ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) ) ;
    public final void rule__BindingExpressionHigh__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2360:1: ( ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2361:1: ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2361:1: ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2362:1: ( rule__BindingExpressionHigh__RightAssignment_1_2 )
            {
             before(grammarAccess.getBindingExpressionHighAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2363:1: ( rule__BindingExpressionHigh__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2363:2: rule__BindingExpressionHigh__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__RightAssignment_1_2_in_rule__BindingExpressionHigh__Group_1__2__Impl4837);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2379:1: rule__BindingTerminalExpression__Group_0__0 : rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1 ;
    public final void rule__BindingTerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2383:1: ( rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2384:2: rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__0__Impl_in_rule__BindingTerminalExpression__Group_0__04873);
            rule__BindingTerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__1_in_rule__BindingTerminalExpression__Group_0__04876);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2391:1: rule__BindingTerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BindingTerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2395:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2396:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2396:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2397:1: '('
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__BindingTerminalExpression__Group_0__0__Impl4904); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2410:1: rule__BindingTerminalExpression__Group_0__1 : rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2 ;
    public final void rule__BindingTerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2414:1: ( rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2415:2: rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__1__Impl_in_rule__BindingTerminalExpression__Group_0__14935);
            rule__BindingTerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__2_in_rule__BindingTerminalExpression__Group_0__14938);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2422:1: rule__BindingTerminalExpression__Group_0__1__Impl : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2426:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2427:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2427:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2428:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getBindingExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__Group_0__1__Impl4965);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2439:1: rule__BindingTerminalExpression__Group_0__2 : rule__BindingTerminalExpression__Group_0__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2443:1: ( rule__BindingTerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2444:2: rule__BindingTerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__2__Impl_in_rule__BindingTerminalExpression__Group_0__24994);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2450:1: rule__BindingTerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BindingTerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2454:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2455:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2455:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2456:1: ')'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,25,FOLLOW_25_in_rule__BindingTerminalExpression__Group_0__2__Impl5022); 
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


    // $ANTLR start rule__BindingTerminalExpression__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2475:1: rule__BindingTerminalExpression__Group_1__0 : rule__BindingTerminalExpression__Group_1__0__Impl rule__BindingTerminalExpression__Group_1__1 ;
    public final void rule__BindingTerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2479:1: ( rule__BindingTerminalExpression__Group_1__0__Impl rule__BindingTerminalExpression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2480:2: rule__BindingTerminalExpression__Group_1__0__Impl rule__BindingTerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__0__Impl_in_rule__BindingTerminalExpression__Group_1__05059);
            rule__BindingTerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__1_in_rule__BindingTerminalExpression__Group_1__05062);
            rule__BindingTerminalExpression__Group_1__1();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_1__0


    // $ANTLR start rule__BindingTerminalExpression__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2487:1: rule__BindingTerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingTerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2491:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2492:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2492:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2493:1: ()
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getNotExpressionAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2494:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2496:1: 
            {
            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getNotExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_1__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2506:1: rule__BindingTerminalExpression__Group_1__1 : rule__BindingTerminalExpression__Group_1__1__Impl rule__BindingTerminalExpression__Group_1__2 ;
    public final void rule__BindingTerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2510:1: ( rule__BindingTerminalExpression__Group_1__1__Impl rule__BindingTerminalExpression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2511:2: rule__BindingTerminalExpression__Group_1__1__Impl rule__BindingTerminalExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__1__Impl_in_rule__BindingTerminalExpression__Group_1__15120);
            rule__BindingTerminalExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__2_in_rule__BindingTerminalExpression__Group_1__15123);
            rule__BindingTerminalExpression__Group_1__2();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_1__1


    // $ANTLR start rule__BindingTerminalExpression__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2518:1: rule__BindingTerminalExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__BindingTerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2522:1: ( ( '!' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2523:1: ( '!' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2523:1: ( '!' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2524:1: '!'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExclamationMarkKeyword_1_1()); 
            match(input,27,FOLLOW_27_in_rule__BindingTerminalExpression__Group_1__1__Impl5151); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getExclamationMarkKeyword_1_1()); 

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
    // $ANTLR end rule__BindingTerminalExpression__Group_1__1__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_1__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2537:1: rule__BindingTerminalExpression__Group_1__2 : rule__BindingTerminalExpression__Group_1__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2541:1: ( rule__BindingTerminalExpression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2542:2: rule__BindingTerminalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__2__Impl_in_rule__BindingTerminalExpression__Group_1__25182);
            rule__BindingTerminalExpression__Group_1__2__Impl();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_1__2


    // $ANTLR start rule__BindingTerminalExpression__Group_1__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2548:1: rule__BindingTerminalExpression__Group_1__2__Impl : ( ( rule__BindingTerminalExpression__ExpAssignment_1_2 ) ) ;
    public final void rule__BindingTerminalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2552:1: ( ( ( rule__BindingTerminalExpression__ExpAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2553:1: ( ( rule__BindingTerminalExpression__ExpAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2553:1: ( ( rule__BindingTerminalExpression__ExpAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2554:1: ( rule__BindingTerminalExpression__ExpAssignment_1_2 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2555:1: ( rule__BindingTerminalExpression__ExpAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2555:2: rule__BindingTerminalExpression__ExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ExpAssignment_1_2_in_rule__BindingTerminalExpression__Group_1__2__Impl5209);
            rule__BindingTerminalExpression__ExpAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_1_2()); 

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
    // $ANTLR end rule__BindingTerminalExpression__Group_1__2__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2571:1: rule__BindingTerminalExpression__Group_3__0 : rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1 ;
    public final void rule__BindingTerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2575:1: ( rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2576:2: rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__0__Impl_in_rule__BindingTerminalExpression__Group_3__05245);
            rule__BindingTerminalExpression__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__1_in_rule__BindingTerminalExpression__Group_3__05248);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2583:1: rule__BindingTerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__BindingTerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2587:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2588:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2588:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2589:1: ()
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2590:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2592:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2602:1: rule__BindingTerminalExpression__Group_3__1 : rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2 ;
    public final void rule__BindingTerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2606:1: ( rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2607:2: rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__1__Impl_in_rule__BindingTerminalExpression__Group_3__15306);
            rule__BindingTerminalExpression__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__2_in_rule__BindingTerminalExpression__Group_3__15309);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2614:1: rule__BindingTerminalExpression__Group_3__1__Impl : ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2618:1: ( ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2619:1: ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2619:1: ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2620:1: ( rule__BindingTerminalExpression__FunctionAssignment_3_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionAssignment_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2621:1: ( rule__BindingTerminalExpression__FunctionAssignment_3_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2621:2: rule__BindingTerminalExpression__FunctionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__FunctionAssignment_3_1_in_rule__BindingTerminalExpression__Group_3__1__Impl5336);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2631:1: rule__BindingTerminalExpression__Group_3__2 : rule__BindingTerminalExpression__Group_3__2__Impl rule__BindingTerminalExpression__Group_3__3 ;
    public final void rule__BindingTerminalExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2635:1: ( rule__BindingTerminalExpression__Group_3__2__Impl rule__BindingTerminalExpression__Group_3__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2636:2: rule__BindingTerminalExpression__Group_3__2__Impl rule__BindingTerminalExpression__Group_3__3
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__2__Impl_in_rule__BindingTerminalExpression__Group_3__25366);
            rule__BindingTerminalExpression__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__3_in_rule__BindingTerminalExpression__Group_3__25369);
            rule__BindingTerminalExpression__Group_3__3();
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2643:1: rule__BindingTerminalExpression__Group_3__2__Impl : ( '(' ) ;
    public final void rule__BindingTerminalExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2647:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2648:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2648:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2649:1: '('
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,24,FOLLOW_24_in_rule__BindingTerminalExpression__Group_3__2__Impl5397); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_3_2()); 

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


    // $ANTLR start rule__BindingTerminalExpression__Group_3__3
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2662:1: rule__BindingTerminalExpression__Group_3__3 : rule__BindingTerminalExpression__Group_3__3__Impl rule__BindingTerminalExpression__Group_3__4 ;
    public final void rule__BindingTerminalExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2666:1: ( rule__BindingTerminalExpression__Group_3__3__Impl rule__BindingTerminalExpression__Group_3__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2667:2: rule__BindingTerminalExpression__Group_3__3__Impl rule__BindingTerminalExpression__Group_3__4
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__3__Impl_in_rule__BindingTerminalExpression__Group_3__35428);
            rule__BindingTerminalExpression__Group_3__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__4_in_rule__BindingTerminalExpression__Group_3__35431);
            rule__BindingTerminalExpression__Group_3__4();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_3__3


    // $ANTLR start rule__BindingTerminalExpression__Group_3__3__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2674:1: rule__BindingTerminalExpression__Group_3__3__Impl : ( ( rule__BindingTerminalExpression__Group_3_3__0 )? ) ;
    public final void rule__BindingTerminalExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2678:1: ( ( ( rule__BindingTerminalExpression__Group_3_3__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2679:1: ( ( rule__BindingTerminalExpression__Group_3_3__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2679:1: ( ( rule__BindingTerminalExpression__Group_3_3__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2680:1: ( rule__BindingTerminalExpression__Group_3_3__0 )?
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2681:1: ( rule__BindingTerminalExpression__Group_3_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=RULE_INT && LA19_0<=RULE_FLOAT)||LA19_0==24||LA19_0==27||(LA19_0>=30 && LA19_0<=31)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2681:2: rule__BindingTerminalExpression__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3__0_in_rule__BindingTerminalExpression__Group_3__3__Impl5458);
                    rule__BindingTerminalExpression__Group_3_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3_3()); 

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
    // $ANTLR end rule__BindingTerminalExpression__Group_3__3__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3__4
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2691:1: rule__BindingTerminalExpression__Group_3__4 : rule__BindingTerminalExpression__Group_3__4__Impl ;
    public final void rule__BindingTerminalExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2695:1: ( rule__BindingTerminalExpression__Group_3__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2696:2: rule__BindingTerminalExpression__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__4__Impl_in_rule__BindingTerminalExpression__Group_3__45489);
            rule__BindingTerminalExpression__Group_3__4__Impl();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_3__4


    // $ANTLR start rule__BindingTerminalExpression__Group_3__4__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2702:1: rule__BindingTerminalExpression__Group_3__4__Impl : ( ')' ) ;
    public final void rule__BindingTerminalExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2706:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2707:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2707:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2708:1: ')'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,25,FOLLOW_25_in_rule__BindingTerminalExpression__Group_3__4__Impl5517); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_3_4()); 

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
    // $ANTLR end rule__BindingTerminalExpression__Group_3__4__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3_3__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2731:1: rule__BindingTerminalExpression__Group_3_3__0 : rule__BindingTerminalExpression__Group_3_3__0__Impl rule__BindingTerminalExpression__Group_3_3__1 ;
    public final void rule__BindingTerminalExpression__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2735:1: ( rule__BindingTerminalExpression__Group_3_3__0__Impl rule__BindingTerminalExpression__Group_3_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2736:2: rule__BindingTerminalExpression__Group_3_3__0__Impl rule__BindingTerminalExpression__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3__0__Impl_in_rule__BindingTerminalExpression__Group_3_3__05558);
            rule__BindingTerminalExpression__Group_3_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3__1_in_rule__BindingTerminalExpression__Group_3_3__05561);
            rule__BindingTerminalExpression__Group_3_3__1();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_3_3__0


    // $ANTLR start rule__BindingTerminalExpression__Group_3_3__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2743:1: rule__BindingTerminalExpression__Group_3_3__0__Impl : ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2747:1: ( ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2748:1: ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2748:1: ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2749:1: ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsAssignment_3_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2750:1: ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2750:2: rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0_in_rule__BindingTerminalExpression__Group_3_3__0__Impl5588);
            rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsAssignment_3_3_0()); 

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
    // $ANTLR end rule__BindingTerminalExpression__Group_3_3__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3_3__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2760:1: rule__BindingTerminalExpression__Group_3_3__1 : rule__BindingTerminalExpression__Group_3_3__1__Impl ;
    public final void rule__BindingTerminalExpression__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2764:1: ( rule__BindingTerminalExpression__Group_3_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2765:2: rule__BindingTerminalExpression__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3__1__Impl_in_rule__BindingTerminalExpression__Group_3_3__15618);
            rule__BindingTerminalExpression__Group_3_3__1__Impl();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_3_3__1


    // $ANTLR start rule__BindingTerminalExpression__Group_3_3__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2771:1: rule__BindingTerminalExpression__Group_3_3__1__Impl : ( ( rule__BindingTerminalExpression__Group_3_3_1__0 )* ) ;
    public final void rule__BindingTerminalExpression__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2775:1: ( ( ( rule__BindingTerminalExpression__Group_3_3_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2776:1: ( ( rule__BindingTerminalExpression__Group_3_3_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2776:1: ( ( rule__BindingTerminalExpression__Group_3_3_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2777:1: ( rule__BindingTerminalExpression__Group_3_3_1__0 )*
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2778:1: ( rule__BindingTerminalExpression__Group_3_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2778:2: rule__BindingTerminalExpression__Group_3_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__0_in_rule__BindingTerminalExpression__Group_3_3__1__Impl5645);
            	    rule__BindingTerminalExpression__Group_3_3_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3_3_1()); 

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
    // $ANTLR end rule__BindingTerminalExpression__Group_3_3__1__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3_3_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2792:1: rule__BindingTerminalExpression__Group_3_3_1__0 : rule__BindingTerminalExpression__Group_3_3_1__0__Impl rule__BindingTerminalExpression__Group_3_3_1__1 ;
    public final void rule__BindingTerminalExpression__Group_3_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2796:1: ( rule__BindingTerminalExpression__Group_3_3_1__0__Impl rule__BindingTerminalExpression__Group_3_3_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2797:2: rule__BindingTerminalExpression__Group_3_3_1__0__Impl rule__BindingTerminalExpression__Group_3_3_1__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__0__Impl_in_rule__BindingTerminalExpression__Group_3_3_1__05680);
            rule__BindingTerminalExpression__Group_3_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__1_in_rule__BindingTerminalExpression__Group_3_3_1__05683);
            rule__BindingTerminalExpression__Group_3_3_1__1();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_3_3_1__0


    // $ANTLR start rule__BindingTerminalExpression__Group_3_3_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2804:1: rule__BindingTerminalExpression__Group_3_3_1__0__Impl : ( ',' ) ;
    public final void rule__BindingTerminalExpression__Group_3_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2808:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2809:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2809:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2810:1: ','
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getCommaKeyword_3_3_1_0()); 
            match(input,26,FOLLOW_26_in_rule__BindingTerminalExpression__Group_3_3_1__0__Impl5711); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getCommaKeyword_3_3_1_0()); 

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
    // $ANTLR end rule__BindingTerminalExpression__Group_3_3_1__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_3_3_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2823:1: rule__BindingTerminalExpression__Group_3_3_1__1 : rule__BindingTerminalExpression__Group_3_3_1__1__Impl ;
    public final void rule__BindingTerminalExpression__Group_3_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2827:1: ( rule__BindingTerminalExpression__Group_3_3_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2828:2: rule__BindingTerminalExpression__Group_3_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__1__Impl_in_rule__BindingTerminalExpression__Group_3_3_1__15742);
            rule__BindingTerminalExpression__Group_3_3_1__1__Impl();
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
    // $ANTLR end rule__BindingTerminalExpression__Group_3_3_1__1


    // $ANTLR start rule__BindingTerminalExpression__Group_3_3_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2834:1: rule__BindingTerminalExpression__Group_3_3_1__1__Impl : ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2838:1: ( ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2839:1: ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2839:1: ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2840:1: ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsAssignment_3_3_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2841:1: ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2841:2: rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1_in_rule__BindingTerminalExpression__Group_3_3_1__1__Impl5769);
            rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsAssignment_3_3_1_1()); 

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
    // $ANTLR end rule__BindingTerminalExpression__Group_3_3_1__1__Impl


    // $ANTLR start rule__Expression__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2855:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2859:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2860:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05803);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05806);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2867:1: rule__Expression__Group__0__Impl : ( ruleExpressionHigh ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2871:1: ( ( ruleExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2872:1: ( ruleExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2872:1: ( ruleExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2873:1: ruleExpressionHigh
            {
             before(grammarAccess.getExpressionAccess().getExpressionHighParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_rule__Expression__Group__0__Impl5833);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2884:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2888:1: ( rule__Expression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2889:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15862);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2895:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2899:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2900:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2900:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2901:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2902:1: ( rule__Expression__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2902:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5889);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2916:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2920:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2921:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05924);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05927);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2928:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2932:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2933:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2933:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2934:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2935:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2937:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2947:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2951:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2952:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15985);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__15988);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2959:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2963:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2964:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2964:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2965:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2966:1: ( rule__Expression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2966:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl6015);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2976:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2980:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2981:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__26045);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2987:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2991:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2992:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2992:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2993:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2994:1: ( rule__Expression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2994:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl6072);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3010:1: rule__ExpressionHigh__Group__0 : rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1 ;
    public final void rule__ExpressionHigh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3014:1: ( rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3015:2: rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__0__Impl_in_rule__ExpressionHigh__Group__06108);
            rule__ExpressionHigh__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group__1_in_rule__ExpressionHigh__Group__06111);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3022:1: rule__ExpressionHigh__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__ExpressionHigh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3026:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3027:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3027:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3028:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionHighAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__ExpressionHigh__Group__0__Impl6138);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3039:1: rule__ExpressionHigh__Group__1 : rule__ExpressionHigh__Group__1__Impl ;
    public final void rule__ExpressionHigh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3043:1: ( rule__ExpressionHigh__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3044:2: rule__ExpressionHigh__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__1__Impl_in_rule__ExpressionHigh__Group__16167);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3050:1: rule__ExpressionHigh__Group__1__Impl : ( ( rule__ExpressionHigh__Group_1__0 )? ) ;
    public final void rule__ExpressionHigh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3054:1: ( ( ( rule__ExpressionHigh__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3055:1: ( ( rule__ExpressionHigh__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3055:1: ( ( rule__ExpressionHigh__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3056:1: ( rule__ExpressionHigh__Group_1__0 )?
            {
             before(grammarAccess.getExpressionHighAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3057:1: ( rule__ExpressionHigh__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3057:2: rule__ExpressionHigh__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__0_in_rule__ExpressionHigh__Group__1__Impl6194);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3071:1: rule__ExpressionHigh__Group_1__0 : rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1 ;
    public final void rule__ExpressionHigh__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3075:1: ( rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3076:2: rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__0__Impl_in_rule__ExpressionHigh__Group_1__06229);
            rule__ExpressionHigh__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__1_in_rule__ExpressionHigh__Group_1__06232);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3083:1: rule__ExpressionHigh__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionHigh__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3087:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3088:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3088:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3089:1: ()
            {
             before(grammarAccess.getExpressionHighAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3090:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3092:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3102:1: rule__ExpressionHigh__Group_1__1 : rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2 ;
    public final void rule__ExpressionHigh__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3106:1: ( rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3107:2: rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__1__Impl_in_rule__ExpressionHigh__Group_1__16290);
            rule__ExpressionHigh__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__2_in_rule__ExpressionHigh__Group_1__16293);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3114:1: rule__ExpressionHigh__Group_1__1__Impl : ( ( rule__ExpressionHigh__OpAssignment_1_1 ) ) ;
    public final void rule__ExpressionHigh__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3118:1: ( ( ( rule__ExpressionHigh__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3119:1: ( ( rule__ExpressionHigh__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3119:1: ( ( rule__ExpressionHigh__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3120:1: ( rule__ExpressionHigh__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionHighAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3121:1: ( rule__ExpressionHigh__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3121:2: rule__ExpressionHigh__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__OpAssignment_1_1_in_rule__ExpressionHigh__Group_1__1__Impl6320);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3131:1: rule__ExpressionHigh__Group_1__2 : rule__ExpressionHigh__Group_1__2__Impl ;
    public final void rule__ExpressionHigh__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3135:1: ( rule__ExpressionHigh__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3136:2: rule__ExpressionHigh__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__2__Impl_in_rule__ExpressionHigh__Group_1__26350);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3142:1: rule__ExpressionHigh__Group_1__2__Impl : ( ( rule__ExpressionHigh__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionHigh__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3146:1: ( ( ( rule__ExpressionHigh__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3147:1: ( ( rule__ExpressionHigh__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3147:1: ( ( rule__ExpressionHigh__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3148:1: ( rule__ExpressionHigh__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionHighAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3149:1: ( rule__ExpressionHigh__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3149:2: rule__ExpressionHigh__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__RightAssignment_1_2_in_rule__ExpressionHigh__Group_1__2__Impl6377);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3165:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3169:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3170:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__06413);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__06416);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3177:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3181:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3182:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3182:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3183:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__TerminalExpression__Group_0__0__Impl6444); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3196:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3200:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3201:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__16475);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__16478);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3208:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3212:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3213:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3213:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3214:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl6505);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3225:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3229:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3230:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__26534);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3236:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3240:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3241:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3241:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3242:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,25,FOLLOW_25_in_rule__TerminalExpression__Group_0__2__Impl6562); 
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


    // $ANTLR start rule__TerminalExpression__Group_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3261:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3265:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3266:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__06599);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__06602);
            rule__TerminalExpression__Group_2__1();
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
    // $ANTLR end rule__TerminalExpression__Group_2__0


    // $ANTLR start rule__TerminalExpression__Group_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3273:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3277:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3278:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3278:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3279:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3280:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3282:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3292:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2 ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3296:1: ( rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3297:2: rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__16660);
            rule__TerminalExpression__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__2_in_rule__TerminalExpression__Group_2__16663);
            rule__TerminalExpression__Group_2__2();
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
    // $ANTLR end rule__TerminalExpression__Group_2__1


    // $ANTLR start rule__TerminalExpression__Group_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3304:1: rule__TerminalExpression__Group_2__1__Impl : ( '!' ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3308:1: ( ( '!' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3309:1: ( '!' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3309:1: ( '!' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3310:1: '!'
            {
             before(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_2_1()); 
            match(input,27,FOLLOW_27_in_rule__TerminalExpression__Group_2__1__Impl6691); 
             after(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_2_1()); 

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
    // $ANTLR end rule__TerminalExpression__Group_2__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3323:1: rule__TerminalExpression__Group_2__2 : rule__TerminalExpression__Group_2__2__Impl ;
    public final void rule__TerminalExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3327:1: ( rule__TerminalExpression__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3328:2: rule__TerminalExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__2__Impl_in_rule__TerminalExpression__Group_2__26722);
            rule__TerminalExpression__Group_2__2__Impl();
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
    // $ANTLR end rule__TerminalExpression__Group_2__2


    // $ANTLR start rule__TerminalExpression__Group_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3334:1: rule__TerminalExpression__Group_2__2__Impl : ( ( rule__TerminalExpression__ExpAssignment_2_2 ) ) ;
    public final void rule__TerminalExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3338:1: ( ( ( rule__TerminalExpression__ExpAssignment_2_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3339:1: ( ( rule__TerminalExpression__ExpAssignment_2_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3339:1: ( ( rule__TerminalExpression__ExpAssignment_2_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3340:1: ( rule__TerminalExpression__ExpAssignment_2_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpAssignment_2_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3341:1: ( rule__TerminalExpression__ExpAssignment_2_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3341:2: rule__TerminalExpression__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ExpAssignment_2_2_in_rule__TerminalExpression__Group_2__2__Impl6749);
            rule__TerminalExpression__ExpAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getExpAssignment_2_2()); 

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
    // $ANTLR end rule__TerminalExpression__Group_2__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_4__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3357:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3361:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3362:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__06785);
            rule__TerminalExpression__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__06788);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3369:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3373:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3374:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3374:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3375:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3376:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3378:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3388:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3392:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3393:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__16846);
            rule__TerminalExpression__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__16849);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3400:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3404:1: ( ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3405:1: ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3405:1: ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3406:1: ( rule__TerminalExpression__FunctionAssignment_4_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_4_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3407:1: ( rule__TerminalExpression__FunctionAssignment_4_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3407:2: rule__TerminalExpression__FunctionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__FunctionAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl6876);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3417:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3 ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3421:1: ( rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3422:2: rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__26906);
            rule__TerminalExpression__Group_4__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__3_in_rule__TerminalExpression__Group_4__26909);
            rule__TerminalExpression__Group_4__3();
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3429:1: rule__TerminalExpression__Group_4__2__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3433:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3434:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3434:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3435:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,24,FOLLOW_24_in_rule__TerminalExpression__Group_4__2__Impl6937); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2()); 

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


    // $ANTLR start rule__TerminalExpression__Group_4__3
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3448:1: rule__TerminalExpression__Group_4__3 : rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4 ;
    public final void rule__TerminalExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3452:1: ( rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3453:2: rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__3__Impl_in_rule__TerminalExpression__Group_4__36968);
            rule__TerminalExpression__Group_4__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__4_in_rule__TerminalExpression__Group_4__36971);
            rule__TerminalExpression__Group_4__4();
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
    // $ANTLR end rule__TerminalExpression__Group_4__3


    // $ANTLR start rule__TerminalExpression__Group_4__3__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3460:1: rule__TerminalExpression__Group_4__3__Impl : ( ( rule__TerminalExpression__Group_4_3__0 )? ) ;
    public final void rule__TerminalExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3464:1: ( ( ( rule__TerminalExpression__Group_4_3__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3465:1: ( ( rule__TerminalExpression__Group_4_3__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3465:1: ( ( rule__TerminalExpression__Group_4_3__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3466:1: ( rule__TerminalExpression__Group_4_3__0 )?
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3467:1: ( rule__TerminalExpression__Group_4_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||(LA23_0>=RULE_INT && LA23_0<=RULE_FLOAT)||LA23_0==24||LA23_0==27||(LA23_0>=29 && LA23_0<=31)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3467:2: rule__TerminalExpression__Group_4_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__0_in_rule__TerminalExpression__Group_4__3__Impl6998);
                    rule__TerminalExpression__Group_4_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalExpressionAccess().getGroup_4_3()); 

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
    // $ANTLR end rule__TerminalExpression__Group_4__3__Impl


    // $ANTLR start rule__TerminalExpression__Group_4__4
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3477:1: rule__TerminalExpression__Group_4__4 : rule__TerminalExpression__Group_4__4__Impl ;
    public final void rule__TerminalExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3481:1: ( rule__TerminalExpression__Group_4__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3482:2: rule__TerminalExpression__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__4__Impl_in_rule__TerminalExpression__Group_4__47029);
            rule__TerminalExpression__Group_4__4__Impl();
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
    // $ANTLR end rule__TerminalExpression__Group_4__4


    // $ANTLR start rule__TerminalExpression__Group_4__4__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3488:1: rule__TerminalExpression__Group_4__4__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3492:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3493:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3493:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3494:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_25_in_rule__TerminalExpression__Group_4__4__Impl7057); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end rule__TerminalExpression__Group_4__4__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_3__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3517:1: rule__TerminalExpression__Group_4_3__0 : rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1 ;
    public final void rule__TerminalExpression__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3521:1: ( rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3522:2: rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__0__Impl_in_rule__TerminalExpression__Group_4_3__07098);
            rule__TerminalExpression__Group_4_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__1_in_rule__TerminalExpression__Group_4_3__07101);
            rule__TerminalExpression__Group_4_3__1();
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
    // $ANTLR end rule__TerminalExpression__Group_4_3__0


    // $ANTLR start rule__TerminalExpression__Group_4_3__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3529:1: rule__TerminalExpression__Group_4_3__0__Impl : ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) ) ;
    public final void rule__TerminalExpression__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3533:1: ( ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3534:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3534:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3535:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3536:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3536:2: rule__TerminalExpression__ArgumentsAssignment_4_3_0
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_0_in_rule__TerminalExpression__Group_4_3__0__Impl7128);
            rule__TerminalExpression__ArgumentsAssignment_4_3_0();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_0()); 

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
    // $ANTLR end rule__TerminalExpression__Group_4_3__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_3__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3546:1: rule__TerminalExpression__Group_4_3__1 : rule__TerminalExpression__Group_4_3__1__Impl ;
    public final void rule__TerminalExpression__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3550:1: ( rule__TerminalExpression__Group_4_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3551:2: rule__TerminalExpression__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__1__Impl_in_rule__TerminalExpression__Group_4_3__17158);
            rule__TerminalExpression__Group_4_3__1__Impl();
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
    // $ANTLR end rule__TerminalExpression__Group_4_3__1


    // $ANTLR start rule__TerminalExpression__Group_4_3__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3557:1: rule__TerminalExpression__Group_4_3__1__Impl : ( ( rule__TerminalExpression__Group_4_3_1__0 )* ) ;
    public final void rule__TerminalExpression__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3561:1: ( ( ( rule__TerminalExpression__Group_4_3_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3562:1: ( ( rule__TerminalExpression__Group_4_3_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3562:1: ( ( rule__TerminalExpression__Group_4_3_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3563:1: ( rule__TerminalExpression__Group_4_3_1__0 )*
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3564:1: ( rule__TerminalExpression__Group_4_3_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3564:2: rule__TerminalExpression__Group_4_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__0_in_rule__TerminalExpression__Group_4_3__1__Impl7185);
            	    rule__TerminalExpression__Group_4_3_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTerminalExpressionAccess().getGroup_4_3_1()); 

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
    // $ANTLR end rule__TerminalExpression__Group_4_3__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_3_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3578:1: rule__TerminalExpression__Group_4_3_1__0 : rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1 ;
    public final void rule__TerminalExpression__Group_4_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3582:1: ( rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3583:2: rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__0__Impl_in_rule__TerminalExpression__Group_4_3_1__07220);
            rule__TerminalExpression__Group_4_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__1_in_rule__TerminalExpression__Group_4_3_1__07223);
            rule__TerminalExpression__Group_4_3_1__1();
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
    // $ANTLR end rule__TerminalExpression__Group_4_3_1__0


    // $ANTLR start rule__TerminalExpression__Group_4_3_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3590:1: rule__TerminalExpression__Group_4_3_1__0__Impl : ( ',' ) ;
    public final void rule__TerminalExpression__Group_4_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3594:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3595:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3595:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3596:1: ','
            {
             before(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_3_1_0()); 
            match(input,26,FOLLOW_26_in_rule__TerminalExpression__Group_4_3_1__0__Impl7251); 
             after(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_3_1_0()); 

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
    // $ANTLR end rule__TerminalExpression__Group_4_3_1__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_4_3_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3609:1: rule__TerminalExpression__Group_4_3_1__1 : rule__TerminalExpression__Group_4_3_1__1__Impl ;
    public final void rule__TerminalExpression__Group_4_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3613:1: ( rule__TerminalExpression__Group_4_3_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3614:2: rule__TerminalExpression__Group_4_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__1__Impl_in_rule__TerminalExpression__Group_4_3_1__17282);
            rule__TerminalExpression__Group_4_3_1__1__Impl();
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
    // $ANTLR end rule__TerminalExpression__Group_4_3_1__1


    // $ANTLR start rule__TerminalExpression__Group_4_3_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3620:1: rule__TerminalExpression__Group_4_3_1__1__Impl : ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_4_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3624:1: ( ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3625:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3625:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3626:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3627:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3627:2: rule__TerminalExpression__ArgumentsAssignment_4_3_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_1_1_in_rule__TerminalExpression__Group_4_3_1__1__Impl7309);
            rule__TerminalExpression__ArgumentsAssignment_4_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_1_1()); 

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
    // $ANTLR end rule__TerminalExpression__Group_4_3_1__1__Impl


    // $ANTLR start rule__SymbolRef__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3641:1: rule__SymbolRef__Group__0 : rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 ;
    public final void rule__SymbolRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3645:1: ( rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3646:2: rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolRef__Group__0__Impl_in_rule__SymbolRef__Group__07343);
            rule__SymbolRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SymbolRef__Group__1_in_rule__SymbolRef__Group__07346);
            rule__SymbolRef__Group__1();
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
    // $ANTLR end rule__SymbolRef__Group__0


    // $ANTLR start rule__SymbolRef__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3653:1: rule__SymbolRef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3657:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3658:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3658:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3659:1: ()
            {
             before(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3660:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3662:1: 
            {
            }

             after(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolRef__Group__0__Impl


    // $ANTLR start rule__SymbolRef__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3672:1: rule__SymbolRef__Group__1 : rule__SymbolRef__Group__1__Impl ;
    public final void rule__SymbolRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3676:1: ( rule__SymbolRef__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3677:2: rule__SymbolRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolRef__Group__1__Impl_in_rule__SymbolRef__Group__17404);
            rule__SymbolRef__Group__1__Impl();
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
    // $ANTLR end rule__SymbolRef__Group__1


    // $ANTLR start rule__SymbolRef__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3683:1: rule__SymbolRef__Group__1__Impl : ( ( rule__SymbolRef__RefAssignment_1 ) ) ;
    public final void rule__SymbolRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3687:1: ( ( ( rule__SymbolRef__RefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3688:1: ( ( rule__SymbolRef__RefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3688:1: ( ( rule__SymbolRef__RefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3689:1: ( rule__SymbolRef__RefAssignment_1 )
            {
             before(grammarAccess.getSymbolRefAccess().getRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3690:1: ( rule__SymbolRef__RefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3690:2: rule__SymbolRef__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__SymbolRef__RefAssignment_1_in_rule__SymbolRef__Group__1__Impl7431);
            rule__SymbolRef__RefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSymbolRefAccess().getRefAssignment_1()); 

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
    // $ANTLR end rule__SymbolRef__Group__1__Impl


    // $ANTLR start rule__PrimitiveLiteral__Group_3__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3704:1: rule__PrimitiveLiteral__Group_3__0 : rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1 ;
    public final void rule__PrimitiveLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3708:1: ( rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3709:2: rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__0__Impl_in_rule__PrimitiveLiteral__Group_3__07465);
            rule__PrimitiveLiteral__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__1_in_rule__PrimitiveLiteral__Group_3__07468);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3716:1: rule__PrimitiveLiteral__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3720:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3721:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3721:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3722:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getIntLiteralAction_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3723:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3725:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3735:1: rule__PrimitiveLiteral__Group_3__1 : rule__PrimitiveLiteral__Group_3__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3739:1: ( rule__PrimitiveLiteral__Group_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3740:2: rule__PrimitiveLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__1__Impl_in_rule__PrimitiveLiteral__Group_3__17526);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3746:1: rule__PrimitiveLiteral__Group_3__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3750:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3751:1: ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3751:1: ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3752:1: ( rule__PrimitiveLiteral__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3753:1: ( rule__PrimitiveLiteral__ValueAssignment_3_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3753:2: rule__PrimitiveLiteral__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_3_1_in_rule__PrimitiveLiteral__Group_3__1__Impl7553);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3767:1: rule__PrimitiveLiteral__Group_4__0 : rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1 ;
    public final void rule__PrimitiveLiteral__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3771:1: ( rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3772:2: rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__0__Impl_in_rule__PrimitiveLiteral__Group_4__07587);
            rule__PrimitiveLiteral__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__1_in_rule__PrimitiveLiteral__Group_4__07590);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3779:1: rule__PrimitiveLiteral__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3783:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3784:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3784:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3785:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getBooleanLiteralAction_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3786:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3788:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3798:1: rule__PrimitiveLiteral__Group_4__1 : rule__PrimitiveLiteral__Group_4__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3802:1: ( rule__PrimitiveLiteral__Group_4__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3803:2: rule__PrimitiveLiteral__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__1__Impl_in_rule__PrimitiveLiteral__Group_4__17648);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3809:1: rule__PrimitiveLiteral__Group_4__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3813:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3814:1: ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3814:1: ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3815:1: ( rule__PrimitiveLiteral__ValueAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_4_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3816:1: ( rule__PrimitiveLiteral__ValueAssignment_4_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3816:2: rule__PrimitiveLiteral__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_4_1_in_rule__PrimitiveLiteral__Group_4__1__Impl7675);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3830:1: rule__PrimitiveLiteral__Group_5__0 : rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1 ;
    public final void rule__PrimitiveLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3834:1: ( rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3835:2: rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__0__Impl_in_rule__PrimitiveLiteral__Group_5__07709);
            rule__PrimitiveLiteral__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__1_in_rule__PrimitiveLiteral__Group_5__07712);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3842:1: rule__PrimitiveLiteral__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3846:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3847:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3847:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3848:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getFloatLiteralAction_5_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3849:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3851:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3861:1: rule__PrimitiveLiteral__Group_5__1 : rule__PrimitiveLiteral__Group_5__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3865:1: ( rule__PrimitiveLiteral__Group_5__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3866:2: rule__PrimitiveLiteral__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__1__Impl_in_rule__PrimitiveLiteral__Group_5__17770);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3872:1: rule__PrimitiveLiteral__Group_5__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3876:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3877:1: ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3877:1: ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3878:1: ( rule__PrimitiveLiteral__ValueAssignment_5_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_5_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3879:1: ( rule__PrimitiveLiteral__ValueAssignment_5_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3879:2: rule__PrimitiveLiteral__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_5_1_in_rule__PrimitiveLiteral__Group_5__1__Impl7797);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3893:1: rule__ThenBlock__Group__0 : rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 ;
    public final void rule__ThenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3897:1: ( rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3898:2: rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__07831);
            rule__ThenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__07834);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3905:1: rule__ThenBlock__Group__0__Impl : ( () ) ;
    public final void rule__ThenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3909:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3910:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3910:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3911:1: ()
            {
             before(grammarAccess.getThenBlockAccess().getThenBlockAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3912:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3914:1: 
            {
            }

             after(grammarAccess.getThenBlockAccess().getThenBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group__0__Impl


    // $ANTLR start rule__ThenBlock__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3924:1: rule__ThenBlock__Group__1 : rule__ThenBlock__Group__1__Impl rule__ThenBlock__Group__2 ;
    public final void rule__ThenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3928:1: ( rule__ThenBlock__Group__1__Impl rule__ThenBlock__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3929:2: rule__ThenBlock__Group__1__Impl rule__ThenBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__17892);
            rule__ThenBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group__2_in_rule__ThenBlock__Group__17895);
            rule__ThenBlock__Group__2();
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3936:1: rule__ThenBlock__Group__1__Impl : ( ( rule__ThenBlock__Alternatives_1 ) ) ;
    public final void rule__ThenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3940:1: ( ( ( rule__ThenBlock__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3941:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3941:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3942:1: ( rule__ThenBlock__Alternatives_1 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3943:1: ( rule__ThenBlock__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3943:2: rule__ThenBlock__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl7922);
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


    // $ANTLR start rule__ThenBlock__Group__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3953:1: rule__ThenBlock__Group__2 : rule__ThenBlock__Group__2__Impl ;
    public final void rule__ThenBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3957:1: ( rule__ThenBlock__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3958:2: rule__ThenBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__2__Impl_in_rule__ThenBlock__Group__27952);
            rule__ThenBlock__Group__2__Impl();
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
    // $ANTLR end rule__ThenBlock__Group__2


    // $ANTLR start rule__ThenBlock__Group__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3964:1: rule__ThenBlock__Group__2__Impl : ( ( rule__ThenBlock__Alternatives_2 ) ) ;
    public final void rule__ThenBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3968:1: ( ( ( rule__ThenBlock__Alternatives_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3969:1: ( ( rule__ThenBlock__Alternatives_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3969:1: ( ( rule__ThenBlock__Alternatives_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3970:1: ( rule__ThenBlock__Alternatives_2 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3971:1: ( rule__ThenBlock__Alternatives_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3971:2: rule__ThenBlock__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_2_in_rule__ThenBlock__Group__2__Impl7979);
            rule__ThenBlock__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getThenBlockAccess().getAlternatives_2()); 

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
    // $ANTLR end rule__ThenBlock__Group__2__Impl


    // $ANTLR start rule__ThenBlock__Group_2_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3987:1: rule__ThenBlock__Group_2_0__0 : rule__ThenBlock__Group_2_0__0__Impl rule__ThenBlock__Group_2_0__1 ;
    public final void rule__ThenBlock__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3991:1: ( rule__ThenBlock__Group_2_0__0__Impl rule__ThenBlock__Group_2_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3992:2: rule__ThenBlock__Group_2_0__0__Impl rule__ThenBlock__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__0__Impl_in_rule__ThenBlock__Group_2_0__08015);
            rule__ThenBlock__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__1_in_rule__ThenBlock__Group_2_0__08018);
            rule__ThenBlock__Group_2_0__1();
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
    // $ANTLR end rule__ThenBlock__Group_2_0__0


    // $ANTLR start rule__ThenBlock__Group_2_0__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3999:1: rule__ThenBlock__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__ThenBlock__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4003:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4004:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4004:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4005:1: '{'
            {
             before(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            match(input,22,FOLLOW_22_in_rule__ThenBlock__Group_2_0__0__Impl8046); 
             after(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_2_0_0()); 

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
    // $ANTLR end rule__ThenBlock__Group_2_0__0__Impl


    // $ANTLR start rule__ThenBlock__Group_2_0__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4018:1: rule__ThenBlock__Group_2_0__1 : rule__ThenBlock__Group_2_0__1__Impl rule__ThenBlock__Group_2_0__2 ;
    public final void rule__ThenBlock__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4022:1: ( rule__ThenBlock__Group_2_0__1__Impl rule__ThenBlock__Group_2_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4023:2: rule__ThenBlock__Group_2_0__1__Impl rule__ThenBlock__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__1__Impl_in_rule__ThenBlock__Group_2_0__18077);
            rule__ThenBlock__Group_2_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__2_in_rule__ThenBlock__Group_2_0__18080);
            rule__ThenBlock__Group_2_0__2();
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
    // $ANTLR end rule__ThenBlock__Group_2_0__1


    // $ANTLR start rule__ThenBlock__Group_2_0__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4030:1: rule__ThenBlock__Group_2_0__1__Impl : ( ( rule__ThenBlock__Group_2_0_1__0 )* ) ;
    public final void rule__ThenBlock__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4034:1: ( ( ( rule__ThenBlock__Group_2_0_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4035:1: ( ( rule__ThenBlock__Group_2_0_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4035:1: ( ( rule__ThenBlock__Group_2_0_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4036:1: ( rule__ThenBlock__Group_2_0_1__0 )*
            {
             before(grammarAccess.getThenBlockAccess().getGroup_2_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4037:1: ( rule__ThenBlock__Group_2_0_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||(LA25_0>=RULE_INT && LA25_0<=RULE_FLOAT)||LA25_0==24||LA25_0==27||(LA25_0>=29 && LA25_0<=31)||LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4037:2: rule__ThenBlock__Group_2_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ThenBlock__Group_2_0_1__0_in_rule__ThenBlock__Group_2_0__1__Impl8107);
            	    rule__ThenBlock__Group_2_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getThenBlockAccess().getGroup_2_0_1()); 

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
    // $ANTLR end rule__ThenBlock__Group_2_0__1__Impl


    // $ANTLR start rule__ThenBlock__Group_2_0__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4047:1: rule__ThenBlock__Group_2_0__2 : rule__ThenBlock__Group_2_0__2__Impl ;
    public final void rule__ThenBlock__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4051:1: ( rule__ThenBlock__Group_2_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4052:2: rule__ThenBlock__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__2__Impl_in_rule__ThenBlock__Group_2_0__28138);
            rule__ThenBlock__Group_2_0__2__Impl();
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
    // $ANTLR end rule__ThenBlock__Group_2_0__2


    // $ANTLR start rule__ThenBlock__Group_2_0__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4058:1: rule__ThenBlock__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__ThenBlock__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4062:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4063:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4063:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4064:1: '}'
            {
             before(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_2_0_2()); 
            match(input,23,FOLLOW_23_in_rule__ThenBlock__Group_2_0__2__Impl8166); 
             after(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_2_0_2()); 

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
    // $ANTLR end rule__ThenBlock__Group_2_0__2__Impl


    // $ANTLR start rule__ThenBlock__Group_2_0_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4083:1: rule__ThenBlock__Group_2_0_1__0 : rule__ThenBlock__Group_2_0_1__0__Impl rule__ThenBlock__Group_2_0_1__1 ;
    public final void rule__ThenBlock__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4087:1: ( rule__ThenBlock__Group_2_0_1__0__Impl rule__ThenBlock__Group_2_0_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4088:2: rule__ThenBlock__Group_2_0_1__0__Impl rule__ThenBlock__Group_2_0_1__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0_1__0__Impl_in_rule__ThenBlock__Group_2_0_1__08203);
            rule__ThenBlock__Group_2_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0_1__1_in_rule__ThenBlock__Group_2_0_1__08206);
            rule__ThenBlock__Group_2_0_1__1();
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
    // $ANTLR end rule__ThenBlock__Group_2_0_1__0


    // $ANTLR start rule__ThenBlock__Group_2_0_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4095:1: rule__ThenBlock__Group_2_0_1__0__Impl : ( ( rule__ThenBlock__StatementsAssignment_2_0_1_0 ) ) ;
    public final void rule__ThenBlock__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4099:1: ( ( ( rule__ThenBlock__StatementsAssignment_2_0_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4100:1: ( ( rule__ThenBlock__StatementsAssignment_2_0_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4100:1: ( ( rule__ThenBlock__StatementsAssignment_2_0_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4101:1: ( rule__ThenBlock__StatementsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getThenBlockAccess().getStatementsAssignment_2_0_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4102:1: ( rule__ThenBlock__StatementsAssignment_2_0_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4102:2: rule__ThenBlock__StatementsAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_2_0_1_0_in_rule__ThenBlock__Group_2_0_1__0__Impl8233);
            rule__ThenBlock__StatementsAssignment_2_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getThenBlockAccess().getStatementsAssignment_2_0_1_0()); 

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
    // $ANTLR end rule__ThenBlock__Group_2_0_1__0__Impl


    // $ANTLR start rule__ThenBlock__Group_2_0_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4112:1: rule__ThenBlock__Group_2_0_1__1 : rule__ThenBlock__Group_2_0_1__1__Impl ;
    public final void rule__ThenBlock__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4116:1: ( rule__ThenBlock__Group_2_0_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4117:2: rule__ThenBlock__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0_1__1__Impl_in_rule__ThenBlock__Group_2_0_1__18263);
            rule__ThenBlock__Group_2_0_1__1__Impl();
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
    // $ANTLR end rule__ThenBlock__Group_2_0_1__1


    // $ANTLR start rule__ThenBlock__Group_2_0_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4123:1: rule__ThenBlock__Group_2_0_1__1__Impl : ( ';' ) ;
    public final void rule__ThenBlock__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4127:1: ( ( ';' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4128:1: ( ';' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4128:1: ( ';' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4129:1: ';'
            {
             before(grammarAccess.getThenBlockAccess().getSemicolonKeyword_2_0_1_1()); 
            match(input,28,FOLLOW_28_in_rule__ThenBlock__Group_2_0_1__1__Impl8291); 
             after(grammarAccess.getThenBlockAccess().getSemicolonKeyword_2_0_1_1()); 

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
    // $ANTLR end rule__ThenBlock__Group_2_0_1__1__Impl


    // $ANTLR start rule__CreateStatement__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4146:1: rule__CreateStatement__Group__0 : rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 ;
    public final void rule__CreateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4150:1: ( rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4151:2: rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__08326);
            rule__CreateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__08329);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4158:1: rule__CreateStatement__Group__0__Impl : ( ( rule__CreateStatement__Group_0__0 )? ) ;
    public final void rule__CreateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4162:1: ( ( ( rule__CreateStatement__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4163:1: ( ( rule__CreateStatement__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4163:1: ( ( rule__CreateStatement__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4164:1: ( rule__CreateStatement__Group_0__0 )?
            {
             before(grammarAccess.getCreateStatementAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4165:1: ( rule__CreateStatement__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==17) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4165:2: rule__CreateStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl8356);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4175:1: rule__CreateStatement__Group__1 : rule__CreateStatement__Group__1__Impl ;
    public final void rule__CreateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4179:1: ( rule__CreateStatement__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4180:2: rule__CreateStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__18387);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4186:1: rule__CreateStatement__Group__1__Impl : ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) ;
    public final void rule__CreateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4190:1: ( ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4191:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4191:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4192:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4193:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4193:2: rule__CreateStatement__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl8414);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4207:1: rule__CreateStatement__Group_0__0 : rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 ;
    public final void rule__CreateStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4211:1: ( rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4212:2: rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__08448);
            rule__CreateStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__08451);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4219:1: rule__CreateStatement__Group_0__0__Impl : ( ( rule__CreateStatement__VarAssignment_0_0 ) ) ;
    public final void rule__CreateStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4223:1: ( ( ( rule__CreateStatement__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4224:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4224:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4225:1: ( rule__CreateStatement__VarAssignment_0_0 )
            {
             before(grammarAccess.getCreateStatementAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4226:1: ( rule__CreateStatement__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4226:2: rule__CreateStatement__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl8478);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4236:1: rule__CreateStatement__Group_0__1 : rule__CreateStatement__Group_0__1__Impl ;
    public final void rule__CreateStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4240:1: ( rule__CreateStatement__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4241:2: rule__CreateStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__18508);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4247:1: rule__CreateStatement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__CreateStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4251:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4252:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4252:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4253:1: ':'
            {
             before(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__CreateStatement__Group_0__1__Impl8536); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4270:1: rule__CreateClass__Group__0 : rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 ;
    public final void rule__CreateClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4274:1: ( rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4275:2: rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__08571);
            rule__CreateClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__08574);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4282:1: rule__CreateClass__Group__0__Impl : ( 'new' ) ;
    public final void rule__CreateClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4286:1: ( ( 'new' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4287:1: ( 'new' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4287:1: ( 'new' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4288:1: 'new'
            {
             before(grammarAccess.getCreateClassAccess().getNewKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__CreateClass__Group__0__Impl8602); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4301:1: rule__CreateClass__Group__1 : rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 ;
    public final void rule__CreateClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4305:1: ( rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4306:2: rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__18633);
            rule__CreateClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__18636);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4313:1: rule__CreateClass__Group__1__Impl : ( ( rule__CreateClass__TypeAssignment_1 ) ) ;
    public final void rule__CreateClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4317:1: ( ( ( rule__CreateClass__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4318:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4318:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4319:1: ( rule__CreateClass__TypeAssignment_1 )
            {
             before(grammarAccess.getCreateClassAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4320:1: ( rule__CreateClass__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4320:2: rule__CreateClass__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl8663);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4330:1: rule__CreateClass__Group__2 : rule__CreateClass__Group__2__Impl ;
    public final void rule__CreateClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4334:1: ( rule__CreateClass__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4335:2: rule__CreateClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__28693);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4341:1: rule__CreateClass__Group__2__Impl : ( ( rule__CreateClass__Group_2__0 )? ) ;
    public final void rule__CreateClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4345:1: ( ( ( rule__CreateClass__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4346:1: ( ( rule__CreateClass__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4346:1: ( ( rule__CreateClass__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4347:1: ( rule__CreateClass__Group_2__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4348:1: ( rule__CreateClass__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4348:2: rule__CreateClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl8720);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4364:1: rule__CreateClass__Group_2__0 : rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 ;
    public final void rule__CreateClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4368:1: ( rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4369:2: rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__08757);
            rule__CreateClass__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__08760);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4376:1: rule__CreateClass__Group_2__0__Impl : ( '{' ) ;
    public final void rule__CreateClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4380:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4381:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4381:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4382:1: '{'
            {
             before(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__CreateClass__Group_2__0__Impl8788); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4395:1: rule__CreateClass__Group_2__1 : rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 ;
    public final void rule__CreateClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4399:1: ( rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4400:2: rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__18819);
            rule__CreateClass__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__18822);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4407:1: rule__CreateClass__Group_2__1__Impl : ( ( rule__CreateClass__Group_2_1__0 )? ) ;
    public final void rule__CreateClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4411:1: ( ( ( rule__CreateClass__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4412:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4412:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4413:1: ( rule__CreateClass__Group_2_1__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4414:1: ( rule__CreateClass__Group_2_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4414:2: rule__CreateClass__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl8849);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4424:1: rule__CreateClass__Group_2__2 : rule__CreateClass__Group_2__2__Impl ;
    public final void rule__CreateClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4428:1: ( rule__CreateClass__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4429:2: rule__CreateClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__28880);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4435:1: rule__CreateClass__Group_2__2__Impl : ( '}' ) ;
    public final void rule__CreateClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4439:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4440:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4440:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4441:1: '}'
            {
             before(grammarAccess.getCreateClassAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__CreateClass__Group_2__2__Impl8908); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4460:1: rule__CreateClass__Group_2_1__0 : rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 ;
    public final void rule__CreateClass__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4464:1: ( rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4465:2: rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__08945);
            rule__CreateClass__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__08948);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4472:1: rule__CreateClass__Group_2_1__0__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) ;
    public final void rule__CreateClass__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4476:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4477:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4477:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4478:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4479:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4479:2: rule__CreateClass__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl8975);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4489:1: rule__CreateClass__Group_2_1__1 : rule__CreateClass__Group_2_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4493:1: ( rule__CreateClass__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4494:2: rule__CreateClass__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__19005);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4500:1: rule__CreateClass__Group_2_1__1__Impl : ( ( rule__CreateClass__Group_2_1_1__0 )* ) ;
    public final void rule__CreateClass__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4504:1: ( ( ( rule__CreateClass__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4505:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4505:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4506:1: ( rule__CreateClass__Group_2_1_1__0 )*
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4507:1: ( rule__CreateClass__Group_2_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4507:2: rule__CreateClass__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl9032);
            	    rule__CreateClass__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4521:1: rule__CreateClass__Group_2_1_1__0 : rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 ;
    public final void rule__CreateClass__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4525:1: ( rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4526:2: rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__09067);
            rule__CreateClass__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__09070);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4533:1: rule__CreateClass__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__CreateClass__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4537:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4538:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4538:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4539:1: ','
            {
             before(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__CreateClass__Group_2_1_1__0__Impl9098); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4552:1: rule__CreateClass__Group_2_1_1__1 : rule__CreateClass__Group_2_1_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4556:1: ( rule__CreateClass__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4557:2: rule__CreateClass__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__19129);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4563:1: rule__CreateClass__Group_2_1_1__1__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__CreateClass__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4567:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4568:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4568:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4569:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4570:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4570:2: rule__CreateClass__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl9156);
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


    // $ANTLR start rule__NullLiteral__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4584:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4588:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4589:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__09190);
            rule__NullLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__09193);
            rule__NullLiteral__Group__1();
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
    // $ANTLR end rule__NullLiteral__Group__0


    // $ANTLR start rule__NullLiteral__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4596:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4600:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4601:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4601:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4602:1: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4603:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4605:1: 
            {
            }

             after(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NullLiteral__Group__0__Impl


    // $ANTLR start rule__NullLiteral__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4615:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4619:1: ( rule__NullLiteral__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4620:2: rule__NullLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__19251);
            rule__NullLiteral__Group__1__Impl();
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
    // $ANTLR end rule__NullLiteral__Group__1


    // $ANTLR start rule__NullLiteral__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4626:1: rule__NullLiteral__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4630:1: ( ( 'null' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4631:1: ( 'null' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4631:1: ( 'null' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4632:1: 'null'
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__NullLiteral__Group__1__Impl9279); 
             after(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 

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
    // $ANTLR end rule__NullLiteral__Group__1__Impl


    // $ANTLR start rule__ListLiteral__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4649:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4653:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4654:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__09314);
            rule__ListLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__09317);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4661:1: rule__ListLiteral__Group__0__Impl : ( () ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4665:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4666:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4666:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4667:1: ()
            {
             before(grammarAccess.getListLiteralAccess().getListLiteralAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4668:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4670:1: 
            {
            }

             after(grammarAccess.getListLiteralAccess().getListLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListLiteral__Group__0__Impl


    // $ANTLR start rule__ListLiteral__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4680:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4684:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4685:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__19375);
            rule__ListLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__19378);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4692:1: rule__ListLiteral__Group__1__Impl : ( '[' ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4696:1: ( ( '[' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4697:1: ( '[' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4697:1: ( '[' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4698:1: '['
            {
             before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__ListLiteral__Group__1__Impl9406); 
             after(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4711:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4715:1: ( rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4716:2: rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__29437);
            rule__ListLiteral__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__29440);
            rule__ListLiteral__Group__3();
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4723:1: rule__ListLiteral__Group__2__Impl : ( ( rule__ListLiteral__Group_2__0 )? ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4727:1: ( ( ( rule__ListLiteral__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4728:1: ( ( rule__ListLiteral__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4728:1: ( ( rule__ListLiteral__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4729:1: ( rule__ListLiteral__Group_2__0 )?
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4730:1: ( rule__ListLiteral__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||(LA30_0>=RULE_INT && LA30_0<=RULE_FLOAT)||LA30_0==24||LA30_0==27||(LA30_0>=29 && LA30_0<=31)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4730:2: rule__ListLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl9467);
                    rule__ListLiteral__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListLiteralAccess().getGroup_2()); 

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


    // $ANTLR start rule__ListLiteral__Group__3
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4740:1: rule__ListLiteral__Group__3 : rule__ListLiteral__Group__3__Impl ;
    public final void rule__ListLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4744:1: ( rule__ListLiteral__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4745:2: rule__ListLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__39498);
            rule__ListLiteral__Group__3__Impl();
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
    // $ANTLR end rule__ListLiteral__Group__3


    // $ANTLR start rule__ListLiteral__Group__3__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4751:1: rule__ListLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__ListLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4755:1: ( ( ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4756:1: ( ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4756:1: ( ']' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4757:1: ']'
            {
             before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__ListLiteral__Group__3__Impl9526); 
             after(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end rule__ListLiteral__Group__3__Impl


    // $ANTLR start rule__ListLiteral__Group_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4778:1: rule__ListLiteral__Group_2__0 : rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 ;
    public final void rule__ListLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4782:1: ( rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4783:2: rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__09565);
            rule__ListLiteral__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__09568);
            rule__ListLiteral__Group_2__1();
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
    // $ANTLR end rule__ListLiteral__Group_2__0


    // $ANTLR start rule__ListLiteral__Group_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4790:1: rule__ListLiteral__Group_2__0__Impl : ( ( rule__ListLiteral__ItemsAssignment_2_0 ) ) ;
    public final void rule__ListLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4794:1: ( ( ( rule__ListLiteral__ItemsAssignment_2_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4795:1: ( ( rule__ListLiteral__ItemsAssignment_2_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4795:1: ( ( rule__ListLiteral__ItemsAssignment_2_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4796:1: ( rule__ListLiteral__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4797:1: ( rule__ListLiteral__ItemsAssignment_2_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4797:2: rule__ListLiteral__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl9595);
            rule__ListLiteral__ItemsAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getItemsAssignment_2_0()); 

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
    // $ANTLR end rule__ListLiteral__Group_2__0__Impl


    // $ANTLR start rule__ListLiteral__Group_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4807:1: rule__ListLiteral__Group_2__1 : rule__ListLiteral__Group_2__1__Impl ;
    public final void rule__ListLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4811:1: ( rule__ListLiteral__Group_2__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4812:2: rule__ListLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__19625);
            rule__ListLiteral__Group_2__1__Impl();
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
    // $ANTLR end rule__ListLiteral__Group_2__1


    // $ANTLR start rule__ListLiteral__Group_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4818:1: rule__ListLiteral__Group_2__1__Impl : ( ( rule__ListLiteral__Group_2_1__0 )* ) ;
    public final void rule__ListLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4822:1: ( ( ( rule__ListLiteral__Group_2_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4823:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4823:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4824:1: ( rule__ListLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4825:1: ( rule__ListLiteral__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4825:2: rule__ListLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl9652);
            	    rule__ListLiteral__Group_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getListLiteralAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__ListLiteral__Group_2__1__Impl


    // $ANTLR start rule__ListLiteral__Group_2_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4839:1: rule__ListLiteral__Group_2_1__0 : rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 ;
    public final void rule__ListLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4843:1: ( rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4844:2: rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__09687);
            rule__ListLiteral__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__09690);
            rule__ListLiteral__Group_2_1__1();
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
    // $ANTLR end rule__ListLiteral__Group_2_1__0


    // $ANTLR start rule__ListLiteral__Group_2_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4851:1: rule__ListLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ListLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4855:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4856:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4856:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4857:1: ','
            {
             before(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FOLLOW_26_in_rule__ListLiteral__Group_2_1__0__Impl9718); 
             after(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end rule__ListLiteral__Group_2_1__0__Impl


    // $ANTLR start rule__ListLiteral__Group_2_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4870:1: rule__ListLiteral__Group_2_1__1 : rule__ListLiteral__Group_2_1__1__Impl ;
    public final void rule__ListLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4874:1: ( rule__ListLiteral__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4875:2: rule__ListLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__19749);
            rule__ListLiteral__Group_2_1__1__Impl();
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
    // $ANTLR end rule__ListLiteral__Group_2_1__1


    // $ANTLR start rule__ListLiteral__Group_2_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4881:1: rule__ListLiteral__Group_2_1__1__Impl : ( ( rule__ListLiteral__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__ListLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4885:1: ( ( ( rule__ListLiteral__ItemsAssignment_2_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4886:1: ( ( rule__ListLiteral__ItemsAssignment_2_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4886:1: ( ( rule__ListLiteral__ItemsAssignment_2_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4887:1: ( rule__ListLiteral__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4888:1: ( rule__ListLiteral__ItemsAssignment_2_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4888:2: rule__ListLiteral__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl9776);
            rule__ListLiteral__ItemsAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getListLiteralAccess().getItemsAssignment_2_1_1()); 

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
    // $ANTLR end rule__ListLiteral__Group_2_1__1__Impl


    // $ANTLR start rule__Setter__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4902:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4906:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4907:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
            {
            pushFollow(FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__09810);
            rule__Setter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__09813);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4914:1: rule__Setter__Group__0__Impl : ( ( rule__Setter__PropertyAssignment_0 ) ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4918:1: ( ( ( rule__Setter__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4919:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4919:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4920:1: ( rule__Setter__PropertyAssignment_0 )
            {
             before(grammarAccess.getSetterAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4921:1: ( rule__Setter__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4921:2: rule__Setter__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl9840);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4931:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4935:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4936:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
            {
            pushFollow(FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__19870);
            rule__Setter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__19873);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4943:1: rule__Setter__Group__1__Impl : ( ( rule__Setter__Alternatives_1 ) ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4947:1: ( ( ( rule__Setter__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4948:1: ( ( rule__Setter__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4948:1: ( ( rule__Setter__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4949:1: ( rule__Setter__Alternatives_1 )
            {
             before(grammarAccess.getSetterAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4950:1: ( rule__Setter__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4950:2: rule__Setter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl9900);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4960:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4964:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4965:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
            {
            pushFollow(FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__29930);
            rule__Setter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__29933);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4972:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__ExpressionAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4976:1: ( ( ( rule__Setter__ExpressionAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4977:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4977:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4978:1: ( rule__Setter__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getExpressionAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4979:1: ( rule__Setter__ExpressionAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4979:2: rule__Setter__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl9960);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4989:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4993:1: ( rule__Setter__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4994:2: rule__Setter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__39990);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5000:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__GuardAssignment_3 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5004:1: ( ( ( rule__Setter__GuardAssignment_3 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5005:1: ( ( rule__Setter__GuardAssignment_3 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5005:1: ( ( rule__Setter__GuardAssignment_3 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5006:1: ( rule__Setter__GuardAssignment_3 )?
            {
             before(grammarAccess.getSetterAccess().getGuardAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5007:1: ( rule__Setter__GuardAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5007:2: rule__Setter__GuardAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl10017);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5025:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5029:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5030:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__010056);
            rule__Function__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__010059);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5037:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5041:1: ( ( 'function' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5042:1: ( 'function' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5042:1: ( 'function' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5043:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Function__Group__0__Impl10087); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5056:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5060:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5061:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__110118);
            rule__Function__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__110121);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5068:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5072:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5073:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5073:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5074:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5075:1: ( rule__Function__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5075:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl10148);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5085:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5089:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5090:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__210178);
            rule__Function__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__210181);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5097:1: rule__Function__Group__2__Impl : ( ( rule__Function__JavaClassAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5101:1: ( ( ( rule__Function__JavaClassAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5102:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5102:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5103:1: ( rule__Function__JavaClassAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5104:1: ( rule__Function__JavaClassAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5104:2: rule__Function__JavaClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl10208);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5114:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5118:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5119:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__310238);
            rule__Function__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__310241);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5126:1: rule__Function__Group__3__Impl : ( '#' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5130:1: ( ( '#' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5131:1: ( '#' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5131:1: ( '#' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5132:1: '#'
            {
             before(grammarAccess.getFunctionAccess().getNumberSignKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Function__Group__3__Impl10269); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5145:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5149:1: ( rule__Function__Group__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5150:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__410300);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5156:1: rule__Function__Group__4__Impl : ( ( rule__Function__OperationAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5160:1: ( ( ( rule__Function__OperationAssignment_4 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5161:1: ( ( rule__Function__OperationAssignment_4 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5161:1: ( ( rule__Function__OperationAssignment_4 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5162:1: ( rule__Function__OperationAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getOperationAssignment_4()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5163:1: ( rule__Function__OperationAssignment_4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5163:2: rule__Function__OperationAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__OperationAssignment_4_in_rule__Function__Group__4__Impl10327);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5183:1: rule__UpdateStatement__Group__0 : rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 ;
    public final void rule__UpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5187:1: ( rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5188:2: rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__010367);
            rule__UpdateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__010370);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5195:1: rule__UpdateStatement__Group__0__Impl : ( 'update' ) ;
    public final void rule__UpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5199:1: ( ( 'update' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5200:1: ( 'update' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5200:1: ( 'update' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5201:1: 'update'
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__UpdateStatement__Group__0__Impl10398); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5214:1: rule__UpdateStatement__Group__1 : rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 ;
    public final void rule__UpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5218:1: ( rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5219:2: rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__110429);
            rule__UpdateStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__110432);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5226:1: rule__UpdateStatement__Group__1__Impl : ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) ;
    public final void rule__UpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5230:1: ( ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5231:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5231:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5232:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5233:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5233:2: rule__UpdateStatement__VarRefAssignment_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl10459);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5243:1: rule__UpdateStatement__Group__2 : rule__UpdateStatement__Group__2__Impl ;
    public final void rule__UpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5247:1: ( rule__UpdateStatement__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5248:2: rule__UpdateStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__210489);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5254:1: rule__UpdateStatement__Group__2__Impl : ( ( rule__UpdateStatement__Group_2__0 )? ) ;
    public final void rule__UpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5258:1: ( ( ( rule__UpdateStatement__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5259:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5259:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5260:1: ( rule__UpdateStatement__Group_2__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5261:1: ( rule__UpdateStatement__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5261:2: rule__UpdateStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl10516);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5277:1: rule__UpdateStatement__Group_2__0 : rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 ;
    public final void rule__UpdateStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5281:1: ( rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5282:2: rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__010553);
            rule__UpdateStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__010556);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5289:1: rule__UpdateStatement__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UpdateStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5293:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5294:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5294:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5295:1: '{'
            {
             before(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__UpdateStatement__Group_2__0__Impl10584); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5308:1: rule__UpdateStatement__Group_2__1 : rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 ;
    public final void rule__UpdateStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5312:1: ( rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5313:2: rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__110615);
            rule__UpdateStatement__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__110618);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5320:1: rule__UpdateStatement__Group_2__1__Impl : ( ( rule__UpdateStatement__Group_2_1__0 )? ) ;
    public final void rule__UpdateStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5324:1: ( ( ( rule__UpdateStatement__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5325:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5325:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5326:1: ( rule__UpdateStatement__Group_2_1__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5327:1: ( rule__UpdateStatement__Group_2_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5327:2: rule__UpdateStatement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl10645);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5337:1: rule__UpdateStatement__Group_2__2 : rule__UpdateStatement__Group_2__2__Impl ;
    public final void rule__UpdateStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5341:1: ( rule__UpdateStatement__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5342:2: rule__UpdateStatement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__210676);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5348:1: rule__UpdateStatement__Group_2__2__Impl : ( '}' ) ;
    public final void rule__UpdateStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5352:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5353:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5353:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5354:1: '}'
            {
             before(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__UpdateStatement__Group_2__2__Impl10704); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5373:1: rule__UpdateStatement__Group_2_1__0 : rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 ;
    public final void rule__UpdateStatement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5377:1: ( rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5378:2: rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__010741);
            rule__UpdateStatement__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__010744);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5385:1: rule__UpdateStatement__Group_2_1__0__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) ;
    public final void rule__UpdateStatement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5389:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5390:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5390:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5391:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5392:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5392:2: rule__UpdateStatement__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl10771);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5402:1: rule__UpdateStatement__Group_2_1__1 : rule__UpdateStatement__Group_2_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5406:1: ( rule__UpdateStatement__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5407:2: rule__UpdateStatement__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__110801);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5413:1: rule__UpdateStatement__Group_2_1__1__Impl : ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) ;
    public final void rule__UpdateStatement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5417:1: ( ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5418:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5418:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5419:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5420:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5420:2: rule__UpdateStatement__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl10828);
            	    rule__UpdateStatement__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5434:1: rule__UpdateStatement__Group_2_1_1__0 : rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 ;
    public final void rule__UpdateStatement__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5438:1: ( rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5439:2: rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__010863);
            rule__UpdateStatement__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__010866);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5446:1: rule__UpdateStatement__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__UpdateStatement__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5450:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5451:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5451:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5452:1: ','
            {
             before(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__UpdateStatement__Group_2_1_1__0__Impl10894); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5465:1: rule__UpdateStatement__Group_2_1_1__1 : rule__UpdateStatement__Group_2_1_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5469:1: ( rule__UpdateStatement__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5470:2: rule__UpdateStatement__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__110925);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5476:1: rule__UpdateStatement__Group_2_1_1__1__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__UpdateStatement__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5480:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5481:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5481:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5482:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5483:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5483:2: rule__UpdateStatement__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl10952);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5497:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5501:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5502:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__010986);
            rule__FQN__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__010989);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5509:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5513:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5514:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5514:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5515:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl11016); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5526:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5530:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5531:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__111045);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5537:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5541:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5542:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5542:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5543:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5544:1: ( rule__FQN__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5544:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl11072);
            	    rule__FQN__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5558:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5562:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5563:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__011107);
            rule__FQN__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__011110);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5570:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5574:1: ( ( '.' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5575:1: ( '.' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5575:1: ( '.' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5576:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__FQN__Group_1__0__Impl11138); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5589:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5593:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5594:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__111169);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5600:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5604:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5605:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5605:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5606:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl11196); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5625:1: rule__Scaffolding__ScaffoldAssignment_0 : ( ruleScaffold ) ;
    public final void rule__Scaffolding__ScaffoldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5629:1: ( ( ruleScaffold ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5630:1: ( ruleScaffold )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5630:1: ( ruleScaffold )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5631:1: ruleScaffold
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldScaffoldParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_011237);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5640:1: rule__Scaffolding__ElementsAssignment_1 : ( ruleScaffoldingElement ) ;
    public final void rule__Scaffolding__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5644:1: ( ( ruleScaffoldingElement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5645:1: ( ruleScaffoldingElement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5645:1: ( ruleScaffoldingElement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5646:1: ruleScaffoldingElement
            {
             before(grammarAccess.getScaffoldingAccess().getElementsScaffoldingElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_111268);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5655:1: rule__Scaffold__RefPackageAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Scaffold__RefPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5659:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5660:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5660:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5661:1: ( RULE_STRING )
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageEPackageCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5662:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5663:1: RULE_STRING
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageEPackageSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_111303); 
             after(grammarAccess.getScaffoldAccess().getRefPackageEPackageSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getScaffoldAccess().getRefPackageEPackageCrossReference_1_0()); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5674:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5678:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5679:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5679:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5680:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_111338); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5689:1: rule__Rule__WhenAssignment_2 : ( ruleWhenBlock ) ;
    public final void rule__Rule__WhenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5693:1: ( ( ruleWhenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5694:1: ( ruleWhenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5694:1: ( ruleWhenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5695:1: ruleWhenBlock
            {
             before(grammarAccess.getRuleAccess().getWhenWhenBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_211369);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5704:1: rule__Rule__ThenAssignment_3 : ( ruleThenBlock ) ;
    public final void rule__Rule__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5708:1: ( ( ruleThenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5709:1: ( ruleThenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5709:1: ( ruleThenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5710:1: ruleThenBlock
            {
             before(grammarAccess.getRuleAccess().getThenThenBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_311400);
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


    // $ANTLR start rule__WhenBlock__MatchesAssignment_2_0_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5719:1: rule__WhenBlock__MatchesAssignment_2_0_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5723:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5724:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5724:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5725:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_2_0_111431);
            ruleMatch();
            _fsp--;

             after(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end rule__WhenBlock__MatchesAssignment_2_0_1


    // $ANTLR start rule__WhenBlock__MatchesAssignment_2_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5734:1: rule__WhenBlock__MatchesAssignment_2_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5738:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5739:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5739:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5740:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_2_111462);
            ruleMatch();
            _fsp--;

             after(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__WhenBlock__MatchesAssignment_2_1


    // $ANTLR start rule__Match__VarAssignment_0_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5749:1: rule__Match__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__Match__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5753:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5754:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5754:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5755:1: ruleVariable
            {
             before(grammarAccess.getMatchAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_011493);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5764:1: rule__Match__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Match__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5768:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5769:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5769:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5770:1: ( RULE_ID )
            {
             before(grammarAccess.getMatchAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5771:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5772:1: RULE_ID
            {
             before(grammarAccess.getMatchAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_111528); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5783:1: rule__Match__ParamsAssignment_2_1_0 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5787:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5788:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5788:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5789:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_011563);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5798:1: rule__Match__ParamsAssignment_2_1_1_1 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5802:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5803:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5803:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5804:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_111594);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5813:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5817:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5818:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5818:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5819:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment11625); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5828:1: rule__Param__PropertyAssignment_0 : ( ruleBindingExpression ) ;
    public final void rule__Param__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5832:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5833:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5833:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5834:1: ruleBindingExpression
            {
             before(grammarAccess.getParamAccess().getPropertyBindingExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__Param__PropertyAssignment_011656);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5843:1: rule__Param__VarAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__Param__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5847:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5848:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5848:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5849:1: ruleVariable
            {
             before(grammarAccess.getParamAccess().getVarVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_111687);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5858:1: rule__BindingExpression__OpAssignment_1_1 : ( RULE_OPERATOR_LOW_PRIORITY ) ;
    public final void rule__BindingExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5862:1: ( ( RULE_OPERATOR_LOW_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5863:1: ( RULE_OPERATOR_LOW_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5863:1: ( RULE_OPERATOR_LOW_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5864:1: RULE_OPERATOR_LOW_PRIORITY
            {
             before(grammarAccess.getBindingExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__BindingExpression__OpAssignment_1_111718); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5873:1: rule__BindingExpression__RightAssignment_1_2 : ( ruleBindingExpression ) ;
    public final void rule__BindingExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5877:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5878:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5878:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5879:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingExpressionAccess().getRightBindingExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingExpression__RightAssignment_1_211749);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5888:1: rule__BindingExpressionHigh__OpAssignment_1_1 : ( RULE_OPERATOR_HIGH_PRIORITY ) ;
    public final void rule__BindingExpressionHigh__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5892:1: ( ( RULE_OPERATOR_HIGH_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5893:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5893:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5894:1: RULE_OPERATOR_HIGH_PRIORITY
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__BindingExpressionHigh__OpAssignment_1_111780); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5903:1: rule__BindingExpressionHigh__RightAssignment_1_2 : ( ruleBindingExpressionHigh ) ;
    public final void rule__BindingExpressionHigh__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5907:1: ( ( ruleBindingExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5908:1: ( ruleBindingExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5908:1: ( ruleBindingExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5909:1: ruleBindingExpressionHigh
            {
             before(grammarAccess.getBindingExpressionHighAccess().getRightBindingExpressionHighParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpressionHigh__RightAssignment_1_211811);
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


    // $ANTLR start rule__BindingTerminalExpression__ExpAssignment_1_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5918:1: rule__BindingTerminalExpression__ExpAssignment_1_2 : ( ruleBindingTerminalExpression ) ;
    public final void rule__BindingTerminalExpression__ExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5922:1: ( ( ruleBindingTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5923:1: ( ruleBindingTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5923:1: ( ruleBindingTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5924:1: ruleBindingTerminalExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingTerminalExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_rule__BindingTerminalExpression__ExpAssignment_1_211842);
            ruleBindingTerminalExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingTerminalExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end rule__BindingTerminalExpression__ExpAssignment_1_2


    // $ANTLR start rule__BindingTerminalExpression__FunctionAssignment_3_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5933:1: rule__BindingTerminalExpression__FunctionAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__BindingTerminalExpression__FunctionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5937:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5938:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5938:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5939:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionCrossReference_3_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5940:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5941:1: RULE_ID
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BindingTerminalExpression__FunctionAssignment_3_111877); 
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


    // $ANTLR start rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5952:1: rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5956:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5957:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5957:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5958:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsBindingExpressionParserRuleCall_3_3_0_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_011912);
            ruleBindingExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsBindingExpressionParserRuleCall_3_3_0_0()); 

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
    // $ANTLR end rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0


    // $ANTLR start rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5967:1: rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5971:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5972:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5972:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5973:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsBindingExpressionParserRuleCall_3_3_1_1_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_111943);
            ruleBindingExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsBindingExpressionParserRuleCall_3_3_1_1_0()); 

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
    // $ANTLR end rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1


    // $ANTLR start rule__Expression__OpAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5982:1: rule__Expression__OpAssignment_1_1 : ( RULE_OPERATOR_LOW_PRIORITY ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5986:1: ( ( RULE_OPERATOR_LOW_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5987:1: ( RULE_OPERATOR_LOW_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5987:1: ( RULE_OPERATOR_LOW_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5988:1: RULE_OPERATOR_LOW_PRIORITY
            {
             before(grammarAccess.getExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__Expression__OpAssignment_1_111974); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5997:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6001:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6002:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6002:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6003:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_212005);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6012:1: rule__ExpressionHigh__OpAssignment_1_1 : ( RULE_OPERATOR_HIGH_PRIORITY ) ;
    public final void rule__ExpressionHigh__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6016:1: ( ( RULE_OPERATOR_HIGH_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6017:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6017:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6018:1: RULE_OPERATOR_HIGH_PRIORITY
            {
             before(grammarAccess.getExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__ExpressionHigh__OpAssignment_1_112036); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6027:1: rule__ExpressionHigh__RightAssignment_1_2 : ( ruleExpressionHigh ) ;
    public final void rule__ExpressionHigh__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6031:1: ( ( ruleExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6032:1: ( ruleExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6032:1: ( ruleExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6033:1: ruleExpressionHigh
            {
             before(grammarAccess.getExpressionHighAccess().getRightExpressionHighParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_rule__ExpressionHigh__RightAssignment_1_212067);
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


    // $ANTLR start rule__TerminalExpression__ExpAssignment_2_2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6042:1: rule__TerminalExpression__ExpAssignment_2_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6046:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6047:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6047:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6048:1: ruleTerminalExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__TerminalExpression__ExpAssignment_2_212098);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_2_2_0()); 

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
    // $ANTLR end rule__TerminalExpression__ExpAssignment_2_2


    // $ANTLR start rule__TerminalExpression__FunctionAssignment_4_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6057:1: rule__TerminalExpression__FunctionAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__FunctionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6061:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6062:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6062:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6063:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_4_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6064:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6065:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_4_112133); 
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


    // $ANTLR start rule__TerminalExpression__ArgumentsAssignment_4_3_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6076:1: rule__TerminalExpression__ArgumentsAssignment_4_3_0 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgumentsAssignment_4_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6080:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6081:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6081:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6082:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_012168);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_0_0()); 

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
    // $ANTLR end rule__TerminalExpression__ArgumentsAssignment_4_3_0


    // $ANTLR start rule__TerminalExpression__ArgumentsAssignment_4_3_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6091:1: rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgumentsAssignment_4_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6095:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6096:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6096:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6097:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_1_112199);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_1_1_0()); 

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
    // $ANTLR end rule__TerminalExpression__ArgumentsAssignment_4_3_1_1


    // $ANTLR start rule__SymbolRef__RefAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6106:1: rule__SymbolRef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SymbolRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6110:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6111:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6111:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6112:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolRefAccess().getRefSymbolCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6113:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6114:1: RULE_ID
            {
             before(grammarAccess.getSymbolRefAccess().getRefSymbolIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolRef__RefAssignment_112234); 
             after(grammarAccess.getSymbolRefAccess().getRefSymbolIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSymbolRefAccess().getRefSymbolCrossReference_1_0()); 

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
    // $ANTLR end rule__SymbolRef__RefAssignment_1


    // $ANTLR start rule__PrimitiveLiteral__ValueAssignment_3_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6125:1: rule__PrimitiveLiteral__ValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6129:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6130:1: ( RULE_INT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6130:1: ( RULE_INT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6131:1: RULE_INT
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrimitiveLiteral__ValueAssignment_3_112269); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6140:1: rule__PrimitiveLiteral__ValueAssignment_4_1 : ( RULE_BOOLEAN ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6144:1: ( ( RULE_BOOLEAN ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6145:1: ( RULE_BOOLEAN )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6145:1: ( RULE_BOOLEAN )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6146:1: RULE_BOOLEAN
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueBOOLEANTerminalRuleCall_4_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__PrimitiveLiteral__ValueAssignment_4_112300); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6155:1: rule__PrimitiveLiteral__ValueAssignment_5_1 : ( RULE_FLOAT ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6159:1: ( ( RULE_FLOAT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6160:1: ( RULE_FLOAT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6160:1: ( RULE_FLOAT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6161:1: RULE_FLOAT
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueFLOATTerminalRuleCall_5_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__PrimitiveLiteral__ValueAssignment_5_112331); 
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


    // $ANTLR start rule__FeatureRef__FeatureAssignment
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6170:1: rule__FeatureRef__FeatureAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FeatureRef__FeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6174:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6175:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6175:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6176:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureCrossReference_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6177:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6178:1: RULE_ID
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureRef__FeatureAssignment12366); 
             after(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureCrossReference_0()); 

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
    // $ANTLR end rule__FeatureRef__FeatureAssignment


    // $ANTLR start rule__ThenBlock__StatementsAssignment_2_0_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6189:1: rule__ThenBlock__StatementsAssignment_2_0_1_0 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6193:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6194:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6194:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6195:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_2_0_1_012401);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_2_0_1_0_0()); 

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
    // $ANTLR end rule__ThenBlock__StatementsAssignment_2_0_1_0


    // $ANTLR start rule__ThenBlock__StatementsAssignment_2_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6204:1: rule__ThenBlock__StatementsAssignment_2_1 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6208:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6209:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6209:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6210:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_2_112432);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__ThenBlock__StatementsAssignment_2_1


    // $ANTLR start rule__CreateStatement__VarAssignment_0_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6219:1: rule__CreateStatement__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__CreateStatement__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6223:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6224:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6224:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6225:1: ruleVariable
            {
             before(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_012463);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6234:1: rule__CreateStatement__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__CreateStatement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6238:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6239:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6239:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6240:1: ruleExpression
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_112494);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6249:1: rule__CreateClass__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CreateClass__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6253:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6254:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6254:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6255:1: ( RULE_ID )
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6256:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6257:1: RULE_ID
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_112529); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6268:1: rule__CreateClass__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6272:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6273:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6273:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6274:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_012564);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6283:1: rule__CreateClass__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6287:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6288:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6288:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6289:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_112595);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6298:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6302:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6303:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6303:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6304:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12626); 
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


    // $ANTLR start rule__ListLiteral__ItemsAssignment_2_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6313:1: rule__ListLiteral__ItemsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6317:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6318:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6318:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6319:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_2_012657);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_2_0_0()); 

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
    // $ANTLR end rule__ListLiteral__ItemsAssignment_2_0


    // $ANTLR start rule__ListLiteral__ItemsAssignment_2_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6328:1: rule__ListLiteral__ItemsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6332:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6333:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6333:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6334:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_2_1_112688);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end rule__ListLiteral__ItemsAssignment_2_1_1


    // $ANTLR start rule__Setter__PropertyAssignment_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6343:1: rule__Setter__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Setter__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6347:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6348:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6348:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6349:1: ( RULE_ID )
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6350:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6351:1: RULE_ID
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_012723); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6362:1: rule__Setter__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Setter__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6366:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6367:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6367:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6368:1: ruleExpression
            {
             before(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_212758);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6377:1: rule__Setter__GuardAssignment_3 : ( ( 'guard' ) ) ;
    public final void rule__Setter__GuardAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6381:1: ( ( ( 'guard' ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6382:1: ( ( 'guard' ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6382:1: ( ( 'guard' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6383:1: ( 'guard' )
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6384:1: ( 'guard' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6385:1: 'guard'
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Setter__GuardAssignment_312794); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6400:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6404:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6405:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6405:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6406:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_112833); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6415:1: rule__Function__JavaClassAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Function__JavaClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6419:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6420:1: ( ( ruleFQN ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6420:1: ( ( ruleFQN ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6421:1: ( ruleFQN )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeCrossReference_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6422:1: ( ruleFQN )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6423:1: ruleFQN
            {
             before(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Function__JavaClassAssignment_212868);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6434:1: rule__Function__OperationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Function__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6438:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6439:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6439:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6440:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getOperationJvmOperationCrossReference_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6441:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6442:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getOperationJvmOperationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__OperationAssignment_412907); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6453:1: rule__UpdateStatement__VarRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UpdateStatement__VarRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6457:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6458:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6458:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6459:1: ( RULE_ID )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6460:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6461:1: RULE_ID
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_112946); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6472:1: rule__UpdateStatement__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6476:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6477:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6477:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6478:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_012981);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6487:1: rule__UpdateStatement__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6491:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6492:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6492:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6493:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_113012);
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
    public static final BitSet FOLLOW_ruleSymbolRef_in_entryRuleSymbolRef903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolRef910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__0_in_ruleSymbolRef936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteral970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Alternatives_in_rulePrimitiveLiteral996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__FeatureAssignment_in_ruleFeatureRef1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_entryRuleThenBlock1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenBlock1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0_in_ruleThenBlock1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateStatement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0_in_ruleCreateStatement1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_entryRuleCreateClass1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateClass1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0_in_ruleCreateClass1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_entryRuleSetter1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetter1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0_in_ruleSetter1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0_in_ruleUpdateStatement1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__0_in_rule__WhenBlock__Alternatives_21807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_2_1_in_rule__WhenBlock__Alternatives_21825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__0_in_rule__BindingTerminalExpression__Alternatives1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__0_in_rule__BindingTerminalExpression__Alternatives1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolRef_in_rule__BindingTerminalExpression__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__0_in_rule__BindingTerminalExpression__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_rule__BindingTerminalExpression__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolRef_in_rule__TerminalExpression__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_rule__TerminalExpression__Alternatives2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__PrimitiveLiteral__Alternatives2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__PrimitiveLiteral__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__PrimitiveLiteral__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__0_in_rule__PrimitiveLiteral__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__0_in_rule__PrimitiveLiteral__Alternatives2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__0_in_rule__PrimitiveLiteral__Alternatives2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ThenBlock__Alternatives_12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ThenBlock__Alternatives_12223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__0_in_rule__ThenBlock__Alternatives_22257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_2_1_in_rule__ThenBlock__Alternatives_22275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Setter__Alternatives_12358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Setter__Alternatives_12378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02411 = new BitSet(new long[]{0x0000000200100002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2498 = new BitSet(new long[]{0x0000000200100002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Scaffold__Group__0__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group__0__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12718 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22778 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__02903 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__02906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__12964 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__2_in_rule__WhenBlock__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__WhenBlock__Group__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__2__Impl_in_rule__WhenBlock__Group__23026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Alternatives_2_in_rule__WhenBlock__Group__2__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__0__Impl_in_rule__WhenBlock__Group_2_0__03089 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__1_in_rule__WhenBlock__Group_2_0__03092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__WhenBlock__Group_2_0__0__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__1__Impl_in_rule__WhenBlock__Group_2_0__13151 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__2_in_rule__WhenBlock__Group_2_0__13154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_2_0_1_in_rule__WhenBlock__Group_2_0__1__Impl3181 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__2__Impl_in_rule__WhenBlock__Group_2_0__23212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WhenBlock__Group_2_0__2__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__03277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Match__Group__1_in_rule__Match__Group__03280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13338 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03462 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Match__Group_0__1__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03585 = new BitSet(new long[]{0x00000000CB000730L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Match__Group_2__0__Impl3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13647 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Match__Group_2__2__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03773 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3860 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__03895 = new BitSet(new long[]{0x00000000C9000730L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__03898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Match__Group_2_1_1__0__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__13957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__04018 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__04021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__14078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__04140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__04143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Param__Group_1__0__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__14202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__0__Impl_in_rule__BindingExpression__Group__04263 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__1_in_rule__BindingExpression__Group__04266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpression__Group__0__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__1__Impl_in_rule__BindingExpression__Group__14322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__0_in_rule__BindingExpression__Group__1__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__0__Impl_in_rule__BindingExpression__Group_1__04384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__1_in_rule__BindingExpression__Group_1__04387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__1__Impl_in_rule__BindingExpression__Group_1__14445 = new BitSet(new long[]{0x00000000C9000730L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__2_in_rule__BindingExpression__Group_1__14448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__OpAssignment_1_1_in_rule__BindingExpression__Group_1__1__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__2__Impl_in_rule__BindingExpression__Group_1__24505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__RightAssignment_1_2_in_rule__BindingExpression__Group_1__2__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__0__Impl_in_rule__BindingExpressionHigh__Group__04568 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__1_in_rule__BindingExpressionHigh__Group__04571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_rule__BindingExpressionHigh__Group__0__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__1__Impl_in_rule__BindingExpressionHigh__Group__14627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__0_in_rule__BindingExpressionHigh__Group__1__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__0__Impl_in_rule__BindingExpressionHigh__Group_1__04689 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__1_in_rule__BindingExpressionHigh__Group_1__04692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__1__Impl_in_rule__BindingExpressionHigh__Group_1__14750 = new BitSet(new long[]{0x00000000C9000730L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__2_in_rule__BindingExpressionHigh__Group_1__14753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__OpAssignment_1_1_in_rule__BindingExpressionHigh__Group_1__1__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__2__Impl_in_rule__BindingExpressionHigh__Group_1__24810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__RightAssignment_1_2_in_rule__BindingExpressionHigh__Group_1__2__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__0__Impl_in_rule__BindingTerminalExpression__Group_0__04873 = new BitSet(new long[]{0x00000000C9000730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__1_in_rule__BindingTerminalExpression__Group_0__04876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BindingTerminalExpression__Group_0__0__Impl4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__1__Impl_in_rule__BindingTerminalExpression__Group_0__14935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__2_in_rule__BindingTerminalExpression__Group_0__14938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__Group_0__1__Impl4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__2__Impl_in_rule__BindingTerminalExpression__Group_0__24994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BindingTerminalExpression__Group_0__2__Impl5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__0__Impl_in_rule__BindingTerminalExpression__Group_1__05059 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__1_in_rule__BindingTerminalExpression__Group_1__05062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__1__Impl_in_rule__BindingTerminalExpression__Group_1__15120 = new BitSet(new long[]{0x00000000C9000730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__2_in_rule__BindingTerminalExpression__Group_1__15123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BindingTerminalExpression__Group_1__1__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__2__Impl_in_rule__BindingTerminalExpression__Group_1__25182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ExpAssignment_1_2_in_rule__BindingTerminalExpression__Group_1__2__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__0__Impl_in_rule__BindingTerminalExpression__Group_3__05245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__1_in_rule__BindingTerminalExpression__Group_3__05248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__1__Impl_in_rule__BindingTerminalExpression__Group_3__15306 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__2_in_rule__BindingTerminalExpression__Group_3__15309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__FunctionAssignment_3_1_in_rule__BindingTerminalExpression__Group_3__1__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__2__Impl_in_rule__BindingTerminalExpression__Group_3__25366 = new BitSet(new long[]{0x00000000CB000730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__3_in_rule__BindingTerminalExpression__Group_3__25369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BindingTerminalExpression__Group_3__2__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__3__Impl_in_rule__BindingTerminalExpression__Group_3__35428 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__4_in_rule__BindingTerminalExpression__Group_3__35431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3__0_in_rule__BindingTerminalExpression__Group_3__3__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__4__Impl_in_rule__BindingTerminalExpression__Group_3__45489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BindingTerminalExpression__Group_3__4__Impl5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3__0__Impl_in_rule__BindingTerminalExpression__Group_3_3__05558 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3__1_in_rule__BindingTerminalExpression__Group_3_3__05561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0_in_rule__BindingTerminalExpression__Group_3_3__0__Impl5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3__1__Impl_in_rule__BindingTerminalExpression__Group_3_3__15618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__0_in_rule__BindingTerminalExpression__Group_3_3__1__Impl5645 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__0__Impl_in_rule__BindingTerminalExpression__Group_3_3_1__05680 = new BitSet(new long[]{0x00000000C9000730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__1_in_rule__BindingTerminalExpression__Group_3_3_1__05683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BindingTerminalExpression__Group_3_3_1__0__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__1__Impl_in_rule__BindingTerminalExpression__Group_3_3_1__15742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1_in_rule__BindingTerminalExpression__Group_3_3_1__1__Impl5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05803 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_rule__Expression__Group__0__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05924 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15985 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__15988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__26045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__0__Impl_in_rule__ExpressionHigh__Group__06108 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__1_in_rule__ExpressionHigh__Group__06111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__ExpressionHigh__Group__0__Impl6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__1__Impl_in_rule__ExpressionHigh__Group__16167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__0_in_rule__ExpressionHigh__Group__1__Impl6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__0__Impl_in_rule__ExpressionHigh__Group_1__06229 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__1_in_rule__ExpressionHigh__Group_1__06232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__1__Impl_in_rule__ExpressionHigh__Group_1__16290 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__2_in_rule__ExpressionHigh__Group_1__16293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__OpAssignment_1_1_in_rule__ExpressionHigh__Group_1__1__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__2__Impl_in_rule__ExpressionHigh__Group_1__26350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__RightAssignment_1_2_in_rule__ExpressionHigh__Group_1__2__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__06413 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__06416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TerminalExpression__Group_0__0__Impl6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__16475 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__16478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__26534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TerminalExpression__Group_0__2__Impl6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__06599 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__06602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__16660 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__2_in_rule__TerminalExpression__Group_2__16663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TerminalExpression__Group_2__1__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__2__Impl_in_rule__TerminalExpression__Group_2__26722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ExpAssignment_2_2_in_rule__TerminalExpression__Group_2__2__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__06785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__06788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__16846 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__16849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__FunctionAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__26906 = new BitSet(new long[]{0x00000000EB000730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__3_in_rule__TerminalExpression__Group_4__26909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TerminalExpression__Group_4__2__Impl6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__3__Impl_in_rule__TerminalExpression__Group_4__36968 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__4_in_rule__TerminalExpression__Group_4__36971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__0_in_rule__TerminalExpression__Group_4__3__Impl6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__4__Impl_in_rule__TerminalExpression__Group_4__47029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TerminalExpression__Group_4__4__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__0__Impl_in_rule__TerminalExpression__Group_4_3__07098 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__1_in_rule__TerminalExpression__Group_4_3__07101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_0_in_rule__TerminalExpression__Group_4_3__0__Impl7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__1__Impl_in_rule__TerminalExpression__Group_4_3__17158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__0_in_rule__TerminalExpression__Group_4_3__1__Impl7185 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__0__Impl_in_rule__TerminalExpression__Group_4_3_1__07220 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__1_in_rule__TerminalExpression__Group_4_3_1__07223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TerminalExpression__Group_4_3_1__0__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__1__Impl_in_rule__TerminalExpression__Group_4_3_1__17282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_1_1_in_rule__TerminalExpression__Group_4_3_1__1__Impl7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__0__Impl_in_rule__SymbolRef__Group__07343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__1_in_rule__SymbolRef__Group__07346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__1__Impl_in_rule__SymbolRef__Group__17404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__RefAssignment_1_in_rule__SymbolRef__Group__1__Impl7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__0__Impl_in_rule__PrimitiveLiteral__Group_3__07465 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__1_in_rule__PrimitiveLiteral__Group_3__07468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__1__Impl_in_rule__PrimitiveLiteral__Group_3__17526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_3_1_in_rule__PrimitiveLiteral__Group_3__1__Impl7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__0__Impl_in_rule__PrimitiveLiteral__Group_4__07587 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__1_in_rule__PrimitiveLiteral__Group_4__07590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__1__Impl_in_rule__PrimitiveLiteral__Group_4__17648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_4_1_in_rule__PrimitiveLiteral__Group_4__1__Impl7675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__0__Impl_in_rule__PrimitiveLiteral__Group_5__07709 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__1_in_rule__PrimitiveLiteral__Group_5__07712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__1__Impl_in_rule__PrimitiveLiteral__Group_5__17770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_5_1_in_rule__PrimitiveLiteral__Group_5__1__Impl7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__07831 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__07834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__17892 = new BitSet(new long[]{0x00000008E9400730L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__2_in_rule__ThenBlock__Group__17895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__2__Impl_in_rule__ThenBlock__Group__27952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_2_in_rule__ThenBlock__Group__2__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__0__Impl_in_rule__ThenBlock__Group_2_0__08015 = new BitSet(new long[]{0x00000008E9800730L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__1_in_rule__ThenBlock__Group_2_0__08018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ThenBlock__Group_2_0__0__Impl8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__1__Impl_in_rule__ThenBlock__Group_2_0__18077 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__2_in_rule__ThenBlock__Group_2_0__18080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0_1__0_in_rule__ThenBlock__Group_2_0__1__Impl8107 = new BitSet(new long[]{0x00000008E9000732L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__2__Impl_in_rule__ThenBlock__Group_2_0__28138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ThenBlock__Group_2_0__2__Impl8166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0_1__0__Impl_in_rule__ThenBlock__Group_2_0_1__08203 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0_1__1_in_rule__ThenBlock__Group_2_0_1__08206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_2_0_1_0_in_rule__ThenBlock__Group_2_0_1__0__Impl8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0_1__1__Impl_in_rule__ThenBlock__Group_2_0_1__18263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ThenBlock__Group_2_0_1__1__Impl8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__08326 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__08329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl8356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__18387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__08448 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__08451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__18508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CreateStatement__Group_0__1__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__08571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__08574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CreateClass__Group__0__Impl8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__18633 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__18636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__28693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__08757 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__08760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CreateClass__Group_2__0__Impl8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__18819 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__18822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__28880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CreateClass__Group_2__2__Impl8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__08945 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__08948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__19005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl9032 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__09067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__09070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CreateClass__Group_2_1_1__0__Impl9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__19129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__09190 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__09193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__19251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NullLiteral__Group__1__Impl9279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__09314 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__09317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__19375 = new BitSet(new long[]{0x00000001E9000730L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__19378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ListLiteral__Group__1__Impl9406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__29437 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__29440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl9467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__39498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ListLiteral__Group__3__Impl9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__09565 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__09568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__19625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl9652 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__09687 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__09690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ListLiteral__Group_2_1__0__Impl9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__19749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl9776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__09810 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__09813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__19870 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__19873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__29930 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__29933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__39990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl10017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__010056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__010059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Function__Group__0__Impl10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__110118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__110121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__210178 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__210181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__310238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__310241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Function__Group__3__Impl10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__410300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OperationAssignment_4_in_rule__Function__Group__4__Impl10327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__010367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__010370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UpdateStatement__Group__0__Impl10398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__110429 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__110432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__210489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__010553 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__010556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UpdateStatement__Group_2__0__Impl10584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__110615 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__110618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl10645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__210676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UpdateStatement__Group_2__2__Impl10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__010741 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__010744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl10771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__110801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl10828 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__010863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__010866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UpdateStatement__Group_2_1_1__0__Impl10894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__110925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl10952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__010986 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__010989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__111045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl11072 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__011107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__011110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FQN__Group_1__0__Impl11138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__111169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_011237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_111268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_111303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_111338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_211369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_311400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_2_0_111431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_2_111462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_011493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_111528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_011563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_111594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment11625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__Param__PropertyAssignment_011656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_111687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__BindingExpression__OpAssignment_1_111718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingExpression__RightAssignment_1_211749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__BindingExpressionHigh__OpAssignment_1_111780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpressionHigh__RightAssignment_1_211811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_rule__BindingTerminalExpression__ExpAssignment_1_211842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BindingTerminalExpression__FunctionAssignment_3_111877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_011912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_111943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__Expression__OpAssignment_1_111974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_212005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__ExpressionHigh__OpAssignment_1_112036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_rule__ExpressionHigh__RightAssignment_1_212067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__TerminalExpression__ExpAssignment_2_212098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_4_112133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_012168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_1_112199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolRef__RefAssignment_112234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrimitiveLiteral__ValueAssignment_3_112269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__PrimitiveLiteral__ValueAssignment_4_112300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__PrimitiveLiteral__ValueAssignment_5_112331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureRef__FeatureAssignment12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_2_0_1_012401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_2_112432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_012463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_112494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_112529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_012564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_112595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_2_012657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_2_1_112688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_012723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_212758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Setter__GuardAssignment_312794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_112833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Function__JavaClassAssignment_212868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__OperationAssignment_412907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_112946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_012981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_113012 = new BitSet(new long[]{0x0000000000000002L});

}