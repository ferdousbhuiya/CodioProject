package MethodsAndLoops;

/**
 * Problem
 * Write a recursive method called recursiveSum that takes an integer
 * as a parameter. Return the sum of all integers between 0
 * and the number passed to recursiveSum.
 */
public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(recursiveSum(5));
    }
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + recursiveSum(n - 1);
        }
    }
}
