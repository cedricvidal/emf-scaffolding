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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'null'", "'<'", "'>'", "'='", "'!='", "'+'", "'-'", "'>='", "'<='", "'/'", "'*'", "'then'", "'->'", "':'", "'+='", "'scaffold'", "'rule'", "'when'", "'{'", "'}'", "'('", "')'", "','", "'new'", "'['", "']'", "'$'", "'function'", "'update'", "'.'", "'guard'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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


    // $ANTLR start entryRuleBindingTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:315:1: entryRuleBindingTerminalExpression : ruleBindingTerminalExpression EOF ;
    public final void entryRuleBindingTerminalExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:316:1: ( ruleBindingTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:317:1: ruleBindingTerminalExpression EOF
            {
             before(grammarAccess.getBindingTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_entryRuleBindingTerminalExpression603);
            ruleBindingTerminalExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingTerminalExpression610); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:324:1: ruleBindingTerminalExpression : ( ( rule__BindingTerminalExpression__Alternatives ) ) ;
    public final void ruleBindingTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:328:2: ( ( ( rule__BindingTerminalExpression__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:329:1: ( ( rule__BindingTerminalExpression__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:329:1: ( ( rule__BindingTerminalExpression__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:330:1: ( rule__BindingTerminalExpression__Alternatives )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:331:1: ( rule__BindingTerminalExpression__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:331:2: rule__BindingTerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Alternatives_in_ruleBindingTerminalExpression636);
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


    // $ANTLR start entryRuleFeatureRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:343:1: entryRuleFeatureRefLiteral : ruleFeatureRefLiteral EOF ;
    public final void entryRuleFeatureRefLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:344:1: ( ruleFeatureRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:345:1: ruleFeatureRefLiteral EOF
            {
             before(grammarAccess.getFeatureRefLiteralRule()); 
            pushFollow(FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral663);
            ruleFeatureRefLiteral();
            _fsp--;

             after(grammarAccess.getFeatureRefLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRefLiteral670); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:352:1: ruleFeatureRefLiteral : ( ( rule__FeatureRefLiteral__RefAssignment ) ) ;
    public final void ruleFeatureRefLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:356:2: ( ( ( rule__FeatureRefLiteral__RefAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:357:1: ( ( rule__FeatureRefLiteral__RefAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:357:1: ( ( rule__FeatureRefLiteral__RefAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:358:1: ( rule__FeatureRefLiteral__RefAssignment )
            {
             before(grammarAccess.getFeatureRefLiteralAccess().getRefAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:359:1: ( rule__FeatureRefLiteral__RefAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:359:2: rule__FeatureRefLiteral__RefAssignment
            {
            pushFollow(FOLLOW_rule__FeatureRefLiteral__RefAssignment_in_ruleFeatureRefLiteral696);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:371:1: entryRuleThenBlock : ruleThenBlock EOF ;
    public final void entryRuleThenBlock() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:372:1: ( ruleThenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:373:1: ruleThenBlock EOF
            {
             before(grammarAccess.getThenBlockRule()); 
            pushFollow(FOLLOW_ruleThenBlock_in_entryRuleThenBlock723);
            ruleThenBlock();
            _fsp--;

             after(grammarAccess.getThenBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenBlock730); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:380:1: ruleThenBlock : ( ( rule__ThenBlock__Group__0 ) ) ;
    public final void ruleThenBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:384:2: ( ( ( rule__ThenBlock__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:385:1: ( ( rule__ThenBlock__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:385:1: ( ( rule__ThenBlock__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:386:1: ( rule__ThenBlock__Group__0 )
            {
             before(grammarAccess.getThenBlockAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:387:1: ( rule__ThenBlock__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:387:2: rule__ThenBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0_in_ruleThenBlock756);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:399:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:400:1: ( ruleStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:401:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement783);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement790); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:408:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:412:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:413:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:413:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:414:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:415:1: ( rule__Statement__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:415:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement816);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:427:1: entryRuleCreateStatement : ruleCreateStatement EOF ;
    public final void entryRuleCreateStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:428:1: ( ruleCreateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:429:1: ruleCreateStatement EOF
            {
             before(grammarAccess.getCreateStatementRule()); 
            pushFollow(FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement843);
            ruleCreateStatement();
            _fsp--;

             after(grammarAccess.getCreateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateStatement850); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:436:1: ruleCreateStatement : ( ( rule__CreateStatement__Group__0 ) ) ;
    public final void ruleCreateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:440:2: ( ( ( rule__CreateStatement__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:441:1: ( ( rule__CreateStatement__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:441:1: ( ( rule__CreateStatement__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:442:1: ( rule__CreateStatement__Group__0 )
            {
             before(grammarAccess.getCreateStatementAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:443:1: ( rule__CreateStatement__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:443:2: rule__CreateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0_in_ruleCreateStatement876);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:455:1: entryRuleCreateClass : ruleCreateClass EOF ;
    public final void entryRuleCreateClass() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:456:1: ( ruleCreateClass EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:457:1: ruleCreateClass EOF
            {
             before(grammarAccess.getCreateClassRule()); 
            pushFollow(FOLLOW_ruleCreateClass_in_entryRuleCreateClass903);
            ruleCreateClass();
            _fsp--;

             after(grammarAccess.getCreateClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateClass910); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:464:1: ruleCreateClass : ( ( rule__CreateClass__Group__0 ) ) ;
    public final void ruleCreateClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:468:2: ( ( ( rule__CreateClass__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:469:1: ( ( rule__CreateClass__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:469:1: ( ( rule__CreateClass__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:470:1: ( rule__CreateClass__Group__0 )
            {
             before(grammarAccess.getCreateClassAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:471:1: ( rule__CreateClass__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:471:2: rule__CreateClass__Group__0
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0_in_ruleCreateClass936);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:483:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:484:1: ( ruleStringLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:485:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral963);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral970); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:492:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:496:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:497:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:497:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:498:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:499:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:499:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral996);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:511:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:512:1: ( ruleNullLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:513:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1023);
            ruleNullLiteral();
            _fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1030); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:520:1: ruleNullLiteral : ( 'null' ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:524:2: ( ( 'null' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:525:1: ( 'null' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:525:1: ( 'null' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:526:1: 'null'
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword()); 
            match(input,11,FOLLOW_11_in_ruleNullLiteral1057); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:541:1: entryRuleListLiteral : ruleListLiteral EOF ;
    public final void entryRuleListLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:542:1: ( ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:543:1: ruleListLiteral EOF
            {
             before(grammarAccess.getListLiteralRule()); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral1085);
            ruleListLiteral();
            _fsp--;

             after(grammarAccess.getListLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral1092); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:550:1: ruleListLiteral : ( ( rule__ListLiteral__Group__0 ) ) ;
    public final void ruleListLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:554:2: ( ( ( rule__ListLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:555:1: ( ( rule__ListLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:555:1: ( ( rule__ListLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:556:1: ( rule__ListLiteral__Group__0 )
            {
             before(grammarAccess.getListLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:557:1: ( rule__ListLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:557:2: rule__ListLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1118);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:569:1: entryRuleVarRefLiteral : ruleVarRefLiteral EOF ;
    public final void entryRuleVarRefLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:570:1: ( ruleVarRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:571:1: ruleVarRefLiteral EOF
            {
             before(grammarAccess.getVarRefLiteralRule()); 
            pushFollow(FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral1145);
            ruleVarRefLiteral();
            _fsp--;

             after(grammarAccess.getVarRefLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRefLiteral1152); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:578:1: ruleVarRefLiteral : ( ( rule__VarRefLiteral__Group__0 ) ) ;
    public final void ruleVarRefLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:582:2: ( ( ( rule__VarRefLiteral__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:583:1: ( ( rule__VarRefLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:583:1: ( ( rule__VarRefLiteral__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:584:1: ( rule__VarRefLiteral__Group__0 )
            {
             before(grammarAccess.getVarRefLiteralAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:585:1: ( rule__VarRefLiteral__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:585:2: rule__VarRefLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__VarRefLiteral__Group__0_in_ruleVarRefLiteral1178);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:597:1: entryRuleSetter : ruleSetter EOF ;
    public final void entryRuleSetter() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:598:1: ( ruleSetter EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:599:1: ruleSetter EOF
            {
             before(grammarAccess.getSetterRule()); 
            pushFollow(FOLLOW_ruleSetter_in_entryRuleSetter1205);
            ruleSetter();
            _fsp--;

             after(grammarAccess.getSetterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetter1212); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:606:1: ruleSetter : ( ( rule__Setter__Group__0 ) ) ;
    public final void ruleSetter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:610:2: ( ( ( rule__Setter__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:611:1: ( ( rule__Setter__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:611:1: ( ( rule__Setter__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:612:1: ( rule__Setter__Group__0 )
            {
             before(grammarAccess.getSetterAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:613:1: ( rule__Setter__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:613:2: rule__Setter__Group__0
            {
            pushFollow(FOLLOW_rule__Setter__Group__0_in_ruleSetter1238);
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


    // $ANTLR start entryRuleExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:625:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:626:1: ( ruleExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:627:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1265);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1272); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:634:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:638:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:639:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:639:1: ( ( rule__Expression__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:640:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:641:1: ( rule__Expression__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:641:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression1298);
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


    // $ANTLR start entryRuleTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:653:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:654:1: ( ruleTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:655:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1325);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1332); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:662:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:666:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:667:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:667:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:668:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:669:1: ( rule__TerminalExpression__Alternatives )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:669:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1358);
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


    // $ANTLR start entryRuleFunction
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:681:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:682:1: ( ruleFunction EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:683:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1385);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1392); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:690:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:694:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:695:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:695:1: ( ( rule__Function__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:696:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:697:1: ( rule__Function__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:697:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction1418);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:709:1: entryRuleUpdateStatement : ruleUpdateStatement EOF ;
    public final void entryRuleUpdateStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:710:1: ( ruleUpdateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:711:1: ruleUpdateStatement EOF
            {
             before(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1445);
            ruleUpdateStatement();
            _fsp--;

             after(grammarAccess.getUpdateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1452); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:718:1: ruleUpdateStatement : ( ( rule__UpdateStatement__Group__0 ) ) ;
    public final void ruleUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:722:2: ( ( ( rule__UpdateStatement__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:1: ( ( rule__UpdateStatement__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:723:1: ( ( rule__UpdateStatement__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:724:1: ( rule__UpdateStatement__Group__0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:725:1: ( rule__UpdateStatement__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:725:2: rule__UpdateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0_in_ruleUpdateStatement1478);
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


    // $ANTLR start entryRuleClassFqn
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:737:1: entryRuleClassFqn : ruleClassFqn EOF ;
    public final void entryRuleClassFqn() throws RecognitionException {
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:738:1: ( ruleClassFqn EOF )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:739:1: ruleClassFqn EOF
            {
             before(grammarAccess.getClassFqnRule()); 
            pushFollow(FOLLOW_ruleClassFqn_in_entryRuleClassFqn1505);
            ruleClassFqn();
            _fsp--;

             after(grammarAccess.getClassFqnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassFqn1512); 

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
    // $ANTLR end entryRuleClassFqn


    // $ANTLR start ruleClassFqn
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:746:1: ruleClassFqn : ( ( rule__ClassFqn__Group__0 ) ) ;
    public final void ruleClassFqn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:750:2: ( ( ( rule__ClassFqn__Group__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:751:1: ( ( rule__ClassFqn__Group__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:751:1: ( ( rule__ClassFqn__Group__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:752:1: ( rule__ClassFqn__Group__0 )
            {
             before(grammarAccess.getClassFqnAccess().getGroup()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:753:1: ( rule__ClassFqn__Group__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:753:2: rule__ClassFqn__Group__0
            {
            pushFollow(FOLLOW_rule__ClassFqn__Group__0_in_ruleClassFqn1538);
            rule__ClassFqn__Group__0();
            _fsp--;


            }

             after(grammarAccess.getClassFqnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleClassFqn


    // $ANTLR start rule__ScaffoldingElement__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:765:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );
    public final void rule__ScaffoldingElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:769:1: ( ( ruleRule ) | ( ruleFunction ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("765:1: rule__ScaffoldingElement__Alternatives : ( ( ruleRule ) | ( ruleFunction ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:770:1: ( ruleRule )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:770:1: ( ruleRule )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:771:1: ruleRule
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1574);
                    ruleRule();
                    _fsp--;

                     after(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:776:6: ( ruleFunction )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:776:6: ( ruleFunction )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:777:1: ruleFunction
                    {
                     before(grammarAccess.getScaffoldingElementAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1591);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:787:1: rule__WhenBlock__Alternatives_1 : ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) );
    public final void rule__WhenBlock__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:791:1: ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("787:1: rule__WhenBlock__Alternatives_1 : ( ( ( rule__WhenBlock__Group_1_0__0 ) ) | ( ( rule__WhenBlock__MatchesAssignment_1_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:792:1: ( ( rule__WhenBlock__Group_1_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:792:1: ( ( rule__WhenBlock__Group_1_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:793:1: ( rule__WhenBlock__Group_1_0__0 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getGroup_1_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:794:1: ( rule__WhenBlock__Group_1_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:794:2: rule__WhenBlock__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__0_in_rule__WhenBlock__Alternatives_11623);
                    rule__WhenBlock__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getWhenBlockAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:798:6: ( ( rule__WhenBlock__MatchesAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:798:6: ( ( rule__WhenBlock__MatchesAssignment_1_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:799:1: ( rule__WhenBlock__MatchesAssignment_1_1 )
                    {
                     before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_1_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:800:1: ( rule__WhenBlock__MatchesAssignment_1_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:800:2: rule__WhenBlock__MatchesAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_1_1_in_rule__WhenBlock__Alternatives_11641);
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


    // $ANTLR start rule__BindingExpression__OpAlternatives_1_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:810:1: rule__BindingExpression__OpAlternatives_1_1_0 : ( ( '<' ) | ( '>' ) | ( '=' ) | ( '!=' ) | ( '+' ) | ( '-' ) | ( '>=' ) | ( '<=' ) | ( '/' ) | ( '*' ) );
    public final void rule__BindingExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:814:1: ( ( '<' ) | ( '>' ) | ( '=' ) | ( '!=' ) | ( '+' ) | ( '-' ) | ( '>=' ) | ( '<=' ) | ( '/' ) | ( '*' ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            case 20:
                {
                alt3=9;
                }
                break;
            case 21:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("810:1: rule__BindingExpression__OpAlternatives_1_1_0 : ( ( '<' ) | ( '>' ) | ( '=' ) | ( '!=' ) | ( '+' ) | ( '-' ) | ( '>=' ) | ( '<=' ) | ( '/' ) | ( '*' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:815:1: ( '<' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:815:1: ( '<' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:816:1: '<'
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpLessThanSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__BindingExpression__OpAlternatives_1_1_01676); 
                     after(grammarAccess.getBindingExpressionAccess().getOpLessThanSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:823:6: ( '>' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:823:6: ( '>' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:824:1: '>'
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__BindingExpression__OpAlternatives_1_1_01696); 
                     after(grammarAccess.getBindingExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:831:6: ( '=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:831:6: ( '=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:832:1: '='
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpEqualsSignKeyword_1_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__BindingExpression__OpAlternatives_1_1_01716); 
                     after(grammarAccess.getBindingExpressionAccess().getOpEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:839:6: ( '!=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:839:6: ( '!=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:840:1: '!='
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__BindingExpression__OpAlternatives_1_1_01736); 
                     after(grammarAccess.getBindingExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:847:6: ( '+' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:847:6: ( '+' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:848:1: '+'
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpPlusSignKeyword_1_1_0_4()); 
                    match(input,16,FOLLOW_16_in_rule__BindingExpression__OpAlternatives_1_1_01756); 
                     after(grammarAccess.getBindingExpressionAccess().getOpPlusSignKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:855:6: ( '-' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:855:6: ( '-' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:856:1: '-'
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpHyphenMinusKeyword_1_1_0_5()); 
                    match(input,17,FOLLOW_17_in_rule__BindingExpression__OpAlternatives_1_1_01776); 
                     after(grammarAccess.getBindingExpressionAccess().getOpHyphenMinusKeyword_1_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:863:6: ( '>=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:863:6: ( '>=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:864:1: '>='
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_6()); 
                    match(input,18,FOLLOW_18_in_rule__BindingExpression__OpAlternatives_1_1_01796); 
                     after(grammarAccess.getBindingExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:871:6: ( '<=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:871:6: ( '<=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:872:1: '<='
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_7()); 
                    match(input,19,FOLLOW_19_in_rule__BindingExpression__OpAlternatives_1_1_01816); 
                     after(grammarAccess.getBindingExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:879:6: ( '/' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:879:6: ( '/' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:880:1: '/'
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpSolidusKeyword_1_1_0_8()); 
                    match(input,20,FOLLOW_20_in_rule__BindingExpression__OpAlternatives_1_1_01836); 
                     after(grammarAccess.getBindingExpressionAccess().getOpSolidusKeyword_1_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:887:6: ( '*' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:887:6: ( '*' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:888:1: '*'
                    {
                     before(grammarAccess.getBindingExpressionAccess().getOpAsteriskKeyword_1_1_0_9()); 
                    match(input,21,FOLLOW_21_in_rule__BindingExpression__OpAlternatives_1_1_01856); 
                     after(grammarAccess.getBindingExpressionAccess().getOpAsteriskKeyword_1_1_0_9()); 

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
    // $ANTLR end rule__BindingExpression__OpAlternatives_1_1_0


    // $ANTLR start rule__BindingTerminalExpression__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:900:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ruleFeatureRefLiteral ) | ( ( rule__BindingTerminalExpression__Group_5__0 ) ) | ( ( rule__BindingTerminalExpression__Group_6__0 ) ) );
    public final void rule__BindingTerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:904:1: ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ruleFeatureRefLiteral ) | ( ( rule__BindingTerminalExpression__Group_5__0 ) ) | ( ( rule__BindingTerminalExpression__Group_6__0 ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case 11:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==31) ) {
                    alt4=6;
                }
                else if ( (LA4_5==EOF||(LA4_5>=12 && LA4_5<=21)||LA4_5==24||(LA4_5>=32 && LA4_5<=33)) ) {
                    alt4=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("900:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ruleFeatureRefLiteral ) | ( ( rule__BindingTerminalExpression__Group_5__0 ) ) | ( ( rule__BindingTerminalExpression__Group_6__0 ) ) );", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("900:1: rule__BindingTerminalExpression__Alternatives : ( ( ( rule__BindingTerminalExpression__Group_0__0 ) ) | ( ruleListLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) | ( ruleFeatureRefLiteral ) | ( ( rule__BindingTerminalExpression__Group_5__0 ) ) | ( ( rule__BindingTerminalExpression__Group_6__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
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
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__0_in_rule__BindingTerminalExpression__Alternatives1890);
                    rule__BindingTerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:911:6: ( ruleListLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:911:6: ( ruleListLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:912:1: ruleListLiteral
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getListLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__BindingTerminalExpression__Alternatives1908);
                    ruleListLiteral();
                    _fsp--;

                     after(grammarAccess.getBindingTerminalExpressionAccess().getListLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:917:6: ( ruleStringLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:917:6: ( ruleStringLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:918:1: ruleStringLiteral
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getStringLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__BindingTerminalExpression__Alternatives1925);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getBindingTerminalExpressionAccess().getStringLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:923:6: ( ruleNullLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:923:6: ( ruleNullLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:924:1: ruleNullLiteral
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getNullLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__BindingTerminalExpression__Alternatives1942);
                    ruleNullLiteral();
                    _fsp--;

                     after(grammarAccess.getBindingTerminalExpressionAccess().getNullLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:929:6: ( ruleFeatureRefLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:929:6: ( ruleFeatureRefLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:930:1: ruleFeatureRefLiteral
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getFeatureRefLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFeatureRefLiteral_in_rule__BindingTerminalExpression__Alternatives1959);
                    ruleFeatureRefLiteral();
                    _fsp--;

                     after(grammarAccess.getBindingTerminalExpressionAccess().getFeatureRefLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:935:6: ( ( rule__BindingTerminalExpression__Group_5__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:935:6: ( ( rule__BindingTerminalExpression__Group_5__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:936:1: ( rule__BindingTerminalExpression__Group_5__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_5()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:937:1: ( rule__BindingTerminalExpression__Group_5__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:937:2: rule__BindingTerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5__0_in_rule__BindingTerminalExpression__Alternatives1976);
                    rule__BindingTerminalExpression__Group_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:941:6: ( ( rule__BindingTerminalExpression__Group_6__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:941:6: ( ( rule__BindingTerminalExpression__Group_6__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:942:1: ( rule__BindingTerminalExpression__Group_6__0 )
                    {
                     before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_6()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:943:1: ( rule__BindingTerminalExpression__Group_6__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:943:2: rule__BindingTerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_6__0_in_rule__BindingTerminalExpression__Alternatives1994);
                    rule__BindingTerminalExpression__Group_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_6()); 

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


    // $ANTLR start rule__ThenBlock__Alternatives_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:952:1: rule__ThenBlock__Alternatives_0 : ( ( 'then' ) | ( '->' ) );
    public final void rule__ThenBlock__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:956:1: ( ( 'then' ) | ( '->' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("952:1: rule__ThenBlock__Alternatives_0 : ( ( 'then' ) | ( '->' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:957:1: ( 'then' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:957:1: ( 'then' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:958:1: 'then'
                    {
                     before(grammarAccess.getThenBlockAccess().getThenKeyword_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__ThenBlock__Alternatives_02028); 
                     after(grammarAccess.getThenBlockAccess().getThenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:965:6: ( '->' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:965:6: ( '->' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:966:1: '->'
                    {
                     before(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__ThenBlock__Alternatives_02048); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:978:1: rule__ThenBlock__Alternatives_1 : ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) );
    public final void rule__ThenBlock__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:982:1: ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==11||LA6_0==31||(LA6_0>=34 && LA6_0<=35)||LA6_0==37||LA6_0==39) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("978:1: rule__ThenBlock__Alternatives_1 : ( ( ( rule__ThenBlock__Group_1_0__0 ) ) | ( ( rule__ThenBlock__StatementsAssignment_1_1 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:983:1: ( ( rule__ThenBlock__Group_1_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:983:1: ( ( rule__ThenBlock__Group_1_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:984:1: ( rule__ThenBlock__Group_1_0__0 )
                    {
                     before(grammarAccess.getThenBlockAccess().getGroup_1_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:985:1: ( rule__ThenBlock__Group_1_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:985:2: rule__ThenBlock__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__0_in_rule__ThenBlock__Alternatives_12082);
                    rule__ThenBlock__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getThenBlockAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:989:6: ( ( rule__ThenBlock__StatementsAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:989:6: ( ( rule__ThenBlock__StatementsAssignment_1_1 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:990:1: ( rule__ThenBlock__StatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_1()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:991:1: ( rule__ThenBlock__StatementsAssignment_1_1 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:991:2: rule__ThenBlock__StatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_1_1_in_rule__ThenBlock__Alternatives_12100);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1000:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1004:1: ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==11||LA7_0==31||(LA7_0>=34 && LA7_0<=35)||LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==39) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1000:1: rule__Statement__Alternatives : ( ( ruleCreateStatement ) | ( ruleUpdateStatement ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1005:1: ( ruleCreateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1005:1: ( ruleCreateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1006:1: ruleCreateStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2133);
                    ruleCreateStatement();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1011:6: ( ruleUpdateStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1011:6: ( ruleUpdateStatement )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1012:1: ruleUpdateStatement
                    {
                     before(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2150);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1022:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );
    public final void rule__Setter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1026:1: ( ( ':' ) | ( '+=' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1022:1: rule__Setter__Alternatives_1 : ( ( ':' ) | ( '+=' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1027:1: ( ':' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1027:1: ( ':' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1028:1: ':'
                    {
                     before(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 
                    match(input,24,FOLLOW_24_in_rule__Setter__Alternatives_12183); 
                     after(grammarAccess.getSetterAccess().getColonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1035:6: ( '+=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1035:6: ( '+=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1036:1: '+='
                    {
                     before(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1()); 
                    match(input,25,FOLLOW_25_in_rule__Setter__Alternatives_12203); 
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


    // $ANTLR start rule__Expression__OpAlternatives_1_1_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1048:1: rule__Expression__OpAlternatives_1_1_0 : ( ( '<' ) | ( '>' ) | ( '=' ) | ( '+' ) | ( '-' ) | ( '>=' ) | ( '<=' ) | ( '/' ) | ( '*' ) );
    public final void rule__Expression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1052:1: ( ( '<' ) | ( '>' ) | ( '=' ) | ( '+' ) | ( '-' ) | ( '>=' ) | ( '<=' ) | ( '/' ) | ( '*' ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 14:
                {
                alt9=3;
                }
                break;
            case 16:
                {
                alt9=4;
                }
                break;
            case 17:
                {
                alt9=5;
                }
                break;
            case 18:
                {
                alt9=6;
                }
                break;
            case 19:
                {
                alt9=7;
                }
                break;
            case 20:
                {
                alt9=8;
                }
                break;
            case 21:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1048:1: rule__Expression__OpAlternatives_1_1_0 : ( ( '<' ) | ( '>' ) | ( '=' ) | ( '+' ) | ( '-' ) | ( '>=' ) | ( '<=' ) | ( '/' ) | ( '*' ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1053:1: ( '<' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1053:1: ( '<' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1054:1: '<'
                    {
                     before(grammarAccess.getExpressionAccess().getOpLessThanSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Expression__OpAlternatives_1_1_02238); 
                     after(grammarAccess.getExpressionAccess().getOpLessThanSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1061:6: ( '>' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1061:6: ( '>' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1062:1: '>'
                    {
                     before(grammarAccess.getExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Expression__OpAlternatives_1_1_02258); 
                     after(grammarAccess.getExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1069:6: ( '=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1069:6: ( '=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1070:1: '='
                    {
                     before(grammarAccess.getExpressionAccess().getOpEqualsSignKeyword_1_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__Expression__OpAlternatives_1_1_02278); 
                     after(grammarAccess.getExpressionAccess().getOpEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1077:6: ( '+' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1077:6: ( '+' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1078:1: '+'
                    {
                     before(grammarAccess.getExpressionAccess().getOpPlusSignKeyword_1_1_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__Expression__OpAlternatives_1_1_02298); 
                     after(grammarAccess.getExpressionAccess().getOpPlusSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1085:6: ( '-' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1085:6: ( '-' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1086:1: '-'
                    {
                     before(grammarAccess.getExpressionAccess().getOpHyphenMinusKeyword_1_1_0_4()); 
                    match(input,17,FOLLOW_17_in_rule__Expression__OpAlternatives_1_1_02318); 
                     after(grammarAccess.getExpressionAccess().getOpHyphenMinusKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1093:6: ( '>=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1093:6: ( '>=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1094:1: '>='
                    {
                     before(grammarAccess.getExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_5()); 
                    match(input,18,FOLLOW_18_in_rule__Expression__OpAlternatives_1_1_02338); 
                     after(grammarAccess.getExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1101:6: ( '<=' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1101:6: ( '<=' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1102:1: '<='
                    {
                     before(grammarAccess.getExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_6()); 
                    match(input,19,FOLLOW_19_in_rule__Expression__OpAlternatives_1_1_02358); 
                     after(grammarAccess.getExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1109:6: ( '/' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1109:6: ( '/' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1110:1: '/'
                    {
                     before(grammarAccess.getExpressionAccess().getOpSolidusKeyword_1_1_0_7()); 
                    match(input,20,FOLLOW_20_in_rule__Expression__OpAlternatives_1_1_02378); 
                     after(grammarAccess.getExpressionAccess().getOpSolidusKeyword_1_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1117:6: ( '*' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1117:6: ( '*' )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1118:1: '*'
                    {
                     before(grammarAccess.getExpressionAccess().getOpAsteriskKeyword_1_1_0_8()); 
                    match(input,21,FOLLOW_21_in_rule__Expression__OpAlternatives_1_1_02398); 
                     after(grammarAccess.getExpressionAccess().getOpAsteriskKeyword_1_1_0_8()); 

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
    // $ANTLR end rule__Expression__OpAlternatives_1_1_0


    // $ANTLR start rule__TerminalExpression__Alternatives
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1130:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleVarRefLiteral ) | ( ruleListLiteral ) | ( ruleCreateClass ) | ( ruleNullLiteral ) | ( ruleStringLiteral ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1134:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleVarRefLiteral ) | ( ruleListLiteral ) | ( ruleCreateClass ) | ( ruleNullLiteral ) | ( ruleStringLiteral ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            case 11:
                {
                alt10=5;
                }
                break;
            case RULE_STRING:
                {
                alt10=6;
                }
                break;
            case RULE_ID:
                {
                alt10=7;
                }
                break;
            case RULE_INT:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1130:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleVarRefLiteral ) | ( ruleListLiteral ) | ( ruleCreateClass ) | ( ruleNullLiteral ) | ( ruleStringLiteral ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1135:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1135:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1136:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1137:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1137:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives2432);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1141:6: ( ruleVarRefLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1141:6: ( ruleVarRefLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1142:1: ruleVarRefLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getVarRefLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVarRefLiteral_in_rule__TerminalExpression__Alternatives2450);
                    ruleVarRefLiteral();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getVarRefLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1147:6: ( ruleListLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1147:6: ( ruleListLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1148:1: ruleListLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getListLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleListLiteral_in_rule__TerminalExpression__Alternatives2467);
                    ruleListLiteral();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getListLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1153:6: ( ruleCreateClass )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1153:6: ( ruleCreateClass )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1154:1: ruleCreateClass
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives2484);
                    ruleCreateClass();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1159:6: ( ruleNullLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1159:6: ( ruleNullLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1160:1: ruleNullLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getNullLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__TerminalExpression__Alternatives2501);
                    ruleNullLiteral();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getNullLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1165:6: ( ruleStringLiteral )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1165:6: ( ruleStringLiteral )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1166:1: ruleStringLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getStringLiteralParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__TerminalExpression__Alternatives2518);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getStringLiteralParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1171:6: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1171:6: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1172:1: ( rule__TerminalExpression__Group_6__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1173:1: ( rule__TerminalExpression__Group_6__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1173:2: rule__TerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_6__0_in_rule__TerminalExpression__Alternatives2535);
                    rule__TerminalExpression__Group_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1177:6: ( ( rule__TerminalExpression__Group_7__0 ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1177:6: ( ( rule__TerminalExpression__Group_7__0 ) )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1178:1: ( rule__TerminalExpression__Group_7__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1179:1: ( rule__TerminalExpression__Group_7__0 )
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1179:2: rule__TerminalExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_7__0_in_rule__TerminalExpression__Alternatives2553);
                    rule__TerminalExpression__Group_7__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 

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


    // $ANTLR start rule__Scaffolding__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1190:1: rule__Scaffolding__Group__0 : rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 ;
    public final void rule__Scaffolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1194:1: ( rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1195:2: rule__Scaffolding__Group__0__Impl rule__Scaffolding__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02584);
            rule__Scaffolding__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02587);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1202:1: rule__Scaffolding__Group__0__Impl : ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) ;
    public final void rule__Scaffolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1206:1: ( ( ( rule__Scaffolding__ScaffoldAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1207:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1207:1: ( ( rule__Scaffolding__ScaffoldAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1208:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1209:1: ( rule__Scaffolding__ScaffoldAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1209:2: rule__Scaffolding__ScaffoldAssignment_0
            {
            pushFollow(FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2614);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1219:1: rule__Scaffolding__Group__1 : rule__Scaffolding__Group__1__Impl ;
    public final void rule__Scaffolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1223:1: ( rule__Scaffolding__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1224:2: rule__Scaffolding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12644);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1230:1: rule__Scaffolding__Group__1__Impl : ( ( rule__Scaffolding__ElementsAssignment_1 )* ) ;
    public final void rule__Scaffolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1234:1: ( ( ( rule__Scaffolding__ElementsAssignment_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1235:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1235:1: ( ( rule__Scaffolding__ElementsAssignment_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1236:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            {
             before(grammarAccess.getScaffoldingAccess().getElementsAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1237:1: ( rule__Scaffolding__ElementsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27||LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1237:2: rule__Scaffolding__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2671);
            	    rule__Scaffolding__ElementsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1251:1: rule__Scaffold__Group__0 : rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 ;
    public final void rule__Scaffold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1255:1: ( rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1256:2: rule__Scaffold__Group__0__Impl rule__Scaffold__Group__1
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02706);
            rule__Scaffold__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02709);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1263:1: rule__Scaffold__Group__0__Impl : ( 'scaffold' ) ;
    public final void rule__Scaffold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1267:1: ( ( 'scaffold' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1268:1: ( 'scaffold' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1268:1: ( 'scaffold' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1269:1: 'scaffold'
            {
             before(grammarAccess.getScaffoldAccess().getScaffoldKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Scaffold__Group__0__Impl2737); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1282:1: rule__Scaffold__Group__1 : rule__Scaffold__Group__1__Impl ;
    public final void rule__Scaffold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1286:1: ( rule__Scaffold__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1287:2: rule__Scaffold__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12768);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1293:1: rule__Scaffold__Group__1__Impl : ( ( rule__Scaffold__RefPackageAssignment_1 ) ) ;
    public final void rule__Scaffold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1297:1: ( ( ( rule__Scaffold__RefPackageAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1298:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1298:1: ( ( rule__Scaffold__RefPackageAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1299:1: ( rule__Scaffold__RefPackageAssignment_1 )
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1300:1: ( rule__Scaffold__RefPackageAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1300:2: rule__Scaffold__RefPackageAssignment_1
            {
            pushFollow(FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2795);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1314:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1318:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1319:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02829);
            rule__Rule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02832);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1326:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1330:1: ( ( 'rule' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1331:1: ( 'rule' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1331:1: ( 'rule' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1332:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Rule__Group__0__Impl2860); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1345:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1349:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1350:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12891);
            rule__Rule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12894);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1357:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1361:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1362:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1362:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1363:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1364:1: ( rule__Rule__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1364:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2921);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1374:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1378:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1379:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22951);
            rule__Rule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22954);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1386:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__WhenAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1390:1: ( ( ( rule__Rule__WhenAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1391:1: ( ( rule__Rule__WhenAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1391:1: ( ( rule__Rule__WhenAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1392:1: ( rule__Rule__WhenAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getWhenAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1393:1: ( rule__Rule__WhenAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1393:2: rule__Rule__WhenAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2981);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1403:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1407:1: ( rule__Rule__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1408:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33011);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1414:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ThenAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1418:1: ( ( ( rule__Rule__ThenAssignment_3 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1419:1: ( ( rule__Rule__ThenAssignment_3 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1419:1: ( ( rule__Rule__ThenAssignment_3 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1420:1: ( rule__Rule__ThenAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getThenAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1421:1: ( rule__Rule__ThenAssignment_3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1421:2: rule__Rule__ThenAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl3038);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1439:1: rule__WhenBlock__Group__0 : rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 ;
    public final void rule__WhenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1443:1: ( rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1444:2: rule__WhenBlock__Group__0__Impl rule__WhenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__03076);
            rule__WhenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__03079);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1451:1: rule__WhenBlock__Group__0__Impl : ( 'when' ) ;
    public final void rule__WhenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1455:1: ( ( 'when' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1456:1: ( 'when' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1456:1: ( 'when' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1457:1: 'when'
            {
             before(grammarAccess.getWhenBlockAccess().getWhenKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__WhenBlock__Group__0__Impl3107); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1470:1: rule__WhenBlock__Group__1 : rule__WhenBlock__Group__1__Impl ;
    public final void rule__WhenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1474:1: ( rule__WhenBlock__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1475:2: rule__WhenBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__13138);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1481:1: rule__WhenBlock__Group__1__Impl : ( ( rule__WhenBlock__Alternatives_1 ) ) ;
    public final void rule__WhenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1485:1: ( ( ( rule__WhenBlock__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1486:1: ( ( rule__WhenBlock__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1486:1: ( ( rule__WhenBlock__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1487:1: ( rule__WhenBlock__Alternatives_1 )
            {
             before(grammarAccess.getWhenBlockAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1488:1: ( rule__WhenBlock__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1488:2: rule__WhenBlock__Alternatives_1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Alternatives_1_in_rule__WhenBlock__Group__1__Impl3165);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1502:1: rule__WhenBlock__Group_1_0__0 : rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1 ;
    public final void rule__WhenBlock__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1506:1: ( rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1507:2: rule__WhenBlock__Group_1_0__0__Impl rule__WhenBlock__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__0__Impl_in_rule__WhenBlock__Group_1_0__03199);
            rule__WhenBlock__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__1_in_rule__WhenBlock__Group_1_0__03202);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1514:1: rule__WhenBlock__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__WhenBlock__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1518:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1519:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1519:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1520:1: '{'
            {
             before(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            match(input,29,FOLLOW_29_in_rule__WhenBlock__Group_1_0__0__Impl3230); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1533:1: rule__WhenBlock__Group_1_0__1 : rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2 ;
    public final void rule__WhenBlock__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1537:1: ( rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1538:2: rule__WhenBlock__Group_1_0__1__Impl rule__WhenBlock__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__1__Impl_in_rule__WhenBlock__Group_1_0__13261);
            rule__WhenBlock__Group_1_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__2_in_rule__WhenBlock__Group_1_0__13264);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1545:1: rule__WhenBlock__Group_1_0__1__Impl : ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* ) ;
    public final void rule__WhenBlock__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1549:1: ( ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1550:1: ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1550:1: ( ( rule__WhenBlock__MatchesAssignment_1_0_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1551:1: ( rule__WhenBlock__MatchesAssignment_1_0_1 )*
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesAssignment_1_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1552:1: ( rule__WhenBlock__MatchesAssignment_1_0_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1552:2: rule__WhenBlock__MatchesAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WhenBlock__MatchesAssignment_1_0_1_in_rule__WhenBlock__Group_1_0__1__Impl3291);
            	    rule__WhenBlock__MatchesAssignment_1_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1562:1: rule__WhenBlock__Group_1_0__2 : rule__WhenBlock__Group_1_0__2__Impl ;
    public final void rule__WhenBlock__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1566:1: ( rule__WhenBlock__Group_1_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1567:2: rule__WhenBlock__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenBlock__Group_1_0__2__Impl_in_rule__WhenBlock__Group_1_0__23322);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1573:1: rule__WhenBlock__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__WhenBlock__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1577:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1578:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1578:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1579:1: '}'
            {
             before(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_1_0_2()); 
            match(input,30,FOLLOW_30_in_rule__WhenBlock__Group_1_0__2__Impl3350); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1598:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1602:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1603:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__03387);
            rule__Match__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__1_in_rule__Match__Group__03390);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1610:1: rule__Match__Group__0__Impl : ( ( rule__Match__Group_0__0 )? ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1614:1: ( ( ( rule__Match__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1615:1: ( ( rule__Match__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1615:1: ( ( rule__Match__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1616:1: ( rule__Match__Group_0__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1617:1: ( rule__Match__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==24) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1617:2: rule__Match__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3417);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1627:1: rule__Match__Group__1 : rule__Match__Group__1__Impl rule__Match__Group__2 ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1631:1: ( rule__Match__Group__1__Impl rule__Match__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1632:2: rule__Match__Group__1__Impl rule__Match__Group__2
            {
            pushFollow(FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13448);
            rule__Match__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13451);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1639:1: rule__Match__Group__1__Impl : ( ( rule__Match__TypeAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1643:1: ( ( ( rule__Match__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1644:1: ( ( rule__Match__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1644:1: ( ( rule__Match__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1645:1: ( rule__Match__TypeAssignment_1 )
            {
             before(grammarAccess.getMatchAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1646:1: ( rule__Match__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1646:2: rule__Match__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3478);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1656:1: rule__Match__Group__2 : rule__Match__Group__2__Impl ;
    public final void rule__Match__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1660:1: ( rule__Match__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1661:2: rule__Match__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23508);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1667:1: rule__Match__Group__2__Impl : ( ( rule__Match__Group_2__0 )? ) ;
    public final void rule__Match__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1671:1: ( ( ( rule__Match__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1672:1: ( ( rule__Match__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1672:1: ( ( rule__Match__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1673:1: ( rule__Match__Group_2__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1674:1: ( rule__Match__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1674:2: rule__Match__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3535);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1690:1: rule__Match__Group_0__0 : rule__Match__Group_0__0__Impl rule__Match__Group_0__1 ;
    public final void rule__Match__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1694:1: ( rule__Match__Group_0__0__Impl rule__Match__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1695:2: rule__Match__Group_0__0__Impl rule__Match__Group_0__1
            {
            pushFollow(FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03572);
            rule__Match__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03575);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1702:1: rule__Match__Group_0__0__Impl : ( ( rule__Match__VarAssignment_0_0 ) ) ;
    public final void rule__Match__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1706:1: ( ( ( rule__Match__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1707:1: ( ( rule__Match__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1707:1: ( ( rule__Match__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1708:1: ( rule__Match__VarAssignment_0_0 )
            {
             before(grammarAccess.getMatchAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1709:1: ( rule__Match__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1709:2: rule__Match__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3602);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1719:1: rule__Match__Group_0__1 : rule__Match__Group_0__1__Impl ;
    public final void rule__Match__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1723:1: ( rule__Match__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1724:2: rule__Match__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13632);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1730:1: rule__Match__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Match__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1734:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1735:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1735:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1736:1: ':'
            {
             before(grammarAccess.getMatchAccess().getColonKeyword_0_1()); 
            match(input,24,FOLLOW_24_in_rule__Match__Group_0__1__Impl3660); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1753:1: rule__Match__Group_2__0 : rule__Match__Group_2__0__Impl rule__Match__Group_2__1 ;
    public final void rule__Match__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1757:1: ( rule__Match__Group_2__0__Impl rule__Match__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1758:2: rule__Match__Group_2__0__Impl rule__Match__Group_2__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03695);
            rule__Match__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03698);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1765:1: rule__Match__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Match__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1769:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1770:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1770:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1771:1: '('
            {
             before(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Match__Group_2__0__Impl3726); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1784:1: rule__Match__Group_2__1 : rule__Match__Group_2__1__Impl rule__Match__Group_2__2 ;
    public final void rule__Match__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1788:1: ( rule__Match__Group_2__1__Impl rule__Match__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1789:2: rule__Match__Group_2__1__Impl rule__Match__Group_2__2
            {
            pushFollow(FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13757);
            rule__Match__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13760);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1796:1: rule__Match__Group_2__1__Impl : ( ( rule__Match__Group_2_1__0 )? ) ;
    public final void rule__Match__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1800:1: ( ( ( rule__Match__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1801:1: ( ( rule__Match__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1801:1: ( ( rule__Match__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1802:1: ( rule__Match__Group_2_1__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1803:1: ( rule__Match__Group_2_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||LA15_0==11||LA15_0==31||LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1803:2: rule__Match__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3787);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1813:1: rule__Match__Group_2__2 : rule__Match__Group_2__2__Impl ;
    public final void rule__Match__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1817:1: ( rule__Match__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1818:2: rule__Match__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23818);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1824:1: rule__Match__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Match__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1828:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1829:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1829:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1830:1: ')'
            {
             before(grammarAccess.getMatchAccess().getRightParenthesisKeyword_2_2()); 
            match(input,32,FOLLOW_32_in_rule__Match__Group_2__2__Impl3846); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1849:1: rule__Match__Group_2_1__0 : rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 ;
    public final void rule__Match__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1853:1: ( rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1854:2: rule__Match__Group_2_1__0__Impl rule__Match__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03883);
            rule__Match__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03886);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1861:1: rule__Match__Group_2_1__0__Impl : ( ( rule__Match__ParamsAssignment_2_1_0 ) ) ;
    public final void rule__Match__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1865:1: ( ( ( rule__Match__ParamsAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1866:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1866:1: ( ( rule__Match__ParamsAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1867:1: ( rule__Match__ParamsAssignment_2_1_0 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1868:1: ( rule__Match__ParamsAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1868:2: rule__Match__ParamsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3913);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1878:1: rule__Match__Group_2_1__1 : rule__Match__Group_2_1__1__Impl ;
    public final void rule__Match__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1882:1: ( rule__Match__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1883:2: rule__Match__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13943);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1889:1: rule__Match__Group_2_1__1__Impl : ( ( rule__Match__Group_2_1_1__0 )* ) ;
    public final void rule__Match__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1893:1: ( ( ( rule__Match__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1894:1: ( ( rule__Match__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1894:1: ( ( rule__Match__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1895:1: ( rule__Match__Group_2_1_1__0 )*
            {
             before(grammarAccess.getMatchAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1896:1: ( rule__Match__Group_2_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1896:2: rule__Match__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3970);
            	    rule__Match__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1910:1: rule__Match__Group_2_1_1__0 : rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 ;
    public final void rule__Match__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1914:1: ( rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1915:2: rule__Match__Group_2_1_1__0__Impl rule__Match__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__04005);
            rule__Match__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__04008);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1922:1: rule__Match__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Match__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1926:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1927:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1927:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1928:1: ','
            {
             before(grammarAccess.getMatchAccess().getCommaKeyword_2_1_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Match__Group_2_1_1__0__Impl4036); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1941:1: rule__Match__Group_2_1_1__1 : rule__Match__Group_2_1_1__1__Impl ;
    public final void rule__Match__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1945:1: ( rule__Match__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1946:2: rule__Match__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__14067);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1952:1: rule__Match__Group_2_1_1__1__Impl : ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) ;
    public final void rule__Match__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1956:1: ( ( ( rule__Match__ParamsAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1957:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1957:1: ( ( rule__Match__ParamsAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1958:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            {
             before(grammarAccess.getMatchAccess().getParamsAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1959:1: ( rule__Match__ParamsAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1959:2: rule__Match__ParamsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl4094);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1973:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1977:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1978:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__04128);
            rule__Param__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__04131);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1985:1: rule__Param__Group__0__Impl : ( ( rule__Param__PropertyAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1989:1: ( ( ( rule__Param__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1990:1: ( ( rule__Param__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1990:1: ( ( rule__Param__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1991:1: ( rule__Param__PropertyAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1992:1: ( rule__Param__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:1992:2: rule__Param__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl4158);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2002:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2006:1: ( rule__Param__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2007:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__14188);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2013:1: rule__Param__Group__1__Impl : ( ( rule__Param__Group_1__0 )? ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2017:1: ( ( ( rule__Param__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2018:1: ( ( rule__Param__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2018:1: ( ( rule__Param__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2019:1: ( rule__Param__Group_1__0 )?
            {
             before(grammarAccess.getParamAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2020:1: ( rule__Param__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2020:2: rule__Param__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl4215);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2034:1: rule__Param__Group_1__0 : rule__Param__Group_1__0__Impl rule__Param__Group_1__1 ;
    public final void rule__Param__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2038:1: ( rule__Param__Group_1__0__Impl rule__Param__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2039:2: rule__Param__Group_1__0__Impl rule__Param__Group_1__1
            {
            pushFollow(FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__04250);
            rule__Param__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__04253);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2046:1: rule__Param__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Param__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2050:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2051:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2051:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2052:1: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Param__Group_1__0__Impl4281); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2065:1: rule__Param__Group_1__1 : rule__Param__Group_1__1__Impl ;
    public final void rule__Param__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2069:1: ( rule__Param__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2070:2: rule__Param__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__14312);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2076:1: rule__Param__Group_1__1__Impl : ( ( rule__Param__VarAssignment_1_1 ) ) ;
    public final void rule__Param__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2080:1: ( ( ( rule__Param__VarAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2081:1: ( ( rule__Param__VarAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2081:1: ( ( rule__Param__VarAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2082:1: ( rule__Param__VarAssignment_1_1 )
            {
             before(grammarAccess.getParamAccess().getVarAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2083:1: ( rule__Param__VarAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2083:2: rule__Param__VarAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl4339);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2097:1: rule__BindingExpression__Group__0 : rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1 ;
    public final void rule__BindingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2101:1: ( rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2102:2: rule__BindingExpression__Group__0__Impl rule__BindingExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__0__Impl_in_rule__BindingExpression__Group__04373);
            rule__BindingExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group__1_in_rule__BindingExpression__Group__04376);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2109:1: rule__BindingExpression__Group__0__Impl : ( ruleBindingTerminalExpression ) ;
    public final void rule__BindingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2113:1: ( ( ruleBindingTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2114:1: ( ruleBindingTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2114:1: ( ruleBindingTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2115:1: ruleBindingTerminalExpression
            {
             before(grammarAccess.getBindingExpressionAccess().getBindingTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_rule__BindingExpression__Group__0__Impl4403);
            ruleBindingTerminalExpression();
            _fsp--;

             after(grammarAccess.getBindingExpressionAccess().getBindingTerminalExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2126:1: rule__BindingExpression__Group__1 : rule__BindingExpression__Group__1__Impl ;
    public final void rule__BindingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2130:1: ( rule__BindingExpression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2131:2: rule__BindingExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group__1__Impl_in_rule__BindingExpression__Group__14432);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2137:1: rule__BindingExpression__Group__1__Impl : ( ( rule__BindingExpression__Group_1__0 )? ) ;
    public final void rule__BindingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2141:1: ( ( ( rule__BindingExpression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2142:1: ( ( rule__BindingExpression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2142:1: ( ( rule__BindingExpression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2143:1: ( rule__BindingExpression__Group_1__0 )?
            {
             before(grammarAccess.getBindingExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2144:1: ( rule__BindingExpression__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=12 && LA18_0<=21)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2144:2: rule__BindingExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BindingExpression__Group_1__0_in_rule__BindingExpression__Group__1__Impl4459);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2158:1: rule__BindingExpression__Group_1__0 : rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1 ;
    public final void rule__BindingExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2162:1: ( rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2163:2: rule__BindingExpression__Group_1__0__Impl rule__BindingExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__0__Impl_in_rule__BindingExpression__Group_1__04494);
            rule__BindingExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group_1__1_in_rule__BindingExpression__Group_1__04497);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2170:1: rule__BindingExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BindingExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2174:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2175:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2175:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2176:1: ()
            {
             before(grammarAccess.getBindingExpressionAccess().getBindingOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2177:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2179:1: 
            {
            }

             after(grammarAccess.getBindingExpressionAccess().getBindingOperationLeftAction_1_0()); 

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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2189:1: rule__BindingExpression__Group_1__1 : rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2 ;
    public final void rule__BindingExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2193:1: ( rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2194:2: rule__BindingExpression__Group_1__1__Impl rule__BindingExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__1__Impl_in_rule__BindingExpression__Group_1__14555);
            rule__BindingExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingExpression__Group_1__2_in_rule__BindingExpression__Group_1__14558);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2201:1: rule__BindingExpression__Group_1__1__Impl : ( ( rule__BindingExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BindingExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2205:1: ( ( ( rule__BindingExpression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2206:1: ( ( rule__BindingExpression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2206:1: ( ( rule__BindingExpression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2207:1: ( rule__BindingExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBindingExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2208:1: ( rule__BindingExpression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2208:2: rule__BindingExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BindingExpression__OpAssignment_1_1_in_rule__BindingExpression__Group_1__1__Impl4585);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2218:1: rule__BindingExpression__Group_1__2 : rule__BindingExpression__Group_1__2__Impl ;
    public final void rule__BindingExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2222:1: ( rule__BindingExpression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2223:2: rule__BindingExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingExpression__Group_1__2__Impl_in_rule__BindingExpression__Group_1__24615);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2229:1: rule__BindingExpression__Group_1__2__Impl : ( ( rule__BindingExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BindingExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2233:1: ( ( ( rule__BindingExpression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2234:1: ( ( rule__BindingExpression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2234:1: ( ( rule__BindingExpression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2235:1: ( rule__BindingExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBindingExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2236:1: ( rule__BindingExpression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2236:2: rule__BindingExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BindingExpression__RightAssignment_1_2_in_rule__BindingExpression__Group_1__2__Impl4642);
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


    // $ANTLR start rule__BindingTerminalExpression__Group_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2252:1: rule__BindingTerminalExpression__Group_0__0 : rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1 ;
    public final void rule__BindingTerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2256:1: ( rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2257:2: rule__BindingTerminalExpression__Group_0__0__Impl rule__BindingTerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__0__Impl_in_rule__BindingTerminalExpression__Group_0__04678);
            rule__BindingTerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__1_in_rule__BindingTerminalExpression__Group_0__04681);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2264:1: rule__BindingTerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BindingTerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2268:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2269:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2269:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2270:1: '('
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__BindingTerminalExpression__Group_0__0__Impl4709); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2283:1: rule__BindingTerminalExpression__Group_0__1 : rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2 ;
    public final void rule__BindingTerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2287:1: ( rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2288:2: rule__BindingTerminalExpression__Group_0__1__Impl rule__BindingTerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__1__Impl_in_rule__BindingTerminalExpression__Group_0__14740);
            rule__BindingTerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__2_in_rule__BindingTerminalExpression__Group_0__14743);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2295:1: rule__BindingTerminalExpression__Group_0__1__Impl : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2299:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2300:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2300:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2301:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getBindingExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__Group_0__1__Impl4770);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2312:1: rule__BindingTerminalExpression__Group_0__2 : rule__BindingTerminalExpression__Group_0__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2316:1: ( rule__BindingTerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2317:2: rule__BindingTerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_0__2__Impl_in_rule__BindingTerminalExpression__Group_0__24799);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2323:1: rule__BindingTerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BindingTerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2327:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2328:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2328:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2329:1: ')'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_32_in_rule__BindingTerminalExpression__Group_0__2__Impl4827); 
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


    // $ANTLR start rule__BindingTerminalExpression__Group_5__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2348:1: rule__BindingTerminalExpression__Group_5__0 : rule__BindingTerminalExpression__Group_5__0__Impl rule__BindingTerminalExpression__Group_5__1 ;
    public final void rule__BindingTerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2352:1: ( rule__BindingTerminalExpression__Group_5__0__Impl rule__BindingTerminalExpression__Group_5__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2353:2: rule__BindingTerminalExpression__Group_5__0__Impl rule__BindingTerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5__0__Impl_in_rule__BindingTerminalExpression__Group_5__04864);
            rule__BindingTerminalExpression__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5__1_in_rule__BindingTerminalExpression__Group_5__04867);
            rule__BindingTerminalExpression__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5__0


    // $ANTLR start rule__BindingTerminalExpression__Group_5__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2360:1: rule__BindingTerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__BindingTerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2364:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2365:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2365:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2366:1: ()
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_5_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2367:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2369:1: 
            {
            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_5__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2379:1: rule__BindingTerminalExpression__Group_5__1 : rule__BindingTerminalExpression__Group_5__1__Impl rule__BindingTerminalExpression__Group_5__2 ;
    public final void rule__BindingTerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2383:1: ( rule__BindingTerminalExpression__Group_5__1__Impl rule__BindingTerminalExpression__Group_5__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2384:2: rule__BindingTerminalExpression__Group_5__1__Impl rule__BindingTerminalExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5__1__Impl_in_rule__BindingTerminalExpression__Group_5__14925);
            rule__BindingTerminalExpression__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5__2_in_rule__BindingTerminalExpression__Group_5__14928);
            rule__BindingTerminalExpression__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5__1


    // $ANTLR start rule__BindingTerminalExpression__Group_5__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2391:1: rule__BindingTerminalExpression__Group_5__1__Impl : ( ( rule__BindingTerminalExpression__FunctionAssignment_5_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2395:1: ( ( ( rule__BindingTerminalExpression__FunctionAssignment_5_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2396:1: ( ( rule__BindingTerminalExpression__FunctionAssignment_5_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2396:1: ( ( rule__BindingTerminalExpression__FunctionAssignment_5_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2397:1: ( rule__BindingTerminalExpression__FunctionAssignment_5_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionAssignment_5_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2398:1: ( rule__BindingTerminalExpression__FunctionAssignment_5_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2398:2: rule__BindingTerminalExpression__FunctionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__FunctionAssignment_5_1_in_rule__BindingTerminalExpression__Group_5__1__Impl4955);
            rule__BindingTerminalExpression__FunctionAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getFunctionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5__1__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_5__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2408:1: rule__BindingTerminalExpression__Group_5__2 : rule__BindingTerminalExpression__Group_5__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2412:1: ( rule__BindingTerminalExpression__Group_5__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2413:2: rule__BindingTerminalExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5__2__Impl_in_rule__BindingTerminalExpression__Group_5__24985);
            rule__BindingTerminalExpression__Group_5__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5__2


    // $ANTLR start rule__BindingTerminalExpression__Group_5__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2419:1: rule__BindingTerminalExpression__Group_5__2__Impl : ( ( rule__BindingTerminalExpression__Group_5_2__0 ) ) ;
    public final void rule__BindingTerminalExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2423:1: ( ( ( rule__BindingTerminalExpression__Group_5_2__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2424:1: ( ( rule__BindingTerminalExpression__Group_5_2__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2424:1: ( ( rule__BindingTerminalExpression__Group_5_2__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2425:1: ( rule__BindingTerminalExpression__Group_5_2__0 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getGroup_5_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2426:1: ( rule__BindingTerminalExpression__Group_5_2__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2426:2: rule__BindingTerminalExpression__Group_5_2__0
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5_2__0_in_rule__BindingTerminalExpression__Group_5__2__Impl5012);
            rule__BindingTerminalExpression__Group_5_2__0();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5__2__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_5_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2442:1: rule__BindingTerminalExpression__Group_5_2__0 : rule__BindingTerminalExpression__Group_5_2__0__Impl rule__BindingTerminalExpression__Group_5_2__1 ;
    public final void rule__BindingTerminalExpression__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2446:1: ( rule__BindingTerminalExpression__Group_5_2__0__Impl rule__BindingTerminalExpression__Group_5_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2447:2: rule__BindingTerminalExpression__Group_5_2__0__Impl rule__BindingTerminalExpression__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5_2__0__Impl_in_rule__BindingTerminalExpression__Group_5_2__05048);
            rule__BindingTerminalExpression__Group_5_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5_2__1_in_rule__BindingTerminalExpression__Group_5_2__05051);
            rule__BindingTerminalExpression__Group_5_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5_2__0


    // $ANTLR start rule__BindingTerminalExpression__Group_5_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2454:1: rule__BindingTerminalExpression__Group_5_2__0__Impl : ( '(' ) ;
    public final void rule__BindingTerminalExpression__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2458:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2459:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2459:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2460:1: '('
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_5_2_0()); 
            match(input,31,FOLLOW_31_in_rule__BindingTerminalExpression__Group_5_2__0__Impl5079); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5_2__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_5_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2473:1: rule__BindingTerminalExpression__Group_5_2__1 : rule__BindingTerminalExpression__Group_5_2__1__Impl rule__BindingTerminalExpression__Group_5_2__2 ;
    public final void rule__BindingTerminalExpression__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2477:1: ( rule__BindingTerminalExpression__Group_5_2__1__Impl rule__BindingTerminalExpression__Group_5_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2478:2: rule__BindingTerminalExpression__Group_5_2__1__Impl rule__BindingTerminalExpression__Group_5_2__2
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5_2__1__Impl_in_rule__BindingTerminalExpression__Group_5_2__15110);
            rule__BindingTerminalExpression__Group_5_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5_2__2_in_rule__BindingTerminalExpression__Group_5_2__15113);
            rule__BindingTerminalExpression__Group_5_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5_2__1


    // $ANTLR start rule__BindingTerminalExpression__Group_5_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2485:1: rule__BindingTerminalExpression__Group_5_2__1__Impl : ( ( rule__BindingTerminalExpression__ExpAssignment_5_2_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2489:1: ( ( ( rule__BindingTerminalExpression__ExpAssignment_5_2_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2490:1: ( ( rule__BindingTerminalExpression__ExpAssignment_5_2_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2490:1: ( ( rule__BindingTerminalExpression__ExpAssignment_5_2_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2491:1: ( rule__BindingTerminalExpression__ExpAssignment_5_2_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_5_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2492:1: ( rule__BindingTerminalExpression__ExpAssignment_5_2_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2492:2: rule__BindingTerminalExpression__ExpAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ExpAssignment_5_2_1_in_rule__BindingTerminalExpression__Group_5_2__1__Impl5140);
            rule__BindingTerminalExpression__ExpAssignment_5_2_1();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getExpAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5_2__1__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_5_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2502:1: rule__BindingTerminalExpression__Group_5_2__2 : rule__BindingTerminalExpression__Group_5_2__2__Impl ;
    public final void rule__BindingTerminalExpression__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2506:1: ( rule__BindingTerminalExpression__Group_5_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2507:2: rule__BindingTerminalExpression__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_5_2__2__Impl_in_rule__BindingTerminalExpression__Group_5_2__25170);
            rule__BindingTerminalExpression__Group_5_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5_2__2


    // $ANTLR start rule__BindingTerminalExpression__Group_5_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2513:1: rule__BindingTerminalExpression__Group_5_2__2__Impl : ( ')' ) ;
    public final void rule__BindingTerminalExpression__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2517:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2518:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2518:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2519:1: ')'
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_5_2_2()); 
            match(input,32,FOLLOW_32_in_rule__BindingTerminalExpression__Group_5_2__2__Impl5198); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_5_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_5_2__2__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_6__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2538:1: rule__BindingTerminalExpression__Group_6__0 : rule__BindingTerminalExpression__Group_6__0__Impl rule__BindingTerminalExpression__Group_6__1 ;
    public final void rule__BindingTerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2542:1: ( rule__BindingTerminalExpression__Group_6__0__Impl rule__BindingTerminalExpression__Group_6__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2543:2: rule__BindingTerminalExpression__Group_6__0__Impl rule__BindingTerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_6__0__Impl_in_rule__BindingTerminalExpression__Group_6__05235);
            rule__BindingTerminalExpression__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_6__1_in_rule__BindingTerminalExpression__Group_6__05238);
            rule__BindingTerminalExpression__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_6__0


    // $ANTLR start rule__BindingTerminalExpression__Group_6__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2550:1: rule__BindingTerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__BindingTerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2554:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2555:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2555:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2556:1: ()
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getIntLiteralAction_6_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2557:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2559:1: 
            {
            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getIntLiteralAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_6__0__Impl


    // $ANTLR start rule__BindingTerminalExpression__Group_6__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2569:1: rule__BindingTerminalExpression__Group_6__1 : rule__BindingTerminalExpression__Group_6__1__Impl ;
    public final void rule__BindingTerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2573:1: ( rule__BindingTerminalExpression__Group_6__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2574:2: rule__BindingTerminalExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__Group_6__1__Impl_in_rule__BindingTerminalExpression__Group_6__15296);
            rule__BindingTerminalExpression__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_6__1


    // $ANTLR start rule__BindingTerminalExpression__Group_6__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2580:1: rule__BindingTerminalExpression__Group_6__1__Impl : ( ( rule__BindingTerminalExpression__ValueAssignment_6_1 ) ) ;
    public final void rule__BindingTerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2584:1: ( ( ( rule__BindingTerminalExpression__ValueAssignment_6_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2585:1: ( ( rule__BindingTerminalExpression__ValueAssignment_6_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2585:1: ( ( rule__BindingTerminalExpression__ValueAssignment_6_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2586:1: ( rule__BindingTerminalExpression__ValueAssignment_6_1 )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getValueAssignment_6_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2587:1: ( rule__BindingTerminalExpression__ValueAssignment_6_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2587:2: rule__BindingTerminalExpression__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_rule__BindingTerminalExpression__ValueAssignment_6_1_in_rule__BindingTerminalExpression__Group_6__1__Impl5323);
            rule__BindingTerminalExpression__ValueAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getValueAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__Group_6__1__Impl


    // $ANTLR start rule__ThenBlock__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2601:1: rule__ThenBlock__Group__0 : rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 ;
    public final void rule__ThenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2605:1: ( rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2606:2: rule__ThenBlock__Group__0__Impl rule__ThenBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__05357);
            rule__ThenBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__05360);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2613:1: rule__ThenBlock__Group__0__Impl : ( ( rule__ThenBlock__Alternatives_0 ) ) ;
    public final void rule__ThenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2617:1: ( ( ( rule__ThenBlock__Alternatives_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2618:1: ( ( rule__ThenBlock__Alternatives_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2618:1: ( ( rule__ThenBlock__Alternatives_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2619:1: ( rule__ThenBlock__Alternatives_0 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2620:1: ( rule__ThenBlock__Alternatives_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2620:2: rule__ThenBlock__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_0_in_rule__ThenBlock__Group__0__Impl5387);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2630:1: rule__ThenBlock__Group__1 : rule__ThenBlock__Group__1__Impl ;
    public final void rule__ThenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2634:1: ( rule__ThenBlock__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2635:2: rule__ThenBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__15417);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2641:1: rule__ThenBlock__Group__1__Impl : ( ( rule__ThenBlock__Alternatives_1 ) ) ;
    public final void rule__ThenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2645:1: ( ( ( rule__ThenBlock__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2646:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2646:1: ( ( rule__ThenBlock__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2647:1: ( rule__ThenBlock__Alternatives_1 )
            {
             before(grammarAccess.getThenBlockAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2648:1: ( rule__ThenBlock__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2648:2: rule__ThenBlock__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl5444);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2662:1: rule__ThenBlock__Group_1_0__0 : rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1 ;
    public final void rule__ThenBlock__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2666:1: ( rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2667:2: rule__ThenBlock__Group_1_0__0__Impl rule__ThenBlock__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__0__Impl_in_rule__ThenBlock__Group_1_0__05478);
            rule__ThenBlock__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__1_in_rule__ThenBlock__Group_1_0__05481);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2674:1: rule__ThenBlock__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__ThenBlock__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2678:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2679:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2679:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2680:1: '{'
            {
             before(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            match(input,29,FOLLOW_29_in_rule__ThenBlock__Group_1_0__0__Impl5509); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2693:1: rule__ThenBlock__Group_1_0__1 : rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2 ;
    public final void rule__ThenBlock__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2697:1: ( rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2698:2: rule__ThenBlock__Group_1_0__1__Impl rule__ThenBlock__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__1__Impl_in_rule__ThenBlock__Group_1_0__15540);
            rule__ThenBlock__Group_1_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__2_in_rule__ThenBlock__Group_1_0__15543);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2705:1: rule__ThenBlock__Group_1_0__1__Impl : ( ( rule__ThenBlock__StatementsAssignment_1_0_1 )* ) ;
    public final void rule__ThenBlock__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2709:1: ( ( ( rule__ThenBlock__StatementsAssignment_1_0_1 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2710:1: ( ( rule__ThenBlock__StatementsAssignment_1_0_1 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2710:1: ( ( rule__ThenBlock__StatementsAssignment_1_0_1 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2711:1: ( rule__ThenBlock__StatementsAssignment_1_0_1 )*
            {
             before(grammarAccess.getThenBlockAccess().getStatementsAssignment_1_0_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2712:1: ( rule__ThenBlock__StatementsAssignment_1_0_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==11||LA19_0==31||(LA19_0>=34 && LA19_0<=35)||LA19_0==37||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2712:2: rule__ThenBlock__StatementsAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_rule__ThenBlock__StatementsAssignment_1_0_1_in_rule__ThenBlock__Group_1_0__1__Impl5570);
            	    rule__ThenBlock__StatementsAssignment_1_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2722:1: rule__ThenBlock__Group_1_0__2 : rule__ThenBlock__Group_1_0__2__Impl ;
    public final void rule__ThenBlock__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2726:1: ( rule__ThenBlock__Group_1_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2727:2: rule__ThenBlock__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenBlock__Group_1_0__2__Impl_in_rule__ThenBlock__Group_1_0__25601);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2733:1: rule__ThenBlock__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__ThenBlock__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2737:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2738:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2738:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2739:1: '}'
            {
             before(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_1_0_2()); 
            match(input,30,FOLLOW_30_in_rule__ThenBlock__Group_1_0__2__Impl5629); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2758:1: rule__CreateStatement__Group__0 : rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 ;
    public final void rule__CreateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2762:1: ( rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2763:2: rule__CreateStatement__Group__0__Impl rule__CreateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__05666);
            rule__CreateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__05669);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2770:1: rule__CreateStatement__Group__0__Impl : ( ( rule__CreateStatement__Group_0__0 )? ) ;
    public final void rule__CreateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2774:1: ( ( ( rule__CreateStatement__Group_0__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2775:1: ( ( rule__CreateStatement__Group_0__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2775:1: ( ( rule__CreateStatement__Group_0__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2776:1: ( rule__CreateStatement__Group_0__0 )?
            {
             before(grammarAccess.getCreateStatementAccess().getGroup_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2777:1: ( rule__CreateStatement__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==24) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2777:2: rule__CreateStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl5696);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2787:1: rule__CreateStatement__Group__1 : rule__CreateStatement__Group__1__Impl ;
    public final void rule__CreateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2791:1: ( rule__CreateStatement__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2792:2: rule__CreateStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__15727);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2798:1: rule__CreateStatement__Group__1__Impl : ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) ;
    public final void rule__CreateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2802:1: ( ( ( rule__CreateStatement__ExpressionAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2803:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2803:1: ( ( rule__CreateStatement__ExpressionAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2804:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2805:1: ( rule__CreateStatement__ExpressionAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2805:2: rule__CreateStatement__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl5754);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2819:1: rule__CreateStatement__Group_0__0 : rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 ;
    public final void rule__CreateStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2823:1: ( rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2824:2: rule__CreateStatement__Group_0__0__Impl rule__CreateStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__05788);
            rule__CreateStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__05791);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2831:1: rule__CreateStatement__Group_0__0__Impl : ( ( rule__CreateStatement__VarAssignment_0_0 ) ) ;
    public final void rule__CreateStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2835:1: ( ( ( rule__CreateStatement__VarAssignment_0_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2836:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2836:1: ( ( rule__CreateStatement__VarAssignment_0_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2837:1: ( rule__CreateStatement__VarAssignment_0_0 )
            {
             before(grammarAccess.getCreateStatementAccess().getVarAssignment_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2838:1: ( rule__CreateStatement__VarAssignment_0_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2838:2: rule__CreateStatement__VarAssignment_0_0
            {
            pushFollow(FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl5818);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2848:1: rule__CreateStatement__Group_0__1 : rule__CreateStatement__Group_0__1__Impl ;
    public final void rule__CreateStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2852:1: ( rule__CreateStatement__Group_0__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2853:2: rule__CreateStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__15848);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2859:1: rule__CreateStatement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__CreateStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2863:1: ( ( ':' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2864:1: ( ':' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2864:1: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2865:1: ':'
            {
             before(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1()); 
            match(input,24,FOLLOW_24_in_rule__CreateStatement__Group_0__1__Impl5876); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2882:1: rule__CreateClass__Group__0 : rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 ;
    public final void rule__CreateClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2886:1: ( rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2887:2: rule__CreateClass__Group__0__Impl rule__CreateClass__Group__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__05911);
            rule__CreateClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__05914);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2894:1: rule__CreateClass__Group__0__Impl : ( 'new' ) ;
    public final void rule__CreateClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2898:1: ( ( 'new' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2899:1: ( 'new' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2899:1: ( 'new' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2900:1: 'new'
            {
             before(grammarAccess.getCreateClassAccess().getNewKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__CreateClass__Group__0__Impl5942); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2913:1: rule__CreateClass__Group__1 : rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 ;
    public final void rule__CreateClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2917:1: ( rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2918:2: rule__CreateClass__Group__1__Impl rule__CreateClass__Group__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__15973);
            rule__CreateClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__15976);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2925:1: rule__CreateClass__Group__1__Impl : ( ( rule__CreateClass__TypeAssignment_1 ) ) ;
    public final void rule__CreateClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2929:1: ( ( ( rule__CreateClass__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2930:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2930:1: ( ( rule__CreateClass__TypeAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2931:1: ( rule__CreateClass__TypeAssignment_1 )
            {
             before(grammarAccess.getCreateClassAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2932:1: ( rule__CreateClass__TypeAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2932:2: rule__CreateClass__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl6003);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2942:1: rule__CreateClass__Group__2 : rule__CreateClass__Group__2__Impl ;
    public final void rule__CreateClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2946:1: ( rule__CreateClass__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2947:2: rule__CreateClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__26033);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2953:1: rule__CreateClass__Group__2__Impl : ( ( rule__CreateClass__Group_2__0 )? ) ;
    public final void rule__CreateClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2957:1: ( ( ( rule__CreateClass__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2958:1: ( ( rule__CreateClass__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2958:1: ( ( rule__CreateClass__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2959:1: ( rule__CreateClass__Group_2__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2960:1: ( rule__CreateClass__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2960:2: rule__CreateClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl6060);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2976:1: rule__CreateClass__Group_2__0 : rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 ;
    public final void rule__CreateClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2980:1: ( rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2981:2: rule__CreateClass__Group_2__0__Impl rule__CreateClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__06097);
            rule__CreateClass__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__06100);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2988:1: rule__CreateClass__Group_2__0__Impl : ( '{' ) ;
    public final void rule__CreateClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2992:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2993:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2993:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:2994:1: '{'
            {
             before(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__CreateClass__Group_2__0__Impl6128); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3007:1: rule__CreateClass__Group_2__1 : rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 ;
    public final void rule__CreateClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3011:1: ( rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3012:2: rule__CreateClass__Group_2__1__Impl rule__CreateClass__Group_2__2
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__16159);
            rule__CreateClass__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__16162);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3019:1: rule__CreateClass__Group_2__1__Impl : ( ( rule__CreateClass__Group_2_1__0 )? ) ;
    public final void rule__CreateClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3023:1: ( ( ( rule__CreateClass__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3024:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3024:1: ( ( rule__CreateClass__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3025:1: ( rule__CreateClass__Group_2_1__0 )?
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3026:1: ( rule__CreateClass__Group_2_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3026:2: rule__CreateClass__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl6189);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3036:1: rule__CreateClass__Group_2__2 : rule__CreateClass__Group_2__2__Impl ;
    public final void rule__CreateClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3040:1: ( rule__CreateClass__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3041:2: rule__CreateClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__26220);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3047:1: rule__CreateClass__Group_2__2__Impl : ( '}' ) ;
    public final void rule__CreateClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3051:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3052:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3052:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3053:1: '}'
            {
             before(grammarAccess.getCreateClassAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,30,FOLLOW_30_in_rule__CreateClass__Group_2__2__Impl6248); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3072:1: rule__CreateClass__Group_2_1__0 : rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 ;
    public final void rule__CreateClass__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3076:1: ( rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3077:2: rule__CreateClass__Group_2_1__0__Impl rule__CreateClass__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__06285);
            rule__CreateClass__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__06288);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3084:1: rule__CreateClass__Group_2_1__0__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) ;
    public final void rule__CreateClass__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3088:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3089:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3089:1: ( ( rule__CreateClass__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3090:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3091:1: ( rule__CreateClass__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3091:2: rule__CreateClass__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl6315);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3101:1: rule__CreateClass__Group_2_1__1 : rule__CreateClass__Group_2_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3105:1: ( rule__CreateClass__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3106:2: rule__CreateClass__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__16345);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3112:1: rule__CreateClass__Group_2_1__1__Impl : ( ( rule__CreateClass__Group_2_1_1__0 )* ) ;
    public final void rule__CreateClass__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3116:1: ( ( ( rule__CreateClass__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3117:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3117:1: ( ( rule__CreateClass__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3118:1: ( rule__CreateClass__Group_2_1_1__0 )*
            {
             before(grammarAccess.getCreateClassAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3119:1: ( rule__CreateClass__Group_2_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3119:2: rule__CreateClass__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl6372);
            	    rule__CreateClass__Group_2_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3133:1: rule__CreateClass__Group_2_1_1__0 : rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 ;
    public final void rule__CreateClass__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3137:1: ( rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3138:2: rule__CreateClass__Group_2_1_1__0__Impl rule__CreateClass__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__06407);
            rule__CreateClass__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__06410);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3145:1: rule__CreateClass__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__CreateClass__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3149:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3150:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3150:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3151:1: ','
            {
             before(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0()); 
            match(input,33,FOLLOW_33_in_rule__CreateClass__Group_2_1_1__0__Impl6438); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3164:1: rule__CreateClass__Group_2_1_1__1 : rule__CreateClass__Group_2_1_1__1__Impl ;
    public final void rule__CreateClass__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3168:1: ( rule__CreateClass__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3169:2: rule__CreateClass__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__16469);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3175:1: rule__CreateClass__Group_2_1_1__1__Impl : ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__CreateClass__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3179:1: ( ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3180:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3180:1: ( ( rule__CreateClass__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3181:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getCreateClassAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3182:1: ( rule__CreateClass__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3182:2: rule__CreateClass__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl6496);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3196:1: rule__ListLiteral__Group__0 : rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 ;
    public final void rule__ListLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3200:1: ( rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3201:2: rule__ListLiteral__Group__0__Impl rule__ListLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__06530);
            rule__ListLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__06533);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3208:1: rule__ListLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__ListLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3212:1: ( ( '[' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3213:1: ( '[' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3213:1: ( '[' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3214:1: '['
            {
             before(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ListLiteral__Group__0__Impl6561); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3227:1: rule__ListLiteral__Group__1 : rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 ;
    public final void rule__ListLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3231:1: ( rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3232:2: rule__ListLiteral__Group__1__Impl rule__ListLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__16592);
            rule__ListLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__16595);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3239:1: rule__ListLiteral__Group__1__Impl : ( ( rule__ListLiteral__Group_1__0 )? ) ;
    public final void rule__ListLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3243:1: ( ( ( rule__ListLiteral__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3244:1: ( ( rule__ListLiteral__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3244:1: ( ( rule__ListLiteral__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3245:1: ( rule__ListLiteral__Group_1__0 )?
            {
             before(grammarAccess.getListLiteralAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3246:1: ( rule__ListLiteral__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||LA24_0==11||LA24_0==31||(LA24_0>=34 && LA24_0<=35)||LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3246:2: rule__ListLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ListLiteral__Group_1__0_in_rule__ListLiteral__Group__1__Impl6622);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3256:1: rule__ListLiteral__Group__2 : rule__ListLiteral__Group__2__Impl ;
    public final void rule__ListLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3260:1: ( rule__ListLiteral__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3261:2: rule__ListLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__26653);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3267:1: rule__ListLiteral__Group__2__Impl : ( ']' ) ;
    public final void rule__ListLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3271:1: ( ( ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3272:1: ( ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3272:1: ( ']' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3273:1: ']'
            {
             before(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__ListLiteral__Group__2__Impl6681); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3292:1: rule__ListLiteral__Group_1__0 : rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1 ;
    public final void rule__ListLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3296:1: ( rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3297:2: rule__ListLiteral__Group_1__0__Impl rule__ListLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1__0__Impl_in_rule__ListLiteral__Group_1__06718);
            rule__ListLiteral__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_1__1_in_rule__ListLiteral__Group_1__06721);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3304:1: rule__ListLiteral__Group_1__0__Impl : ( ( rule__ListLiteral__ItemsAssignment_1_0 ) ) ;
    public final void rule__ListLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3308:1: ( ( ( rule__ListLiteral__ItemsAssignment_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3309:1: ( ( rule__ListLiteral__ItemsAssignment_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3309:1: ( ( rule__ListLiteral__ItemsAssignment_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3310:1: ( rule__ListLiteral__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3311:1: ( rule__ListLiteral__ItemsAssignment_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3311:2: rule__ListLiteral__ItemsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_1_0_in_rule__ListLiteral__Group_1__0__Impl6748);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3321:1: rule__ListLiteral__Group_1__1 : rule__ListLiteral__Group_1__1__Impl ;
    public final void rule__ListLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3325:1: ( rule__ListLiteral__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3326:2: rule__ListLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1__1__Impl_in_rule__ListLiteral__Group_1__16778);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3332:1: rule__ListLiteral__Group_1__1__Impl : ( ( rule__ListLiteral__Group_1_1__0 )* ) ;
    public final void rule__ListLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3336:1: ( ( ( rule__ListLiteral__Group_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3337:1: ( ( rule__ListLiteral__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3337:1: ( ( rule__ListLiteral__Group_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3338:1: ( rule__ListLiteral__Group_1_1__0 )*
            {
             before(grammarAccess.getListLiteralAccess().getGroup_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3339:1: ( rule__ListLiteral__Group_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3339:2: rule__ListLiteral__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__0_in_rule__ListLiteral__Group_1__1__Impl6805);
            	    rule__ListLiteral__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3353:1: rule__ListLiteral__Group_1_1__0 : rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1 ;
    public final void rule__ListLiteral__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3357:1: ( rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3358:2: rule__ListLiteral__Group_1_1__0__Impl rule__ListLiteral__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__0__Impl_in_rule__ListLiteral__Group_1_1__06840);
            rule__ListLiteral__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__1_in_rule__ListLiteral__Group_1_1__06843);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3365:1: rule__ListLiteral__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ListLiteral__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3369:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3370:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3370:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3371:1: ','
            {
             before(grammarAccess.getListLiteralAccess().getCommaKeyword_1_1_0()); 
            match(input,33,FOLLOW_33_in_rule__ListLiteral__Group_1_1__0__Impl6871); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3384:1: rule__ListLiteral__Group_1_1__1 : rule__ListLiteral__Group_1_1__1__Impl ;
    public final void rule__ListLiteral__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3388:1: ( rule__ListLiteral__Group_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3389:2: rule__ListLiteral__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListLiteral__Group_1_1__1__Impl_in_rule__ListLiteral__Group_1_1__16902);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3395:1: rule__ListLiteral__Group_1_1__1__Impl : ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) ) ;
    public final void rule__ListLiteral__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3399:1: ( ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3400:1: ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3400:1: ( ( rule__ListLiteral__ItemsAssignment_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3401:1: ( rule__ListLiteral__ItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getListLiteralAccess().getItemsAssignment_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3402:1: ( rule__ListLiteral__ItemsAssignment_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3402:2: rule__ListLiteral__ItemsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ListLiteral__ItemsAssignment_1_1_1_in_rule__ListLiteral__Group_1_1__1__Impl6929);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3416:1: rule__VarRefLiteral__Group__0 : rule__VarRefLiteral__Group__0__Impl rule__VarRefLiteral__Group__1 ;
    public final void rule__VarRefLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3420:1: ( rule__VarRefLiteral__Group__0__Impl rule__VarRefLiteral__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3421:2: rule__VarRefLiteral__Group__0__Impl rule__VarRefLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__VarRefLiteral__Group__0__Impl_in_rule__VarRefLiteral__Group__06963);
            rule__VarRefLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarRefLiteral__Group__1_in_rule__VarRefLiteral__Group__06966);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3428:1: rule__VarRefLiteral__Group__0__Impl : ( '$' ) ;
    public final void rule__VarRefLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3432:1: ( ( '$' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3433:1: ( '$' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3433:1: ( '$' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3434:1: '$'
            {
             before(grammarAccess.getVarRefLiteralAccess().getDollarSignKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__VarRefLiteral__Group__0__Impl6994); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3447:1: rule__VarRefLiteral__Group__1 : rule__VarRefLiteral__Group__1__Impl ;
    public final void rule__VarRefLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3451:1: ( rule__VarRefLiteral__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3452:2: rule__VarRefLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarRefLiteral__Group__1__Impl_in_rule__VarRefLiteral__Group__17025);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3458:1: rule__VarRefLiteral__Group__1__Impl : ( ( rule__VarRefLiteral__VarRefAssignment_1 ) ) ;
    public final void rule__VarRefLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3462:1: ( ( ( rule__VarRefLiteral__VarRefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3463:1: ( ( rule__VarRefLiteral__VarRefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3463:1: ( ( rule__VarRefLiteral__VarRefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3464:1: ( rule__VarRefLiteral__VarRefAssignment_1 )
            {
             before(grammarAccess.getVarRefLiteralAccess().getVarRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3465:1: ( rule__VarRefLiteral__VarRefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3465:2: rule__VarRefLiteral__VarRefAssignment_1
            {
            pushFollow(FOLLOW_rule__VarRefLiteral__VarRefAssignment_1_in_rule__VarRefLiteral__Group__1__Impl7052);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3479:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3483:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3484:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
            {
            pushFollow(FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__07086);
            rule__Setter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__07089);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3491:1: rule__Setter__Group__0__Impl : ( ( rule__Setter__PropertyAssignment_0 ) ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3495:1: ( ( ( rule__Setter__PropertyAssignment_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3496:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3496:1: ( ( rule__Setter__PropertyAssignment_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3497:1: ( rule__Setter__PropertyAssignment_0 )
            {
             before(grammarAccess.getSetterAccess().getPropertyAssignment_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3498:1: ( rule__Setter__PropertyAssignment_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3498:2: rule__Setter__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl7116);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3508:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3512:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3513:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
            {
            pushFollow(FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__17146);
            rule__Setter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__17149);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3520:1: rule__Setter__Group__1__Impl : ( ( rule__Setter__Alternatives_1 ) ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3524:1: ( ( ( rule__Setter__Alternatives_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3525:1: ( ( rule__Setter__Alternatives_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3525:1: ( ( rule__Setter__Alternatives_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3526:1: ( rule__Setter__Alternatives_1 )
            {
             before(grammarAccess.getSetterAccess().getAlternatives_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3527:1: ( rule__Setter__Alternatives_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3527:2: rule__Setter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl7176);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3537:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3541:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3542:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
            {
            pushFollow(FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__27206);
            rule__Setter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__27209);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3549:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__ExpressionAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3553:1: ( ( ( rule__Setter__ExpressionAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3554:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3554:1: ( ( rule__Setter__ExpressionAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3555:1: ( rule__Setter__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getExpressionAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3556:1: ( rule__Setter__ExpressionAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3556:2: rule__Setter__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl7236);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3566:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3570:1: ( rule__Setter__Group__3__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3571:2: rule__Setter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__37266);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3577:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__GuardAssignment_3 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3581:1: ( ( ( rule__Setter__GuardAssignment_3 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3582:1: ( ( rule__Setter__GuardAssignment_3 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3582:1: ( ( rule__Setter__GuardAssignment_3 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3583:1: ( rule__Setter__GuardAssignment_3 )?
            {
             before(grammarAccess.getSetterAccess().getGuardAssignment_3()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3584:1: ( rule__Setter__GuardAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3584:2: rule__Setter__GuardAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl7293);
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


    // $ANTLR start rule__Expression__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3602:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3606:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3607:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__07332);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__07335);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3614:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3618:1: ( ( ruleTerminalExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3619:1: ( ruleTerminalExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3619:1: ( ruleTerminalExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3620:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl7362);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3631:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3635:1: ( rule__Expression__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3636:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__17391);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3642:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3646:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3647:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3647:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3648:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3649:1: ( rule__Expression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=12 && LA27_0<=14)||(LA27_0>=16 && LA27_0<=21)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3649:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl7418);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3663:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3667:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3668:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__07453);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__07456);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3675:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3679:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3680:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3680:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3681:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3682:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3684:1: 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3694:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3698:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3699:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__17514);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__17517);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3706:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3710:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3711:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3711:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3712:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3713:1: ( rule__Expression__OpAssignment_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3713:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl7544);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3723:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3727:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3728:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__27574);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3734:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3738:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3739:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3739:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3740:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3741:1: ( rule__Expression__RightAssignment_1_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3741:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl7601);
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


    // $ANTLR start rule__TerminalExpression__Group_0__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3757:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3761:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3762:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__07637);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__07640);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3769:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3773:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3774:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3774:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3775:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__TerminalExpression__Group_0__0__Impl7668); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3788:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3792:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3793:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__17699);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__17702);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3800:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3804:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3805:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3805:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3806:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl7729);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3817:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3821:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3822:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__27758);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3828:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3832:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3833:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3833:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3834:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_32_in_rule__TerminalExpression__Group_0__2__Impl7786); 
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


    // $ANTLR start rule__TerminalExpression__Group_6__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3853:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3857:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3858:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_6__0__Impl_in_rule__TerminalExpression__Group_6__07823);
            rule__TerminalExpression__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_6__1_in_rule__TerminalExpression__Group_6__07826);
            rule__TerminalExpression__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6__0


    // $ANTLR start rule__TerminalExpression__Group_6__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3865:1: rule__TerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3869:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3870:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3870:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3871:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_6_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3872:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3874:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_6__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3884:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3888:1: ( rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3889:2: rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_6__1__Impl_in_rule__TerminalExpression__Group_6__17884);
            rule__TerminalExpression__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_6__2_in_rule__TerminalExpression__Group_6__17887);
            rule__TerminalExpression__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6__1


    // $ANTLR start rule__TerminalExpression__Group_6__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3896:1: rule__TerminalExpression__Group_6__1__Impl : ( ( rule__TerminalExpression__FunctionAssignment_6_1 ) ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3900:1: ( ( ( rule__TerminalExpression__FunctionAssignment_6_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3901:1: ( ( rule__TerminalExpression__FunctionAssignment_6_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3901:1: ( ( rule__TerminalExpression__FunctionAssignment_6_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3902:1: ( rule__TerminalExpression__FunctionAssignment_6_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_6_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3903:1: ( rule__TerminalExpression__FunctionAssignment_6_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3903:2: rule__TerminalExpression__FunctionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__FunctionAssignment_6_1_in_rule__TerminalExpression__Group_6__1__Impl7914);
            rule__TerminalExpression__FunctionAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_6__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3913:1: rule__TerminalExpression__Group_6__2 : rule__TerminalExpression__Group_6__2__Impl ;
    public final void rule__TerminalExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3917:1: ( rule__TerminalExpression__Group_6__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3918:2: rule__TerminalExpression__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_6__2__Impl_in_rule__TerminalExpression__Group_6__27944);
            rule__TerminalExpression__Group_6__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6__2


    // $ANTLR start rule__TerminalExpression__Group_6__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3924:1: rule__TerminalExpression__Group_6__2__Impl : ( ( rule__TerminalExpression__Group_6_2__0 ) ) ;
    public final void rule__TerminalExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3928:1: ( ( ( rule__TerminalExpression__Group_6_2__0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3929:1: ( ( rule__TerminalExpression__Group_6_2__0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3929:1: ( ( rule__TerminalExpression__Group_6_2__0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3930:1: ( rule__TerminalExpression__Group_6_2__0 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getGroup_6_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3931:1: ( rule__TerminalExpression__Group_6_2__0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3931:2: rule__TerminalExpression__Group_6_2__0
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_6_2__0_in_rule__TerminalExpression__Group_6__2__Impl7971);
            rule__TerminalExpression__Group_6_2__0();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_6_2__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3947:1: rule__TerminalExpression__Group_6_2__0 : rule__TerminalExpression__Group_6_2__0__Impl rule__TerminalExpression__Group_6_2__1 ;
    public final void rule__TerminalExpression__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3951:1: ( rule__TerminalExpression__Group_6_2__0__Impl rule__TerminalExpression__Group_6_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3952:2: rule__TerminalExpression__Group_6_2__0__Impl rule__TerminalExpression__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_6_2__0__Impl_in_rule__TerminalExpression__Group_6_2__08007);
            rule__TerminalExpression__Group_6_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_6_2__1_in_rule__TerminalExpression__Group_6_2__08010);
            rule__TerminalExpression__Group_6_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6_2__0


    // $ANTLR start rule__TerminalExpression__Group_6_2__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3959:1: rule__TerminalExpression__Group_6_2__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3963:1: ( ( '(' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3964:1: ( '(' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3964:1: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3965:1: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_2_0()); 
            match(input,31,FOLLOW_31_in_rule__TerminalExpression__Group_6_2__0__Impl8038); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6_2__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_6_2__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3978:1: rule__TerminalExpression__Group_6_2__1 : rule__TerminalExpression__Group_6_2__1__Impl rule__TerminalExpression__Group_6_2__2 ;
    public final void rule__TerminalExpression__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3982:1: ( rule__TerminalExpression__Group_6_2__1__Impl rule__TerminalExpression__Group_6_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3983:2: rule__TerminalExpression__Group_6_2__1__Impl rule__TerminalExpression__Group_6_2__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_6_2__1__Impl_in_rule__TerminalExpression__Group_6_2__18069);
            rule__TerminalExpression__Group_6_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_6_2__2_in_rule__TerminalExpression__Group_6_2__18072);
            rule__TerminalExpression__Group_6_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6_2__1


    // $ANTLR start rule__TerminalExpression__Group_6_2__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3990:1: rule__TerminalExpression__Group_6_2__1__Impl : ( ( rule__TerminalExpression__ExpAssignment_6_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3994:1: ( ( ( rule__TerminalExpression__ExpAssignment_6_2_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3995:1: ( ( rule__TerminalExpression__ExpAssignment_6_2_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3995:1: ( ( rule__TerminalExpression__ExpAssignment_6_2_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3996:1: ( rule__TerminalExpression__ExpAssignment_6_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpAssignment_6_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3997:1: ( rule__TerminalExpression__ExpAssignment_6_2_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:3997:2: rule__TerminalExpression__ExpAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ExpAssignment_6_2_1_in_rule__TerminalExpression__Group_6_2__1__Impl8099);
            rule__TerminalExpression__ExpAssignment_6_2_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getExpAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6_2__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_6_2__2
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4007:1: rule__TerminalExpression__Group_6_2__2 : rule__TerminalExpression__Group_6_2__2__Impl ;
    public final void rule__TerminalExpression__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4011:1: ( rule__TerminalExpression__Group_6_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4012:2: rule__TerminalExpression__Group_6_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_6_2__2__Impl_in_rule__TerminalExpression__Group_6_2__28129);
            rule__TerminalExpression__Group_6_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6_2__2


    // $ANTLR start rule__TerminalExpression__Group_6_2__2__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4018:1: rule__TerminalExpression__Group_6_2__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4022:1: ( ( ')' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4023:1: ( ')' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4023:1: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4024:1: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2_2()); 
            match(input,32,FOLLOW_32_in_rule__TerminalExpression__Group_6_2__2__Impl8157); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_6_2__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_7__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4043:1: rule__TerminalExpression__Group_7__0 : rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 ;
    public final void rule__TerminalExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4047:1: ( rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4048:2: rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_7__0__Impl_in_rule__TerminalExpression__Group_7__08194);
            rule__TerminalExpression__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_7__1_in_rule__TerminalExpression__Group_7__08197);
            rule__TerminalExpression__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_7__0


    // $ANTLR start rule__TerminalExpression__Group_7__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4055:1: rule__TerminalExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4059:1: ( ( () ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4060:1: ( () )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4060:1: ( () )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4061:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_7_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4062:1: ()
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4064:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_7__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_7__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4074:1: rule__TerminalExpression__Group_7__1 : rule__TerminalExpression__Group_7__1__Impl ;
    public final void rule__TerminalExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4078:1: ( rule__TerminalExpression__Group_7__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4079:2: rule__TerminalExpression__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_7__1__Impl_in_rule__TerminalExpression__Group_7__18255);
            rule__TerminalExpression__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_7__1


    // $ANTLR start rule__TerminalExpression__Group_7__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4085:1: rule__TerminalExpression__Group_7__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_7_1 ) ) ;
    public final void rule__TerminalExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4089:1: ( ( ( rule__TerminalExpression__ValueAssignment_7_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4090:1: ( ( rule__TerminalExpression__ValueAssignment_7_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4090:1: ( ( rule__TerminalExpression__ValueAssignment_7_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4091:1: ( rule__TerminalExpression__ValueAssignment_7_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_7_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4092:1: ( rule__TerminalExpression__ValueAssignment_7_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4092:2: rule__TerminalExpression__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_7_1_in_rule__TerminalExpression__Group_7__1__Impl8282);
            rule__TerminalExpression__ValueAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_7__1__Impl


    // $ANTLR start rule__Function__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4106:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4110:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4111:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__08316);
            rule__Function__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__08319);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4118:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4122:1: ( ( 'function' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4123:1: ( 'function' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4123:1: ( 'function' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4124:1: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Function__Group__0__Impl8347); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4137:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4141:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4142:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__18378);
            rule__Function__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__18381);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4149:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4153:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4154:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4154:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4155:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4156:1: ( rule__Function__NameAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4156:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl8408);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4166:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4170:1: ( rule__Function__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4171:2: rule__Function__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__28438);
            rule__Function__Group__2__Impl();
            _fsp--;


            }

        }
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4177:1: rule__Function__Group__2__Impl : ( ( rule__Function__JavaClassAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4181:1: ( ( ( rule__Function__JavaClassAssignment_2 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4182:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4182:1: ( ( rule__Function__JavaClassAssignment_2 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4183:1: ( rule__Function__JavaClassAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getJavaClassAssignment_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4184:1: ( rule__Function__JavaClassAssignment_2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4184:2: rule__Function__JavaClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl8465);
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


    // $ANTLR start rule__UpdateStatement__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4200:1: rule__UpdateStatement__Group__0 : rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 ;
    public final void rule__UpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4204:1: ( rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4205:2: rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__08501);
            rule__UpdateStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__08504);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4212:1: rule__UpdateStatement__Group__0__Impl : ( 'update' ) ;
    public final void rule__UpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4216:1: ( ( 'update' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4217:1: ( 'update' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4217:1: ( 'update' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4218:1: 'update'
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__UpdateStatement__Group__0__Impl8532); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4231:1: rule__UpdateStatement__Group__1 : rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 ;
    public final void rule__UpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4235:1: ( rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4236:2: rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__18563);
            rule__UpdateStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__18566);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4243:1: rule__UpdateStatement__Group__1__Impl : ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) ;
    public final void rule__UpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4247:1: ( ( ( rule__UpdateStatement__VarRefAssignment_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4248:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4248:1: ( ( rule__UpdateStatement__VarRefAssignment_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4249:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefAssignment_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4250:1: ( rule__UpdateStatement__VarRefAssignment_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4250:2: rule__UpdateStatement__VarRefAssignment_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl8593);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4260:1: rule__UpdateStatement__Group__2 : rule__UpdateStatement__Group__2__Impl ;
    public final void rule__UpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4264:1: ( rule__UpdateStatement__Group__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4265:2: rule__UpdateStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__28623);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4271:1: rule__UpdateStatement__Group__2__Impl : ( ( rule__UpdateStatement__Group_2__0 )? ) ;
    public final void rule__UpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4275:1: ( ( ( rule__UpdateStatement__Group_2__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4276:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4276:1: ( ( rule__UpdateStatement__Group_2__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4277:1: ( rule__UpdateStatement__Group_2__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4278:1: ( rule__UpdateStatement__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4278:2: rule__UpdateStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl8650);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4294:1: rule__UpdateStatement__Group_2__0 : rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 ;
    public final void rule__UpdateStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4298:1: ( rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4299:2: rule__UpdateStatement__Group_2__0__Impl rule__UpdateStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__08687);
            rule__UpdateStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__08690);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4306:1: rule__UpdateStatement__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UpdateStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4310:1: ( ( '{' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4311:1: ( '{' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4311:1: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4312:1: '{'
            {
             before(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__UpdateStatement__Group_2__0__Impl8718); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4325:1: rule__UpdateStatement__Group_2__1 : rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 ;
    public final void rule__UpdateStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4329:1: ( rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4330:2: rule__UpdateStatement__Group_2__1__Impl rule__UpdateStatement__Group_2__2
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__18749);
            rule__UpdateStatement__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__18752);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4337:1: rule__UpdateStatement__Group_2__1__Impl : ( ( rule__UpdateStatement__Group_2_1__0 )? ) ;
    public final void rule__UpdateStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4341:1: ( ( ( rule__UpdateStatement__Group_2_1__0 )? ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4342:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4342:1: ( ( rule__UpdateStatement__Group_2_1__0 )? )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4343:1: ( rule__UpdateStatement__Group_2_1__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4344:1: ( rule__UpdateStatement__Group_2_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4344:2: rule__UpdateStatement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl8779);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4354:1: rule__UpdateStatement__Group_2__2 : rule__UpdateStatement__Group_2__2__Impl ;
    public final void rule__UpdateStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4358:1: ( rule__UpdateStatement__Group_2__2__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4359:2: rule__UpdateStatement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__28810);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4365:1: rule__UpdateStatement__Group_2__2__Impl : ( '}' ) ;
    public final void rule__UpdateStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4369:1: ( ( '}' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4370:1: ( '}' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4370:1: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4371:1: '}'
            {
             before(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,30,FOLLOW_30_in_rule__UpdateStatement__Group_2__2__Impl8838); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4390:1: rule__UpdateStatement__Group_2_1__0 : rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 ;
    public final void rule__UpdateStatement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4394:1: ( rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4395:2: rule__UpdateStatement__Group_2_1__0__Impl rule__UpdateStatement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__08875);
            rule__UpdateStatement__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__08878);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4402:1: rule__UpdateStatement__Group_2_1__0__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) ;
    public final void rule__UpdateStatement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4406:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4407:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4407:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4408:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4409:1: ( rule__UpdateStatement__SettersAssignment_2_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4409:2: rule__UpdateStatement__SettersAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl8905);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4419:1: rule__UpdateStatement__Group_2_1__1 : rule__UpdateStatement__Group_2_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4423:1: ( rule__UpdateStatement__Group_2_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4424:2: rule__UpdateStatement__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__18935);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4430:1: rule__UpdateStatement__Group_2_1__1__Impl : ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) ;
    public final void rule__UpdateStatement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4434:1: ( ( ( rule__UpdateStatement__Group_2_1_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4435:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4435:1: ( ( rule__UpdateStatement__Group_2_1_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4436:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_2_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4437:1: ( rule__UpdateStatement__Group_2_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4437:2: rule__UpdateStatement__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl8962);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4451:1: rule__UpdateStatement__Group_2_1_1__0 : rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 ;
    public final void rule__UpdateStatement__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4455:1: ( rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4456:2: rule__UpdateStatement__Group_2_1_1__0__Impl rule__UpdateStatement__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__08997);
            rule__UpdateStatement__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__09000);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4463:1: rule__UpdateStatement__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__UpdateStatement__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4467:1: ( ( ',' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4468:1: ( ',' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4468:1: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4469:1: ','
            {
             before(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0()); 
            match(input,33,FOLLOW_33_in_rule__UpdateStatement__Group_2_1_1__0__Impl9028); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4482:1: rule__UpdateStatement__Group_2_1_1__1 : rule__UpdateStatement__Group_2_1_1__1__Impl ;
    public final void rule__UpdateStatement__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4486:1: ( rule__UpdateStatement__Group_2_1_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4487:2: rule__UpdateStatement__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__19059);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4493:1: rule__UpdateStatement__Group_2_1_1__1__Impl : ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) ;
    public final void rule__UpdateStatement__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4497:1: ( ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4498:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4498:1: ( ( rule__UpdateStatement__SettersAssignment_2_1_1_1 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4499:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersAssignment_2_1_1_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4500:1: ( rule__UpdateStatement__SettersAssignment_2_1_1_1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4500:2: rule__UpdateStatement__SettersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl9086);
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


    // $ANTLR start rule__ClassFqn__Group__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4514:1: rule__ClassFqn__Group__0 : rule__ClassFqn__Group__0__Impl rule__ClassFqn__Group__1 ;
    public final void rule__ClassFqn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4518:1: ( rule__ClassFqn__Group__0__Impl rule__ClassFqn__Group__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4519:2: rule__ClassFqn__Group__0__Impl rule__ClassFqn__Group__1
            {
            pushFollow(FOLLOW_rule__ClassFqn__Group__0__Impl_in_rule__ClassFqn__Group__09120);
            rule__ClassFqn__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ClassFqn__Group__1_in_rule__ClassFqn__Group__09123);
            rule__ClassFqn__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassFqn__Group__0


    // $ANTLR start rule__ClassFqn__Group__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4526:1: rule__ClassFqn__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ClassFqn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4530:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4531:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4531:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4532:1: RULE_ID
            {
             before(grammarAccess.getClassFqnAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassFqn__Group__0__Impl9150); 
             after(grammarAccess.getClassFqnAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassFqn__Group__0__Impl


    // $ANTLR start rule__ClassFqn__Group__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4543:1: rule__ClassFqn__Group__1 : rule__ClassFqn__Group__1__Impl ;
    public final void rule__ClassFqn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4547:1: ( rule__ClassFqn__Group__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4548:2: rule__ClassFqn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassFqn__Group__1__Impl_in_rule__ClassFqn__Group__19179);
            rule__ClassFqn__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassFqn__Group__1


    // $ANTLR start rule__ClassFqn__Group__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4554:1: rule__ClassFqn__Group__1__Impl : ( ( rule__ClassFqn__Group_1__0 )* ) ;
    public final void rule__ClassFqn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4558:1: ( ( ( rule__ClassFqn__Group_1__0 )* ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4559:1: ( ( rule__ClassFqn__Group_1__0 )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4559:1: ( ( rule__ClassFqn__Group_1__0 )* )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4560:1: ( rule__ClassFqn__Group_1__0 )*
            {
             before(grammarAccess.getClassFqnAccess().getGroup_1()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4561:1: ( rule__ClassFqn__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4561:2: rule__ClassFqn__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClassFqn__Group_1__0_in_rule__ClassFqn__Group__1__Impl9206);
            	    rule__ClassFqn__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getClassFqnAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassFqn__Group__1__Impl


    // $ANTLR start rule__ClassFqn__Group_1__0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4575:1: rule__ClassFqn__Group_1__0 : rule__ClassFqn__Group_1__0__Impl rule__ClassFqn__Group_1__1 ;
    public final void rule__ClassFqn__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4579:1: ( rule__ClassFqn__Group_1__0__Impl rule__ClassFqn__Group_1__1 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4580:2: rule__ClassFqn__Group_1__0__Impl rule__ClassFqn__Group_1__1
            {
            pushFollow(FOLLOW_rule__ClassFqn__Group_1__0__Impl_in_rule__ClassFqn__Group_1__09241);
            rule__ClassFqn__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ClassFqn__Group_1__1_in_rule__ClassFqn__Group_1__09244);
            rule__ClassFqn__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassFqn__Group_1__0


    // $ANTLR start rule__ClassFqn__Group_1__0__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4587:1: rule__ClassFqn__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ClassFqn__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4591:1: ( ( '.' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4592:1: ( '.' )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4592:1: ( '.' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4593:1: '.'
            {
             before(grammarAccess.getClassFqnAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__ClassFqn__Group_1__0__Impl9272); 
             after(grammarAccess.getClassFqnAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassFqn__Group_1__0__Impl


    // $ANTLR start rule__ClassFqn__Group_1__1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4606:1: rule__ClassFqn__Group_1__1 : rule__ClassFqn__Group_1__1__Impl ;
    public final void rule__ClassFqn__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4610:1: ( rule__ClassFqn__Group_1__1__Impl )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4611:2: rule__ClassFqn__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassFqn__Group_1__1__Impl_in_rule__ClassFqn__Group_1__19303);
            rule__ClassFqn__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassFqn__Group_1__1


    // $ANTLR start rule__ClassFqn__Group_1__1__Impl
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4617:1: rule__ClassFqn__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ClassFqn__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4621:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4622:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4622:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4623:1: RULE_ID
            {
             before(grammarAccess.getClassFqnAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassFqn__Group_1__1__Impl9330); 
             after(grammarAccess.getClassFqnAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassFqn__Group_1__1__Impl


    // $ANTLR start rule__Scaffolding__ScaffoldAssignment_0
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4639:1: rule__Scaffolding__ScaffoldAssignment_0 : ( ruleScaffold ) ;
    public final void rule__Scaffolding__ScaffoldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4643:1: ( ( ruleScaffold ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4644:1: ( ruleScaffold )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4644:1: ( ruleScaffold )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4645:1: ruleScaffold
            {
             before(grammarAccess.getScaffoldingAccess().getScaffoldScaffoldParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_09368);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4654:1: rule__Scaffolding__ElementsAssignment_1 : ( ruleScaffoldingElement ) ;
    public final void rule__Scaffolding__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4658:1: ( ( ruleScaffoldingElement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4659:1: ( ruleScaffoldingElement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4659:1: ( ruleScaffoldingElement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4660:1: ruleScaffoldingElement
            {
             before(grammarAccess.getScaffoldingAccess().getElementsScaffoldingElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_19399);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4669:1: rule__Scaffold__RefPackageAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Scaffold__RefPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4673:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4674:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4674:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4675:1: RULE_STRING
            {
             before(grammarAccess.getScaffoldAccess().getRefPackageSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_19430); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4684:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4688:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4689:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4689:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4690:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_19461); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4699:1: rule__Rule__WhenAssignment_2 : ( ruleWhenBlock ) ;
    public final void rule__Rule__WhenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4703:1: ( ( ruleWhenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4704:1: ( ruleWhenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4704:1: ( ruleWhenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4705:1: ruleWhenBlock
            {
             before(grammarAccess.getRuleAccess().getWhenWhenBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_29492);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4714:1: rule__Rule__ThenAssignment_3 : ( ruleThenBlock ) ;
    public final void rule__Rule__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4718:1: ( ( ruleThenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4719:1: ( ruleThenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4719:1: ( ruleThenBlock )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4720:1: ruleThenBlock
            {
             before(grammarAccess.getRuleAccess().getThenThenBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_39523);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4729:1: rule__WhenBlock__MatchesAssignment_1_0_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4733:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4734:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4734:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4735:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_0_19554);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4744:1: rule__WhenBlock__MatchesAssignment_1_1 : ( ruleMatch ) ;
    public final void rule__WhenBlock__MatchesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4748:1: ( ( ruleMatch ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4749:1: ( ruleMatch )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4749:1: ( ruleMatch )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4750:1: ruleMatch
            {
             before(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_19585);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4759:1: rule__Match__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__Match__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4763:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4764:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4764:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4765:1: ruleVariable
            {
             before(grammarAccess.getMatchAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_09616);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4774:1: rule__Match__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Match__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4778:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4779:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4779:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4780:1: ( RULE_ID )
            {
             before(grammarAccess.getMatchAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4781:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4782:1: RULE_ID
            {
             before(grammarAccess.getMatchAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_19651); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4793:1: rule__Match__ParamsAssignment_2_1_0 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4797:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4798:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4798:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4799:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_09686);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4808:1: rule__Match__ParamsAssignment_2_1_1_1 : ( ruleParam ) ;
    public final void rule__Match__ParamsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4812:1: ( ( ruleParam ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4813:1: ( ruleParam )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4813:1: ( ruleParam )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4814:1: ruleParam
            {
             before(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_19717);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4823:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4827:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4828:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4828:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4829:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment9748); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4838:1: rule__Param__PropertyAssignment_0 : ( ruleBindingExpression ) ;
    public final void rule__Param__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4842:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4843:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4843:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4844:1: ruleBindingExpression
            {
             before(grammarAccess.getParamAccess().getPropertyBindingExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__Param__PropertyAssignment_09779);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4853:1: rule__Param__VarAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__Param__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4857:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4858:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4858:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4859:1: ruleVariable
            {
             before(grammarAccess.getParamAccess().getVarVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_19810);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4868:1: rule__BindingExpression__OpAssignment_1_1 : ( ( rule__BindingExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__BindingExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4872:1: ( ( ( rule__BindingExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4873:1: ( ( rule__BindingExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4873:1: ( ( rule__BindingExpression__OpAlternatives_1_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4874:1: ( rule__BindingExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getBindingExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4875:1: ( rule__BindingExpression__OpAlternatives_1_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4875:2: rule__BindingExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__BindingExpression__OpAlternatives_1_1_0_in_rule__BindingExpression__OpAssignment_1_19841);
            rule__BindingExpression__OpAlternatives_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getBindingExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4884:1: rule__BindingExpression__RightAssignment_1_2 : ( ruleBindingExpression ) ;
    public final void rule__BindingExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4888:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4889:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4889:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4890:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingExpressionAccess().getRightBindingExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingExpression__RightAssignment_1_29874);
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


    // $ANTLR start rule__BindingTerminalExpression__FunctionAssignment_5_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4899:1: rule__BindingTerminalExpression__FunctionAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__BindingTerminalExpression__FunctionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4903:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4904:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4904:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4905:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionCrossReference_5_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4906:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4907:1: RULE_ID
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BindingTerminalExpression__FunctionAssignment_5_19909); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__FunctionAssignment_5_1


    // $ANTLR start rule__BindingTerminalExpression__ExpAssignment_5_2_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4918:1: rule__BindingTerminalExpression__ExpAssignment_5_2_1 : ( ruleBindingExpression ) ;
    public final void rule__BindingTerminalExpression__ExpAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4922:1: ( ( ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4923:1: ( ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4923:1: ( ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4924:1: ruleBindingExpression
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingExpressionParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ExpAssignment_5_2_19944);
            ruleBindingExpression();
            _fsp--;

             after(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingExpressionParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__ExpAssignment_5_2_1


    // $ANTLR start rule__BindingTerminalExpression__ValueAssignment_6_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4933:1: rule__BindingTerminalExpression__ValueAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__BindingTerminalExpression__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4937:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4938:1: ( RULE_INT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4938:1: ( RULE_INT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4939:1: RULE_INT
            {
             before(grammarAccess.getBindingTerminalExpressionAccess().getValueINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__BindingTerminalExpression__ValueAssignment_6_19975); 
             after(grammarAccess.getBindingTerminalExpressionAccess().getValueINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BindingTerminalExpression__ValueAssignment_6_1


    // $ANTLR start rule__FeatureRefLiteral__RefAssignment
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4948:1: rule__FeatureRefLiteral__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FeatureRefLiteral__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4952:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4953:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4953:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4954:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureRefLiteralAccess().getRefEStructuralFeatureCrossReference_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4955:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4956:1: RULE_ID
            {
             before(grammarAccess.getFeatureRefLiteralAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureRefLiteral__RefAssignment10010); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4967:1: rule__ThenBlock__StatementsAssignment_1_0_1 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4971:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4972:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4972:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4973:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_0_110045);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4982:1: rule__ThenBlock__StatementsAssignment_1_1 : ( ruleStatement ) ;
    public final void rule__ThenBlock__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4986:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4987:1: ( ruleStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4987:1: ( ruleStatement )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4988:1: ruleStatement
            {
             before(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_110076);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:4997:1: rule__CreateStatement__VarAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__CreateStatement__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5001:1: ( ( ruleVariable ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5002:1: ( ruleVariable )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5002:1: ( ruleVariable )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5003:1: ruleVariable
            {
             before(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_010107);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5012:1: rule__CreateStatement__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__CreateStatement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5016:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5017:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5017:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5018:1: ruleExpression
            {
             before(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_110138);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5027:1: rule__CreateClass__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CreateClass__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5031:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5032:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5032:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5033:1: ( RULE_ID )
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5034:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5035:1: RULE_ID
            {
             before(grammarAccess.getCreateClassAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_110173); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5046:1: rule__CreateClass__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5050:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5051:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5051:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5052:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_010208);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5061:1: rule__CreateClass__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__CreateClass__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5065:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5066:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5066:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5067:1: ruleSetter
            {
             before(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_110239);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5076:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5080:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5081:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5081:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5082:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10270); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5091:1: rule__ListLiteral__ItemsAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5095:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5096:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5096:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5097:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_010301);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5106:1: rule__ListLiteral__ItemsAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__ListLiteral__ItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5110:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5111:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5111:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5112:1: ruleExpression
            {
             before(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_1_110332);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5121:1: rule__VarRefLiteral__VarRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarRefLiteral__VarRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5125:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5126:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5126:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5127:1: ( RULE_ID )
            {
             before(grammarAccess.getVarRefLiteralAccess().getVarRefVariableCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5128:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5129:1: RULE_ID
            {
             before(grammarAccess.getVarRefLiteralAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarRefLiteral__VarRefAssignment_110367); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5140:1: rule__Setter__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Setter__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5144:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5145:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5145:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5146:1: ( RULE_ID )
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5147:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5148:1: RULE_ID
            {
             before(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_010406); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5159:1: rule__Setter__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Setter__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5163:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5164:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5164:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5165:1: ruleExpression
            {
             before(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_210441);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5174:1: rule__Setter__GuardAssignment_3 : ( ( 'guard' ) ) ;
    public final void rule__Setter__GuardAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5178:1: ( ( ( 'guard' ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5179:1: ( ( 'guard' ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5179:1: ( ( 'guard' ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5180:1: ( 'guard' )
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5181:1: ( 'guard' )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5182:1: 'guard'
            {
             before(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0()); 
            match(input,41,FOLLOW_41_in_rule__Setter__GuardAssignment_310477); 
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


    // $ANTLR start rule__Expression__OpAssignment_1_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5197:1: rule__Expression__OpAssignment_1_1 : ( ( rule__Expression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5201:1: ( ( ( rule__Expression__OpAlternatives_1_1_0 ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5202:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5202:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5203:1: ( rule__Expression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5204:1: ( rule__Expression__OpAlternatives_1_1_0 )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5204:2: rule__Expression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_110516);
            rule__Expression__OpAlternatives_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5213:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5217:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5218:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5218:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5219:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_210549);
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


    // $ANTLR start rule__TerminalExpression__FunctionAssignment_6_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5228:1: rule__TerminalExpression__FunctionAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__FunctionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5232:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5233:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5233:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5234:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_6_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5235:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5236:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_6_110584); 
             after(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__FunctionAssignment_6_1


    // $ANTLR start rule__TerminalExpression__ExpAssignment_6_2_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5247:1: rule__TerminalExpression__ExpAssignment_6_2_1 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ExpAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5251:1: ( ( ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5252:1: ( ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5252:1: ( ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5253:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpExpressionParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__ExpAssignment_6_2_110619);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpExpressionParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ExpAssignment_6_2_1


    // $ANTLR start rule__TerminalExpression__ValueAssignment_7_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5262:1: rule__TerminalExpression__ValueAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5266:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5267:1: ( RULE_INT )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5267:1: ( RULE_INT )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5268:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_7_110650); 
             after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ValueAssignment_7_1


    // $ANTLR start rule__Function__NameAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5277:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5281:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5282:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5282:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5283:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_110681); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5292:1: rule__Function__JavaClassAssignment_2 : ( ruleClassFqn ) ;
    public final void rule__Function__JavaClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5296:1: ( ( ruleClassFqn ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5297:1: ( ruleClassFqn )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5297:1: ( ruleClassFqn )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5298:1: ruleClassFqn
            {
             before(grammarAccess.getFunctionAccess().getJavaClassClassFqnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClassFqn_in_rule__Function__JavaClassAssignment_210712);
            ruleClassFqn();
            _fsp--;

             after(grammarAccess.getFunctionAccess().getJavaClassClassFqnParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start rule__UpdateStatement__VarRefAssignment_1
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5307:1: rule__UpdateStatement__VarRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UpdateStatement__VarRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5311:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5312:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5312:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5313:1: ( RULE_ID )
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0()); 
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5314:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5315:1: RULE_ID
            {
             before(grammarAccess.getUpdateStatementAccess().getVarRefVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_110747); 
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5326:1: rule__UpdateStatement__SettersAssignment_2_1_0 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5330:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5331:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5331:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5332:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_010782);
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
    // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5341:1: rule__UpdateStatement__SettersAssignment_2_1_1_1 : ( ruleSetter ) ;
    public final void rule__UpdateStatement__SettersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5345:1: ( ( ruleSetter ) )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5346:1: ( ruleSetter )
            {
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5346:1: ( ruleSetter )
            // ../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g:5347:1: ruleSetter
            {
             before(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_110813);
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
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_entryRuleBindingTerminalExpression603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingTerminalExpression610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Alternatives_in_ruleBindingTerminalExpression636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRefLiteral670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRefLiteral__RefAssignment_in_ruleFeatureRefLiteral696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_entryRuleThenBlock723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenBlock730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0_in_ruleThenBlock756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateStatement850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0_in_ruleCreateStatement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_entryRuleCreateClass903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateClass910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0_in_ruleCreateClass936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNullLiteral1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0_in_ruleListLiteral1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRefLiteral1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__Group__0_in_ruleVarRefLiteral1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_entryRuleSetter1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetter1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0_in_ruleSetter1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0_in_ruleUpdateStatement1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassFqn_in_entryRuleClassFqn1505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassFqn1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassFqn__Group__0_in_ruleClassFqn1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__ScaffoldingElement__Alternatives1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__ScaffoldingElement__Alternatives1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__0_in_rule__WhenBlock__Alternatives_11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_1_1_in_rule__WhenBlock__Alternatives_11641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BindingExpression__OpAlternatives_1_1_01676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BindingExpression__OpAlternatives_1_1_01696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BindingExpression__OpAlternatives_1_1_01716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BindingExpression__OpAlternatives_1_1_01736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BindingExpression__OpAlternatives_1_1_01756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BindingExpression__OpAlternatives_1_1_01776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BindingExpression__OpAlternatives_1_1_01796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BindingExpression__OpAlternatives_1_1_01816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BindingExpression__OpAlternatives_1_1_01836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BindingExpression__OpAlternatives_1_1_01856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__0_in_rule__BindingTerminalExpression__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__BindingTerminalExpression__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__BindingTerminalExpression__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__BindingTerminalExpression__Alternatives1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_rule__BindingTerminalExpression__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5__0_in_rule__BindingTerminalExpression__Alternatives1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_6__0_in_rule__BindingTerminalExpression__Alternatives1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ThenBlock__Alternatives_02028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ThenBlock__Alternatives_02048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__0_in_rule__ThenBlock__Alternatives_12082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_1_1_in_rule__ThenBlock__Alternatives_12100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_rule__Statement__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_rule__Statement__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Setter__Alternatives_12183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Setter__Alternatives_12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Expression__OpAlternatives_1_1_02238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Expression__OpAlternatives_1_1_02258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Expression__OpAlternatives_1_1_02278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Expression__OpAlternatives_1_1_02298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Expression__OpAlternatives_1_1_02318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Expression__OpAlternatives_1_1_02338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Expression__OpAlternatives_1_1_02358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Expression__OpAlternatives_1_1_02378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Expression__OpAlternatives_1_1_02398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_rule__TerminalExpression__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rule__TerminalExpression__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_rule__TerminalExpression__Alternatives2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__TerminalExpression__Alternatives2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__TerminalExpression__Alternatives2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6__0_in_rule__TerminalExpression__Alternatives2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_7__0_in_rule__TerminalExpression__Alternatives2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__0__Impl_in_rule__Scaffolding__Group__02584 = new BitSet(new long[]{0x0000004008000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1_in_rule__Scaffolding__Group__02587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ScaffoldAssignment_0_in_rule__Scaffolding__Group__0__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__Group__1__Impl_in_rule__Scaffolding__Group__12644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffolding__ElementsAssignment_1_in_rule__Scaffolding__Group__1__Impl2671 = new BitSet(new long[]{0x0000004008000002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__0__Impl_in_rule__Scaffold__Group__02706 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1_in_rule__Scaffold__Group__02709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Scaffold__Group__0__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__Group__1__Impl_in_rule__Scaffold__Group__12768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scaffold__RefPackageAssignment_1_in_rule__Scaffold__Group__1__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rule__Group__0__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12891 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22951 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__WhenAssignment_2_in_rule__Rule__Group__2__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ThenAssignment_3_in_rule__Rule__Group__3__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__0__Impl_in_rule__WhenBlock__Group__03076 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1_in_rule__WhenBlock__Group__03079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__WhenBlock__Group__0__Impl3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group__1__Impl_in_rule__WhenBlock__Group__13138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Alternatives_1_in_rule__WhenBlock__Group__1__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__0__Impl_in_rule__WhenBlock__Group_1_0__03199 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__1_in_rule__WhenBlock__Group_1_0__03202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__WhenBlock__Group_1_0__0__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__1__Impl_in_rule__WhenBlock__Group_1_0__13261 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__2_in_rule__WhenBlock__Group_1_0__13264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenBlock__MatchesAssignment_1_0_1_in_rule__WhenBlock__Group_1_0__1__Impl3291 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__WhenBlock__Group_1_0__2__Impl_in_rule__WhenBlock__Group_1_0__23322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__WhenBlock__Group_1_0__2__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__03387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Match__Group__1_in_rule__Match__Group__03390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0_in_rule__Match__Group__0__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__13448 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2_in_rule__Match__Group__13451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__TypeAssignment_1_in_rule__Match__Group__1__Impl3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__23508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__0__Impl_in_rule__Match__Group_0__03572 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1_in_rule__Match__Group_0__03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__VarAssignment_0_0_in_rule__Match__Group_0__0__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_0__1__Impl_in_rule__Match__Group_0__13632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Match__Group_0__1__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__03695 = new BitSet(new long[]{0x0000000980000870L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__03698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Match__Group_2__0__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__13757 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2_in_rule__Match__Group_2__13760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0_in_rule__Match__Group_2__1__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2__2__Impl_in_rule__Match__Group_2__23818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Match__Group_2__2__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__0__Impl_in_rule__Match__Group_2_1__03883 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1_in_rule__Match__Group_2_1__03886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_0_in_rule__Match__Group_2_1__0__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1__1__Impl_in_rule__Match__Group_2_1__13943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0_in_rule__Match__Group_2_1__1__Impl3970 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__0__Impl_in_rule__Match__Group_2_1_1__04005 = new BitSet(new long[]{0x0000000880000870L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1_in_rule__Match__Group_2_1_1__04008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Match__Group_2_1_1__0__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__Group_2_1_1__1__Impl_in_rule__Match__Group_2_1_1__14067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__ParamsAssignment_2_1_1_1_in_rule__Match__Group_2_1_1__1__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__04128 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__04131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__PropertyAssignment_0_in_rule__Param__Group__0__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0_in_rule__Param__Group__1__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__0__Impl_in_rule__Param__Group_1__04250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1_in_rule__Param__Group_1__04253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Param__Group_1__0__Impl4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group_1__1__Impl_in_rule__Param__Group_1__14312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__VarAssignment_1_1_in_rule__Param__Group_1__1__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__0__Impl_in_rule__BindingExpression__Group__04373 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__1_in_rule__BindingExpression__Group__04376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_rule__BindingExpression__Group__0__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group__1__Impl_in_rule__BindingExpression__Group__14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__0_in_rule__BindingExpression__Group__1__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__0__Impl_in_rule__BindingExpression__Group_1__04494 = new BitSet(new long[]{0x00000000003FF000L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__1_in_rule__BindingExpression__Group_1__04497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__1__Impl_in_rule__BindingExpression__Group_1__14555 = new BitSet(new long[]{0x0000000880000870L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__2_in_rule__BindingExpression__Group_1__14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__OpAssignment_1_1_in_rule__BindingExpression__Group_1__1__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__Group_1__2__Impl_in_rule__BindingExpression__Group_1__24615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__RightAssignment_1_2_in_rule__BindingExpression__Group_1__2__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__0__Impl_in_rule__BindingTerminalExpression__Group_0__04678 = new BitSet(new long[]{0x0000000880000870L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__1_in_rule__BindingTerminalExpression__Group_0__04681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BindingTerminalExpression__Group_0__0__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__1__Impl_in_rule__BindingTerminalExpression__Group_0__14740 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__2_in_rule__BindingTerminalExpression__Group_0__14743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__Group_0__1__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_0__2__Impl_in_rule__BindingTerminalExpression__Group_0__24799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BindingTerminalExpression__Group_0__2__Impl4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5__0__Impl_in_rule__BindingTerminalExpression__Group_5__04864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5__1_in_rule__BindingTerminalExpression__Group_5__04867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5__1__Impl_in_rule__BindingTerminalExpression__Group_5__14925 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5__2_in_rule__BindingTerminalExpression__Group_5__14928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__FunctionAssignment_5_1_in_rule__BindingTerminalExpression__Group_5__1__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5__2__Impl_in_rule__BindingTerminalExpression__Group_5__24985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5_2__0_in_rule__BindingTerminalExpression__Group_5__2__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5_2__0__Impl_in_rule__BindingTerminalExpression__Group_5_2__05048 = new BitSet(new long[]{0x0000000880000870L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5_2__1_in_rule__BindingTerminalExpression__Group_5_2__05051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BindingTerminalExpression__Group_5_2__0__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5_2__1__Impl_in_rule__BindingTerminalExpression__Group_5_2__15110 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5_2__2_in_rule__BindingTerminalExpression__Group_5_2__15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ExpAssignment_5_2_1_in_rule__BindingTerminalExpression__Group_5_2__1__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_5_2__2__Impl_in_rule__BindingTerminalExpression__Group_5_2__25170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BindingTerminalExpression__Group_5_2__2__Impl5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_6__0__Impl_in_rule__BindingTerminalExpression__Group_6__05235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_6__1_in_rule__BindingTerminalExpression__Group_6__05238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__Group_6__1__Impl_in_rule__BindingTerminalExpression__Group_6__15296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingTerminalExpression__ValueAssignment_6_1_in_rule__BindingTerminalExpression__Group_6__1__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__0__Impl_in_rule__ThenBlock__Group__05357 = new BitSet(new long[]{0x000000ACA0000870L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1_in_rule__ThenBlock__Group__05360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_0_in_rule__ThenBlock__Group__0__Impl5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group__1__Impl_in_rule__ThenBlock__Group__15417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Alternatives_1_in_rule__ThenBlock__Group__1__Impl5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__0__Impl_in_rule__ThenBlock__Group_1_0__05478 = new BitSet(new long[]{0x000000ACC0000870L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__1_in_rule__ThenBlock__Group_1_0__05481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ThenBlock__Group_1_0__0__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__1__Impl_in_rule__ThenBlock__Group_1_0__15540 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__2_in_rule__ThenBlock__Group_1_0__15543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenBlock__StatementsAssignment_1_0_1_in_rule__ThenBlock__Group_1_0__1__Impl5570 = new BitSet(new long[]{0x000000AC80000872L});
    public static final BitSet FOLLOW_rule__ThenBlock__Group_1_0__2__Impl_in_rule__ThenBlock__Group_1_0__25601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ThenBlock__Group_1_0__2__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__0__Impl_in_rule__CreateStatement__Group__05666 = new BitSet(new long[]{0x0000002C80000870L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1_in_rule__CreateStatement__Group__05669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0_in_rule__CreateStatement__Group__0__Impl5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group__1__Impl_in_rule__CreateStatement__Group__15727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__ExpressionAssignment_1_in_rule__CreateStatement__Group__1__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__0__Impl_in_rule__CreateStatement__Group_0__05788 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1_in_rule__CreateStatement__Group_0__05791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__VarAssignment_0_0_in_rule__CreateStatement__Group_0__0__Impl5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateStatement__Group_0__1__Impl_in_rule__CreateStatement__Group_0__15848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CreateStatement__Group_0__1__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__0__Impl_in_rule__CreateClass__Group__05911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1_in_rule__CreateClass__Group__05914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CreateClass__Group__0__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__1__Impl_in_rule__CreateClass__Group__15973 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2_in_rule__CreateClass__Group__15976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__TypeAssignment_1_in_rule__CreateClass__Group__1__Impl6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group__2__Impl_in_rule__CreateClass__Group__26033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0_in_rule__CreateClass__Group__2__Impl6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__0__Impl_in_rule__CreateClass__Group_2__06097 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1_in_rule__CreateClass__Group_2__06100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CreateClass__Group_2__0__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__1__Impl_in_rule__CreateClass__Group_2__16159 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2_in_rule__CreateClass__Group_2__16162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0_in_rule__CreateClass__Group_2__1__Impl6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2__2__Impl_in_rule__CreateClass__Group_2__26220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CreateClass__Group_2__2__Impl6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__0__Impl_in_rule__CreateClass__Group_2_1__06285 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1_in_rule__CreateClass__Group_2_1__06288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_0_in_rule__CreateClass__Group_2_1__0__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1__1__Impl_in_rule__CreateClass__Group_2_1__16345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0_in_rule__CreateClass__Group_2_1__1__Impl6372 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__0__Impl_in_rule__CreateClass__Group_2_1_1__06407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1_in_rule__CreateClass__Group_2_1_1__06410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CreateClass__Group_2_1_1__0__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__Group_2_1_1__1__Impl_in_rule__CreateClass__Group_2_1_1__16469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CreateClass__SettersAssignment_2_1_1_1_in_rule__CreateClass__Group_2_1_1__1__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__0__Impl_in_rule__ListLiteral__Group__06530 = new BitSet(new long[]{0x0000003C80000870L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1_in_rule__ListLiteral__Group__06533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ListLiteral__Group__0__Impl6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__1__Impl_in_rule__ListLiteral__Group__16592 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2_in_rule__ListLiteral__Group__16595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__0_in_rule__ListLiteral__Group__1__Impl6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group__2__Impl_in_rule__ListLiteral__Group__26653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ListLiteral__Group__2__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__0__Impl_in_rule__ListLiteral__Group_1__06718 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__1_in_rule__ListLiteral__Group_1__06721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_1_0_in_rule__ListLiteral__Group_1__0__Impl6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1__1__Impl_in_rule__ListLiteral__Group_1__16778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__0_in_rule__ListLiteral__Group_1__1__Impl6805 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__0__Impl_in_rule__ListLiteral__Group_1_1__06840 = new BitSet(new long[]{0x0000002C80000870L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__1_in_rule__ListLiteral__Group_1_1__06843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ListLiteral__Group_1_1__0__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__Group_1_1__1__Impl_in_rule__ListLiteral__Group_1_1__16902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListLiteral__ItemsAssignment_1_1_1_in_rule__ListLiteral__Group_1_1__1__Impl6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__Group__0__Impl_in_rule__VarRefLiteral__Group__06963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__Group__1_in_rule__VarRefLiteral__Group__06966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VarRefLiteral__Group__0__Impl6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__Group__1__Impl_in_rule__VarRefLiteral__Group__17025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefLiteral__VarRefAssignment_1_in_rule__VarRefLiteral__Group__1__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__0__Impl_in_rule__Setter__Group__07086 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Setter__Group__1_in_rule__Setter__Group__07089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__PropertyAssignment_0_in_rule__Setter__Group__0__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__1__Impl_in_rule__Setter__Group__17146 = new BitSet(new long[]{0x0000002C80000870L});
    public static final BitSet FOLLOW_rule__Setter__Group__2_in_rule__Setter__Group__17149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Alternatives_1_in_rule__Setter__Group__1__Impl7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__2__Impl_in_rule__Setter__Group__27206 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3_in_rule__Setter__Group__27209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__ExpressionAssignment_2_in_rule__Setter__Group__2__Impl7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__Group__3__Impl_in_rule__Setter__Group__37266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setter__GuardAssignment_3_in_rule__Setter__Group__3__Impl7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__07332 = new BitSet(new long[]{0x00000000003F7002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__07335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__17391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__07453 = new BitSet(new long[]{0x00000000003F7000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__07456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__17514 = new BitSet(new long[]{0x0000002C80000870L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__17517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__27574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__07637 = new BitSet(new long[]{0x0000002C80000870L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__07640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TerminalExpression__Group_0__0__Impl7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__17699 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__17702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl7729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__27758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TerminalExpression__Group_0__2__Impl7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6__0__Impl_in_rule__TerminalExpression__Group_6__07823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6__1_in_rule__TerminalExpression__Group_6__07826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6__1__Impl_in_rule__TerminalExpression__Group_6__17884 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6__2_in_rule__TerminalExpression__Group_6__17887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__FunctionAssignment_6_1_in_rule__TerminalExpression__Group_6__1__Impl7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6__2__Impl_in_rule__TerminalExpression__Group_6__27944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6_2__0_in_rule__TerminalExpression__Group_6__2__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6_2__0__Impl_in_rule__TerminalExpression__Group_6_2__08007 = new BitSet(new long[]{0x0000002C80000870L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6_2__1_in_rule__TerminalExpression__Group_6_2__08010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TerminalExpression__Group_6_2__0__Impl8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6_2__1__Impl_in_rule__TerminalExpression__Group_6_2__18069 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6_2__2_in_rule__TerminalExpression__Group_6_2__18072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ExpAssignment_6_2_1_in_rule__TerminalExpression__Group_6_2__1__Impl8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_6_2__2__Impl_in_rule__TerminalExpression__Group_6_2__28129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TerminalExpression__Group_6_2__2__Impl8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_7__0__Impl_in_rule__TerminalExpression__Group_7__08194 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_7__1_in_rule__TerminalExpression__Group_7__08197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_7__1__Impl_in_rule__TerminalExpression__Group_7__18255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_7_1_in_rule__TerminalExpression__Group_7__1__Impl8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__08316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__08319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Function__Group__0__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__18378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__18381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__28438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__JavaClassAssignment_2_in_rule__Function__Group__2__Impl8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__0__Impl_in_rule__UpdateStatement__Group__08501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1_in_rule__UpdateStatement__Group__08504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__UpdateStatement__Group__0__Impl8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__1__Impl_in_rule__UpdateStatement__Group__18563 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2_in_rule__UpdateStatement__Group__18566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__VarRefAssignment_1_in_rule__UpdateStatement__Group__1__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group__2__Impl_in_rule__UpdateStatement__Group__28623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0_in_rule__UpdateStatement__Group__2__Impl8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__0__Impl_in_rule__UpdateStatement__Group_2__08687 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1_in_rule__UpdateStatement__Group_2__08690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UpdateStatement__Group_2__0__Impl8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__1__Impl_in_rule__UpdateStatement__Group_2__18749 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2_in_rule__UpdateStatement__Group_2__18752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0_in_rule__UpdateStatement__Group_2__1__Impl8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2__2__Impl_in_rule__UpdateStatement__Group_2__28810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UpdateStatement__Group_2__2__Impl8838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__0__Impl_in_rule__UpdateStatement__Group_2_1__08875 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1_in_rule__UpdateStatement__Group_2_1__08878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_0_in_rule__UpdateStatement__Group_2_1__0__Impl8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1__1__Impl_in_rule__UpdateStatement__Group_2_1__18935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0_in_rule__UpdateStatement__Group_2_1__1__Impl8962 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__0__Impl_in_rule__UpdateStatement__Group_2_1_1__08997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1_in_rule__UpdateStatement__Group_2_1_1__09000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UpdateStatement__Group_2_1_1__0__Impl9028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__Group_2_1_1__1__Impl_in_rule__UpdateStatement__Group_2_1_1__19059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UpdateStatement__SettersAssignment_2_1_1_1_in_rule__UpdateStatement__Group_2_1_1__1__Impl9086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassFqn__Group__0__Impl_in_rule__ClassFqn__Group__09120 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__ClassFqn__Group__1_in_rule__ClassFqn__Group__09123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassFqn__Group__0__Impl9150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassFqn__Group__1__Impl_in_rule__ClassFqn__Group__19179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassFqn__Group_1__0_in_rule__ClassFqn__Group__1__Impl9206 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__ClassFqn__Group_1__0__Impl_in_rule__ClassFqn__Group_1__09241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassFqn__Group_1__1_in_rule__ClassFqn__Group_1__09244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ClassFqn__Group_1__0__Impl9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassFqn__Group_1__1__Impl_in_rule__ClassFqn__Group_1__19303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassFqn__Group_1__1__Impl9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_rule__Scaffolding__ScaffoldAssignment_09368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_rule__Scaffolding__ElementsAssignment_19399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Scaffold__RefPackageAssignment_19430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_19461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_rule__Rule__WhenAssignment_29492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_rule__Rule__ThenAssignment_39523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_0_19554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__WhenBlock__MatchesAssignment_1_19585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Match__VarAssignment_0_09616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Match__TypeAssignment_19651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_09686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Match__ParamsAssignment_2_1_1_19717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment9748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__Param__PropertyAssignment_09779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Param__VarAssignment_1_19810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BindingExpression__OpAlternatives_1_1_0_in_rule__BindingExpression__OpAssignment_1_19841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingExpression__RightAssignment_1_29874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BindingTerminalExpression__FunctionAssignment_5_19909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_rule__BindingTerminalExpression__ExpAssignment_5_2_19944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__BindingTerminalExpression__ValueAssignment_6_19975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureRefLiteral__RefAssignment10010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_0_110045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ThenBlock__StatementsAssignment_1_110076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__CreateStatement__VarAssignment_0_010107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CreateStatement__ExpressionAssignment_110138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CreateClass__TypeAssignment_110173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_010208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__CreateClass__SettersAssignment_2_1_1_110239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_010301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListLiteral__ItemsAssignment_1_1_110332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarRefLiteral__VarRefAssignment_110367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Setter__PropertyAssignment_010406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Setter__ExpressionAssignment_210441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Setter__GuardAssignment_310477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_110516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_210549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__FunctionAssignment_6_110584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__ExpAssignment_6_2_110619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_7_110650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_110681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassFqn_in_rule__Function__JavaClassAssignment_210712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UpdateStatement__VarRefAssignment_110747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_010782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_rule__UpdateStatement__SettersAssignment_2_1_1_110813 = new BitSet(new long[]{0x0000000000000002L});

}