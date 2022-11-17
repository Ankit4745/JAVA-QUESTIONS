// Write a program which enter any integer then check and print whether
// it is odd no. or even no. 

import java.util.*;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE INTEGER:");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("THE INTEGER "+a+" IS EVEN");

        }
        else{
            System.out.println("THE INTEGER "+a+" IS ODD");

        }


    }
    
}
