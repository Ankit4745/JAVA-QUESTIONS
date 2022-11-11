// Write a program which enter marks in three subject of a student and
// calculate its averageif the average if the average is 33 or more than print pass oterwise print fail.


import java.util.*;

public class Pass {
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

        if(average<=33){
            System.out.println("YOU ARE PASS");

        }
        else{
            System.out.println("YOU ARE FAIL");
            
        }

    }
}
