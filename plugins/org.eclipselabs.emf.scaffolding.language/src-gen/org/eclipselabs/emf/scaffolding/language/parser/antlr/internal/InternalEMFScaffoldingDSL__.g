lexer grammar InternalEMFScaffoldingDSL;
@header {
package org.eclipselabs.emf.scaffolding.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'scaffold' ;
T16 : 'rule' ;
T17 : 'when' ;
T18 : '{' ;
T19 : '}' ;
T20 : ':' ;
T21 : '(' ;
T22 : ',' ;
T23 : ')' ;
T24 : '!' ;
T25 : 'then' ;
T26 : '->' ;
T27 : ';' ;
T28 : 'new' ;
T29 : 'null' ;
T30 : '[' ;
T31 : ']' ;
T32 : '+=' ;
T33 : 'guard' ;
T34 : 'function' ;
T35 : '#' ;
T36 : 'update' ;
T37 : '.' ;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2511
RULE_OPERATOR_HIGH_PRIORITY : ('<'|'>'|'='|'!='|'>='|'<='|'/'|'*');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2513
RULE_OPERATOR_LOW_PRIORITY : ('+'|'-');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2515
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2517
RULE_FLOAT : '-'? ('0'..'9')+ '.' '0'..'9';

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2519
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2521
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2523
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2525
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2527
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2529
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language/src-gen/org/eclipselabs/emf/scaffolding/language/parser/antlr/internal/InternalEMFScaffoldingDSL.g" 2531
RULE_ANY_OTHER : .;


