public class pattern {
    static void Square(){
        for (int i = 1; i <=5; i++) {
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void HollowSquare(){
        System.out.println("HollowSquare");
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for(int j =1;j<=n;j++){
                if (i==1||i==n||j==1||j==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    static void RectAngle(){
        System.out.println("RectAngle:");
        int row = 4;
        int col = 8;
        for (int i = 1; i<=row; i++) {
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void HollowRectAngle(){
        System.out.println("HollowRectAngle:");
        int row = 4;
        int col = 8;
        for (int i = 1; i<=row; i++) {
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    static void RightAngleTriangle(){
        System.out.println("Right Angle triangle :");
        for (int i = 1; i <=5; i++) {
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void ReverseRightAngleTriangle(){
        System.out.println("Reverse Right Angle Triangle :");
        for(int i=1;i<=5;i++){
            for(int j = 5;j>=i;j--){
                System.out.print("* ");
                
            }
            System.out.println();
        }

    }
    static void  EquilateralTriangle(){
        System.out.println("Equilateral Triangle :");
        int n = 4;
        
        for(int i = 1;i<=5;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
                
            }
            // n--;
            
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }
    }
    
    static void  ReverseEquilateralTriangle(){
        System.out.println("Reverse Equilateral Triangle :");
        int n = 4;
        
        for(int i = 1;i<=5;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
                
            }
            // n--;
            
            for(int j=i*2-1;j<=9;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }
    }
    static void Diamond(){
        System.out.println("Diamond : ");
        int n = 4;
        
        for(int i = 1;i<=5;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
                
            }
            // n--;
            
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }
        n = 4;
        
        for(int i = 1;i<=5;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
                
            }
            // n--;
            
            for(int j=i*2-1;j<=9;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }


    }
    static void HollowTrianle(){
        System.out.println("Hollow Triangle : ");
        int n = 7;
        for (int i = 1; i < 8; i++) {
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if (i==1||i==7||j==1||j==11||(j==9&&i==5)||(j==7&&i==4)||(j==5&&i==3)||(j==3&&i==2)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void ReverseHollowTriangle(){
        System.out.println("Reverse Hollow Triangle : ");
        int n = 7;
        for (int i = 1; i < 8; i++) {
            for (int k = 1; k <i; k++) {
                System.out.print(" ");
            }
            for(int j=i*2-1;j<=11;j++){
                if (i==1||i==7||j==1||j==11||(j==9&&i==5)||(j==7&&i==4)||(j==5&&i==3)||(j==3&&i==2)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                // System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Square();
        HollowSquare();
        RectAngle();
        HollowRectAngle();
        RightAngleTriangle();
        ReverseRightAngleTriangle();
        EquilateralTriangle();
        ReverseEquilateralTriangle();
        Diamond();
        HollowTrianle();
        ReverseHollowTriangle();




    }
}
    
