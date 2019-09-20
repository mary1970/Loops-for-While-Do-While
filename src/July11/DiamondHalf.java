package July11;

public class DiamondHalf {
    public static void main(String[] args) {
        int star=1;
        for(int i=1; i<=11;i++) {

            for (int j = 1; j <= star; j++) {

                System.out.print("x");
            }

            System.out.println();

            if (i<=5) {

                star = star + 2;
            }
            else{
                star=star-2;

            }

        }
    }
}

