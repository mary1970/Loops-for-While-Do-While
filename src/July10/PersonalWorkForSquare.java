package July10;

public class PersonalWorkForSquare {
    public static void main(String[] args) {
        int rowline = 7;

        int max = 7;
        int star = 1;
        for (int i = 1; i <= rowline; i++) {
            System.out.println();

            for (int j = 1; j <= max; j++) {
                System.out.print("* ");
            }

            for (int k = 1; k <= star; k++) {
                System.out.print("s ");
            }
            star++;


            max--;
        }
    }
}


