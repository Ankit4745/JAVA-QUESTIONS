// Write a program which enter the number of words to be send by telegram than calculate
// and print telegram charge according to following rule-
// upto 10 word, total charge is Rs. 7.5, for each extra word, the charge is rs. 1.5 per words extra.   

import java.util.*;


public class Telegram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF WORDS TO BE SEND BY TELEGRAM:");
        int a = sc.nextInt();

        if(a<=10){
            Float b = a*7.5f;
            System.out.println("THE TOTAL CHARGE IS "+b+  " Rs. FOR " +a+ " WORDS");


        }
        else{
            int c = a-10;
            double d = (c*1.5)+ 75;
            System.out.println("THE TOTAL CHARGE IS "+d+" Rs. FOR "+a+" WORDS");





        }
    }
}
