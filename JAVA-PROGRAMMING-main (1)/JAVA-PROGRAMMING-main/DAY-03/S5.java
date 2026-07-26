/*

Deepak wants to know how to find whether the year is leap year or not.could you please help him to find the year is leap year or not. - A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400. - A leap year (except a century year) can be identified if it is exactly divisible by 4. - A century year should be divisible by 4 and 100 both. - A non-century year should be divisible only by 4.

Input Format

input consists of integer
Constraints

No Constraints

Output Format

execute the statemene whether the given year is leap or not.
Sample Input 0

1900
Sample Output 0

The Given Year 1900 is Not a Leap Year.
Sample Input 1

2000
Sample Output 1

The Given Year 2000 is a Leap Year.
Sample Input 2

2015
Sample Output 2

The Given Year 2015 is Not a Leap Year.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int ly=sc.nextInt();
        if (ly%100==0){
            if (ly%400==0){
                System.out.print("The Given Year "+ly+" is a Leap Year.");
            }
            else{
                System.out.print("The Given Year "+ly+" is Not a Leap Year.");
            }
        }
        else if (ly%4==0){
            System.out.print("The Given Year "+ly+" is a Leap Year.");
        }
        else{
            System.out.println("The Given Year "+ly+" is Not a Leap Year.");
        }
    }
}

