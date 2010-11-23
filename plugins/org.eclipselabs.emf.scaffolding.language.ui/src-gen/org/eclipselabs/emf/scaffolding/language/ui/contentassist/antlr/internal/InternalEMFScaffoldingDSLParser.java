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


    // $ANTLR start entryRuleExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:287:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:288:1: ( ruleExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:289:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression543);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression550); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:296:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:300:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:301:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:301:1: ( ( rule__Expression__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:302:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:303:1: ( rule__Expression__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:303:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression576);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:315:1: entryRuleExpressionHigh : ruleExpressionHigh EOF ;
    public final void entryRuleExpressionHigh() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:316:1: ( ruleExpressionHigh EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:317:1: ruleExpressionHigh EOF
            {
             before(grammarAccess.getExpressionHighRule()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh603);
            ruleExpressionHigh();
            _fsp--;

             after(grammarAccess.getExpressionHighRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionHigh610); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:324:1: ruleExpressionHigh : ( ( rule__ExpressionHigh__Group__0 ) ) ;
    public final void ruleExpressionHigh() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:328:2: ( ( ( rule__ExpressionHigh__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:329:1: ( ( rule__ExpressionHigh__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:329:1: ( ( rule__ExpressionHigh__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:330:1: ( rule__ExpressionHigh__Group__0 )
            {
             before(grammarAccess.getExpressionHighAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:331:1: ( rule__ExpressionHigh__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:331:2: rule__ExpressionHigh__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__0_in_ruleExpressionHigh636);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:343:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:344:1: ( ruleTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:345:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression663);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression670); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:352:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:356:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:357:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:357:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:358:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:359:1: ( rule__TerminalExpression__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:359:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression696);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:371:1: entryRuleSymbolRef : ruleSymbolRef EOF ;
    public final void entryRuleSymbolRef() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:372:1: ( ruleSymbolRef EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:373:1: ruleSymbolRef EOF
            {
             before(grammarAccess.getSymbolRefRule()); 
            pushFollow(FOLLOW_ruleSymbolRef_in_entryRuleSymbolRef723);
            ruleSymbolRef();
            _fsp--;

             after(grammarAccess.getSymbolRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolRef730); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:380:1: ruleSymbolRef : ( ( rule__SymbolRef__Group__0 ) ) ;
    public final void ruleSymbolRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:384:2: ( ( ( rule__SymbolRef__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:385:1: ( ( rule__SymbolRef__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:385:1: ( ( rule__SymbolRef__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:386:1: ( rule__SymbolRef__Group__0 )
            {
             before(grammarAccess.getSymbolRefAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:387:1: ( rule__SymbolRef__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:387:2: rule__SymbolRef__Group__0
            {
            pushFollow(FOLLOW_rule__SymbolRef__Group__0_in_ruleSymbolRef756);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:399:1: entryRulePrimitiveLiteral : rulePrimitiveLiteral EOF ;
    public final void entryRulePrimitiveLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:400:1: ( rulePrimitiveLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:401:1: rulePrimitiveLiteral EOF
            {
             before(grammarAccess.getPrimitiveLiteralRule()); 
            pushFollow(FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral783);
            rulePrimitiveLiteral();
            _fsp--;

             after(grammarAccess.getPrimitiveLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveLiteral790); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:408:1: rulePrimitiveLiteral : ( ( rule__PrimitiveLiteral__Alternatives ) ) ;
    public final void rulePrimitiveLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:412:2: ( ( ( rule__PrimitiveLiteral__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:413:1: ( ( rule__PrimitiveLiteral__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:413:1: ( ( rule__PrimitiveLiteral__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:414:1: ( rule__PrimitiveLiteral__Alternatives )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:415:1: ( rule__PrimitiveLiteral__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:415:2: rule__PrimitiveLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Alternatives_in_rulePrimitiveLiteral816);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:427:1: entryRuleFeatureRef : ruleFeatureRef EOF ;
    public final void entryRuleFeatureRef() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:428:1: ( ruleFeatureRef EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:429:1: ruleFeatureRef EOF
            {
             before(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef843);
            ruleFeatureRef();
            _fsp--;

             after(grammarAccess.getFeatureRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef850); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:436:1: ruleFeatureRef : ( ( rule__FeatureRef__FeatureAssignment ) ) ;
    public final void ruleFeatureRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:440:2: ( ( ( rule__FeatureRef__FeatureAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:441:1: ( ( rule__FeatureRef__FeatureAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:441:1: ( ( rule__FeatureRef__FeatureAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:442:1: ( rule__FeatureRef__FeatureAssignment )
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:443:1: ( rule__FeatureRef__FeatureAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:443:2: rule__FeatureRef__FeatureAssignment
            {
            pushFollow(FOLLOW_rule__FeatureRef__FeatureAssignment_in_ruleFeatureRef876);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:455:1: entryRuleThenBlock : ruleThenBlock EOF ;
    public final void entryRuleThenBlock() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:456:1: ( ruleThenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:457:1: ruleThenBlock EOF
            {
             before(grammarAccess.getThenBlockRule()); 
            pushFollow(FOLLOW_ruleThenBlock_in_entryRuleThenBlock903);
            ruleThenBlock();
            _fsp--;

             after(grammarAccess.getThenBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenBlock910); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:464:1: ruleThenBlock : ( ( rule__ThenBlock__Group__0 ) ) ;
    public final void ruleThenBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:468:2: ( ( ( rule__ThenBlock__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:469:1: ( ( rule__ThenBlock__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:469:1: ( ( rule__ThenBlock__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:470:1: ( rule__ThenBlock__Group__0 )
            {
             before(grammarAccess.getThenBlockAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:471:1: ( rule__ThenBlock__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:471:2: rule__ThenBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0_in_ruleThenBlock936);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:483:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:484:1: ( ruleStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:485:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement963);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement970); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:492:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:496:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:497:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:497:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:498:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:499:1: ( rule__Statement__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:499:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement996);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:511:1: entryRuleCreateStatement : ruleCreateStatement EOF ;
    public final void entryRuleCreateStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:512:1: ( ruleCreateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:513:1: ruleCreateStatement EOF
            {
             before(grammarAccess.getCreateStatementRule()); 
            pushFollow(FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement1023);
            ruleCreateStatement();
            _fsp--;

             after(grammarAccess.getCreateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateStatement1030); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:520:1: ruleCreateStatement : ( ( rule__CreateStatement__Group__0 ) ) ;
    public final void ruleCreateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:524:2: ( ( ( rule__CreateStatement__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:525:1: ( ( rule__CreateStatement__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:525:1: ( ( rule__CreateStatement__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:526:1: ( rule__CreateStatement__Group__0 )
            {
             before(grammarAccess.getCreateStatementAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:527:1: ( rule__CreateStatement__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:527:2: rule__CreateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0_in_ruleCreateStatement1056);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:539:1: entryRuleCreateClass : ruleCreateClass EOF ;
    public final void entryRuleCreateClass() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:540:1: ( ruleCreateClass EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:541:1: ruleCreateClass EOF
            {
             before(grammarAccess.getCreateClassRule()); 
            pushFollow(FOLLOW_ruleCreateClass_in_entryRuleCreateClass1083);
            ruleCreateClass();
            _fsp--;

             after(grammarAccess.getCreateClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateClass1090); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:548:1: ruleCreateClass : ( ( rule__CreateClass__Group__0 ) ) ;
    public final void ruleCreateClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:552:2: ( ( ( rule__CreateClass__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:553:1: ( ( rule__CreateClass__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:553:1: ( ( rule__CreateClass__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:554:1: ( rule__CreateClass__Group__0 )
            {
             before(grammarAccess.getCreateClassAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:555:1: ( rule__CreateClass__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:555:2: rule__CreateClass__Group__0
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0_in_ruleCreateClass1116);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:567:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:568:1: ( ruleStringLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:569:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1143);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1150); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:576:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:580:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:581:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:581:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:582:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:583:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:583:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1176);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:595:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:596:1: ( ruleNullLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:597:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1203);
            ruleNullLiteral();
            _fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1210); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:604:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:608:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:609:1: ( ( rule__NullLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:609:1: ( ( rule__NullLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:610:1: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:611:1: ( rule__NullLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:611:2: rule__NullLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1236);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:623:1: entryRuleListLiteral : ruleListLiteral EOF ;
    public final void entryRuleListLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:624:1: ( ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:625:1: ruleListLiteral EOF
            {
             before(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral1263);
            ruleListLiteral();
            _fsp--;

             after(grammarAccess.getListLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral1270); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:632:1: ruleListLiteral : ( ( rule__ListLiteral__Group__0 ) ) ;
    public final void ruleListLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:636:2: ( ( ( rule__ListLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:637:1: ( ( rule__ListLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:637:1: ( ( rule__ListLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:638:1: ( rule__ListLiteral__Group__0 )
            {
             before(grammarAccess.getListLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:639:1: ( rule__ListLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:639:2: rule__ListLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1296);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:651:1: entryRuleSetter : ruleSetter EOF ;
    public final void entryRuleSetter() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:652:1: ( ruleSetter EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:653:1: ruleSetter EOF
            {
             before(grammarAccess.getSetterRule()); 
            pushFollow(FOLLOW_ruleSetter_in_entryRuleSetter1323);
            ruleSetter();
            _fsp--;

             after(grammarAccess.getSetterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetter1330); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:660:1: ruleSetter : ( ( rule__Setter__Group__0 ) ) ;
    public final void ruleSetter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:664:2: ( ( ( rule__Setter__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:665:1: ( ( rule__Setter__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:665:1: ( ( rule__Setter__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:666:1: ( rule__Setter__Group__0 )
            {
             before(grammarAccess.getSetterAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:667:1: ( rule__Setter__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:667:2: rule__Setter__Group__0
            {
            pushFollow(FOLLOW_rule__Setter__Group__0_in_ruleSetter1356);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:679:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:680:1: ( ruleFunction EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:681:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1383);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1390); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:688:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:692:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:693:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:693:1: ( ( rule__Function__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:694:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:695:1: ( rule__Function__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:695:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction1416);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:707:1: entryRuleUpdateStatement : ruleUpdateStatement EOF ;
    public final void entryRuleUpdateStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:708:1: ( ruleUpdateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:709:1: ruleUpdateStatement EOF
            {
             before(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1443);
            ruleUpdateStatement();
            _fsp--;

             after(grammarAccess.getUpdateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1450); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:716:1: ruleUpdateStatement : ( ( rule__UpdateStatement__Group__0 ) ) ;
    public final void ruleUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:720:2: ( ( ( rule__UpdateStatement__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:721:1: ( ( rule__UpdateStatement__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:721:1: ( ( rule__UpdateStatement__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:722:1: ( rule__UpdateStatement__Group__0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:1: ( rule__UpdateStatement__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:2: rule__UpdateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0_in_ruleUpdateStatement1476);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:735:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:736:1: ( ruleFQN EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:737:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1503);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1510); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:744:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:748:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:749:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:749:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:750:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:751:1: ( rule__FQN__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:751:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1536);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:769:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );
    public final void rule__ScaffoldingElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:773:1: ( ( ruleRule ) | ( ruleFunction ) )
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
                    new NoViableAltException("769:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:774:1: ( ruleRule )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:774:1: ( ruleRule )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:775:1: ruleRule
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1578);
                    ruleRule();
                    _fsp--;

                     after(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:780:6: ( ruleFunction )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:780:6: ( ruleFunction )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:781:1: ruleFunction
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1595);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:791:1: rule__WhenBlock__Alternatives_2 : ( ( ( rule__WhenBlock__Group_2_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_2_1 ) ) );
    public final void rule__WhenBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:795:1: ( ( ( rule__WhenBlock__Group_2_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_2_1 ) ) )
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
                    new NoViableAltException("791:1: rule__WhenBlock__Alternatives_2 : ( ( ( rule__WhenBlock__Group_2_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_2_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:796:1: ( ( rule__WhenBlock__Group_2_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:796:1: ( ( rule__WhenBlock__Group_2_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:797:1: ( rule__WhenBlock__Group_2_0__0 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getGroup_2_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:798:1: ( rule__WhenBlock__Group_2_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:798:2: rule__WhenBlock__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__0_in_rule__WhenBlock__Alternatives_21627);
                    rule__WhenBlock__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getWhenBlockAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:802:6: ( ( rule__WhenBlock__MatchesAssignment_2_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:802:6: ( ( rule__WhenBlock__MatchesAssignment_2_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:803:1: ( rule__WhenBlock__MatchesAssignment_2_1 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_2_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:804:1: ( rule__WhenBlock__MatchesAssignment_2_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:804:2: rule__WhenBlock__MatchesAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_2_1_in_rule__WhenBlock__Alternatives_21645);
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


    // $ANTLR start rule__TerminalExpression__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:814:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:818:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==24) ) {
                    alt3=5;
                }
                else if ( (LA3_4==EOF||(LA3_4>=RULE_OPERATOR_LOW_PRIORITY && LA3_4<=RULE_OPERATOR_HIGH_PRIORITY)||LA3_4==17||LA3_4==20||LA3_4==23||(LA3_4>=25 && LA3_4<=26)||LA3_4==28||(LA3_4>=32 && LA3_4<=33)||LA3_4==37) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("814:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );", 3, 4, input);

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
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("814:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleCreateClass ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ruleSymbolRef ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( rulePrimitiveLiteral ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:819:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:819:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:820:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:821:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:821:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1679);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:825:6: ( ruleCreateClass )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:825:6: ( ruleCreateClass )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:826:1: ruleCreateClass
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives1697);
                    ruleCreateClass();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:831:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:831:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:832:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:833:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:833:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1714);
                    rule__TerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:837:6: ( ruleSymbolRef )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:837:6: ( ruleSymbolRef )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:838:1: ruleSymbolRef
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getSymbolRefParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSymbolRef_in_rule__TerminalExpression__Alternatives1732);
                    ruleSymbolRef();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getSymbolRefParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:843:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:843:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:844:1: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:845:1: ( rule__TerminalExpression__Group_4__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:845:2: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives1749);
                    rule__TerminalExpression__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:849:6: ( rulePrimitiveLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:849:6: ( rulePrimitiveLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:850:1: rulePrimitiveLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_rule__TerminalExpression__Alternatives1767);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:860:1: rule__PrimitiveLiteral__Alternatives : ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) );
    public final void rule__PrimitiveLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:864:1: ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case RULE_INT:
                {
                alt4=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt4=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("860:1: rule__PrimitiveLiteral__Alternatives : ( ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ( rule__PrimitiveLiteral__Group_3__0 ) ) | ( ( rule__PrimitiveLiteral__Group_4__0 ) ) | ( ( rule__PrimitiveLiteral__Group_5__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:865:1: ( ruleListLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:865:1: ( ruleListLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:866:1: ruleListLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__PrimitiveLiteral__Alternatives1799);
                    ruleListLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:871:6: ( ruleStringLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:871:6: ( ruleStringLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:872:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__PrimitiveLiteral__Alternatives1816);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:877:6: ( ruleNullLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:877:6: ( ruleNullLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:878:1: ruleNullLiteral
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__PrimitiveLiteral__Alternatives1833);
                    ruleNullLiteral();
                    _fsp--;

                     after(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:883:6: ( ( rule__PrimitiveLiteral__Group_3__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:883:6: ( ( rule__PrimitiveLiteral__Group_3__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:884:1: ( rule__PrimitiveLiteral__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_3()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:885:1: ( rule__PrimitiveLiteral__Group_3__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:885:2: rule__PrimitiveLiteral__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__0_in_rule__PrimitiveLiteral__Alternatives1850);
                    rule__PrimitiveLiteral__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:889:6: ( ( rule__PrimitiveLiteral__Group_4__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:889:6: ( ( rule__PrimitiveLiteral__Group_4__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:890:1: ( rule__PrimitiveLiteral__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_4()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:891:1: ( rule__PrimitiveLiteral__Group_4__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:891:2: rule__PrimitiveLiteral__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__0_in_rule__PrimitiveLiteral__Alternatives1868);
                    rule__PrimitiveLiteral__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimitiveLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:895:6: ( ( rule__PrimitiveLiteral__Group_5__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:895:6: ( ( rule__PrimitiveLiteral__Group_5__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:896:1: ( rule__PrimitiveLiteral__Group_5__0 )
                    {
                     before(grammarAccess.getPrimitiveLiteralAccess().getGroup_5()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:897:1: ( rule__PrimitiveLiteral__Group_5__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:897:2: rule__PrimitiveLiteral__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__0_in_rule__PrimitiveLiteral__Alternatives1886);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:906:1: rule__ThenBlock__Alternatives_1 : ( ( 'then' ) | ( '->' ) );
    public final void rule__ThenBlock__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:910:1: ( ( 'then' ) | ( '->' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("906:1: rule__ThenBlock__Alternatives_1 : ( ( 'then' ) | ( '->' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:911:1: ( 'then' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:911:1: ( 'then' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:912:1: 'then'
                    {
                     before(grammarAccess.getThenBlockAccess().getThenKeyword_1_0()); 
                    match(input,15,FOLLOW_15_in_rule__ThenBlock__Alternatives_11920); 
                     after(grammarAccess.getThenBlockAccess().getThenKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:919:6: ( '->' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:919:6: ( '->' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:920:1: '->'
                    {
                     before(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__ThenBlock__Alternatives_11940); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:932:1: rule__ThenBlock__Alternatives_2 : ( ( ( rule__ThenBlock__Group_2_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_2_1 ) ) );
    public final void rule__ThenBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:936:1: ( ( ( rule__ThenBlock__Group_2_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=RULE_INT && LA6_0<=RULE_FLOAT)||LA6_0==24||LA6_0==27||(LA6_0>=29 && LA6_0<=31)||LA6_0==35) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("932:1: rule__ThenBlock__Alternatives_2 : ( ( ( rule__ThenBlock__Group_2_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_2_1 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:937:1: ( ( rule__ThenBlock__Group_2_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:937:1: ( ( rule__ThenBlock__Group_2_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:938:1: ( rule__ThenBlock__Group_2_0__0 )
                    {
                     before(grammarAccess.getThenBlockAccess().getGroup_2_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:939:1: ( rule__ThenBlock__Group_2_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:939:2: rule__ThenBlock__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__0_in_rule__ThenBlock__Alternatives_21974);
                    rule__ThenBlock__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getThenBlockAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:943:6: ( ( rule__ThenBlock__StatementsAssignment_2_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:943:6: ( ( rule__ThenBlock__StatementsAssignment_2_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:944:1: ( rule__ThenBlock__StatementsAssignment_2_1 )
                    {
                     before(grammarAccess.getThenBlockAccess().getStatementsAssignment_2_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:945:1: ( rule__ThenBlock__StatementsAssignment_2_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:945:2: rule__ThenBlock__StatementsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_2_1_in_rule__ThenBlock__Alternatives_21992);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:954:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:958:1: ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=RULE_INT && LA7_0<=RULE_FLOAT)||LA7_0==24||LA7_0==27||(LA7_0>=29 && LA7_0<=31)) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("954:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:959:1: ( ruleCreateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:959:1: ( ruleCreateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:960:1: ruleCreateStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2025);
                    ruleCreateStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:965:6: ( ruleUpdateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:965:6: ( ruleUpdateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:966:1: ruleUpdateStatement
                    {
                     before(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2042);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:976:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );
    public final void rule__Setter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:980:1: ( ( ':' ) | ( '+=' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("976:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:981:1: ( ':' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:981:1: ( ':' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:982:1: ':'
                    {
                     before(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 
                    match(input,17,FOLLOW_17_in_rule__Setter__Alternatives_12075); 
                     after(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:989:6: ( '+=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:989:6: ( '+=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:990:1: '+='
                    {
                     before(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1()); 
                    match(input,18,FOLLOW_18_in_rule__Setter__Alternatives_12095); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1005:1: rule__Scaffolding__Group__0 : rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 ;
    public final void rule__Scaffolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1009:1: ( rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1010:2: rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02128);
            rule__Scaffolding__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02131);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1017:1: rule__Scaffolding__Group__0__Impl : ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) ;
    public final void rule__Scaffolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1021:1: ( ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1022:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1022:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1023:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1024:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1024:2: rule__Scaffolding__ScaffoldAssignment_0
            {
            pushFollow(FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2158);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1034:1: rule__Scaffolding__Group__1 : rule__Scaffolding__Group__1__Impl ;
    public final void rule__Scaffolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1038:1: ( rule__Scaffolding__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1039:2: rule__Scaffolding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12188);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1045:1: rule__Scaffolding__Group__1__Impl : ( ( rule__Scaffolding__ElementsAssignment_1 )* ) ;
    public final void rule__Scaffolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1049:1: ( ( ( rule__Scaffolding__ElementsAssignment_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1050:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1050:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1051:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            {
             before(grammarAccess.getScaffoldingAccess().getElementsAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1052:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1052:2: rule__Scaffolding__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2215);
            	    rule__Scaffolding__ElementsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1066:1: rule__Scaffold__Group__0 : rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 ;
    public final void rule__Scaffold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1070:1: ( rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1071:2: rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02250);
            rule__Scaffold__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02253);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1078:1: rule__Scaffold__Group__0__Impl : ( 'scaffold' ) ;
    public final void rule__Scaffold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1082:1: ( ( 'scaffold' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1083:1: ( 'scaffold' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1083:1: ( 'scaffold' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1084:1: 'scaffold'
            {
             before(grammarAccess.getScaffoldAccess().getScaffoldKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Scaffold__Group__0__Impl2281); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1097:1: rule__Scaffold__Group__1 : rule__Scaffold__Group__1__Impl ;
    public final void rule__Scaffold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1101:1: ( rule__Scaffold__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1102:2: rule__Scaffold__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12312);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1108:1: rule__Scaffold__Group__1__Impl : ( ( rule__Scaffold__RefPackageAssignment_1 ) ) ;
    public final void rule__Scaffold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1112:1: ( ( ( rule__Scaffold__RefPackageAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1113:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1113:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1114:1: ( rule__Scaffold__RefPackageAssignment_1 )
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1115:1: ( rule__Scaffold__RefPackageAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1115:2: rule__Scaffold__RefPackageAssignment_1
            {
            pushFollow(FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2339);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1129:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1133:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1134:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02373);
            rule__Rule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02376);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1141:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1145:1: ( ( 'rule' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1146:1: ( 'rule' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1146:1: ( 'rule' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1147:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Rule__Group__0__Impl2404); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1160:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1164:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1165:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12435);
            rule__Rule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12438);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1172:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1176:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1177:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1177:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1178:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1179:1: ( rule__Rule__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1179:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2465);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1189:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1193:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1194:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22495);
            rule__Rule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22498);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1201:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__WhenAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1205:1: ( ( ( rule__Rule__WhenAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1206:1: ( ( rule__Rule__WhenAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1206:1: ( ( rule__Rule__WhenAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1207:1: ( rule__Rule__WhenAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getWhenAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1208:1: ( rule__Rule__WhenAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1208:2: rule__Rule__WhenAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2525);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1218:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1222:1: ( rule__Rule__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1223:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32555);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1229:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ThenAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1233:1: ( ( ( rule__Rule__ThenAssignment_3 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1234:1: ( ( rule__Rule__ThenAssignment_3 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1234:1: ( ( rule__Rule__ThenAssignment_3 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1235:1: ( rule__Rule__ThenAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getThenAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1236:1: ( rule__Rule__ThenAssignment_3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1236:2: rule__Rule__ThenAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl2582);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1254:1: rule__WhenBlock__Group__0 : rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 ;
    public final void rule__WhenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1258:1: ( rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1259:2: rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__02620);
            rule__WhenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__02623);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1266:1: rule__WhenBlock__Group__0__Impl : ( () ) ;
    public final void rule__WhenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1270:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1271:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1271:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1272:1: ()
            {
             before(grammarAccess.getWhenBlockAccess().getWhenBlockAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1273:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1275:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1285:1: rule__WhenBlock__Group__1 : rule__WhenBlock__Group__1__Impl rule__WhenBlock__Group__2 ;
    public final void rule__WhenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1289:1: ( rule__WhenBlock__Group__1__Impl rule__WhenBlock__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1290:2: rule__WhenBlock__Group__1__Impl rule__WhenBlock__Group__2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__12681);
            rule__WhenBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group__2_in_rule__WhenBlock__Group__12684);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1297:1: rule__WhenBlock__Group__1__Impl : ( 'when' ) ;
    public final void rule__WhenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1301:1: ( ( 'when' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1302:1: ( 'when' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1302:1: ( 'when' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1303:1: 'when'
            {
             before(grammarAccess.getWhenBlockAccess().getWhenKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__WhenBlock__Group__1__Impl2712); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1316:1: rule__WhenBlock__Group__2 : rule__WhenBlock__Group__2__Impl ;
    public final void rule__WhenBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1320:1: ( rule__WhenBlock__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1321:2: rule__WhenBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__2__Impl_in_rule__WhenBlock__Group__22743);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1327:1: rule__WhenBlock__Group__2__Impl : ( ( rule__WhenBlock__Alternatives_2 ) ) ;
    public final void rule__WhenBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1331:1: ( ( ( rule__WhenBlock__Alternatives_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1332:1: ( ( rule__WhenBlock__Alternatives_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1332:1: ( ( rule__WhenBlock__Alternatives_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1333:1: ( rule__WhenBlock__Alternatives_2 )
            {
             before(grammarAccess.getWhenBlockAccess().getAlternatives_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1334:1: ( rule__WhenBlock__Alternatives_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1334:2: rule__WhenBlock__Alternatives_2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Alternatives_2_in_rule__WhenBlock__Group__2__Impl2770);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1350:1: rule__WhenBlock__Group_2_0__0 : rule__WhenBlock__Group_2_0__0__Impl rule__WhenBlock__Group_2_0__1 ;
    public final void rule__WhenBlock__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1354:1: ( rule__WhenBlock__Group_2_0__0__Impl rule__WhenBlock__Group_2_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1355:2: rule__WhenBlock__Group_2_0__0__Impl rule__WhenBlock__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__0__Impl_in_rule__WhenBlock__Group_2_0__02806);
            rule__WhenBlock__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__1_in_rule__WhenBlock__Group_2_0__02809);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1362:1: rule__WhenBlock__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__WhenBlock__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1366:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1367:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1367:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1368:1: '{'
            {
             before(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            match(input,22,FOLLOW_22_in_rule__WhenBlock__Group_2_0__0__Impl2837); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1381:1: rule__WhenBlock__Group_2_0__1 : rule__WhenBlock__Group_2_0__1__Impl rule__WhenBlock__Group_2_0__2 ;
    public final void rule__WhenBlock__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1385:1: ( rule__WhenBlock__Group_2_0__1__Impl rule__WhenBlock__Group_2_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1386:2: rule__WhenBlock__Group_2_0__1__Impl rule__WhenBlock__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__1__Impl_in_rule__WhenBlock__Group_2_0__12868);
            rule__WhenBlock__Group_2_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__2_in_rule__WhenBlock__Group_2_0__12871);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1393:1: rule__WhenBlock__Group_2_0__1__Impl : ( ( rule__WhenBlock__MatchesAssignment_2_0_1 )* ) ;
    public final void rule__WhenBlock__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1397:1: ( ( ( rule__WhenBlock__MatchesAssignment_2_0_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1398:1: ( ( rule__WhenBlock__MatchesAssignment_2_0_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1398:1: ( ( rule__WhenBlock__MatchesAssignment_2_0_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1399:1: ( rule__WhenBlock__MatchesAssignment_2_0_1 )*
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_2_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1400:1: ( rule__WhenBlock__MatchesAssignment_2_0_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1400:2: rule__WhenBlock__MatchesAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_2_0_1_in_rule__WhenBlock__Group_2_0__1__Impl2898);
            	    rule__WhenBlock__MatchesAssignment_2_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1410:1: rule__WhenBlock__Group_2_0__2 : rule__WhenBlock__Group_2_0__2__Impl ;
    public final void rule__WhenBlock__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1414:1: ( rule__WhenBlock__Group_2_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1415:2: rule__WhenBlock__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_2_0__2__Impl_in_rule__WhenBlock__Group_2_0__22929);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1421:1: rule__WhenBlock__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__WhenBlock__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1425:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1426:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1426:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1427:1: '}'
            {
             before(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_2_0_2()); 
            match(input,23,FOLLOW_23_in_rule__WhenBlock__Group_2_0__2__Impl2957); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1446:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1450:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1451:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__02994);
            rule__Match__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__1_in_rule__Match__Group__02997);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1458:1: rule__Match__Group__0__Impl : ( ( rule__Match__Group_0__0 )? ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1462:1: ( ( ( rule__Match__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1463:1: ( ( rule__Match__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1463:1: ( ( rule__Match__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1464:1: ( rule__Match__Group_0__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1465:1: ( rule__Match__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==17) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1465:2: rule__Match__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3024);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1475:1: rule__Match__Group__1 : rule__Match__Group__1__Impl rule__Match__Group__2 ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1479:1: ( rule__Match__Group__1__Impl rule__Match__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1480:2: rule__Match__Group__1__Impl rule__Match__Group__2
            {
            pushFollow(FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13055);
            rule__Match__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13058);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1487:1: rule__Match__Group__1__Impl : ( ( rule__Match__TypeAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1491:1: ( ( ( rule__Match__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1492:1: ( ( rule__Match__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1492:1: ( ( rule__Match__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1493:1: ( rule__Match__TypeAssignment_1 )
            {
             before(grammarAccess.getMatchAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1494:1: ( rule__Match__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1494:2: rule__Match__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3085);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1504:1: rule__Match__Group__2 : rule__Match__Group__2__Impl ;
    public final void rule__Match__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1508:1: ( rule__Match__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1509:2: rule__Match__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23115);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1515:1: rule__Match__Group__2__Impl : ( ( rule__Match__Group_2__0 )? ) ;
    public final void rule__Match__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1519:1: ( ( ( rule__Match__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1520:1: ( ( rule__Match__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1520:1: ( ( rule__Match__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1521:1: ( rule__Match__Group_2__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1522:1: ( rule__Match__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1522:2: rule__Match__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3142);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1538:1: rule__Match__Group_0__0 : rule__Match__Group_0__0__Impl rule__Match__Group_0__1 ;
    public final void rule__Match__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1542:1: ( rule__Match__Group_0__0__Impl rule__Match__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1543:2: rule__Match__Group_0__0__Impl rule__Match__Group_0__1
            {
            pushFollow(FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03179);
            rule__Match__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03182);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1550:1: rule__Match__Group_0__0__Impl : ( ( rule__Match__VarAssignment_0_0 ) ) ;
    public final void rule__Match__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1554:1: ( ( ( rule__Match__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1555:1: ( ( rule__Match__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1555:1: ( ( rule__Match__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1556:1: ( rule__Match__VarAssignment_0_0 )
            {
             before(grammarAccess.getMatchAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1557:1: ( rule__Match__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1557:2: rule__Match__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3209);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1567:1: rule__Match__Group_0__1 : rule__Match__Group_0__1__Impl ;
    public final void rule__Match__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1571:1: ( rule__Match__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1572:2: rule__Match__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13239);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1578:1: rule__Match__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Match__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1582:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1583:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1583:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1584:1: ':'
            {
             before(grammarAccess.getMatchAccess().getColonKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__Match__Group_0__1__Impl3267); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1601:1: rule__Match__Group_2__0 : rule__Match__Group_2__0__Impl rule__Match__Group_2__1 ;
    public final void rule__Match__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1605:1: ( rule__Match__Group_2__0__Impl rule__Match__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1606:2: rule__Match__Group_2__0__Impl rule__Match__Group_2__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03302);
            rule__Match__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03305);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1613:1: rule__Match__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Match__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1617:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1618:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1618:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1619:1: '('
            {
             before(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Match__Group_2__0__Impl3333); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1632:1: rule__Match__Group_2__1 : rule__Match__Group_2__1__Impl rule__Match__Group_2__2 ;
    public final void rule__Match__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1636:1: ( rule__Match__Group_2__1__Impl rule__Match__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1637:2: rule__Match__Group_2__1__Impl rule__Match__Group_2__2
            {
            pushFollow(FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13364);
            rule__Match__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13367);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1644:1: rule__Match__Group_2__1__Impl : ( ( rule__Match__Group_2_1__0 )? ) ;
    public final void rule__Match__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1648:1: ( ( ( rule__Match__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1649:1: ( ( rule__Match__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1649:1: ( ( rule__Match__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1650:1: ( rule__Match__Group_2_1__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1651:1: ( rule__Match__Group_2_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||(LA13_0>=RULE_INT && LA13_0<=RULE_FLOAT)||LA13_0==24||LA13_0==27||(LA13_0>=29 && LA13_0<=31)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1651:2: rule__Match__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3394);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1661:1: rule__Match__Group_2__2 : rule__Match__Group_2__2__Impl ;
    public final void rule__Match__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1665:1: ( rule__Match__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1666:2: rule__Match__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23425);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1672:1: rule__Match__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Match__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1676:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1677:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1677:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1678:1: ')'
            {
             before(grammarAccess.getMatchAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__Match__Group_2__2__Impl3453); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1697:1: rule__Match__Group_2_1__0 : rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 ;
    public final void rule__Match__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1701:1: ( rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1702:2: rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03490);
            rule__Match__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03493);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1709:1: rule__Match__Group_2_1__0__Impl : ( ( rule__Match__ParamsAssignment_2_1_0 ) ) ;
    public final void rule__Match__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1713:1: ( ( ( rule__Match__ParamsAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1714:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1714:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1715:1: ( rule__Match__ParamsAssignment_2_1_0 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1716:1: ( rule__Match__ParamsAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1716:2: rule__Match__ParamsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3520);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1726:1: rule__Match__Group_2_1__1 : rule__Match__Group_2_1__1__Impl ;
    public final void rule__Match__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1730:1: ( rule__Match__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1731:2: rule__Match__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13550);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1737:1: rule__Match__Group_2_1__1__Impl : ( ( rule__Match__Group_2_1_1__0 )* ) ;
    public final void rule__Match__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1741:1: ( ( ( rule__Match__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1742:1: ( ( rule__Match__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1742:1: ( ( rule__Match__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1743:1: ( rule__Match__Group_2_1_1__0 )*
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1744:1: ( rule__Match__Group_2_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1744:2: rule__Match__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3577);
            	    rule__Match__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1758:1: rule__Match__Group_2_1_1__0 : rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 ;
    public final void rule__Match__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1762:1: ( rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1763:2: rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__03612);
            rule__Match__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__03615);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1770:1: rule__Match__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Match__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1774:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1775:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1775:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1776:1: ','
            {
             before(grammarAccess.getMatchAccess().getCommaKeyword_2_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Match__Group_2_1_1__0__Impl3643); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1789:1: rule__Match__Group_2_1_1__1 : rule__Match__Group_2_1_1__1__Impl ;
    public final void rule__Match__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1793:1: ( rule__Match__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1794:2: rule__Match__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__13674);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1800:1: rule__Match__Group_2_1_1__1__Impl : ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) ;
    public final void rule__Match__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1804:1: ( ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1805:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1805:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1806:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1807:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1807:2: rule__Match__ParamsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl3701);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1821:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1825:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1826:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03735);
            rule__Param__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03738);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1833:1: rule__Param__Group__0__Impl : ( ( rule__Param__PropertyAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1837:1: ( ( ( rule__Param__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1838:1: ( ( rule__Param__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1838:1: ( ( rule__Param__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1839:1: ( rule__Param__PropertyAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1840:1: ( rule__Param__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1840:2: rule__Param__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl3765);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1850:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1854:1: ( rule__Param__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1855:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__13795);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1861:1: rule__Param__Group__1__Impl : ( ( rule__Param__Group_1__0 )? ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1865:1: ( ( ( rule__Param__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1866:1: ( ( rule__Param__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1866:1: ( ( rule__Param__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1867:1: ( rule__Param__Group_1__0 )?
            {
             before(grammarAccess.getParamAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1868:1: ( rule__Param__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1868:2: rule__Param__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl3822);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1882:1: rule__Param__Group_1__0 : rule__Param__Group_1__0__Impl rule__Param__Group_1__1 ;
    public final void rule__Param__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1886:1: ( rule__Param__Group_1__0__Impl rule__Param__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1887:2: rule__Param__Group_1__0__Impl rule__Param__Group_1__1
            {
            pushFollow(FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__03857);
            rule__Param__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__03860);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1894:1: rule__Param__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Param__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1898:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1899:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1899:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1900:1: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Param__Group_1__0__Impl3888); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1913:1: rule__Param__Group_1__1 : rule__Param__Group_1__1__Impl ;
    public final void rule__Param__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1917:1: ( rule__Param__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1918:2: rule__Param__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__13919);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1924:1: rule__Param__Group_1__1__Impl : ( ( rule__Param__VarAssignment_1_1 ) ) ;
    public final void rule__Param__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1928:1: ( ( ( rule__Param__VarAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1929:1: ( ( rule__Param__VarAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1929:1: ( ( rule__Param__VarAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1930:1: ( rule__Param__VarAssignment_1_1 )
            {
             before(grammarAccess.getParamAccess().getVarAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1931:1: ( rule__Param__VarAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1931:2: rule__Param__VarAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl3946);
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


    // $ANTLR start rule__Expression__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1945:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1949:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1950:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03980);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03983);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1957:1: rule__Expression__Group__0__Impl : ( ruleExpressionHigh ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1961:1: ( ( ruleExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1962:1: ( ruleExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1962:1: ( ruleExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1963:1: ruleExpressionHigh
            {
             before(grammarAccess.getExpressionAccess().getExpressionHighParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_rule__Expression__Group__0__Impl4010);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1974:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1978:1: ( rule__Expression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1979:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14039);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1985:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1989:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1990:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1990:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1991:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1992:1: ( rule__Expression__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1992:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4066);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2006:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2010:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2011:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04101);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04104);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2018:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2022:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2023:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2023:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2024:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2025:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2027:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2037:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2041:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2042:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14162);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14165);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2049:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2053:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2054:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2054:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2055:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2056:1: ( rule__Expression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2056:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl4192);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2066:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2070:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2071:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24222);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2077:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2081:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2082:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2082:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2083:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2084:1: ( rule__Expression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2084:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4249);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2100:1: rule__ExpressionHigh__Group__0 : rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1 ;
    public final void rule__ExpressionHigh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2104:1: ( rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2105:2: rule__ExpressionHigh__Group__0__Impl rule__ExpressionHigh__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__0__Impl_in_rule__ExpressionHigh__Group__04285);
            rule__ExpressionHigh__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group__1_in_rule__ExpressionHigh__Group__04288);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2112:1: rule__ExpressionHigh__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__ExpressionHigh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2116:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2117:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2117:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2118:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionHighAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__ExpressionHigh__Group__0__Impl4315);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2129:1: rule__ExpressionHigh__Group__1 : rule__ExpressionHigh__Group__1__Impl ;
    public final void rule__ExpressionHigh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2133:1: ( rule__ExpressionHigh__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2134:2: rule__ExpressionHigh__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group__1__Impl_in_rule__ExpressionHigh__Group__14344);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2140:1: rule__ExpressionHigh__Group__1__Impl : ( ( rule__ExpressionHigh__Group_1__0 )? ) ;
    public final void rule__ExpressionHigh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2144:1: ( ( ( rule__ExpressionHigh__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2145:1: ( ( rule__ExpressionHigh__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2145:1: ( ( rule__ExpressionHigh__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2146:1: ( rule__ExpressionHigh__Group_1__0 )?
            {
             before(grammarAccess.getExpressionHighAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2147:1: ( rule__ExpressionHigh__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2147:2: rule__ExpressionHigh__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__0_in_rule__ExpressionHigh__Group__1__Impl4371);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2161:1: rule__ExpressionHigh__Group_1__0 : rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1 ;
    public final void rule__ExpressionHigh__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2165:1: ( rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2166:2: rule__ExpressionHigh__Group_1__0__Impl rule__ExpressionHigh__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__0__Impl_in_rule__ExpressionHigh__Group_1__04406);
            rule__ExpressionHigh__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__1_in_rule__ExpressionHigh__Group_1__04409);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2173:1: rule__ExpressionHigh__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionHigh__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2177:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2178:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2178:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2179:1: ()
            {
             before(grammarAccess.getExpressionHighAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2180:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2182:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2192:1: rule__ExpressionHigh__Group_1__1 : rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2 ;
    public final void rule__ExpressionHigh__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2196:1: ( rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2197:2: rule__ExpressionHigh__Group_1__1__Impl rule__ExpressionHigh__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__1__Impl_in_rule__ExpressionHigh__Group_1__14467);
            rule__ExpressionHigh__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__2_in_rule__ExpressionHigh__Group_1__14470);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2204:1: rule__ExpressionHigh__Group_1__1__Impl : ( ( rule__ExpressionHigh__OpAssignment_1_1 ) ) ;
    public final void rule__ExpressionHigh__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2208:1: ( ( ( rule__ExpressionHigh__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2209:1: ( ( rule__ExpressionHigh__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2209:1: ( ( rule__ExpressionHigh__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2210:1: ( rule__ExpressionHigh__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionHighAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2211:1: ( rule__ExpressionHigh__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2211:2: rule__ExpressionHigh__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__OpAssignment_1_1_in_rule__ExpressionHigh__Group_1__1__Impl4497);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2221:1: rule__ExpressionHigh__Group_1__2 : rule__ExpressionHigh__Group_1__2__Impl ;
    public final void rule__ExpressionHigh__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2225:1: ( rule__ExpressionHigh__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2226:2: rule__ExpressionHigh__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__Group_1__2__Impl_in_rule__ExpressionHigh__Group_1__24527);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2232:1: rule__ExpressionHigh__Group_1__2__Impl : ( ( rule__ExpressionHigh__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionHigh__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2236:1: ( ( ( rule__ExpressionHigh__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2237:1: ( ( rule__ExpressionHigh__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2237:1: ( ( rule__ExpressionHigh__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2238:1: ( rule__ExpressionHigh__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionHighAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2239:1: ( rule__ExpressionHigh__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2239:2: rule__ExpressionHigh__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExpressionHigh__RightAssignment_1_2_in_rule__ExpressionHigh__Group_1__2__Impl4554);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2255:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2259:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2260:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04590);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04593);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2267:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2271:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2272:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2272:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2273:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__TerminalExpression__Group_0__0__Impl4621); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2286:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2290:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2291:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14652);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14655);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2298:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2302:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2303:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2303:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2304:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4682);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2315:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2319:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2320:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24711);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2326:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2330:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2331:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2331:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2332:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,25,FOLLOW_25_in_rule__TerminalExpression__Group_0__2__Impl4739); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2351:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2355:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2356:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04776);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04779);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2363:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2367:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2368:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2368:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2369:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2370:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2372:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2382:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2 ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2386:1: ( rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2387:2: rule__TerminalExpression__Group_2__1__Impl rule__TerminalExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14837);
            rule__TerminalExpression__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__2_in_rule__TerminalExpression__Group_2__14840);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2394:1: rule__TerminalExpression__Group_2__1__Impl : ( '!' ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2398:1: ( ( '!' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2399:1: ( '!' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2399:1: ( '!' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2400:1: '!'
            {
             before(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_2_1()); 
            match(input,27,FOLLOW_27_in_rule__TerminalExpression__Group_2__1__Impl4868); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2413:1: rule__TerminalExpression__Group_2__2 : rule__TerminalExpression__Group_2__2__Impl ;
    public final void rule__TerminalExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2417:1: ( rule__TerminalExpression__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2418:2: rule__TerminalExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__2__Impl_in_rule__TerminalExpression__Group_2__24899);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2424:1: rule__TerminalExpression__Group_2__2__Impl : ( ( rule__TerminalExpression__ExpAssignment_2_2 ) ) ;
    public final void rule__TerminalExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2428:1: ( ( ( rule__TerminalExpression__ExpAssignment_2_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2429:1: ( ( rule__TerminalExpression__ExpAssignment_2_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2429:1: ( ( rule__TerminalExpression__ExpAssignment_2_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2430:1: ( rule__TerminalExpression__ExpAssignment_2_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpAssignment_2_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2431:1: ( rule__TerminalExpression__ExpAssignment_2_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2431:2: rule__TerminalExpression__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ExpAssignment_2_2_in_rule__TerminalExpression__Group_2__2__Impl4926);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2447:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2451:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2452:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__04962);
            rule__TerminalExpression__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__04965);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2459:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2463:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2464:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2464:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2465:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2466:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2468:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2478:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2482:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2483:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__15023);
            rule__TerminalExpression__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__15026);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2490:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2494:1: ( ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2495:1: ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2495:1: ( ( rule__TerminalExpression__FunctionAssignment_4_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2496:1: ( rule__TerminalExpression__FunctionAssignment_4_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_4_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2497:1: ( rule__TerminalExpression__FunctionAssignment_4_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2497:2: rule__TerminalExpression__FunctionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__FunctionAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl5053);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2507:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3 ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2511:1: ( rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2512:2: rule__TerminalExpression__Group_4__2__Impl rule__TerminalExpression__Group_4__3
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__25083);
            rule__TerminalExpression__Group_4__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__3_in_rule__TerminalExpression__Group_4__25086);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2519:1: rule__TerminalExpression__Group_4__2__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2523:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2524:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2524:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2525:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,24,FOLLOW_24_in_rule__TerminalExpression__Group_4__2__Impl5114); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2538:1: rule__TerminalExpression__Group_4__3 : rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4 ;
    public final void rule__TerminalExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2542:1: ( rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2543:2: rule__TerminalExpression__Group_4__3__Impl rule__TerminalExpression__Group_4__4
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__3__Impl_in_rule__TerminalExpression__Group_4__35145);
            rule__TerminalExpression__Group_4__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__4_in_rule__TerminalExpression__Group_4__35148);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2550:1: rule__TerminalExpression__Group_4__3__Impl : ( ( rule__TerminalExpression__Group_4_3__0 )? ) ;
    public final void rule__TerminalExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2554:1: ( ( ( rule__TerminalExpression__Group_4_3__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2555:1: ( ( rule__TerminalExpression__Group_4_3__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2555:1: ( ( rule__TerminalExpression__Group_4_3__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2556:1: ( rule__TerminalExpression__Group_4_3__0 )?
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2557:1: ( rule__TerminalExpression__Group_4_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||(LA18_0>=RULE_INT && LA18_0<=RULE_FLOAT)||LA18_0==24||LA18_0==27||(LA18_0>=29 && LA18_0<=31)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2557:2: rule__TerminalExpression__Group_4_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__0_in_rule__TerminalExpression__Group_4__3__Impl5175);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2567:1: rule__TerminalExpression__Group_4__4 : rule__TerminalExpression__Group_4__4__Impl ;
    public final void rule__TerminalExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2571:1: ( rule__TerminalExpression__Group_4__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2572:2: rule__TerminalExpression__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__4__Impl_in_rule__TerminalExpression__Group_4__45206);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2578:1: rule__TerminalExpression__Group_4__4__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2582:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2583:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2583:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2584:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_25_in_rule__TerminalExpression__Group_4__4__Impl5234); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2607:1: rule__TerminalExpression__Group_4_3__0 : rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1 ;
    public final void rule__TerminalExpression__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2611:1: ( rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2612:2: rule__TerminalExpression__Group_4_3__0__Impl rule__TerminalExpression__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__0__Impl_in_rule__TerminalExpression__Group_4_3__05275);
            rule__TerminalExpression__Group_4_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__1_in_rule__TerminalExpression__Group_4_3__05278);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2619:1: rule__TerminalExpression__Group_4_3__0__Impl : ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) ) ;
    public final void rule__TerminalExpression__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2623:1: ( ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2624:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2624:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2625:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2626:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2626:2: rule__TerminalExpression__ArgumentsAssignment_4_3_0
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_0_in_rule__TerminalExpression__Group_4_3__0__Impl5305);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2636:1: rule__TerminalExpression__Group_4_3__1 : rule__TerminalExpression__Group_4_3__1__Impl ;
    public final void rule__TerminalExpression__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2640:1: ( rule__TerminalExpression__Group_4_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2641:2: rule__TerminalExpression__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3__1__Impl_in_rule__TerminalExpression__Group_4_3__15335);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2647:1: rule__TerminalExpression__Group_4_3__1__Impl : ( ( rule__TerminalExpression__Group_4_3_1__0 )* ) ;
    public final void rule__TerminalExpression__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2651:1: ( ( ( rule__TerminalExpression__Group_4_3_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2652:1: ( ( rule__TerminalExpression__Group_4_3_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2652:1: ( ( rule__TerminalExpression__Group_4_3_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2653:1: ( rule__TerminalExpression__Group_4_3_1__0 )*
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_4_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2654:1: ( rule__TerminalExpression__Group_4_3_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2654:2: rule__TerminalExpression__Group_4_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__0_in_rule__TerminalExpression__Group_4_3__1__Impl5362);
            	    rule__TerminalExpression__Group_4_3_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2668:1: rule__TerminalExpression__Group_4_3_1__0 : rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1 ;
    public final void rule__TerminalExpression__Group_4_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2672:1: ( rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2673:2: rule__TerminalExpression__Group_4_3_1__0__Impl rule__TerminalExpression__Group_4_3_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__0__Impl_in_rule__TerminalExpression__Group_4_3_1__05397);
            rule__TerminalExpression__Group_4_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__1_in_rule__TerminalExpression__Group_4_3_1__05400);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2680:1: rule__TerminalExpression__Group_4_3_1__0__Impl : ( ',' ) ;
    public final void rule__TerminalExpression__Group_4_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2684:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2685:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2685:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2686:1: ','
            {
             before(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_3_1_0()); 
            match(input,26,FOLLOW_26_in_rule__TerminalExpression__Group_4_3_1__0__Impl5428); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2699:1: rule__TerminalExpression__Group_4_3_1__1 : rule__TerminalExpression__Group_4_3_1__1__Impl ;
    public final void rule__TerminalExpression__Group_4_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2703:1: ( rule__TerminalExpression__Group_4_3_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2704:2: rule__TerminalExpression__Group_4_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4_3_1__1__Impl_in_rule__TerminalExpression__Group_4_3_1__15459);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2710:1: rule__TerminalExpression__Group_4_3_1__1__Impl : ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_4_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2714:1: ( ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2715:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2715:1: ( ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2716:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsAssignment_4_3_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2717:1: ( rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2717:2: rule__TerminalExpression__ArgumentsAssignment_4_3_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_1_1_in_rule__TerminalExpression__Group_4_3_1__1__Impl5486);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2731:1: rule__SymbolRef__Group__0 : rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 ;
    public final void rule__SymbolRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2735:1: ( rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2736:2: rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolRef__Group__0__Impl_in_rule__SymbolRef__Group__05520);
            rule__SymbolRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SymbolRef__Group__1_in_rule__SymbolRef__Group__05523);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2743:1: rule__SymbolRef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2747:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2748:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2748:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2749:1: ()
            {
             before(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2750:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2752:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2762:1: rule__SymbolRef__Group__1 : rule__SymbolRef__Group__1__Impl ;
    public final void rule__SymbolRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2766:1: ( rule__SymbolRef__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2767:2: rule__SymbolRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolRef__Group__1__Impl_in_rule__SymbolRef__Group__15581);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2773:1: rule__SymbolRef__Group__1__Impl : ( ( rule__SymbolRef__RefAssignment_1 ) ) ;
    public final void rule__SymbolRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2777:1: ( ( ( rule__SymbolRef__RefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2778:1: ( ( rule__SymbolRef__RefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2778:1: ( ( rule__SymbolRef__RefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2779:1: ( rule__SymbolRef__RefAssignment_1 )
            {
             before(grammarAccess.getSymbolRefAccess().getRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2780:1: ( rule__SymbolRef__RefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2780:2: rule__SymbolRef__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__SymbolRef__RefAssignment_1_in_rule__SymbolRef__Group__1__Impl5608);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2794:1: rule__PrimitiveLiteral__Group_3__0 : rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1 ;
    public final void rule__PrimitiveLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2798:1: ( rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2799:2: rule__PrimitiveLiteral__Group_3__0__Impl rule__PrimitiveLiteral__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__0__Impl_in_rule__PrimitiveLiteral__Group_3__05642);
            rule__PrimitiveLiteral__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__1_in_rule__PrimitiveLiteral__Group_3__05645);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2806:1: rule__PrimitiveLiteral__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2810:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2811:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2811:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2812:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getIntLiteralAction_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2813:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2815:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2825:1: rule__PrimitiveLiteral__Group_3__1 : rule__PrimitiveLiteral__Group_3__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2829:1: ( rule__PrimitiveLiteral__Group_3__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2830:2: rule__PrimitiveLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_3__1__Impl_in_rule__PrimitiveLiteral__Group_3__15703);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2836:1: rule__PrimitiveLiteral__Group_3__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2840:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2841:1: ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2841:1: ( ( rule__PrimitiveLiteral__ValueAssignment_3_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2842:1: ( rule__PrimitiveLiteral__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_3_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2843:1: ( rule__PrimitiveLiteral__ValueAssignment_3_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2843:2: rule__PrimitiveLiteral__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_3_1_in_rule__PrimitiveLiteral__Group_3__1__Impl5730);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2857:1: rule__PrimitiveLiteral__Group_4__0 : rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1 ;
    public final void rule__PrimitiveLiteral__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2861:1: ( rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2862:2: rule__PrimitiveLiteral__Group_4__0__Impl rule__PrimitiveLiteral__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__0__Impl_in_rule__PrimitiveLiteral__Group_4__05764);
            rule__PrimitiveLiteral__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__1_in_rule__PrimitiveLiteral__Group_4__05767);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2869:1: rule__PrimitiveLiteral__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2873:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2874:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2874:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2875:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getBooleanLiteralAction_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2876:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2878:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2888:1: rule__PrimitiveLiteral__Group_4__1 : rule__PrimitiveLiteral__Group_4__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2892:1: ( rule__PrimitiveLiteral__Group_4__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2893:2: rule__PrimitiveLiteral__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_4__1__Impl_in_rule__PrimitiveLiteral__Group_4__15825);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2899:1: rule__PrimitiveLiteral__Group_4__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2903:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2904:1: ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2904:1: ( ( rule__PrimitiveLiteral__ValueAssignment_4_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2905:1: ( rule__PrimitiveLiteral__ValueAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_4_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2906:1: ( rule__PrimitiveLiteral__ValueAssignment_4_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2906:2: rule__PrimitiveLiteral__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_4_1_in_rule__PrimitiveLiteral__Group_4__1__Impl5852);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2920:1: rule__PrimitiveLiteral__Group_5__0 : rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1 ;
    public final void rule__PrimitiveLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2924:1: ( rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2925:2: rule__PrimitiveLiteral__Group_5__0__Impl rule__PrimitiveLiteral__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__0__Impl_in_rule__PrimitiveLiteral__Group_5__05886);
            rule__PrimitiveLiteral__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__1_in_rule__PrimitiveLiteral__Group_5__05889);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2932:1: rule__PrimitiveLiteral__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimitiveLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2936:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2937:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2937:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2938:1: ()
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getFloatLiteralAction_5_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2939:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2941:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2951:1: rule__PrimitiveLiteral__Group_5__1 : rule__PrimitiveLiteral__Group_5__1__Impl ;
    public final void rule__PrimitiveLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2955:1: ( rule__PrimitiveLiteral__Group_5__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2956:2: rule__PrimitiveLiteral__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__Group_5__1__Impl_in_rule__PrimitiveLiteral__Group_5__15947);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2962:1: rule__PrimitiveLiteral__Group_5__1__Impl : ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) ) ;
    public final void rule__PrimitiveLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2966:1: ( ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2967:1: ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2967:1: ( ( rule__PrimitiveLiteral__ValueAssignment_5_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2968:1: ( rule__PrimitiveLiteral__ValueAssignment_5_1 )
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueAssignment_5_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2969:1: ( rule__PrimitiveLiteral__ValueAssignment_5_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2969:2: rule__PrimitiveLiteral__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__PrimitiveLiteral__ValueAssignment_5_1_in_rule__PrimitiveLiteral__Group_5__1__Impl5974);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2983:1: rule__ThenBlock__Group__0 : rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 ;
    public final void rule__ThenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2987:1: ( rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2988:2: rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__06008);
            rule__ThenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__06011);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2995:1: rule__ThenBlock__Group__0__Impl : ( () ) ;
    public final void rule__ThenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2999:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3000:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3000:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3001:1: ()
            {
             before(grammarAccess.getThenBlockAccess().getThenBlockAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3002:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3004:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3014:1: rule__ThenBlock__Group__1 : rule__ThenBlock__Group__1__Impl rule__ThenBlock__Group__2 ;
    public final void rule__ThenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3018:1: ( rule__ThenBlock__Group__1__Impl rule__ThenBlock__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3019:2: rule__ThenBlock__Group__1__Impl rule__ThenBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__16069);
            rule__ThenBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group__2_in_rule__ThenBlock__Group__16072);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3026:1: rule__ThenBlock__Group__1__Impl : ( ( rule__ThenBlock__Alternatives_1 ) ) ;
    public final void rule__ThenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3030:1: ( ( ( rule__ThenBlock__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3031:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3031:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3032:1: ( rule__ThenBlock__Alternatives_1 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3033:1: ( rule__ThenBlock__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3033:2: rule__ThenBlock__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl6099);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3043:1: rule__ThenBlock__Group__2 : rule__ThenBlock__Group__2__Impl ;
    public final void rule__ThenBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3047:1: ( rule__ThenBlock__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3048:2: rule__ThenBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__2__Impl_in_rule__ThenBlock__Group__26129);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3054:1: rule__ThenBlock__Group__2__Impl : ( ( rule__ThenBlock__Alternatives_2 ) ) ;
    public final void rule__ThenBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3058:1: ( ( ( rule__ThenBlock__Alternatives_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3059:1: ( ( rule__ThenBlock__Alternatives_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3059:1: ( ( rule__ThenBlock__Alternatives_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3060:1: ( rule__ThenBlock__Alternatives_2 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3061:1: ( rule__ThenBlock__Alternatives_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3061:2: rule__ThenBlock__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_2_in_rule__ThenBlock__Group__2__Impl6156);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3077:1: rule__ThenBlock__Group_2_0__0 : rule__ThenBlock__Group_2_0__0__Impl rule__ThenBlock__Group_2_0__1 ;
    public final void rule__ThenBlock__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3081:1: ( rule__ThenBlock__Group_2_0__0__Impl rule__ThenBlock__Group_2_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3082:2: rule__ThenBlock__Group_2_0__0__Impl rule__ThenBlock__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__0__Impl_in_rule__ThenBlock__Group_2_0__06192);
            rule__ThenBlock__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__1_in_rule__ThenBlock__Group_2_0__06195);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3089:1: rule__ThenBlock__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__ThenBlock__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3093:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3094:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3094:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3095:1: '{'
            {
             before(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            match(input,22,FOLLOW_22_in_rule__ThenBlock__Group_2_0__0__Impl6223); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3108:1: rule__ThenBlock__Group_2_0__1 : rule__ThenBlock__Group_2_0__1__Impl rule__ThenBlock__Group_2_0__2 ;
    public final void rule__ThenBlock__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3112:1: ( rule__ThenBlock__Group_2_0__1__Impl rule__ThenBlock__Group_2_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3113:2: rule__ThenBlock__Group_2_0__1__Impl rule__ThenBlock__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__1__Impl_in_rule__ThenBlock__Group_2_0__16254);
            rule__ThenBlock__Group_2_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__2_in_rule__ThenBlock__Group_2_0__16257);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3120:1: rule__ThenBlock__Group_2_0__1__Impl : ( ( rule__ThenBlock__Group_2_0_1__0 )* ) ;
    public final void rule__ThenBlock__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3124:1: ( ( ( rule__ThenBlock__Group_2_0_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3125:1: ( ( rule__ThenBlock__Group_2_0_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3125:1: ( ( rule__ThenBlock__Group_2_0_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3126:1: ( rule__ThenBlock__Group_2_0_1__0 )*
            {
             before(grammarAccess.getThenBlockAccess().getGroup_2_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3127:1: ( rule__ThenBlock__Group_2_0_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||(LA20_0>=RULE_INT && LA20_0<=RULE_FLOAT)||LA20_0==24||LA20_0==27||(LA20_0>=29 && LA20_0<=31)||LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3127:2: rule__ThenBlock__Group_2_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ThenBlock__Group_2_0_1__0_in_rule__ThenBlock__Group_2_0__1__Impl6284);
            	    rule__ThenBlock__Group_2_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3137:1: rule__ThenBlock__Group_2_0__2 : rule__ThenBlock__Group_2_0__2__Impl ;
    public final void rule__ThenBlock__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3141:1: ( rule__ThenBlock__Group_2_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3142:2: rule__ThenBlock__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0__2__Impl_in_rule__ThenBlock__Group_2_0__26315);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3148:1: rule__ThenBlock__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__ThenBlock__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3152:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3153:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3153:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3154:1: '}'
            {
             before(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_2_0_2()); 
            match(input,23,FOLLOW_23_in_rule__ThenBlock__Group_2_0__2__Impl6343); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3173:1: rule__ThenBlock__Group_2_0_1__0 : rule__ThenBlock__Group_2_0_1__0__Impl rule__ThenBlock__Group_2_0_1__1 ;
    public final void rule__ThenBlock__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3177:1: ( rule__ThenBlock__Group_2_0_1__0__Impl rule__ThenBlock__Group_2_0_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3178:2: rule__ThenBlock__Group_2_0_1__0__Impl rule__ThenBlock__Group_2_0_1__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0_1__0__Impl_in_rule__ThenBlock__Group_2_0_1__06380);
            rule__ThenBlock__Group_2_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0_1__1_in_rule__ThenBlock__Group_2_0_1__06383);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3185:1: rule__ThenBlock__Group_2_0_1__0__Impl : ( ( rule__ThenBlock__StatementsAssignment_2_0_1_0 ) ) ;
    public final void rule__ThenBlock__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3189:1: ( ( ( rule__ThenBlock__StatementsAssignment_2_0_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3190:1: ( ( rule__ThenBlock__StatementsAssignment_2_0_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3190:1: ( ( rule__ThenBlock__StatementsAssignment_2_0_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3191:1: ( rule__ThenBlock__StatementsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getThenBlockAccess().getStatementsAssignment_2_0_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3192:1: ( rule__ThenBlock__StatementsAssignment_2_0_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3192:2: rule__ThenBlock__StatementsAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_2_0_1_0_in_rule__ThenBlock__Group_2_0_1__0__Impl6410);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3202:1: rule__ThenBlock__Group_2_0_1__1 : rule__ThenBlock__Group_2_0_1__1__Impl ;
    public final void rule__ThenBlock__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3206:1: ( rule__ThenBlock__Group_2_0_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3207:2: rule__ThenBlock__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_2_0_1__1__Impl_in_rule__ThenBlock__Group_2_0_1__16440);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3213:1: rule__ThenBlock__Group_2_0_1__1__Impl : ( ';' ) ;
    public final void rule__ThenBlock__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3217:1: ( ( ';' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3218:1: ( ';' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3218:1: ( ';' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3219:1: ';'
            {
             before(grammarAccess.getThenBlockAccess().getSemicolonKeyword_2_0_1_1()); 
            match(input,28,FOLLOW_28_in_rule__ThenBlock__Group_2_0_1__1__Impl6468); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3236:1: rule__CreateStatement__Group__0 : rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 ;
    public final void rule__CreateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3240:1: ( rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3241:2: rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__06503);
            rule__CreateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__06506);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3248:1: rule__CreateStatement__Group__0__Impl : ( ( rule__CreateStatement__Group_0__0 )? ) ;
    public final void rule__CreateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3252:1: ( ( ( rule__CreateStatement__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3253:1: ( ( rule__CreateStatement__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3253:1: ( ( rule__CreateStatement__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3254:1: ( rule__CreateStatement__Group_0__0 )?
            {
             before(grammarAccess.getCreateStatementAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3255:1: ( rule__CreateStatement__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==17) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3255:2: rule__CreateStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl6533);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3265:1: rule__CreateStatement__Group__1 : rule__CreateStatement__Group__1__Impl ;
    public final void rule__CreateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3269:1: ( rule__CreateStatement__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3270:2: rule__CreateStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__16564);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3276:1: rule__CreateStatement__Group__1__Impl : ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) ;
    public final void rule__CreateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3280:1: ( ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3281:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3281:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3282:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3283:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3283:2: rule__CreateStatement__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl6591);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3297:1: rule__CreateStatement__Group_0__0 : rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 ;
    public final void rule__CreateStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3301:1: ( rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3302:2: rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__06625);
            rule__CreateStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__06628);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3309:1: rule__CreateStatement__Group_0__0__Impl : ( ( rule__CreateStatement__VarAssignment_0_0 ) ) ;
    public final void rule__CreateStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3313:1: ( ( ( rule__CreateStatement__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3314:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3314:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3315:1: ( rule__CreateStatement__VarAssignment_0_0 )
            {
             before(grammarAccess.getCreateStatementAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3316:1: ( rule__CreateStatement__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3316:2: rule__CreateStatement__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl6655);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3326:1: rule__CreateStatement__Group_0__1 : rule__CreateStatement__Group_0__1__Impl ;
    public final void rule__CreateStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3330:1: ( rule__CreateStatement__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3331:2: rule__CreateStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__16685);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3337:1: rule__CreateStatement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__CreateStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3341:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3342:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3342:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3343:1: ':'
            {
             before(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__CreateStatement__Group_0__1__Impl6713); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3360:1: rule__CreateClass__Group__0 : rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 ;
    public final void rule__CreateClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3364:1: ( rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3365:2: rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__06748);
            rule__CreateClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__06751);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3372:1: rule__CreateClass__Group__0__Impl : ( 'new' ) ;
    public final void rule__CreateClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3376:1: ( ( 'new' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3377:1: ( 'new' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3377:1: ( 'new' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3378:1: 'new'
            {
             before(grammarAccess.getCreateClassAccess().getNewKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__CreateClass__Group__0__Impl6779); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3391:1: rule__CreateClass__Group__1 : rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 ;
    public final void rule__CreateClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3395:1: ( rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3396:2: rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__16810);
            rule__CreateClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__16813);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3403:1: rule__CreateClass__Group__1__Impl : ( ( rule__CreateClass__TypeAssignment_1 ) ) ;
    public final void rule__CreateClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3407:1: ( ( ( rule__CreateClass__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3408:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3408:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3409:1: ( rule__CreateClass__TypeAssignment_1 )
            {
             before(grammarAccess.getCreateClassAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3410:1: ( rule__CreateClass__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3410:2: rule__CreateClass__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl6840);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3420:1: rule__CreateClass__Group__2 : rule__CreateClass__Group__2__Impl ;
    public final void rule__CreateClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3424:1: ( rule__CreateClass__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3425:2: rule__CreateClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__26870);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3431:1: rule__CreateClass__Group__2__Impl : ( ( rule__CreateClass__Group_2__0 )? ) ;
    public final void rule__CreateClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3435:1: ( ( ( rule__CreateClass__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3436:1: ( ( rule__CreateClass__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3436:1: ( ( rule__CreateClass__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3437:1: ( rule__CreateClass__Group_2__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3438:1: ( rule__CreateClass__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3438:2: rule__CreateClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl6897);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3454:1: rule__CreateClass__Group_2__0 : rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 ;
    public final void rule__CreateClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3458:1: ( rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3459:2: rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__06934);
            rule__CreateClass__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__06937);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3466:1: rule__CreateClass__Group_2__0__Impl : ( '{' ) ;
    public final void rule__CreateClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3470:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3471:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3471:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3472:1: '{'
            {
             before(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__CreateClass__Group_2__0__Impl6965); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3485:1: rule__CreateClass__Group_2__1 : rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 ;
    public final void rule__CreateClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3489:1: ( rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3490:2: rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__16996);
            rule__CreateClass__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__16999);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3497:1: rule__CreateClass__Group_2__1__Impl : ( ( rule__CreateClass__Group_2_1__0 )? ) ;
    public final void rule__CreateClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3501:1: ( ( ( rule__CreateClass__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3502:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3502:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3503:1: ( rule__CreateClass__Group_2_1__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3504:1: ( rule__CreateClass__Group_2_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3504:2: rule__CreateClass__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl7026);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3514:1: rule__CreateClass__Group_2__2 : rule__CreateClass__Group_2__2__Impl ;
    public final void rule__CreateClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3518:1: ( rule__CreateClass__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3519:2: rule__CreateClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__27057);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3525:1: rule__CreateClass__Group_2__2__Impl : ( '}' ) ;
    public final void rule__CreateClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3529:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3530:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3530:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3531:1: '}'
            {
             before(grammarAccess.getCreateClassAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__CreateClass__Group_2__2__Impl7085); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3550:1: rule__CreateClass__Group_2_1__0 : rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 ;
    public final void rule__CreateClass__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3554:1: ( rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3555:2: rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__07122);
            rule__CreateClass__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__07125);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3562:1: rule__CreateClass__Group_2_1__0__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) ;
    public final void rule__CreateClass__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3566:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3567:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3567:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3568:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3569:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3569:2: rule__CreateClass__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl7152);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3579:1: rule__CreateClass__Group_2_1__1 : rule__CreateClass__Group_2_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3583:1: ( rule__CreateClass__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3584:2: rule__CreateClass__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__17182);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3590:1: rule__CreateClass__Group_2_1__1__Impl : ( ( rule__CreateClass__Group_2_1_1__0 )* ) ;
    public final void rule__CreateClass__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3594:1: ( ( ( rule__CreateClass__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3595:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3595:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3596:1: ( rule__CreateClass__Group_2_1_1__0 )*
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3597:1: ( rule__CreateClass__Group_2_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3597:2: rule__CreateClass__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl7209);
            	    rule__CreateClass__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3611:1: rule__CreateClass__Group_2_1_1__0 : rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 ;
    public final void rule__CreateClass__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3615:1: ( rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3616:2: rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__07244);
            rule__CreateClass__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__07247);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3623:1: rule__CreateClass__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__CreateClass__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3627:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3628:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3628:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3629:1: ','
            {
             before(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__CreateClass__Group_2_1_1__0__Impl7275); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3642:1: rule__CreateClass__Group_2_1_1__1 : rule__CreateClass__Group_2_1_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3646:1: ( rule__CreateClass__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3647:2: rule__CreateClass__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__17306);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3653:1: rule__CreateClass__Group_2_1_1__1__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__CreateClass__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3657:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3658:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3658:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3659:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3660:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3660:2: rule__CreateClass__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl7333);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3674:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3678:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3679:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__07367);
            rule__NullLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__07370);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3686:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3690:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3691:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3691:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3692:1: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3693:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3695:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3705:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3709:1: ( rule__NullLiteral__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3710:2: rule__NullLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__17428);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3716:1: rule__NullLiteral__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3720:1: ( ( 'null' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3721:1: ( 'null' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3721:1: ( 'null' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3722:1: 'null'
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__NullLiteral__Group__1__Impl7456); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3739:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3743:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3744:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__07491);
            rule__ListLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__07494);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3751:1: rule__ListLiteral__Group__0__Impl : ( () ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3755:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3756:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3756:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3757:1: ()
            {
             before(grammarAccess.getListLiteralAccess().getListLiteralAction_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3758:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3760:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3770:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3774:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3775:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__17552);
            rule__ListLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__17555);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3782:1: rule__ListLiteral__Group__1__Impl : ( '[' ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3786:1: ( ( '[' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3787:1: ( '[' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3787:1: ( '[' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3788:1: '['
            {
             before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__ListLiteral__Group__1__Impl7583); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3801:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3805:1: ( rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3806:2: rule__ListLiteral__Group__2__Impl rule__ListLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__27614);
            rule__ListLiteral__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__27617);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3813:1: rule__ListLiteral__Group__2__Impl : ( ( rule__ListLiteral__Group_2__0 )? ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3817:1: ( ( ( rule__ListLiteral__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3818:1: ( ( rule__ListLiteral__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3818:1: ( ( rule__ListLiteral__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3819:1: ( rule__ListLiteral__Group_2__0 )?
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3820:1: ( rule__ListLiteral__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||(LA25_0>=RULE_INT && LA25_0<=RULE_FLOAT)||LA25_0==24||LA25_0==27||(LA25_0>=29 && LA25_0<=31)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3820:2: rule__ListLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl7644);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3830:1: rule__ListLiteral__Group__3 : rule__ListLiteral__Group__3__Impl ;
    public final void rule__ListLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3834:1: ( rule__ListLiteral__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3835:2: rule__ListLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__37675);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3841:1: rule__ListLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__ListLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3845:1: ( ( ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3846:1: ( ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3846:1: ( ']' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3847:1: ']'
            {
             before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__ListLiteral__Group__3__Impl7703); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3868:1: rule__ListLiteral__Group_2__0 : rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 ;
    public final void rule__ListLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3872:1: ( rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3873:2: rule__ListLiteral__Group_2__0__Impl rule__ListLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__07742);
            rule__ListLiteral__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__07745);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3880:1: rule__ListLiteral__Group_2__0__Impl : ( ( rule__ListLiteral__ItemsAssignment_2_0 ) ) ;
    public final void rule__ListLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3884:1: ( ( ( rule__ListLiteral__ItemsAssignment_2_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3885:1: ( ( rule__ListLiteral__ItemsAssignment_2_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3885:1: ( ( rule__ListLiteral__ItemsAssignment_2_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3886:1: ( rule__ListLiteral__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3887:1: ( rule__ListLiteral__ItemsAssignment_2_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3887:2: rule__ListLiteral__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl7772);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3897:1: rule__ListLiteral__Group_2__1 : rule__ListLiteral__Group_2__1__Impl ;
    public final void rule__ListLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3901:1: ( rule__ListLiteral__Group_2__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3902:2: rule__ListLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__17802);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3908:1: rule__ListLiteral__Group_2__1__Impl : ( ( rule__ListLiteral__Group_2_1__0 )* ) ;
    public final void rule__ListLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3912:1: ( ( ( rule__ListLiteral__Group_2_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3913:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3913:1: ( ( rule__ListLiteral__Group_2_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3914:1: ( rule__ListLiteral__Group_2_1__0 )*
            {
             before(grammarAccess.getListLiteralAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3915:1: ( rule__ListLiteral__Group_2_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3915:2: rule__ListLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl7829);
            	    rule__ListLiteral__Group_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3929:1: rule__ListLiteral__Group_2_1__0 : rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 ;
    public final void rule__ListLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3933:1: ( rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3934:2: rule__ListLiteral__Group_2_1__0__Impl rule__ListLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__07864);
            rule__ListLiteral__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__07867);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3941:1: rule__ListLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ListLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3945:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3946:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3946:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3947:1: ','
            {
             before(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FOLLOW_26_in_rule__ListLiteral__Group_2_1__0__Impl7895); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3960:1: rule__ListLiteral__Group_2_1__1 : rule__ListLiteral__Group_2_1__1__Impl ;
    public final void rule__ListLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3964:1: ( rule__ListLiteral__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3965:2: rule__ListLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__17926);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3971:1: rule__ListLiteral__Group_2_1__1__Impl : ( ( rule__ListLiteral__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__ListLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3975:1: ( ( ( rule__ListLiteral__ItemsAssignment_2_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3976:1: ( ( rule__ListLiteral__ItemsAssignment_2_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3976:1: ( ( rule__ListLiteral__ItemsAssignment_2_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3977:1: ( rule__ListLiteral__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3978:1: ( rule__ListLiteral__ItemsAssignment_2_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3978:2: rule__ListLiteral__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl7953);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3992:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3996:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3997:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
            {
            pushFollow(FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__07987);
            rule__Setter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__07990);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4004:1: rule__Setter__Group__0__Impl : ( ( rule__Setter__PropertyAssignment_0 ) ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4008:1: ( ( ( rule__Setter__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4009:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4009:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4010:1: ( rule__Setter__PropertyAssignment_0 )
            {
             before(grammarAccess.getSetterAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4011:1: ( rule__Setter__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4011:2: rule__Setter__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl8017);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4021:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4025:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4026:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
            {
            pushFollow(FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__18047);
            rule__Setter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__18050);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4033:1: rule__Setter__Group__1__Impl : ( ( rule__Setter__Alternatives_1 ) ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4037:1: ( ( ( rule__Setter__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4038:1: ( ( rule__Setter__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4038:1: ( ( rule__Setter__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4039:1: ( rule__Setter__Alternatives_1 )
            {
             before(grammarAccess.getSetterAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4040:1: ( rule__Setter__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4040:2: rule__Setter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl8077);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4050:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4054:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4055:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
            {
            pushFollow(FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__28107);
            rule__Setter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__28110);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4062:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__ExpressionAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4066:1: ( ( ( rule__Setter__ExpressionAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4067:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4067:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4068:1: ( rule__Setter__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getExpressionAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4069:1: ( rule__Setter__ExpressionAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4069:2: rule__Setter__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl8137);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4079:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4083:1: ( rule__Setter__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4084:2: rule__Setter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__38167);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4090:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__GuardAssignment_3 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4094:1: ( ( ( rule__Setter__GuardAssignment_3 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4095:1: ( ( rule__Setter__GuardAssignment_3 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4095:1: ( ( rule__Setter__GuardAssignment_3 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4096:1: ( rule__Setter__GuardAssignment_3 )?
            {
             before(grammarAccess.getSetterAccess().getGuardAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4097:1: ( rule__Setter__GuardAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4097:2: rule__Setter__GuardAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl8194);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4115:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4119:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4120:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__08233);
            rule__Function__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__08236);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4127:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4131:1: ( ( 'function' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4132:1: ( 'function' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4132:1: ( 'function' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4133:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Function__Group__0__Impl8264); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4146:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4150:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4151:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__18295);
            rule__Function__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__18298);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4158:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4162:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4163:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4163:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4164:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4165:1: ( rule__Function__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4165:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl8325);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4175:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4179:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4180:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__28355);
            rule__Function__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__28358);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4187:1: rule__Function__Group__2__Impl : ( ( rule__Function__JavaClassAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4191:1: ( ( ( rule__Function__JavaClassAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4192:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4192:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4193:1: ( rule__Function__JavaClassAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4194:1: ( rule__Function__JavaClassAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4194:2: rule__Function__JavaClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl8385);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4204:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4208:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4209:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__38415);
            rule__Function__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__38418);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4216:1: rule__Function__Group__3__Impl : ( '#' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4220:1: ( ( '#' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4221:1: ( '#' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4221:1: ( '#' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4222:1: '#'
            {
             before(grammarAccess.getFunctionAccess().getNumberSignKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Function__Group__3__Impl8446); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4235:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4239:1: ( rule__Function__Group__4__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4240:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__48477);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4246:1: rule__Function__Group__4__Impl : ( ( rule__Function__OperationAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4250:1: ( ( ( rule__Function__OperationAssignment_4 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4251:1: ( ( rule__Function__OperationAssignment_4 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4251:1: ( ( rule__Function__OperationAssignment_4 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4252:1: ( rule__Function__OperationAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getOperationAssignment_4()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4253:1: ( rule__Function__OperationAssignment_4 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4253:2: rule__Function__OperationAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__OperationAssignment_4_in_rule__Function__Group__4__Impl8504);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4273:1: rule__UpdateStatement__Group__0 : rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 ;
    public final void rule__UpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4277:1: ( rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4278:2: rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__08544);
            rule__UpdateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__08547);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4285:1: rule__UpdateStatement__Group__0__Impl : ( 'update' ) ;
    public final void rule__UpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4289:1: ( ( 'update' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4290:1: ( 'update' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4290:1: ( 'update' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4291:1: 'update'
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__UpdateStatement__Group__0__Impl8575); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4304:1: rule__UpdateStatement__Group__1 : rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 ;
    public final void rule__UpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4308:1: ( rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4309:2: rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__18606);
            rule__UpdateStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__18609);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4316:1: rule__UpdateStatement__Group__1__Impl : ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) ;
    public final void rule__UpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4320:1: ( ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4321:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4321:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4322:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4323:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4323:2: rule__UpdateStatement__VarRefAssignment_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl8636);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4333:1: rule__UpdateStatement__Group__2 : rule__UpdateStatement__Group__2__Impl ;
    public final void rule__UpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4337:1: ( rule__UpdateStatement__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4338:2: rule__UpdateStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__28666);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4344:1: rule__UpdateStatement__Group__2__Impl : ( ( rule__UpdateStatement__Group_2__0 )? ) ;
    public final void rule__UpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4348:1: ( ( ( rule__UpdateStatement__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4349:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4349:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4350:1: ( rule__UpdateStatement__Group_2__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4351:1: ( rule__UpdateStatement__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4351:2: rule__UpdateStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl8693);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4367:1: rule__UpdateStatement__Group_2__0 : rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 ;
    public final void rule__UpdateStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4371:1: ( rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4372:2: rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__08730);
            rule__UpdateStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__08733);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4379:1: rule__UpdateStatement__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UpdateStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4383:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4384:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4384:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4385:1: '{'
            {
             before(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__UpdateStatement__Group_2__0__Impl8761); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4398:1: rule__UpdateStatement__Group_2__1 : rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 ;
    public final void rule__UpdateStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4402:1: ( rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4403:2: rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__18792);
            rule__UpdateStatement__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__18795);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4410:1: rule__UpdateStatement__Group_2__1__Impl : ( ( rule__UpdateStatement__Group_2_1__0 )? ) ;
    public final void rule__UpdateStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4414:1: ( ( ( rule__UpdateStatement__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4415:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4415:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4416:1: ( rule__UpdateStatement__Group_2_1__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4417:1: ( rule__UpdateStatement__Group_2_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4417:2: rule__UpdateStatement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl8822);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4427:1: rule__UpdateStatement__Group_2__2 : rule__UpdateStatement__Group_2__2__Impl ;
    public final void rule__UpdateStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4431:1: ( rule__UpdateStatement__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4432:2: rule__UpdateStatement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__28853);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4438:1: rule__UpdateStatement__Group_2__2__Impl : ( '}' ) ;
    public final void rule__UpdateStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4442:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4443:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4443:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4444:1: '}'
            {
             before(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__UpdateStatement__Group_2__2__Impl8881); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4463:1: rule__UpdateStatement__Group_2_1__0 : rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 ;
    public final void rule__UpdateStatement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4467:1: ( rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4468:2: rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__08918);
            rule__UpdateStatement__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__08921);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4475:1: rule__UpdateStatement__Group_2_1__0__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) ;
    public final void rule__UpdateStatement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4479:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4480:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4480:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4481:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4482:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4482:2: rule__UpdateStatement__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl8948);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4492:1: rule__UpdateStatement__Group_2_1__1 : rule__UpdateStatement__Group_2_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4496:1: ( rule__UpdateStatement__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4497:2: rule__UpdateStatement__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__18978);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4503:1: rule__UpdateStatement__Group_2_1__1__Impl : ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) ;
    public final void rule__UpdateStatement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4507:1: ( ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4508:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4508:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4509:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4510:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4510:2: rule__UpdateStatement__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl9005);
            	    rule__UpdateStatement__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4524:1: rule__UpdateStatement__Group_2_1_1__0 : rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 ;
    public final void rule__UpdateStatement__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4528:1: ( rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4529:2: rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__09040);
            rule__UpdateStatement__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__09043);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4536:1: rule__UpdateStatement__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__UpdateStatement__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4540:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4541:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4541:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4542:1: ','
            {
             before(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__UpdateStatement__Group_2_1_1__0__Impl9071); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4555:1: rule__UpdateStatement__Group_2_1_1__1 : rule__UpdateStatement__Group_2_1_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4559:1: ( rule__UpdateStatement__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4560:2: rule__UpdateStatement__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__19102);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4566:1: rule__UpdateStatement__Group_2_1_1__1__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__UpdateStatement__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4570:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4571:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4571:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4572:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4573:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4573:2: rule__UpdateStatement__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl9129);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4587:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4591:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4592:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09163);
            rule__FQN__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09166);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4599:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4603:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4604:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4604:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4605:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9193); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4616:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4620:1: ( rule__FQN__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4621:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19222);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4627:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4631:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4632:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4632:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4633:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4634:1: ( rule__FQN__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4634:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9249);
            	    rule__FQN__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4648:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4652:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4653:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09284);
            rule__FQN__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09287);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4660:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4664:1: ( ( '.' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4665:1: ( '.' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4665:1: ( '.' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4666:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__FQN__Group_1__0__Impl9315); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4679:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4683:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4684:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19346);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4690:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4694:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4695:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4695:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4696:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9373); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4715:1: rule__Scaffolding__ScaffoldAssignment_0 : ( ruleScaffold ) ;
    public final void rule__Scaffolding__ScaffoldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4719:1: ( ( ruleScaffold ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4720:1: ( ruleScaffold )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4720:1: ( ruleScaffold )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4721:1: ruleScaffold
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldScaffoldParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_09414);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4730:1: rule__Scaffolding__ElementsAssignment_1 : ( ruleScaffoldingElement ) ;
    public final void rule__Scaffolding__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4734:1: ( ( ruleScaffoldingElement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4735:1: ( ruleScaffoldingElement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4735:1: ( ruleScaffoldingElement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4736:1: ruleScaffoldingElement
            {
             before(grammarAccess.getScaffoldingAccess().getElementsScaffoldingElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_19445);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4745:1: rule__Scaffold__RefPackageAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Scaffold__RefPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4749:1: ( ( ( RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4750:1: ( ( RULE_STRING ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4750:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4751:1: ( RULE_STRING )
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageEPackageCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4752:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4753:1: RULE_STRING
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageEPackageSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_19480); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4764:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4768:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4769:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4769:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4770:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_19515); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4779:1: rule__Rule__WhenAssignment_2 : ( ruleWhenBlock ) ;
    public final void rule__Rule__WhenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4783:1: ( ( ruleWhenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4784:1: ( ruleWhenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4784:1: ( ruleWhenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4785:1: ruleWhenBlock
            {
             before(grammarAccess.getRuleAccess().getWhenWhenBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_29546);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4794:1: rule__Rule__ThenAssignment_3 : ( ruleThenBlock ) ;
    public final void rule__Rule__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4798:1: ( ( ruleThenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4799:1: ( ruleThenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4799:1: ( ruleThenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4800:1: ruleThenBlock
            {
             before(grammarAccess.getRuleAccess().getThenThenBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_39577);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4809:1: rule__WhenBlock__MatchesAssignment_2_0_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4813:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4814:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4814:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4815:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_2_0_19608);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4824:1: rule__WhenBlock__MatchesAssignment_2_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4828:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4829:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4829:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4830:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_2_19639);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4839:1: rule__Match__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__Match__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4843:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4844:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4844:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4845:1: ruleVariable
            {
             before(grammarAccess.getMatchAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_09670);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4854:1: rule__Match__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Match__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4858:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4859:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4859:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4860:1: ( RULE_ID )
            {
             before(grammarAccess.getMatchAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4861:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4862:1: RULE_ID
            {
             before(grammarAccess.getMatchAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_19705); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4873:1: rule__Match__ParamsAssignment_2_1_0 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4877:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4878:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4878:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4879:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_09740);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4888:1: rule__Match__ParamsAssignment_2_1_1_1 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4892:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4893:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4893:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4894:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_19771);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4903:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4907:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4908:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4908:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4909:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment9802); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4918:1: rule__Param__PropertyAssignment_0 : ( ruleExpression ) ;
    public final void rule__Param__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4922:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4923:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4923:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4924:1: ruleExpression
            {
             before(grammarAccess.getParamAccess().getPropertyExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Param__PropertyAssignment_09833);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getParamAccess().getPropertyExpressionParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4933:1: rule__Param__VarAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__Param__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4937:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4938:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4938:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4939:1: ruleVariable
            {
             before(grammarAccess.getParamAccess().getVarVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_19864);
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


    // $ANTLR start rule__Expression__OpAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4948:1: rule__Expression__OpAssignment_1_1 : ( RULE_OPERATOR_LOW_PRIORITY ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4952:1: ( ( RULE_OPERATOR_LOW_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4953:1: ( RULE_OPERATOR_LOW_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4953:1: ( RULE_OPERATOR_LOW_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4954:1: RULE_OPERATOR_LOW_PRIORITY
            {
             before(grammarAccess.getExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__Expression__OpAssignment_1_19895); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4963:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4967:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4968:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4968:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4969:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_29926);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4978:1: rule__ExpressionHigh__OpAssignment_1_1 : ( RULE_OPERATOR_HIGH_PRIORITY ) ;
    public final void rule__ExpressionHigh__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4982:1: ( ( RULE_OPERATOR_HIGH_PRIORITY ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4983:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4983:1: ( RULE_OPERATOR_HIGH_PRIORITY )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4984:1: RULE_OPERATOR_HIGH_PRIORITY
            {
             before(grammarAccess.getExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0()); 
            match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__ExpressionHigh__OpAssignment_1_19957); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4993:1: rule__ExpressionHigh__RightAssignment_1_2 : ( ruleExpressionHigh ) ;
    public final void rule__ExpressionHigh__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4997:1: ( ( ruleExpressionHigh ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4998:1: ( ruleExpressionHigh )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4998:1: ( ruleExpressionHigh )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4999:1: ruleExpressionHigh
            {
             before(grammarAccess.getExpressionHighAccess().getRightExpressionHighParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_rule__ExpressionHigh__RightAssignment_1_29988);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5008:1: rule__TerminalExpression__ExpAssignment_2_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5012:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5013:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5013:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5014:1: ruleTerminalExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__TerminalExpression__ExpAssignment_2_210019);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5023:1: rule__TerminalExpression__FunctionAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__FunctionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5027:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5028:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5028:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5029:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_4_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5030:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5031:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_4_110054); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5042:1: rule__TerminalExpression__ArgumentsAssignment_4_3_0 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgumentsAssignment_4_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5046:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5047:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5047:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5048:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_010089);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5057:1: rule__TerminalExpression__ArgumentsAssignment_4_3_1_1 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgumentsAssignment_4_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5061:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5062:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5062:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5063:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_1_110120);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5072:1: rule__SymbolRef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SymbolRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5076:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5077:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5077:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5078:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolRefAccess().getRefSymbolCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5079:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5080:1: RULE_ID
            {
             before(grammarAccess.getSymbolRefAccess().getRefSymbolIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolRef__RefAssignment_110155); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5091:1: rule__PrimitiveLiteral__ValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5095:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5096:1: ( RULE_INT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5096:1: ( RULE_INT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5097:1: RULE_INT
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrimitiveLiteral__ValueAssignment_3_110190); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5106:1: rule__PrimitiveLiteral__ValueAssignment_4_1 : ( RULE_BOOLEAN ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5110:1: ( ( RULE_BOOLEAN ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5111:1: ( RULE_BOOLEAN )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5111:1: ( RULE_BOOLEAN )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5112:1: RULE_BOOLEAN
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueBOOLEANTerminalRuleCall_4_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__PrimitiveLiteral__ValueAssignment_4_110221); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5121:1: rule__PrimitiveLiteral__ValueAssignment_5_1 : ( RULE_FLOAT ) ;
    public final void rule__PrimitiveLiteral__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5125:1: ( ( RULE_FLOAT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5126:1: ( RULE_FLOAT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5126:1: ( RULE_FLOAT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5127:1: RULE_FLOAT
            {
             before(grammarAccess.getPrimitiveLiteralAccess().getValueFLOATTerminalRuleCall_5_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__PrimitiveLiteral__ValueAssignment_5_110252); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5136:1: rule__FeatureRef__FeatureAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FeatureRef__FeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5140:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5141:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5141:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5142:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureCrossReference_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5143:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5144:1: RULE_ID
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureRef__FeatureAssignment10287); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5155:1: rule__ThenBlock__StatementsAssignment_2_0_1_0 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5159:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5160:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5160:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5161:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_2_0_1_010322);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5170:1: rule__ThenBlock__StatementsAssignment_2_1 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5174:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5175:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5175:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5176:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_2_110353);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5185:1: rule__CreateStatement__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__CreateStatement__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5189:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5190:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5190:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5191:1: ruleVariable
            {
             before(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_010384);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5200:1: rule__CreateStatement__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__CreateStatement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5204:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5205:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5205:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5206:1: ruleExpression
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_110415);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5215:1: rule__CreateClass__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CreateClass__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5219:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5220:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5220:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5221:1: ( RULE_ID )
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5222:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5223:1: RULE_ID
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_110450); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5234:1: rule__CreateClass__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5238:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5239:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5239:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5240:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_010485);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5249:1: rule__CreateClass__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5253:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5254:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5254:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5255:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_110516);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5264:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5268:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5269:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5269:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5270:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10547); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5279:1: rule__ListLiteral__ItemsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5283:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5284:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5284:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5285:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_2_010578);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5294:1: rule__ListLiteral__ItemsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5298:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5299:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5299:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5300:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_2_1_110609);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5309:1: rule__Setter__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Setter__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5313:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5314:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5314:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5315:1: ( RULE_ID )
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5316:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5317:1: RULE_ID
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_010644); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5328:1: rule__Setter__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Setter__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5332:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5333:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5333:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5334:1: ruleExpression
            {
             before(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_210679);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5343:1: rule__Setter__GuardAssignment_3 : ( ( 'guard' ) ) ;
    public final void rule__Setter__GuardAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5347:1: ( ( ( 'guard' ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5348:1: ( ( 'guard' ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5348:1: ( ( 'guard' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5349:1: ( 'guard' )
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5350:1: ( 'guard' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5351:1: 'guard'
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Setter__GuardAssignment_310715); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5366:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5370:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5371:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5371:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5372:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_110754); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5381:1: rule__Function__JavaClassAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Function__JavaClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5385:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5386:1: ( ( ruleFQN ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5386:1: ( ( ruleFQN ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5387:1: ( ruleFQN )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeCrossReference_2_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5388:1: ( ruleFQN )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5389:1: ruleFQN
            {
             before(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Function__JavaClassAssignment_210789);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5400:1: rule__Function__OperationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Function__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5404:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5405:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5405:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5406:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getOperationJvmOperationCrossReference_4_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5407:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5408:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getOperationJvmOperationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__OperationAssignment_410828); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5419:1: rule__UpdateStatement__VarRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UpdateStatement__VarRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5423:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5424:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5424:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5425:1: ( RULE_ID )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5426:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5427:1: RULE_ID
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_110867); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5438:1: rule__UpdateStatement__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5442:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5443:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5443:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5444:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_010902);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5453:1: rule__UpdateStatement__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5457:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5458:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5458:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5459:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_110933);
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
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionHigh610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__0_in_ruleExpressionHigh636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolRef_in_entryRuleSymbolRef723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolRef730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__0_in_ruleSymbolRef756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteral790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Alternatives_in_rulePrimitiveLiteral816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__FeatureAssignment_in_ruleFeatureRef876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_entryRuleThenBlock903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenBlock910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0_in_ruleThenBlock936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateStatement1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0_in_ruleCreateStatement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_entryRuleCreateClass1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateClass1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0_in_ruleCreateClass1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_entryRuleSetter1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetter1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0_in_ruleSetter1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0_in_ruleUpdateStatement1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__0_in_rule__WhenBlock__Alternatives_21627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_2_1_in_rule__WhenBlock__Alternatives_21645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolRef_in_rule__TerminalExpression__Alternatives1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_rule__TerminalExpression__Alternatives1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__PrimitiveLiteral__Alternatives1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__PrimitiveLiteral__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__PrimitiveLiteral__Alternatives1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__0_in_rule__PrimitiveLiteral__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__0_in_rule__PrimitiveLiteral__Alternatives1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__0_in_rule__PrimitiveLiteral__Alternatives1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ThenBlock__Alternatives_11920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ThenBlock__Alternatives_11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__0_in_rule__ThenBlock__Alternatives_21974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_2_1_in_rule__ThenBlock__Alternatives_21992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Setter__Alternatives_12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Setter__Alternatives_12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02128 = new BitSet(new long[]{0x0000000200100002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2215 = new BitSet(new long[]{0x0000000200100002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Scaffold__Group__0__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group__0__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22495 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__02620 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__02623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__12681 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__2_in_rule__WhenBlock__Group__12684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__WhenBlock__Group__1__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__2__Impl_in_rule__WhenBlock__Group__22743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Alternatives_2_in_rule__WhenBlock__Group__2__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__0__Impl_in_rule__WhenBlock__Group_2_0__02806 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__1_in_rule__WhenBlock__Group_2_0__02809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__WhenBlock__Group_2_0__0__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__1__Impl_in_rule__WhenBlock__Group_2_0__12868 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__2_in_rule__WhenBlock__Group_2_0__12871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_2_0_1_in_rule__WhenBlock__Group_2_0__1__Impl2898 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_2_0__2__Impl_in_rule__WhenBlock__Group_2_0__22929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WhenBlock__Group_2_0__2__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__02994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Match__Group__1_in_rule__Match__Group__02997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13055 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03179 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Match__Group_0__1__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03302 = new BitSet(new long[]{0x00000000EB000730L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Match__Group_2__0__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13364 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Match__Group_2__2__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03490 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3577 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__03612 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__03615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Match__Group_2_1_1__0__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03735 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__13795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__03857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__03860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Param__Group_1__0__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__13919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03980 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_rule__Expression__Group__0__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14162 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__0__Impl_in_rule__ExpressionHigh__Group__04285 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__1_in_rule__ExpressionHigh__Group__04288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__ExpressionHigh__Group__0__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group__1__Impl_in_rule__ExpressionHigh__Group__14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__0_in_rule__ExpressionHigh__Group__1__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__0__Impl_in_rule__ExpressionHigh__Group_1__04406 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__1_in_rule__ExpressionHigh__Group_1__04409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__1__Impl_in_rule__ExpressionHigh__Group_1__14467 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__2_in_rule__ExpressionHigh__Group_1__14470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__OpAssignment_1_1_in_rule__ExpressionHigh__Group_1__1__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__Group_1__2__Impl_in_rule__ExpressionHigh__Group_1__24527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionHigh__RightAssignment_1_2_in_rule__ExpressionHigh__Group_1__2__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04590 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TerminalExpression__Group_0__0__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14652 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TerminalExpression__Group_0__2__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04776 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14837 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__2_in_rule__TerminalExpression__Group_2__14840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TerminalExpression__Group_2__1__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__2__Impl_in_rule__TerminalExpression__Group_2__24899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ExpAssignment_2_2_in_rule__TerminalExpression__Group_2__2__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__04962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__04965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__15023 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__FunctionAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__25083 = new BitSet(new long[]{0x00000000EB000730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__3_in_rule__TerminalExpression__Group_4__25086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TerminalExpression__Group_4__2__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__3__Impl_in_rule__TerminalExpression__Group_4__35145 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__4_in_rule__TerminalExpression__Group_4__35148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__0_in_rule__TerminalExpression__Group_4__3__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__4__Impl_in_rule__TerminalExpression__Group_4__45206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TerminalExpression__Group_4__4__Impl5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__0__Impl_in_rule__TerminalExpression__Group_4_3__05275 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__1_in_rule__TerminalExpression__Group_4_3__05278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_0_in_rule__TerminalExpression__Group_4_3__0__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3__1__Impl_in_rule__TerminalExpression__Group_4_3__15335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__0_in_rule__TerminalExpression__Group_4_3__1__Impl5362 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__0__Impl_in_rule__TerminalExpression__Group_4_3_1__05397 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__1_in_rule__TerminalExpression__Group_4_3_1__05400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TerminalExpression__Group_4_3_1__0__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4_3_1__1__Impl_in_rule__TerminalExpression__Group_4_3_1__15459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ArgumentsAssignment_4_3_1_1_in_rule__TerminalExpression__Group_4_3_1__1__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__0__Impl_in_rule__SymbolRef__Group__05520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__1_in_rule__SymbolRef__Group__05523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__Group__1__Impl_in_rule__SymbolRef__Group__15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolRef__RefAssignment_1_in_rule__SymbolRef__Group__1__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__0__Impl_in_rule__PrimitiveLiteral__Group_3__05642 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__1_in_rule__PrimitiveLiteral__Group_3__05645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_3__1__Impl_in_rule__PrimitiveLiteral__Group_3__15703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_3_1_in_rule__PrimitiveLiteral__Group_3__1__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__0__Impl_in_rule__PrimitiveLiteral__Group_4__05764 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__1_in_rule__PrimitiveLiteral__Group_4__05767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_4__1__Impl_in_rule__PrimitiveLiteral__Group_4__15825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_4_1_in_rule__PrimitiveLiteral__Group_4__1__Impl5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__0__Impl_in_rule__PrimitiveLiteral__Group_5__05886 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__1_in_rule__PrimitiveLiteral__Group_5__05889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__Group_5__1__Impl_in_rule__PrimitiveLiteral__Group_5__15947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveLiteral__ValueAssignment_5_1_in_rule__PrimitiveLiteral__Group_5__1__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__06008 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__06011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__16069 = new BitSet(new long[]{0x00000008E9400730L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__2_in_rule__ThenBlock__Group__16072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__2__Impl_in_rule__ThenBlock__Group__26129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_2_in_rule__ThenBlock__Group__2__Impl6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__0__Impl_in_rule__ThenBlock__Group_2_0__06192 = new BitSet(new long[]{0x00000008E9800730L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__1_in_rule__ThenBlock__Group_2_0__06195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ThenBlock__Group_2_0__0__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__1__Impl_in_rule__ThenBlock__Group_2_0__16254 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__2_in_rule__ThenBlock__Group_2_0__16257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0_1__0_in_rule__ThenBlock__Group_2_0__1__Impl6284 = new BitSet(new long[]{0x00000008E9000732L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0__2__Impl_in_rule__ThenBlock__Group_2_0__26315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ThenBlock__Group_2_0__2__Impl6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0_1__0__Impl_in_rule__ThenBlock__Group_2_0_1__06380 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0_1__1_in_rule__ThenBlock__Group_2_0_1__06383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_2_0_1_0_in_rule__ThenBlock__Group_2_0_1__0__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_2_0_1__1__Impl_in_rule__ThenBlock__Group_2_0_1__16440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ThenBlock__Group_2_0_1__1__Impl6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__06503 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__06506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl6533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__16564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__06625 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__06628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__16685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CreateStatement__Group_0__1__Impl6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__06748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__06751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CreateClass__Group__0__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__16810 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__16813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__26870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__06934 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__06937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CreateClass__Group_2__0__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__16996 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__16999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__27057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CreateClass__Group_2__2__Impl7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__07122 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__07125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__17182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl7209 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__07244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__07247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CreateClass__Group_2_1_1__0__Impl7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__17306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__07367 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__07370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__17428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NullLiteral__Group__1__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__07491 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__07494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__17552 = new BitSet(new long[]{0x00000001E9000730L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__17555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ListLiteral__Group__1__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__27614 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3_in_rule__ListLiteral__Group__27617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0_in_rule__ListLiteral__Group__2__Impl7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__3__Impl_in_rule__ListLiteral__Group__37675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ListLiteral__Group__3__Impl7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__0__Impl_in_rule__ListLiteral__Group_2__07742 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1_in_rule__ListLiteral__Group_2__07745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_2_0_in_rule__ListLiteral__Group_2__0__Impl7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2__1__Impl_in_rule__ListLiteral__Group_2__17802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0_in_rule__ListLiteral__Group_2__1__Impl7829 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__0__Impl_in_rule__ListLiteral__Group_2_1__07864 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1_in_rule__ListLiteral__Group_2_1__07867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ListLiteral__Group_2_1__0__Impl7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_2_1__1__Impl_in_rule__ListLiteral__Group_2_1__17926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_2_1_1_in_rule__ListLiteral__Group_2_1__1__Impl7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__07987 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__07990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__18047 = new BitSet(new long[]{0x00000000E9000730L});
    public static final BitSet FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__18050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__28107 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__28110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__38167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__08233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__08236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Function__Group__0__Impl8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__18295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__18298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__28355 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__28358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__38415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__38418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Function__Group__3__Impl8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__48477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__OperationAssignment_4_in_rule__Function__Group__4__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__08544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__08547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UpdateStatement__Group__0__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__18606 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__18609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__28666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__08730 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__08733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UpdateStatement__Group_2__0__Impl8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__18792 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__18795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__28853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UpdateStatement__Group_2__2__Impl8881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__08918 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__08921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__18978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl9005 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__09040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__09043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UpdateStatement__Group_2_1_1__0__Impl9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__19102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl9129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09163 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9249 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FQN__Group_1__0__Impl9315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_09414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_19445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_19480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_19515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_29546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_39577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_2_0_19608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_2_19639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_09670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_19705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_09740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_19771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment9802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Param__PropertyAssignment_09833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_19864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_rule__Expression__OpAssignment_1_19895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_29926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_rule__ExpressionHigh__OpAssignment_1_19957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_rule__ExpressionHigh__RightAssignment_1_29988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__TerminalExpression__ExpAssignment_2_210019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_4_110054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_010089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ArgumentsAssignment_4_3_1_110120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolRef__RefAssignment_110155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrimitiveLiteral__ValueAssignment_3_110190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__PrimitiveLiteral__ValueAssignment_4_110221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__PrimitiveLiteral__ValueAssignment_5_110252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureRef__FeatureAssignment10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_2_0_1_010322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_2_110353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_010384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_110415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_110450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_010485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_110516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_2_010578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_2_1_110609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_010644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_210679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Setter__GuardAssignment_310715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_110754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Function__JavaClassAssignment_210789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__OperationAssignment_410828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_110867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_010902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_110933 = new BitSet(new long[]{0x0000000000000002L});

}