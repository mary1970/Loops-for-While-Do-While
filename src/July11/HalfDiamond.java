package July11;

public class HalfDiamond {
    public static void main(String[] args) {
        int star=1;
        for (int i=1;i<=13; i++){
            for(int j=1; j<=star; j++){
                System.out.print("*");

            }
            System.out.println(" ");
            if(i<=6){
                star=star+2;

            }
            else {
                star = star - 2;
            }
        }

    }
}

