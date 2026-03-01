// Write a program to calculate net salary:

// HRA = 20% of basic

// DA = 50% of basic

// If basic > 50,000 → add bonus 5%
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic salary:");
        double basic = sc.nextDouble();
        double hra = (basic*20)/100;
        double da = (basic*50)/100;
        double bonus = 0;
        if(basic>50000){
            bonus = (basic*5)/100;
        }
        System.out.println("HRA : "+hra);
        System.out.println("da : "+da);
        System.out.println("Bonus : "+bonus);
        System.out.println("Net salary : "+(hra+da+bonus));

    }
}