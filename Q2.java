// Write a program to check whether a number is divisible by both 5 and 11.
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = in.nextInt();
        if((n%5 == 0) && (n%11==0)){
            System.out.println("The entered number is devisible by both 5 and 11");
        }
        else {
            System.out.println("the number is not devisible by 5 and 11");
        }
    }
    
}