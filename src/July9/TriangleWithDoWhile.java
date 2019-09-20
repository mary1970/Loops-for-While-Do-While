package July9;

public class TriangleWithDoWhile {
    public static void main(String[] args) {
        String star = "*";
        int i = 0;
        do {
            System.out.println(star);
            star = star +"*";

            i++;
        }
        while (i < 7);

    }
}

