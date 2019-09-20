package July8;

public class ForLoopWithChar {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                if (i == j) {

                    System.out.println(i + "a b c d");
                }
            }
            System.out.println();
        }

        for (int z = 1; z < 5; z++) {
            System.out.println(z);
            char letter = 'a';
            for (int b = 1; b <= 2; b++) {


                System.out.println(z + letter);
                letter++;

            }
            System.out.println();
        }
    }
}


