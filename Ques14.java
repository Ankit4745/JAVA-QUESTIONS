// Write a java program to find of the day of the week given number [1 for monday, 2 for tuesday....and so on!]

import java.util.*;

import javax.swing.SwingConstants;
public class Ques14 {
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default :
            System.out.println("Number should between 1 to 7 ouly");
            break;

        }
    }
}
