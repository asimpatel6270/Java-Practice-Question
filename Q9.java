// Write a program to calculate discount:

// If purchase ≥ 5000 → 20%

// If purchase ≥ 2000 → 10%

// Otherwise → 5%
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amount;
        while (true) {
            System.out.print("enter purcahse amount:");
            amount = in.nextInt();
            if(amount>=5000){
                System.out.println("you got discount of : "+(amount*20)/100);
            }
            else if (amount>=2000) {
                System.out.println("you got discount of : "+(amount*10)/100);
                
            }
            else {
                System.out.println("you got discount of :"+(amount*5)/100);
            }
            

            
        }
    }
    
}

