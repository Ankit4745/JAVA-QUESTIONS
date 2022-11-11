// Write a program which enter any integer than check and print, whether it is odd no. 
// or even no. using Conditional operator[? :]




import java.util.*;

public class OddC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int a = sc.nextInt();
    
        String q = (a%2==0) ? "THE GIVEN NUMBER "+a+" IS EVEN " :"THE GIVEN NUMBER "+a+" IS ODD";
        System.out.println(q);



    }
}
