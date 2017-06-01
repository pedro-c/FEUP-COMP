parser grammar AutotunerParser;

options { tokenVocab=AutotunerLexer; }

pragma: PRAGMA_TUNER tuner_id;

tuner_id: explore | max_abs_error; //adicionar os nomes dos pragmas que fizermos

//pragmas
explore: EXPLORE VARIABLE LEFT_PARENTHESIS NUMBER COMMA NUMBER RIGHT_PARENTHESIS REFERENCE LEFT_PARENTHESIS VARIABLE ASSIGNMENT NUMBER RIGHT_PARENTHESIS;
max_abs_error: MAX_ABS_ERROR VARIABLE NUMBER;

//Parser init
start: ( pragma | KEYWORD | VARIABLE)+? EOF;

main: ((~PRAGMA_TUNER)* (pragma) (~PRAGMA_TUNER)*)*;