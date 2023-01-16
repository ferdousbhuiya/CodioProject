package MethodsAndLoops;

import java.util.Scanner;

/**
 * Write a method called isPalindrome() that takes a string as a parameter.
 * If the string is a palindrome (a word that is spelled the same forward and backward),
 * then the method will return a boolean of true. If the string is not a palindrome,
 * then false is returned. Note that capitalization matters. For example,
 * "Level" would not be considered a palindrome because uppercase
 * "L" and lowercase "l" are not the same.
 */
public class Exercise_4 {



    //add code below this line

    public static boolean isPalindrome(String x){
        boolean isPalindrome =false;
        String y = "";
        for(int i = x.length()-1; i>=0; i--){
            y += x.charAt(i);
        }
        if(x.equals(y)){
            isPalindrome = true;
        }
        return isPalindrome;
    }

    //add code above this line

    public static void main(String args[]) {
        System.out.println("Please enter a word that will check the Palindrome");
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
        String x = text.toLowerCase();
        System.out.println(isPalindrome(x));
    }

}
