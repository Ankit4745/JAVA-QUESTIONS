// calculate income tax paid by an employee to the government as per the salbs mentioned below:
//       income slab                tax      
//       2.5l-5.0l              5%
//       5.0l-10.0l             20%
//       above  10.0l           30%
// note that there is not tax below 2.5l. take the input amount as input from the user.

import java.util.*;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER YOUR INCOME : ");
        int a = sc.nextInt();

        if(a <250000){
            System.out.println("YOUR INCOME IS "+a+" Rs. SO YOU TAX FREE");
        }
        else if(a >=250000 && a<500000){
            int q = (a*5)/100;
            System.out.println("YOUR INCOME IS "+a+" Rs. SO YOU HAVE TO "+q+" Rs. TAX ");
        }
        else if(a>= 500000 && a<1000000){
            int s = (a*20)/100;
            System.out.println("YOUR INCOME IS "+a+" Rs. SO YOU HAVE TO "+s+" Rs. TAX");
    
        }else if (a>=1000000){
            int z = (a*30)/100;
            System.out.println("YOUR INCOME IS "+a+" Rs. SO YOU HAVE TO PAY "+z+" Rs. TAX");
        }
        else {
            System.out.println(" ***YOU HAVE TO ENTER ONLY IN INTEGER***");
        }
    }
}
