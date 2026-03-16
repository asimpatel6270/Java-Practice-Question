// Q1) Write a Java program that:

// Takes an integer n

// Calculates n!

// If n is negative, print "Factorial not defined".

// Example

// Input: 5
// Output: 120
// =======================================================================================================================================
// Q2)
// Write a program to calculate factorial without using the multiplication (*) operator.

// Hint: Use repeated addition inside loops.

// Example

// 5! = 120
import java.util.*;
public class Factorial {
    static int facto(int n){
        if (n==1) {
            return n;
        }
        
        return (n*(facto(n-1)));
    }
    static int factoWithAdd(int n){
        int num=n;
        int facto = 1;
        for(int i=1;i<=n;i++){
            int temp = 0;
            for(int j=1;j<=i;j++){
                temp = temp+facto;
            }  
            facto=temp;
        }
        return facto;

    }
    public static void main(String[] args) {
        // Factorial f = new Factorial();
        System.out.println(facto(5));
        System.out.println(factoWithAdd(5));
        
    }
    
}