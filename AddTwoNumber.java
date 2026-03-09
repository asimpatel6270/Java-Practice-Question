import java.util.Scanner;
// Write a Java program that takes two numbers and prints:
// Addition
// Subtraction
// Multiplication
// Division
// Modulus
// Example
// Input: 10 3
// Output:
// Addition = 13
// Subtraction = 7
// Multiplication = 30
// Division = 3
// Modulus = 1
public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        System.out.println("num1 + num2 = "+(num1+num2));
        System.out.println("num1 - num2 = "+(num1-num2));
        System.out.println("num1 * num2 = "+(num1*num2));
        System.out.println("num1 / num2 = "+(num1/num2));
        System.out.println("num1 % num2 = "+(num1%num2));
    }
}