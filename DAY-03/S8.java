/*

Riya wants to find the greatest of three numbers.could you please help her to find the greatest of three numbers that implements in programming.

Input Format

Input consists of three integer.
Constraints

No Constraints

Output Format

print the greatest of three Number.
Sample Input 0

10
20
30
Sample Output 0

Number3 is maximum with value of 30.0
Sample Input 1

5
6
6
Sample Output 1

Number3 is maximum with value of 6.0
Sample Input 2

7
8
5
Sample Output 2

Number2 is maximum with value of 8.0

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        if (c>=b && c>=a){
            System.out.print("Number3 is maximum with value of "+c);
        }
        else if (b>=a && b>=c){
            System.out.print("Number2 is maximum with value of "+b);
        }
        else{
            System.out.print("Number1 is maximum with value of "+a);
        }
    }
}
