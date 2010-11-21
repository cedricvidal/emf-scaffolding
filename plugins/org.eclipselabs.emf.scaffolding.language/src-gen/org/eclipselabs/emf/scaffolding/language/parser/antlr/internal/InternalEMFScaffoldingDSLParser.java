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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:874:1: ruleBindingTerminalExpression returns [EObject current=null] : ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | this_PrimitiveLiteral_12= rulePrimitiveLiteral ) ;
    public final EObject ruleBindingTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BindingExpression_1 = null;

        EObject this_FeatureRefLiteral_3 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_exp_10_0 = null;

        EObject this_PrimitiveLiteral_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:879:6: ( ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | this_PrimitiveLiteral_12= rulePrimitiveLiteral ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:880:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | this_PrimitiveLiteral_12= rulePrimitiveLiteral )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:880:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | this_PrimitiveLiteral_12= rulePrimitiveLiteral )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==21) ) {
                    alt12=4;
                }
                else if ( (LA12_2==EOF||(LA12_2>=RULE_OPERATOR_LOW_PRIORITY && LA12_2<=RULE_OPERATOR_HIGH_PRIORITY)||LA12_2==20||(LA12_2>=22 && LA12_2<=23)) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("880:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | this_PrimitiveLiteral_12= rulePrimitiveLiteral )", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 28:
            case 29:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("880:1: ( ( '(' this_BindingExpression_1= ruleBindingExpression ')' ) | this_FeatureRefLiteral_3= ruleFeatureRefLiteral | ( () '!' ( (lv_exp_6_0= ruleBindingTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) ) | this_PrimitiveLiteral_12= rulePrimitiveLiteral )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
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
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:948:6: ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:948:6: ( () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:948:7: () ( ( RULE_ID ) ) ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' )
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:973:2: ( '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:973:4: '(' ( (lv_exp_10_0= ruleBindingExpression ) ) ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleBindingTerminalExpression1625); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getLeftParenthesisKeyword_3_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:977:1: ( (lv_exp_10_0= ruleBindingExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:978:1: (lv_exp_10_0= ruleBindingExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:978:1: (lv_exp_10_0= ruleBindingExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:979:3: lv_exp_10_0= ruleBindingExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getExpBindingExpressionParserRuleCall_3_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1646);
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

                    match(input,23,FOLLOW_23_in_ruleBindingTerminalExpression1656); 

                            createLeafNode(grammarAccess.getBindingTerminalExpressionAccess().getRightParenthesisKeyword_3_2_2(), null); 
                        

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1007:5: this_PrimitiveLiteral_12= rulePrimitiveLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBindingTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_ruleBindingTerminalExpression1686);
                    this_PrimitiveLiteral_12=rulePrimitiveLiteral();
                    _fsp--;

                     
                            current = this_PrimitiveLiteral_12; 
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1023:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1024:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1025:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1721);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1731); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1032:1: ruleExpression returns [EObject current=null] : (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExpressionHigh_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1037:6: ( (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1038:1: (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1038:1: (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1039:5: this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExpressionHighParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleExpressionHigh_in_ruleExpression1778);
            this_ExpressionHigh_0=ruleExpressionHigh();
            _fsp--;

             
                    current = this_ExpressionHigh_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1047:1: ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1047:2: () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1047:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1048:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1063:2: ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1064:1: (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1064:1: (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1065:3: lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_ruleExpression1804); 

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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1087:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1088:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1088:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1089:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression1830);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1119:1: entryRuleExpressionHigh returns [EObject current=null] : iv_ruleExpressionHigh= ruleExpressionHigh EOF ;
    public final EObject entryRuleExpressionHigh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionHigh = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1120:2: (iv_ruleExpressionHigh= ruleExpressionHigh EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1121:2: iv_ruleExpressionHigh= ruleExpressionHigh EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionHighRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh1868);
            iv_ruleExpressionHigh=ruleExpressionHigh();
            _fsp--;

             current =iv_ruleExpressionHigh; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionHigh1878); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1128:1: ruleExpressionHigh returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? ) ;
    public final EObject ruleExpressionHigh() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1133:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1134:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1134:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1135:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionHighAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpressionHigh1925);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1143:1: ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1143:2: () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1143:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1144:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1159:2: ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1160:1: (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1160:1: (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1161:3: lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_ruleExpressionHigh1951); 

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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1183:2: ( (lv_right_3_0= ruleExpressionHigh ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1184:1: (lv_right_3_0= ruleExpressionHigh )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1184:1: (lv_right_3_0= ruleExpressionHigh )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1185:3: lv_right_3_0= ruleExpressionHigh
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionHighAccess().getRightExpressionHighParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionHigh_in_ruleExpressionHigh1977);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1215:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1216:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1217:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2015);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression2025); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1224:1: ruleTerminalExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral ) ;
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
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1229:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1230:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1230:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            case 24:
                {
                alt17=4;
                }
                break;
            case RULE_ID:
                {
                alt17=5;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
            case RULE_FLOAT:
            case 28:
            case 29:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1230:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_VarRefLiteral_3= ruleVarRefLiteral | this_CreateClass_4= ruleCreateClass | ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) ) | ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1230:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1230:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1230:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleTerminalExpression2061); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2083);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,23,FOLLOW_23_in_ruleTerminalExpression2092); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1249:5: this_VarRefLiteral_3= ruleVarRefLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVarRefLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVarRefLiteral_in_ruleTerminalExpression2121);
                    this_VarRefLiteral_3=ruleVarRefLiteral();
                    _fsp--;

                     
                            current = this_VarRefLiteral_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1259:5: this_CreateClass_4= ruleCreateClass
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCreateClass_in_ruleTerminalExpression2148);
                    this_CreateClass_4=ruleCreateClass();
                    _fsp--;

                     
                            current = this_CreateClass_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1268:6: ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1268:6: ( () '!' ( (lv_exp_7_0= ruleTerminalExpression ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1268:7: () '!' ( (lv_exp_7_0= ruleTerminalExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1268:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1269:5: 
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

                    match(input,24,FOLLOW_24_in_ruleTerminalExpression2173); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_3_1(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1283:1: ( (lv_exp_7_0= ruleTerminalExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1284:1: (lv_exp_7_0= ruleTerminalExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1284:1: (lv_exp_7_0= ruleTerminalExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1285:3: lv_exp_7_0= ruleTerminalExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTerminalExpression_in_ruleTerminalExpression2194);
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
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1308:6: ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1308:6: ( () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1308:7: () ( ( RULE_ID ) ) ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1308:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1309:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1319:2: ( ( RULE_ID ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1320:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1320:1: ( RULE_ID )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1321:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression2229); 

                    		createLeafNode(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_4_1_0(), "function"); 
                    	

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1333:2: ( '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1333:4: '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleTerminalExpression2240); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1337:1: ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=RULE_INT && LA16_0<=RULE_FLOAT)||LA16_0==21||LA16_0==24||(LA16_0>=27 && LA16_0<=29)||LA16_0==31) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1337:2: ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1337:2: ( (lv_arguments_11_0= ruleExpression ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1338:1: (lv_arguments_11_0= ruleExpression )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1338:1: (lv_arguments_11_0= ruleExpression )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1339:3: lv_arguments_11_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2262);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1361:2: ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==22) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1361:4: ',' ( (lv_arguments_13_0= ruleExpression ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleTerminalExpression2273); 

                            	            createLeafNode(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1365:1: ( (lv_arguments_13_0= ruleExpression ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1366:1: (lv_arguments_13_0= ruleExpression )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1366:1: (lv_arguments_13_0= ruleExpression )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1367:3: lv_arguments_13_0= ruleExpression
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2294);
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
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,23,FOLLOW_23_in_ruleTerminalExpression2308); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_2_2(), null); 
                        

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1395:5: this_PrimitiveLiteral_15= rulePrimitiveLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_ruleTerminalExpression2338);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1411:1: entryRulePrimitiveLiteral returns [EObject current=null] : iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF ;
    public final EObject entryRulePrimitiveLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1412:2: (iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1413:2: iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveLiteralRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral2373);
            iv_rulePrimitiveLiteral=rulePrimitiveLiteral();
            _fsp--;

             current =iv_rulePrimitiveLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveLiteral2383); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1420:1: rulePrimitiveLiteral returns [EObject current=null] : (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) ) ;
    public final EObject rulePrimitiveLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_0=null;
        EObject this_ListLiteral_0 = null;

        EObject this_StringLiteral_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1425:6: ( (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1426:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1426:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case RULE_STRING:
                {
                alt18=2;
                }
                break;
            case 28:
                {
                alt18=3;
                }
                break;
            case RULE_INT:
                {
                alt18=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt18=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1426:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1427:5: this_ListLiteral_0= ruleListLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_rulePrimitiveLiteral2430);
                    this_ListLiteral_0=ruleListLiteral();
                    _fsp--;

                     
                            current = this_ListLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1437:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimitiveLiteral2457);
                    this_StringLiteral_1=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1446:6: ruleNullLiteral
                    {
                    pushFollow(FOLLOW_ruleNullLiteral_in_rulePrimitiveLiteral2471);
                    ruleNullLiteral();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1447:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1447:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1447:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1447:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1448:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1458:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1459:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1459:1: (lv_value_4_0= RULE_INT )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1460:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimitiveLiteral2496); 

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
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1483:6: ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1483:6: ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1483:7: () ( (lv_value_6_0= RULE_BOOLEAN ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1483:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1484:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1494:2: ( (lv_value_6_0= RULE_BOOLEAN ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1495:1: (lv_value_6_0= RULE_BOOLEAN )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1495:1: (lv_value_6_0= RULE_BOOLEAN )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1496:3: lv_value_6_0= RULE_BOOLEAN
                    {
                    lv_value_6_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rulePrimitiveLiteral2535); 

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
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1519:6: ( () ( (lv_value_8_0= RULE_FLOAT ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1519:6: ( () ( (lv_value_8_0= RULE_FLOAT ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1519:7: () ( (lv_value_8_0= RULE_FLOAT ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1519:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1520:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1530:2: ( (lv_value_8_0= RULE_FLOAT ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1531:1: (lv_value_8_0= RULE_FLOAT )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1531:1: (lv_value_8_0= RULE_FLOAT )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1532:3: lv_value_8_0= RULE_FLOAT
                    {
                    lv_value_8_0=(Token)input.LT(1);
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rulePrimitiveLiteral2574); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1562:1: entryRuleFeatureRefLiteral returns [EObject current=null] : iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF ;
    public final EObject entryRuleFeatureRefLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRefLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1563:2: (iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1564:2: iv_ruleFeatureRefLiteral= ruleFeatureRefLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRefLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral2616);
            iv_ruleFeatureRefLiteral=ruleFeatureRefLiteral();
            _fsp--;

             current =iv_ruleFeatureRefLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRefLiteral2626); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1571:1: ruleFeatureRefLiteral returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleFeatureRefLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1576:6: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1577:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1577:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1578:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1578:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1579:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRefLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureRefLiteral2668); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1599:1: entryRuleThenBlock returns [EObject current=null] : iv_ruleThenBlock= ruleThenBlock EOF ;
    public final EObject entryRuleThenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenBlock = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1600:2: (iv_ruleThenBlock= ruleThenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1601:2: iv_ruleThenBlock= ruleThenBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getThenBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleThenBlock_in_entryRuleThenBlock2703);
            iv_ruleThenBlock=ruleThenBlock();
            _fsp--;

             current =iv_ruleThenBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenBlock2713); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1608:1: ruleThenBlock returns [EObject current=null] : ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) ) ;
    public final EObject ruleThenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1613:6: ( ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1614:1: ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1614:1: ( ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1614:2: ( 'then' | '->' ) ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1614:2: ( 'then' | '->' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            else if ( (LA19_0==26) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1614:2: ( 'then' | '->' )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1614:4: 'then'
                    {
                    match(input,25,FOLLOW_25_in_ruleThenBlock2749); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getThenKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1619:7: '->'
                    {
                    match(input,26,FOLLOW_26_in_ruleThenBlock2765); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1623:2: ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||(LA21_0>=RULE_INT && LA21_0<=RULE_FLOAT)||LA21_0==21||LA21_0==24||(LA21_0>=27 && LA21_0<=29)||LA21_0==31||LA21_0==36) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1623:2: ( ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) | ( (lv_statements_5_0= ruleStatement ) ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1623:3: ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1623:3: ( '{' ( (lv_statements_3_0= ruleStatement ) )* '}' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1623:5: '{' ( (lv_statements_3_0= ruleStatement ) )* '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleThenBlock2778); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_1_0_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1627:1: ( (lv_statements_3_0= ruleStatement ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||(LA20_0>=RULE_INT && LA20_0<=RULE_FLOAT)||LA20_0==21||LA20_0==24||(LA20_0>=27 && LA20_0<=29)||LA20_0==31||LA20_0==36) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1628:1: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1628:1: (lv_statements_3_0= ruleStatement )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1629:3: lv_statements_3_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleThenBlock2799);
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
                    	    break loop20;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleThenBlock2810); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_1_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1656:6: ( (lv_statements_5_0= ruleStatement ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1656:6: ( (lv_statements_5_0= ruleStatement ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1657:1: (lv_statements_5_0= ruleStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1657:1: (lv_statements_5_0= ruleStatement )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1658:3: lv_statements_5_0= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleThenBlock2838);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1688:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1689:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1690:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2875);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2885); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1697:1: ruleStatement returns [EObject current=null] : (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateStatement_0 = null;

        EObject this_UpdateStatement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1702:6: ( (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1703:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1703:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||(LA22_0>=RULE_INT && LA22_0<=RULE_FLOAT)||LA22_0==21||LA22_0==24||(LA22_0>=27 && LA22_0<=29)||LA22_0==31) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1703:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1704:5: this_CreateStatement_0= ruleCreateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCreateStatement_in_ruleStatement2932);
                    this_CreateStatement_0=ruleCreateStatement();
                    _fsp--;

                     
                            current = this_CreateStatement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1714:5: this_UpdateStatement_1= ruleUpdateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleStatement2959);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1730:1: entryRuleCreateStatement returns [EObject current=null] : iv_ruleCreateStatement= ruleCreateStatement EOF ;
    public final EObject entryRuleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1731:2: (iv_ruleCreateStatement= ruleCreateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1732:2: iv_ruleCreateStatement= ruleCreateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement2994);
            iv_ruleCreateStatement=ruleCreateStatement();
            _fsp--;

             current =iv_ruleCreateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateStatement3004); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1739:1: ruleCreateStatement returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1744:6: ( ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1745:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1745:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1745:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1745:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==20) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1745:3: ( (lv_var_0_0= ruleVariable ) ) ':'
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1745:3: ( (lv_var_0_0= ruleVariable ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1746:1: (lv_var_0_0= ruleVariable )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1746:1: (lv_var_0_0= ruleVariable )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1747:3: lv_var_0_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleCreateStatement3051);
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

                    match(input,20,FOLLOW_20_in_ruleCreateStatement3061); 

                            createLeafNode(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1773:3: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1774:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1774:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1775:3: lv_expression_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCreateStatement3084);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1805:1: entryRuleCreateClass returns [EObject current=null] : iv_ruleCreateClass= ruleCreateClass EOF ;
    public final EObject entryRuleCreateClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateClass = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1806:2: (iv_ruleCreateClass= ruleCreateClass EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1807:2: iv_ruleCreateClass= ruleCreateClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreateClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreateClass_in_entryRuleCreateClass3120);
            iv_ruleCreateClass=ruleCreateClass();
            _fsp--;

             current =iv_ruleCreateClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateClass3130); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1814:1: ruleCreateClass returns [EObject current=null] : ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) ;
    public final EObject ruleCreateClass() throws RecognitionException {
        EObject current = null;

        EObject lv_setters_3_0 = null;

        EObject lv_setters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1819:6: ( ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1820:1: ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1820:1: ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1820:3: 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            {
            match(input,27,FOLLOW_27_in_ruleCreateClass3165); 

                    createLeafNode(grammarAccess.getCreateClassAccess().getNewKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1824:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1825:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1825:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1826:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCreateClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateClass3183); 

            		createLeafNode(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0(), "type"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1838:2: ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1838:4: '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleCreateClass3194); 

                            createLeafNode(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1842:1: ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1842:2: ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1842:2: ( (lv_setters_3_0= ruleSetter ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1843:1: (lv_setters_3_0= ruleSetter )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1843:1: (lv_setters_3_0= ruleSetter )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1844:3: lv_setters_3_0= ruleSetter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSetter_in_ruleCreateClass3216);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1866:2: ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==22) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1866:4: ',' ( (lv_setters_5_0= ruleSetter ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleCreateClass3227); 

                            	            createLeafNode(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1870:1: ( (lv_setters_5_0= ruleSetter ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1871:1: (lv_setters_5_0= ruleSetter )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1871:1: (lv_setters_5_0= ruleSetter )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1872:3: lv_setters_5_0= ruleSetter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSetter_in_ruleCreateClass3248);
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
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleCreateClass3262); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1906:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1907:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1908:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3300);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3310); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1915:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1920:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1921:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1921:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1922:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1922:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1923:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3351); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1953:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1954:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1955:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNullLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral3392);
            iv_ruleNullLiteral=ruleNullLiteral();
            _fsp--;

             current =iv_ruleNullLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral3403); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1962:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1967:6: (kw= 'null' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1969:2: kw= 'null'
            {
            kw=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleNullLiteral3440); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1982:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1983:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1984:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral3479);
            iv_ruleListLiteral=ruleListLiteral();
            _fsp--;

             current =iv_ruleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral3489); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1991:1: ruleListLiteral returns [EObject current=null] : ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1996:6: ( ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1997:1: ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1997:1: ( '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1997:3: '[' ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )? ']'
            {
            match(input,29,FOLLOW_29_in_ruleListLiteral3524); 

                    createLeafNode(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2001:1: ( ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=RULE_INT && LA28_0<=RULE_FLOAT)||LA28_0==21||LA28_0==24||(LA28_0>=27 && LA28_0<=29)||LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2001:2: ( (lv_items_1_0= ruleExpression ) ) ( ',' ( (lv_items_3_0= ruleExpression ) ) )*
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2001:2: ( (lv_items_1_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2002:1: (lv_items_1_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2002:1: (lv_items_1_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2003:3: lv_items_1_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral3546);
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2025:2: ( ',' ( (lv_items_3_0= ruleExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==22) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2025:4: ',' ( (lv_items_3_0= ruleExpression ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleListLiteral3557); 

                    	            createLeafNode(grammarAccess.getListLiteralAccess().getCommaKeyword_1_1_0(), null); 
                    	        
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2029:1: ( (lv_items_3_0= ruleExpression ) )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2030:1: (lv_items_3_0= ruleExpression )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2030:1: (lv_items_3_0= ruleExpression )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2031:3: lv_items_3_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral3578);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,30,FOLLOW_30_in_ruleListLiteral3592); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2065:1: entryRuleVarRefLiteral returns [EObject current=null] : iv_ruleVarRefLiteral= ruleVarRefLiteral EOF ;
    public final EObject entryRuleVarRefLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2066:2: (iv_ruleVarRefLiteral= ruleVarRefLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2067:2: iv_ruleVarRefLiteral= ruleVarRefLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarRefLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral3628);
            iv_ruleVarRefLiteral=ruleVarRefLiteral();
            _fsp--;

             current =iv_ruleVarRefLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRefLiteral3638); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2074:1: ruleVarRefLiteral returns [EObject current=null] : ( '$' ( ( RULE_ID ) ) ) ;
    public final EObject ruleVarRefLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2079:6: ( ( '$' ( ( RULE_ID ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2080:1: ( '$' ( ( RULE_ID ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2080:1: ( '$' ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2080:3: '$' ( ( RULE_ID ) )
            {
            match(input,31,FOLLOW_31_in_ruleVarRefLiteral3673); 

                    createLeafNode(grammarAccess.getVarRefLiteralAccess().getDollarSignKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2084:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2085:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2085:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2086:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVarRefLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarRefLiteral3691); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2106:1: entryRuleSetter returns [EObject current=null] : iv_ruleSetter= ruleSetter EOF ;
    public final EObject entryRuleSetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetter = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2107:2: (iv_ruleSetter= ruleSetter EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2108:2: iv_ruleSetter= ruleSetter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetterRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetter_in_entryRuleSetter3727);
            iv_ruleSetter=ruleSetter();
            _fsp--;

             current =iv_ruleSetter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetter3737); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2115:1: ruleSetter returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? ) ;
    public final EObject ruleSetter() throws RecognitionException {
        EObject current = null;

        Token lv_guard_4_0=null;
        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2120:6: ( ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2121:1: ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2121:1: ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2121:2: ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2121:2: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2122:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2122:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2123:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSetterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetter3780); 

            		createLeafNode(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0(), "property"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2135:2: ( ':' | '+=' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            else if ( (LA29_0==32) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2135:2: ( ':' | '+=' )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2135:4: ':'
                    {
                    match(input,20,FOLLOW_20_in_ruleSetter3791); 

                            createLeafNode(grammarAccess.getSetterAccess().getColonKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2140:7: '+='
                    {
                    match(input,32,FOLLOW_32_in_ruleSetter3807); 

                            createLeafNode(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2144:2: ( (lv_expression_3_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2145:1: (lv_expression_3_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2145:1: (lv_expression_3_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2146:3: lv_expression_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSetter3829);
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

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2168:2: ( (lv_guard_4_0= 'guard' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2169:1: (lv_guard_4_0= 'guard' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2169:1: (lv_guard_4_0= 'guard' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2170:3: lv_guard_4_0= 'guard'
                    {
                    lv_guard_4_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSetter3847); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2197:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2198:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2199:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction3897);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction3907); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2206:1: ruleFunction returns [EObject current=null] : ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2211:6: ( ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2212:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2212:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2212:3: 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) )
            {
            match(input,34,FOLLOW_34_in_ruleFunction3942); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFunctionKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2216:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2217:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2217:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2218:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3959); 

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

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2240:2: ( ( ruleFQN ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2241:1: ( ruleFQN )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2241:1: ( ruleFQN )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2242:3: ruleFQN
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeCrossReference_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleFunction3987);
            ruleFQN();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,35,FOLLOW_35_in_ruleFunction3997); 

                    createLeafNode(grammarAccess.getFunctionAccess().getNumberSignKeyword_3(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2260:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2261:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2261:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2262:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction4015); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2282:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2283:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2284:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUpdateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement4051);
            iv_ruleUpdateStatement=ruleUpdateStatement();
            _fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement4061); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2291:1: ruleUpdateStatement returns [EObject current=null] : ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_setters_3_0 = null;

        EObject lv_setters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2296:6: ( ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2297:1: ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2297:1: ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2297:3: 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            {
            match(input,36,FOLLOW_36_in_ruleUpdateStatement4096); 

                    createLeafNode(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2301:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2302:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2302:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2303:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement4114); 

            		createLeafNode(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0(), "varRef"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2315:2: ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2315:4: '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleUpdateStatement4125); 

                            createLeafNode(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2319:1: ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2319:2: ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2319:2: ( (lv_setters_3_0= ruleSetter ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2320:1: (lv_setters_3_0= ruleSetter )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2320:1: (lv_setters_3_0= ruleSetter )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2321:3: lv_setters_3_0= ruleSetter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSetter_in_ruleUpdateStatement4147);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2343:2: ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==22) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2343:4: ',' ( (lv_setters_5_0= ruleSetter ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleUpdateStatement4158); 

                            	            createLeafNode(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2347:1: ( (lv_setters_5_0= ruleSetter ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2348:1: (lv_setters_5_0= ruleSetter )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2348:1: (lv_setters_5_0= ruleSetter )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2349:3: lv_setters_5_0= ruleSetter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSetter_in_ruleUpdateStatement4179);
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
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleUpdateStatement4193); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2383:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2384:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2385:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4232);
            iv_ruleFQN=ruleFQN();
            _fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4243); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2392:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2397:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2398:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2398:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2398:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4283); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2405:1: (kw= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==37) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2406:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,37,FOLLOW_37_in_ruleFQN4302); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4317); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop34;
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
    public static final BitSet FOLLOW_21_in_ruleBindingTerminalExpression1625 = new BitSet(new long[]{0x0000000031200730L});
    public static final BitSet FOLLOW_ruleBindingExpression_in_ruleBindingTerminalExpression1646 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBindingTerminalExpression1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_ruleBindingTerminalExpression1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_ruleExpression1778 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_ruleExpression1804 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionHigh1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpressionHigh1925 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_ruleExpressionHigh1951 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_ruleExpressionHigh1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTerminalExpression2061 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2083 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTerminalExpression2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_ruleTerminalExpression2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_ruleTerminalExpression2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTerminalExpression2173 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleTerminalExpression2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression2229 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTerminalExpression2240 = new BitSet(new long[]{0x00000000B9A00730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2262 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTerminalExpression2273 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2294 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTerminalExpression2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_ruleTerminalExpression2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral2373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteral2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rulePrimitiveLiteral2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimitiveLiteral2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rulePrimitiveLiteral2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimitiveLiteral2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rulePrimitiveLiteral2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rulePrimitiveLiteral2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRefLiteral_in_entryRuleFeatureRefLiteral2616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRefLiteral2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureRefLiteral2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_entryRuleThenBlock2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenBlock2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleThenBlock2749 = new BitSet(new long[]{0x00000010B9240730L});
    public static final BitSet FOLLOW_26_in_ruleThenBlock2765 = new BitSet(new long[]{0x00000010B9240730L});
    public static final BitSet FOLLOW_18_in_ruleThenBlock2778 = new BitSet(new long[]{0x00000010B9280730L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenBlock2799 = new BitSet(new long[]{0x00000010B9280730L});
    public static final BitSet FOLLOW_19_in_ruleThenBlock2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenBlock2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_ruleStatement2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleStatement2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement2994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateStatement3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCreateStatement3051 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCreateStatement3061 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreateStatement3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_entryRuleCreateClass3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateClass3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCreateClass3165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateClass3183 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleCreateClass3194 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleCreateClass3216 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleCreateClass3227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleCreateClass3248 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleCreateClass3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral3392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNullLiteral3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral3479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleListLiteral3524 = new BitSet(new long[]{0x00000000F9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral3546 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_22_in_ruleListLiteral3557 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral3578 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_30_in_ruleListLiteral3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefLiteral_in_entryRuleVarRefLiteral3628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRefLiteral3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVarRefLiteral3673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarRefLiteral3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_entryRuleSetter3727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetter3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetter3780 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleSetter3791 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_32_in_ruleSetter3807 = new BitSet(new long[]{0x00000000B9200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSetter3829 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleSetter3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction3897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFunction3942 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFunction3987 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFunction3997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement4051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUpdateStatement4096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement4114 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleUpdateStatement4125 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleUpdateStatement4147 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleUpdateStatement4158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleUpdateStatement4179 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleUpdateStatement4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4283 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleFQN4302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4317 = new BitSet(new long[]{0x0000002000000002L});

}