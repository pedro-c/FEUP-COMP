P19 - Auto
 
Turma 1 Grupo 5
 
NAME1: Bernardo Belchior, NR1: 201405381, GRADE1: 20, CONTRIBUTION1: 33%
NAME2: Maria Francisca Paupério, NR2: 201403785, GRADE2: 20, CONTRIBUTION2: 33%
NAME3: Pedro Costa, NR3: 201403291, GRADE3: 20, CONTRIBUTION3: 33%
 
SUMMARY:
An autotuner for C programs. The user adds pragmas to the source code and the auto-tuner automatically determines the best values for some constants.
The project consists of:
  - Parsing the pragmas
  - Modifying the code to include the instrumentation/validation code
  - Re-running the program multiple times
  - Report the best version

Pragma Explore:
#pragma tuner explore STEP(1, 10) reference(STEP=1)
for (int i = 0; i < N; i += STEP) {
    acc += buf[i];
}
acc *= STEP;
#pragma tuner max_abs_error acc 5
 
The auto-tuner would automatically instrument the source code to find the fastest value of STEP that has a maximum absolute error of abs of 5, that is, less or equal to 5.
 
EXECUTE:
$ java -jar autotuner.jar <filename>
 
DEALING WITH SYNTACTIC ERRORS:
Our program warns the user of the first syntax error, where it happened, and exits the program, with a status code. C syntax errors are not checked, and will be thrown by the compiler afterwards in the process.

SEMANTIC ANALYSIS:
The semantic analysis is provided with the ANTLR framework that, when a grammar is provided, allows functions to be called when certain “events” happen. “Events” mean whenever a new node of the tree is being visited. With this ability, it is possible for us to execute code whenever a new pragma is read from the code, or a variable is used, etc. 
A pragma explore, when visited, creates a new object containing the variable name and its reference, min and max values. Whenever that variable is visited again in the future, it will be replaced by this object, allowing it to have a dynamic value.
A max_abs_error pragma, along with is_even, is_odd, is_positive and is_negative, are visited and then stored as objects as well. This allows the program to change its value depending on the current state.
 
INTERMEDIATE REPRESENTATIONS:
ANTLR generates a Concrete Syntax Tree (CST) which is a way of visualizing how the parser identifies each lexeme, or token, in the code. This allows us to understand how the code is being read and interpreted before starting the semantic analysis.
 
 
CODE GENERATION:
 
Our solution starts by identifying in the tree obtained from the parser, the existing pragmas and variables in the code. Saving the necessary information, such as, the max, min and reference value for the pragma ‘explore’. The
Then it replaces the variable with the desired value and returns a string containing all the code.
Our tool does not verify if the generated code is valid C code, that’s up to the programmer and the C compiler, it only checks for the validity of our language extension.

 
OVERVIEW:
 
We used ANTLR 4.7 for language recognition and parsing the desired values from the code, as well as, transforming them. We defined the lexical grammar and the semantic rules using ANTLR .g4 files which were then compiled by ANTLR to Java Objects and analyse the generated tree and visit its leaves. Then by overriding the default functions for the desired terms we implemented our tuner as described in the CODE GENERATION section.

TESTSUITE AND TEST INFRASTRUCTURE:
 
In order to find the best values for the variables, in our java code, we create a .c file for every possible value in each for cycle and test each cycle by calling inside our java code a command that runs the previous compiled code while measuring the time it takes to run. We measure the time in nanoseconds and, in order to obtain valid results, we run each possibility 5000 times and return the average time it took to run the program. Then we store the best values for each variable code, and return the code with the combination of the best values in the place of the variables.
 
TASK DISTRIBUTION:
Bernardo Belchior: Code Generation, Java and C code communication
Francisca Paupério: C code parsing and semantic analysis, Code compilation and execution
Pedro Costa: Grammar definition and Performance Benchmarks

PROS:
 
Easily obtain the best performing values by simply adding a pragma to the code and running our tuner. With the possibility to add extra pragmas to guarantee desired values.
 
CONS: 
 
Not really useful when programs are simple enough that any optimization would not be worth the time running this tool.

EXAMPLE 1:
 
The file test1.c was used to generate this code.
 
Running reference...
Reference Value for acc: 523776
Starting benchmarks...
Name: STEP	Value: 1	Average: 5520071.6908ns
Best code:
int main ( ) { 
int N = 1024 ; 
int buf [ N ] ; 
int acc = 0 ; 
 
for ( int i = 0 ; i < N ; i ++ ) { 
buf [ i ] = i ; 
}  
 
for ( int i = 0 ; i < N ; i += 1 ) { 
acc += buf [ i ] ; 
} 
acc *= 1 ;  
 
return 0 ; 
} 
 
EXAMPLE 2:
 
The file test2.c was used to generate this code.
 
Running reference...
Starting benchmarks...
Name: var	Value: 2	Average: 5260610.88ns
Best code:
int main ( ) { 
int N = 1024 ; 
int buf [ N ] ; 
int acc = 0 ; 
 
for ( int i = 0 ; i < N ; i ++ ) { 
buf [ i ] = i ; 
} 
 
for ( int i = 0 ; i < N ; i += 2 ) { 
acc += buf [ i ] ; 
} 
acc *= 2 ; 
 
return 0 ; 
} 
 
EXAMPLE 3:
 
The file test3.c was used to generate this code.
 
Running reference...
Starting benchmarks?
 
Variable var never fulfills the pragma condition.
 
 
EXAMPLE 4:
 
The file test4.c was used to generate this code.
 
Running reference...
Starting benchmarks...
Name: var	Value: 9	Average: 5539833.7942ns
Best code:
int main ( ) { 
int N = 1024 ; 
int buf [ N ] ; 
int acc = 0 ; 
 
for ( int i = 0 ; i < N ; i ++ ) { 
buf [ i ] = i ; 
}
 
for ( int i = 0 ; i < N ; i += 9 ) { 
acc += buf [ i ] ; 
} 
acc *= 9 ;  
 
return 0 ; 
} 
 
 
EXAMPLE 5:
 
The file test5.c was used to generate this code.
 
Running reference...
Reference Value for acc: 523776
Starting benchmarks...
Name: STEP	Value: 1	Average: 5716575.7872ns
Name: var	Value: 4	Average: 5269488.7216ns
Best code:
int main ( ) { 
int N = 1024 ; 
int buf [ N ] ; 
int acc = 0 ; 
int accu = 0 ; 
 
for ( int i = 0 ; i < N ; i ++ ) { 
buf [ i ] = i ; 
}
 
for ( int i = 0 ; i < N ; i += 1 ) { 
acc += buf [ i ] ; 
} 
acc *= 1 ;  
 
for ( int i = 0 ; i < N ; i += 4 ) { 
accu += buf [ i ] ; 
} 
accu *= 4 ;  
 
return 0 ; 
} 
 
EXAMPLE 6:
 
The file test6.c was used to generate this code.
 
Running reference...
Reference Value for acc: -356341250
Starting benchmarks...
Name: STEP	Value: -5	Average: 6692850.317ns
Name: var	Value: 1	Average: 5369738.1838ns
Best code:
int main ( ) { 
int N = 1024 ; 
int buf [ N ] ; 
int acc = 0 ; 
int accu = 0 ; 
 
for ( int i = 0 ; i < N ; i ++ ) { 
buf [ i ] = i * i ; 
} 
 
for ( int i = 0 ; i < N ; i -= -5 ) { 
acc += buf [ i ] ; 
} 
acc *= -5 ;  
 
for ( int i = 0 ; i < N ; i += 1 ) { 
accu += i * - buf [ i ] ; 
} 
accu *= 1 ;   
 
return 0 ; 
}
