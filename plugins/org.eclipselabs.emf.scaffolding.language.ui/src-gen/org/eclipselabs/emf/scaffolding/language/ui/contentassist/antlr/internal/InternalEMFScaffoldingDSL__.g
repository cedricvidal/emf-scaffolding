lexer grammar InternalEMFScaffoldingDSL;
@header {
package org.eclipselabs.emf.scaffolding.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T15 : 'null' ;
T16 : 'then' ;
T17 : '->' ;
T18 : ':' ;
T19 : '+=' ;
T20 : 'scaffold' ;
T21 : 'rule' ;
T22 : 'when' ;
T23 : '{' ;
T24 : '}' ;
T25 : '(' ;
T26 : ')' ;
T27 : ',' ;
T28 : '!' ;
T29 : 'new' ;
T30 : '[' ;
T31 : ']' ;
T32 : '$' ;
T33 : 'function' ;
T34 : '#' ;
T35 : 'update' ;
T36 : '.' ;
T37 : 'guard' ;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6190
RULE_OPERATOR_HIGH_PRIORITY : ('<'|'>'|'='|'!='|'>='|'<='|'/'|'*');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6192
RULE_OPERATOR_LOW_PRIORITY : ('+'|'-');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6194
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6196
RULE_FLOAT : '-'? ('0'..'9')+ '.' '0'..'9';

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6198
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6200
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6202
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6204
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6206
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6208
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipselabs.emf.scaffolding.language.ui/src-gen/org/eclipselabs/emf/scaffolding/language/ui/contentassist/antlr/internal/InternalEMFScaffoldingDSL.g" 6210
RULE_ANY_OTHER : .;


