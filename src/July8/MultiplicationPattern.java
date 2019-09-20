package July8;

public class MultiplicationPattern {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            //if you add a new line on outer for, each multiplication table will have space in between
            System.out.println("\n");
            for(int j=1; j<=10; j++){
                int mult=i*j;
                System.out.println(i+" * "+j+" = "+mult);
            }
        }
    }
}


