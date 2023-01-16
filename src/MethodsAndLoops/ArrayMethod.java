package MethodsAndLoops;

public class ArrayMethod {
    /**
     * This method prints all values of an array
     *
     * @param arr is an array of strings
     */
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        String[] names = {"Alan", "Bob", "Carol"};
        printArray(names);
    }
}
