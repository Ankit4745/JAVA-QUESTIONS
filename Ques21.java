/*Write a program which enter two integers then check and print that how many times
 * the first integer can be divided by the second integer and what will be left.
 */
import java.util.*;

public class Ques21 {
    

    public static void main(String[] args) {
        int t,r;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUR OF FIRST INTEGER=");
        int a = sc.nextInt();
        System.out.print("ENTER THE VALUE OF SECOND INTEGER=");
        int b = sc.nextInt();
        t=a/b;
        r=a%b;
        System.out.println("WE CAN DIVIDED "+t+" TIMES "+a+" BY "+b+" AND THE WILL BE LEFT "+r);
    }
}
