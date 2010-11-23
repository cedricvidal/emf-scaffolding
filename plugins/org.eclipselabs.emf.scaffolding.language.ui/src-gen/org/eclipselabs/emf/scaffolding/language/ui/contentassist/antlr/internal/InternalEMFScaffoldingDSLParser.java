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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_OPERATOR_LOW_PRIORITY", "RULE_OPERATOR_HIGH_PRIORITY", "RULE_INT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'null'", "'then'", "'->'", "':'", "'+='", "'scaffold'", "'rule'", "'when'", "'{'", "'}'", "'('", "')'", "','", "'!'", "';'", "'new'", "'['", "']'", "'function'", "'#'", "'update'", "'.'", "'guard'"
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:688:1: ruleNullLiteral : ( 'null' ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:692:2: ( ( 'null' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:693:1: ( 'null' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:693:1: ( 'null' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:694:1: 'null'
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword()); 
            match(input,15,FOLLOW_15_in_ruleNullLiteral1417); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:709:1: entryRuleListLiteral : ruleListLiteral EOF ;
    public final void entryRuleListLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:710:1: ( ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:711:1: ruleListLiteral EOF
            {
             before(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral1445);
            ruleListLiteral();
            _fsp--;

             after(grammarAccess.getListLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral1452); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:718:1: ruleListLiteral : ( ( rule__ListLiteral__Group__0 ) ) ;
    public final void ruleListLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:722:2: ( ( ( rule__ListLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:1: ( ( rule__ListLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:1: ( ( rule__ListLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:724:1: ( rule__ListLiteral__Group__0 )
            {
             before(grammarAccess.getListLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:725:1: ( rule__ListLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:725:2: rule__ListLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1478);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:855:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );
    public final void rule__ScaffoldingElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:859:1: ( ( ruleRule ) | ( ruleFunction ) )
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
                    new NoViableAltException("855:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:860:1: ( ruleRule )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:860:1: ( ruleRule )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:861:1: ruleRule
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1760);
                    ruleRule();
                    _fsp--;

                     after(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:866:6: ( ruleFunction )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:866:6: ( ruleFunction )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:867:1: ruleFunction
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1777);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:877:1: rule__WhenBlock__Alternatives_1 : ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) );
    public final void rule__WhenBlock__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:881:1: ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) )
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
                    new NoViableAltException("877:1: rule__WhenBlock__Alternatives_1 : ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:882:1: ( ( rule__WhenBlock__Group_1_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:882:1: ( ( rule__WhenBlock__Group_1_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:883:1: ( rule__WhenBlock__Group_1_0__0 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getGroup_1_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:884:1: ( rule__WhenBlock__Group_1_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:884:2: rule__WhenBlock__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__0_in_rule__WhenBlock__Alternatives_11809);
                    rule__WhenBlock__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getWhenBlockAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:888:6: ( ( rule__WhenBlock__MatchesAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:888:6: ( ( rule__WhenBlock__MatchesAssignment_1_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:889:1: ( rule__WhenBlock__MatchesAssignment_1_1 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_1_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:890:1: ( rule__WhenBlock__MatchesAssignment_1_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:890:2: rule__WhenBlock__MatchesAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_1_1_in_rule__WhenBlock__Alternatives_11827);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:900:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ( rule__BindingTerminalExpression__Group_1__0 ) ) | ( ruleSymbolRef ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );
    public final void rule__BindingTerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:904:1: ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ( rule__BindingTerminalExpression__Group_1__0 ) ) | ( ruleSymbolRef ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==25) ) {
                    alt3=4;
                }
                else if ( (LA3_3==EOF||(LA3_3>=RULE_OPERATOR_LOW_PRIORITY && LA3_3<=RULE_OPERATOR_HIGH_PRIORITY)||LA3_3==18||(LA3_3>=26 && LA3_3<=27)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("900:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ( rule__BindingTerminalExpression__Group_1__0 ) ) | ( ruleSymbolRef ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 15:
            case 31:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("900:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ( rule__BindingTerminalExpression__Group_1__0 ) ) | ( ruleSymbolRef ) | ( ( rule__BindingTerminalExpression__Group_3__0 ) ) | ( rulePrimitiveLiteral ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:905:1: ( ( rule__BindingTerminalExpression__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:905:1: ( ( rule__BindingTerminalExpression__Group_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:906:1: ( rule__BindingTerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:907:1: ( rule__BindingTerminalExpression__Group_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:907:2: rule__BindingTerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__0_in_rule__BindingTerminalExpression__Alternatives1861);
                    rule__BindingTerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:911:6: ( ( rule__BindingTerminalExpression__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:911:6: ( ( rule__BindingTerminalExpression__Group_1__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:912:1: ( rule__BindingTerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:913:1: ( rule__BindingTerminalExpression__Group_1__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:913:2: rule__BindingTerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__0_in_rule__BindingTerminalExpression__Alternatives1879);
                    rule__BindingTerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:917:6: ( ruleSymbolRef )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:917:6: ( ruleSymbolRef )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:918:1: ruleSymbolRef
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getSymbolRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSymbolRef_in_rule__BindingTerminalExpression__Alternatives1897);
                    ruleSymbolRef();
                    _fsp--;

                     after(grammarAccess.getBindingTerminalExpressionAccess().getSymbolRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:923:6: ( ( rule__BindingTerminalExpression__Group_3__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:923:6: ( ( rule__BindingTerminalExpression__Group_3__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:924:1: ( rule__BindingTerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:925:1: ( rule__BindingTerminalExpression__Group_3__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:925:2: rule__BindingTerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__0_in_rule__BindingTerminalExpression__Alternatives1914);
                    rule__BindingTerminalExpression__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:929:6: ( rulePrimitiveLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:929:6: ( rulePrimitiveLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:930:1: rulePrimitiveLiteral
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_rule__BindingTerminalExpression__Alternatives1932);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:940:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:944:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==25) ) {
                    alt4=5;
                }
                else if ( (LA4_4==EOF||(LA4_4>=RULE_OPERATOR_LOW_PRIORITY && LA4_4<=RULE_OPERATOR_HIGH_PRIORITY)||LA4_4==21||LA4_4==24||(LA4_4>=26 && LA4_4<=27)||LA4_4==29||(LA4_4>=32 && LA4_4<=33)||LA4_4==37) ) {
                    alt4=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("940:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 15:
            case 31:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("940:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:945:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:945:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:946:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:947:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:947:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1964);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:951:6: ( ruleCreateClass )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:951:6: ( ruleCreateClass )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:952:1: ruleCreateClass
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives1982);
                    ruleCreateClass();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:957:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:957:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:958:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:959:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:959:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1999);
                    rule__TerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:963:6: ( ruleSymbolRef )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:963:6: ( ruleSymbolRef )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:964:1: ruleSymbolRef
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getSymbolRefParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSymbolRef_in_rule__TerminalExpression__Alternatives2017);
                    ruleSymbolRef();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getSymbolRefParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:969:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:969:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:970:1: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:971:1: ( rule__TerminalExpression__Group_4__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:971:2: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives2034);
                    rule__TerminalExpression__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:975:6: ( rulePrimitiveLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:975:6: ( rulePrimitiveLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:976:1: rulePrimitiveLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_rule__TerminalExpression__Alternatives2052);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:986:1: rule__PrimitiveLiteral__Alternatives : ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) );
    public final void rule__PrimitiveLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:990:1: ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) )
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
                    new NoViableAltException("986:1: rule__PrimitiveLiteral__Alternatives : ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:991:1: ( ruleListLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:991:1: ( ruleListLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:992:1: ruleListLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__PrimitiveLiteral__Alternatives2084);
                    ruleListLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:997:6: ( ruleStringLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:997:6: ( ruleStringLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:998:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__PrimitiveLiteral__Alternatives2101);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1003:6: ( ruleNullLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1003:6: ( ruleNullLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1004:1: ruleNullLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__PrimitiveLiteral__Alternatives2118);
                    ruleNullLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1009:6: ( ( rule__PrimitiveLiteral__Group_3__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1009:6: ( ( rule__PrimitiveLiteral__Group_3__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1010:1: ( rule__PrimitiveLiteral__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_3()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1011:1: ( rule__PrimitiveLiteral__Group_3__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1011:2: rule__PrimitiveLiteral__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__0_in_rule__PrimitiveLiteral__Alternatives2135);
                    rule__PrimitiveLiteral__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1015:6: ( ( rule__PrimitiveLiteral__Group_4__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1015:6: ( ( rule__PrimitiveLiteral__Group_4__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1016:1: ( rule__PrimitiveLiteral__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_4()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1017:1: ( rule__PrimitiveLiteral__Group_4__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1017:2: rule__PrimitiveLiteral__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__0_in_rule__PrimitiveLiteral__Alternatives2153);
                    rule__PrimitiveLiteral__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1021:6: ( ( rule__PrimitiveLiteral__Group_5__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1021:6: ( ( rule__PrimitiveLiteral__Group_5__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1022:1: ( rule__PrimitiveLiteral__Group_5__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_5()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1023:1: ( rule__PrimitiveLiteral__Group_5__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1023:2: rule__PrimitiveLiteral__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__0_in_rule__PrimitiveLiteral__Alternatives2171);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1032:1: rule__ThenBlock__Alternatives_0 : ( ( 'then' ) | ( '->' ) );
    public final void rule__ThenBlock__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1036:1: ( ( 'then' ) | ( '->' ) )
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
                    new NoViableAltException("1032:1: rule__ThenBlock__Alternatives_0 : ( ( 'then' ) | ( '->' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1037:1: ( 'then' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1037:1: ( 'then' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1038:1: 'then'
                    {
                     before(grammarAccess.getThenBlockAccess().getThenKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__ThenBlock__Alternatives_02205); 
                     after(grammarAccess.getThenBlockAccess().getThenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1045:6: ( '->' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1045:6: ( '->' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1046:1: '->'
                    {
                     before(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__ThenBlock__Alternatives_02225); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1058:1: rule__ThenBlock__Alternatives_1 : ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) );
    public final void rule__ThenBlock__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1062:1: ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=RULE_INT && LA7_0<=RULE_FLOAT)||LA7_0==15||LA7_0==25||LA7_0==28||(LA7_0>=30 && LA7_0<=31)||LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1058:1: rule__ThenBlock__Alternatives_1 : ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1063:1: ( ( rule__ThenBlock__Group_1_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1063:1: ( ( rule__ThenBlock__Group_1_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1064:1: ( rule__ThenBlock__Group_1_0__0 )
                    {
                     before(grammarAccess.getThenBlockAccess().getGroup_1_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1065:1: ( rule__ThenBlock__Group_1_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1065:2: rule__ThenBlock__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__0_in_rule__ThenBlock__Alternatives_12259);
                    rule__ThenBlock__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getThenBlockAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1069:6: ( ( rule__ThenBlock__StatementsAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1069:6: ( ( rule__ThenBlock__StatementsAssignment_1_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1070:1: ( rule__ThenBlock__StatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1071:1: ( rule__ThenBlock__StatementsAssignment_1_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1071:2: rule__ThenBlock__StatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_1_1_in_rule__ThenBlock__Alternatives_12277);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1080:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1084:1: ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||(LA8_0>=RULE_INT && LA8_0<=RULE_FLOAT)||LA8_0==15||LA8_0==25||LA8_0==28||(LA8_0>=30 && LA8_0<=31)) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1080:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1085:1: ( ruleCreateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1085:1: ( ruleCreateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1086:1: ruleCreateStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2310);
                    ruleCreateStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1091:6: ( ruleUpdateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1091:6: ( ruleUpdateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1092:1: ruleUpdateStatement
                    {
                     before(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2327);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1102:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );
    public final void rule__Setter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1106:1: ( ( ':' ) | ( '+=' ) )
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
                    new NoViableAltException("1102:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1107:1: ( ':' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1107:1: ( ':' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1108:1: ':'
                    {
                     before(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 
                    match(input,18,FOLLOW_18_in_rule__Setter__Alternatives_12360); 
                     after(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1115:6: ( '+=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1115:6: ( '+=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1116:1: '+='
                    {
                     before(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1()); 
                    match(input,19,FOLLOW_19_in_rule__Setter__Alternatives_12380); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1131:1: rule__Scaffolding__Group__0 : rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 ;
    public final void rule__Scaffolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1135:1: ( rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1136:2: rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02413);
            rule__Scaffolding__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02416);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1143:1: rule__Scaffolding__Group__0__Impl : ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) ;
    public final void rule__Scaffolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1147:1: ( ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1148:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1148:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1149:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1150:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1150:2: rule__Scaffolding__ScaffoldAssignment_0
            {
            pushFollow(FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2443);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1160:1: rule__Scaffolding__Group__1 : rule__Scaffolding__Group__1__Impl ;
    public final void rule__Scaffolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1164:1: ( rule__Scaffolding__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1165:2: rule__Scaffolding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12473);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1171:1: rule__Scaffolding__Group__1__Impl : ( ( rule__Scaffolding__ElementsAssignment_1 )* ) ;
    public final void rule__Scaffolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1175:1: ( ( ( rule__Scaffolding__ElementsAssignment_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1176:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1176:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1177:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            {
             before(grammarAccess.getScaffoldingAccess().getElementsAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1178:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1178:2: rule__Scaffolding__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2500);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1192:1: rule__Scaffold__Group__0 : rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 ;
    public final void rule__Scaffold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1196:1: ( rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1197:2: rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02535);
            rule__Scaffold__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02538);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1204:1: rule__Scaffold__Group__0__Impl : ( 'scaffold' ) ;
    public final void rule__Scaffold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1208:1: ( ( 'scaffold' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1209:1: ( 'scaffold' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1209:1: ( 'scaffold' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1210:1: 'scaffold'
            {
             before(grammarAccess.getScaffoldAccess().getScaffoldKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Scaffold__Group__0__Impl2566); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1223:1: rule__Scaffold__Group__1 : rule__Scaffold__Group__1__Impl ;
    public final void rule__Scaffold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1227:1: ( rule__Scaffold__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1228:2: rule__Scaffold__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12597);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1234:1: rule__Scaffold__Group__1__Impl : ( ( rule__Scaffold__RefPackageAssignment_1 ) ) ;
    public final void rule__Scaffold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1238:1: ( ( ( rule__Scaffold__RefPackageAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1239:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1239:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1240:1: ( rule__Scaffold__RefPackageAssignment_1 )
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1241:1: ( rule__Scaffold__RefPackageAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1241:2: rule__Scaffold__RefPackageAssignment_1
            {
            pushFollow(FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2624);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1255:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1259:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1260:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02658);
            rule__Rule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02661);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1267:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1271:1: ( ( 'rule' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1272:1: ( 'rule' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1272:1: ( 'rule' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1273:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Rule__Group__0__Impl2689); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1286:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1290:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1291:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12720);
            rule__Rule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12723);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1298:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1302:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1303:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1303:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1304:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1305:1: ( rule__Rule__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1305:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2750);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1315:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1319:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1320:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22780);
            rule__Rule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22783);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1327:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__WhenAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1331:1: ( ( ( rule__Rule__WhenAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1332:1: ( ( rule__Rule__WhenAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1332:1: ( ( rule__Rule__WhenAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1333:1: ( rule__Rule__WhenAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getWhenAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1334:1: ( rule__Rule__WhenAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1334:2: rule__Rule__WhenAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2810);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1344:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1348:1: ( rule__Rule__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1349:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32840);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1355:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ThenAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1359:1: ( ( ( rule__Rule__ThenAssignment_3 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1360:1: ( ( rule__Rule__ThenAssignment_3 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1360:1: ( ( rule__Rule__ThenAssignment_3 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1361:1: ( rule__Rule__ThenAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getThenAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1362:1: ( rule__Rule__ThenAssignment_3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1362:2: rule__Rule__ThenAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl2867);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1380:1: rule__WhenBlock__Group__0 : rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 ;
    public final void rule__WhenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1384:1: ( rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1385:2: rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__02905);
            rule__WhenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__02908);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1392:1: rule__WhenBlock__Group__0__Impl : ( 'when' ) ;
    public final void rule__WhenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1396:1: ( ( 'when' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1397:1: ( 'when' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1397:1: ( 'when' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1398:1: 'when'
            {
             before(grammarAccess.getWhenBlockAccess().getWhenKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__WhenBlock__Group__0__Impl2936); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1411:1: rule__WhenBlock__Group__1 : rule__WhenBlock__Group__1__Impl ;
    public final void rule__WhenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1415:1: ( rule__WhenBlock__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1416:2: rule__WhenBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__12967);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1422:1: rule__WhenBlock__Group__1__Impl : ( ( rule__WhenBlock__Alternatives_1 ) ) ;
    public final void rule__WhenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1426:1: ( ( ( rule__WhenBlock__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1427:1: ( ( rule__WhenBlock__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1427:1: ( ( rule__WhenBlock__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1428:1: ( rule__WhenBlock__Alternatives_1 )
            {
             before(grammarAccess.getWhenBlockAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1429:1: ( rule__WhenBlock__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1429:2: rule__WhenBlock__Alternatives_1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Alternatives_1_in_rule__WhenBlock__Group__1__Impl2994);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1443:1: rule__WhenBlock__Group_1_0__0 : rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1 ;
    public final void rule__WhenBlock__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1447:1: ( rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1448:2: rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__0__Impl_in_rule__WhenBlock__Group_1_0__03028);
            rule__WhenBlock__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__1_in_rule__WhenBlock__Group_1_0__03031);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1455:1: rule__WhenBlock__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__WhenBlock__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1459:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1460:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1460:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1461:1: '{'
            {
             before(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__WhenBlock__Group_1_0__0__Impl3059); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1474:1: rule__WhenBlock__Group_1_0__1 : rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2 ;
    public final void rule__WhenBlock__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1478:1: ( rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1479:2: rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__1__Impl_in_rule__WhenBlock__Group_1_0__13090);
            rule__WhenBlock__Group_1_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__2_in_rule__WhenBlock__Group_1_0__13093);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1486:1: rule__WhenBlock__Group_1_0__1__Impl : ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* ) ;
    public final void rule__WhenBlock__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1490:1: ( ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1491:1: ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1491:1: ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1492:1: ( rule__WhenBlock__MatchesAssignment_1_0_1 )*
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_1_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1493:1: ( rule__WhenBlock__MatchesAssignment_1_0_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1493:2: rule__WhenBlock__MatchesAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_1_0_1_in_rule__WhenBlock__Group_1_0__1__Impl3120);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1503:1: rule__WhenBlock__Group_1_0__2 : rule__WhenBlock__Group_1_0__2__Impl ;
    public final void rule__WhenBlock__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1507:1: ( rule__WhenBlock__Group_1_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1508:2: rule__WhenBlock__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__2__Impl_in_rule__WhenBlock__Group_1_0__23151);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1514:1: rule__WhenBlock__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__WhenBlock__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1518:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1519:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1519:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1520:1: '}'
            {
             before(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_1_0_2()); 
            match(input,24,FOLLOW_24_in_rule__WhenBlock__Group_1_0__2__Impl3179); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1539:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1543:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1544:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__03216);
            rule__Match__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__1_in_rule__Match__Group__03219);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1551:1: rule__Match__Group__0__Impl : ( ( rule__Match__Group_0__0 )? ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1555:1: ( ( ( rule__Match__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1556:1: ( ( rule__Match__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1556:1: ( ( rule__Match__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1557:1: ( rule__Match__Group_0__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1558:1: ( rule__Match__Group_0__0 )?
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
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1558:2: rule__Match__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3246);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1568:1: rule__Match__Group__1 : rule__Match__Group__1__Impl rule__Match__Group__2 ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1572:1: ( rule__Match__Group__1__Impl rule__Match__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1573:2: rule__Match__Group__1__Impl rule__Match__Group__2
            {
            pushFollow(FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13277);
            rule__Match__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13280);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1580:1: rule__Match__Group__1__Impl : ( ( rule__Match__TypeAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1584:1: ( ( ( rule__Match__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1585:1: ( ( rule__Match__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1585:1: ( ( rule__Match__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1586:1: ( rule__Match__TypeAssignment_1 )
            {
             before(grammarAccess.getMatchAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1587:1: ( rule__Match__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1587:2: rule__Match__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3307);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1597:1: rule__Match__Group__2 : rule__Match__Group__2__Impl ;
    public final void rule__Match__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1601:1: ( rule__Match__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1602:2: rule__Match__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23337);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1608:1: rule__Match__Group__2__Impl : ( ( rule__Match__Group_2__0 )? ) ;
    public final void rule__Match__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1612:1: ( ( ( rule__Match__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1613:1: ( ( rule__Match__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1613:1: ( ( rule__Match__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1614:1: ( rule__Match__Group_2__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1615:1: ( rule__Match__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1615:2: rule__Match__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3364);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1631:1: rule__Match__Group_0__0 : rule__Match__Group_0__0__Impl rule__Match__Group_0__1 ;
    public final void rule__Match__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1635:1: ( rule__Match__Group_0__0__Impl rule__Match__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1636:2: rule__Match__Group_0__0__Impl rule__Match__Group_0__1
            {
            pushFollow(FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03401);
            rule__Match__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03404);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1643:1: rule__Match__Group_0__0__Impl : ( ( rule__Match__VarAssignment_0_0 ) ) ;
    public final void rule__Match__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1647:1: ( ( ( rule__Match__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1648:1: ( ( rule__Match__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1648:1: ( ( rule__Match__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1649:1: ( rule__Match__VarAssignment_0_0 )
            {
             before(grammarAccess.getMatchAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1650:1: ( rule__Match__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1650:2: rule__Match__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3431);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1660:1: rule__Match__Group_0__1 : rule__Match__Group_0__1__Impl ;
    public final void rule__Match__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1664:1: ( rule__Match__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1665:2: rule__Match__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13461);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1671:1: rule__Match__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Match__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1675:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1676:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1676:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1677:1: ':'
            {
             before(grammarAccess.getMatchAccess().getColonKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__Match__Group_0__1__Impl3489); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1694:1: rule__Match__Group_2__0 : rule__Match__Group_2__0__Impl rule__Match__Group_2__1 ;
    public final void rule__Match__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1698:1: ( rule__Match__Group_2__0__Impl rule__Match__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1699:2: rule__Match__Group_2__0__Impl rule__Match__Group_2__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03524);
            rule__Match__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03527);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1706:1: rule__Match__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Match__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1710:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1711:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1711:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1712:1: '('
            {
             before(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Match__Group_2__0__Impl3555); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1725:1: rule__Match__Group_2__1 : rule__Match__Group_2__1__Impl rule__Match__Group_2__2 ;
    public final void rule__Match__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1729:1: ( rule__Match__Group_2__1__Impl rule__Match__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1730:2: rule__Match__Group_2__1__Impl rule__Match__Group_2__2
            {
            pushFollow(FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13586);
            rule__Match__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13589);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1737:1: rule__Match__Group_2__1__Impl : ( ( rule__Match__Group_2_1__0 )? ) ;
    public final void rule__Match__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1741:1: ( ( ( rule__Match__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1742:1: ( ( rule__Match__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1742:1: ( ( rule__Match__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1743:1: ( rule__Match__Group_2_1__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1744:1: ( rule__Match__Group_2_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=RULE_INT && LA14_0<=RULE_FLOAT)||LA14_0==15||LA14_0==25||LA14_0==28||LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1744:2: rule__Match__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3616);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1754:1: rule__Match__Group_2__2 : rule__Match__Group_2__2__Impl ;
    public final void rule__Match__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1758:1: ( rule__Match__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1759:2: rule__Match__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23647);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1765:1: rule__Match__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Match__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1769:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1770:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1770:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1771:1: ')'
            {
             before(grammarAccess.getMatchAccess().getRightParenthesisKeyword_2_2()); 
            match(input,26,FOLLOW_26_in_rule__Match__Group_2__2__Impl3675); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1790:1: rule__Match__Group_2_1__0 : rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 ;
    public final void rule__Match__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1794:1: ( rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1795:2: rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03712);
            rule__Match__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03715);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1802:1: rule__Match__Group_2_1__0__Impl : ( ( rule__Match__ParamsAssignment_2_1_0 ) ) ;
    public final void rule__Match__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1806:1: ( ( ( rule__Match__ParamsAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1807:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1807:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1808:1: ( rule__Match__ParamsAssignment_2_1_0 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1809:1: ( rule__Match__ParamsAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1809:2: rule__Match__ParamsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3742);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1819:1: rule__Match__Group_2_1__1 : rule__Match__Group_2_1__1__Impl ;
    public final void rule__Match__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1823:1: ( rule__Match__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1824:2: rule__Match__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13772);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1830:1: rule__Match__Group_2_1__1__Impl : ( ( rule__Match__Group_2_1_1__0 )* ) ;
    public final void rule__Match__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1834:1: ( ( ( rule__Match__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1835:1: ( ( rule__Match__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1835:1: ( ( rule__Match__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1836:1: ( rule__Match__Group_2_1_1__0 )*
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1837:1: ( rule__Match__Group_2_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1837:2: rule__Match__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3799);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1851:1: rule__Match__Group_2_1_1__0 : rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 ;
    public final void rule__Match__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1855:1: ( rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1856:2: rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__03834);
            rule__Match__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__03837);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1863:1: rule__Match__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Match__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1867:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1868:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1868:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1869:1: ','
            {
             before(grammarAccess.getMatchAccess().getCommaKeyword_2_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Match__Group_2_1_1__0__Impl3865); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1882:1: rule__Match__Group_2_1_1__1 : rule__Match__Group_2_1_1__1__Impl ;
    public final void rule__Match__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1886:1: ( rule__Match__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1887:2: rule__Match__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__13896);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1893:1: rule__Match__Group_2_1_1__1__Impl : ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) ;
    public final void rule__Match__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1897:1: ( ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1898:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1898:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1899:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1900:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1900:2: rule__Match__ParamsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl3923);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1914:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1918:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1919:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03957);
            rule__Param__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03960);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1926:1: rule__Param__Group__0__Impl : ( ( rule__Param__PropertyAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1930:1: ( ( ( rule__Param__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1931:1: ( ( rule__Param__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1931:1: ( ( rule__Param__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1932:1: ( rule__Param__PropertyAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1933:1: ( rule__Param__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1933:2: rule__Param__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl3987);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1943:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1947:1: ( rule__Param__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1948:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__14017);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1954:1: rule__Param__Group__1__Impl : ( ( rule__Param__Group_1__0 )? ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1958:1: ( ( ( rule__Param__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1959:1: ( ( rule__Param__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1959:1: ( ( rule__Param__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1960:1: ( rule__Param__Group_1__0 )?
            {
             before(grammarAccess.getParamAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1961:1: ( rule__Param__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1961:2: rule__Param__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl4044);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1975:1: rule__Param__Group_1__0 : rule__Param__Group_1__0__Impl rule__Param__Group_1__1 ;
    public final void rule__Param__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1979:1: ( rule__Param__Group_1__0__Impl rule__Param__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1980:2: rule__Param__Group_1__0__Impl rule__Param__Group_1__1
            {
            pushFollow(FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__04079);
            rule__Param__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__04082);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1987:1: rule__Param__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Param__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1991:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1992:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1992:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1993:1: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Param__Group_1__0__Impl4110); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2006:1: rule__Param__Group_1__1 : rule__Param__Group_1__1__Impl ;
    public final void rule__Param__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2010:1: ( rule__Param__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2011:2: rule__Param__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__14141);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2017:1: rule__Param__Group_1__1__Impl : ( ( rule__Param__VarAssignment_1_1 ) ) ;
    public final void rule__Param__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2021:1: ( ( ( rule__Param__VarAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2022:1: ( ( rule__Param__VarAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2022:1: ( ( rule__Param__VarAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2023:1: ( rule__Param__VarAssignment_1_1 )
            {
             before(grammarAccess.getParamAccess().getVarAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2024:1: ( rule__Param__VarAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2024:2: rule__Param__VarAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl4168);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2038:1: rule__BindingExpression__Group__0 : rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1 ;
    public final void rule__BindingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2042:1: ( rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2043:2: rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__0__Impl_in_rule__BindingExpression__Group__04202);
            rule__BindingExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group__1_in_rule__BindingExpression__Group__04205);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2050:1: rule__BindingExpression__Group__0__Impl : ( ruleBindingExpressionHigh ) ;
    public final void rule__BindingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2054:1: ( ( ruleBindingExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2055:1: ( ruleBindingExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2055:1: ( ruleBindingExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2056:1: ruleBindingExpressionHigh
            {
             before(grammarAccess.getBindingExpressionAccess().getBindingExpressionHighParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpression__Group__0__Impl4232);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2067:1: rule__BindingExpression__Group__1 : rule__BindingExpression__Group__1__Impl ;
    public final void rule__BindingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2071:1: ( rule__BindingExpression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2072:2: rule__BindingExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__1__Impl_in_rule__BindingExpression__Group__14261);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2078:1: rule__BindingExpression__Group__1__Impl : ( ( rule__BindingExpression__Group_1__0 )? ) ;
    public final void rule__BindingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2082:1: ( ( ( rule__BindingExpression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2083:1: ( ( rule__BindingExpression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2083:1: ( ( rule__BindingExpression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2084:1: ( rule__BindingExpression__Group_1__0 )?
            {
             before(grammarAccess.getBindingExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2085:1: ( rule__BindingExpression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2085:2: rule__BindingExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingExpression__Group_1__0_in_rule__BindingExpression__Group__1__Impl4288);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2099:1: rule__BindingExpression__Group_1__0 : rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1 ;
    public final void rule__BindingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2103:1: ( rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2104:2: rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__0__Impl_in_rule__BindingExpression__Group_1__04323);
            rule__BindingExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group_1__1_in_rule__BindingExpression__Group_1__04326);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2111:1: rule__BindingExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2115:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2116:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2116:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2117:1: ()
            {
             before(grammarAccess.getBindingExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2118:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2120:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2130:1: rule__BindingExpression__Group_1__1 : rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2 ;
    public final void rule__BindingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2134:1: ( rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2135:2: rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__1__Impl_in_rule__BindingExpression__Group_1__14384);
            rule__BindingExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group_1__2_in_rule__BindingExpression__Group_1__14387);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2142:1: rule__BindingExpression__Group_1__1__Impl : ( ( rule__BindingExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BindingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2146:1: ( ( ( rule__BindingExpression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2147:1: ( ( rule__BindingExpression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2147:1: ( ( rule__BindingExpression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2148:1: ( rule__BindingExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBindingExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2149:1: ( rule__BindingExpression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2149:2: rule__BindingExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BindingExpression__OpAssignment_1_1_in_rule__BindingExpression__Group_1__1__Impl4414);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2159:1: rule__BindingExpression__Group_1__2 : rule__BindingExpression__Group_1__2__Impl ;
    public final void rule__BindingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2163:1: ( rule__BindingExpression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2164:2: rule__BindingExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__2__Impl_in_rule__BindingExpression__Group_1__24444);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2170:1: rule__BindingExpression__Group_1__2__Impl : ( ( rule__BindingExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BindingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2174:1: ( ( ( rule__BindingExpression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2175:1: ( ( rule__BindingExpression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2175:1: ( ( rule__BindingExpression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2176:1: ( rule__BindingExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBindingExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2177:1: ( rule__BindingExpression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2177:2: rule__BindingExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingExpression__RightAssignment_1_2_in_rule__BindingExpression__Group_1__2__Impl4471);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2193:1: rule__BindingExpressionHigh__Group__0 : rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1 ;
    public final void rule__BindingExpressionHigh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2197:1: ( rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2198:2: rule__BindingExpressionHigh__Group__0__Impl rule__BindingExpressionHigh__Group__1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__0__Impl_in_rule__BindingExpressionHigh__Group__04507);
            rule__BindingExpressionHigh__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__1_in_rule__BindingExpressionHigh__Group__04510);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2205:1: rule__BindingExpressionHigh__Group__0__Impl : ( ruleBindingTerminalExpression ) ;
    public final void rule__BindingExpressionHigh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2209:1: ( ( ruleBindingTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2210:1: ( ruleBindingTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2210:1: ( ruleBindingTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2211:1: ruleBindingTerminalExpression
            {
             before(grammarAccess.getBindingExpressionHighAccess().getBindingTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_rule__BindingExpressionHigh__Group__0__Impl4537);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2222:1: rule__BindingExpressionHigh__Group__1 : rule__BindingExpressionHigh__Group__1__Impl ;
    public final void rule__BindingExpressionHigh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2226:1: ( rule__BindingExpressionHigh__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2227:2: rule__BindingExpressionHigh__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group__1__Impl_in_rule__BindingExpressionHigh__Group__14566);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2233:1: rule__BindingExpressionHigh__Group__1__Impl : ( ( rule__BindingExpressionHigh__Group_1__0 )? ) ;
    public final void rule__BindingExpressionHigh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2237:1: ( ( ( rule__BindingExpressionHigh__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2238:1: ( ( rule__BindingExpressionHigh__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2238:1: ( ( rule__BindingExpressionHigh__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2239:1: ( rule__BindingExpressionHigh__Group_1__0 )?
            {
             before(grammarAccess.getBindingExpressionHighAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2240:1: ( rule__BindingExpressionHigh__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2240:2: rule__BindingExpressionHigh__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__0_in_rule__BindingExpressionHigh__Group__1__Impl4593);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2254:1: rule__BindingExpressionHigh__Group_1__0 : rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1 ;
    public final void rule__BindingExpressionHigh__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2258:1: ( rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2259:2: rule__BindingExpressionHigh__Group_1__0__Impl rule__BindingExpressionHigh__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__0__Impl_in_rule__BindingExpressionHigh__Group_1__04628);
            rule__BindingExpressionHigh__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__1_in_rule__BindingExpressionHigh__Group_1__04631);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2266:1: rule__BindingExpressionHigh__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingExpressionHigh__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2270:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2271:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2271:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2272:1: ()
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2273:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2275:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2285:1: rule__BindingExpressionHigh__Group_1__1 : rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2 ;
    public final void rule__BindingExpressionHigh__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2289:1: ( rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2290:2: rule__BindingExpressionHigh__Group_1__1__Impl rule__BindingExpressionHigh__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__1__Impl_in_rule__BindingExpressionHigh__Group_1__14689);
            rule__BindingExpressionHigh__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__2_in_rule__BindingExpressionHigh__Group_1__14692);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2297:1: rule__BindingExpressionHigh__Group_1__1__Impl : ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) ) ;
    public final void rule__BindingExpressionHigh__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2301:1: ( ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2302:1: ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2302:1: ( ( rule__BindingExpressionHigh__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2303:1: ( rule__BindingExpressionHigh__OpAssignment_1_1 )
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2304:1: ( rule__BindingExpressionHigh__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2304:2: rule__BindingExpressionHigh__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__OpAssignment_1_1_in_rule__BindingExpressionHigh__Group_1__1__Impl4719);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2314:1: rule__BindingExpressionHigh__Group_1__2 : rule__BindingExpressionHigh__Group_1__2__Impl ;
    public final void rule__BindingExpressionHigh__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2318:1: ( rule__BindingExpressionHigh__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2319:2: rule__BindingExpressionHigh__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__Group_1__2__Impl_in_rule__BindingExpressionHigh__Group_1__24749);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2325:1: rule__BindingExpressionHigh__Group_1__2__Impl : ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) ) ;
    public final void rule__BindingExpressionHigh__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2329:1: ( ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2330:1: ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2330:1: ( ( rule__BindingExpressionHigh__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2331:1: ( rule__BindingExpressionHigh__RightAssignment_1_2 )
            {
             before(grammarAccess.getBindingExpressionHighAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2332:1: ( rule__BindingExpressionHigh__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2332:2: rule__BindingExpressionHigh__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingExpressionHigh__RightAssignment_1_2_in_rule__BindingExpressionHigh__Group_1__2__Impl4776);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2348:1: rule__BindingTerminalExpression__Group_0__0 : rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1 ;
    public final void rule__BindingTerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2352:1: ( rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2353:2: rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__0__Impl_in_rule__BindingTerminalExpression__Group_0__04812);
            rule__BindingTerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__1_in_rule__BindingTerminalExpression__Group_0__04815);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2360:1: rule__BindingTerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BindingTerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2364:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2365:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2365:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2366:1: '('
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__BindingTerminalExpression__Group_0__0__Impl4843); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2379:1: rule__BindingTerminalExpression__Group_0__1 : rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2 ;
    public final void rule__BindingTerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2383:1: ( rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2384:2: rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__1__Impl_in_rule__BindingTerminalExpression__Group_0__14874);
            rule__BindingTerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__2_in_rule__BindingTerminalExpression__Group_0__14877);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2391:1: rule__BindingTerminalExpression__Group_0__1__Impl : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2395:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2396:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2396:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2397:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getBindingExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__Group_0__1__Impl4904);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2408:1: rule__BindingTerminalExpression__Group_0__2 : rule__BindingTerminalExpression__Group_0__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2412:1: ( rule__BindingTerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2413:2: rule__BindingTerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__2__Impl_in_rule__BindingTerminalExpression__Group_0__24933);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2419:1: rule__BindingTerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BindingTerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2423:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2424:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2424:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2425:1: ')'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__BindingTerminalExpression__Group_0__2__Impl4961); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2444:1: rule__BindingTerminalExpression__Group_1__0 : rule__BindingTerminalExpression__Group_1__0__Impl rule__BindingTerminalExpression__Group_1__1 ;
    public final void rule__BindingTerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2448:1: ( rule__BindingTerminalExpression__Group_1__0__Impl rule__BindingTerminalExpression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2449:2: rule__BindingTerminalExpression__Group_1__0__Impl rule__BindingTerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__0__Impl_in_rule__BindingTerminalExpression__Group_1__04998);
            rule__BindingTerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__1_in_rule__BindingTerminalExpression__Group_1__05001);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2456:1: rule__BindingTerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingTerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2460:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2461:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2461:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2462:1: ()
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getNotExpressionAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2463:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2465:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2475:1: rule__BindingTerminalExpression__Group_1__1 : rule__BindingTerminalExpression__Group_1__1__Impl rule__BindingTerminalExpression__Group_1__2 ;
    public final void rule__BindingTerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2479:1: ( rule__BindingTerminalExpression__Group_1__1__Impl rule__BindingTerminalExpression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2480:2: rule__BindingTerminalExpression__Group_1__1__Impl rule__BindingTerminalExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__1__Impl_in_rule__BindingTerminalExpression__Group_1__15059);
            rule__BindingTerminalExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__2_in_rule__BindingTerminalExpression__Group_1__15062);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2487:1: rule__BindingTerminalExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__BindingTerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2491:1: ( ( '!' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2492:1: ( '!' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2492:1: ( '!' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2493:1: '!'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExclamationMarkKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__BindingTerminalExpression__Group_1__1__Impl5090); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2506:1: rule__BindingTerminalExpression__Group_1__2 : rule__BindingTerminalExpression__Group_1__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2510:1: ( rule__BindingTerminalExpression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2511:2: rule__BindingTerminalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_1__2__Impl_in_rule__BindingTerminalExpression__Group_1__25121);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2517:1: rule__BindingTerminalExpression__Group_1__2__Impl : ( ( rule__BindingTerminalExpression__ExpAssignment_1_2 ) ) ;
    public final void rule__BindingTerminalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2521:1: ( ( ( rule__BindingTerminalExpression__ExpAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2522:1: ( ( rule__BindingTerminalExpression__ExpAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2522:1: ( ( rule__BindingTerminalExpression__ExpAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2523:1: ( rule__BindingTerminalExpression__ExpAssignment_1_2 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2524:1: ( rule__BindingTerminalExpression__ExpAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2524:2: rule__BindingTerminalExpression__ExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ExpAssignment_1_2_in_rule__BindingTerminalExpression__Group_1__2__Impl5148);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2540:1: rule__BindingTerminalExpression__Group_3__0 : rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1 ;
    public final void rule__BindingTerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2544:1: ( rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2545:2: rule__BindingTerminalExpression__Group_3__0__Impl rule__BindingTerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__0__Impl_in_rule__BindingTerminalExpression__Group_3__05184);
            rule__BindingTerminalExpression__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__1_in_rule__BindingTerminalExpression__Group_3__05187);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2552:1: rule__BindingTerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__BindingTerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2556:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2557:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2557:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2558:1: ()
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2559:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2561:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2571:1: rule__BindingTerminalExpression__Group_3__1 : rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2 ;
    public final void rule__BindingTerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2575:1: ( rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2576:2: rule__BindingTerminalExpression__Group_3__1__Impl rule__BindingTerminalExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__1__Impl_in_rule__BindingTerminalExpression__Group_3__15245);
            rule__BindingTerminalExpression__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__2_in_rule__BindingTerminalExpression__Group_3__15248);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2583:1: rule__BindingTerminalExpression__Group_3__1__Impl : ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2587:1: ( ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2588:1: ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2588:1: ( ( rule__BindingTerminalExpression__FunctionAssignment_3_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2589:1: ( rule__BindingTerminalExpression__FunctionAssignment_3_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionAssignment_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2590:1: ( rule__BindingTerminalExpression__FunctionAssignment_3_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2590:2: rule__BindingTerminalExpression__FunctionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__FunctionAssignment_3_1_in_rule__BindingTerminalExpression__Group_3__1__Impl5275);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2600:1: rule__BindingTerminalExpression__Group_3__2 : rule__BindingTerminalExpression__Group_3__2__Impl rule__BindingTerminalExpression__Group_3__3 ;
    public final void rule__BindingTerminalExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2604:1: ( rule__BindingTerminalExpression__Group_3__2__Impl rule__BindingTerminalExpression__Group_3__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2605:2: rule__BindingTerminalExpression__Group_3__2__Impl rule__BindingTerminalExpression__Group_3__3
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__2__Impl_in_rule__BindingTerminalExpression__Group_3__25305);
            rule__BindingTerminalExpression__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__3_in_rule__BindingTerminalExpression__Group_3__25308);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2612:1: rule__BindingTerminalExpression__Group_3__2__Impl : ( '(' ) ;
    public final void rule__BindingTerminalExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2616:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2617:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2617:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2618:1: '('
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,25,FOLLOW_25_in_rule__BindingTerminalExpression__Group_3__2__Impl5336); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2631:1: rule__BindingTerminalExpression__Group_3__3 : rule__BindingTerminalExpression__Group_3__3__Impl rule__BindingTerminalExpression__Group_3__4 ;
    public final void rule__BindingTerminalExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2635:1: ( rule__BindingTerminalExpression__Group_3__3__Impl rule__BindingTerminalExpression__Group_3__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2636:2: rule__BindingTerminalExpression__Group_3__3__Impl rule__BindingTerminalExpression__Group_3__4
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__3__Impl_in_rule__BindingTerminalExpression__Group_3__35367);
            rule__BindingTerminalExpression__Group_3__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__4_in_rule__BindingTerminalExpression__Group_3__35370);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2643:1: rule__BindingTerminalExpression__Group_3__3__Impl : ( ( rule__BindingTerminalExpression__Group_3_3__0 )? ) ;
    public final void rule__BindingTerminalExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2647:1: ( ( ( rule__BindingTerminalExpression__Group_3_3__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2648:1: ( ( rule__BindingTerminalExpression__Group_3_3__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2648:1: ( ( rule__BindingTerminalExpression__Group_3_3__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2649:1: ( rule__BindingTerminalExpression__Group_3_3__0 )?
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2650:1: ( rule__BindingTerminalExpression__Group_3_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=RULE_INT && LA19_0<=RULE_FLOAT)||LA19_0==15||LA19_0==25||LA19_0==28||LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2650:2: rule__BindingTerminalExpression__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3__0_in_rule__BindingTerminalExpression__Group_3__3__Impl5397);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2660:1: rule__BindingTerminalExpression__Group_3__4 : rule__BindingTerminalExpression__Group_3__4__Impl ;
    public final void rule__BindingTerminalExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2664:1: ( rule__BindingTerminalExpression__Group_3__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2665:2: rule__BindingTerminalExpression__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3__4__Impl_in_rule__BindingTerminalExpression__Group_3__45428);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2671:1: rule__BindingTerminalExpression__Group_3__4__Impl : ( ')' ) ;
    public final void rule__BindingTerminalExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2675:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2676:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2676:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2677:1: ')'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,26,FOLLOW_26_in_rule__BindingTerminalExpression__Group_3__4__Impl5456); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2700:1: rule__BindingTerminalExpression__Group_3_3__0 : rule__BindingTerminalExpression__Group_3_3__0__Impl rule__BindingTerminalExpression__Group_3_3__1 ;
    public final void rule__BindingTerminalExpression__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2704:1: ( rule__BindingTerminalExpression__Group_3_3__0__Impl rule__BindingTerminalExpression__Group_3_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2705:2: rule__BindingTerminalExpression__Group_3_3__0__Impl rule__BindingTerminalExpression__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3__0__Impl_in_rule__BindingTerminalExpression__Group_3_3__05497);
            rule__BindingTerminalExpression__Group_3_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3__1_in_rule__BindingTerminalExpression__Group_3_3__05500);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2712:1: rule__BindingTerminalExpression__Group_3_3__0__Impl : ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2716:1: ( ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2717:1: ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2717:1: ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2718:1: ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsAssignment_3_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2719:1: ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2719:2: rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0_in_rule__BindingTerminalExpression__Group_3_3__0__Impl5527);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2729:1: rule__BindingTerminalExpression__Group_3_3__1 : rule__BindingTerminalExpression__Group_3_3__1__Impl ;
    public final void rule__BindingTerminalExpression__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2733:1: ( rule__BindingTerminalExpression__Group_3_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2734:2: rule__BindingTerminalExpression__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3__1__Impl_in_rule__BindingTerminalExpression__Group_3_3__15557);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2740:1: rule__BindingTerminalExpression__Group_3_3__1__Impl : ( ( rule__BindingTerminalExpression__Group_3_3_1__0 )* ) ;
    public final void rule__BindingTerminalExpression__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2744:1: ( ( ( rule__BindingTerminalExpression__Group_3_3_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2745:1: ( ( rule__BindingTerminalExpression__Group_3_3_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2745:1: ( ( rule__BindingTerminalExpression__Group_3_3_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2746:1: ( rule__BindingTerminalExpression__Group_3_3_1__0 )*
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_3_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2747:1: ( rule__BindingTerminalExpression__Group_3_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2747:2: rule__BindingTerminalExpression__Group_3_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__0_in_rule__BindingTerminalExpression__Group_3_3__1__Impl5584);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2761:1: rule__BindingTerminalExpression__Group_3_3_1__0 : rule__BindingTerminalExpression__Group_3_3_1__0__Impl rule__BindingTerminalExpression__Group_3_3_1__1 ;
    public final void rule__BindingTerminalExpression__Group_3_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2765:1: ( rule__BindingTerminalExpression__Group_3_3_1__0__Impl rule__BindingTerminalExpression__Group_3_3_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2766:2: rule__BindingTerminalExpression__Group_3_3_1__0__Impl rule__BindingTerminalExpression__Group_3_3_1__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__0__Impl_in_rule__BindingTerminalExpression__Group_3_3_1__05619);
            rule__BindingTerminalExpression__Group_3_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__1_in_rule__BindingTerminalExpression__Group_3_3_1__05622);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2773:1: rule__BindingTerminalExpression__Group_3_3_1__0__Impl : ( ',' ) ;
    public final void rule__BindingTerminalExpression__Group_3_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2777:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2778:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2778:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2779:1: ','
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getCommaKeyword_3_3_1_0()); 
            match(input,27,FOLLOW_27_in_rule__BindingTerminalExpression__Group_3_3_1__0__Impl5650); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2792:1: rule__BindingTerminalExpression__Group_3_3_1__1 : rule__BindingTerminalExpression__Group_3_3_1__1__Impl ;
    public final void rule__BindingTerminalExpression__Group_3_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2796:1: ( rule__BindingTerminalExpression__Group_3_3_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2797:2: rule__BindingTerminalExpression__Group_3_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__1__Impl_in_rule__BindingTerminalExpression__Group_3_3_1__15681);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2803:1: rule__BindingTerminalExpression__Group_3_3_1__1__Impl : ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_3_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2807:1: ( ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2808:1: ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2808:1: ( ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2809:1: ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsAssignment_3_3_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2810:1: ( rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2810:2: rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1_in_rule__BindingTerminalExpression__Group_3_3_1__1__Impl5708);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2824:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2828:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2829:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05742);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05745);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2836:1: rule__Expression__Group__0__Impl : ( ruleExpressionHigh ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2840:1: ( ( ruleExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2841:1: ( ruleExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2841:1: ( ruleExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2842:1: ruleExpressionHigh
            {
             before(grammarAccess.getExpressionAccess().getExpressionHighParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_rule__Expression__Group__0__Impl5772);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2853:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2857:1: ( rule__Expression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2858:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15801);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2864:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2868:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2869:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2869:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2870:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2871:1: ( rule__Expression__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2871:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5828);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2885:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2889:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2890:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05863);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05866);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2897:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2901:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2902:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2902:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2903:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2904:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2906:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2916:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2920:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2921:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15924);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__15927);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2928:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2932:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2933:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2933:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2934:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2935:1: ( rule__Expression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2935:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl5954);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2945:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2949:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2950:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__25984);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2956:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2960:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2961:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2961:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2962:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2963:1: ( rule__Expression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2963:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl6011);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2979:1: rule__ExpressionHigh__Group__0 : rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1 ;
    public final void rule__ExpressionHigh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2983:1: ( rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2984:2: rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__0__Impl_in_rule__ExpressionHigh__Group__06047);
            rule__ExpressionHigh__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group__1_in_rule__ExpressionHigh__Group__06050);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2991:1: rule__ExpressionHigh__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__ExpressionHigh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2995:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2996:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2996:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2997:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionHighAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__ExpressionHigh__Group__0__Impl6077);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3008:1: rule__ExpressionHigh__Group__1 : rule__ExpressionHigh__Group__1__Impl ;
    public final void rule__ExpressionHigh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3012:1: ( rule__ExpressionHigh__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3013:2: rule__ExpressionHigh__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__1__Impl_in_rule__ExpressionHigh__Group__16106);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3019:1: rule__ExpressionHigh__Group__1__Impl : ( ( rule__ExpressionHigh__Group_1__0 )? ) ;
    public final void rule__ExpressionHigh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3023:1: ( ( ( rule__ExpressionHigh__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3024:1: ( ( rule__ExpressionHigh__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3024:1: ( ( rule__ExpressionHigh__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3025:1: ( rule__ExpressionHigh__Group_1__0 )?
            {
             before(grammarAccess.getExpressionHighAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3026:1: ( rule__ExpressionHigh__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3026:2: rule__ExpressionHigh__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__0_in_rule__ExpressionHigh__Group__1__Impl6133);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3040:1: rule__ExpressionHigh__Group_1__0 : rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1 ;
    public final void rule__ExpressionHigh__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3044:1: ( rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3045:2: rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__0__Impl_in_rule__ExpressionHigh__Group_1__06168);
            rule__ExpressionHigh__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__1_in_rule__ExpressionHigh__Group_1__06171);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3052:1: rule__ExpressionHigh__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionHigh__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3056:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3057:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3057:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3058:1: ()
            {
             before(grammarAccess.getExpressionHighAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3059:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3061:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3071:1: rule__ExpressionHigh__Group_1__1 : rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2 ;
    public final void rule__ExpressionHigh__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3075:1: ( rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3076:2: rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__1__Impl_in_rule__ExpressionHigh__Group_1__16229);
            rule__ExpressionHigh__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__2_in_rule__ExpressionHigh__Group_1__16232);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3083:1: rule__ExpressionHigh__Group_1__1__Impl : ( ( rule__ExpressionHigh__OpAssignment_1_1 ) ) ;
    public final void rule__ExpressionHigh__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3087:1: ( ( ( rule__ExpressionHigh__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3088:1: ( ( rule__ExpressionHigh__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3088:1: ( ( rule__ExpressionHigh__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3089:1: ( rule__ExpressionHigh__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionHighAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3090:1: ( rule__ExpressionHigh__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3090:2: rule__ExpressionHigh__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__OpAssignment_1_1_in_rule__ExpressionHigh__Group_1__1__Impl6259);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3100:1: rule__ExpressionHigh__Group_1__2 : rule__ExpressionHigh__Group_1__2__Impl ;
    public final void rule__ExpressionHigh__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3104:1: ( rule__ExpressionHigh__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3105:2: rule__ExpressionHigh__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__2__Impl_in_rule__ExpressionHigh__Group_1__26289);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3111:1: rule__ExpressionHigh__Group_1__2__Impl : ( ( rule__ExpressionHigh__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionHigh__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3115:1: ( ( ( rule__ExpressionHigh__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3116:1: ( ( rule__ExpressionHigh__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3116:1: ( ( rule__ExpressionHigh__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3117:1: ( rule__ExpressionHigh__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionHighAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3118:1: ( rule__ExpressionHigh__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3118:2: rule__ExpressionHigh__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__RightAssignment_1_2_in_rule__ExpressionHigh__Group_1__2__Impl6316);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3134:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3138:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3139:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__06352);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__06355);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3146:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3150:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3151:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3151:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3152:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__TerminalExpression__Group_0__0__Impl6383); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3165:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3169:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3170:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__16414);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__16417);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3177:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3181:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3182:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3182:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3183:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl6444);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3194:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3198:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3199:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__26473);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3205:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3209:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3210:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3210:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3211:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__TerminalExpression__Group_0__2__Impl6501); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3230:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3234:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3235:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__06538);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__06541);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3242:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3246:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3247:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3247:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3248:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3249:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3251:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3261:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2 ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3265:1: ( rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3266:2: rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__16599);
            rule__TerminalExpression__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__2_in_rule__TerminalExpression__Group_2__16602);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3273:1: rule__TerminalExpression__Group_2__1__Impl : ( '!' ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3277:1: ( ( '!' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3278:1: ( '!' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3278:1: ( '!' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3279:1: '!'
            {
             before(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_2_1()); 
            match(input,28,FOLLOW_28_in_rule__TerminalExpression__Group_2__1__Impl6630); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3292:1: rule__TerminalExpression__Group_2__2 : rule__TerminalExpression__Group_2__2__Impl ;
    public final void rule__TerminalExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3296:1: ( rule__TerminalExpression__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3297:2: rule__TerminalExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__2__Impl_in_rule__TerminalExpression__Group_2__26661);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3303:1: rule__TerminalExpression__Group_2__2__Impl : ( ( rule__TerminalExpression__ExpAssignment_2_2 ) ) ;
    public final void rule__TerminalExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3307:1: ( ( ( rule__TerminalExpression__ExpAssignment_2_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3308:1: ( ( rule__TerminalExpression__ExpAssignment_2_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3308:1: ( ( rule__TerminalExpression__ExpAssignment_2_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3309:1: ( rule__TerminalExpression__ExpAssignment_2_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpAssignment_2_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3310:1: ( rule__TerminalExpression__ExpAssignment_2_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3310:2: rule__TerminalExpression__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ExpAssignment_2_2_in_rule__TerminalExpression__Group_2__2__Impl6688);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3326:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3330:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3331:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__06724);
            rule__TerminalExpression__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__06727);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3338:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3342:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3343:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3343:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3344:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3345:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3347:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3357:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3361:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3362:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__16785);
            rule__TerminalExpression__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__16788);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3369:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3373:1: ( ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3374:1: ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3374:1: ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3375:1: ( rule__TerminalExpression__FunctionAssignment_4_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_4_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3376:1: ( rule__TerminalExpression__FunctionAssignment_4_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3376:2: rule__TerminalExpression__FunctionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__FunctionAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl6815);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3386:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3 ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3390:1: ( rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3391:2: rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__26845);
            rule__TerminalExpression__Group_4__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__3_in_rule__TerminalExpression__Group_4__26848);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3398:1: rule__TerminalExpression__Group_4__2__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3402:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3403:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3403:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3404:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,25,FOLLOW_25_in_rule__TerminalExpression__Group_4__2__Impl6876); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3417:1: rule__TerminalExpression__Group_4__3 : rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4 ;
    public final void rule__TerminalExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3421:1: ( rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3422:2: rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__3__Impl_in_rule__TerminalExpression__Group_4__36907);
            rule__TerminalExpression__Group_4__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__4_in_rule__TerminalExpression__Group_4__36910);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3429:1: rule__TerminalExpression__Group_4__3__Impl : ( ( rule__TerminalExpression__Group_4_3__0 )? ) ;
    public final void rule__TerminalExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3433:1: ( ( ( rule__TerminalExpression__Group_4_3__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3434:1: ( ( rule__TerminalExpression__Group_4_3__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3434:1: ( ( rule__TerminalExpression__Group_4_3__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3435:1: ( rule__TerminalExpression__Group_4_3__0 )?
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3436:1: ( rule__TerminalExpression__Group_4_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||(LA23_0>=RULE_INT && LA23_0<=RULE_FLOAT)||LA23_0==15||LA23_0==25||LA23_0==28||(LA23_0>=30 && LA23_0<=31)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3436:2: rule__TerminalExpression__Group_4_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__0_in_rule__TerminalExpression__Group_4__3__Impl6937);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3446:1: rule__TerminalExpression__Group_4__4 : rule__TerminalExpression__Group_4__4__Impl ;
    public final void rule__TerminalExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3450:1: ( rule__TerminalExpression__Group_4__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3451:2: rule__TerminalExpression__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__4__Impl_in_rule__TerminalExpression__Group_4__46968);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3457:1: rule__TerminalExpression__Group_4__4__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3461:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3462:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3462:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3463:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,26,FOLLOW_26_in_rule__TerminalExpression__Group_4__4__Impl6996); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3486:1: rule__TerminalExpression__Group_4_3__0 : rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1 ;
    public final void rule__TerminalExpression__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3490:1: ( rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3491:2: rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__0__Impl_in_rule__TerminalExpression__Group_4_3__07037);
            rule__TerminalExpression__Group_4_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__1_in_rule__TerminalExpression__Group_4_3__07040);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3498:1: rule__TerminalExpression__Group_4_3__0__Impl : ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) ) ;
    public final void rule__TerminalExpression__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3502:1: ( ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3503:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3503:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3504:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3505:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3505:2: rule__TerminalExpression__ArgumentsAssignment_4_3_0
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_0_in_rule__TerminalExpression__Group_4_3__0__Impl7067);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3515:1: rule__TerminalExpression__Group_4_3__1 : rule__TerminalExpression__Group_4_3__1__Impl ;
    public final void rule__TerminalExpression__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3519:1: ( rule__TerminalExpression__Group_4_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3520:2: rule__TerminalExpression__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__1__Impl_in_rule__TerminalExpression__Group_4_3__17097);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3526:1: rule__TerminalExpression__Group_4_3__1__Impl : ( ( rule__TerminalExpression__Group_4_3_1__0 )* ) ;
    public final void rule__TerminalExpression__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3530:1: ( ( ( rule__TerminalExpression__Group_4_3_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3531:1: ( ( rule__TerminalExpression__Group_4_3_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3531:1: ( ( rule__TerminalExpression__Group_4_3_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3532:1: ( rule__TerminalExpression__Group_4_3_1__0 )*
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3533:1: ( rule__TerminalExpression__Group_4_3_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3533:2: rule__TerminalExpression__Group_4_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__0_in_rule__TerminalExpression__Group_4_3__1__Impl7124);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3547:1: rule__TerminalExpression__Group_4_3_1__0 : rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1 ;
    public final void rule__TerminalExpression__Group_4_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3551:1: ( rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3552:2: rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__0__Impl_in_rule__TerminalExpression__Group_4_3_1__07159);
            rule__TerminalExpression__Group_4_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__1_in_rule__TerminalExpression__Group_4_3_1__07162);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3559:1: rule__TerminalExpression__Group_4_3_1__0__Impl : ( ',' ) ;
    public final void rule__TerminalExpression__Group_4_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3563:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3564:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3564:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3565:1: ','
            {
             before(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_3_1_0()); 
            match(input,27,FOLLOW_27_in_rule__TerminalExpression__Group_4_3_1__0__Impl7190); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3578:1: rule__TerminalExpression__Group_4_3_1__1 : rule__TerminalExpression__Group_4_3_1__1__Impl ;
    public final void rule__TerminalExpression__Group_4_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3582:1: ( rule__TerminalExpression__Group_4_3_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3583:2: rule__TerminalExpression__Group_4_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__1__Impl_in_rule__TerminalExpression__Group_4_3_1__17221);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3589:1: rule__TerminalExpression__Group_4_3_1__1__Impl : ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_4_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3593:1: ( ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3594:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3594:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3595:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3596:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3596:2: rule__TerminalExpression__ArgumentsAssignment_4_3_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_1_1_in_rule__TerminalExpression__Group_4_3_1__1__Impl7248);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3610:1: rule__SymbolRef__Group__0 : rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 ;
    public final void rule__SymbolRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3614:1: ( rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3615:2: rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolRef__Group__0__Impl_in_rule__SymbolRef__Group__07282);
            rule__SymbolRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SymbolRef__Group__1_in_rule__SymbolRef__Group__07285);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3622:1: rule__SymbolRef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3626:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3627:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3627:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3628:1: ()
            {
             before(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3629:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3631:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3641:1: rule__SymbolRef__Group__1 : rule__SymbolRef__Group__1__Impl ;
    public final void rule__SymbolRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3645:1: ( rule__SymbolRef__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3646:2: rule__SymbolRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolRef__Group__1__Impl_in_rule__SymbolRef__Group__17343);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3652:1: rule__SymbolRef__Group__1__Impl : ( ( rule__SymbolRef__RefAssignment_1 ) ) ;
    public final void rule__SymbolRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3656:1: ( ( ( rule__SymbolRef__RefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3657:1: ( ( rule__SymbolRef__RefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3657:1: ( ( rule__SymbolRef__RefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3658:1: ( rule__SymbolRef__RefAssignment_1 )
            {
             before(grammarAccess.getSymbolRefAccess().getRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3659:1: ( rule__SymbolRef__RefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3659:2: rule__SymbolRef__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__SymbolRef__RefAssignment_1_in_rule__SymbolRef__Group__1__Impl7370);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3673:1: rule__PrimitiveLiteral__Group_3__0 : rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1 ;
    public final void rule__PrimitiveLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3677:1: ( rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3678:2: rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__0__Impl_in_rule__PrimitiveLiteral__Group_3__07404);
            rule__PrimitiveLiteral__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__1_in_rule__PrimitiveLiteral__Group_3__07407);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3685:1: rule__PrimitiveLiteral__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3689:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3690:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3690:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3691:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getIntLiteralAction_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3692:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3694:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3704:1: rule__PrimitiveLiteral__Group_3__1 : rule__PrimitiveLiteral__Group_3__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3708:1: ( rule__PrimitiveLiteral__Group_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3709:2: rule__PrimitiveLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__1__Impl_in_rule__PrimitiveLiteral__Group_3__17465);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3715:1: rule__PrimitiveLiteral__Group_3__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3719:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3720:1: ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3720:1: ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3721:1: ( rule__PrimitiveLiteral__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3722:1: ( rule__PrimitiveLiteral__ValueAssignment_3_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3722:2: rule__PrimitiveLiteral__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_3_1_in_rule__PrimitiveLiteral__Group_3__1__Impl7492);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3736:1: rule__PrimitiveLiteral__Group_4__0 : rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1 ;
    public final void rule__PrimitiveLiteral__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3740:1: ( rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3741:2: rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__0__Impl_in_rule__PrimitiveLiteral__Group_4__07526);
            rule__PrimitiveLiteral__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__1_in_rule__PrimitiveLiteral__Group_4__07529);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3748:1: rule__PrimitiveLiteral__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3752:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3753:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3753:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3754:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getBooleanLiteralAction_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3755:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3757:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3767:1: rule__PrimitiveLiteral__Group_4__1 : rule__PrimitiveLiteral__Group_4__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3771:1: ( rule__PrimitiveLiteral__Group_4__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3772:2: rule__PrimitiveLiteral__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__1__Impl_in_rule__PrimitiveLiteral__Group_4__17587);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3778:1: rule__PrimitiveLiteral__Group_4__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3782:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3783:1: ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3783:1: ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3784:1: ( rule__PrimitiveLiteral__ValueAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_4_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3785:1: ( rule__PrimitiveLiteral__ValueAssignment_4_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3785:2: rule__PrimitiveLiteral__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_4_1_in_rule__PrimitiveLiteral__Group_4__1__Impl7614);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3799:1: rule__PrimitiveLiteral__Group_5__0 : rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1 ;
    public final void rule__PrimitiveLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3803:1: ( rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3804:2: rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__0__Impl_in_rule__PrimitiveLiteral__Group_5__07648);
            rule__PrimitiveLiteral__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__1_in_rule__PrimitiveLiteral__Group_5__07651);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3811:1: rule__PrimitiveLiteral__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3815:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3816:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3816:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3817:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getFloatLiteralAction_5_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3818:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3820:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3830:1: rule__PrimitiveLiteral__Group_5__1 : rule__PrimitiveLiteral__Group_5__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3834:1: ( rule__PrimitiveLiteral__Group_5__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3835:2: rule__PrimitiveLiteral__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__1__Impl_in_rule__PrimitiveLiteral__Group_5__17709);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3841:1: rule__PrimitiveLiteral__Group_5__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3845:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3846:1: ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3846:1: ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3847:1: ( rule__PrimitiveLiteral__ValueAssignment_5_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_5_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3848:1: ( rule__PrimitiveLiteral__ValueAssignment_5_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3848:2: rule__PrimitiveLiteral__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_5_1_in_rule__PrimitiveLiteral__Group_5__1__Impl7736);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3862:1: rule__ThenBlock__Group__0 : rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 ;
    public final void rule__ThenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3866:1: ( rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3867:2: rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__07770);
            rule__ThenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__07773);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3874:1: rule__ThenBlock__Group__0__Impl : ( ( rule__ThenBlock__Alternatives_0 ) ) ;
    public final void rule__ThenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3878:1: ( ( ( rule__ThenBlock__Alternatives_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3879:1: ( ( rule__ThenBlock__Alternatives_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3879:1: ( ( rule__ThenBlock__Alternatives_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3880:1: ( rule__ThenBlock__Alternatives_0 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3881:1: ( rule__ThenBlock__Alternatives_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3881:2: rule__ThenBlock__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_0_in_rule__ThenBlock__Group__0__Impl7800);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3891:1: rule__ThenBlock__Group__1 : rule__ThenBlock__Group__1__Impl ;
    public final void rule__ThenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3895:1: ( rule__ThenBlock__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3896:2: rule__ThenBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__17830);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3902:1: rule__ThenBlock__Group__1__Impl : ( ( rule__ThenBlock__Alternatives_1 ) ) ;
    public final void rule__ThenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3906:1: ( ( ( rule__ThenBlock__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3907:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3907:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3908:1: ( rule__ThenBlock__Alternatives_1 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3909:1: ( rule__ThenBlock__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3909:2: rule__ThenBlock__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl7857);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3923:1: rule__ThenBlock__Group_1_0__0 : rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1 ;
    public final void rule__ThenBlock__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3927:1: ( rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3928:2: rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__0__Impl_in_rule__ThenBlock__Group_1_0__07891);
            rule__ThenBlock__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__1_in_rule__ThenBlock__Group_1_0__07894);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3935:1: rule__ThenBlock__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__ThenBlock__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3939:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3940:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3940:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3941:1: '{'
            {
             before(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__ThenBlock__Group_1_0__0__Impl7922); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3954:1: rule__ThenBlock__Group_1_0__1 : rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2 ;
    public final void rule__ThenBlock__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3958:1: ( rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3959:2: rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__1__Impl_in_rule__ThenBlock__Group_1_0__17953);
            rule__ThenBlock__Group_1_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__2_in_rule__ThenBlock__Group_1_0__17956);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3966:1: rule__ThenBlock__Group_1_0__1__Impl : ( ( rule__ThenBlock__Group_1_0_1__0 )* ) ;
    public final void rule__ThenBlock__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3970:1: ( ( ( rule__ThenBlock__Group_1_0_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3971:1: ( ( rule__ThenBlock__Group_1_0_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3971:1: ( ( rule__ThenBlock__Group_1_0_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3972:1: ( rule__ThenBlock__Group_1_0_1__0 )*
            {
             before(grammarAccess.getThenBlockAccess().getGroup_1_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3973:1: ( rule__ThenBlock__Group_1_0_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||(LA25_0>=RULE_INT && LA25_0<=RULE_FLOAT)||LA25_0==15||LA25_0==25||LA25_0==28||(LA25_0>=30 && LA25_0<=31)||LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3973:2: rule__ThenBlock__Group_1_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ThenBlock__Group_1_0_1__0_in_rule__ThenBlock__Group_1_0__1__Impl7983);
            	    rule__ThenBlock__Group_1_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getThenBlockAccess().getGroup_1_0_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3983:1: rule__ThenBlock__Group_1_0__2 : rule__ThenBlock__Group_1_0__2__Impl ;
    public final void rule__ThenBlock__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3987:1: ( rule__ThenBlock__Group_1_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3988:2: rule__ThenBlock__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__2__Impl_in_rule__ThenBlock__Group_1_0__28014);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3994:1: rule__ThenBlock__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__ThenBlock__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3998:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3999:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3999:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4000:1: '}'
            {
             before(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_1_0_2()); 
            match(input,24,FOLLOW_24_in_rule__ThenBlock__Group_1_0__2__Impl8042); 
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


    // $ANTLR start rule__ThenBlock__Group_1_0_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4019:1: rule__ThenBlock__Group_1_0_1__0 : rule__ThenBlock__Group_1_0_1__0__Impl rule__ThenBlock__Group_1_0_1__1 ;
    public final void rule__ThenBlock__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4023:1: ( rule__ThenBlock__Group_1_0_1__0__Impl rule__ThenBlock__Group_1_0_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4024:2: rule__ThenBlock__Group_1_0_1__0__Impl rule__ThenBlock__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0_1__0__Impl_in_rule__ThenBlock__Group_1_0_1__08079);
            rule__ThenBlock__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0_1__1_in_rule__ThenBlock__Group_1_0_1__08082);
            rule__ThenBlock__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0_1__0


    // $ANTLR start rule__ThenBlock__Group_1_0_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4031:1: rule__ThenBlock__Group_1_0_1__0__Impl : ( ( rule__ThenBlock__StatementsAssignment_1_0_1_0 ) ) ;
    public final void rule__ThenBlock__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4035:1: ( ( ( rule__ThenBlock__StatementsAssignment_1_0_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4036:1: ( ( rule__ThenBlock__StatementsAssignment_1_0_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4036:1: ( ( rule__ThenBlock__StatementsAssignment_1_0_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4037:1: ( rule__ThenBlock__StatementsAssignment_1_0_1_0 )
            {
             before(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_0_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4038:1: ( rule__ThenBlock__StatementsAssignment_1_0_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4038:2: rule__ThenBlock__StatementsAssignment_1_0_1_0
            {
            pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_1_0_1_0_in_rule__ThenBlock__Group_1_0_1__0__Impl8109);
            rule__ThenBlock__StatementsAssignment_1_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0_1__0__Impl


    // $ANTLR start rule__ThenBlock__Group_1_0_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4048:1: rule__ThenBlock__Group_1_0_1__1 : rule__ThenBlock__Group_1_0_1__1__Impl ;
    public final void rule__ThenBlock__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4052:1: ( rule__ThenBlock__Group_1_0_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4053:2: rule__ThenBlock__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0_1__1__Impl_in_rule__ThenBlock__Group_1_0_1__18139);
            rule__ThenBlock__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0_1__1


    // $ANTLR start rule__ThenBlock__Group_1_0_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4059:1: rule__ThenBlock__Group_1_0_1__1__Impl : ( ';' ) ;
    public final void rule__ThenBlock__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4063:1: ( ( ';' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4064:1: ( ';' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4064:1: ( ';' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4065:1: ';'
            {
             before(grammarAccess.getThenBlockAccess().getSemicolonKeyword_1_0_1_1()); 
            match(input,29,FOLLOW_29_in_rule__ThenBlock__Group_1_0_1__1__Impl8167); 
             after(grammarAccess.getThenBlockAccess().getSemicolonKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__Group_1_0_1__1__Impl


    // $ANTLR start rule__CreateStatement__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4082:1: rule__CreateStatement__Group__0 : rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 ;
    public final void rule__CreateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4086:1: ( rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4087:2: rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__08202);
            rule__CreateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__08205);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4094:1: rule__CreateStatement__Group__0__Impl : ( ( rule__CreateStatement__Group_0__0 )? ) ;
    public final void rule__CreateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4098:1: ( ( ( rule__CreateStatement__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4099:1: ( ( rule__CreateStatement__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4099:1: ( ( rule__CreateStatement__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4100:1: ( rule__CreateStatement__Group_0__0 )?
            {
             before(grammarAccess.getCreateStatementAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4101:1: ( rule__CreateStatement__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==18) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4101:2: rule__CreateStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl8232);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4111:1: rule__CreateStatement__Group__1 : rule__CreateStatement__Group__1__Impl ;
    public final void rule__CreateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4115:1: ( rule__CreateStatement__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4116:2: rule__CreateStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__18263);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4122:1: rule__CreateStatement__Group__1__Impl : ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) ;
    public final void rule__CreateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4126:1: ( ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4127:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4127:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4128:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4129:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4129:2: rule__CreateStatement__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl8290);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4143:1: rule__CreateStatement__Group_0__0 : rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 ;
    public final void rule__CreateStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4147:1: ( rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4148:2: rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__08324);
            rule__CreateStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__08327);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4155:1: rule__CreateStatement__Group_0__0__Impl : ( ( rule__CreateStatement__VarAssignment_0_0 ) ) ;
    public final void rule__CreateStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4159:1: ( ( ( rule__CreateStatement__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4160:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4160:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4161:1: ( rule__CreateStatement__VarAssignment_0_0 )
            {
             before(grammarAccess.getCreateStatementAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4162:1: ( rule__CreateStatement__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4162:2: rule__CreateStatement__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl8354);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4172:1: rule__CreateStatement__Group_0__1 : rule__CreateStatement__Group_0__1__Impl ;
    public final void rule__CreateStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4176:1: ( rule__CreateStatement__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4177:2: rule__CreateStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__18384);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4183:1: rule__CreateStatement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__CreateStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4187:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4188:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4188:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4189:1: ':'
            {
             before(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__CreateStatement__Group_0__1__Impl8412); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4206:1: rule__CreateClass__Group__0 : rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 ;
    public final void rule__CreateClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4210:1: ( rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4211:2: rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__08447);
            rule__CreateClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__08450);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4218:1: rule__CreateClass__Group__0__Impl : ( 'new' ) ;
    public final void rule__CreateClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4222:1: ( ( 'new' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4223:1: ( 'new' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4223:1: ( 'new' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4224:1: 'new'
            {
             before(grammarAccess.getCreateClassAccess().getNewKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__CreateClass__Group__0__Impl8478); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4237:1: rule__CreateClass__Group__1 : rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 ;
    public final void rule__CreateClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4241:1: ( rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4242:2: rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__18509);
            rule__CreateClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__18512);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4249:1: rule__CreateClass__Group__1__Impl : ( ( rule__CreateClass__TypeAssignment_1 ) ) ;
    public final void rule__CreateClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4253:1: ( ( ( rule__CreateClass__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4254:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4254:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4255:1: ( rule__CreateClass__TypeAssignment_1 )
            {
             before(grammarAccess.getCreateClassAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4256:1: ( rule__CreateClass__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4256:2: rule__CreateClass__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl8539);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4266:1: rule__CreateClass__Group__2 : rule__CreateClass__Group__2__Impl ;
    public final void rule__CreateClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4270:1: ( rule__CreateClass__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4271:2: rule__CreateClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__28569);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4277:1: rule__CreateClass__Group__2__Impl : ( ( rule__CreateClass__Group_2__0 )? ) ;
    public final void rule__CreateClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4281:1: ( ( ( rule__CreateClass__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4282:1: ( ( rule__CreateClass__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4282:1: ( ( rule__CreateClass__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4283:1: ( rule__CreateClass__Group_2__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4284:1: ( rule__CreateClass__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4284:2: rule__CreateClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl8596);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4300:1: rule__CreateClass__Group_2__0 : rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 ;
    public final void rule__CreateClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4304:1: ( rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4305:2: rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__08633);
            rule__CreateClass__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__08636);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4312:1: rule__CreateClass__Group_2__0__Impl : ( '{' ) ;
    public final void rule__CreateClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4316:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4317:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4317:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4318:1: '{'
            {
             before(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__CreateClass__Group_2__0__Impl8664); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4331:1: rule__CreateClass__Group_2__1 : rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 ;
    public final void rule__CreateClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4335:1: ( rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4336:2: rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__18695);
            rule__CreateClass__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__18698);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4343:1: rule__CreateClass__Group_2__1__Impl : ( ( rule__CreateClass__Group_2_1__0 )? ) ;
    public final void rule__CreateClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4347:1: ( ( ( rule__CreateClass__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4348:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4348:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4349:1: ( rule__CreateClass__Group_2_1__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4350:1: ( rule__CreateClass__Group_2_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4350:2: rule__CreateClass__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl8725);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4360:1: rule__CreateClass__Group_2__2 : rule__CreateClass__Group_2__2__Impl ;
    public final void rule__CreateClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4364:1: ( rule__CreateClass__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4365:2: rule__CreateClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__28756);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4371:1: rule__CreateClass__Group_2__2__Impl : ( '}' ) ;
    public final void rule__CreateClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4375:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4376:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4376:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4377:1: '}'
            {
             before(grammarAccess.getCreateClassAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__CreateClass__Group_2__2__Impl8784); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4396:1: rule__CreateClass__Group_2_1__0 : rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 ;
    public final void rule__CreateClass__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4400:1: ( rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4401:2: rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__08821);
            rule__CreateClass__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__08824);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4408:1: rule__CreateClass__Group_2_1__0__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) ;
    public final void rule__CreateClass__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4412:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4413:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4413:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4414:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4415:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4415:2: rule__CreateClass__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl8851);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4425:1: rule__CreateClass__Group_2_1__1 : rule__CreateClass__Group_2_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4429:1: ( rule__CreateClass__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4430:2: rule__CreateClass__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__18881);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4436:1: rule__CreateClass__Group_2_1__1__Impl : ( ( rule__CreateClass__Group_2_1_1__0 )* ) ;
    public final void rule__CreateClass__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4440:1: ( ( ( rule__CreateClass__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4441:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4441:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4442:1: ( rule__CreateClass__Group_2_1_1__0 )*
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4443:1: ( rule__CreateClass__Group_2_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4443:2: rule__CreateClass__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl8908);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4457:1: rule__CreateClass__Group_2_1_1__0 : rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 ;
    public final void rule__CreateClass__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4461:1: ( rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4462:2: rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__08943);
            rule__CreateClass__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__08946);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4469:1: rule__CreateClass__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__CreateClass__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4473:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4474:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4474:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4475:1: ','
            {
             before(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__CreateClass__Group_2_1_1__0__Impl8974); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4488:1: rule__CreateClass__Group_2_1_1__1 : rule__CreateClass__Group_2_1_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4492:1: ( rule__CreateClass__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4493:2: rule__CreateClass__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__19005);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4499:1: rule__CreateClass__Group_2_1_1__1__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__CreateClass__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4503:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4504:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4504:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4505:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4506:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4506:2: rule__CreateClass__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl9032);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4520:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4524:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4525:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__09066);
            rule__ListLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__09069);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4532:1: rule__ListLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4536:1: ( ( '[' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4537:1: ( '[' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4537:1: ( '[' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4538:1: '['
            {
             before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ListLiteral__Group__0__Impl9097); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4551:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4555:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4556:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__19128);
            rule__ListLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__19131);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4563:1: rule__ListLiteral__Group__1__Impl : ( ( rule__ListLiteral__Group_1__0 )? ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4567:1: ( ( ( rule__ListLiteral__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4568:1: ( ( rule__ListLiteral__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4568:1: ( ( rule__ListLiteral__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4569:1: ( rule__ListLiteral__Group_1__0 )?
            {
             before(grammarAccess.getListLiteralAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4570:1: ( rule__ListLiteral__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||(LA30_0>=RULE_INT && LA30_0<=RULE_FLOAT)||LA30_0==15||LA30_0==25||LA30_0==28||(LA30_0>=30 && LA30_0<=31)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4570:2: rule__ListLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ListLiteral__Group_1__0_in_rule__ListLiteral__Group__1__Impl9158);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4580:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4584:1: ( rule__ListLiteral__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4585:2: rule__ListLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__29189);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4591:1: rule__ListLiteral__Group__2__Impl : ( ']' ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4595:1: ( ( ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4596:1: ( ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4596:1: ( ']' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4597:1: ']'
            {
             before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ListLiteral__Group__2__Impl9217); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4616:1: rule__ListLiteral__Group_1__0 : rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1 ;
    public final void rule__ListLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4620:1: ( rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4621:2: rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1__0__Impl_in_rule__ListLiteral__Group_1__09254);
            rule__ListLiteral__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_1__1_in_rule__ListLiteral__Group_1__09257);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4628:1: rule__ListLiteral__Group_1__0__Impl : ( ( rule__ListLiteral__ItemsAssignment_1_0 ) ) ;
    public final void rule__ListLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4632:1: ( ( ( rule__ListLiteral__ItemsAssignment_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4633:1: ( ( rule__ListLiteral__ItemsAssignment_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4633:1: ( ( rule__ListLiteral__ItemsAssignment_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4634:1: ( rule__ListLiteral__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4635:1: ( rule__ListLiteral__ItemsAssignment_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4635:2: rule__ListLiteral__ItemsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_1_0_in_rule__ListLiteral__Group_1__0__Impl9284);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4645:1: rule__ListLiteral__Group_1__1 : rule__ListLiteral__Group_1__1__Impl ;
    public final void rule__ListLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4649:1: ( rule__ListLiteral__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4650:2: rule__ListLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1__1__Impl_in_rule__ListLiteral__Group_1__19314);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4656:1: rule__ListLiteral__Group_1__1__Impl : ( ( rule__ListLiteral__Group_1_1__0 )* ) ;
    public final void rule__ListLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4660:1: ( ( ( rule__ListLiteral__Group_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4661:1: ( ( rule__ListLiteral__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4661:1: ( ( rule__ListLiteral__Group_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4662:1: ( rule__ListLiteral__Group_1_1__0 )*
            {
             before(grammarAccess.getListLiteralAccess().getGroup_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4663:1: ( rule__ListLiteral__Group_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4663:2: rule__ListLiteral__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__0_in_rule__ListLiteral__Group_1__1__Impl9341);
            	    rule__ListLiteral__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4677:1: rule__ListLiteral__Group_1_1__0 : rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1 ;
    public final void rule__ListLiteral__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4681:1: ( rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4682:2: rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__0__Impl_in_rule__ListLiteral__Group_1_1__09376);
            rule__ListLiteral__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__1_in_rule__ListLiteral__Group_1_1__09379);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4689:1: rule__ListLiteral__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ListLiteral__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4693:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4694:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4694:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4695:1: ','
            {
             before(grammarAccess.getListLiteralAccess().getCommaKeyword_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__ListLiteral__Group_1_1__0__Impl9407); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4708:1: rule__ListLiteral__Group_1_1__1 : rule__ListLiteral__Group_1_1__1__Impl ;
    public final void rule__ListLiteral__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4712:1: ( rule__ListLiteral__Group_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4713:2: rule__ListLiteral__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__1__Impl_in_rule__ListLiteral__Group_1_1__19438);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4719:1: rule__ListLiteral__Group_1_1__1__Impl : ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) ) ;
    public final void rule__ListLiteral__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4723:1: ( ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4724:1: ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4724:1: ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4725:1: ( rule__ListLiteral__ItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4726:1: ( rule__ListLiteral__ItemsAssignment_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4726:2: rule__ListLiteral__ItemsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_1_1_1_in_rule__ListLiteral__Group_1_1__1__Impl9465);
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


    // $ANTLR start rule__Setter__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4740:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4744:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4745:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
            {
            pushFollow(FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__09499);
            rule__Setter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__09502);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4752:1: rule__Setter__Group__0__Impl : ( ( rule__Setter__PropertyAssignment_0 ) ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4756:1: ( ( ( rule__Setter__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4757:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4757:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4758:1: ( rule__Setter__PropertyAssignment_0 )
            {
             before(grammarAccess.getSetterAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4759:1: ( rule__Setter__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4759:2: rule__Setter__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl9529);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4769:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4773:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4774:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
            {
            pushFollow(FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__19559);
            rule__Setter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__19562);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4781:1: rule__Setter__Group__1__Impl : ( ( rule__Setter__Alternatives_1 ) ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4785:1: ( ( ( rule__Setter__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4786:1: ( ( rule__Setter__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4786:1: ( ( rule__Setter__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4787:1: ( rule__Setter__Alternatives_1 )
            {
             before(grammarAccess.getSetterAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4788:1: ( rule__Setter__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4788:2: rule__Setter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl9589);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4798:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4802:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4803:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
            {
            pushFollow(FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__29619);
            rule__Setter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__29622);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4810:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__ExpressionAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4814:1: ( ( ( rule__Setter__ExpressionAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4815:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4815:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4816:1: ( rule__Setter__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getExpressionAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4817:1: ( rule__Setter__ExpressionAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4817:2: rule__Setter__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl9649);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4827:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4831:1: ( rule__Setter__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4832:2: rule__Setter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__39679);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4838:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__GuardAssignment_3 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4842:1: ( ( ( rule__Setter__GuardAssignment_3 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4843:1: ( ( rule__Setter__GuardAssignment_3 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4843:1: ( ( rule__Setter__GuardAssignment_3 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4844:1: ( rule__Setter__GuardAssignment_3 )?
            {
             before(grammarAccess.getSetterAccess().getGuardAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4845:1: ( rule__Setter__GuardAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4845:2: rule__Setter__GuardAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl9706);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4863:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4867:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4868:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__09745);
            rule__Function__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__09748);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4875:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4879:1: ( ( 'function' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4880:1: ( 'function' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4880:1: ( 'function' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4881:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Function__Group__0__Impl9776); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4894:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4898:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4899:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__19807);
            rule__Function__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__19810);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4906:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4910:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4911:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4911:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4912:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4913:1: ( rule__Function__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4913:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl9837);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4923:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4927:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4928:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__29867);
            rule__Function__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__29870);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4935:1: rule__Function__Group__2__Impl : ( ( rule__Function__JavaClassAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4939:1: ( ( ( rule__Function__JavaClassAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4940:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4940:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4941:1: ( rule__Function__JavaClassAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4942:1: ( rule__Function__JavaClassAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4942:2: rule__Function__JavaClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl9897);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4952:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4956:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4957:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__39927);
            rule__Function__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__39930);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4964:1: rule__Function__Group__3__Impl : ( '#' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4968:1: ( ( '#' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4969:1: ( '#' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4969:1: ( '#' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4970:1: '#'
            {
             before(grammarAccess.getFunctionAccess().getNumberSignKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Function__Group__3__Impl9958); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4983:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4987:1: ( rule__Function__Group__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4988:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__49989);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4994:1: rule__Function__Group__4__Impl : ( ( rule__Function__OperationAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4998:1: ( ( ( rule__Function__OperationAssignment_4 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4999:1: ( ( rule__Function__OperationAssignment_4 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4999:1: ( ( rule__Function__OperationAssignment_4 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5000:1: ( rule__Function__OperationAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getOperationAssignment_4()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5001:1: ( rule__Function__OperationAssignment_4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5001:2: rule__Function__OperationAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__OperationAssignment_4_in_rule__Function__Group__4__Impl10016);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5021:1: rule__UpdateStatement__Group__0 : rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 ;
    public final void rule__UpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5025:1: ( rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5026:2: rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__010056);
            rule__UpdateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__010059);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5033:1: rule__UpdateStatement__Group__0__Impl : ( 'update' ) ;
    public final void rule__UpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5037:1: ( ( 'update' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5038:1: ( 'update' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5038:1: ( 'update' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5039:1: 'update'
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__UpdateStatement__Group__0__Impl10087); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5052:1: rule__UpdateStatement__Group__1 : rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 ;
    public final void rule__UpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5056:1: ( rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5057:2: rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__110118);
            rule__UpdateStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__110121);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5064:1: rule__UpdateStatement__Group__1__Impl : ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) ;
    public final void rule__UpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5068:1: ( ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5069:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5069:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5070:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5071:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5071:2: rule__UpdateStatement__VarRefAssignment_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl10148);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5081:1: rule__UpdateStatement__Group__2 : rule__UpdateStatement__Group__2__Impl ;
    public final void rule__UpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5085:1: ( rule__UpdateStatement__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5086:2: rule__UpdateStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__210178);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5092:1: rule__UpdateStatement__Group__2__Impl : ( ( rule__UpdateStatement__Group_2__0 )? ) ;
    public final void rule__UpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5096:1: ( ( ( rule__UpdateStatement__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5097:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5097:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5098:1: ( rule__UpdateStatement__Group_2__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5099:1: ( rule__UpdateStatement__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5099:2: rule__UpdateStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl10205);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5115:1: rule__UpdateStatement__Group_2__0 : rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 ;
    public final void rule__UpdateStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5119:1: ( rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5120:2: rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__010242);
            rule__UpdateStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__010245);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5127:1: rule__UpdateStatement__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UpdateStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5131:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5132:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5132:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5133:1: '{'
            {
             before(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__UpdateStatement__Group_2__0__Impl10273); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5146:1: rule__UpdateStatement__Group_2__1 : rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 ;
    public final void rule__UpdateStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5150:1: ( rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5151:2: rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__110304);
            rule__UpdateStatement__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__110307);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5158:1: rule__UpdateStatement__Group_2__1__Impl : ( ( rule__UpdateStatement__Group_2_1__0 )? ) ;
    public final void rule__UpdateStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5162:1: ( ( ( rule__UpdateStatement__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5163:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5163:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5164:1: ( rule__UpdateStatement__Group_2_1__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5165:1: ( rule__UpdateStatement__Group_2_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5165:2: rule__UpdateStatement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl10334);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5175:1: rule__UpdateStatement__Group_2__2 : rule__UpdateStatement__Group_2__2__Impl ;
    public final void rule__UpdateStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5179:1: ( rule__UpdateStatement__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5180:2: rule__UpdateStatement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__210365);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5186:1: rule__UpdateStatement__Group_2__2__Impl : ( '}' ) ;
    public final void rule__UpdateStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5190:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5191:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5191:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5192:1: '}'
            {
             before(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__UpdateStatement__Group_2__2__Impl10393); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5211:1: rule__UpdateStatement__Group_2_1__0 : rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 ;
    public final void rule__UpdateStatement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5215:1: ( rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5216:2: rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__010430);
            rule__UpdateStatement__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__010433);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5223:1: rule__UpdateStatement__Group_2_1__0__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) ;
    public final void rule__UpdateStatement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5227:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5228:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5228:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5229:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5230:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5230:2: rule__UpdateStatement__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl10460);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5240:1: rule__UpdateStatement__Group_2_1__1 : rule__UpdateStatement__Group_2_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5244:1: ( rule__UpdateStatement__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5245:2: rule__UpdateStatement__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__110490);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5251:1: rule__UpdateStatement__Group_2_1__1__Impl : ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) ;
    public final void rule__UpdateStatement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5255:1: ( ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5256:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5256:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5257:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5258:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==27) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5258:2: rule__UpdateStatement__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl10517);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5272:1: rule__UpdateStatement__Group_2_1_1__0 : rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 ;
    public final void rule__UpdateStatement__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5276:1: ( rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5277:2: rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__010552);
            rule__UpdateStatement__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__010555);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5284:1: rule__UpdateStatement__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__UpdateStatement__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5288:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5289:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5289:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5290:1: ','
            {
             before(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__UpdateStatement__Group_2_1_1__0__Impl10583); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5303:1: rule__UpdateStatement__Group_2_1_1__1 : rule__UpdateStatement__Group_2_1_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5307:1: ( rule__UpdateStatement__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5308:2: rule__UpdateStatement__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__110614);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5314:1: rule__UpdateStatement__Group_2_1_1__1__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__UpdateStatement__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5318:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5319:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5319:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5320:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5321:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5321:2: rule__UpdateStatement__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl10641);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5335:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5339:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5340:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__010675);
            rule__FQN__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__010678);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5347:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5351:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5352:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5352:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5353:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl10705); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5364:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5368:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5369:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__110734);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5375:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5379:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5380:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5380:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5381:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5382:1: ( rule__FQN__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5382:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl10761);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5396:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5400:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5401:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__010796);
            rule__FQN__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__010799);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5408:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5412:1: ( ( '.' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5413:1: ( '.' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5413:1: ( '.' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5414:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__FQN__Group_1__0__Impl10827); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5427:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5431:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5432:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__110858);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5438:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5442:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5443:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5443:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5444:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl10885); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5463:1: rule__Scaffolding__ScaffoldAssignment_0 : ( ruleScaffold ) ;
    public final void rule__Scaffolding__ScaffoldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5467:1: ( ( ruleScaffold ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5468:1: ( ruleScaffold )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5468:1: ( ruleScaffold )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5469:1: ruleScaffold
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldScaffoldParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_010926);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5478:1: rule__Scaffolding__ElementsAssignment_1 : ( ruleScaffoldingElement ) ;
    public final void rule__Scaffolding__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5482:1: ( ( ruleScaffoldingElement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5483:1: ( ruleScaffoldingElement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5483:1: ( ruleScaffoldingElement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5484:1: ruleScaffoldingElement
            {
             before(grammarAccess.getScaffoldingAccess().getElementsScaffoldingElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_110957);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5493:1: rule__Scaffold__RefPackageAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Scaffold__RefPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5497:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5498:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5498:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5499:1: ( RULE_STRING )
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageEPackageCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5500:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5501:1: RULE_STRING
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageEPackageSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_110992); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5512:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5516:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5517:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5517:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5518:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_111027); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5527:1: rule__Rule__WhenAssignment_2 : ( ruleWhenBlock ) ;
    public final void rule__Rule__WhenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5531:1: ( ( ruleWhenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5532:1: ( ruleWhenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5532:1: ( ruleWhenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5533:1: ruleWhenBlock
            {
             before(grammarAccess.getRuleAccess().getWhenWhenBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_211058);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5542:1: rule__Rule__ThenAssignment_3 : ( ruleThenBlock ) ;
    public final void rule__Rule__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5546:1: ( ( ruleThenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5547:1: ( ruleThenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5547:1: ( ruleThenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5548:1: ruleThenBlock
            {
             before(grammarAccess.getRuleAccess().getThenThenBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_311089);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5557:1: rule__WhenBlock__MatchesAssignment_1_0_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5561:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5562:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5562:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5563:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_0_111120);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5572:1: rule__WhenBlock__MatchesAssignment_1_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5576:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5577:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5577:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5578:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_111151);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5587:1: rule__Match__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__Match__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5591:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5592:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5592:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5593:1: ruleVariable
            {
             before(grammarAccess.getMatchAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_011182);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5602:1: rule__Match__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Match__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5606:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5607:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5607:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5608:1: ( RULE_ID )
            {
             before(grammarAccess.getMatchAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5609:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5610:1: RULE_ID
            {
             before(grammarAccess.getMatchAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_111217); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5621:1: rule__Match__ParamsAssignment_2_1_0 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5625:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5626:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5626:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5627:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_011252);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5636:1: rule__Match__ParamsAssignment_2_1_1_1 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5640:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5641:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5641:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5642:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_111283);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5651:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5655:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5656:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5656:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5657:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment11314); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5666:1: rule__Param__PropertyAssignment_0 : ( ruleBindingExpression ) ;
    public final void rule__Param__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5670:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5671:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5671:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5672:1: ruleBindingExpression
            {
             before(grammarAccess.getParamAccess().getPropertyBindingExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__Param__PropertyAssignment_011345);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5681:1: rule__Param__VarAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__Param__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5685:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5686:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5686:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5687:1: ruleVariable
            {
             before(grammarAccess.getParamAccess().getVarVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_111376);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5696:1: rule__BindingExpression__OpAssignment_1_1 : ( RULE_OPERATOR_LOW_PRIORITY ) ;
    public final void rule__BindingExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5700:1: ( ( RULE_OPERATOR_LOW_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5701:1: ( RULE_OPERATOR_LOW_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5701:1: ( RULE_OPERATOR_LOW_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5702:1: RULE_OPERATOR_LOW_PRIORITY
            {
             before(grammarAccess.getBindingExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__BindingExpression__OpAssignment_1_111407); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5711:1: rule__BindingExpression__RightAssignment_1_2 : ( ruleBindingExpression ) ;
    public final void rule__BindingExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5715:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5716:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5716:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5717:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingExpressionAccess().getRightBindingExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingExpression__RightAssignment_1_211438);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5726:1: rule__BindingExpressionHigh__OpAssignment_1_1 : ( RULE_OPERATOR_HIGH_PRIORITY ) ;
    public final void rule__BindingExpressionHigh__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5730:1: ( ( RULE_OPERATOR_HIGH_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5731:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5731:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5732:1: RULE_OPERATOR_HIGH_PRIORITY
            {
             before(grammarAccess.getBindingExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__BindingExpressionHigh__OpAssignment_1_111469); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5741:1: rule__BindingExpressionHigh__RightAssignment_1_2 : ( ruleBindingExpressionHigh ) ;
    public final void rule__BindingExpressionHigh__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5745:1: ( ( ruleBindingExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5746:1: ( ruleBindingExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5746:1: ( ruleBindingExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5747:1: ruleBindingExpressionHigh
            {
             before(grammarAccess.getBindingExpressionHighAccess().getRightBindingExpressionHighParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpressionHigh__RightAssignment_1_211500);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5756:1: rule__BindingTerminalExpression__ExpAssignment_1_2 : ( ruleBindingTerminalExpression ) ;
    public final void rule__BindingTerminalExpression__ExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5760:1: ( ( ruleBindingTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5761:1: ( ruleBindingTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5761:1: ( ruleBindingTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5762:1: ruleBindingTerminalExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingTerminalExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_rule__BindingTerminalExpression__ExpAssignment_1_211531);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5771:1: rule__BindingTerminalExpression__FunctionAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__BindingTerminalExpression__FunctionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5775:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5776:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5776:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5777:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionCrossReference_3_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5778:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5779:1: RULE_ID
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BindingTerminalExpression__FunctionAssignment_3_111566); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5790:1: rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0 : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5794:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5795:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5795:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5796:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsBindingExpressionParserRuleCall_3_3_0_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_011601);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5805:1: rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1 : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5809:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5810:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5810:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5811:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsBindingExpressionParserRuleCall_3_3_1_1_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_111632);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5820:1: rule__Expression__OpAssignment_1_1 : ( RULE_OPERATOR_LOW_PRIORITY ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5824:1: ( ( RULE_OPERATOR_LOW_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5825:1: ( RULE_OPERATOR_LOW_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5825:1: ( RULE_OPERATOR_LOW_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5826:1: RULE_OPERATOR_LOW_PRIORITY
            {
             before(grammarAccess.getExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__Expression__OpAssignment_1_111663); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5835:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5839:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5840:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5840:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5841:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_211694);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5850:1: rule__ExpressionHigh__OpAssignment_1_1 : ( RULE_OPERATOR_HIGH_PRIORITY ) ;
    public final void rule__ExpressionHigh__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5854:1: ( ( RULE_OPERATOR_HIGH_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5855:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5855:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5856:1: RULE_OPERATOR_HIGH_PRIORITY
            {
             before(grammarAccess.getExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__ExpressionHigh__OpAssignment_1_111725); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5865:1: rule__ExpressionHigh__RightAssignment_1_2 : ( ruleExpressionHigh ) ;
    public final void rule__ExpressionHigh__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5869:1: ( ( ruleExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5870:1: ( ruleExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5870:1: ( ruleExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5871:1: ruleExpressionHigh
            {
             before(grammarAccess.getExpressionHighAccess().getRightExpressionHighParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_rule__ExpressionHigh__RightAssignment_1_211756);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5880:1: rule__TerminalExpression__ExpAssignment_2_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5884:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5885:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5885:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5886:1: ruleTerminalExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__TerminalExpression__ExpAssignment_2_211787);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5895:1: rule__TerminalExpression__FunctionAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__FunctionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5899:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5900:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5900:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5901:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_4_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5902:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5903:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_4_111822); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5914:1: rule__TerminalExpression__ArgumentsAssignment_4_3_0 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgumentsAssignment_4_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5918:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5919:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5919:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5920:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_011857);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5929:1: rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgumentsAssignment_4_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5933:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5934:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5934:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5935:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_1_111888);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5944:1: rule__SymbolRef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SymbolRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5948:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5949:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5949:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5950:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolRefAccess().getRefSymbolCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5951:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5952:1: RULE_ID
            {
             before(grammarAccess.getSymbolRefAccess().getRefSymbolIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolRef__RefAssignment_111923); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5963:1: rule__PrimitiveLiteral__ValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5967:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5968:1: ( RULE_INT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5968:1: ( RULE_INT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5969:1: RULE_INT
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrimitiveLiteral__ValueAssignment_3_111958); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5978:1: rule__PrimitiveLiteral__ValueAssignment_4_1 : ( RULE_BOOLEAN ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5982:1: ( ( RULE_BOOLEAN ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5983:1: ( RULE_BOOLEAN )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5983:1: ( RULE_BOOLEAN )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5984:1: RULE_BOOLEAN
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueBOOLEANTerminalRuleCall_4_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__PrimitiveLiteral__ValueAssignment_4_111989); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5993:1: rule__PrimitiveLiteral__ValueAssignment_5_1 : ( RULE_FLOAT ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5997:1: ( ( RULE_FLOAT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5998:1: ( RULE_FLOAT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5998:1: ( RULE_FLOAT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5999:1: RULE_FLOAT
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueFLOATTerminalRuleCall_5_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__PrimitiveLiteral__ValueAssignment_5_112020); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6008:1: rule__FeatureRef__FeatureAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FeatureRef__FeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6012:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6013:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6013:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6014:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureCrossReference_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6015:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6016:1: RULE_ID
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureRef__FeatureAssignment12055); 
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


    // $ANTLR start rule__ThenBlock__StatementsAssignment_1_0_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6027:1: rule__ThenBlock__StatementsAssignment_1_0_1_0 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6031:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6032:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6032:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6033:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_0_1_0_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_0_1_012090);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ThenBlock__StatementsAssignment_1_0_1_0


    // $ANTLR start rule__ThenBlock__StatementsAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6042:1: rule__ThenBlock__StatementsAssignment_1_1 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6046:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6047:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6047:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6048:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_112121);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6057:1: rule__CreateStatement__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__CreateStatement__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6061:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6062:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6062:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6063:1: ruleVariable
            {
             before(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_012152);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6072:1: rule__CreateStatement__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__CreateStatement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6076:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6077:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6077:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6078:1: ruleExpression
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_112183);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6087:1: rule__CreateClass__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CreateClass__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6091:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6092:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6092:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6093:1: ( RULE_ID )
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6094:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6095:1: RULE_ID
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_112218); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6106:1: rule__CreateClass__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6110:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6111:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6111:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6112:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_012253);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6121:1: rule__CreateClass__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6125:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6126:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6126:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6127:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_112284);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6136:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6140:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6141:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6141:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6142:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12315); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6151:1: rule__ListLiteral__ItemsAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6155:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6156:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6156:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6157:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_012346);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6166:1: rule__ListLiteral__ItemsAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6170:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6171:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6171:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6172:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_1_112377);
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


    // $ANTLR start rule__Setter__PropertyAssignment_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6181:1: rule__Setter__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Setter__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6185:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6186:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6186:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6187:1: ( RULE_ID )
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6188:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6189:1: RULE_ID
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_012412); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6200:1: rule__Setter__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Setter__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6204:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6205:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6205:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6206:1: ruleExpression
            {
             before(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_212447);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6215:1: rule__Setter__GuardAssignment_3 : ( ( 'guard' ) ) ;
    public final void rule__Setter__GuardAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6219:1: ( ( ( 'guard' ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6220:1: ( ( 'guard' ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6220:1: ( ( 'guard' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6221:1: ( 'guard' )
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6222:1: ( 'guard' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6223:1: 'guard'
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Setter__GuardAssignment_312483); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6238:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6242:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6243:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6243:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6244:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_112522); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6253:1: rule__Function__JavaClassAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Function__JavaClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6257:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6258:1: ( ( ruleFQN ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6258:1: ( ( ruleFQN ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6259:1: ( ruleFQN )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeCrossReference_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6260:1: ( ruleFQN )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6261:1: ruleFQN
            {
             before(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Function__JavaClassAssignment_212557);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6272:1: rule__Function__OperationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Function__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6276:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6277:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6277:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6278:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getOperationJvmOperationCrossReference_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6279:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6280:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getOperationJvmOperationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__OperationAssignment_412596); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6291:1: rule__UpdateStatement__VarRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UpdateStatement__VarRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6295:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6296:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6296:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6297:1: ( RULE_ID )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6298:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6299:1: RULE_ID
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_112635); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6310:1: rule__UpdateStatement__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6314:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6315:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6315:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6316:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_012670);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6325:1: rule__UpdateStatement__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6329:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6330:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6330:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:6331:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_112701);
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
    public static final BitSet FOLLOW_15_in_ruleNullLiteral1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1478 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__0_in_rule__WhenBlock__Alternatives_11809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_1_1_in_rule__WhenBlock__Alternatives_11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__0_in_rule__BindingTerminalExpression__Alternatives1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__0_in_rule__BindingTerminalExpression__Alternatives1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolRef_in_rule__BindingTerminalExpression__Alternatives1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__0_in_rule__BindingTerminalExpression__Alternatives1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_rule__BindingTerminalExpression__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolRef_in_rule__TerminalExpression__Alternatives2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_rule__TerminalExpression__Alternatives2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__PrimitiveLiteral__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__PrimitiveLiteral__Alternatives2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__PrimitiveLiteral__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__0_in_rule__PrimitiveLiteral__Alternatives2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__0_in_rule__PrimitiveLiteral__Alternatives2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__0_in_rule__PrimitiveLiteral__Alternatives2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ThenBlock__Alternatives_02205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ThenBlock__Alternatives_02225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__0_in_rule__ThenBlock__Alternatives_12259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_1_1_in_rule__ThenBlock__Alternatives_12277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Setter__Alternatives_12360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Setter__Alternatives_12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02413 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2500 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Scaffold__Group__0__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12720 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22780 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__02905 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__02908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__WhenBlock__Group__0__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Alternatives_1_in_rule__WhenBlock__Group__1__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__0__Impl_in_rule__WhenBlock__Group_1_0__03028 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__1_in_rule__WhenBlock__Group_1_0__03031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WhenBlock__Group_1_0__0__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__1__Impl_in_rule__WhenBlock__Group_1_0__13090 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__2_in_rule__WhenBlock__Group_1_0__13093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_1_0_1_in_rule__WhenBlock__Group_1_0__1__Impl3120 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__2__Impl_in_rule__WhenBlock__Group_1_0__23151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__WhenBlock__Group_1_0__2__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__03216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Match__Group__1_in_rule__Match__Group__03219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13277 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03401 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Match__Group_0__1__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03524 = new BitSet(new long[]{0x0000000096008730L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Match__Group_2__0__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13586 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Match__Group_2__2__Impl3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03712 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3799 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__03834 = new BitSet(new long[]{0x0000000092008730L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__03837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Match__Group_2_1_1__0__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__13896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03957 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__14017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__04079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__04082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Param__Group_1__0__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__14141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__0__Impl_in_rule__BindingExpression__Group__04202 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__1_in_rule__BindingExpression__Group__04205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpression__Group__0__Impl4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__1__Impl_in_rule__BindingExpression__Group__14261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__0_in_rule__BindingExpression__Group__1__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__0__Impl_in_rule__BindingExpression__Group_1__04323 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__1_in_rule__BindingExpression__Group_1__04326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__1__Impl_in_rule__BindingExpression__Group_1__14384 = new BitSet(new long[]{0x0000000092008730L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__2_in_rule__BindingExpression__Group_1__14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__OpAssignment_1_1_in_rule__BindingExpression__Group_1__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__2__Impl_in_rule__BindingExpression__Group_1__24444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__RightAssignment_1_2_in_rule__BindingExpression__Group_1__2__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__0__Impl_in_rule__BindingExpressionHigh__Group__04507 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__1_in_rule__BindingExpressionHigh__Group__04510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_rule__BindingExpressionHigh__Group__0__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group__1__Impl_in_rule__BindingExpressionHigh__Group__14566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__0_in_rule__BindingExpressionHigh__Group__1__Impl4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__0__Impl_in_rule__BindingExpressionHigh__Group_1__04628 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__1_in_rule__BindingExpressionHigh__Group_1__04631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__1__Impl_in_rule__BindingExpressionHigh__Group_1__14689 = new BitSet(new long[]{0x0000000092008730L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__2_in_rule__BindingExpressionHigh__Group_1__14692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__OpAssignment_1_1_in_rule__BindingExpressionHigh__Group_1__1__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__Group_1__2__Impl_in_rule__BindingExpressionHigh__Group_1__24749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpressionHigh__RightAssignment_1_2_in_rule__BindingExpressionHigh__Group_1__2__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__0__Impl_in_rule__BindingTerminalExpression__Group_0__04812 = new BitSet(new long[]{0x0000000092008730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__1_in_rule__BindingTerminalExpression__Group_0__04815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BindingTerminalExpression__Group_0__0__Impl4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__1__Impl_in_rule__BindingTerminalExpression__Group_0__14874 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__2_in_rule__BindingTerminalExpression__Group_0__14877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__Group_0__1__Impl4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__2__Impl_in_rule__BindingTerminalExpression__Group_0__24933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BindingTerminalExpression__Group_0__2__Impl4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__0__Impl_in_rule__BindingTerminalExpression__Group_1__04998 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__1_in_rule__BindingTerminalExpression__Group_1__05001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__1__Impl_in_rule__BindingTerminalExpression__Group_1__15059 = new BitSet(new long[]{0x0000000092008730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__2_in_rule__BindingTerminalExpression__Group_1__15062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BindingTerminalExpression__Group_1__1__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_1__2__Impl_in_rule__BindingTerminalExpression__Group_1__25121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ExpAssignment_1_2_in_rule__BindingTerminalExpression__Group_1__2__Impl5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__0__Impl_in_rule__BindingTerminalExpression__Group_3__05184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__1_in_rule__BindingTerminalExpression__Group_3__05187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__1__Impl_in_rule__BindingTerminalExpression__Group_3__15245 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__2_in_rule__BindingTerminalExpression__Group_3__15248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__FunctionAssignment_3_1_in_rule__BindingTerminalExpression__Group_3__1__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__2__Impl_in_rule__BindingTerminalExpression__Group_3__25305 = new BitSet(new long[]{0x0000000096008730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__3_in_rule__BindingTerminalExpression__Group_3__25308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BindingTerminalExpression__Group_3__2__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__3__Impl_in_rule__BindingTerminalExpression__Group_3__35367 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__4_in_rule__BindingTerminalExpression__Group_3__35370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3__0_in_rule__BindingTerminalExpression__Group_3__3__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3__4__Impl_in_rule__BindingTerminalExpression__Group_3__45428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BindingTerminalExpression__Group_3__4__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3__0__Impl_in_rule__BindingTerminalExpression__Group_3_3__05497 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3__1_in_rule__BindingTerminalExpression__Group_3_3__05500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_0_in_rule__BindingTerminalExpression__Group_3_3__0__Impl5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3__1__Impl_in_rule__BindingTerminalExpression__Group_3_3__15557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__0_in_rule__BindingTerminalExpression__Group_3_3__1__Impl5584 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__0__Impl_in_rule__BindingTerminalExpression__Group_3_3_1__05619 = new BitSet(new long[]{0x0000000092008730L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__1_in_rule__BindingTerminalExpression__Group_3_3_1__05622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BindingTerminalExpression__Group_3_3_1__0__Impl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_3_3_1__1__Impl_in_rule__BindingTerminalExpression__Group_3_3_1__15681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_1_in_rule__BindingTerminalExpression__Group_3_3_1__1__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05742 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_rule__Expression__Group__0__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15924 = new BitSet(new long[]{0x00000000D2008730L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__15927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__25984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__0__Impl_in_rule__ExpressionHigh__Group__06047 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__1_in_rule__ExpressionHigh__Group__06050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__ExpressionHigh__Group__0__Impl6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__1__Impl_in_rule__ExpressionHigh__Group__16106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__0_in_rule__ExpressionHigh__Group__1__Impl6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__0__Impl_in_rule__ExpressionHigh__Group_1__06168 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__1_in_rule__ExpressionHigh__Group_1__06171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__1__Impl_in_rule__ExpressionHigh__Group_1__16229 = new BitSet(new long[]{0x00000000D2008730L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__2_in_rule__ExpressionHigh__Group_1__16232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__OpAssignment_1_1_in_rule__ExpressionHigh__Group_1__1__Impl6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__2__Impl_in_rule__ExpressionHigh__Group_1__26289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__RightAssignment_1_2_in_rule__ExpressionHigh__Group_1__2__Impl6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__06352 = new BitSet(new long[]{0x00000000D2008730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__06355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TerminalExpression__Group_0__0__Impl6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__16414 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__16417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__26473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TerminalExpression__Group_0__2__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__06538 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__06541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__16599 = new BitSet(new long[]{0x00000000D2008730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__2_in_rule__TerminalExpression__Group_2__16602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TerminalExpression__Group_2__1__Impl6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__2__Impl_in_rule__TerminalExpression__Group_2__26661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ExpAssignment_2_2_in_rule__TerminalExpression__Group_2__2__Impl6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__06724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__06727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__16785 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__16788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__FunctionAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__26845 = new BitSet(new long[]{0x00000000D6008730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__3_in_rule__TerminalExpression__Group_4__26848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TerminalExpression__Group_4__2__Impl6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__3__Impl_in_rule__TerminalExpression__Group_4__36907 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__4_in_rule__TerminalExpression__Group_4__36910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__0_in_rule__TerminalExpression__Group_4__3__Impl6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__4__Impl_in_rule__TerminalExpression__Group_4__46968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TerminalExpression__Group_4__4__Impl6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__0__Impl_in_rule__TerminalExpression__Group_4_3__07037 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__1_in_rule__TerminalExpression__Group_4_3__07040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_0_in_rule__TerminalExpression__Group_4_3__0__Impl7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__1__Impl_in_rule__TerminalExpression__Group_4_3__17097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__0_in_rule__TerminalExpression__Group_4_3__1__Impl7124 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__0__Impl_in_rule__TerminalExpression__Group_4_3_1__07159 = new BitSet(new long[]{0x00000000D2008730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__1_in_rule__TerminalExpression__Group_4_3_1__07162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TerminalExpression__Group_4_3_1__0__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__1__Impl_in_rule__TerminalExpression__Group_4_3_1__17221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_1_1_in_rule__TerminalExpression__Group_4_3_1__1__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__0__Impl_in_rule__SymbolRef__Group__07282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__1_in_rule__SymbolRef__Group__07285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__1__Impl_in_rule__SymbolRef__Group__17343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__RefAssignment_1_in_rule__SymbolRef__Group__1__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__0__Impl_in_rule__PrimitiveLiteral__Group_3__07404 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__1_in_rule__PrimitiveLiteral__Group_3__07407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__1__Impl_in_rule__PrimitiveLiteral__Group_3__17465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_3_1_in_rule__PrimitiveLiteral__Group_3__1__Impl7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__0__Impl_in_rule__PrimitiveLiteral__Group_4__07526 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__1_in_rule__PrimitiveLiteral__Group_4__07529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__1__Impl_in_rule__PrimitiveLiteral__Group_4__17587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_4_1_in_rule__PrimitiveLiteral__Group_4__1__Impl7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__0__Impl_in_rule__PrimitiveLiteral__Group_5__07648 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__1_in_rule__PrimitiveLiteral__Group_5__07651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__1__Impl_in_rule__PrimitiveLiteral__Group_5__17709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_5_1_in_rule__PrimitiveLiteral__Group_5__1__Impl7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__07770 = new BitSet(new long[]{0x00000008D2808730L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__07773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_0_in_rule__ThenBlock__Group__0__Impl7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__17830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__0__Impl_in_rule__ThenBlock__Group_1_0__07891 = new BitSet(new long[]{0x00000008D3008730L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__1_in_rule__ThenBlock__Group_1_0__07894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ThenBlock__Group_1_0__0__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__1__Impl_in_rule__ThenBlock__Group_1_0__17953 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__2_in_rule__ThenBlock__Group_1_0__17956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0_1__0_in_rule__ThenBlock__Group_1_0__1__Impl7983 = new BitSet(new long[]{0x00000008D2008732L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__2__Impl_in_rule__ThenBlock__Group_1_0__28014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ThenBlock__Group_1_0__2__Impl8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0_1__0__Impl_in_rule__ThenBlock__Group_1_0_1__08079 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0_1__1_in_rule__ThenBlock__Group_1_0_1__08082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_1_0_1_0_in_rule__ThenBlock__Group_1_0_1__0__Impl8109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0_1__1__Impl_in_rule__ThenBlock__Group_1_0_1__18139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ThenBlock__Group_1_0_1__1__Impl8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__08202 = new BitSet(new long[]{0x00000000D2008730L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__08205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl8232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__18263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__08324 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__08327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl8354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__18384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CreateStatement__Group_0__1__Impl8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__08447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__08450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CreateClass__Group__0__Impl8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__18509 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__18512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__28569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__08633 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__08636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CreateClass__Group_2__0__Impl8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__18695 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__18698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__28756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CreateClass__Group_2__2__Impl8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__08821 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__08824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__18881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl8908 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__08943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__08946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CreateClass__Group_2_1_1__0__Impl8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__19005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl9032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__09066 = new BitSet(new long[]{0x00000001D2008730L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__09069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ListLiteral__Group__0__Impl9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__19128 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__19131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__0_in_rule__ListLiteral__Group__1__Impl9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__29189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ListLiteral__Group__2__Impl9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__0__Impl_in_rule__ListLiteral__Group_1__09254 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__1_in_rule__ListLiteral__Group_1__09257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_1_0_in_rule__ListLiteral__Group_1__0__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__1__Impl_in_rule__ListLiteral__Group_1__19314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__0_in_rule__ListLiteral__Group_1__1__Impl9341 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__0__Impl_in_rule__ListLiteral__Group_1_1__09376 = new BitSet(new long[]{0x00000000D2008730L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__1_in_rule__ListLiteral__Group_1_1__09379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ListLiteral__Group_1_1__0__Impl9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__1__Impl_in_rule__ListLiteral__Group_1_1__19438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_1_1_1_in_rule__ListLiteral__Group_1_1__1__Impl9465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__09499 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__09502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__19559 = new BitSet(new long[]{0x00000000D2008730L});
    public static final BitSet FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__19562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl9589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__29619 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__29622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl9649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__39679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__09745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__09748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Function__Group__0__Impl9776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__19807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__19810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__29867 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__29870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl9897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__39927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__39930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Function__Group__3__Impl9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__49989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OperationAssignment_4_in_rule__Function__Group__4__Impl10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__010056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__010059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UpdateStatement__Group__0__Impl10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__110118 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__110121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__210178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__010242 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__010245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UpdateStatement__Group_2__0__Impl10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__110304 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__110307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl10334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__210365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UpdateStatement__Group_2__2__Impl10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__010430 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__010433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl10460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__110490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl10517 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__010552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__010555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UpdateStatement__Group_2_1_1__0__Impl10583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__110614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__010675 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__010678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl10705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__110734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl10761 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__010796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__010799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FQN__Group_1__0__Impl10827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__110858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl10885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_010926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_110957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_110992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_111027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_211058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_311089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_0_111120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_111151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_011182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_111217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_011252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_111283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment11314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__Param__PropertyAssignment_011345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_111376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__BindingExpression__OpAssignment_1_111407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingExpression__RightAssignment_1_211438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__BindingExpressionHigh__OpAssignment_1_111469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_rule__BindingExpressionHigh__RightAssignment_1_211500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_rule__BindingTerminalExpression__ExpAssignment_1_211531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BindingTerminalExpression__FunctionAssignment_3_111566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_011601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ArgumentsAssignment_3_3_1_111632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__Expression__OpAssignment_1_111663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_211694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__ExpressionHigh__OpAssignment_1_111725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_rule__ExpressionHigh__RightAssignment_1_211756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__TerminalExpression__ExpAssignment_2_211787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_4_111822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_011857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_1_111888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolRef__RefAssignment_111923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrimitiveLiteral__ValueAssignment_3_111958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__PrimitiveLiteral__ValueAssignment_4_111989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__PrimitiveLiteral__ValueAssignment_5_112020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureRef__FeatureAssignment12055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_0_1_012090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_112121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_012152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_112183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_112218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_012253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_112284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_012346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_1_112377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_012412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_212447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Setter__GuardAssignment_312483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_112522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Function__JavaClassAssignment_212557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__OperationAssignment_412596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_112635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_012670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_112701 = new BitSet(new long[]{0x0000000000000002L});

}