// The Goal: Get exactly to the number 21.

// Imagine you have a bucket. Right now, there are 10 litres of water in it.
// You want to have exactly 21 litres to win.


// How to Play:

// 1. The computer gives you a random number between 1 and 8.
//    Example: It gives you 5.

// 2. You choose a Math Tool to use that number:

//    Plus (+)
//        Add the number to your bucket.
//        Example: 10 + 5 = 15

//    Minus (-)
//        Subtract the number from your bucket.
//        Example: 10 - 5 = 5

//    Multiply (*)
//        Double whatever is in your bucket.
//        Note: This ignores the random number.
//        Example: 10 * 2 = 20

// 3. Keep playing until you reach exactly 21.


// How You Lose:

// 1. If your bucket goes above 50 → It overflows (Game Over).
// 2. If your bucket goes below 0 → It becomes empty (Game Over).
// 3. If you take more than 7 turns and still are not at 21 → You lose.


// What You Need to Code:

// 1. A Loop
//    Allows the player to keep playing until they win or lose.

// 2. Conditions (If / Else)

//    If player chooses "+" → Add the number.
//    If player chooses "-" → Subtract the number.
//    If player chooses "*" → Multiply the bucket value by 2.

// 3. Win Condition

//    If the bucket value becomes exactly 21
//    → Print: "You Win!"

// 4. Operators

//    Use the following operators to change the bucket value:
//    +   -   *
import java.util.Scanner;
public class BucketWater {
    public static void main(String[] args) {
        int bucket = 10;
        int turn = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("initially your bucket contains "+bucket+" liters of water!!");
        while (true) {
            int rannum = ((int) (Math.random()*(21)))+1;
            System.out.println("You got the number :"+rannum);
            System.out.println("enter your choice : + , - , *");
            char choice = sc.next().charAt(0);
            
            switch (choice) {
                case '+':
                    bucket += rannum;
                    System.out.println("now bucket contains "+bucket+" liters of water");
                    break;
                case '-':
                    bucket -= rannum;
                    System.out.println("now bucket contains "+bucket+" liters of water");
                    break;
                case '*':
                    bucket = bucket*2 ;
                    System.out.println("now bucket contains "+bucket+" liters of water");
                default:
                    System.out.println("invalid operator!!");
                    
            }
            if (turn>=7) {
                System.out.println("No more attempts are left");
                break;
                
            }

            if (bucket<0) {
                System.out.println("Bucket empty ,You loss");
                break;
            }
            if(bucket==21){
                System.out.println("You win‼️!!!!");
                break;
            }
            turn++;
            
            
        } 
        
    }
    
}