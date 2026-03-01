// Write a program to check whether a number is within range 1–100 but not between 40–60.
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = in.nextInt();
        if((num>=1&&num<=100)){
            if(num>=40 && num <=60){
                System.out.println("num is between 40-60");
            }
            else {
                System.out.println("the number is within range 1-100 and not between 40-60");
            }
        }
        else {
            System.out.println("number is out of the range !!!");
        }
    }
    
}