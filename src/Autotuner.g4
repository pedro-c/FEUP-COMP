grammar Autotuner;

/* Parser Rules */

pragma: pragmaTuner tunerId expression* NEWLINE;

pragmaTuner: '#' WHITESPACE* 'pragma' WHITESPACE+ 'tuner' WHITESPACE+;

tunerId: EXPLORE | MAX_ABS_ERROR;

expression:
    step | reference | VARIABLE | NUMBER ;

step: VARIABLE OPENPAR NUMBER COMMA NUMBER CLOSEPAR;

reference: REFERENCE OPENPAR VARIABLE ASSIGN DigitSequence;

/* Lexer Rules */

WHITESPACE : ' ' -> skip;
NEWLINE : '\n' -> skip;

EXPLORE: 'explore';
MAX_ABS_ERROR: 'max_abs_error';

REFERENCE: 'reference';

OPENPAR: '(';
CLOSEPAR: ')';
COMMA: ',';
ASSIGN: '=';

NUMBER:
    DigitSequence;

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

