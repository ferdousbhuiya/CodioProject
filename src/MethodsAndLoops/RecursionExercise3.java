package MethodsAndLoops;

/**
 * Write a recursive method called bunnyEars that takes the number of bunnies (an integer)
 * as a parameter. Return the number of bunny ears (2 per bunny).
 * Use addition instead of multiplication.
 */
public class RecursionExercise3 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(15));
    }
    //add method definitions below this line

    public static int bunnyEars(int n) {
        if (n == 0) {

            return 0;
        } else {
            return 2 + bunnyEars(n - 1);
        }
    }

    //add method definitions above this line
}
