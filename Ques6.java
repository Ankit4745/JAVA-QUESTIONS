// Write a program which enter Anuual income and age of a person and if the income is 
// from 1 lakh to 2 lakh and age is also from 18 to 24 then print eligible for scholarship 
// otherwise print not eligibe for scholarship.


import java.util.*;
import javax.lang.model.util.ElementScanner14;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Anuual income : ");
        int Anuual = sc.nextInt();        
        if(Anuual>=100000 && Anuual<=200000){
            System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18 && age<=24){
            
            System.out.println("***YOU ARE ELIGIBE FOR THE SCHOLERSHIP***");
        }
        else{
            System.out.println("YOUR AGE SHOULD BE FROM 18 TO 24");
            System.out.println("YOU ARE NOT ELIGIBE FOR THE SCHOLERSHIP");
        }
        }
        else {
            System.out.println("YOUR ANUUAL INCOME SHOULD BE FROM 1 LAKH TO 2 LAKH");
            System.out.println("YOU ARE NOT ELIGIBE FOR THE SCHOLERSHIP");
        }
        }
    }


