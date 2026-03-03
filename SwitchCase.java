import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter purchase amount  :");
        double pur = sc.nextDouble();
        int dis;
        if (pur>=5000) {
            dis = 20;
        }
        else if (pur >=2000) {
            dis = 10;
        }
        else {
            dis = 5;
        }
    
    
    switch (dis) {
        case 20:
            System.out.println("you got 20% discount ");
            
            break;
        case 10:
            System.out.println("you got 10% discount ");
            break;
        case 5:
            System.out.println("you got 5% discount ");
            break;
        default:
            System.out.println("invalid input ");
    }   
    }
}