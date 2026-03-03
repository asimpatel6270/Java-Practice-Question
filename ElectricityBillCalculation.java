// Electricity Bill Calculation
// int units = 180;
// double bill = 0;

// Calculate bill:

// First 100 units → ₹5 per unit

// Next 100 units → ₹7 per unit

// Above 200 units → ₹10 per unit

// Print total bill.
public class ElectricityBillCalculation {
    public static void main(String[] args) {
        int units = 180;
        double bill = 0;
        if(units <= 100){
            bill = 5*units;
            System.out.println("Your bill amount is : "+bill);
        }
        else if(units <=200) {
            bill = (5*100)+ (units-100)*7;
            System.out.println("Your bill amount is : "+bill);
        }
        else if (units>200) {
            bill = (5*100)+ (100)*7 + (units - 200)*10;  
            System.out.println("Your bill amount is : "+bill);
        }
    }
    
}