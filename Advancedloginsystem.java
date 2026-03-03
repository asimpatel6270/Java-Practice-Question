import java.util.Scanner;

public class Advancedloginsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Set Your username & password: ");
        String username = sc.nextLine();
        String password = sc.nextLine();

        boolean captchaverified = true;
        int failedattempts = 2;
        boolean accountlocked = false;

        System.out.println("Enter Username & password: ");
        String inputusername = sc.nextLine();
        String inputpassword = sc.nextLine();

        if(accountlocked) {
            System.out.println("Account is locked");
        }
        else if(failedattempts >= 3) {
            accountlocked = true;
            System.out.println("Account is locked due to multiple attempts");
        }
        else if(!inputusername.equals(username)) {
            System.out.println("Invalid username");
        }
        else if(!inputpassword.equals(password)) {
            failedattempts++;
            System.out.println("Wrong password");
        }
        else if(!captchaverified) {
            System.out.println("Captcha not verified");
        }
        else {
            System.out.println("Login Successful");
        }
}
      
}