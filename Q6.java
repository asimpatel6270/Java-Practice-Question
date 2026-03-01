// Write a program to check whether a number lies between 10 and 50 (inclusive).
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = in.nextInt();
        if(num >=10 && num <=50){
            System.out.println("number lies between 10 and 50");
        }
        else {
            System.out.println("number doesn't lies in between 10 and 50");
        }
    }
    
}