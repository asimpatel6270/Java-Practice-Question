// Write a program to calculate the grade of a student based on marks:

// 90 and above → A

// 75–89 → B

// 50–74 → C

// Below 50 → Fail
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter '-1' to end the program");
            System.out.print("Enter your Marks to Know your Grade :");
            int marks = in.nextInt();
            if(marks == -1){
                break;
            }
            else if(marks>=90){
                System.out.println("Grade : 'A' ");
            }
            else if(marks>=75 && marks<=89){
                System.out.println("Grade : 'B' ");
            }
            else if(marks>=50 && marks <=74){
                System.out.println("Grade : 'C'");
            }
            else if (marks<50) {
                System.out.println("Fail !!!");
            }
            else {
                System.out.println("invalid input !!");
            }
            
        }
    }
    
}