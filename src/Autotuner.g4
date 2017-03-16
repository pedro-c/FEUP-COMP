grammar Autotuner;

/* Parser Rules */

pragma: PRAGMA_TUNER TUNER_ID WHITESPACE* NEWLINE;


/* Lexer Rules */
PRAGMA_TUNER: '#' WHITESPACE* 'pragma' WHITESPACE+ 'tuner' WHITESPACE+;

TUNER_ID
    : EXPLORE
    | MAX_ABS_ERROR;

EXPLORE
    : 'explore' WHITESPACE+ VARIABLE WHITESPACE*
    '(' WHITESPACE* DigitSequence WHITESPACE*
    ',' WHITESPACE* DigitSequence WHITESPACE* ')';

MAX_ABS_ERROR
    : 'max_abs_error' WHITESPACE+ VARIABLE WHITESPACE+ DigitSequence;

WHITESPACE : ' ' -> skip;
NEWLINE : '\n' -> skip;


/* C Parser */

VARIABLE :
   IdentifierNondigit (IdentifierNondigit | Digit)*;

fragment DigitSequence : Digit+;

fragment IdentifierNondigit :
    Nondigit | UniversalCharacterName;

fragment Nondigit : [a-zA-Z_];

fragment Digit : [0-9];

fragment UniversalCharacterName :
    '\\u' HexQuad | '\\U' HexQuad HexQuad;

fragment HexQuad :
    HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit;

fragment HexadecimalDigit: [0-9a-fA-F];

