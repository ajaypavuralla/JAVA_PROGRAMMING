/*

Imagine you are creating a program for a bookshop. Each book costs $10. You need to calculate the total cost for a customer based on the number of books they want to purchase. Write a C program to calculate the total bill. image

Input Format

One integer input

Constraints

NO CONSTRAINTS

Output Format

Execute the final cost of the book

Sample Input 0

25
Sample Output 0

The total cost is: $250
Sample Input 1

100
Sample Output 1

The total cost is: $1000

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution08 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The total cost is: $"+(num*10));
    }
}
