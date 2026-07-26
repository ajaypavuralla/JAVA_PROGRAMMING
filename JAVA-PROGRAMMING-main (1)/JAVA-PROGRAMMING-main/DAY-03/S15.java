/*

FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be “Input is Invalid”. If all department has equal number of placements, the output should be “None of the department has got the highest placement”.

Input Format

Get input from the user for the no of students placed in the year.

Constraints

No constraints

Output Format

Find the highest placement record

Sample Input 0

102
90
77
Sample Output 0

Highest Placement:
CSE
Sample Input 1

0
0
0
Sample Output 1

None of the department has got the highest placement
Sample Input 2

65
56
65
Sample Output 2

Highest Placement:
CSE
MECH
Sample Input 3

45
-23
-12
Sample Output 3

Input is Invalid

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S15 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a<0 || b<0 ||c<0) {
            System.out.println("Input is Invalid");
        }else if(a==b && b==c) {
            System.out.println("None of the department has got the highest placement");
        }else{
            System.out.println("Highest Placement:");
            if(a>b && a>c){
                System.out.println("CSE");
            }
            else if(c>b && c>a){
                System.out.println("MECH");
            }
            else if(b>a && b>c){
                System.out.println("ECE");
            }
            else if(a==c){
                System.out.println("CSE");
                System.out.println("MECH");
            }
            else if(b==c) {
                System.out.println("ECE");
                System.out.println("MECH");
            }
            else if(a==b){
                System.out.println("CSE");
                System.out.println("ECE");
            }
            else{
                System.out.println("MECH");
            }
        }
    }
}
