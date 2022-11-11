// Write a program which enter sale made by saleman than calculate and print the commission
// according to following rules-
//              sale                Commision
//              up to 25000         5% of sales
//              25001-50000         7% of sales
//              50001-75000         8% of sales
//              75001               10% of sales



import java.util.*;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sale made by saleman : ");
        Float sale = sc.nextFloat();

        if(sale<=25000){
            Float f = (sale*5)/100;
            System.out.println("the commission is  "+f+" Rs. on the sale of "+sale);

    }
       else if(sale>25000 && sale<=50000){
       Float q = (sale*7)/100;
       System.out.println("the commission is "+q+" Rs. on the sale of "+sale);

       }
       else if(sale>50000 && sale<=75000){
        Float d = (sale*8)/100;
        System.out.println("the commission is "+d+ " Rs. on the sale of "+sale);

       }
       else if(sale>75000){
        Float j = (sale*10)/100;
        System.out.println("the commission is "+j+" Rs. on the sale of "+sale);

       }
       else {
        System.out.println(" defulat entery");

       }
       
    }
}
