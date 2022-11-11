// Write a program which enter any code in integer and if it is 5,7,11 or 24 then print
// Right code otherwise print Wrong code.

import java.util.*;


public class Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code : ");
        int a = sc.nextInt();

        if(a==5 || a==7 || a==11 || a==24 ){

            System.out.println(a+" is a Right code.");

        }
        else {

            System.out.println(a+" is a Wrong code. ");
            
        }
    }
}
