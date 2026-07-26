/*
kumar wants to know how the math functions are working in programming.could you please help him to write the program.

Input Format

First input corresponds to float is for floor,ceil and round
second input corresponds to integer is for sqrt value
third input corresponds to integer is for base value
fourth input corresponds to integer is for power value
Constraints

No Constraints

Output Format

execute the values depends on the sample output format.
Sample Input 0

67.6734
16
5
2
Sample Output 0

67
68
68
4
25
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        float dec=sc.nextFloat();
        int sqrt=sc.nextInt();
        int pow=sc.nextInt();
        int base=sc.nextInt();
        System.out.println((int)Math.floor(dec));
        System.out.println((int)Math.ceil(dec));
        System.out.println((int)Math.round(dec));
        System.out.println((int)Math.sqrt(sqrt));
        System.out.print((int)Math.pow(pow,base));
    }
}
