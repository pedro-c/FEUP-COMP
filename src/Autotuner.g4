grammar Autotuner;

/* Parser Rules */

pragma: PRAGMA_TUNER WHITESPACE* TUNER_ID WHITESPACE*;


/* Lexer Rules */
PRAGMA_TUNER: '#' WHITESPACE* 'pragma' WHITESPACE* 'tuner';
TUNER_ID
    : 'explore'
    | 'max_abs_error';
WHITESPACE : ' ' -> skip;
