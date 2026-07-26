/*
sila wants to know how the Arithmetic operators are performing in programming.could you please help her to learn the Arithmetic calculation.

Input Format

First input consist of integer
second input consist of integer
Constraints

No Constraints

Output Format

execute the Arithmetic calculation values.
Sample Input 0

45
7
Sample Output 0

Addition=52
Subtraction=38
Multiplication=315
Division=6
Modulo=3
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition="+(a+b));
        System.out.println("Subtraction="+(a-b));
        System.out.println("Multiplication="+(a*b));
        System.out.println("Division="+(a/b));
        System.out.println("Modulo="+(a%b));
    }
}
