package July10;

public class PyramidStar {
    public static void main(String[] args) {


        int limit = 7;
        int limitStar = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print("* ");

            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                //for(int k=1; k <=limitStar; k++)
                System.out.print("+ ");

            }
        }
    }
}