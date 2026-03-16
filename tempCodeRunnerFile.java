    static void HollowSquare(){
        for (int i = 1; i <=5; i++) {
            for(int j =1;j<=5;j++){
                if ((i==2&&(j==2||j==3||j==4))||(i==3&&(j==2||j==3||j==4))||(i==4&&(j==2||j==3||j==4))) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }