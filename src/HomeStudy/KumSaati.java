package HomeStudy;

public class KumSaati {
    public static void main(String[] args) {
       // int number=0;
        for (int i=1;i<=7; i++){
            for (int j=1;j<=i;j++){
                System.out.print("-" );
            }
            int number=1;
            for (int k=7; k>=i; k--){
                System.out.print( "x ");
            }
            for (int a=1; a<=i; a++){
                System.out.print("-");
            }
            System.out.println();
        }
        for (int i=1; i<=7;i++){
            for (int j=7; j>=i;j--){
                System.out.print("-");
            }
            for ( int k=1;k<=i;k++){
                System.out.print( "x ");
            }
            for (int a=7; a>=i; a--){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
