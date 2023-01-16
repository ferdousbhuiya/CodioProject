package MethodsAndLoops;

public class FibonanciSequence {
    public static void main(String[] args) {
        int fibonacciLength = 30;
        for (int num = 0; num < fibonacciLength; num++) {
            System.out.println(fibonacci(num));
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return(fibonacci(n-1) + fibonacci(n-2));
        }
    }
}
