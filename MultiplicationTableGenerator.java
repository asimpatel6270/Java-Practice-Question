// Multiplication Table Generator

// Write a program that:

// Takes a number N

// Prints multiplication tables from 1 to N

// If the number is even, print table normally

// If the number is odd, print table in reverse
import java.util.Scanner;
public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        if (n%2==0) {
            for (int i = 0; i <=10; i++) {
                System.out.println(n+"x"+i+"="+(i*n));
            }
        }
        else {
            for (int i = 10; i >=0 ; i--) {
                System.out.println(n+"x"+i+"="+(i*n));
            }  
        }
            
    }
    
}