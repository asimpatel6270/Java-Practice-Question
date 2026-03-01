// Write a program to calculate the profit or loss based on cost price and selling price
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        double cost = 5000;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("enter -1 to end the program ");
            System.out.print("enter price :");
            double selling_price = in.nextDouble();
            if(selling_price == -1){
                break;
            }
            else if(selling_price > cost) {
                System.out.println("profit of "+(selling_price-cost)+" rupees");
            }
            else {
                System.out.println("loss of "+((cost) - selling_price)+" rupees");
            }
            
            
        }
    }
    
}