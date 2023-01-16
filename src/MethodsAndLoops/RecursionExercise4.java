package MethodsAndLoops;

import java.util.Scanner;

/**
 * Write a recursive method called reverseString that takes a string
 * as a parameter. Return the string in reverse order.
 */
public class RecursionExercise4 {
    public static void main(String[] args) {
        System.out.println("Please enter a string that will be reversed.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(reverseString(text));
    }

    //add method definitions below this line

    public static String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
        }
    }

    //add method definitions above this line
}
