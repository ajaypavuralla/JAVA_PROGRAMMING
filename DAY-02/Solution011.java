/*

You’re planning a road trip and want to calculate how far you’ll travel. You also have to consider the time spent on breaks. The car travels at a constant speed of 60 kilometers per hour. Write a program to calculate the total distance traveled after subtracting the time spent on stops.

Input Format

First input for the total time in hours
second input for total stop time in hours
Constraints

No constraints

Output Format

Execute the total distance travelled

Sample Input 0

3 0.5
Sample Output 0

The total distance traveled is: 150.00 km
Sample Input 1

7.5 2.5
Sample Output 1

The total distance traveled is: 300.00 km


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution011 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        float dis = sc.nextFloat();
        float  time = sc.nextFloat();
        float dt=dis-time;
        float d=(dt*60);
        System.out.printf("The total distance traveled is: %.2f km",d);
    }
}
