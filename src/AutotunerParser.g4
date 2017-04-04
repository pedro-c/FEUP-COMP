parser grammar AutotunerParser;

options {      tokenVocab=AutotunerLexer; }

pragma: PRAGMA_TUNER TUNER_ID;

//Parser init
startpoint: pragma*;