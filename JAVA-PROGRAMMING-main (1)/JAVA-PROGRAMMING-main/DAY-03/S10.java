/*

College Management wants to separate the eligible students for their placement.so find the eligible students for the placement.

Notes:-

- If the students has 1 arrear and the cpga is above 70 - They are eligible for Placement.
- If the students has 1 or 2 arrear and the cpga is above 75 -They are eligible for Placement.
- Remaining students aren't eligible for Placement.
Input Format

input consists of one String and two integer.
Constraints

No Constraints

Output Format

print the statement "Eligible for Placement" or "Not Eligible for Placement".
Sample Input 0

John
1
76
Sample Output 0

Name of the Student:John
John is Eligible for Placement
Sample Input 1

John
2
70
Sample Output 1

Name of the Student:John
John is Not Eligible for Placement

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Name of the Student:"+s);
        if (a==1 && b>=70) {
            System.out.println(s+" is Eligible for Placement");
        }
        else if((a==1 ||a==2) && b>=75){
            System.out.println(s+" is Eligible for Placement");
        }
        else {
            System.out.println(s+" is Not Eligible for Placement");
        }
    }
}
