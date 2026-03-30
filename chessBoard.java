public class chessBoard {
    public static void main(String[] args) {
        for (int m = 1; m<=8; m++) {
            for (int n=1; n<=8; n++) {
                if(m==1||m==8){
                    System.out.print("|");
                } 
                else if (n==1||n==8) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }



                // if (i==8) {
                //     System.out.print("_");
                // }
                // if (j==8) {
                //     System.out.print("|      ");
                // }
                int m=1;
                int n=1;
        for(int i=1;i<=8;i++){

            for (int j=1; j <=8; j++) {

                if ((i+j)%2==0) {
                    if ((i==1||i==2||i==3||i==4||i==5||i==6||i==7||i==8)&&j==1) {
                        System.out.print("|");
                    }
                    if ((i==1||i==2||i==3||i==4||i==5||i==6||i==7||i==8)&&j==1) {
                        System.out.print("|");
                    }
                    System.out.print(" # ");
                }
                else {
                    System.out.print(" * ");
                }
                if ((i==1||i==2||i==3||i==4||i==5||i==6||i==7||i==8)&&j==8) {
                    System.out.print("|");
                }
                

            }
            
            System.out.println();
        }
    }
} 