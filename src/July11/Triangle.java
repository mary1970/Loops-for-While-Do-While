package July11;

public class Triangle {
    public static void main(String[] args) {
        int rc = 7;
        int space = 7;//space--
        int star = 1;//star +2
        int space1=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println();
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <=space; j++) {
                System.out.print("");
            }



            for (int z =1; z<= space1; z++) {
                System.out.print("o");
            }

            space--;
            star = star + 2;
            space1= space1-space;
        }
    }
}


