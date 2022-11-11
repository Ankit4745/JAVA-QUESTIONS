// Write a program which enter any integer than check and print, wheter the given 
// integer is a positive no., negative no. or zero(0).


import java.util.*;


public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        double a = sc.nextDouble();
         
        if(a>0){
            System.out.println("THE NUMBER "+a+" IS POSITIVE");

        }
        else if(a==0){
            System.out.println("THE NUMBER IS ZERO");
        }
        else if (a<0){
            System.out.println("THE NUMBER "+a+"IS NEGATIVE ");
        }
        else {
            System.out.println("DEFOLAT");

        }


    }
    
}
