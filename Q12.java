// Switch – Simple Calculator
// int num1 = 12;
// int num2 = 4;
// char operator = '/';

// Using switch, perform:

// +

// -

// *

// /

// ⚠️ If dividing by zero, print "Cannot divide by zero"
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner in = new Scanner(System.in);
        while (true) {
        System.out.println("Enter type of operation : + , - , / , * , % , ^");
        char operator = in.next().charAt(0);
        System.out.print("enter num1:");
        num1 = in.nextDouble();
        System.out.print("enter num2:");
        num2 = in.nextDouble();
            switch (operator) {
                case '+':
                    System.out.println("num1 + num2 = "+(num1+num2));
                    break;
                case '-':
                    System.out.println("num1 - num2 = "+(num1-num2));
                    break;
                case '*':
                    System.out.println("num1 x num2 = "+(num1*num2));
                    break;
                case '/':
                    if(num2==0){
                        System.out.println("cannot divide by zero!!");
                    }
                    else {
                        System.out.println("num1/num2 = "+(num1/num2));
                    }
                    break;
                case '%':
                    System.out.println("num1 % num2 = "+(num1%num2));
                    break;
                default:
                    System.out.println("invalid input !!");
 
                    
            }
        }

        
    }
    
}