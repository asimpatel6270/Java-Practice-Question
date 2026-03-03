// Number Classification (Multiple Conditions)
// int num = -24;

// Write a program to print:

// "Positive Even"

// "Positive Odd"

// "Negative Even"

// "Negative Odd"

// "Zero"

// ⚠️ Think carefully about condition order.
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number :");
        num = in.nextInt();
        if(num>0){
            if(num%2==0){
                System.out.println("number is positive and even!!");
            }
            else {
                System.out.println("number is positive and odd!!");
            }}
        else{
            if(num%2==0){
                System.out.println("number is negative and even!!");
            }
            else {
                System.out.println("number is negative and odd!!");
            }
        }
        
    }
}