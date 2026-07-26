/*
Diya wants to know how the decimal digit values are performing in programming.could you please help her to learn the decimal formatting.

Input Format

input consists of float
Constraints

No Constraints

Output Format

execute the values depends on the sample output format.
Sample Input 0

45.3456
Sample Output 0

45.34
45.35
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        double data=((int)(d*100))/100.0;
        System.out.printf("%.2f\n",data);
        System.out.printf("%.2f",d);
    }
}
