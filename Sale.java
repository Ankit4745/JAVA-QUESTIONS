//   Write a program which enter sales made by a any salesman that calculate and print the 
// commission, according to following rules-
// sale up to 25000, commission is 5% of sale, otherwise it is & 7% of sales
//            output format -
//            commission=.....Rs.



import java.util.*;
import javax.naming.event.NamingExceptionEvent;
public class Sale {
    public static void main(String[] args) { 
        float less,more,a;

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SALE MADE BY SALESMAN:");
        a = sc.nextFloat();
        
        if(a<=25000){
            less = (a*5)/100;

          System.out.println("Commision is "+less+" Rs.");
        }
        else{
            more = (a*7)/100;
            System.out.println("Commision= "+more+" Rs.");

        }
    }
}

