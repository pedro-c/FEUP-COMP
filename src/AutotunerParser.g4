parser grammar AutotunerParser;

options { tokenVocab=AutotunerLexer; }

pragma: PRAGMA_TUNER tuner_id;

tuner_id: explore | max_abs_error; //adicionar os nomes dos pragmas que fizermos

explore: EXPLORE VARIABLE LEFT_PARENTHESIS WHITESPACE* NUMBER WHITESPACE* COMMA NUMBER WHITESPACE* RIGHT_PARENTHESIS;
max_abs_error: MAX_ABS_ERROR VARIABLE NUMBER;


//Parser init
start: pragma;