lexer grammar InternalEMFScaffoldingDSL;
@header {
package org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'null' ;
T12 : '<' ;
T13 : '>' ;
T14 : '=' ;
T15 : '!=' ;
T16 : '+' ;
T17 : '-' ;
T18 : '>=' ;
T19 : '<=' ;
T20 : '/' ;
T21 : '*' ;
T22 : 'then' ;
T23 : '->' ;
T24 : ':' ;
T25 : '+=' ;
T26 : 'scaffold' ;
T27 : 'rule' ;
T28 : 'when' ;
T29 : '{' ;
T30 : '}' ;
T31 : '(' ;
T32 : ')' ;
T33 : ',' ;
T34 : 'new' ;
T35 : '[' ;
T36 : ']' ;
T37 : '$' ;
T38 : 'function' ;
T39 : 'update' ;
T40 : '.' ;
T41 : 'guard' ;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 5357
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 5359
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 5361
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 5363
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 5365
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 5367
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 5369
RULE_ANY_OTHER : .;


