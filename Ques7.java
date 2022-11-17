// Write a program which enter se code of a person as M or m for MAN or f female and check and
// print whether the given data is male, female or it was wrong code entered by the usre.


import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE se CODE OF A PERSON AS M OR m FOR MAN  OR F OR f FOR FEMALE: ");
        char a = sc.nextLine().charAt(0);
         
        if(a=='M' || a=='m'){
            System.out.println("THE PERSON IS MALE");
        }
        else if(a=='F' || a=='f'){
            System.out.println("THE PERSON ID FEMALE ");

        }
        else {
            System.out.println("THE CODE IS INVALID");
        }

    }
    
}

