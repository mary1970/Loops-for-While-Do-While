package HomeStudy;

public class DiamondFor {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print("0");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print("0");
            }

            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
//            for(int m=5; m<10; m++)
//            for(int a=1; a<=9; a++){
//                System.out.print(" ");
//            }
        }



