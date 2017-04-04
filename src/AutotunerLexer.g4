lexer grammar AutotunerLexer;

PRAGMA: '#pragma';
TUNER: 'tuner';
EXPLORE: 'explore';
MAX_ABS_ERROR: 'max_abs_error';
WHITESPACE : ' ' ->skip;
NEWLINE : '\n' -> skip;
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
COMMA: ',';
NUMBER: [0-9];
NONUMBER: [a-zA-Z_];
HEXADIGIT: [0-9a-fA-F];
SU: '\\u';
BU: '\\U';