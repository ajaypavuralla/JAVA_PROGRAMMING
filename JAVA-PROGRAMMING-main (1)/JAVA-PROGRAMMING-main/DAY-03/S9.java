/*

Maya wants to know how the Numbers are converted to string in the program.could you please help her to implements the program.

Input Format

input consists of one integer
Constraints

Given N is greater than 0 and lesser than 9
Output Format

print the number into string type.
Sample Input 0

0
Sample Output 0

Integer is 0 and String is Zero
Sample Input 1

2
Sample Output 1

Integer is 2 and String is Two
Sample Input 2

10
Sample Output 2

Invalid Input

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0) {
            System.out.println("Integer is "+n+" and String is Zero");
        }
        else if (n==1) {
            System.out.println("Integer is "+n+" and String is One");
        }
        else if (n==2) {
            System.out.println("Integer is "+n+" and String is Two");
        }
        else if (n==3) {
            System.out.println("Integer is "+n+" and String is Three");
        }
        else if (n==4) {
            System.out.println("Integer is "+n+" and String is Four");
        }
        else if (n==5) {
            System.out.println("Integer is "+n+" and String is Five");
        }
        else if (n==6) {
            System.out.println("Integer is "+n+" and String is Six");
        }
        else if (n==7) {
            System.out.println("Integer is "+n+" and String is Seven");
        }
        else if (n==8) {
            System.out.println("Integer is "+n+" and String is Eight");
        }
        else if (n==9) {
            System.out.println("Integer is "+n+" and String is Nine");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
