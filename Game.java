import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome!!");
        int rannum;
        int guess;
        Scanner sc = new Scanner(System.in);
        rannum = (int) (Math.random()*(100));
        int chances = 1;
        int flag;
        
        while (true) {
            System.out.println("Guess any number between 1 to 99 \n you have 5 chances");
            guess = sc.nextInt();
            if(chances <5){
                if(guess == rannum){
                    System.out.println("Congratulations 🎉👏🍾You won !!!!");
                    System.out.println("if you want to play again enter 1 or if not enter -1");
                    flag = sc.nextInt();
                    if (flag == 1) {
                        System.out.println("Welcome again !!!");
                        chances = 1;
                    }
                    else if (flag == -1) {
                        System.out.println("exiting the game .................");
                        break;
                    }
                    else {
                        System.out.println("invalid input");
                    }
                    
                }
                if(guess<rannum){
                    System.out.println("You entered smaller number , ... pls enter greater one ");
                }
                if (guess>rannum) {
                    System.out.println("You entered greater number , ... pls enter smaller one ");
                }
                chances++;
            }else {
                System.out.println("you lost😒🥱!!!");
                System.out.println("the real number is :"+rannum);
                    System.out.println("if you want to play again enter 1 or if not enter -1");
                    flag = sc.nextInt();
                    if (flag == 1) {
                        System.out.println("Welcome again !!!");
                        chances = 1;
                    }
                    else if (flag == -1) {
                        System.out.println("exiting the game .................");
                        break;
                    }
                    else {
                        System.out.println("invalid input");
                    }


            }

            

            
        }

    }
    
}