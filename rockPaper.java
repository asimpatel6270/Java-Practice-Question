import java.util.Scanner;
public class rockPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String computerchoice="as";
        System.out.println("Welcome!!!");
        int turn = 1;
        while (turn<=3) {
            int computer = (int)(Math.random()*(3));
            turn++;
            // System.out.println(computer);
            if(computer==0) {
                computerchoice = "stone";            
            }
            else if (computer ==1) {
                computerchoice = "paper"; 
            }
            else if (computer==2) {
                computerchoice = "scissor";
            }
            System.out.println(computerchoice);
            System.out.println("enter your choice :  stone , paper , scissor");
            String input = sc.next();        
            
            if (computerchoice.equalsIgnoreCase("stone")&&input.equalsIgnoreCase("stone")) {
                System.out.println("Tie!!");
            }
            else if (computerchoice.equalsIgnoreCase("stone")&&input.equalsIgnoreCase("paper")) {
                System.out.println("You winn!!!!");
            }
            else if (computerchoice.equalsIgnoreCase("stone")&&input.equalsIgnoreCase("scissor")) {
                System.out.println("You Loss!!!!");
            }
            else if (computerchoice.equalsIgnoreCase("paper")&&input.equalsIgnoreCase("scissor")) {
                System.out.println("You win!!!!");
            }
            else if (computerchoice.equalsIgnoreCase("stone")&&input.equalsIgnoreCase("scissor")) {
                System.out.println("You Loss!!!!");
            }
            else if (computerchoice.equalsIgnoreCase("scissor")&&input.equalsIgnoreCase("scissor")) {
                System.out.println("tie!!!!");
            }
            else if (computerchoice.equalsIgnoreCase("paper")&&input.equalsIgnoreCase("stone")) {
                System.out.println("you loss!!!!");
            }
            else if (computerchoice.equalsIgnoreCase("paper")&&input.equalsIgnoreCase("scissor")) {
                System.out.println("You win!!!!");
            }
            else if (computerchoice.equalsIgnoreCase("paper")&&input.equalsIgnoreCase("paper")) {
                System.out.println("tie!!!!");
            }
            
                
            }
    
        
        }
    }
    
