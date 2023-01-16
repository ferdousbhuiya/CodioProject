package String;

public class StringExercise {

    /*
    Write a program that captures input from the user, prints the inputted
    string as many times as its length, and prints as many lines of this as
    the length of the input string.

     */

    public static void main(String[] args) {
        //String myString = args[0];
        String myString = "How" ;
        int len = myString.length();

        for (int i = 1; i < len * len + 1; i++) {
            if (i % len == 0) {
                System.out.println(myString);
            }
            else {
                System.out.print(myString);
            }
        }
    }
}
