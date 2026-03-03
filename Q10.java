// Check Valid Triangle
// int a = 7;
// int b = 10;
// int c = 5;

// --> First check if the triangle is valid.
// (A triangle is valid if sum of any two sides is greater than the third.)

// If valid, print:

// "Valid Triangle"

//  If not valid, print:

// "Invalid Triangle"
public class Q10 {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        int c = 5;
        if ((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.println("Valid triangle!!");
        }
        else {
            System.out.println("Not valid triangle!!");
        }
    }
    
}