/*

During Eid, a family is preparing gift boxes for their relatives. In addition to the planned gifts, they also decide to prepare a few extra gift boxes. Determine the total number of gifts prepared and the overall cost based on the price of each gift.

Input Format

First input for num of relatives
second input for extra gifts
third input for price of each gift
Constraints

No constraints

Output Format

Execute the total gifts and total cost of the gifts

Sample Input 0

8 4 12
Sample Output 0

Total gifts: 12
Total cost: $144
Sample Input 1

1 1 100
Sample Output 1

Total gifts: 2
Total cost: $200

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution09 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Total=a+b;
        System.out.println("Total gifts: "+Total);
        System.out.println("Total cost: $"+(Total*c));
    }
}
