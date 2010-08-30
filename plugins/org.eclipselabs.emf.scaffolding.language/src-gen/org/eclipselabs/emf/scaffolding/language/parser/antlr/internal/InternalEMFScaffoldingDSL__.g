lexer grammar InternalEMFScaffoldingDSL;
@header {
package org.eclipselabs.emf.scaffolding.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'scaffold' ;
T12 : 'rule' ;
T13 : 'when' ;
T14 : '{' ;
T15 : '}' ;
T16 : ':' ;
T17 : '(' ;
T18 : ',' ;
T19 : ')' ;
T20 : '<' ;
T21 : '>' ;
T22 : '=' ;
T23 : '!=' ;
T24 : '+' ;
T25 : '-' ;
T26 : '>=' ;
T27 : '<=' ;
T28 : '/' ;
T29 : '*' ;
T30 : 'then' ;
T31 : '->' ;
T32 : 'new' ;
T33 : 'null' ;
T34 : '[' ;
T35 : ']' ;
T36 : '$' ;
T37 : '+=' ;
T38 : 'guard' ;
T39 : 'function' ;
T40 : 'update' ;
T41 : '.' ;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2364
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2366
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2368
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2370
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2372
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2374
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2376
RULE_ANY_OTHER : .;


