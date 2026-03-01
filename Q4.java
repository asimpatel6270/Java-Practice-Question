// Write a program to check whether a number is a multiple of 3 or 7.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter '-1' to end the program or");
            System.out.println("Enter the number to check whether a number is a multiple of 3 or 7 : ");
            int num = in.nextInt();
            if(num == -1){
                break;
            }
            else if (num%3==0 || num%7==0) {
                System.out.println("the number is devisible 3 or 7");
                
            }
            else {
                System.out.println("the number is not devisible by 3 or 7 !!!");
            }
        }
    }
}