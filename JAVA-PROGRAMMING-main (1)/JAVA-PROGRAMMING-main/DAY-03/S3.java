/*

Sanjay wants to learn the calculation of integer digits.could you please help him to implements the sum of digits in programming. Notes:- - If the integer is 45,separate the each digits (4+5) the output is 9.

Input Format

input consists of one integer.
Constraints

Given N is greater than 9 and lesser than 99
Output Format

execute the sum of digits values. Notes:-
If the input is above 100, execute the statements is "Invalid Input".
Sample Input 0

23
Sample Output 0

Sum of Digit 23 is 005
Sample Input 1

56
Sample Output 1

Sum of Digit 56 is 011
Sample Input 2

100
Sample Output 2

Invalid Input

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num<9 || num>99) {
            System.out.println("Invalid Input");
        }
        else {
            double a=(num/10);
            double b=(num%10);
            System.out.printf("Sum of Digit %d is %03d",num,(int)(a+b));
        }
    }
}
