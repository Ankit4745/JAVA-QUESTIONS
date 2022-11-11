// Write a program which enter the sale made by salesman if the sale is upto 25000 than 
// commission is 5%of sale otherwise it is 7% of sale using Conditional operator[ ? :]


import java.util.*;

public class SaleC {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print(" ENTER THE SALE MADE BY SALESMAN : ");
    int a = sc.nextInt();
    int  b = (a*5)/100;
    int d = (a*7)/100 ;


    String w = (a<=25000) ?  "THE COMMISSION IS "+b+" Rs. ON THE SALE OF "+a :  "THE COMMISION IS "+d+" Rs. ON THE SALE OF "+a;

    System.out.println(w);
}
}



