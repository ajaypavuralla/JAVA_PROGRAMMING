/*

Dheena wants to know how the grading marks will works in education.could you please help him to learn the grading System. Note:-

100=Grade is S
90-99=Grade is A
80-89=Grade is B
70-79=Grade is C
60-69=Grade is D
50-59=Grade is E
<50=Fail
Get the subject marks from the user,then Find the average marks.Based on the average marks generate the Students grade marks.

Input Format

First input consists of String
Second input consists of integer
Third input consists of integer
Fourth input consists of integer
Fifth input consists of integer
Sixth input consists of integer
Constraints

No Constraints

Output Format

execute the total Marks,average marks and Grade Mark
Sample Input 0

John
100
99
100
100
99
Sample Output 0

Name of the Student:John
Total Mark:498
Average Mark:99.6
Grade Mark:A
Sample Input 1

Nivi
30
30
30
30
30
Sample Output 1

Name of the Student:Nivi
Total Mark:150
Average Mark:30.0
Grade Mark:Fail

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int total=b+c+d+e+f;
        float avg=(float)total/5;
        System.out.println("Name of the Student:"+a);
        System.out.println("Total Mark:"+total);
        System.out.println("Average Mark:"+avg);
        if (avg==100) {
            System.out.println("Grade Mark:S");
        }
        else if(avg>90) {
            System.out.println("Grade Mark:A");
        }
        else if(avg>80) {
            System.out.println("Grade Mark:B");
        }
        else if(avg>70) {
            System.out.println("Grade Mark:C");
        }
        else if (avg>60) {
            System.out.println("Grade Mark:D");
        }
        else if (avg>50) {
            System.out.println("Grade Mark:E");
        }
        else {
            System.out.println("Grade Mark:Fail");
        }
    }
}
