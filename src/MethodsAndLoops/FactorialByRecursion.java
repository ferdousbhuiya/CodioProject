package MethodsAndLoops;

import java.util.Scanner;

/**
 *
 */
public class FactorialByRecursion {
    public static void main(String[] args) {
        System.out.println("Enter a number for find the Factorial");
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Factorial of "+x+ " is :"+ factorial(x));
    }

    /**
     * @param  n
     * @return factorial of n, integer
     */
    public static double factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

