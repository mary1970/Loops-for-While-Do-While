package HomeStudy;

public class mydiamondJuly22 {
    public static  String creatDiamond() {
        String diamond="";
        for (int i=1; i<=5;i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("-");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" x");
            }
            for (int a = 5; a >= i; a--) {
                System.out.print("-");
            }
            System.out.println();
        }
            for (int i=1; i<=5; i++){
                for (int j=1; j<=i;j++){
                    System.out.print("-");
                }
                for (int k=5;k>=i; k--){
                    System.out.print(" x");
                }
                for (int a=1; a<=i;a++){
                    System.out.print("-");
                }
                System.out.println();
            }
            return diamond;

            }

    public static void main(String[] args) {
        for (int i=1;i<5;i++) {
            System.out.print(mydiamondJuly22.creatDiamond());
        }
        System.out.print(mydiamondJuly22.creatDiamond());
        }


    }



