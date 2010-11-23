lexer grammar InternalEMFScaffoldingDSL;
@header {
package org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T15 : 'then' ;
T16 : '->' ;
T17 : ':' ;
T18 : '+=' ;
T19 : 'scaffold' ;
T20 : 'rule' ;
T21 : 'when' ;
T22 : '{' ;
T23 : '}' ;
T24 : '(' ;
T25 : ')' ;
T26 : ',' ;
T27 : '!' ;
T28 : ';' ;
T29 : 'new' ;
T30 : 'null' ;
T31 : '[' ;
T32 : ']' ;
T33 : 'function' ;
T34 : '#' ;
T35 : 'update' ;
T36 : '.' ;
T37 : 'guard' ;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6504
RULE_OPERATOR_HIGH_PRIORITY : ('<'|'>'|'='|'!='|'>='|'<='|'/'|'*');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6506
RULE_OPERATOR_LOW_PRIORITY : ('+'|'-');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6508
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6510
RULE_FLOAT : '-'? ('0'..'9')+ '.' '0'..'9';

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6512
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6514
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6516
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6518
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6520
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6522
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6524
RULE_ANY_OTHER : .;


