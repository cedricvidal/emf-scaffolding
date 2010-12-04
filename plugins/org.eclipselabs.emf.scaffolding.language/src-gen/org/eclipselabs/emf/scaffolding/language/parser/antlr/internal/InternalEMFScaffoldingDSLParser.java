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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_OPERATOR_LOW_PRIORITY", "RULE_OPERATOR_HIGH_PRIORITY", "RULE_INT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scaffold'", "'rule'", "'when'", "'{'", "'}'", "':'", "'('", "','", "')'", "'!'", "'.'", "'then'", "'->'", "';'", "'new'", "'null'", "'['", "']'", "'+='", "'guard'", "'function'", "'#'", "'update'"
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

                if ( (LA1_0==16||LA1_0==35) ) {
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
            else if ( (LA2_0==35) ) {
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:199:1: ruleScaffold returns [EObject current=null] : ( 'scaffold' ( ( RULE_STRING ) ) ) ;
    public final EObject ruleScaffold() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:204:6: ( ( 'scaffold' ( ( RULE_STRING ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:205:1: ( 'scaffold' ( ( RULE_STRING ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:205:1: ( 'scaffold' ( ( RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:205:3: 'scaffold' ( ( RULE_STRING ) )
            {
            match(input,15,FOLLOW_15_in_ruleScaffold353); 

                    createLeafNode(grammarAccess.getScaffoldAccess().getScaffoldKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:209:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:210:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:210:1: ( RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:211:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getScaffoldRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScaffold371); 

            		createLeafNode(grammarAccess.getScaffoldAccess().getRefPackageEPackageCrossReference_1_0(), "refPackage"); 
            	

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:231:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:232:2: (iv_ruleRule= ruleRule EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:233:2: iv_ruleRule= ruleRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule407);
            iv_ruleRule=ruleRule();
            _fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule417); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:240:1: ruleRule returns [EObject current=null] : ( 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_when_2_0 = null;

        EObject lv_then_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:245:6: ( ( 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:246:1: ( 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:246:1: ( 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:246:3: 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_when_2_0= ruleWhenBlock ) ) ( (lv_then_3_0= ruleThenBlock ) )
            {
            match(input,16,FOLLOW_16_in_ruleRule452); 

                    createLeafNode(grammarAccess.getRuleAccess().getRuleKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:250:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:251:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:251:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:252:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule469); 

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

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:274:2: ( (lv_when_2_0= ruleWhenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:275:1: (lv_when_2_0= ruleWhenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:275:1: (lv_when_2_0= ruleWhenBlock )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:276:3: lv_when_2_0= ruleWhenBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getWhenWhenBlockParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWhenBlock_in_ruleRule495);
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

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:298:2: ( (lv_then_3_0= ruleThenBlock ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:299:1: (lv_then_3_0= ruleThenBlock )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:299:1: (lv_then_3_0= ruleThenBlock )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:300:3: lv_then_3_0= ruleThenBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getThenThenBlockParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleThenBlock_in_ruleRule516);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:330:1: entryRuleWhenBlock returns [EObject current=null] : iv_ruleWhenBlock= ruleWhenBlock EOF ;
    public final EObject entryRuleWhenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenBlock = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:331:2: (iv_ruleWhenBlock= ruleWhenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:332:2: iv_ruleWhenBlock= ruleWhenBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWhenBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleWhenBlock_in_entryRuleWhenBlock552);
            iv_ruleWhenBlock=ruleWhenBlock();
            _fsp--;

             current =iv_ruleWhenBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenBlock562); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:339:1: ruleWhenBlock returns [EObject current=null] : ( () 'when' ( ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' ) | ( (lv_matches_5_0= ruleMatch ) ) ) ) ;
    public final EObject ruleWhenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_matches_3_0 = null;

        EObject lv_matches_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:344:6: ( ( () 'when' ( ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' ) | ( (lv_matches_5_0= ruleMatch ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:345:1: ( () 'when' ( ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' ) | ( (lv_matches_5_0= ruleMatch ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:345:1: ( () 'when' ( ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' ) | ( (lv_matches_5_0= ruleMatch ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:345:2: () 'when' ( ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' ) | ( (lv_matches_5_0= ruleMatch ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:345:2: ()
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:346:5: 
            {
             
                    temp=factory.create(grammarAccess.getWhenBlockAccess().getWhenBlockAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getWhenBlockAccess().getWhenBlockAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,17,FOLLOW_17_in_ruleWhenBlock606); 

                    createLeafNode(grammarAccess.getWhenBlockAccess().getWhenKeyword_1(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:360:1: ( ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' ) | ( (lv_matches_5_0= ruleMatch ) ) )
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
                    new NoViableAltException("360:1: ( ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' ) | ( (lv_matches_5_0= ruleMatch ) ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:360:2: ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:360:2: ( '{' ( (lv_matches_3_0= ruleMatch ) )* '}' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:360:4: '{' ( (lv_matches_3_0= ruleMatch ) )* '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleWhenBlock618); 

                            createLeafNode(grammarAccess.getWhenBlockAccess().getLeftCurlyBracketKeyword_2_0_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:364:1: ( (lv_matches_3_0= ruleMatch ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:365:1: (lv_matches_3_0= ruleMatch )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:365:1: (lv_matches_3_0= ruleMatch )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:366:3: lv_matches_3_0= ruleMatch
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_2_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMatch_in_ruleWhenBlock639);
                    	    lv_matches_3_0=ruleMatch();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getWhenBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"matches",
                    	    	        		lv_matches_3_0, 
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

                    match(input,19,FOLLOW_19_in_ruleWhenBlock650); 

                            createLeafNode(grammarAccess.getWhenBlockAccess().getRightCurlyBracketKeyword_2_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:393:6: ( (lv_matches_5_0= ruleMatch ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:393:6: ( (lv_matches_5_0= ruleMatch ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:394:1: (lv_matches_5_0= ruleMatch )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:394:1: (lv_matches_5_0= ruleMatch )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:395:3: lv_matches_5_0= ruleMatch
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWhenBlockAccess().getMatchesMatchParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMatch_in_ruleWhenBlock678);
                    lv_matches_5_0=ruleMatch();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWhenBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"matches",
                    	        		lv_matches_5_0, 
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:427:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:428:2: (iv_ruleMatch= ruleMatch EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:429:2: iv_ruleMatch= ruleMatch EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMatchRule(), currentNode); 
            pushFollow(FOLLOW_ruleMatch_in_entryRuleMatch717);
            iv_ruleMatch=ruleMatch();
            _fsp--;

             current =iv_ruleMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatch727); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:436:1: ruleMatch returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )? ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:441:6: ( ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:442:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:442:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:442:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( ( RULE_ID ) ) ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:442:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )?
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
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:442:3: ( (lv_var_0_0= ruleVariable ) ) ':'
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:442:3: ( (lv_var_0_0= ruleVariable ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:443:1: (lv_var_0_0= ruleVariable )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:443:1: (lv_var_0_0= ruleVariable )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:444:3: lv_var_0_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMatchAccess().getVarVariableParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleMatch774);
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

                    match(input,20,FOLLOW_20_in_ruleMatch784); 

                            createLeafNode(grammarAccess.getMatchAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:470:3: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:471:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:471:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:472:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMatchRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMatch804); 

            		createLeafNode(grammarAccess.getMatchAccess().getTypeEClassCrossReference_1_0(), "type"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:484:2: ( '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:484:4: '(' ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )? ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleMatch815); 

                            createLeafNode(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:488:1: ( ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||(LA7_0>=RULE_INT && LA7_0<=RULE_FLOAT)||LA7_0==21||LA7_0==24||(LA7_0>=29 && LA7_0<=31)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:488:2: ( (lv_params_4_0= ruleParam ) ) ( ',' ( (lv_params_6_0= ruleParam ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:488:2: ( (lv_params_4_0= ruleParam ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:489:1: (lv_params_4_0= ruleParam )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:489:1: (lv_params_4_0= ruleParam )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:490:3: lv_params_4_0= ruleParam
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleParam_in_ruleMatch837);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:512:2: ( ',' ( (lv_params_6_0= ruleParam ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==22) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:512:4: ',' ( (lv_params_6_0= ruleParam ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleMatch848); 

                            	            createLeafNode(grammarAccess.getMatchAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:516:1: ( (lv_params_6_0= ruleParam ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:517:1: (lv_params_6_0= ruleParam )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:517:1: (lv_params_6_0= ruleParam )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:518:3: lv_params_6_0= ruleParam
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getMatchAccess().getParamsParamParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParam_in_ruleMatch869);
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

                    match(input,23,FOLLOW_23_in_ruleMatch883); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:552:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:553:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:554:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable921);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable931); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:561:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:566:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:567:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:567:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:568:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:568:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:569:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable972); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:599:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:600:2: (iv_ruleParam= ruleParam EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:601:2: iv_ruleParam= ruleParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1012);
            iv_ruleParam=ruleParam();
            _fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1022); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:608:1: ruleParam returns [EObject current=null] : ( ( (lv_property_0_0= ruleExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )? ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;

        EObject lv_var_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:613:6: ( ( ( (lv_property_0_0= ruleExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:614:1: ( ( (lv_property_0_0= ruleExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:614:1: ( ( (lv_property_0_0= ruleExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:614:2: ( (lv_property_0_0= ruleExpression ) ) ( ':' ( (lv_var_2_0= ruleVariable ) ) )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:614:2: ( (lv_property_0_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:615:1: (lv_property_0_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:615:1: (lv_property_0_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:616:3: lv_property_0_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParamAccess().getPropertyExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleParam1068);
            lv_property_0_0=ruleExpression();
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
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:638:2: ( ':' ( (lv_var_2_0= ruleVariable ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:638:4: ':' ( (lv_var_2_0= ruleVariable ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleParam1079); 

                            createLeafNode(grammarAccess.getParamAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:642:1: ( (lv_var_2_0= ruleVariable ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:643:1: (lv_var_2_0= ruleVariable )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:643:1: (lv_var_2_0= ruleVariable )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:644:3: lv_var_2_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParamAccess().getVarVariableParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleParam1100);
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


    // $ANTLR start entryRuleExpression
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:674:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:675:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:676:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1138);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1148); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:683:1: ruleExpression returns [EObject current=null] : (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExpressionHigh_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:688:6: ( (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:689:1: (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:689:1: (this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:690:5: this_ExpressionHigh_0= ruleExpressionHigh ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExpressionHighParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleExpressionHigh_in_ruleExpression1195);
            this_ExpressionHigh_0=ruleExpressionHigh();
            _fsp--;

             
                    current = this_ExpressionHigh_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:698:1: ( () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_OPERATOR_LOW_PRIORITY) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:698:2: () ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:698:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:699:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:714:2: ( (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:715:1: (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:715:1: (lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:716:3: lv_op_2_0= RULE_OPERATOR_LOW_PRIORITY
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,RULE_OPERATOR_LOW_PRIORITY,FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_ruleExpression1221); 

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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:738:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:739:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:739:1: (lv_right_3_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:740:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression1247);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:770:1: entryRuleExpressionHigh returns [EObject current=null] : iv_ruleExpressionHigh= ruleExpressionHigh EOF ;
    public final EObject entryRuleExpressionHigh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionHigh = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:771:2: (iv_ruleExpressionHigh= ruleExpressionHigh EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:772:2: iv_ruleExpressionHigh= ruleExpressionHigh EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionHighRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh1285);
            iv_ruleExpressionHigh=ruleExpressionHigh();
            _fsp--;

             current =iv_ruleExpressionHigh; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionHigh1295); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:779:1: ruleExpressionHigh returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? ) ;
    public final EObject ruleExpressionHigh() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:784:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:785:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:785:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:786:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionHighAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpressionHigh1342);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:794:1: ( () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OPERATOR_HIGH_PRIORITY) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:794:2: () ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) ) ( (lv_right_3_0= ruleExpressionHigh ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:794:2: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:795:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:810:2: ( (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:811:1: (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:811:1: (lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:812:3: lv_op_2_0= RULE_OPERATOR_HIGH_PRIORITY
                    {
                    lv_op_2_0=(Token)input.LT(1);
                    match(input,RULE_OPERATOR_HIGH_PRIORITY,FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_ruleExpressionHigh1368); 

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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:834:2: ( (lv_right_3_0= ruleExpressionHigh ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:835:1: (lv_right_3_0= ruleExpressionHigh )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:835:1: (lv_right_3_0= ruleExpressionHigh )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:836:3: lv_right_3_0= ruleExpressionHigh
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionHighAccess().getRightExpressionHighParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionHigh_in_ruleExpressionHigh1394);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:866:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:867:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:868:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1432);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1442); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:875:1: ruleTerminalExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | this_CreateClass_3= ruleCreateClass | ( () '!' ( (lv_exp_6_0= ruleTerminalExpression ) ) ) | this_SymbolRef_7= ruleSymbolRef | ( () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;

        EObject this_CreateClass_3 = null;

        EObject lv_exp_6_0 = null;

        EObject this_SymbolRef_7 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_13_0 = null;

        EObject this_PrimitiveLiteral_15 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:880:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | this_CreateClass_3= ruleCreateClass | ( () '!' ( (lv_exp_6_0= ruleTerminalExpression ) ) ) | this_SymbolRef_7= ruleSymbolRef | ( () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:881:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_CreateClass_3= ruleCreateClass | ( () '!' ( (lv_exp_6_0= ruleTerminalExpression ) ) ) | this_SymbolRef_7= ruleSymbolRef | ( () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:881:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_CreateClass_3= ruleCreateClass | ( () '!' ( (lv_exp_6_0= ruleTerminalExpression ) ) ) | this_SymbolRef_7= ruleSymbolRef | ( () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            case RULE_ID:
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4==21) ) {
                    alt14=5;
                }
                else if ( (LA14_4==EOF||(LA14_4>=RULE_OPERATOR_LOW_PRIORITY && LA14_4<=RULE_OPERATOR_HIGH_PRIORITY)||LA14_4==16||(LA14_4>=19 && LA14_4<=20)||(LA14_4>=22 && LA14_4<=23)||LA14_4==25||LA14_4==28||LA14_4==32||(LA14_4>=34 && LA14_4<=35)) ) {
                    alt14=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("881:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_CreateClass_3= ruleCreateClass | ( () '!' ( (lv_exp_6_0= ruleTerminalExpression ) ) ) | this_SymbolRef_7= ruleSymbolRef | ( () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )", 14, 4, input);

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
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("881:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | this_CreateClass_3= ruleCreateClass | ( () '!' ( (lv_exp_6_0= ruleTerminalExpression ) ) ) | this_SymbolRef_7= ruleSymbolRef | ( () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' ) | this_PrimitiveLiteral_15= rulePrimitiveLiteral )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:881:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:881:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:881:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleTerminalExpression1478); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression1500);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,23,FOLLOW_23_in_ruleTerminalExpression1509); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:900:5: this_CreateClass_3= ruleCreateClass
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCreateClassParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCreateClass_in_ruleTerminalExpression1538);
                    this_CreateClass_3=ruleCreateClass();
                    _fsp--;

                     
                            current = this_CreateClass_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:909:6: ( () '!' ( (lv_exp_6_0= ruleTerminalExpression ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:909:6: ( () '!' ( (lv_exp_6_0= ruleTerminalExpression ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:909:7: () '!' ( (lv_exp_6_0= ruleTerminalExpression ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:909:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:910:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,24,FOLLOW_24_in_ruleTerminalExpression1563); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getExclamationMarkKeyword_2_1(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:924:1: ( (lv_exp_6_0= ruleTerminalExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:925:1: (lv_exp_6_0= ruleTerminalExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:925:1: (lv_exp_6_0= ruleTerminalExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:926:3: lv_exp_6_0= ruleTerminalExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpTerminalExpressionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTerminalExpression_in_ruleTerminalExpression1584);
                    lv_exp_6_0=ruleTerminalExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"exp",
                    	        		lv_exp_6_0, 
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
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:950:5: this_SymbolRef_7= ruleSymbolRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getSymbolRefParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSymbolRef_in_ruleTerminalExpression1613);
                    this_SymbolRef_7=ruleSymbolRef();
                    _fsp--;

                     
                            current = this_SymbolRef_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:959:6: ( () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:959:6: ( () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:959:7: () ( ( RULE_ID ) ) '(' ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )? ')'
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:959:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:960:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:970:2: ( ( RULE_ID ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:971:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:971:1: ( RULE_ID )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:972:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression1646); 

                    		createLeafNode(grammarAccess.getTerminalExpressionAccess().getFunctionFunctionCrossReference_4_1_0(), "function"); 
                    	

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleTerminalExpression1656); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_4_2(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:988:1: ( ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||(LA13_0>=RULE_INT && LA13_0<=RULE_FLOAT)||LA13_0==21||LA13_0==24||(LA13_0>=29 && LA13_0<=31)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:988:2: ( (lv_arguments_11_0= ruleExpression ) ) ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:988:2: ( (lv_arguments_11_0= ruleExpression ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:989:1: (lv_arguments_11_0= ruleExpression )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:989:1: (lv_arguments_11_0= ruleExpression )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:990:3: lv_arguments_11_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression1678);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1012:2: ( ',' ( (lv_arguments_13_0= ruleExpression ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==22) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1012:4: ',' ( (lv_arguments_13_0= ruleExpression ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleTerminalExpression1689); 

                            	            createLeafNode(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_4_3_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1016:1: ( (lv_arguments_13_0= ruleExpression ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1017:1: (lv_arguments_13_0= ruleExpression )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1017:1: (lv_arguments_13_0= ruleExpression )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1018:3: lv_arguments_13_0= ruleExpression
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgumentsExpressionParserRuleCall_4_3_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression1710);
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
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,23,FOLLOW_23_in_ruleTerminalExpression1724); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_4_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1046:5: this_PrimitiveLiteral_15= rulePrimitiveLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getPrimitiveLiteralParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveLiteral_in_ruleTerminalExpression1753);
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


    // $ANTLR start entryRuleSymbolRef
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1062:1: entryRuleSymbolRef returns [EObject current=null] : iv_ruleSymbolRef= ruleSymbolRef EOF ;
    public final EObject entryRuleSymbolRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolRef = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1063:2: (iv_ruleSymbolRef= ruleSymbolRef EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1064:2: iv_ruleSymbolRef= ruleSymbolRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSymbolRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleSymbolRef_in_entryRuleSymbolRef1788);
            iv_ruleSymbolRef=ruleSymbolRef();
            _fsp--;

             current =iv_ruleSymbolRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolRef1798); 

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
    // $ANTLR end entryRuleSymbolRef


    // $ANTLR start ruleSymbolRef
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1071:1: ruleSymbolRef returns [EObject current=null] : ( () ( ( RULE_ID ) ) ( () ( (lv_segment_3_0= ruleSelectorSegment ) ) )? ) ;
    public final EObject ruleSymbolRef() throws RecognitionException {
        EObject current = null;

        EObject lv_segment_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1076:6: ( ( () ( ( RULE_ID ) ) ( () ( (lv_segment_3_0= ruleSelectorSegment ) ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1077:1: ( () ( ( RULE_ID ) ) ( () ( (lv_segment_3_0= ruleSelectorSegment ) ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1077:1: ( () ( ( RULE_ID ) ) ( () ( (lv_segment_3_0= ruleSelectorSegment ) ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1077:2: () ( ( RULE_ID ) ) ( () ( (lv_segment_3_0= ruleSelectorSegment ) ) )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1077:2: ()
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1078:5: 
            {
             
                    temp=factory.create(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1088:2: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1089:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1089:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1090:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSymbolRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolRef1850); 

            		createLeafNode(grammarAccess.getSymbolRefAccess().getRefSymbolCrossReference_1_0(), "ref"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1102:2: ( () ( (lv_segment_3_0= ruleSelectorSegment ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1102:3: () ( (lv_segment_3_0= ruleSelectorSegment ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1102:3: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1103:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSymbolRefAccess().getSelectorSymbolAction_2_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "symbol", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSymbolRefAccess().getSelectorSymbolAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1118:2: ( (lv_segment_3_0= ruleSelectorSegment ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1119:1: (lv_segment_3_0= ruleSelectorSegment )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1119:1: (lv_segment_3_0= ruleSelectorSegment )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1120:3: lv_segment_3_0= ruleSelectorSegment
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSymbolRefAccess().getSegmentSelectorSegmentParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSelectorSegment_in_ruleSymbolRef1881);
                    lv_segment_3_0=ruleSelectorSegment();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSymbolRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"segment",
                    	        		lv_segment_3_0, 
                    	        		"SelectorSegment", 
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
    // $ANTLR end ruleSymbolRef


    // $ANTLR start entryRulePrimitiveLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1150:1: entryRulePrimitiveLiteral returns [EObject current=null] : iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF ;
    public final EObject entryRulePrimitiveLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1151:2: (iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1152:2: iv_rulePrimitiveLiteral= rulePrimitiveLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveLiteralRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral1919);
            iv_rulePrimitiveLiteral=rulePrimitiveLiteral();
            _fsp--;

             current =iv_rulePrimitiveLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveLiteral1929); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1159:1: rulePrimitiveLiteral returns [EObject current=null] : (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) ) ;
    public final EObject rulePrimitiveLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_0=null;
        EObject this_ListLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_NullLiteral_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1164:6: ( (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1165:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1165:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            case RULE_INT:
                {
                alt16=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt16=5;
                }
                break;
            case RULE_FLOAT:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1165:1: (this_ListLiteral_0= ruleListLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_8_0= RULE_FLOAT ) ) ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1166:5: this_ListLiteral_0= ruleListLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getListLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleListLiteral_in_rulePrimitiveLiteral1976);
                    this_ListLiteral_0=ruleListLiteral();
                    _fsp--;

                     
                            current = this_ListLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1176:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getStringLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimitiveLiteral2003);
                    this_StringLiteral_1=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1186:5: this_NullLiteral_2= ruleNullLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveLiteralAccess().getNullLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNullLiteral_in_rulePrimitiveLiteral2030);
                    this_NullLiteral_2=ruleNullLiteral();
                    _fsp--;

                     
                            current = this_NullLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1195:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1195:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1195:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1195:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1196:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1206:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1207:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1207:1: (lv_value_4_0= RULE_INT )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1208:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimitiveLiteral2062); 

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
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1231:6: ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1231:6: ( () ( (lv_value_6_0= RULE_BOOLEAN ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1231:7: () ( (lv_value_6_0= RULE_BOOLEAN ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1231:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1232:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1242:2: ( (lv_value_6_0= RULE_BOOLEAN ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1243:1: (lv_value_6_0= RULE_BOOLEAN )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1243:1: (lv_value_6_0= RULE_BOOLEAN )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1244:3: lv_value_6_0= RULE_BOOLEAN
                    {
                    lv_value_6_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rulePrimitiveLiteral2101); 

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
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1267:6: ( () ( (lv_value_8_0= RULE_FLOAT ) ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1267:6: ( () ( (lv_value_8_0= RULE_FLOAT ) ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1267:7: () ( (lv_value_8_0= RULE_FLOAT ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1267:7: ()
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1268:5: 
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

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1278:2: ( (lv_value_8_0= RULE_FLOAT ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1279:1: (lv_value_8_0= RULE_FLOAT )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1279:1: (lv_value_8_0= RULE_FLOAT )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1280:3: lv_value_8_0= RULE_FLOAT
                    {
                    lv_value_8_0=(Token)input.LT(1);
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rulePrimitiveLiteral2140); 

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


    // $ANTLR start entryRuleSelectorSegment
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1310:1: entryRuleSelectorSegment returns [EObject current=null] : iv_ruleSelectorSegment= ruleSelectorSegment EOF ;
    public final EObject entryRuleSelectorSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorSegment = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1311:2: (iv_ruleSelectorSegment= ruleSelectorSegment EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1312:2: iv_ruleSelectorSegment= ruleSelectorSegment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSelectorSegmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleSelectorSegment_in_entryRuleSelectorSegment2182);
            iv_ruleSelectorSegment=ruleSelectorSegment();
            _fsp--;

             current =iv_ruleSelectorSegment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorSegment2192); 

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
    // $ANTLR end entryRuleSelectorSegment


    // $ANTLR start ruleSelectorSegment
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1319:1: ruleSelectorSegment returns [EObject current=null] : ( '.' ( ( RULE_ID ) ) ( (lv_next_2_0= ruleSelectorSegment ) )? ) ;
    public final EObject ruleSelectorSegment() throws RecognitionException {
        EObject current = null;

        EObject lv_next_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1324:6: ( ( '.' ( ( RULE_ID ) ) ( (lv_next_2_0= ruleSelectorSegment ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1325:1: ( '.' ( ( RULE_ID ) ) ( (lv_next_2_0= ruleSelectorSegment ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1325:1: ( '.' ( ( RULE_ID ) ) ( (lv_next_2_0= ruleSelectorSegment ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1325:3: '.' ( ( RULE_ID ) ) ( (lv_next_2_0= ruleSelectorSegment ) )?
            {
            match(input,25,FOLLOW_25_in_ruleSelectorSegment2227); 

                    createLeafNode(grammarAccess.getSelectorSegmentAccess().getFullStopKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1329:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1330:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1330:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1331:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSelectorSegmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectorSegment2245); 

            		createLeafNode(grammarAccess.getSelectorSegmentAccess().getAttributeRefEStructuralFeatureCrossReference_1_0(), "attributeRef"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1343:2: ( (lv_next_2_0= ruleSelectorSegment ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1344:1: (lv_next_2_0= ruleSelectorSegment )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1344:1: (lv_next_2_0= ruleSelectorSegment )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1345:3: lv_next_2_0= ruleSelectorSegment
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSelectorSegmentAccess().getNextSelectorSegmentParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSelectorSegment_in_ruleSelectorSegment2266);
                    lv_next_2_0=ruleSelectorSegment();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSelectorSegmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"next",
                    	        		lv_next_2_0, 
                    	        		"SelectorSegment", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleSelectorSegment


    // $ANTLR start entryRuleFeatureRef
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1375:1: entryRuleFeatureRef returns [EObject current=null] : iv_ruleFeatureRef= ruleFeatureRef EOF ;
    public final EObject entryRuleFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRef = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1376:2: (iv_ruleFeatureRef= ruleFeatureRef EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1377:2: iv_ruleFeatureRef= ruleFeatureRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef2303);
            iv_ruleFeatureRef=ruleFeatureRef();
            _fsp--;

             current =iv_ruleFeatureRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef2313); 

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
    // $ANTLR end entryRuleFeatureRef


    // $ANTLR start ruleFeatureRef
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1384:1: ruleFeatureRef returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleFeatureRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1389:6: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1390:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1390:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1391:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1391:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1392:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureRef2355); 

            		createLeafNode(grammarAccess.getFeatureRefAccess().getFeatureEStructuralFeatureCrossReference_0(), "feature"); 
            	

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
    // $ANTLR end ruleFeatureRef


    // $ANTLR start entryRuleThenBlock
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1412:1: entryRuleThenBlock returns [EObject current=null] : iv_ruleThenBlock= ruleThenBlock EOF ;
    public final EObject entryRuleThenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenBlock = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1413:2: (iv_ruleThenBlock= ruleThenBlock EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1414:2: iv_ruleThenBlock= ruleThenBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getThenBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleThenBlock_in_entryRuleThenBlock2390);
            iv_ruleThenBlock=ruleThenBlock();
            _fsp--;

             current =iv_ruleThenBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenBlock2400); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1421:1: ruleThenBlock returns [EObject current=null] : ( () ( 'then' | '->' ) ( ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' ) | ( (lv_statements_7_0= ruleStatement ) ) ) ) ;
    public final EObject ruleThenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1426:6: ( ( () ( 'then' | '->' ) ( ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' ) | ( (lv_statements_7_0= ruleStatement ) ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1427:1: ( () ( 'then' | '->' ) ( ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' ) | ( (lv_statements_7_0= ruleStatement ) ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1427:1: ( () ( 'then' | '->' ) ( ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' ) | ( (lv_statements_7_0= ruleStatement ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1427:2: () ( 'then' | '->' ) ( ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' ) | ( (lv_statements_7_0= ruleStatement ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1427:2: ()
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1428:5: 
            {
             
                    temp=factory.create(grammarAccess.getThenBlockAccess().getThenBlockAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getThenBlockAccess().getThenBlockAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1438:2: ( 'then' | '->' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1438:2: ( 'then' | '->' )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1438:4: 'then'
                    {
                    match(input,26,FOLLOW_26_in_ruleThenBlock2445); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getThenKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1443:7: '->'
                    {
                    match(input,27,FOLLOW_27_in_ruleThenBlock2461); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getHyphenMinusGreaterThanSignKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1447:2: ( ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' ) | ( (lv_statements_7_0= ruleStatement ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||(LA20_0>=RULE_INT && LA20_0<=RULE_FLOAT)||LA20_0==21||LA20_0==24||(LA20_0>=29 && LA20_0<=31)||LA20_0==37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1447:2: ( ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' ) | ( (lv_statements_7_0= ruleStatement ) ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1447:3: ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1447:3: ( '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1447:5: '{' ( ( (lv_statements_4_0= ruleStatement ) ) ';' )* '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleThenBlock2474); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getLeftCurlyBracketKeyword_2_0_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1451:1: ( ( (lv_statements_4_0= ruleStatement ) ) ';' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||(LA19_0>=RULE_INT && LA19_0<=RULE_FLOAT)||LA19_0==21||LA19_0==24||(LA19_0>=29 && LA19_0<=31)||LA19_0==37) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1451:2: ( (lv_statements_4_0= ruleStatement ) ) ';'
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1451:2: ( (lv_statements_4_0= ruleStatement ) )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1452:1: (lv_statements_4_0= ruleStatement )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1452:1: (lv_statements_4_0= ruleStatement )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1453:3: lv_statements_4_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_2_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleThenBlock2496);
                    	    lv_statements_4_0=ruleStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getThenBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"statements",
                    	    	        		lv_statements_4_0, 
                    	    	        		"Statement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    match(input,28,FOLLOW_28_in_ruleThenBlock2506); 

                    	            createLeafNode(grammarAccess.getThenBlockAccess().getSemicolonKeyword_2_0_1_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleThenBlock2518); 

                            createLeafNode(grammarAccess.getThenBlockAccess().getRightCurlyBracketKeyword_2_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1484:6: ( (lv_statements_7_0= ruleStatement ) )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1484:6: ( (lv_statements_7_0= ruleStatement ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1485:1: (lv_statements_7_0= ruleStatement )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1485:1: (lv_statements_7_0= ruleStatement )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1486:3: lv_statements_7_0= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getThenBlockAccess().getStatementsStatementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleThenBlock2546);
                    lv_statements_7_0=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getThenBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"statements",
                    	        		lv_statements_7_0, 
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1516:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1517:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1518:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2583);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2593); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1525:1: ruleStatement returns [EObject current=null] : (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateStatement_0 = null;

        EObject this_UpdateStatement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1530:6: ( (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1531:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1531:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||(LA21_0>=RULE_INT && LA21_0<=RULE_FLOAT)||LA21_0==21||LA21_0==24||(LA21_0>=29 && LA21_0<=31)) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1531:1: (this_CreateStatement_0= ruleCreateStatement | this_UpdateStatement_1= ruleUpdateStatement )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1532:5: this_CreateStatement_0= ruleCreateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getCreateStatementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCreateStatement_in_ruleStatement2640);
                    this_CreateStatement_0=ruleCreateStatement();
                    _fsp--;

                     
                            current = this_CreateStatement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1542:5: this_UpdateStatement_1= ruleUpdateStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleStatement2667);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1558:1: entryRuleCreateStatement returns [EObject current=null] : iv_ruleCreateStatement= ruleCreateStatement EOF ;
    public final EObject entryRuleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1559:2: (iv_ruleCreateStatement= ruleCreateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1560:2: iv_ruleCreateStatement= ruleCreateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement2702);
            iv_ruleCreateStatement=ruleCreateStatement();
            _fsp--;

             current =iv_ruleCreateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateStatement2712); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1567:1: ruleCreateStatement returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1572:6: ( ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1573:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1573:1: ( ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1573:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1573:2: ( ( (lv_var_0_0= ruleVariable ) ) ':' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==20) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1573:3: ( (lv_var_0_0= ruleVariable ) ) ':'
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1573:3: ( (lv_var_0_0= ruleVariable ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1574:1: (lv_var_0_0= ruleVariable )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1574:1: (lv_var_0_0= ruleVariable )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1575:3: lv_var_0_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCreateStatementAccess().getVarVariableParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleCreateStatement2759);
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

                    match(input,20,FOLLOW_20_in_ruleCreateStatement2769); 

                            createLeafNode(grammarAccess.getCreateStatementAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1601:3: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1602:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1602:1: (lv_expression_2_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1603:3: lv_expression_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCreateStatementAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCreateStatement2792);
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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1633:1: entryRuleCreateClass returns [EObject current=null] : iv_ruleCreateClass= ruleCreateClass EOF ;
    public final EObject entryRuleCreateClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateClass = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1634:2: (iv_ruleCreateClass= ruleCreateClass EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1635:2: iv_ruleCreateClass= ruleCreateClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreateClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreateClass_in_entryRuleCreateClass2828);
            iv_ruleCreateClass=ruleCreateClass();
            _fsp--;

             current =iv_ruleCreateClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateClass2838); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1642:1: ruleCreateClass returns [EObject current=null] : ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) ;
    public final EObject ruleCreateClass() throws RecognitionException {
        EObject current = null;

        EObject lv_setters_3_0 = null;

        EObject lv_setters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1647:6: ( ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1648:1: ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1648:1: ( 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1648:3: 'new' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            {
            match(input,29,FOLLOW_29_in_ruleCreateClass2873); 

                    createLeafNode(grammarAccess.getCreateClassAccess().getNewKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1652:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1653:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1653:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1654:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCreateClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateClass2891); 

            		createLeafNode(grammarAccess.getCreateClassAccess().getTypeEClassCrossReference_1_0(), "type"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1666:2: ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1666:4: '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleCreateClass2902); 

                            createLeafNode(grammarAccess.getCreateClassAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1670:1: ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1670:2: ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1670:2: ( (lv_setters_3_0= ruleSetter ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1671:1: (lv_setters_3_0= ruleSetter )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1671:1: (lv_setters_3_0= ruleSetter )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1672:3: lv_setters_3_0= ruleSetter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSetter_in_ruleCreateClass2924);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1694:2: ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==22) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1694:4: ',' ( (lv_setters_5_0= ruleSetter ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleCreateClass2935); 

                            	            createLeafNode(grammarAccess.getCreateClassAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1698:1: ( (lv_setters_5_0= ruleSetter ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1699:1: (lv_setters_5_0= ruleSetter )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1699:1: (lv_setters_5_0= ruleSetter )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1700:3: lv_setters_5_0= ruleSetter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCreateClassAccess().getSettersSetterParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSetter_in_ruleCreateClass2956);
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
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleCreateClass2970); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1734:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1735:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1736:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3008);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3018); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1743:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1748:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1749:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1749:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1750:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1750:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1751:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3059); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1781:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1782:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1783:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNullLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral3099);
            iv_ruleNullLiteral=ruleNullLiteral();
            _fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral3109); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1790:1: ruleNullLiteral returns [EObject current=null] : ( () 'null' ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1795:6: ( ( () 'null' ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1796:1: ( () 'null' )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1796:1: ( () 'null' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1796:2: () 'null'
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1796:2: ()
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1797:5: 
            {
             
                    temp=factory.create(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,30,FOLLOW_30_in_ruleNullLiteral3153); 

                    createLeafNode(grammarAccess.getNullLiteralAccess().getNullKeyword_1(), null); 
                

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
    // $ANTLR end ruleNullLiteral


    // $ANTLR start entryRuleListLiteral
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1819:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1820:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1821:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral3189);
            iv_ruleListLiteral=ruleListLiteral();
            _fsp--;

             current =iv_ruleListLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral3199); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1828:1: ruleListLiteral returns [EObject current=null] : ( () '[' ( ( (lv_items_2_0= ruleExpression ) ) ( ',' ( (lv_items_4_0= ruleExpression ) ) )* )? ']' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1833:6: ( ( () '[' ( ( (lv_items_2_0= ruleExpression ) ) ( ',' ( (lv_items_4_0= ruleExpression ) ) )* )? ']' ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1834:1: ( () '[' ( ( (lv_items_2_0= ruleExpression ) ) ( ',' ( (lv_items_4_0= ruleExpression ) ) )* )? ']' )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1834:1: ( () '[' ( ( (lv_items_2_0= ruleExpression ) ) ( ',' ( (lv_items_4_0= ruleExpression ) ) )* )? ']' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1834:2: () '[' ( ( (lv_items_2_0= ruleExpression ) ) ( ',' ( (lv_items_4_0= ruleExpression ) ) )* )? ']'
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1834:2: ()
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1835:5: 
            {
             
                    temp=factory.create(grammarAccess.getListLiteralAccess().getListLiteralAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getListLiteralAccess().getListLiteralAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,31,FOLLOW_31_in_ruleListLiteral3243); 

                    createLeafNode(grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1849:1: ( ( (lv_items_2_0= ruleExpression ) ) ( ',' ( (lv_items_4_0= ruleExpression ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=RULE_INT && LA27_0<=RULE_FLOAT)||LA27_0==21||LA27_0==24||(LA27_0>=29 && LA27_0<=31)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1849:2: ( (lv_items_2_0= ruleExpression ) ) ( ',' ( (lv_items_4_0= ruleExpression ) ) )*
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1849:2: ( (lv_items_2_0= ruleExpression ) )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1850:1: (lv_items_2_0= ruleExpression )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1850:1: (lv_items_2_0= ruleExpression )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1851:3: lv_items_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral3265);
                    lv_items_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getListLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"items",
                    	        		lv_items_2_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1873:2: ( ',' ( (lv_items_4_0= ruleExpression ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==22) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1873:4: ',' ( (lv_items_4_0= ruleExpression ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleListLiteral3276); 

                    	            createLeafNode(grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1877:1: ( (lv_items_4_0= ruleExpression ) )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1878:1: (lv_items_4_0= ruleExpression )
                    	    {
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1878:1: (lv_items_4_0= ruleExpression )
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1879:3: lv_items_4_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getListLiteralAccess().getItemsExpressionParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral3297);
                    	    lv_items_4_0=ruleExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getListLiteralRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"items",
                    	    	        		lv_items_4_0, 
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_ruleListLiteral3311); 

                    createLeafNode(grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3(), null); 
                

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


    // $ANTLR start entryRuleSetter
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1913:1: entryRuleSetter returns [EObject current=null] : iv_ruleSetter= ruleSetter EOF ;
    public final EObject entryRuleSetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetter = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1914:2: (iv_ruleSetter= ruleSetter EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1915:2: iv_ruleSetter= ruleSetter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetterRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetter_in_entryRuleSetter3347);
            iv_ruleSetter=ruleSetter();
            _fsp--;

             current =iv_ruleSetter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetter3357); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1922:1: ruleSetter returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? ) ;
    public final EObject ruleSetter() throws RecognitionException {
        EObject current = null;

        Token lv_guard_4_0=null;
        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1927:6: ( ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1928:1: ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1928:1: ( ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1928:2: ( ( RULE_ID ) ) ( ':' | '+=' ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_guard_4_0= 'guard' ) )?
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1928:2: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1929:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1929:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1930:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSetterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetter3400); 

            		createLeafNode(grammarAccess.getSetterAccess().getPropertyEStructuralFeatureCrossReference_0_0(), "property"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1942:2: ( ':' | '+=' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            else if ( (LA28_0==33) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1942:2: ( ':' | '+=' )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1942:4: ':'
                    {
                    match(input,20,FOLLOW_20_in_ruleSetter3411); 

                            createLeafNode(grammarAccess.getSetterAccess().getColonKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1947:7: '+='
                    {
                    match(input,33,FOLLOW_33_in_ruleSetter3427); 

                            createLeafNode(grammarAccess.getSetterAccess().getPlusSignEqualsSignKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1951:2: ( (lv_expression_3_0= ruleExpression ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1952:1: (lv_expression_3_0= ruleExpression )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1952:1: (lv_expression_3_0= ruleExpression )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1953:3: lv_expression_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetterAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSetter3449);
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

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1975:2: ( (lv_guard_4_0= 'guard' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1976:1: (lv_guard_4_0= 'guard' )
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1976:1: (lv_guard_4_0= 'guard' )
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1977:3: lv_guard_4_0= 'guard'
                    {
                    lv_guard_4_0=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleSetter3467); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2004:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2005:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2006:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction3517);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction3527); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2013:1: ruleFunction returns [EObject current=null] : ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2018:6: ( ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2019:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2019:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2019:3: 'function' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) '#' ( ( RULE_ID ) )
            {
            match(input,35,FOLLOW_35_in_ruleFunction3562); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFunctionKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2023:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2024:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2024:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2025:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3579); 

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

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2047:2: ( ( ruleFQN ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2048:1: ( ruleFQN )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2048:1: ( ruleFQN )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2049:3: ruleFQN
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getJavaClassJvmGenericTypeCrossReference_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleFunction3607);
            ruleFQN();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,36,FOLLOW_36_in_ruleFunction3617); 

                    createLeafNode(grammarAccess.getFunctionAccess().getNumberSignKeyword_3(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2067:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2068:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2068:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2069:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3635); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2089:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2090:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2091:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUpdateStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement3671);
            iv_ruleUpdateStatement=ruleUpdateStatement();
            _fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement3681); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2098:1: ruleUpdateStatement returns [EObject current=null] : ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_setters_3_0 = null;

        EObject lv_setters_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2103:6: ( ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2104:1: ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2104:1: ( 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2104:3: 'update' ( ( RULE_ID ) ) ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            {
            match(input,37,FOLLOW_37_in_ruleUpdateStatement3716); 

                    createLeafNode(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2108:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2109:1: ( RULE_ID )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2109:1: ( RULE_ID )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2110:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement3734); 

            		createLeafNode(grammarAccess.getUpdateStatementAccess().getVarRefVariableCrossReference_1_0(), "varRef"); 
            	

            }


            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2122:2: ( '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2122:4: '{' ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )? '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleUpdateStatement3745); 

                            createLeafNode(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2126:1: ( ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2126:2: ( (lv_setters_3_0= ruleSetter ) ) ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2126:2: ( (lv_setters_3_0= ruleSetter ) )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2127:1: (lv_setters_3_0= ruleSetter )
                            {
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2127:1: (lv_setters_3_0= ruleSetter )
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2128:3: lv_setters_3_0= ruleSetter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSetter_in_ruleUpdateStatement3767);
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

                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2150:2: ( ',' ( (lv_setters_5_0= ruleSetter ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==22) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2150:4: ',' ( (lv_setters_5_0= ruleSetter ) )
                            	    {
                            	    match(input,22,FOLLOW_22_in_ruleUpdateStatement3778); 

                            	            createLeafNode(grammarAccess.getUpdateStatementAccess().getCommaKeyword_2_1_1_0(), null); 
                            	        
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2154:1: ( (lv_setters_5_0= ruleSetter ) )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2155:1: (lv_setters_5_0= ruleSetter )
                            	    {
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2155:1: (lv_setters_5_0= ruleSetter )
                            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2156:3: lv_setters_5_0= ruleSetter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSettersSetterParserRuleCall_2_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSetter_in_ruleUpdateStatement3799);
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
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleUpdateStatement3813); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2190:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2191:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2192:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3852);
            iv_ruleFQN=ruleFQN();
            _fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3863); 

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
    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2199:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2204:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2205:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2205:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2205:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3903); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2212:1: (kw= '.' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2213:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,25,FOLLOW_25_in_ruleFQN3922); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3937); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop33;
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
    public static final BitSet FOLLOW_ruleScaffold_in_ruleScaffolding131 = new BitSet(new long[]{0x0000000800010002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_ruleScaffolding152 = new BitSet(new long[]{0x0000000800010002L});
    public static final BitSet FOLLOW_ruleScaffoldingElement_in_entryRuleScaffoldingElement189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffoldingElement199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleScaffoldingElement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleScaffoldingElement273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScaffold_in_entryRuleScaffold308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScaffold318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleScaffold353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScaffold371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRule452 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule469 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_ruleRule495 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleThenBlock_in_ruleRule516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_entryRuleWhenBlock552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenBlock562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWhenBlock606 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleWhenBlock618 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleMatch_in_ruleWhenBlock639 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleWhenBlock650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_ruleWhenBlock678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_entryRuleMatch717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatch727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMatch774 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMatch784 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMatch804 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleMatch815 = new BitSet(new long[]{0x00000000E1A00730L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMatch837 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleMatch848 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMatch869 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleMatch883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParam1068 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleParam1079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleParam1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_ruleExpression1195 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_OPERATOR_LOW_PRIORITY_in_ruleExpression1221 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_entryRuleExpressionHigh1285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionHigh1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpressionHigh1342 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_OPERATOR_HIGH_PRIORITY_in_ruleExpressionHigh1368 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleExpressionHigh_in_ruleExpressionHigh1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTerminalExpression1478 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression1500 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTerminalExpression1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_ruleTerminalExpression1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTerminalExpression1563 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleTerminalExpression1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolRef_in_ruleTerminalExpression1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression1646 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTerminalExpression1656 = new BitSet(new long[]{0x00000000E1A00730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression1678 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTerminalExpression1689 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression1710 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTerminalExpression1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_ruleTerminalExpression1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolRef_in_entryRuleSymbolRef1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolRef1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolRef1850 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleSelectorSegment_in_ruleSymbolRef1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveLiteral_in_entryRulePrimitiveLiteral1919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteral1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_rulePrimitiveLiteral1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimitiveLiteral2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rulePrimitiveLiteral2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimitiveLiteral2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rulePrimitiveLiteral2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rulePrimitiveLiteral2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorSegment_in_entryRuleSelectorSegment2182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorSegment2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSelectorSegment2227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectorSegment2245 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleSelectorSegment_in_ruleSelectorSegment2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureRef2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_entryRuleThenBlock2390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenBlock2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleThenBlock2445 = new BitSet(new long[]{0x00000020E1240730L});
    public static final BitSet FOLLOW_27_in_ruleThenBlock2461 = new BitSet(new long[]{0x00000020E1240730L});
    public static final BitSet FOLLOW_18_in_ruleThenBlock2474 = new BitSet(new long[]{0x00000020E1280730L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenBlock2496 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleThenBlock2506 = new BitSet(new long[]{0x00000020E1280730L});
    public static final BitSet FOLLOW_19_in_ruleThenBlock2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenBlock2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_ruleStatement2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleStatement2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateStatement_in_entryRuleCreateStatement2702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateStatement2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCreateStatement2759 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCreateStatement2769 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreateStatement2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateClass_in_entryRuleCreateClass2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateClass2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCreateClass2873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateClass2891 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleCreateClass2902 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleCreateClass2924 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleCreateClass2935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleCreateClass2956 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleCreateClass2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral3099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNullLiteral3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral3189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleListLiteral3243 = new BitSet(new long[]{0x00000001E1200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral3265 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_22_in_ruleListLiteral3276 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral3297 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_32_in_ruleListLiteral3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetter_in_entryRuleSetter3347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetter3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetter3400 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_20_in_ruleSetter3411 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_33_in_ruleSetter3427 = new BitSet(new long[]{0x00000000E1200730L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSetter3449 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleSetter3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction3517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFunction3562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFunction3607 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFunction3617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement3671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUpdateStatement3716 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement3734 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleUpdateStatement3745 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleUpdateStatement3767 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleUpdateStatement3778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSetter_in_ruleUpdateStatement3799 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleUpdateStatement3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3903 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleFQN3922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3937 = new BitSet(new long[]{0x0000000002000002L});

}