// Write a program which enter any integer and if it less than 5 than calculate 
// its cube otherwise calculate and print its square.
// output format-
// Cube of...is..
// or
// square of...is...



import java.util.*;

public class Cube {
    public static void main(String[] args) {
        int cube,square;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF INTEGER:");
        int a = sc.nextInt();
        if(a<5){
            cube = a*a*a;
            System.out.println("CUBE OF "+a+" IS "+cube);
        }
        else{
            square = a*a;
            System.out.println("SQUARE OF "+a+" IS "+square);
            
        }
    }
}
