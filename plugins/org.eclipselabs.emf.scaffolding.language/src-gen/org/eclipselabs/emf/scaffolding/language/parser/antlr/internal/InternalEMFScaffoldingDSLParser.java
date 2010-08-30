package org.eclipselabs.emf.scaffolding.language.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipselabs.emf.scaffolding.language.services.EMFScaffoldingDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEMFScaffoldingDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scaffold'", "'rule'", "'when'", "'{'", "'}'", "':'", "'('", "','", "')'", "'<'", "'>'", "'='", "'!='", "'+'", "'-'", "'>='", "'<='", "'/'", "'*'", "'then'", "'->'", "'new'", "'null'", "'['", "']'", "'$'", "'+='", "'guard'", "'function'", "'update'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g"; }



     	private EMFScaffoldingDSLGrammarAccess grammarAccess;
     	
        public InternalEMFScaffoldingDSLParser(TokenStream input, IAstFactory factory, EMFScaffoldingDSLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Scaffolding";	
       	}
       	
       	@Override
       	protected EMFScaffoldingDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleScaffolding
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:77:1: entryRuleScaffolding returns [EObject current=null] : iv_ruleScaffolding= ruleScaffolding EOF ;
    public final EObject entryRuleScaffolding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaffolding = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:78:2: (iv_ruleScaffolding= ruleScaffolding EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:79:2: iv_ruleScaffolding= ruleScaffolding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScaffoldingRule(), currentNode); 
            pushFollow(FOLLOW_ruleScaffolding_in_entryRuleScaffolding75);
            iv_ruleScaffolding=ruleScaffolding();
            _fsp--;

             current =iv_ruleScaffolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaffolding85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScaffolding


    // $ANTLR start ruleScaffolding
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:86:1: ruleScaffolding returns [EObject current=null] : ( ( (lv_scaffold_0_0= ruleScaffold ) ) ( (lv_elements_1_0= ruleScaffoldingElement ) )* ) ;
    public final EObject ruleScaffolding() throws RecognitionException {
        EObject current = null;

        EObject lv_scaffold_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:91:6: ( ( ( (lv_scaffold_0_0= ruleScaffold ) ) ( (lv_elements_1_0= ruleScaffoldingElement ) )* ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:92:1: ( ( (lv_scaffold_0_0= ruleScaffold ) ) ( (lv_elements_1_0= ruleScaffoldingElement ) )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:92:1: ( ( (lv_scaffold_0_0= ruleScaffold ) ) ( (lv_elements_1_0= ruleScaffoldingElement ) )* )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:92:2: ( (lv_scaffold_0_0= ruleScaffold ) ) ( (lv_elements_1_0= ruleScaffoldingElement ) )*
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:92:2: ( (lv_scaffold_0_0= ruleScaffold ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:93:1: (lv_scaffold_0_0= ruleScaffold )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:93:1: (lv_scaffold_0_0= ruleScaffold )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:94:3: lv_scaffold_0_0= ruleScaffold
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getScaffoldingAccess().getScaffoldScaffoldParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScaffold_in_ruleScaffolding131);
            lv_scaffold_0_0=ruleScaffold();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getScaffoldingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"scaffold",
            	        		lv_scaffold_0_0, 
            	        		"Scaffold", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:116:2: ( (lv_elements_1_0= ruleScaffoldingElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:117:1: (lv_elements_1_0= ruleScaffoldingElement )
            	    {
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:117:1: (lv_elements_1_0= ruleScaffoldingElement )
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:118:3: lv_elements_1_0= ruleScaffoldingElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getScaffoldingAccess().getElementsScaffoldingElementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScaffoldingElement_in_ruleScaffolding152);
            	    lv_elements_1_0=ruleScaffoldingElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getScaffoldingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_1_0, 
            	    	        		"ScaffoldingElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScaffolding


    // $ANTLR start entryRuleScaffoldingElement
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:148:1: entryRuleScaffoldingElement returns [EObject current=null] : iv_ruleScaffoldingElement= ruleScaffoldingElement EOF ;
    public final EObject entryRuleScaffoldingElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaffoldingElement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:149:2: (iv_ruleScaffoldingElement= ruleScaffoldingElement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:150:2: iv_ruleScaffoldingElement= ruleScaffoldingElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScaffoldingElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleScaffoldingElement_in_entryRuleScaffoldingElement189);
            iv_ruleScaffoldingElement=ruleScaffoldingElement();
            _fsp--;

             current =iv_ruleScaffoldingElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaffoldingElement199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScaffoldingElement


    // $ANTLR start ruleScaffoldingElement
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:157:1: ruleScaffoldingElement returns [EObject current=null] : (this_Rule_0= ruleRule | this_Function_1= ruleFunction ) ;
    public final EObject ruleScaffoldingElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rule_0 = null;

        EObject this_Function_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:162:6: ( (this_Rule_0= ruleRule | this_Function_1= ruleFunction ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:163:1: (this_Rule_0= ruleRule | this_Function_1= ruleFunction )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:163:1: (this_Rule_0= ruleRule | this_Function_1= ruleFunction )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==39) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("163:1: (this_Rule_0= ruleRule | this_Function_1= ruleFunction )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:164:5: this_Rule_0= ruleRule
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScaffoldingElementAccess().getRuleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRule_in_ruleScaffoldingElement246);
                    this_Rule_0=ruleRule();
                    _fsp--;

                     
                            current = this_Rule_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:174:5: this_Function_1= ruleFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScaffoldingElementAccess().getFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleScaffoldingElement273);
                    this_Function_1=ruleFunction();
                    _fsp--;

                     
                            current = this_Function_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScaffoldingElement


    // $ANTLR start entryRuleScaffold
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:190:1: entryRuleScaffold returns [EObject current=null] : iv_ruleScaffold= ruleScaffold EOF ;
    public final EObject entryRuleScaffold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScaffold = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:191:2: (iv_ruleScaffold= ruleScaffold EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:192:2: iv_ruleScaffold= ruleScaffold EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScaffoldRule(), currentNode); 
            pushFollow(FOLLOW_ruleScaffold_in_entryRuleScaffold308);
            iv_ruleScaffold=ruleScaffold();
            _fsp--;

             current =iv_ruleScaffold; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScaffold318); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScaffold


    // $ANTLR start ruleScaffold
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:199:1: ruleScaffold returns [EObject current=null] : ( 'scaffold' ( (lv_refPackage_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleScaffold() throws RecognitionException {
        EObject current = null;

        Token lv_refPackage_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:204:6: ( ( 'scaffold' ( (lv_refPackage_1_0= RULE_STRING ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:205:1: ( 'scaffold' ( (lv_refPackage_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:205:1: ( 'scaffold' ( (lv_refPackage_1_0= RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:205:3: 'scaffold' ( (lv_refPackage_1_0= RULE_STRING ) )
            {
            match(input,11,FOLLOW_11_in_ruleScaffold353); 

                    createLeafNode(grammarAccess.getScaffoldAccess().getScaffoldKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:209:1: ( (lv_refPackage_1_0= RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:210:1: (lv_refPackage_1_0= RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:210:1: (lv_refPackage_1_0= RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:211:3: lv_refPackage_1_0= RULE_STRING
            {
            lv_refPackage_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScaffold370); 

            			createLeafNode(grammarAccess.getScaffoldAccess().getRefPackageSTRINGTerminalRuleCall_1_0(), "refPackage"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getScaffoldRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"refPackage",
            	        		lv_refPackage_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScaffold


    // $ANTLR start entryRuleRule
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:241:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:242:2: (iv_ruleRule= ruleRule EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:243:2: iv_ruleRule= ruleRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule411);
            iv_ruleRule=ruleRule();
            _fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRule


    // $ANTLR start ruleRule
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:250:1: ruleRule returns [EObject current=null] : ( 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_when_2_0 = null;

        EObject lv_then_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:255:6: ( ( 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:256:1: ( 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:256:1: ( 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:256:3: 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) )
            {
            match(input,12,FOLLOW_12_in_ruleRule456); 

                    createLeafNode(grammarAccess.getRuleAccess().getRuleKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:260:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:261:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:261:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:262:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule473); 

            			createLeafNode(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:284:2: ( (lv_when_2_0= ruleWhenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:285:1: (lv_when_2_0= ruleWhenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:285:1: (lv_when_2_0= ruleWhenBlock )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:286:3: lv_when_2_0= ruleWhenBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getWhenWhenBlockParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWhenBlock_in_ruleRule499);
            lv_when_2_0=ruleWhenBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"when",
            	        		lv_when_2_0, 
            	        		"WhenBlock", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:308:2: ( (lv_then_3_0= ruleThenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:309:1: (lv_then_3_0= ruleThenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:309:1: (lv_then_3_0= ruleThenBlock )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:310:3: lv_then_3_0= ruleThenBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getThenThenBlockParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleThenBlock_in_ruleRule520);
            lv_then_3_0=ruleThenBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"then",
            	        		lv_then_3_0, 
            	        		"ThenBlock", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRule


    // $ANTLR start entryRuleWhenBlock
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:340:1: entryRuleWhenBlock returns [EObject current=null] : iv_ruleWhenBlock= ruleWhenBlock EOF ;
    public final EObject entryRuleWhenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenBlock = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:341:2: (iv_ruleWhenBlock= ruleWhenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:342:2: iv_ruleWhenBlock= ruleWhenBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWhenBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleWhenBlock_in_entryRuleWhenBlock556);
            iv_ruleWhenBlock=ruleWhenBlock();
            _fsp--;

             current =iv_ruleWhenBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenBlock566); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWhenBlock


    // $ANTLR start ruleWhenBlock
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:349:1: ruleWhenBlock returns [EObject current=null] : ( 'when' ( ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' ) | ( (lv_matches_4_0= ruleMatch ) ) ) ) ;
    public final EObject ruleWhenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_matches_2_0 = null;

        EObject lv_matches_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:354:6: ( ( 'when' ( ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' ) | ( (lv_matches_4_0= ruleMatch ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:355:1: ( 'when' ( ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' ) | ( (lv_matches_4_0= ruleMatch ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:355:1: ( 'when' ( ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' ) | ( (lv_matches_4_0= ruleMatch ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:355:3: 'when' ( ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' ) | ( (lv_matches_4_0= ruleMatch ) ) )
            {
            match(input,13,FOLLOW_13_in_ruleWhenBlock601); 

                    createLeafNode(grammarAccess.getWhenBlockAccess().getWhenKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:359:1: ( ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' ) | ( (lv_matches_4_0= ruleMatch ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("359:1: ( ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' ) | ( (lv_matches_4_0= ruleMatch ) ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:359:2: ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:359:2: ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:359:4: '{' ( (lv_matches_2_0= ruleMatch ) )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleWhenBlock613); 

                            createLeafNode(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_1_0_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:363:1: ( (lv_matches_2_0= ruleMatch ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:364:1: (lv_matches_2_0= ruleMatch )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:364:1: (lv_matches_2_0= ruleMatch )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:365:3: lv_matches_2_0= ruleMatch
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMatch_in_ruleWhenBlock634);
                    	    lv_matches_2_0=ruleMatch();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getWhenBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"matches",
                    	    	        		lv_matches_2_0, 
                    	    	        		"Match", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleWhenBlock645); 

                            createLeafNode(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_1_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:392:6: ( (lv_matches_4_0= ruleMatch ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:392:6: ( (lv_matches_4_0= ruleMatch ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:393:1: (lv_matches_4_0= ruleMatch )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:393:1: (lv_matches_4_0= ruleMatch )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:394:3: lv_matches_4_0= ruleMatch
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMatch_in_ruleWhenBlock673);
                    lv_matches_4_0=ruleMatch();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWhenBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"matches",
                    	        		lv_matches_4_0, 
                    	        		"Match", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWhenBlock


    // $ANTLR start entryRuleMatch
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:426:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:427:2: (iv_ruleMatch= ruleMatch EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:428:2: iv_ruleMatch= ruleMatch EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMatchRule(), currentNode); 
            pushFollow(FOLLOW_ruleMatch_in_entryRuleMatch712);
            iv_ruleMatch=ruleMatch();
            _fsp--;

             current =iv_ruleMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatch722); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMatch


    // $ANTLR start ruleMatch
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:435:1: ruleMatch returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )? ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:440:6: ( ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:441:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:441:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:441:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:441:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==16) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:441:3: ( (lv_var_0_0= ruleVariable ) ) ':'
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:441:3: ( (lv_var_0_0= ruleVariable ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:442:1: (lv_var_0_0= ruleVariable )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:442:1: (lv_var_0_0= ruleVariable )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:443:3: lv_var_0_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMatchAccess().getVarVariableParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleMatch769);
                    lv_var_0_0=ruleVariable();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMatchRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"var",
                    	        		lv_var_0_0, 
                    	        		"Variable", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleMatch779); 

                            createLeafNode(grammarAccess.getMatchAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:469:3: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:470:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:470:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:471:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMatchRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMatch799); 

            		createLeafNode(grammarAccess.getMatchAccess().getTypeEClassCrossReference_1_0(), "type"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:483:2: ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:483:4: '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')'
                    {
                    match(input,17,FOLLOW_17_in_ruleMatch810); 

                            createLeafNode(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:487:1: ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_INT)||LA7_0==17||(LA7_0>=33 && LA7_0<=34)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:487:2: ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:487:2: ( (lv_params_4_0= ruleParam ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:488:1: (lv_params_4_0= ruleParam )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:488:1: (lv_params_4_0= ruleParam )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:489:3: lv_params_4_0= ruleParam
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleParam_in_ruleMatch832);
                            lv_params_4_0=ruleParam();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getMatchRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"params",
                            	        		lv_params_4_0, 
                            	        		"Param", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:511:2: ( ',' ( (lv_params_6_0= ruleParam ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==18) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:511:4: ',' ( (lv_params_6_0= ruleParam ) )
                            	    {
                            	    match(input,18,FOLLOW_18_in_ruleMatch843); 

                            	            createLeafNode(grammarAccess.getMatchAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:515:1: ( (lv_params_6_0= ruleParam ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:516:1: (lv_params_6_0= ruleParam )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:516:1: (lv_params_6_0= ruleParam )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:517:3: lv_params_6_0= ruleParam
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParam_in_ruleMatch864);
                            	    lv_params_6_0=ruleParam();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getMatchRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"params",
                            	    	        		lv_params_6_0, 
                            	    	        		"Param", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleMatch878); 

                            createLeafNode(grammarAccess.getMatchAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMatch


    // $ANTLR start entryRuleVariable
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:551:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:552:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:553:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable916);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:560:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:565:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:566:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:566:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:567:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:567:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:568:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable967); 

            			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleParam
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:598:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:599:2: (iv_ruleParam= ruleParam EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:600:2: iv_ruleParam= ruleParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1007);
            iv_ruleParam=ruleParam();
            _fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParam


    // $ANTLR start ruleParam
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:607:1: ruleParam returns [EObject current=null] : ( ( (lv_property_0_0= ruleBindingExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )? ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;

        EObject lv_var_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:612:6: ( ( ( (lv_property_0_0= ruleBindingExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:613:1: ( ( (lv_property_0_0= ruleBindingExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:613:1: ( ( (lv_property_0_0= ruleBindingExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:613:2: ( (lv_property_0_0= ruleBindingExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:613:2: ( (lv_property_0_0= ruleBindingExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:614:1: (lv_property_0_0= ruleBindingExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:614:1: (lv_property_0_0= ruleBindingExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:615:3: lv_property_0_0= ruleBindingExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParamAccess().getPropertyBindingExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBindingExpression_in_ruleParam1063);
            lv_property_0_0=ruleBindingExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParamRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"property",
            	        		lv_property_0_0, 
            	        		"BindingExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:637:2: ( ':' ( (lv_var_2_0= ruleVariable ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:637:4: ':' ( (lv_var_2_0= ruleVariable ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleParam1074); 

                            createLeafNode(grammarAccess.getParamAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:641:1: ( (lv_var_2_0= ruleVariable ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:642:1: (lv_var_2_0= ruleVariable )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:642:1: (lv_var_2_0= ruleVariable )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:643:3: lv_var_2_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParamAccess().getVarVariableParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleParam1095);
                    lv_var_2_0=ruleVariable();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"var",
                    	        		lv_var_2_0, 
                    	        		"Variable", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParam


    // $ANTLR start entryRuleBindingExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:673:1: entryRuleBindingExpression returns [EObject current=null] : iv_ruleBindingExpression= ruleBindingExpression EOF ;
    public final EObject entryRuleBindingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:674:2: (iv_ruleBindingExpression= ruleBindingExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:675:2: iv_ruleBindingExpression= ruleBindingExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindingExpression_in_entryRuleBindingExpression1133);
            iv_ruleBindingExpression=ruleBindingExpression();
            _fsp--;

             current =iv_ruleBindingExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingExpression1143); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBindingExpression


    // $ANTLR start ruleBindingExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:682:1: ruleBindingExpression returns [EObject current=null] : (this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )? ) ;
    public final EObject ruleBindingExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        Token lv_op_2_9=null;
        Token lv_op_2_10=null;
        EObject this_BindingTerminalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:687:6: ( (this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:688:1: (this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:688:1: (this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:689:5: this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBindingExpressionAccess().getBindingTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_ruleBindingExpression1190);
            this_BindingTerminalExpression_0=ruleBindingTerminalExpression();
            _fsp--;

             
                    current = this_BindingTerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:697:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=20 && LA11_0<=29)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:697:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) ) ) ( (lv_right_3_0= ruleBindingExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:697:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:698:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBindingExpressionAccess().getBindingOperationLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBindingExpressionAccess().getBindingOperationLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:713:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:714:1: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:714:1: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:715:1: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:715:1: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' )
                    int alt10=10;
                    switch ( input.LA(1) ) {
                    case 20:
                        {
                        alt10=1;
                        }
                        break;
                    case 21:
                        {
                        alt10=2;
                        }
                        break;
                    case 22:
                        {
                        alt10=3;
                        }
                        break;
                    case 23:
                        {
                        alt10=4;
                        }
                        break;
                    case 24:
                        {
                        alt10=5;
                        }
                        break;
                    case 25:
                        {
                        alt10=6;
                        }
                        break;
                    case 26:
                        {
                        alt10=7;
                        }
                        break;
                    case 27:
                        {
                        alt10=8;
                        }
                        break;
                    case 28:
                        {
                        alt10=9;
                        }
                        break;
                    case 29:
                        {
                        alt10=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("715:1: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '!=' | lv_op_2_5= '+' | lv_op_2_6= '-' | lv_op_2_7= '>=' | lv_op_2_8= '<=' | lv_op_2_9= '/' | lv_op_2_10= '*' )", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:716:3: lv_op_2_1= '<'
                            {
                            lv_op_2_1=(Token)input.LT(1);
                            match(input,20,FOLLOW_20_in_ruleBindingExpression1219); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpLessThanSignKeyword_1_1_0_0(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_1, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:734:8: lv_op_2_2= '>'
                            {
                            lv_op_2_2=(Token)input.LT(1);
                            match(input,21,FOLLOW_21_in_ruleBindingExpression1248); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_2, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:752:8: lv_op_2_3= '='
                            {
                            lv_op_2_3=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleBindingExpression1277); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpEqualsSignKeyword_1_1_0_2(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_3, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 4 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:770:8: lv_op_2_4= '!='
                            {
                            lv_op_2_4=(Token)input.LT(1);
                            match(input,23,FOLLOW_23_in_ruleBindingExpression1306); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_3(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_4, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 5 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:788:8: lv_op_2_5= '+'
                            {
                            lv_op_2_5=(Token)input.LT(1);
                            match(input,24,FOLLOW_24_in_ruleBindingExpression1335); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpPlusSignKeyword_1_1_0_4(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_5, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 6 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:806:8: lv_op_2_6= '-'
                            {
                            lv_op_2_6=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleBindingExpression1364); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpHyphenMinusKeyword_1_1_0_5(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_6, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 7 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:824:8: lv_op_2_7= '>='
                            {
                            lv_op_2_7=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleBindingExpression1393); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_6(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_7, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 8 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:842:8: lv_op_2_8= '<='
                            {
                            lv_op_2_8=(Token)input.LT(1);
                            match(input,27,FOLLOW_27_in_ruleBindingExpression1422); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_7(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_8, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 9 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:860:8: lv_op_2_9= '/'
                            {
                            lv_op_2_9=(Token)input.LT(1);
                            match(input,28,FOLLOW_28_in_ruleBindingExpression1451); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpSolidusKeyword_1_1_0_8(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_9, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 10 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:878:8: lv_op_2_10= '*'
                            {
                            lv_op_2_10=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleBindingExpression1480); 

                                    createLeafNode(grammarAccess.getBindingExpressionAccess().getOpAsteriskKeyword_1_1_0_9(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_10, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:899:2: ( (lv_right_3_0= ruleBindingExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:900:1: (lv_right_3_0= ruleBindingExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:900:1: (lv_right_3_0= ruleBindingExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:901:3: lv_right_3_0= ruleBindingExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBindingExpressionAccess().getRightBindingExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBindingExpression_in_ruleBindingExpression1517);
                    lv_right_3_0=ruleBindingExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_3_0, 
                    	        		"BindingExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBindingExpression


    // $ANTLR start entryRuleBindingTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:931:1: entryRuleBindingTerminalExpression returns [EObject current=null] : iv_ruleBindingTerminalExpression= ruleBindingTerminalExpression EOF ;
    public final EObject entryRuleBindingTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingTerminalExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:932:2: (iv_ruleBindingTerminalExpression= ruleBindingTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:933:2: iv_ruleBindingTerminalExpression= ruleBindingTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_entryRuleBindingTerminalExpression1555);
            iv_ruleBindingTerminalExpression=ruleBindingTerminalExpression();
            _fsp--;

             current =iv_ruleBindingTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingTerminalExpression1565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBindingTerminalExpression


    // $ANTLR start ruleBindingTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:940:1: ruleBindingTerminalExpression returns [EObject current=null] : ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_ListLiteral_3= ruleListLiteral | this_StringLiteral_4= ruleStringLiteral | ruleNullLiteral | this_FeatureRefLiteral_6= ruleFeatureRefLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) ) ;
    public final EObject ruleBindingTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_13_0=null;
        EObject this_BindingExpression_1 = null;

        EObject this_ListLiteral_3 = null;

        EObject this_StringLiteral_4 = null;

        EObject this_FeatureRefLiteral_6 = null;

        EObject lv_exp_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:945:6: ( ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_ListLiteral_3= ruleListLiteral | this_StringLiteral_4= ruleStringLiteral | ruleNullLiteral | this_FeatureRefLiteral_6= ruleFeatureRefLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:946:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_ListLiteral_3= ruleListLiteral | this_StringLiteral_4= ruleStringLiteral | ruleNullLiteral | this_FeatureRefLiteral_6= ruleFeatureRefLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:946:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_ListLiteral_3= ruleListLiteral | this_StringLiteral_4= ruleStringLiteral | ruleNullLiteral | this_FeatureRefLiteral_6= ruleFeatureRefLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            case 33:
                {
                alt12=4;
                }
                break;
            case RULE_ID:
                {
                int LA12_5 = input.LA(2);

                if ( (LA12_5==17) ) {
                    alt12=6;
                }
                else if ( (LA12_5==EOF||LA12_5==16||(LA12_5>=18 && LA12_5<=29)) ) {
                    alt12=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("946:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_ListLiteral_3= ruleListLiteral | this_StringLiteral_4= ruleStringLiteral | ruleNullLiteral | this_FeatureRefLiteral_6= ruleFeatureRefLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) )", 12, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("946:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_ListLiteral_3= ruleListLiteral | this_StringLiteral_4= ruleStringLiteral | ruleNullLiteral | this_FeatureRefLiteral_6= ruleFeatureRefLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:946:2: ( '(' this_BindingExpression_1= ruleBindingExpression ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:946:2: ( '(' this_BindingExpression_1= ruleBindingExpression ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:946:4: '(' this_BindingExpression_1= ruleBindingExpression ')'
                    {
                    match(input,17,FOLLOW_17_in_ruleBindingTerminalExpression1601); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getBindingExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1623);
                    this_BindingExpression_1=ruleBindingExpression();
                    _fsp--;

                     
                            current = this_BindingExpression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,19,FOLLOW_19_in_ruleBindingTerminalExpression1632); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:965:5: this_ListLiteral_3= ruleListLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getListLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_ruleBindingTerminalExpression1661);
                    this_ListLiteral_3=ruleListLiteral();
                    _fsp--;

                     
                            current = this_ListLiteral_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:975:5: this_StringLiteral_4= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getStringLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleBindingTerminalExpression1688);
                    this_StringLiteral_4=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:984:6: ruleNullLiteral
                    {
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleBindingTerminalExpression1702);
                    ruleNullLiteral();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:986:5: this_FeatureRefLiteral_6= ruleFeatureRefLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getFeatureRefLiteralParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFeatureRefLiteral_in_ruleBindingTerminalExpression1722);
                    this_FeatureRefLiteral_6=ruleFeatureRefLiteral();
                    _fsp--;

                     
                            current = this_FeatureRefLiteral_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:995:6: ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:995:6: ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:995:7: () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:995:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:996:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_5_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_5_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1006:2: ( ( RULE_ID ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1007:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1007:1: ( RULE_ID )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1008:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingTerminalExpression1755); 

                    		createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionCrossReference_5_1_0(), "function"); 
                    	

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1020:2: ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1020:4: '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')'
                    {
                    match(input,17,FOLLOW_17_in_ruleBindingTerminalExpression1766); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_5_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1024:1: ( (lv_exp_10_0= ruleBindingExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1025:1: (lv_exp_10_0= ruleBindingExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1025:1: (lv_exp_10_0= ruleBindingExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1026:3: lv_exp_10_0= ruleBindingExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingExpressionParserRuleCall_5_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1787);
                    lv_exp_10_0=ruleBindingExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"exp",
                    	        		lv_exp_10_0, 
                    	        		"BindingExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleBindingTerminalExpression1797); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_5_2_2(), null); 
                        

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1053:6: ( () ( (lv_value_13_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1053:6: ( () ( (lv_value_13_0= RULE_INT ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1053:7: () ( (lv_value_13_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1053:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1054:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBindingTerminalExpressionAccess().getIntLiteralAction_6_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getIntLiteralAction_6_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1064:2: ( (lv_value_13_0= RULE_INT ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1065:1: (lv_value_13_0= RULE_INT )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1065:1: (lv_value_13_0= RULE_INT )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1066:3: lv_value_13_0= RULE_INT
                    {
                    lv_value_13_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingTerminalExpression1832); 

                    			createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getValueINTTerminalRuleCall_6_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_13_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBindingTerminalExpression


    // $ANTLR start entryRuleFeatureRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1096:1: entryRuleFeatureRefLiteral returns [EObject current=null] : iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF ;
    public final EObject entryRuleFeatureRefLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRefLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1097:2: (iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1098:2: iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRefLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral1874);
            iv_ruleFeatureRefLiteral=ruleFeatureRefLiteral();
            _fsp--;

             current =iv_ruleFeatureRefLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRefLiteral1884); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFeatureRefLiteral


    // $ANTLR start ruleFeatureRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1105:1: ruleFeatureRefLiteral returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleFeatureRefLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1110:6: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1111:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1111:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1112:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1112:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1113:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRefLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureRefLiteral1926); 

            		createLeafNode(grammarAccess.getFeatureRefLiteralAccess().getRefEStructuralFeatureCrossReference_0(), "ref"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFeatureRefLiteral


    // $ANTLR start entryRuleThenBlock
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1133:1: entryRuleThenBlock returns [EObject current=null] : iv_ruleThenBlock= ruleThenBlock EOF ;
    public final EObject entryRuleThenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenBlock = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1134:2: (iv_ruleThenBlock= ruleThenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1135:2: iv_ruleThenBlock= ruleThenBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getThenBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleThenBlock_in_entryRuleThenBlock1961);
            iv_ruleThenBlock=ruleThenBlock();
            _fsp--;

             current =iv_ruleThenBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenBlock1971); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleThenBlock


    // $ANTLR start ruleThenBlock
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1142:1: ruleThenBlock returns [EObject current=null] : ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) ) ;
    public final EObject ruleThenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1147:6: ( ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1148:1: ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1148:1: ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1148:2: ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1148:2: ( 'then' | '->' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1148:2: ( 'then' | '->' )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1148:4: 'then'
                    {
                    match(input,30,FOLLOW_30_in_ruleThenBlock2007); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getThenKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1153:7: '->'
                    {
                    match(input,31,FOLLOW_31_in_ruleThenBlock2023); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1157:2: ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_INT)||LA15_0==17||(LA15_0>=32 && LA15_0<=34)||LA15_0==36||LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1157:2: ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1157:3: ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1157:3: ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1157:5: '{' ( (lv_statements_3_0= ruleStatement ) )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleThenBlock2036); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_1_0_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1161:1: ( (lv_statements_3_0= ruleStatement ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_INT)||LA14_0==17||(LA14_0>=32 && LA14_0<=34)||LA14_0==36||LA14_0==40) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1162:1: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1162:1: (lv_statements_3_0= ruleStatement )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1163:3: lv_statements_3_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleThenBlock2057);
                    	    lv_statements_3_0=ruleStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getThenBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"statements",
                    	    	        		lv_statements_3_0, 
                    	    	        		"Statement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleThenBlock2068); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_1_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1190:6: ( (lv_statements_5_0= ruleStatement ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1190:6: ( (lv_statements_5_0= ruleStatement ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1191:1: (lv_statements_5_0= ruleStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1191:1: (lv_statements_5_0= ruleStatement )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1192:3: lv_statements_5_0= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleThenBlock2096);
                    lv_statements_5_0=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getThenBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"statements",
                    	        		lv_statements_5_0, 
                    	        		"Statement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleThenBlock


    // $ANTLR start entryRuleStatement
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1222:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1223:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1224:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2133);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2143); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1231:1: ruleStatement returns [EObject current=null] : (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateStatement_0 = null;

        EObject this_UpdateStatement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1236:6: ( (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1237:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1237:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||LA16_0==17||(LA16_0>=32 && LA16_0<=34)||LA16_0==36) ) {
                alt16=1;
            }
            else if ( (LA16_0==40) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1237:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1238:5: this_CreateStatement_0= ruleCreateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCreateStatement_in_ruleStatement2190);
                    this_CreateStatement_0=ruleCreateStatement();
                    _fsp--;

                     
                            current = this_CreateStatement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1248:5: this_UpdateStatement_1= ruleUpdateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleStatement2217);
                    this_UpdateStatement_1=ruleUpdateStatement();
                    _fsp--;

                     
                            current = this_UpdateStatement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleCreateStatement
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1264:1: entryRuleCreateStatement returns [EObject current=null] : iv_ruleCreateStatement= ruleCreateStatement EOF ;
    public final EObject entryRuleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1265:2: (iv_ruleCreateStatement= ruleCreateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1266:2: iv_ruleCreateStatement= ruleCreateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement2252);
            iv_ruleCreateStatement=ruleCreateStatement();
            _fsp--;

             current =iv_ruleCreateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateStatement2262); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCreateStatement


    // $ANTLR start ruleCreateStatement
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1273:1: ruleCreateStatement returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1278:6: ( ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1279:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1279:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1279:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1279:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==16) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1279:3: ( (lv_var_0_0= ruleVariable ) ) ':'
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1279:3: ( (lv_var_0_0= ruleVariable ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1280:1: (lv_var_0_0= ruleVariable )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1280:1: (lv_var_0_0= ruleVariable )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1281:3: lv_var_0_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleCreateStatement2309);
                    lv_var_0_0=ruleVariable();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCreateStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"var",
                    	        		lv_var_0_0, 
                    	        		"Variable", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleCreateStatement2319); 

                            createLeafNode(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1307:3: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1308:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1308:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1309:3: lv_expression_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCreateStatement2342);
            lv_expression_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCreateStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCreateStatement


    // $ANTLR start entryRuleCreateClass
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1339:1: entryRuleCreateClass returns [EObject current=null] : iv_ruleCreateClass= ruleCreateClass EOF ;
    public final EObject entryRuleCreateClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateClass = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1340:2: (iv_ruleCreateClass= ruleCreateClass EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1341:2: iv_ruleCreateClass= ruleCreateClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreateClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreateClass_in_entryRuleCreateClass2378);
            iv_ruleCreateClass=ruleCreateClass();
            _fsp--;

             current =iv_ruleCreateClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateClass2388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCreateClass


    // $ANTLR start ruleCreateClass
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1348:1: ruleCreateClass returns [EObject current=null] : ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) ;
    public final EObject ruleCreateClass() throws RecognitionException {
        EObject current = null;

        EObject lv_setters_3_0 = null;

        EObject lv_setters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1353:6: ( ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1354:1: ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1354:1: ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1354:3: 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            {
            match(input,32,FOLLOW_32_in_ruleCreateClass2423); 

                    createLeafNode(grammarAccess.getCreateClassAccess().getNewKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1358:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1359:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1359:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1360:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCreateClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateClass2441); 

            		createLeafNode(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0(), "type"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1372:2: ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1372:4: '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleCreateClass2452); 

                            createLeafNode(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1376:1: ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1376:2: ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1376:2: ( (lv_setters_3_0= ruleSetter ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1377:1: (lv_setters_3_0= ruleSetter )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1377:1: (lv_setters_3_0= ruleSetter )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1378:3: lv_setters_3_0= ruleSetter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSetter_in_ruleCreateClass2474);
                            lv_setters_3_0=ruleSetter();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getCreateClassRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"setters",
                            	        		lv_setters_3_0, 
                            	        		"Setter", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1400:2: ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==18) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1400:4: ',' ( (lv_setters_5_0= ruleSetter ) )
                            	    {
                            	    match(input,18,FOLLOW_18_in_ruleCreateClass2485); 

                            	            createLeafNode(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1404:1: ( (lv_setters_5_0= ruleSetter ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1405:1: (lv_setters_5_0= ruleSetter )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1405:1: (lv_setters_5_0= ruleSetter )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1406:3: lv_setters_5_0= ruleSetter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSetter_in_ruleCreateClass2506);
                            	    lv_setters_5_0=ruleSetter();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getCreateClassRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"setters",
                            	    	        		lv_setters_5_0, 
                            	    	        		"Setter", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,15,FOLLOW_15_in_ruleCreateClass2520); 

                            createLeafNode(grammarAccess.getCreateClassAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCreateClass


    // $ANTLR start entryRuleStringLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1440:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1441:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1442:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2558);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1449:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1454:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1455:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1455:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1456:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1456:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1457:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2609); 

            			createLeafNode(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleNullLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1487:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1488:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1489:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNullLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2650);
            iv_ruleNullLiteral=ruleNullLiteral();
            _fsp--;

             current =iv_ruleNullLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral2661); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNullLiteral


    // $ANTLR start ruleNullLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1496:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1501:6: (kw= 'null' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1503:2: kw= 'null'
            {
            kw=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleNullLiteral2698); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getNullLiteralAccess().getNullKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNullLiteral


    // $ANTLR start entryRuleListLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1516:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1517:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1518:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral2737);
            iv_ruleListLiteral=ruleListLiteral();
            _fsp--;

             current =iv_ruleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral2747); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleListLiteral


    // $ANTLR start ruleListLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1525:1: ruleListLiteral returns [EObject current=null] : ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1530:6: ( ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1531:1: ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1531:1: ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1531:3: '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']'
            {
            match(input,34,FOLLOW_34_in_ruleListLiteral2782); 

                    createLeafNode(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1535:1: ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||LA22_0==17||(LA22_0>=32 && LA22_0<=34)||LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1535:2: ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )*
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1535:2: ( (lv_items_1_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1536:1: (lv_items_1_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1536:1: (lv_items_1_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1537:3: lv_items_1_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral2804);
                    lv_items_1_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getListLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"items",
                    	        		lv_items_1_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1559:2: ( ',' ( (lv_items_3_0= ruleExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1559:4: ',' ( (lv_items_3_0= ruleExpression ) )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleListLiteral2815); 

                    	            createLeafNode(grammarAccess.getListLiteralAccess().getCommaKeyword_1_1_0(), null); 
                    	        
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1563:1: ( (lv_items_3_0= ruleExpression ) )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1564:1: (lv_items_3_0= ruleExpression )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1564:1: (lv_items_3_0= ruleExpression )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1565:3: lv_items_3_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral2836);
                    	    lv_items_3_0=ruleExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getListLiteralRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"items",
                    	    	        		lv_items_3_0, 
                    	    	        		"Expression", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleListLiteral2850); 

                    createLeafNode(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleListLiteral


    // $ANTLR start entryRuleVarRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1599:1: entryRuleVarRefLiteral returns [EObject current=null] : iv_ruleVarRefLiteral= ruleVarRefLiteral EOF ;
    public final EObject entryRuleVarRefLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1600:2: (iv_ruleVarRefLiteral= ruleVarRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1601:2: iv_ruleVarRefLiteral= ruleVarRefLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarRefLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral2886);
            iv_ruleVarRefLiteral=ruleVarRefLiteral();
            _fsp--;

             current =iv_ruleVarRefLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRefLiteral2896); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVarRefLiteral


    // $ANTLR start ruleVarRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1608:1: ruleVarRefLiteral returns [EObject current=null] : ( '$' ( ( RULE_ID ) ) ) ;
    public final EObject ruleVarRefLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1613:6: ( ( '$' ( ( RULE_ID ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1614:1: ( '$' ( ( RULE_ID ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1614:1: ( '$' ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1614:3: '$' ( ( RULE_ID ) )
            {
            match(input,36,FOLLOW_36_in_ruleVarRefLiteral2931); 

                    createLeafNode(grammarAccess.getVarRefLiteralAccess().getDollarSignKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1618:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1619:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1619:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1620:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVarRefLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarRefLiteral2949); 

            		createLeafNode(grammarAccess.getVarRefLiteralAccess().getVarRefVariableCrossReference_1_0(), "varRef"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVarRefLiteral


    // $ANTLR start entryRuleSetter
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1640:1: entryRuleSetter returns [EObject current=null] : iv_ruleSetter= ruleSetter EOF ;
    public final EObject entryRuleSetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetter = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1641:2: (iv_ruleSetter= ruleSetter EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1642:2: iv_ruleSetter= ruleSetter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetterRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetter_in_entryRuleSetter2985);
            iv_ruleSetter=ruleSetter();
            _fsp--;

             current =iv_ruleSetter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetter2995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSetter


    // $ANTLR start ruleSetter
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1649:1: ruleSetter returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? ) ;
    public final EObject ruleSetter() throws RecognitionException {
        EObject current = null;

        Token lv_guard_4_0=null;
        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1654:6: ( ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1655:1: ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1655:1: ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1655:2: ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1655:2: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1656:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1656:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1657:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSetterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetter3038); 

            		createLeafNode(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0(), "property"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1669:2: ( ':' | '+=' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1669:2: ( ':' | '+=' )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1669:4: ':'
                    {
                    match(input,16,FOLLOW_16_in_ruleSetter3049); 

                            createLeafNode(grammarAccess.getSetterAccess().getColonKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1674:7: '+='
                    {
                    match(input,37,FOLLOW_37_in_ruleSetter3065); 

                            createLeafNode(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1678:2: ( (lv_expression_3_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1679:1: (lv_expression_3_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1679:1: (lv_expression_3_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1680:3: lv_expression_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSetter3087);
            lv_expression_3_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_3_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1702:2: ( (lv_guard_4_0= 'guard' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1703:1: (lv_guard_4_0= 'guard' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1703:1: (lv_guard_4_0= 'guard' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1704:3: lv_guard_4_0= 'guard'
                    {
                    lv_guard_4_0=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleSetter3105); 

                            createLeafNode(grammarAccess.getSetterAccess().getGuardGuardKeyword_3_0(), "guard"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSetterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "guard", true, "guard", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSetter


    // $ANTLR start entryRuleExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1731:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1732:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1733:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3155);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3165); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1740:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        Token lv_op_2_9=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1745:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1746:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1746:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1747:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression3212);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1755:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=20 && LA26_0<=22)||(LA26_0>=24 && LA26_0<=29)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1755:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1755:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1756:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1771:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1772:1: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1772:1: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:1: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:1: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' )
                    int alt25=9;
                    switch ( input.LA(1) ) {
                    case 20:
                        {
                        alt25=1;
                        }
                        break;
                    case 21:
                        {
                        alt25=2;
                        }
                        break;
                    case 22:
                        {
                        alt25=3;
                        }
                        break;
                    case 24:
                        {
                        alt25=4;
                        }
                        break;
                    case 25:
                        {
                        alt25=5;
                        }
                        break;
                    case 26:
                        {
                        alt25=6;
                        }
                        break;
                    case 27:
                        {
                        alt25=7;
                        }
                        break;
                    case 28:
                        {
                        alt25=8;
                        }
                        break;
                    case 29:
                        {
                        alt25=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1773:1: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '=' | lv_op_2_4= '+' | lv_op_2_5= '-' | lv_op_2_6= '>=' | lv_op_2_7= '<=' | lv_op_2_8= '/' | lv_op_2_9= '*' )", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1774:3: lv_op_2_1= '<'
                            {
                            lv_op_2_1=(Token)input.LT(1);
                            match(input,20,FOLLOW_20_in_ruleExpression3241); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpLessThanSignKeyword_1_1_0_0(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_1, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1792:8: lv_op_2_2= '>'
                            {
                            lv_op_2_2=(Token)input.LT(1);
                            match(input,21,FOLLOW_21_in_ruleExpression3270); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_2, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1810:8: lv_op_2_3= '='
                            {
                            lv_op_2_3=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleExpression3299); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpEqualsSignKeyword_1_1_0_2(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_3, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 4 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1828:8: lv_op_2_4= '+'
                            {
                            lv_op_2_4=(Token)input.LT(1);
                            match(input,24,FOLLOW_24_in_ruleExpression3328); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpPlusSignKeyword_1_1_0_3(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_4, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 5 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1846:8: lv_op_2_5= '-'
                            {
                            lv_op_2_5=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleExpression3357); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpHyphenMinusKeyword_1_1_0_4(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_5, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 6 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1864:8: lv_op_2_6= '>='
                            {
                            lv_op_2_6=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleExpression3386); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_5(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_6, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 7 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1882:8: lv_op_2_7= '<='
                            {
                            lv_op_2_7=(Token)input.LT(1);
                            match(input,27,FOLLOW_27_in_ruleExpression3415); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_6(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_7, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 8 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1900:8: lv_op_2_8= '/'
                            {
                            lv_op_2_8=(Token)input.LT(1);
                            match(input,28,FOLLOW_28_in_ruleExpression3444); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpSolidusKeyword_1_1_0_7(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_8, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 9 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1918:8: lv_op_2_9= '*'
                            {
                            lv_op_2_9=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleExpression3473); 

                                    createLeafNode(grammarAccess.getExpressionAccess().getOpAsteriskKeyword_1_1_0_8(), "op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_2_9, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1939:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1940:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1940:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1941:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression3510);
                    lv_right_3_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_3_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1971:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1972:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1973:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression3548);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression3558); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1980:1: ruleTerminalExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_ListLiteral_4= ruleListLiteral | this_CreateClass_5= ruleCreateClass | ruleNullLiteral | this_StringLiteral_7= ruleStringLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' ) ) | ( () ( (lv_value_14_0= RULE_INT ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_14_0=null;
        EObject this_Expression_1 = null;

        EObject this_VarRefLiteral_3 = null;

        EObject this_ListLiteral_4 = null;

        EObject this_CreateClass_5 = null;

        EObject this_StringLiteral_7 = null;

        EObject lv_exp_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1985:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_ListLiteral_4= ruleListLiteral | this_CreateClass_5= ruleCreateClass | ruleNullLiteral | this_StringLiteral_7= ruleStringLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' ) ) | ( () ( (lv_value_14_0= RULE_INT ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1986:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_ListLiteral_4= ruleListLiteral | this_CreateClass_5= ruleCreateClass | ruleNullLiteral | this_StringLiteral_7= ruleStringLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' ) ) | ( () ( (lv_value_14_0= RULE_INT ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1986:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_ListLiteral_4= ruleListLiteral | this_CreateClass_5= ruleCreateClass | ruleNullLiteral | this_StringLiteral_7= ruleStringLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' ) ) | ( () ( (lv_value_14_0= RULE_INT ) ) ) )
            int alt27=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt27=1;
                }
                break;
            case 36:
                {
                alt27=2;
                }
                break;
            case 34:
                {
                alt27=3;
                }
                break;
            case 32:
                {
                alt27=4;
                }
                break;
            case 33:
                {
                alt27=5;
                }
                break;
            case RULE_STRING:
                {
                alt27=6;
                }
                break;
            case RULE_ID:
                {
                alt27=7;
                }
                break;
            case RULE_INT:
                {
                alt27=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1986:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_ListLiteral_4= ruleListLiteral | this_CreateClass_5= ruleCreateClass | ruleNullLiteral | this_StringLiteral_7= ruleStringLiteral | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' ) ) | ( () ( (lv_value_14_0= RULE_INT ) ) ) )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1986:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1986:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1986:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,17,FOLLOW_17_in_ruleTerminalExpression3594); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression3616);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,19,FOLLOW_19_in_ruleTerminalExpression3625); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2005:5: this_VarRefLiteral_3= ruleVarRefLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVarRefLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVarRefLiteral_in_ruleTerminalExpression3654);
                    this_VarRefLiteral_3=ruleVarRefLiteral();
                    _fsp--;

                     
                            current = this_VarRefLiteral_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2015:5: this_ListLiteral_4= ruleListLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getListLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_ruleTerminalExpression3681);
                    this_ListLiteral_4=ruleListLiteral();
                    _fsp--;

                     
                            current = this_ListLiteral_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2025:5: this_CreateClass_5= ruleCreateClass
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCreateClass_in_ruleTerminalExpression3708);
                    this_CreateClass_5=ruleCreateClass();
                    _fsp--;

                     
                            current = this_CreateClass_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2034:6: ruleNullLiteral
                    {
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleTerminalExpression3722);
                    ruleNullLiteral();
                    _fsp--;


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2036:5: this_StringLiteral_7= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getStringLiteralParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleTerminalExpression3742);
                    this_StringLiteral_7=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2045:6: ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2045:6: ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2045:7: () ( ( RULE_ID ) ) ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2045:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2046:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_6_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_6_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2056:2: ( ( RULE_ID ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2057:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2057:1: ( RULE_ID )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2058:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression3775); 

                    		createLeafNode(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_6_1_0(), "function"); 
                    	

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2070:2: ( '(' ( (lv_exp_11_0= ruleExpression ) ) ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2070:4: '(' ( (lv_exp_11_0= ruleExpression ) ) ')'
                    {
                    match(input,17,FOLLOW_17_in_ruleTerminalExpression3786); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2074:1: ( (lv_exp_11_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2075:1: (lv_exp_11_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2075:1: (lv_exp_11_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2076:3: lv_exp_11_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpExpressionParserRuleCall_6_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression3807);
                    lv_exp_11_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"exp",
                    	        		lv_exp_11_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleTerminalExpression3817); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2_2(), null); 
                        

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2103:6: ( () ( (lv_value_14_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2103:6: ( () ( (lv_value_14_0= RULE_INT ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2103:7: () ( (lv_value_14_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2103:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2104:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_7_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_7_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2114:2: ( (lv_value_14_0= RULE_INT ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2115:1: (lv_value_14_0= RULE_INT )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2115:1: (lv_value_14_0= RULE_INT )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2116:3: lv_value_14_0= RULE_INT
                    {
                    lv_value_14_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression3852); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_7_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_14_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRuleFunction
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2146:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2147:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2148:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction3894);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction3904); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2155:1: ruleFunction returns [EObject current=null] : ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_javaClass_2_0= ruleClassFqn ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_javaClass_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2160:6: ( ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_javaClass_2_0= ruleClassFqn ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2161:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_javaClass_2_0= ruleClassFqn ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2161:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_javaClass_2_0= ruleClassFqn ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2161:3: 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_javaClass_2_0= ruleClassFqn ) )
            {
            match(input,39,FOLLOW_39_in_ruleFunction3939); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFunctionKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2165:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2166:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2166:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2167:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3956); 

            			createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2189:2: ( (lv_javaClass_2_0= ruleClassFqn ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2190:1: (lv_javaClass_2_0= ruleClassFqn )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2190:1: (lv_javaClass_2_0= ruleClassFqn )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2191:3: lv_javaClass_2_0= ruleClassFqn
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getJavaClassClassFqnParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleClassFqn_in_ruleFunction3982);
            lv_javaClass_2_0=ruleClassFqn();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"javaClass",
            	        		lv_javaClass_2_0, 
            	        		"ClassFqn", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleUpdateStatement
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2221:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2222:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2223:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUpdateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement4018);
            iv_ruleUpdateStatement=ruleUpdateStatement();
            _fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement4028); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUpdateStatement


    // $ANTLR start ruleUpdateStatement
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2230:1: ruleUpdateStatement returns [EObject current=null] : ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_setters_3_0 = null;

        EObject lv_setters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2235:6: ( ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2236:1: ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2236:1: ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2236:3: 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            {
            match(input,40,FOLLOW_40_in_ruleUpdateStatement4063); 

                    createLeafNode(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2240:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2241:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2241:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2242:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement4081); 

            		createLeafNode(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0(), "varRef"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2254:2: ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2254:4: '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleUpdateStatement4092); 

                            createLeafNode(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2258:1: ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2258:2: ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2258:2: ( (lv_setters_3_0= ruleSetter ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2259:1: (lv_setters_3_0= ruleSetter )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2259:1: (lv_setters_3_0= ruleSetter )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2260:3: lv_setters_3_0= ruleSetter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSetter_in_ruleUpdateStatement4114);
                            lv_setters_3_0=ruleSetter();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"setters",
                            	        		lv_setters_3_0, 
                            	        		"Setter", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2282:2: ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==18) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2282:4: ',' ( (lv_setters_5_0= ruleSetter ) )
                            	    {
                            	    match(input,18,FOLLOW_18_in_ruleUpdateStatement4125); 

                            	            createLeafNode(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2286:1: ( (lv_setters_5_0= ruleSetter ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2287:1: (lv_setters_5_0= ruleSetter )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2287:1: (lv_setters_5_0= ruleSetter )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2288:3: lv_setters_5_0= ruleSetter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSetter_in_ruleUpdateStatement4146);
                            	    lv_setters_5_0=ruleSetter();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"setters",
                            	    	        		lv_setters_5_0, 
                            	    	        		"Setter", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,15,FOLLOW_15_in_ruleUpdateStatement4160); 

                            createLeafNode(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUpdateStatement


    // $ANTLR start entryRuleClassFqn
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2322:1: entryRuleClassFqn returns [String current=null] : iv_ruleClassFqn= ruleClassFqn EOF ;
    public final String entryRuleClassFqn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassFqn = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2323:2: (iv_ruleClassFqn= ruleClassFqn EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2324:2: iv_ruleClassFqn= ruleClassFqn EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassFqnRule(), currentNode); 
            pushFollow(FOLLOW_ruleClassFqn_in_entryRuleClassFqn4199);
            iv_ruleClassFqn=ruleClassFqn();
            _fsp--;

             current =iv_ruleClassFqn.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassFqn4210); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClassFqn


    // $ANTLR start ruleClassFqn
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2331:1: ruleClassFqn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleClassFqn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2336:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2337:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2337:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2337:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassFqn4250); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getClassFqnAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2344:1: (kw= '.' this_ID_2= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==41) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2345:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,41,FOLLOW_41_in_ruleClassFqn4269); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getClassFqnAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassFqn4284); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getClassFqnAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClassFqn


 

    public static final BitSet FOLLOW_ruleScaffolding_in_entryRuleScaffolding75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffolding85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_ruleScaffolding131 = new BitSet(new long[]{0x0000008000001002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_ruleScaffolding152 = new BitSet(new long[]{0x0000008000001002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_entryRuleScaffoldingElement189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffoldingElement199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleScaffoldingElement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleScaffoldingElement273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_entryRuleScaffold308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffold318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleScaffold353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScaffold370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRule456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule473 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_ruleRule499 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleThenBlock_in_ruleRule520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_entryRuleWhenBlock556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenBlock566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleWhenBlock601 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleWhenBlock613 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleMatch_in_ruleWhenBlock634 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleWhenBlock645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_ruleWhenBlock673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_entryRuleMatch712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatch722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMatch769 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMatch779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMatch799 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleMatch810 = new BitSet(new long[]{0x00000006000A0070L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMatch832 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleMatch843 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMatch864 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleMatch878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleParam1063 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleParam1074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleParam1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_entryRuleBindingExpression1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingExpression1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_ruleBindingExpression1190 = new BitSet(new long[]{0x000000003FF00002L});
    public static final BitSet FOLLOW_20_in_ruleBindingExpression1219 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_21_in_ruleBindingExpression1248 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_22_in_ruleBindingExpression1277 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_23_in_ruleBindingExpression1306 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_24_in_ruleBindingExpression1335 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_25_in_ruleBindingExpression1364 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_26_in_ruleBindingExpression1393 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_27_in_ruleBindingExpression1422 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_28_in_ruleBindingExpression1451 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_29_in_ruleBindingExpression1480 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleBindingExpression1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_entryRuleBindingTerminalExpression1555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingTerminalExpression1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBindingTerminalExpression1601 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1623 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBindingTerminalExpression1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_ruleBindingTerminalExpression1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleBindingTerminalExpression1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleBindingTerminalExpression1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_ruleBindingTerminalExpression1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingTerminalExpression1755 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBindingTerminalExpression1766 = new BitSet(new long[]{0x0000000600020070L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1787 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBindingTerminalExpression1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingTerminalExpression1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral1874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRefLiteral1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureRefLiteral1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_entryRuleThenBlock1961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenBlock1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleThenBlock2007 = new BitSet(new long[]{0x0000011700024070L});
    public static final BitSet FOLLOW_31_in_ruleThenBlock2023 = new BitSet(new long[]{0x0000011700024070L});
    public static final BitSet FOLLOW_14_in_ruleThenBlock2036 = new BitSet(new long[]{0x0000011700028070L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenBlock2057 = new BitSet(new long[]{0x0000011700028070L});
    public static final BitSet FOLLOW_15_in_ruleThenBlock2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenBlock2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_ruleStatement2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleStatement2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateStatement2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCreateStatement2309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCreateStatement2319 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreateStatement2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_entryRuleCreateClass2378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateClass2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCreateClass2423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateClass2441 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleCreateClass2452 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleCreateClass2474 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleCreateClass2485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleCreateClass2506 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleCreateClass2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNullLiteral2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral2737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleListLiteral2782 = new BitSet(new long[]{0x0000001F00020070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral2804 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_18_in_ruleListLiteral2815 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral2836 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_35_in_ruleListLiteral2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRefLiteral2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVarRefLiteral2931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarRefLiteral2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_entryRuleSetter2985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetter2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetter3038 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_16_in_ruleSetter3049 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_37_in_ruleSetter3065 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSetter3087 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleSetter3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression3212 = new BitSet(new long[]{0x000000003F700002L});
    public static final BitSet FOLLOW_20_in_ruleExpression3241 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_21_in_ruleExpression3270 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_22_in_ruleExpression3299 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_24_in_ruleExpression3328 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_25_in_ruleExpression3357 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_26_in_ruleExpression3386 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_27_in_ruleExpression3415 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_28_in_ruleExpression3444 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_29_in_ruleExpression3473 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression3548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTerminalExpression3594 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression3616 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTerminalExpression3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_ruleTerminalExpression3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_ruleTerminalExpression3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_ruleTerminalExpression3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleTerminalExpression3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleTerminalExpression3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression3775 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTerminalExpression3786 = new BitSet(new long[]{0x0000001700020070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression3807 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTerminalExpression3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction3894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFunction3939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassFqn_in_ruleFunction3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement4018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleUpdateStatement4063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement4081 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleUpdateStatement4092 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleUpdateStatement4114 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleUpdateStatement4125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleUpdateStatement4146 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleUpdateStatement4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassFqn_in_entryRuleClassFqn4199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassFqn4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassFqn4250 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleClassFqn4269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassFqn4284 = new BitSet(new long[]{0x0000020000000002L});

}