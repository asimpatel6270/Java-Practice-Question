// Student Result System
// Write a program that:
// Takes marks of 5 subjects
// Calculate:
// Total
// Average
// Print Grade
// Rules:
// Average	Grade
// 90+	A
// 75–89	B
// 50–74	C
// <50	Fail
// Also check:
// If any subject < 35 → Fail
import java.util.Scanner;
public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new  int[6];
        for (int i = 0; i <5; i++) {
            System.out.println("enter marks of your sunbject "+(i+1)+" : ");
            marks[i] = sc.nextInt();
        }
        int avg;
        int sum=0;
        for (int i : marks) {
            sum += i;
        }
        avg = sum/5;
        System.out.println("avg = "+avg);
        if((marks[0]<35 )||(marks[1]<35)||(marks[2]<35)||(marks[3]<35)||(marks[4]<35)){
            System.out.println("Fail!!!");
            return ;
        }
        else if (avg>=90) {
            System.out.println("Grade : A");
        }
        else if (avg>=75 && avg<=89) {
            System.out.println("Grade : B");
        }
        else if (avg>=50 && avg<=74) {
            System.out.println("Grade : C");
        }
        else if(avg<50){
            System.out.println("Fail!");
            return ;
        }
    }
}