// Advanced Login Security System
// String username = "admin";
// String password = "Admin@123";
// boolean captchaVerified = true;
// int failedAttempts = 2;
// boolean accountLocked = false;
// Rules:

// If accountLocked is true → print "Account Locked"

// If failedAttempts ≥ 3 → lock account and print "Account Locked Due To Multiple Attempts"

// If username is incorrect → "Invalid Username"
// If username correct BUT password incorrect →

// Increase failedAttempts by 1

// Print "Wrong Password"

// If captcha not verified → "Captcha Required"

// If all correct → "Login Successful"

// ⚠ Important:

// Only ONE message should print.

// Order of conditions is critical.

// Some conditions override others.
import java.util.Scanner;
public class AdvancedLoginSecuritySystem {
    public static void main(String[] args) {
        String username = "admin";
        String password = "Admin@123";
        boolean captchaVerified = true;
        int failedAttempts = 0;
        boolean accountLocked = false;
        Scanner sc = new Scanner(System.in);
        String name;
        String pass;
        
        while (true) {
            if(!accountLocked){
                System.out.println("Enter user name:");
                name = sc.next();
                if (failedAttempts<3) {
                    System.out.println("enter password :-");
                    pass = sc.next();
                    if(name.equals(username)){
                        if(pass.equals(password)){
                            if(captchaVerified){
                                System.out.println("Login successfull!!");
                                break;
                            }
                            else {
                                System.out.println("captcha does not matched");
                            }

                        }
                        else {
                            

                            System.out.println("Wrong password!!");
                            failedAttempts +=1;
                        }
                    }
                    else {
                        System.out.println("invalid user name !!");
                        failedAttempts +=1;
                    }     
                }
                else if(failedAttempts>=3) {
                    accountLocked = true;
                    System.out.println("no attempts are left ");
                    System.out.println("Account locked ⚠️");
                    break;
                }
            }

            
        }
    }
    
}