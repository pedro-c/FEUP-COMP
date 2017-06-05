parser grammar AutotunerParser;

options { tokenVocab=AutotunerLexer; }

pragma: PRAGMA_TUNER tuner_id;

tuner_id: explore | max_abs_error | is_even | is_odd | is_positive | is_negative;

//pragmas
explore: EXPLORE STEP=IDENTIFIER LEFT_PARENTHESIS MIN=NUMBER COMMA MAX=NUMBER RIGHT_PARENTHESIS REFERENCE LEFT_PARENTHESIS IDENTIFIER ASSIGNMENT REF=NUMBER RIGHT_PARENTHESIS;
max_abs_error: MAX_ABS_ERROR IDENTIFIER NUMBER;
is_even: IS_EVEN IDENTIFIER;
is_odd: IS_ODD IDENTIFIER;
is_positive: IS_POSITIVE IDENTIFIER;
is_negative: IS_NEGATIVE IDENTIFIER;

//Parser init
main: include*? (pragma | keyword | variable | ignore)*? EOF;

include: HASH INCLUDE DOUBLE_QUOTE LIBRARY DOUBLE_QUOTE;
keyword: KEYWORD;
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
    | PLUS_EQ
    | MINUS_EQ
    | MULT_EQ
    | DIV_EQ
    | INCREMENT
    | DECREMENT
    | ARROW
    | LEFT_SHIFT
    | RIGHT_SHIFT
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