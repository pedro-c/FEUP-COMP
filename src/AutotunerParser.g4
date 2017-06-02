parser grammar AutotunerParser;

options { tokenVocab=AutotunerLexer; }

pragma: PRAGMA_TUNER tuner_id;

tuner_id: explore | max_abs_error; //adicionar os nomes dos pragmas que fizermos

//pragmas
explore: EXPLORE IDENTIFIER LEFT_PARENTHESIS NUMBER COMMA NUMBER RIGHT_PARENTHESIS REFERENCE LEFT_PARENTHESIS IDENTIFIER ASSIGNMENT NUMBER RIGHT_PARENTHESIS;
max_abs_error: MAX_ABS_ERROR IDENTIFIER NUMBER;

//Parser init
main: (pragma | KEYWORD | variable | ignore)*? EOF;

variable: IDENTIFIER;

ignore: specialChar | NUMBER;

specialChar
    : EQUAL_TO
    | NOT_EQUAL_TO
    | LESS_OR_EQUAL
    | GREATER_OR_EQUAL
    | LESS_THAN
    | GREATER_THAN
    | NOT
    | AND
    | OR
    | BIT_AND
    | BIT_OR
    | BIT_XOR
    | PLUS
    | MINUS
    | MULT
    | DIV
    | LEFT_BRACKET
    | RIGHT_BRACKET
    | LEFT_PARENTHESIS
    | RIGHT_PARENTHESIS
    | LEFT_SQUARE_BRACKET
    | RIGHT_SQUARE_BRACKET
    | SINGLE_QUOTE
    | DOUBLE_QUOTE
    | QUESTION_MARK
    | COLON
    | SEMI_COLON
    | ASSIGNMENT;