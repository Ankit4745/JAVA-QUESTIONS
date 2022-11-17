// Write a program which enter marks in three Subject of a student and calculate its 
// average, independent on the average check and print the according to following 
// rule-
//            avg     division
//           60+      first
            //   45-<60    second
            // 33-<      third
            // <33       fail.



import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
         int average;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE MARK OF HINDI:");
        int hindi = sc.nextInt();
        System.out.print("ENTER THE MARK OF ENGLISH:");
        int english = sc.nextInt();
        System.out.print("ENTER THE MARK OF MATH:");
        int math = sc.nextInt();

         average = (hindi+english+math)/3;
        System.out.println(" YOUR AVERAGE IS "+average);

        if(average>=60){
            System.out.println(" YOU ARE GOT FIRST DIVISION");
        }
        else if(average>=45 && average<=60){
            System.out.println(" YOU ARE GOT SECOND DIVISION");
        }
        else if(average>=33 && average<=45){
            System.out.println(" YOU ARE GOT THRID DIVISION");
        }
        else {
            System.out.println(" YOU ARE FAIL ");

        }


        
    }

}
