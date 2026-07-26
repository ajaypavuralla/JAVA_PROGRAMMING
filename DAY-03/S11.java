/*

In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

**Hint: **k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”. If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

The ticket cost should be printed exactly to two decimal places.

Input Format

First input consist of no of tickets second input consists of refreshment Third input consist of coupon Forth input consist of ticket type

Constraints

No Constraints

Output Format

Execute the price of the tickects and the statements.

Sample Input 0

15
y
y
k
Sample Output 0

Ticket cost:1852.50
Sample Input 1

45
y
y
k
Sample Output 1

Minimum of 5 and Maximum of 40 tickets
Sample Input 2

12
y
y
b
Sample Output 2

Invalid Input

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S11 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        char ref=sc.next().charAt(0);
        char cup=sc.next().charAt(0);
        char tc=sc.next().charAt(0);
        if (t<5 || t>40){
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
            return;
        }
        double tp;
        if (tc=='k'){
            tp=75;
        }
        else if (tc=='q'){
            tp=150;
        }
        else{
            System.out.println("Invalid Input");
            return;
        }
        double total=t*tp;
        if(t>20){
            total=total-(0.10*total);
        }
        if (cup=='y'){
            total=total-(total*0.02);
        }
        if (ref=='y'){
            total+=t*50;
        }
            
        System.out.printf("Ticket cost:%.2f",total);
    }
}
