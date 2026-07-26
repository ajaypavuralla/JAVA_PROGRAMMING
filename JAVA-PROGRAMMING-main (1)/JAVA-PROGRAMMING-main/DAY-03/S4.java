/*

Sela wants to learn the alphabets type to implements in the program.could you please her to implements the program.

Input Format

input consists of Character
Constraints

No Constraints

Output Format

if the Given input is A,print the statement is "Upper Case".
if the Given input is a,print the statement is "Lower Case".
if the Given input is 2,print the statement is "Number".
if the Given input is &,print the statement is "Symbol".
Sample Input 0

A
Sample Output 0

The Given Character A is Upper Case...
Sample Input 1

a
Sample Output 1

The Given Character a is Lower Case...
Sample Input 2

4
Sample Output 2

The Given Character 4 is Number...
Sample Input 3

#
Sample Output 3

The Given Character # is Symbol...

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch>='A' && ch<='Z') {
            System.out.println("The Given Character "+ch+" is Upper Case...");
        }
        else if(ch>='a' && ch<='z') {
            System.out.println("The Given Character "+ch+" is Lower Case...");
        }
        else if(ch>='0' && ch<='9') {
            System.out.println("The Given Character "+ch+" is Number...");
        }
        else {
            System.out.println("The Given Character "+ch+" is Symbol...");
        }
    }
}
