/*

Kumar wants to learn how the calculators are working.so he is trying to implements the calculator program.could you please help him to implements the program. - Notes:- Must use the Switch Case.operators - Addition - Subtraction - Multiplication - Division - Modulo

Input Format

First input consists of integer.
Second input consists of integer.
third input consists of character.
Constraints

No Constraints

Output Format

print the calculation Value.
if the symbol is not the arithmetic operator,print the statement is "Invalid Input".
Sample Input 0

3
4
+
Sample Output 0

Addition of two number is 7.0
Sample Input 1

7
3
-
Sample Output 1

Subtraction of two number is 4.0
Sample Input 2

13
2
/
Sample Output 2

Division of two number is 6.5

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        char ch=sc.next().charAt(0);
        if (ch=='+'){
            System.out.println("Addition of two number is "+(a+b));
        }
        else if (ch=='-'){
            System.out.println("Subtraction of two number is "+(a-b));
        }
        else if (ch=='/'){
            System.out.println("Division of two number is "+(a/b));
        }
        else if (ch=='*'){
            System.out.println("Multiplication of two number is "+(a*b));
        }
        else if (ch=='%'){
            System.out.println("Modulo of two number is "+(a%b));
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
