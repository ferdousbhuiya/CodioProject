package String;

public class StringExercise1 {
    /*

    Write a program that takes input from a user and prints the
    first character of the input and the last character with
    some context. For example, if baseball is the string,
    then the program will output b is the first character
    and l is the last character. If cat is the string,
    then c is the first character and t is the last character
    will be printed.

     */

    public static void main(String[] args) {
        String myString = "Hello";
        char first = myString.charAt(0);
        char last = myString.charAt(myString.length()-1);

        System.out.println(first + " is the first character and " + last + " is the last character");
    }
}
