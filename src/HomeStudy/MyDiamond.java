package HomeStudy;

public class MyDiamond {
    public static void main(String[] args) {
        // for Upper part
        for(int i=1; i<8; i++){ //genel butun dongu icin
            for(int j=8; j>=i;j--) {//space kismi icin soldan baslayarak kurguluyoruz
                System.out.print(" ");
            }

            for (int k=1; k<=i; k++) {//starlardan olusan diamond kismi
                System.out.print("* ");
            }


            System.out.println();

        }
        //for Lower  part
        for(int i=1; i<9; i++){// genel bir dongu icin en dis loop
            for (int j=1; j<=i; j++){// space kismi yukarinin aksine artarak ilerliyor
                System.out.print(" ");
            }
            for (int k=8; k>=i; k--){// yildizli kisim azalarak ilerledigi icin k--
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
