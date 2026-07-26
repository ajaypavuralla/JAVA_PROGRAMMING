/* 
write the program to execute the decimal values.

Input Format

input consists of float
Constraints

No Constraints

Output Format

execute the float values depends on the sample ouput.
Sample Input 0

34.12345
Sample Output 0

34.12345
34.1235
34.123
34.12
34.1
34
Sample Input 1

56.67897
Sample Output 1

56.67897
56.6790
56.679
56.68
56.7
56
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        float dec=sc.nextFloat();
        System.out.print(dec);
        System.out.printf("\n%.4f",dec);
        System.out.printf("\n%.3f",dec);
        System.out.printf("\n%.2f",dec);
        System.out.printf("\n%.1f",dec);
        System.out.printf("\n%.0f",Math.floor(dec));
    }
}
