parser grammar AutotunerParser;

options {      tokenVocab=AutotunerLexer; }

pragma: pragma_tuner tuner_id;

pragma_tuner: PRAGMA TUNER;
tuner_id: explore | max_abs_error; //adicionar os nomes dos pragmas que fizermos

explore: EXPLORE variable LEFT_PARENTHESIS WHITESPACE* NUMBER+ WHITESPACE* COMMA NUMBER+ WHITESPACE* RIGHT_PARENTHESIS;
max_abs_error: MAX_ABS_ERROR variable NUMBER+;
variable: identifier (identifier | NUMBER)*;
identifier: NONUMBER | universal_char;
universal_char: (SU hex_quad) | (BU hex_quad hex_quad);
hex_quad: HEXADIGIT HEXADIGIT HEXADIGIT HEXADIGIT;


//Parser init
startpoint: pragma;