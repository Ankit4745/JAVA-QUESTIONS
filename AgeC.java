/*  Write a program which enter age of a person if the age is 18 or more than print you
are adult otherwise print you are minor using Conditional operator [? :]
*/

import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class AgeC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER YUOR AGE : ");
        int a = sc.nextInt();


        String n =(a>=18) ? " YOU ARE ADULT " :" YOU ARE MINOR" ;
        System.out.println(n);


    }
}
