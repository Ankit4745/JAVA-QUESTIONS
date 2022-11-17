// Write a program to find out whether a student is pass or fail; if it requires a total of 40%
// and al least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

import java.util.*;

public class Ques15 {
public static void main(String[] args) {
    float av;
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE MARK OF HINDI:");
    int hindi = sc.nextInt();
    System.out.print("ENTER THE MARK OF ENGLISH:");
    int english = sc.nextInt();
    System.out.print("ENTER THE MARK OF MATH:");
    int math = sc.nextInt();

     av =( hindi+english+math)/3;
     System.out.println("YOUR AVERAGE IS ="+av);
     if(av>= 40 && hindi>=33 && english>=33 && math>=33){
        System.out.println("YOU ARE PASS ");
     }
     else{
        System.out.println("YOU ARE FAIL ");

     }





    


}    
}
