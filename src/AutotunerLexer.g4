lexer grammar AutotunerLexer;

PRAGMA_TUNER: '#' WHITESPACE* 'pragma' WHITESPACE+ 'tuner' WHITESPACE+;
EXPLORE: 'explore';
REFERENCE: 'reference';
MAX_ABS_ERROR: 'max_abs_error';

/*IGNORE: (KEYWORD | SPECIAL_CHARS);*/

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
LEFT_SQUARE_BRACKET: '[';
RIGHT_SQUARE_BRACKET: ']';
ASSIGNMENT: '=';
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
QUESTION_MARK: '?';
EXCLAMATION_MARK: '!';
COLON: ':';
SEMI_COLON: ';';

NONUMBER: [a-zA-Z_];
HEXADIGIT: [0-9a-fA-F];
SU: '\\u';
BU: '\\U';

fragment DIGIT: [0-9];

fragment SPECIAL_CHARS
    : KEYWORD
    | LEFT_BRACKET
    | RIGHT_BRACKET
    | LEFT_PARENTHESIS
    | RIGHT_PARENTHESIS
    | LEFT_SQUARE_BRACKET
    | RIGHT_SQUARE_BRACKET
    | SINGLE_QUOTE
    | DOUBLE_QUOTE
    | QUESTION_MARK
    | EXCLAMATION_MARK
    | COLON
    | SEMI_COLON;

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

