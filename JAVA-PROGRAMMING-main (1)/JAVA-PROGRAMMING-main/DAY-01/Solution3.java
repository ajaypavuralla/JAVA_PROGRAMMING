/*
Write the program to execute conversion of other datatype.

Input Format

input corresponds to the integer
Constraints

No constraints

Output Format

output corresponds to the ASCII values(character)
Sample Input 0

68
Sample Output 0

D
Sample Input 1

111
Sample Output 1

o
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int ascii=sc.nextInt();
        char ch=(char)ascii;
        System.out.print(ch);
    }
}
