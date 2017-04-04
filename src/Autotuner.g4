grammar Autotuner;

/* Parser Rules */

start: (comment | pragma | VARIABLE | DISCARD);

pragma: PRAGMA_TUNER WHITESPACE tunerId expression* NEWLINE;


tunerId: EXPLORE | MAX_ABS_ERROR;

expression: WHITESPACE (step | reference | VARIABLE | NUMBER);

step: VARIABLE OPENPAR NUMBER COMMA NUMBER CLOSEPAR;

reference: REFERENCE OPENPAR VARIABLE ASSIGN NUMBER;

comment: LINE_CMT | BLOCK_CMT;

/* Lexer Rules */

TUNER: 'tuner';
EXPLORE: 'explore';
MAX_ABS_ERROR: 'max_abs_error';
REFERENCE: 'reference';
OPENPAR: '(';
CLOSEPAR: ')';
COMMA: ',';
ASSIGN: '=';
SLASH: '/';
STAR: '*';
DISCARD: .+? -> skip;
WHITESPACE: [ \t]+ -> skip;          // At least one whitespace and skip it
NEWLINE: [\n]+ -> skip;         // Mandatory newline and skip it

LINE_CMT: SLASH SLASH DISCARD NEWLINE;
BLOCK_CMT: SLASH STAR DISCARD STAR SLASH;

PRAGMA_TUNER: PRAGMA WHITESPACE TUNER;
PRAGMA: '#' WHITESPACE 'pragma';

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

