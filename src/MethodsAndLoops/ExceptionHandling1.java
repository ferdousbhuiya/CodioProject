package MethodsAndLoops;

public class ExceptionHandling1 {
    /**
     * @param num1
     * @param num2
     */
    public static void divide(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        divide(5, 0);
    }
}

