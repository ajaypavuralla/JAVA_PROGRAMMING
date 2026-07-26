/*

Seela wants to find whether the given number is even or odd with in the range of 1 to 100.Could you please help her to find it.

Input Format

Input Consists of Integer

Constraints

N value is 1 to 100

Output Format

If the given number is even, Print the Statement based on the test case. If the given number is odd,Print the statement based on the test case. If the given number is not upto the constraints,Print the statement as "Invalid Input".

Sample Input 0

18
Sample Output 0

The Given Number 018 is Even.
Sample Input 1

7
Sample Output 1

The Given Number 007 is Odd.
Sample Input 2

200
Sample Output 2

Invalid Input

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution02 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n>100 || n<0){
            System.out.printf("Invalid Input");
        }
        else if(n%2==0) {
            System.out.printf("The Given Number %03d is Even.",n);
        }
        else{
            System.out.printf("The Given Number %03d is Odd.",n);
        }
    }
}
