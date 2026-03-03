// Banking Withdrawal With Multiple Restrictions
// double balance = 10000;
// double withdrawAmount = 8000;
// boolean isWeekend = true;
// boolean isPremiumAccount = false;
// Rules:

// If withdrawAmount > balance → print "Insufficient Balance"

// If weekend AND not premium → withdrawal limit is 5000

// On weekdays → limit is 10000

// Premium account → no limit

// Print:

// "Withdrawal Successful"

// OR appropriate reason if denied
import java.util.Scanner;
public class BankingWithdrawalWithMultipleRestrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        // double withdrawalAmount = 8000;
        boolean isWeekend = true;
        double limit = 10000;
        boolean isPremiumAccount = false;
        System.out.print("enter withdrawal amount :");
        double withdrawalAmount = sc.nextDouble();

        if(isPremiumAccount){
            limit = balance;
        }
        else if(isWeekend&& (!(isPremiumAccount))) {
            limit = 5000;
        }

        if (withdrawalAmount>balance) {
            System.out.println("insufficient balance!!");
        }
        else if (withdrawalAmount<=limit) {
            System.out.println("withdrawal successfull of amount :"+withdrawalAmount);
        }
        else {
            System.out.println("your limit is:"+limit);
        }
    }
    
}