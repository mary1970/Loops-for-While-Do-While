package July6and7;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        /*for (int a= 1;a<=10; a++){
            System.out.println("Hello Nusret Nasilsin?");
        }*/
       /* for (int i=1;i<5;i++ ){
            System.out.println("*****");
        }*/
        Scanner scanner = new Scanner((System.in));
        System.out.println("Please Enter a Number");
        int numUser = scanner.nextInt();
        int numGuess = 705;
        //for (int i = 1; i < 5; i++) {
        int i =0;

        while ( i<= 5){


            if (numGuess > numUser) {
                System.out.println("Please enter Larger Number: ");
            } else if (numGuess < numUser) {
                System.out.println("Please Enter Less Nubmber");
            } else {
                System.out.println("Congrats");
            }
            i++;


        }

    }
}
