lexer grammar AutotunerLexer;

PRAGMA_TUNER: HASH WHITESPACE* 'pragma' WHITESPACE+ 'tuner' WHITESPACE+;
EXPLORE: 'explore';
REFERENCE: 'reference';
MAX_ABS_ERROR: 'max_abs_error';
IS_EVEN: 'is_even';
IS_ODD: 'is_odd';
IS_POSITIVE: 'is_positive';
IS_NEGATIVE: 'is_negative';

INCLUDE: 'include ';

KEYWORD
   : TYPE
   | 'auto'
   | 'break'
   | 'case'
   | 'const'
   | 'continue'
   | 'default'
   | 'do'
   | 'else'
   | 'enum'
   | 'extern'
   | 'for'
   | 'goto'
   | 'if'
   | 'register'
   | 'return'
   | 'sizeof'
   | 'static'
   | 'struct'
   | 'switch'
   | 'typedef'
   | 'union'
   | 'volatile'
   | 'while';


NUMBER: DIGIT+;
IDENTIFIER: ID_CHAR (ID_CHAR | NUMBER)*;
LIBRARY: IDENTIFIER ('.' IDENTIFIER);

ID_CHAR: NONUMBER | UNIVERSAL_CHAR;
UNIVERSAL_CHAR: (SU HEX_QUAD) | (BU HEX_QUAD HEX_QUAD);
HEX_QUAD: HEXADIGIT HEXADIGIT HEXADIGIT HEXADIGIT;

WHITESPACE : ' ' ->skip;
NEWLINE : '\n' -> skip;

/* Comparison */
EQUAL_TO: '==';
NOT_EQUAL_TO: '!=';
LESS_OR_EQUAL: '<=';
GREATER_OR_EQUAL: '>=';
LESS_THAN: '<';
GREATER_THAN: '>';

/* Logical */
NOT: '!';
AND: '&&';
OR: '||';
BIT_AND: '&';
BIT_OR: '!';
BIT_XOR: '^';

/* Other Operators */
INCREMENT: '++';
DECREMENT: '--';
PLUS_EQ: '+=';
MINUS_EQ: '-=';
MULT_EQ: '*=';
DIV_EQ: '/=';
ARROW: '->';
LEFT_SHIFT: '<<';
RIGHT_SHIFT: '>>';

/* Other Special Chars */
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
COMMA: ',';
LEFT_BRACKET: '{';
RIGHT_BRACKET: '}';
LEFT_SQUARE_BRACKET: '[';
RIGHT_SQUARE_BRACKET: ']';
ASSIGNMENT: '=';
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
QUESTION_MARK: '?';
COLON: ':';
SEMI_COLON: ';';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

HASH: '#';

NONUMBER: [a-zA-Z_];
HEXADIGIT: [0-9a-fA-F];
SU: '\\u';
BU: '\\U';

fragment DIGIT: [0-9];

fragment TYPE
    : 'char'
    | 'long'
    | 'int'
    | 'short'
    | 'unsigned'
    | 'signed'
    | 'float'
    | 'double'
    | 'void';
