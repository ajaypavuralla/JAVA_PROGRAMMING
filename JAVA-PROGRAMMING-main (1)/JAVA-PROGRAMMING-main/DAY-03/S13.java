/*

A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that asks the user to enter three integers as angles and check whether a triangle is valid or not.

Input Format

Inputs consist of angle1,angle2 and angle3.

Constraints

No Constraints

Output Format

Display the statement based on the testcase.

Sample Input 0

67
45
44
Sample Output 0

Triangle is not valid
Sample Input 1

49
50
81
Sample Output 1

Triangle is valid

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S13 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int sum=n1+n2+n3;
        if (sum==180){
            System.out.println("Triangle is valid");
        }
        else{
            System.out.println("Triangle is not valid");
        }
    }
}
