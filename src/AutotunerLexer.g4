lexer grammar AutotunerLexer;

PRAGMA_TUNER: '#' WHITESPACE* 'pragma' WHITESPACE+ 'tuner' WHITESPACE+;
EXPLORE: 'explore';
REFERENCE: 'reference';
MAX_ABS_ERROR: 'max_abs_error';

NUMBER: DIGIT+;
VARIABLE: IDENTIFIER (IDENTIFIER | NUMBER)*;

IDENTIFIER: NONUMBER | UNIVERSAL_CHAR;
UNIVERSAL_CHAR: (SU HEX_QUAD) | (BU HEX_QUAD HEX_QUAD);
HEX_QUAD: HEXADIGIT HEXADIGIT HEXADIGIT HEXADIGIT;

WHITESPACE : ' ' ->skip;
NEWLINE : '\n' -> skip;

LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
COMMA: ',';
LEFT_BRACKET: '{';
RIGHT_BRACKET: '}';
ASSIGNMENT: '=';

TYPE: 'char' | 'long' | 'int' | 'short' | 'unsigned' | 'signed' | 'float' | 'double';
ANY_CHAR: .;
NONUMBER: [a-zA-Z_];
HEXADIGIT: [0-9a-fA-F];
SU: '\\u';
BU: '\\U';

fragment DIGIT: [0-9];