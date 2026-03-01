// Write a program to check whether a character is a vowel or consonant.
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter a character or "+"end " +"to end the program");
            String a = sc.next();
            char ch = a.charAt(0);
            if(a.equalsIgnoreCase("end")){
                break;
            }
            else if (ch == 'A' || ch == 'a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='U'||ch=='u'||ch=='O'||ch=='O') {
                System.out.println("vowel!!");
            }
            
            else {
                System.out.println("consonant");
            }
        }



        
    }}
    
