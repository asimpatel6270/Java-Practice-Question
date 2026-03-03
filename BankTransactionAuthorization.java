// Bank Transaction Authorization 
// double balance = 20000;
// double withdrawAmount = 15000;
// boolean isPremium = false;
// boolean isInternational = true;
// boolean kycCompleted = true;
// Rules:

// If KYC not completed → "Complete KYC First"

// If withdrawAmount > balance → "Insufficient Balance"

// If international transaction:

// Only premium users allowed

// If not premium → "Upgrade to Premium for International Transactions"

// Daily withdrawal limit:

// Normal user → 10000

// Premium → 50000

// If all valid → "Transaction Approved"

// ⚠ Some checks must come before others.
public class BankTransactionAuthorization {
    public static void main(String[] args) {
        double balance = 20000;
        double withdrawAmount = 15000;
        boolean isPremium = false;
        boolean isInternational = true;
        boolean kycCompleted = true;
        double limit = 10000;
        if(!kycCompleted){
            System.out.println("First complete the kyc");
            
        }
        else if (withdrawAmount>balance) {
            System.out.println("Insufficient fund");
        }
        if(isPremium){
            limit = 50000;
        }
        else {
            limit = 10000;
        }
        if(isInternational&& !isPremium){
            System.out.println("Upgradde to premium for international transaction!!");
        }
        else if (withdrawAmount>limit) {
            System.out.println("Daily limit exceed!!!");
        }
        else {
            System.out.println("Transaction is approved of :"+ withdrawAmount);
        }
        
    }
    
}