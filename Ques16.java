/*write a program which enter the age of a person and if the age is 18 or more, than
print you can drive otherwise print you can not drive */


import java.util.*;

import javax.naming.event.NamingExceptionEvent;

public class Ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE YOUR AGE:");
        int a = sc.nextInt();
        if(a>18){
            System.out.println("you can drive");
        }
        else{
            System.out.println("you can not drive ");

        }
    }
    
}
