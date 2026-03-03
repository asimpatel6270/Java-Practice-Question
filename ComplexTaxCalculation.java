// Complex Tax Calculation
// double salary = 850000;
// boolean seniorCitizen = false;
// double tax = 0;
// Tax Rules:

// If NOT senior citizen:

// Up to 250000 → No tax

// 250001–500000 → 5%

// 500001–1000000 → 20%

// Above 1000000 → 30%

// If senior citizen:

// Up to 300000 → No tax

// Rest same as above

// Calculate tax correctly
import java.util.Scanner;
public class ComplexTaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        boolean isSeniorCitizen = false;
        double tax = 0;
        if (isSeniorCitizen) {
            if (salary<=300000) {
                System.out.println("No tax!!!");
                }
            else {
                if (salary<=500000) {
                    tax = (salary-300000)*0.05;
                    System.out.println("tax amount :"+tax);
                }
                else if (salary<=1000000) {
                    tax = 300000*0.05 + (salary-500000)*0.20;
                    System.out.println("tax amount :"+tax);
                }
                else {
                    tax = 300000*0.05 + 500000*0.20 + (salary-1000000)*0.30;
                    System.out.println("tax amount :"+tax);
                }
            }
            
        }
        else {
            if (salary<=250000) {
                System.out.println("no tax");
            }
            else if (salary<=500000) {
                tax = (salary-250000)*0.05;
                System.out.println("tax amount :"+tax);
                
            }
            else if (salary<=1000000) {
                tax = (250000*0.05)+(salary-500000)*0.20;
                    System.out.println("tax amount :"+tax);
                }
            else {
                tax = 250000*0.05 + 500000*0.20 + (salary-1000000)*0.30;
                    System.out.println("tax amount :"+tax);
                }
        }
    }
    
}