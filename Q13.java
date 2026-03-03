// Voting Eligibility with Special Case
// int age = 17;
// boolean hasVoterID = true;

// Print:

// "Eligible to Vote" → age ≥ 18 AND hasVoterID is true

// "Voter ID Required" → age ≥ 18 but no ID

// "Not Eligible" → age < 18
public class Q13 {
    public static void main(String[] args) {
        int age = 18;
        // boolean hasVoterID = false;
        boolean hasVoterID = true;

        if(age<18){
            System.out.println("not eligible to vote");
        }
        else if (age >= 18&&hasVoterID) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Voter ID required!!");
        }
    }
    
}