/*

Each Sunday, a newspaper agency sells w copies of a special edition newspaper for Rs.x per copy. The cost to the agency of each newspaper is Rs.y. The agency pays a fixed cost for storage, delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate the profit which it obtains only on Sundays. Can you please help them out by writing a program to compute the profit if w, x, and y are given.

Input Format

Input consists of 3 integers: w, x, and y.
w is the number of copies sold, x is the cost per copy and y is the cost the agency spends per copy.
Constraints

No Constraints

Output Format

The output consists of a single integer which corresponds to the profit obtained by the newspaper agency.

Sample Input 0

1000
2
1
Sample Output 0

900
Sample Input 1

200
4
2
Sample Output 1

300

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution06 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=w*x;
        int b=w*y;
        int Total=a-b;
        System.out.println(Total-100);
    }
}
