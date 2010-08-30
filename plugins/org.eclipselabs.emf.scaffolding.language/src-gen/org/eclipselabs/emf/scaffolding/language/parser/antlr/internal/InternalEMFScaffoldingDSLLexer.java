package org.eclipselabs.emf.scaffolding.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEMFScaffoldingDSLLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=42;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T41=41;
    public static final int T23=23;
    public static final int T40=40;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T11=11;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T39=39;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalEMFScaffoldingDSLLexer() {;} 
    public InternalEMFScaffoldingDSLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:10:5: ( 'scaffold' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:10:7: 'scaffold'
            {
            match("scaffold"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:11:5: ( 'rule' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:11:7: 'rule'
            {
            match("rule"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:12:5: ( 'when' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:12:7: 'when'
            {
            match("when"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:13:5: ( '{' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:13:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:14:5: ( '}' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:14:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:15:5: ( ':' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:15:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:16:5: ( '(' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:16:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:17:5: ( ',' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:17:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:18:5: ( ')' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:18:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:19:5: ( '<' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:19:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:20:5: ( '>' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:20:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:21:5: ( '=' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:21:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:22:5: ( '!=' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:22:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:23:5: ( '+' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:23:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:24:5: ( '-' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:24:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:25:5: ( '>=' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:25:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:26:5: ( '<=' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:26:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:27:5: ( '/' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:27:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:28:5: ( '*' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:28:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:29:5: ( 'then' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:29:7: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:30:5: ( '->' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:30:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:31:5: ( 'new' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:31:7: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:32:5: ( 'null' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:32:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:33:5: ( '[' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:33:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:34:5: ( ']' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:34:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:35:5: ( '$' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:35:7: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:36:5: ( '+=' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:36:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:37:5: ( 'guard' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:37:7: 'guard'
            {
            match("guard"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:38:5: ( 'function' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:38:7: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:39:5: ( 'update' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:39:7: 'update'
            {
            match("update"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:40:5: ( '.' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:40:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2364:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2364:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2364:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2364:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2364:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2366:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2366:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2366:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2366:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2368:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2368:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2370:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2370:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2370:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2370:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2372:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2372:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2372:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2372:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2372:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2372:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2372:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2372:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2374:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2374:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2374:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2376:16: ( . )
            // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:2376:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='s') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='c') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='a') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='f') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='f') ) {
                            int LA12_89 = input.LA(6);

                            if ( (LA12_89=='o') ) {
                                int LA12_97 = input.LA(7);

                                if ( (LA12_97=='l') ) {
                                    int LA12_101 = input.LA(8);

                                    if ( (LA12_101=='d') ) {
                                        int LA12_104 = input.LA(9);

                                        if ( ((LA12_104>='0' && LA12_104<='9')||(LA12_104>='A' && LA12_104<='Z')||LA12_104=='_'||(LA12_104>='a' && LA12_104<='z')) ) {
                                            alt12=32;
                                        }
                                        else {
                                            alt12=1;}
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='u') ) {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='l') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='e') ) {
                        int LA12_81 = input.LA(5);

                        if ( ((LA12_81>='0' && LA12_81<='9')||(LA12_81>='A' && LA12_81<='Z')||LA12_81=='_'||(LA12_81>='a' && LA12_81<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='w') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='h') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='e') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='n') ) {
                        int LA12_82 = input.LA(5);

                        if ( ((LA12_82>='0' && LA12_82<='9')||(LA12_82>='A' && LA12_82<='Z')||LA12_82=='_'||(LA12_82>='a' && LA12_82<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=4;
        }
        else if ( (LA12_0=='}') ) {
            alt12=5;
        }
        else if ( (LA12_0==':') ) {
            alt12=6;
        }
        else if ( (LA12_0=='(') ) {
            alt12=7;
        }
        else if ( (LA12_0==',') ) {
            alt12=8;
        }
        else if ( (LA12_0==')') ) {
            alt12=9;
        }
        else if ( (LA12_0=='<') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='=') ) {
                alt12=17;
            }
            else {
                alt12=10;}
        }
        else if ( (LA12_0=='>') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='=') ) {
                alt12=16;
            }
            else {
                alt12=11;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=12;
        }
        else if ( (LA12_0=='!') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='=') ) {
                alt12=13;
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='+') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='=') ) {
                alt12=27;
            }
            else {
                alt12=14;}
        }
        else if ( (LA12_0=='-') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='>') ) {
                alt12=21;
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=35;
                }
                break;
            case '/':
                {
                alt12=36;
                }
                break;
            default:
                alt12=18;}

        }
        else if ( (LA12_0=='*') ) {
            alt12=19;
        }
        else if ( (LA12_0=='t') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='h') ) {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='e') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='n') ) {
                        int LA12_83 = input.LA(5);

                        if ( ((LA12_83>='0' && LA12_83<='9')||(LA12_83>='A' && LA12_83<='Z')||LA12_83=='_'||(LA12_83>='a' && LA12_83<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='w') ) {
                    int LA12_75 = input.LA(4);

                    if ( ((LA12_75>='0' && LA12_75<='9')||(LA12_75>='A' && LA12_75<='Z')||LA12_75=='_'||(LA12_75>='a' && LA12_75<='z')) ) {
                        alt12=32;
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=32;}
                }
                break;
            case 'u':
                {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='l') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='l') ) {
                        int LA12_85 = input.LA(5);

                        if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=23;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            default:
                alt12=32;}

        }
        else if ( (LA12_0=='[') ) {
            alt12=24;
        }
        else if ( (LA12_0==']') ) {
            alt12=25;
        }
        else if ( (LA12_0=='$') ) {
            alt12=26;
        }
        else if ( (LA12_0=='g') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='u') ) {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='a') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='r') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='d') ) {
                            int LA12_94 = input.LA(6);

                            if ( ((LA12_94>='0' && LA12_94<='9')||(LA12_94>='A' && LA12_94<='Z')||LA12_94=='_'||(LA12_94>='a' && LA12_94<='z')) ) {
                                alt12=32;
                            }
                            else {
                                alt12=28;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='u') ) {
                int LA12_65 = input.LA(3);

                if ( (LA12_65=='n') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='c') ) {
                        int LA12_87 = input.LA(5);

                        if ( (LA12_87=='t') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='i') ) {
                                int LA12_99 = input.LA(7);

                                if ( (LA12_99=='o') ) {
                                    int LA12_102 = input.LA(8);

                                    if ( (LA12_102=='n') ) {
                                        int LA12_105 = input.LA(9);

                                        if ( ((LA12_105>='0' && LA12_105<='9')||(LA12_105>='A' && LA12_105<='Z')||LA12_105=='_'||(LA12_105>='a' && LA12_105<='z')) ) {
                                            alt12=32;
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='p') ) {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='d') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='a') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='t') ) {
                            int LA12_96 = input.LA(6);

                            if ( (LA12_96=='e') ) {
                                int LA12_100 = input.LA(7);

                                if ( ((LA12_100>='0' && LA12_100<='9')||(LA12_100>='A' && LA12_100<='Z')||LA12_100=='_'||(LA12_100>='a' && LA12_100<='z')) ) {
                                    alt12=32;
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=31;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='A' && LA12_27<='Z')||LA12_27=='_'||(LA12_27>='a' && LA12_27<='z')) ) {
                alt12=32;
            }
            else {
                alt12=38;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='e')||(LA12_0>='h' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='q')||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=32;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=33;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_30 = input.LA(2);

            if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFE')) ) {
                alt12=34;
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_31 = input.LA(2);

            if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFE')) ) {
                alt12=34;
            }
            else {
                alt12=38;}
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=37;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='#'||(LA12_0>='%' && LA12_0<='&')||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=38;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:134: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:142: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:151: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:163: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:179: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:195: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g:1:203: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}