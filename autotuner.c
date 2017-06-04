#include "assert.h"
#include "stdlib.h"
#include "sys/types.h"
#include "sys/stat.h"
#include "fcntl.h"
#include "unistd.h"
int main ( ) { int N = 5 ; int buf [ N ] ; int acc = 0 ; for ( int i = 0 ; i < N ; i ++ ) { buf [ i ] = i ; } for ( int i = 0 ; i < N ; i += 1 ) { acc += buf [ i ] ; } acc *= 1 ; assert(abs(acc - 10) <= 5); int accu = 0 ; for ( int i = 0 ; i < N ; i += 10 ) { accu += buf [ i ] ; } accu *= 10 ; assert(accu % 2 == 0); return 0 ; } 
