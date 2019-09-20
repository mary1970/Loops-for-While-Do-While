package July17;

import java.util.Scanner;

public class palindrome {

    /* public static void printBackward(String letter) {
         String originalWord = "kaya";
         String reversedWord = "";
         for (int i = originalWord.length()-1; i >= 0; i--) {
             reversedWord = reversedWord + originalWord.charAt(i);
         }
             if (originalWord.equals(reversedWord) ) {
                 System.out.println("It is Palindrome");
             }
             else {
                 System.out.println("It is NOT palindrome");*/
   /* public static void checkPalindrome() {
        Scanner readKey = new Scanner(System.in);
        System.out.println("Enter Word :");
        String word = readKey.next();
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is NOT palindrome");*/




    public static String checkPalindrome(String word) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word :");
        String original = scanner.next();
        String reversKey = "";
        for (int i = original.length() - 1; i >= 0; i--) {

            reversKey = reversKey +original.charAt(i);
        }
        if (original.equals(reversKey)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is NOT palindrome");


        }
        return reversKey;
    }


    public static void main(String[] args) {
        //palindrome.printBackward("kaya");
        //alindrome.checkPalindrome();
        System.out.println(palindrome.checkPalindrome(""));
    }
}

