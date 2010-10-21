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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_OPERATOR_LOW_PRIORITY", "RULE_OPERATOR_HIGH_PRIORITY", "RULE_INT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scaffold'", "'rule'", "'when'", "'{'", "'}'", "':'", "'('", "','", "')'", "'!'", "'then'", "'->'", "'new'", "'null'", "'['", "']'", "'$'", "'+='", "'guard'", "'function'", "'#'", "'update'", "'.'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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

                if ( (LA1_0==16||LA1_0==34) ) {
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

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
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
            match(input,15,FOLLOW_15_in_ruleScaffold353); 

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
            match(input,16,FOLLOW_16_in_ruleRule456); 

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
            match(input,17,FOLLOW_17_in_ruleWhenBlock601); 

                    createLeafNode(grammarAccess.getWhenBlockAccess().getWhenKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:359:1: ( ( '{' ( (lv_matches_2_0= ruleMatch ) )* '}' ) | ( (lv_matches_4_0= ruleMatch ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
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
                    match(input,18,FOLLOW_18_in_ruleWhenBlock613); 

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

                    match(input,19,FOLLOW_19_in_ruleWhenBlock645); 

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

                if ( (LA5_1==20) ) {
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

                    match(input,20,FOLLOW_20_in_ruleMatch779); 

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

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:483:4: '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleMatch810); 

                            createLeafNode(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:487:1: ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||(LA7_0>=RULE_INT && LA7_0<=RULE_FLOAT)||LA7_0==21||LA7_0==24||(LA7_0>=28 && LA7_0<=29)) ) {
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

                                if ( (LA6_0==22) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:511:4: ',' ( (lv_params_6_0= ruleParam ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleMatch843); 

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

                    match(input,23,FOLLOW_23_in_ruleMatch878); 

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

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:637:4: ':' ( (lv_var_2_0= ruleVariable ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleParam1074); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:682:1: ruleBindingExpression returns [EObject current=null] : (this_BindingExpressionHigh_0= ruleBindingExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )? ) ;
    public final EObject ruleBindingExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_BindingExpressionHigh_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:687:6: ( (this_BindingExpressionHigh_0= ruleBindingExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:688:1: (this_BindingExpressionHigh_0= ruleBindingExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:688:1: (this_BindingExpressionHigh_0= ruleBindingExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:689:5: this_BindingExpressionHigh_0= ruleBindingExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBindingExpressionAccess().getBindingExpressionHighParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_ruleBindingExpression1190);
            this_BindingExpressionHigh_0=ruleBindingExpressionHigh();
            _fsp--;

             
                    current = this_BindingExpressionHigh_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:697:1: ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:697:2: () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:697:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:698:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBindingExpressionAccess().getOperationLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBindingExpressionAccess().getOperationLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:713:2: ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:714:1: (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:714:1: (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:715:3: lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_ruleBindingExpression1216); 

                    			createLeafNode(grammarAccess.getBindingExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0(), "op"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_2_0, 
                    	        		"OPERATOR_LOW_PRIORITY", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:737:2: ( (lv_right_3_0= ruleBindingExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:738:1: (lv_right_3_0= ruleBindingExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:738:1: (lv_right_3_0= ruleBindingExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:739:3: lv_right_3_0= ruleBindingExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBindingExpressionAccess().getRightBindingExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBindingExpression_in_ruleBindingExpression1242);
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


    // $ANTLR start entryRuleBindingExpressionHigh
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:769:1: entryRuleBindingExpressionHigh returns [EObject current=null] : iv_ruleBindingExpressionHigh= ruleBindingExpressionHigh EOF ;
    public final EObject entryRuleBindingExpressionHigh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingExpressionHigh = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:770:2: (iv_ruleBindingExpressionHigh= ruleBindingExpressionHigh EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:771:2: iv_ruleBindingExpressionHigh= ruleBindingExpressionHigh EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingExpressionHighRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindingExpressionHigh_in_entryRuleBindingExpressionHigh1280);
            iv_ruleBindingExpressionHigh=ruleBindingExpressionHigh();
            _fsp--;

             current =iv_ruleBindingExpressionHigh; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingExpressionHigh1290); 

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
    // $ANTLR end entryRuleBindingExpressionHigh


    // $ANTLR start ruleBindingExpressionHigh
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:778:1: ruleBindingExpressionHigh returns [EObject current=null] : (this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpressionHigh ) ) )? ) ;
    public final EObject ruleBindingExpressionHigh() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_BindingTerminalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:783:6: ( (this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpressionHigh ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:784:1: (this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpressionHigh ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:784:1: (this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpressionHigh ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:785:5: this_BindingTerminalExpression_0= ruleBindingTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpressionHigh ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBindingExpressionHighAccess().getBindingTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_ruleBindingExpressionHigh1337);
            this_BindingTerminalExpression_0=ruleBindingTerminalExpression();
            _fsp--;

             
                    current = this_BindingTerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:793:1: ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpressionHigh ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:793:2: () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleBindingExpressionHigh ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:793:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:794:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBindingExpressionHighAccess().getOperationLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBindingExpressionHighAccess().getOperationLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:809:2: ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:810:1: (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:810:1: (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:811:3: lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_ruleBindingExpressionHigh1363); 

                    			createLeafNode(grammarAccess.getBindingExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0(), "op"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingExpressionHighRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_2_0, 
                    	        		"OPERATOR_HIGH_PRIORITY", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:833:2: ( (lv_right_3_0= ruleBindingExpressionHigh ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:834:1: (lv_right_3_0= ruleBindingExpressionHigh )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:834:1: (lv_right_3_0= ruleBindingExpressionHigh )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:835:3: lv_right_3_0= ruleBindingExpressionHigh
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBindingExpressionHighAccess().getRightBindingExpressionHighParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBindingExpressionHigh_in_ruleBindingExpressionHigh1389);
                    lv_right_3_0=ruleBindingExpressionHigh();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingExpressionHighRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_3_0, 
                    	        		"BindingExpressionHigh", 
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
    // $ANTLR end ruleBindingExpressionHigh


    // $ANTLR start entryRuleBindingTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:865:1: entryRuleBindingTerminalExpression returns [EObject current=null] : iv_ruleBindingTerminalExpression= ruleBindingTerminalExpression EOF ;
    public final EObject entryRuleBindingTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingTerminalExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:866:2: (iv_ruleBindingTerminalExpression= ruleBindingTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:867:2: iv_ruleBindingTerminalExpression= ruleBindingTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindingTerminalExpression_in_entryRuleBindingTerminalExpression1427);
            iv_ruleBindingTerminalExpression=ruleBindingTerminalExpression();
            _fsp--;

             current =iv_ruleBindingTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingTerminalExpression1437); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:874:1: ruleBindingTerminalExpression returns [EObject current=null] : ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_14= rulePrimitiveLiteral ) ;
    public final EObject ruleBindingTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BindingExpression_1 = null;

        EObject this_FeatureRefLiteral_3 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject this_PrimitiveLiteral_14 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:879:6: ( ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_14= rulePrimitiveLiteral ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:880:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_14= rulePrimitiveLiteral )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:880:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_14= rulePrimitiveLiteral )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==21) ) {
                    alt14=4;
                }
                else if ( (LA14_2==EOF||(LA14_2>=RULE_OPERATOR_LOW_PRIORITY && LA14_2<=RULE_OPERATOR_HIGH_PRIORITY)||LA14_2==20||(LA14_2>=22 && LA14_2<=23)) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("880:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_14= rulePrimitiveLiteral )", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 28:
            case 29:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("880:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_14= rulePrimitiveLiteral )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:880:2: ( '(' this_BindingExpression_1= ruleBindingExpression ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:880:2: ( '(' this_BindingExpression_1= ruleBindingExpression ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:880:4: '(' this_BindingExpression_1= ruleBindingExpression ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleBindingTerminalExpression1473); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getBindingExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1495);
                    this_BindingExpression_1=ruleBindingExpression();
                    _fsp--;

                     
                            current = this_BindingExpression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,23,FOLLOW_23_in_ruleBindingTerminalExpression1504); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:899:5: this_FeatureRefLiteral_3= ruleFeatureRefLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getFeatureRefLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFeatureRefLiteral_in_ruleBindingTerminalExpression1533);
                    this_FeatureRefLiteral_3=ruleFeatureRefLiteral();
                    _fsp--;

                     
                            current = this_FeatureRefLiteral_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:908:6: ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:908:6: ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:908:7: () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:908:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:909:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBindingTerminalExpressionAccess().getNotExpressionAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getNotExpressionAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,24,FOLLOW_24_in_ruleBindingTerminalExpression1558); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getExclamationMarkKeyword_2_1(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:923:1: ( (lv_exp_6_0= ruleBindingTerminalExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:924:1: (lv_exp_6_0= ruleBindingTerminalExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:924:1: (lv_exp_6_0= ruleBindingTerminalExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:925:3: lv_exp_6_0= ruleBindingTerminalExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingTerminalExpressionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBindingTerminalExpression_in_ruleBindingTerminalExpression1579);
                    lv_exp_6_0=ruleBindingTerminalExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"exp",
                    	        		lv_exp_6_0, 
                    	        		"BindingTerminalExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:948:6: ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:948:6: ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:948:7: () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:948:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:949:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getFunctionLiteralAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:959:2: ( ( RULE_ID ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:960:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:960:1: ( RULE_ID )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:961:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingTerminalExpression1614); 

                    		createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getFunctionFunctionCrossReference_3_1_0(), "function"); 
                    	

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:973:2: ( '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:973:4: '(' ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )? ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleBindingTerminalExpression1625); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_3_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:977:1: ( ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||(LA13_0>=RULE_INT && LA13_0<=RULE_FLOAT)||LA13_0==21||LA13_0==24||(LA13_0>=28 && LA13_0<=29)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:977:2: ( (lv_arguments_10_0= ruleBindingExpression ) ) ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:977:2: ( (lv_arguments_10_0= ruleBindingExpression ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:978:1: (lv_arguments_10_0= ruleBindingExpression )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:978:1: (lv_arguments_10_0= ruleBindingExpression )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:979:3: lv_arguments_10_0= ruleBindingExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsBindingExpressionParserRuleCall_3_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1647);
                            lv_arguments_10_0=ruleBindingExpression();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBindingTerminalExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"arguments",
                            	        		lv_arguments_10_0, 
                            	        		"BindingExpression", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1001:2: ( ',' ( (lv_arguments_12_0= ruleBindingExpression ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==22) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1001:4: ',' ( (lv_arguments_12_0= ruleBindingExpression ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleBindingTerminalExpression1658); 

                            	            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getCommaKeyword_3_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1005:1: ( (lv_arguments_12_0= ruleBindingExpression ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1006:1: (lv_arguments_12_0= ruleBindingExpression )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1006:1: (lv_arguments_12_0= ruleBindingExpression )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1007:3: lv_arguments_12_0= ruleBindingExpression
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getArgumentsBindingExpressionParserRuleCall_3_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1679);
                            	    lv_arguments_12_0=ruleBindingExpression();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getBindingTerminalExpressionRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"arguments",
                            	    	        		lv_arguments_12_0, 
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

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,23,FOLLOW_23_in_ruleBindingTerminalExpression1693); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_3_2_2(), null); 
                        

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1035:5: this_PrimitiveLiteral_14= rulePrimitiveLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_ruleBindingTerminalExpression1723);
                    this_PrimitiveLiteral_14=rulePrimitiveLiteral();
                    _fsp--;

                     
                            current = this_PrimitiveLiteral_14; 
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
    // $ANTLR end ruleBindingTerminalExpression


    // $ANTLR start entryRuleExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1051:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1052:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1053:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1758);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1768); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1060:1: ruleExpression returns [EObject current=null] : (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExpressionHigh_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1065:6: ( (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1066:1: (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1066:1: (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1067:5: this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExpressionHighParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleExpressionHigh_in_ruleExpression1815);
            this_ExpressionHigh_0=ruleExpressionHigh();
            _fsp--;

             
                    current = this_ExpressionHigh_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1075:1: ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1075:2: () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1075:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1076:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1091:2: ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1092:1: (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1092:1: (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1093:3: lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_ruleExpression1841); 

                    			createLeafNode(grammarAccess.getExpressionAccess().getOpOPERATOR_LOW_PRIORITYTerminalRuleCall_1_1_0(), "op"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_2_0, 
                    	        		"OPERATOR_LOW_PRIORITY", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1115:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1116:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1116:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1117:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression1867);
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


    // $ANTLR start entryRuleExpressionHigh
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1147:1: entryRuleExpressionHigh returns [EObject current=null] : iv_ruleExpressionHigh= ruleExpressionHigh EOF ;
    public final EObject entryRuleExpressionHigh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionHigh = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1148:2: (iv_ruleExpressionHigh= ruleExpressionHigh EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1149:2: iv_ruleExpressionHigh= ruleExpressionHigh EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionHighRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh1905);
            iv_ruleExpressionHigh=ruleExpressionHigh();
            _fsp--;

             current =iv_ruleExpressionHigh; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionHigh1915); 

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
    // $ANTLR end entryRuleExpressionHigh


    // $ANTLR start ruleExpressionHigh
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1156:1: ruleExpressionHigh returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? ) ;
    public final EObject ruleExpressionHigh() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1161:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1162:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1162:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1163:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionHighAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpressionHigh1962);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1171:1: ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1171:2: () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1171:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1172:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getExpressionHighAccess().getOperationLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionHighAccess().getOperationLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1187:2: ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1188:1: (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1188:1: (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1189:3: lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_ruleExpressionHigh1988); 

                    			createLeafNode(grammarAccess.getExpressionHighAccess().getOpOPERATOR_HIGH_PRIORITYTerminalRuleCall_1_1_0(), "op"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionHighRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_2_0, 
                    	        		"OPERATOR_HIGH_PRIORITY", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1211:2: ( (lv_right_3_0= ruleExpressionHigh ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1212:1: (lv_right_3_0= ruleExpressionHigh )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1212:1: (lv_right_3_0= ruleExpressionHigh )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1213:3: lv_right_3_0= ruleExpressionHigh
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionHighAccess().getRightExpressionHighParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionHigh_in_ruleExpressionHigh2014);
                    lv_right_3_0=ruleExpressionHigh();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionHighRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_3_0, 
                    	        		"ExpressionHigh", 
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
    // $ANTLR end ruleExpressionHigh


    // $ANTLR start entryRuleTerminalExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1243:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1244:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1245:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2052);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression2062); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1252:1: ruleTerminalExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;

        EObject this_VarRefLiteral_3 = null;

        EObject this_CreateClass_4 = null;

        EObject lv_exp_7_0 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_13_0 = null;

        EObject this_PrimitiveLiteral_15 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1257:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1258:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1258:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt19=1;
                }
                break;
            case 31:
                {
                alt19=2;
                }
                break;
            case 27:
                {
                alt19=3;
                }
                break;
            case 24:
                {
                alt19=4;
                }
                break;
            case RULE_ID:
                {
                alt19=5;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 28:
            case 29:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1258:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1258:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1258:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1258:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleTerminalExpression2098); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2120);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,23,FOLLOW_23_in_ruleTerminalExpression2129); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1277:5: this_VarRefLiteral_3= ruleVarRefLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVarRefLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVarRefLiteral_in_ruleTerminalExpression2158);
                    this_VarRefLiteral_3=ruleVarRefLiteral();
                    _fsp--;

                     
                            current = this_VarRefLiteral_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1287:5: this_CreateClass_4= ruleCreateClass
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCreateClass_in_ruleTerminalExpression2185);
                    this_CreateClass_4=ruleCreateClass();
                    _fsp--;

                     
                            current = this_CreateClass_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1296:6: ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1296:6: ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1296:7: () '!' ( (lv_exp_7_0= ruleTerminalExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1296:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1297:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,24,FOLLOW_24_in_ruleTerminalExpression2210); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_3_1(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1311:1: ( (lv_exp_7_0= ruleTerminalExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1312:1: (lv_exp_7_0= ruleTerminalExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1312:1: (lv_exp_7_0= ruleTerminalExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1313:3: lv_exp_7_0= ruleTerminalExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTerminalExpression_in_ruleTerminalExpression2231);
                    lv_exp_7_0=ruleTerminalExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"exp",
                    	        		lv_exp_7_0, 
                    	        		"TerminalExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1336:6: ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1336:6: ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1336:7: () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1336:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1337:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getFunctionLiteralAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1347:2: ( ( RULE_ID ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1348:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1348:1: ( RULE_ID )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1349:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression2266); 

                    		createLeafNode(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_4_1_0(), "function"); 
                    	

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1361:2: ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1361:4: '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleTerminalExpression2277); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1365:1: ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)||(LA18_0>=RULE_INT && LA18_0<=RULE_FLOAT)||LA18_0==21||LA18_0==24||(LA18_0>=27 && LA18_0<=29)||LA18_0==31) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1365:2: ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1365:2: ( (lv_arguments_11_0= ruleExpression ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1366:1: (lv_arguments_11_0= ruleExpression )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1366:1: (lv_arguments_11_0= ruleExpression )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1367:3: lv_arguments_11_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2299);
                            lv_arguments_11_0=ruleExpression();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"arguments",
                            	        		lv_arguments_11_0, 
                            	        		"Expression", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1389:2: ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==22) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1389:4: ',' ( (lv_arguments_13_0= ruleExpression ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleTerminalExpression2310); 

                            	            createLeafNode(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1393:1: ( (lv_arguments_13_0= ruleExpression ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1394:1: (lv_arguments_13_0= ruleExpression )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1394:1: (lv_arguments_13_0= ruleExpression )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1395:3: lv_arguments_13_0= ruleExpression
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2331);
                            	    lv_arguments_13_0=ruleExpression();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"arguments",
                            	    	        		lv_arguments_13_0, 
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
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,23,FOLLOW_23_in_ruleTerminalExpression2345); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_2_2(), null); 
                        

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1423:5: this_PrimitiveLiteral_15= rulePrimitiveLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_ruleTerminalExpression2375);
                    this_PrimitiveLiteral_15=rulePrimitiveLiteral();
                    _fsp--;

                     
                            current = this_PrimitiveLiteral_15; 
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
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRulePrimitiveLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1439:1: entryRulePrimitiveLiteral returns [EObject current=null] : iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF ;
    public final EObject entryRulePrimitiveLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1440:2: (iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1441:2: iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveLiteralRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral2410);
            iv_rulePrimitiveLiteral=rulePrimitiveLiteral();
            _fsp--;

             current =iv_rulePrimitiveLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveLiteral2420); 

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
    // $ANTLR end entryRulePrimitiveLiteral


    // $ANTLR start rulePrimitiveLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1448:1: rulePrimitiveLiteral returns [EObject current=null] : (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) ) ;
    public final EObject rulePrimitiveLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_0=null;
        EObject this_ListLiteral_0 = null;

        EObject this_StringLiteral_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1453:6: ( (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1454:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1454:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt20=1;
                }
                break;
            case RULE_STRING:
                {
                alt20=2;
                }
                break;
            case 28:
                {
                alt20=3;
                }
                break;
            case RULE_INT:
                {
                alt20=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt20=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1454:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1455:5: this_ListLiteral_0= ruleListLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_rulePrimitiveLiteral2467);
                    this_ListLiteral_0=ruleListLiteral();
                    _fsp--;

                     
                            current = this_ListLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1465:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimitiveLiteral2494);
                    this_StringLiteral_1=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1474:6: ruleNullLiteral
                    {
                    pushFollow(FOLLOW_ruleNullLiteral_in_rulePrimitiveLiteral2508);
                    ruleNullLiteral();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1475:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1475:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1475:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1475:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1476:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getPrimitiveLiteralAccess().getIntLiteralAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getIntLiteralAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1486:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1487:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1487:1: (lv_value_4_0= RULE_INT )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1488:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimitiveLiteral2533); 

                    			createLeafNode(grammarAccess.getPrimitiveLiteralAccess().getValueINTTerminalRuleCall_3_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_4_0, 
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
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1511:6: ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1511:6: ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1511:7: () ( (lv_value_6_0= RULE_BOOLEAN ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1511:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1512:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getPrimitiveLiteralAccess().getBooleanLiteralAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getBooleanLiteralAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1522:2: ( (lv_value_6_0= RULE_BOOLEAN ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1523:1: (lv_value_6_0= RULE_BOOLEAN )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1523:1: (lv_value_6_0= RULE_BOOLEAN )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1524:3: lv_value_6_0= RULE_BOOLEAN
                    {
                    lv_value_6_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rulePrimitiveLiteral2572); 

                    			createLeafNode(grammarAccess.getPrimitiveLiteralAccess().getValueBOOLEANTerminalRuleCall_4_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_6_0, 
                    	        		"BOOLEAN", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1547:6: ( () ( (lv_value_8_0= RULE_FLOAT ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1547:6: ( () ( (lv_value_8_0= RULE_FLOAT ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1547:7: () ( (lv_value_8_0= RULE_FLOAT ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1547:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1548:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getPrimitiveLiteralAccess().getFloatLiteralAction_5_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getFloatLiteralAction_5_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1558:2: ( (lv_value_8_0= RULE_FLOAT ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1559:1: (lv_value_8_0= RULE_FLOAT )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1559:1: (lv_value_8_0= RULE_FLOAT )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1560:3: lv_value_8_0= RULE_FLOAT
                    {
                    lv_value_8_0=(Token)input.LT(1);
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rulePrimitiveLiteral2611); 

                    			createLeafNode(grammarAccess.getPrimitiveLiteralAccess().getValueFLOATTerminalRuleCall_5_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimitiveLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_8_0, 
                    	        		"FLOAT", 
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
    // $ANTLR end rulePrimitiveLiteral


    // $ANTLR start entryRuleFeatureRefLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1590:1: entryRuleFeatureRefLiteral returns [EObject current=null] : iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF ;
    public final EObject entryRuleFeatureRefLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRefLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1591:2: (iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1592:2: iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRefLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral2653);
            iv_ruleFeatureRefLiteral=ruleFeatureRefLiteral();
            _fsp--;

             current =iv_ruleFeatureRefLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRefLiteral2663); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1599:1: ruleFeatureRefLiteral returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleFeatureRefLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1604:6: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1605:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1605:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1606:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1606:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1607:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRefLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureRefLiteral2705); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1627:1: entryRuleThenBlock returns [EObject current=null] : iv_ruleThenBlock= ruleThenBlock EOF ;
    public final EObject entryRuleThenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenBlock = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1628:2: (iv_ruleThenBlock= ruleThenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1629:2: iv_ruleThenBlock= ruleThenBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getThenBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleThenBlock_in_entryRuleThenBlock2740);
            iv_ruleThenBlock=ruleThenBlock();
            _fsp--;

             current =iv_ruleThenBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenBlock2750); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1636:1: ruleThenBlock returns [EObject current=null] : ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) ) ;
    public final EObject ruleThenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1641:6: ( ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1642:1: ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1642:1: ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1642:2: ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1642:2: ( 'then' | '->' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1642:2: ( 'then' | '->' )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1642:4: 'then'
                    {
                    match(input,25,FOLLOW_25_in_ruleThenBlock2786); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getThenKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1647:7: '->'
                    {
                    match(input,26,FOLLOW_26_in_ruleThenBlock2802); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1651:2: ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||(LA23_0>=RULE_INT && LA23_0<=RULE_FLOAT)||LA23_0==21||LA23_0==24||(LA23_0>=27 && LA23_0<=29)||LA23_0==31||LA23_0==36) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1651:2: ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1651:3: ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1651:3: ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1651:5: '{' ( (lv_statements_3_0= ruleStatement ) )* '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleThenBlock2815); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_1_0_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1655:1: ( (lv_statements_3_0= ruleStatement ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||(LA22_0>=RULE_INT && LA22_0<=RULE_FLOAT)||LA22_0==21||LA22_0==24||(LA22_0>=27 && LA22_0<=29)||LA22_0==31||LA22_0==36) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1656:1: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1656:1: (lv_statements_3_0= ruleStatement )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1657:3: lv_statements_3_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleThenBlock2836);
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
                    	    break loop22;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleThenBlock2847); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_1_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1684:6: ( (lv_statements_5_0= ruleStatement ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1684:6: ( (lv_statements_5_0= ruleStatement ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1685:1: (lv_statements_5_0= ruleStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1685:1: (lv_statements_5_0= ruleStatement )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1686:3: lv_statements_5_0= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleThenBlock2875);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1716:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1717:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1718:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2912);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2922); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1725:1: ruleStatement returns [EObject current=null] : (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateStatement_0 = null;

        EObject this_UpdateStatement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1730:6: ( (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1731:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1731:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)||(LA24_0>=RULE_INT && LA24_0<=RULE_FLOAT)||LA24_0==21||LA24_0==24||(LA24_0>=27 && LA24_0<=29)||LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1731:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1732:5: this_CreateStatement_0= ruleCreateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCreateStatement_in_ruleStatement2969);
                    this_CreateStatement_0=ruleCreateStatement();
                    _fsp--;

                     
                            current = this_CreateStatement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1742:5: this_UpdateStatement_1= ruleUpdateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleStatement2996);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1758:1: entryRuleCreateStatement returns [EObject current=null] : iv_ruleCreateStatement= ruleCreateStatement EOF ;
    public final EObject entryRuleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1759:2: (iv_ruleCreateStatement= ruleCreateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1760:2: iv_ruleCreateStatement= ruleCreateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement3031);
            iv_ruleCreateStatement=ruleCreateStatement();
            _fsp--;

             current =iv_ruleCreateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateStatement3041); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1767:1: ruleCreateStatement returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1772:6: ( ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==20) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:3: ( (lv_var_0_0= ruleVariable ) ) ':'
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:3: ( (lv_var_0_0= ruleVariable ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1774:1: (lv_var_0_0= ruleVariable )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1774:1: (lv_var_0_0= ruleVariable )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1775:3: lv_var_0_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleCreateStatement3088);
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

                    match(input,20,FOLLOW_20_in_ruleCreateStatement3098); 

                            createLeafNode(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1801:3: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1802:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1802:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1803:3: lv_expression_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCreateStatement3121);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1833:1: entryRuleCreateClass returns [EObject current=null] : iv_ruleCreateClass= ruleCreateClass EOF ;
    public final EObject entryRuleCreateClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateClass = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1834:2: (iv_ruleCreateClass= ruleCreateClass EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1835:2: iv_ruleCreateClass= ruleCreateClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreateClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreateClass_in_entryRuleCreateClass3157);
            iv_ruleCreateClass=ruleCreateClass();
            _fsp--;

             current =iv_ruleCreateClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateClass3167); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1842:1: ruleCreateClass returns [EObject current=null] : ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) ;
    public final EObject ruleCreateClass() throws RecognitionException {
        EObject current = null;

        EObject lv_setters_3_0 = null;

        EObject lv_setters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1847:6: ( ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1848:1: ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1848:1: ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1848:3: 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            {
            match(input,27,FOLLOW_27_in_ruleCreateClass3202); 

                    createLeafNode(grammarAccess.getCreateClassAccess().getNewKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1852:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1853:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1853:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1854:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCreateClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateClass3220); 

            		createLeafNode(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0(), "type"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1866:2: ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1866:4: '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleCreateClass3231); 

                            createLeafNode(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1870:1: ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1870:2: ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1870:2: ( (lv_setters_3_0= ruleSetter ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1871:1: (lv_setters_3_0= ruleSetter )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1871:1: (lv_setters_3_0= ruleSetter )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1872:3: lv_setters_3_0= ruleSetter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSetter_in_ruleCreateClass3253);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1894:2: ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==22) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1894:4: ',' ( (lv_setters_5_0= ruleSetter ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleCreateClass3264); 

                            	            createLeafNode(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1898:1: ( (lv_setters_5_0= ruleSetter ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1899:1: (lv_setters_5_0= ruleSetter )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1899:1: (lv_setters_5_0= ruleSetter )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1900:3: lv_setters_5_0= ruleSetter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSetter_in_ruleCreateClass3285);
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
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleCreateClass3299); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1934:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1935:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1936:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3337);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3347); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1943:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1948:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1949:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1949:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1950:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1950:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1951:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3388); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1981:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1982:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1983:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNullLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral3429);
            iv_ruleNullLiteral=ruleNullLiteral();
            _fsp--;

             current =iv_ruleNullLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral3440); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1990:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1995:6: (kw= 'null' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1997:2: kw= 'null'
            {
            kw=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleNullLiteral3477); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2010:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2011:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2012:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral3516);
            iv_ruleListLiteral=ruleListLiteral();
            _fsp--;

             current =iv_ruleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral3526); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2019:1: ruleListLiteral returns [EObject current=null] : ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2024:6: ( ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2025:1: ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2025:1: ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2025:3: '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']'
            {
            match(input,29,FOLLOW_29_in_ruleListLiteral3561); 

                    createLeafNode(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2029:1: ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||(LA30_0>=RULE_INT && LA30_0<=RULE_FLOAT)||LA30_0==21||LA30_0==24||(LA30_0>=27 && LA30_0<=29)||LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2029:2: ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )*
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2029:2: ( (lv_items_1_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2030:1: (lv_items_1_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2030:1: (lv_items_1_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2031:3: lv_items_1_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral3583);
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2053:2: ( ',' ( (lv_items_3_0= ruleExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==22) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2053:4: ',' ( (lv_items_3_0= ruleExpression ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleListLiteral3594); 

                    	            createLeafNode(grammarAccess.getListLiteralAccess().getCommaKeyword_1_1_0(), null); 
                    	        
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2057:1: ( (lv_items_3_0= ruleExpression ) )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2058:1: (lv_items_3_0= ruleExpression )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2058:1: (lv_items_3_0= ruleExpression )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2059:3: lv_items_3_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral3615);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,30,FOLLOW_30_in_ruleListLiteral3629); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2093:1: entryRuleVarRefLiteral returns [EObject current=null] : iv_ruleVarRefLiteral= ruleVarRefLiteral EOF ;
    public final EObject entryRuleVarRefLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2094:2: (iv_ruleVarRefLiteral= ruleVarRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2095:2: iv_ruleVarRefLiteral= ruleVarRefLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarRefLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral3665);
            iv_ruleVarRefLiteral=ruleVarRefLiteral();
            _fsp--;

             current =iv_ruleVarRefLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRefLiteral3675); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2102:1: ruleVarRefLiteral returns [EObject current=null] : ( '$' ( ( RULE_ID ) ) ) ;
    public final EObject ruleVarRefLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2107:6: ( ( '$' ( ( RULE_ID ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2108:1: ( '$' ( ( RULE_ID ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2108:1: ( '$' ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2108:3: '$' ( ( RULE_ID ) )
            {
            match(input,31,FOLLOW_31_in_ruleVarRefLiteral3710); 

                    createLeafNode(grammarAccess.getVarRefLiteralAccess().getDollarSignKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2112:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2113:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2113:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2114:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVarRefLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarRefLiteral3728); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2134:1: entryRuleSetter returns [EObject current=null] : iv_ruleSetter= ruleSetter EOF ;
    public final EObject entryRuleSetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetter = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2135:2: (iv_ruleSetter= ruleSetter EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2136:2: iv_ruleSetter= ruleSetter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetterRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetter_in_entryRuleSetter3764);
            iv_ruleSetter=ruleSetter();
            _fsp--;

             current =iv_ruleSetter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetter3774); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2143:1: ruleSetter returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? ) ;
    public final EObject ruleSetter() throws RecognitionException {
        EObject current = null;

        Token lv_guard_4_0=null;
        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2148:6: ( ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2149:1: ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2149:1: ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2149:2: ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2149:2: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2150:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2150:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2151:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSetterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetter3817); 

            		createLeafNode(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0(), "property"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2163:2: ( ':' | '+=' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            else if ( (LA31_0==32) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2163:2: ( ':' | '+=' )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2163:4: ':'
                    {
                    match(input,20,FOLLOW_20_in_ruleSetter3828); 

                            createLeafNode(grammarAccess.getSetterAccess().getColonKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2168:7: '+='
                    {
                    match(input,32,FOLLOW_32_in_ruleSetter3844); 

                            createLeafNode(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2172:2: ( (lv_expression_3_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2173:1: (lv_expression_3_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2173:1: (lv_expression_3_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2174:3: lv_expression_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSetter3866);
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

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2196:2: ( (lv_guard_4_0= 'guard' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2197:1: (lv_guard_4_0= 'guard' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2197:1: (lv_guard_4_0= 'guard' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2198:3: lv_guard_4_0= 'guard'
                    {
                    lv_guard_4_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSetter3884); 

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


    // $ANTLR start entryRuleFunction
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2225:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2226:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2227:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction3934);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction3944); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2234:1: ruleFunction returns [EObject current=null] : ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2239:6: ( ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2240:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2240:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2240:3: 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) )
            {
            match(input,34,FOLLOW_34_in_ruleFunction3979); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFunctionKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2244:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2245:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2245:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2246:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3996); 

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

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2268:2: ( ( ruleFQN ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2269:1: ( ruleFQN )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2269:1: ( ruleFQN )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2270:3: ruleFQN
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeCrossReference_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleFunction4024);
            ruleFQN();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,35,FOLLOW_35_in_ruleFunction4034); 

                    createLeafNode(grammarAccess.getFunctionAccess().getNumberSignKeyword_3(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2288:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2289:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2289:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2290:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction4052); 

            		createLeafNode(grammarAccess.getFunctionAccess().getOperationJvmOperationCrossReference_4_0(), "operation"); 
            	

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2310:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2311:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2312:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUpdateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement4088);
            iv_ruleUpdateStatement=ruleUpdateStatement();
            _fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement4098); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2319:1: ruleUpdateStatement returns [EObject current=null] : ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_setters_3_0 = null;

        EObject lv_setters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2324:6: ( ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2325:1: ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2325:1: ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2325:3: 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            {
            match(input,36,FOLLOW_36_in_ruleUpdateStatement4133); 

                    createLeafNode(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2329:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2330:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2330:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2331:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement4151); 

            		createLeafNode(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0(), "varRef"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2343:2: ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2343:4: '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleUpdateStatement4162); 

                            createLeafNode(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2347:1: ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2347:2: ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2347:2: ( (lv_setters_3_0= ruleSetter ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2348:1: (lv_setters_3_0= ruleSetter )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2348:1: (lv_setters_3_0= ruleSetter )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2349:3: lv_setters_3_0= ruleSetter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSetter_in_ruleUpdateStatement4184);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2371:2: ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==22) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2371:4: ',' ( (lv_setters_5_0= ruleSetter ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleUpdateStatement4195); 

                            	            createLeafNode(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2375:1: ( (lv_setters_5_0= ruleSetter ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2376:1: (lv_setters_5_0= ruleSetter )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2376:1: (lv_setters_5_0= ruleSetter )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2377:3: lv_setters_5_0= ruleSetter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSetter_in_ruleUpdateStatement4216);
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
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleUpdateStatement4230); 

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


    // $ANTLR start entryRuleFQN
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2411:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2412:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2413:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4269);
            iv_ruleFQN=ruleFQN();
            _fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4280); 

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
    // $ANTLR end entryRuleFQN


    // $ANTLR start ruleFQN
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2420:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2425:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2426:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2426:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2426:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4320); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2433:1: (kw= '.' this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==37) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2434:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,37,FOLLOW_37_in_ruleFQN4339); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4354); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end ruleFQN


 

    public static final BitSet FOLLOW_ruleScaffolding_in_entryRuleScaffolding75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffolding85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_ruleScaffolding131 = new BitSet(new long[]{0x0000000400010002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_ruleScaffolding152 = new BitSet(new long[]{0x0000000400010002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_entryRuleScaffoldingElement189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffoldingElement199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleScaffoldingElement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleScaffoldingElement273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_entryRuleScaffold308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffold318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleScaffold353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScaffold370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRule456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule473 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_ruleRule499 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleThenBlock_in_ruleRule520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_entryRuleWhenBlock556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenBlock566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWhenBlock601 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleWhenBlock613 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleMatch_in_ruleWhenBlock634 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleWhenBlock645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_ruleWhenBlock673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_entryRuleMatch712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatch722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMatch769 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMatch779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMatch799 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleMatch810 = new BitSet(new long[]{0x0000000031A00730L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMatch832 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleMatch843 = new BitSet(new long[]{0x0000000031200730L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMatch864 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleMatch878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleParam1063 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleParam1074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleParam1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_entryRuleBindingExpression1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingExpression1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_ruleBindingExpression1190 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_ruleBindingExpression1216 = new BitSet(new long[]{0x0000000031200730L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleBindingExpression1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_entryRuleBindingExpressionHigh1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingExpressionHigh1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_ruleBindingExpressionHigh1337 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_ruleBindingExpressionHigh1363 = new BitSet(new long[]{0x0000000031200730L});
    public static final BitSet FOLLOW_ruleBindingExpressionHigh_in_ruleBindingExpressionHigh1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_entryRuleBindingTerminalExpression1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingTerminalExpression1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBindingTerminalExpression1473 = new BitSet(new long[]{0x0000000031200730L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1495 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBindingTerminalExpression1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_ruleBindingTerminalExpression1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBindingTerminalExpression1558 = new BitSet(new long[]{0x0000000031200730L});
    public static final BitSet FOLLOW_ruleBindingTerminalExpression_in_ruleBindingTerminalExpression1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingTerminalExpression1614 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBindingTerminalExpression1625 = new BitSet(new long[]{0x0000000031A00730L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1647 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleBindingTerminalExpression1658 = new BitSet(new long[]{0x0000000031200730L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1679 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleBindingTerminalExpression1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_ruleBindingTerminalExpression1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_ruleExpression1815 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_ruleExpression1841 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh1905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionHigh1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpressionHigh1962 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_ruleExpressionHigh1988 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_ruleExpressionHigh2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTerminalExpression2098 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2120 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTerminalExpression2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_ruleTerminalExpression2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_ruleTerminalExpression2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTerminalExpression2210 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleTerminalExpression2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression2266 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTerminalExpression2277 = new BitSet(new long[]{0x00000000B9A00730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2299 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTerminalExpression2310 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2331 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTerminalExpression2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_ruleTerminalExpression2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral2410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteral2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rulePrimitiveLiteral2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimitiveLiteral2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rulePrimitiveLiteral2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimitiveLiteral2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rulePrimitiveLiteral2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rulePrimitiveLiteral2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral2653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRefLiteral2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureRefLiteral2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_entryRuleThenBlock2740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenBlock2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleThenBlock2786 = new BitSet(new long[]{0x00000010B9240730L});
    public static final BitSet FOLLOW_26_in_ruleThenBlock2802 = new BitSet(new long[]{0x00000010B9240730L});
    public static final BitSet FOLLOW_18_in_ruleThenBlock2815 = new BitSet(new long[]{0x00000010B9280730L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenBlock2836 = new BitSet(new long[]{0x00000010B9280730L});
    public static final BitSet FOLLOW_19_in_ruleThenBlock2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenBlock2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_ruleStatement2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleStatement2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement3031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateStatement3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCreateStatement3088 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCreateStatement3098 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreateStatement3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_entryRuleCreateClass3157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateClass3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCreateClass3202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateClass3220 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleCreateClass3231 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleCreateClass3253 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleCreateClass3264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleCreateClass3285 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleCreateClass3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral3429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNullLiteral3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral3516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleListLiteral3561 = new BitSet(new long[]{0x00000000F9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral3583 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_22_in_ruleListLiteral3594 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral3615 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_30_in_ruleListLiteral3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral3665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRefLiteral3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVarRefLiteral3710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarRefLiteral3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_entryRuleSetter3764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetter3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetter3817 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleSetter3828 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_32_in_ruleSetter3844 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSetter3866 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleSetter3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction3934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFunction3979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFunction4024 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFunction4034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement4088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUpdateStatement4133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement4151 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleUpdateStatement4162 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleUpdateStatement4184 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleUpdateStatement4195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleUpdateStatement4216 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleUpdateStatement4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4320 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleFQN4339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4354 = new BitSet(new long[]{0x0000002000000002L});

}