package MethodsAndLoops;

/**
 * Like in Exercise 4, your task is to develop a method called isPalindrome()
 * that takes a string as a parameter.
 * If the string is a palindrome (a word that is spelled the same forward and backward),
 * then the method will return a boolean of true.
 * If the string is not a palindrome, then false is returned.
 * The difference between this exercise and Exercise 4, however,
 * is that you will need to use a helper method called reverse() within isPalindrome().
 * The reverse() method takes a string as a parameter and reverses it.
 * Then the reversed string is returned.
 * Remember that capitalization matters.
 * For example, "Level" would not be considered a palindrome because uppercase "L" and
 * lowercase "l" are not the same.
 */
public class Exercise_5 {

    public static String reverse(String x) {
        String y = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            y += x.charAt(i);
        }
        return y;
    }

    //add code below this line

    public static boolean isPalindrome(String x){
        boolean palindrome = false;
        if (x.equals(reverse(x))){
            palindrome = true;
        }
        return palindrome;
    }

    //add code above this line

    public static void main(String args[]) {
        String x = args[0];
        System.out.println(isPalindrome(x));
    }

}
