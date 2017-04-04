lexer grammar AutotunerLexer;

PRAGMA_TUNER: '#' WHITESPACE* 'pragma' WHITESPACE+ 'tuner' WHITESPACE+;

TUNER_ID
    : EXPLORE
    | MAX_ABS_ERROR;
    //adicionar os nomes dos pragmas que fizermos


EXPLORE
    : 'explore' WHITESPACE+ VARIABLE WHITESPACE*
    '(' WHITESPACE* DigitSequence WHITESPACE*
    ',' WHITESPACE* DigitSequence WHITESPACE* ')';

MAX_ABS_ERROR
    : 'max_abs_error' WHITESPACE+ VARIABLE WHITESPACE+ DigitSequence;

WHITESPACE : ' ' -> skip;
NEWLINE : '\n' -> skip;

VARIABLE
    : IdentifierNonDigit (IdentifierNonDigit | Digit)*;

fragment DigitSequence : Digit+;

fragment IdentifierNonDigit
    : Nondigit | UniversalCharacterName;

fragment Nondigit : [a-zA-Z_];

fragment Digit : [0-9];

fragment UniversalCharacterName :
    '\\u' HexQuad | '\\U' HexQuad HexQuad;

fragment HexQuad :
    HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit;

fragment HexadecimalDigit: [0-9a-fA-F];