package String;

public class StringExercise4 {
    /*
    Write a program that takes input without white spaces from a user,
     prints the first half of the string on one line, and the second
     half on another. In the case of a string that has an odd number
     of characters, the second line will have the extra character.
     */
    public static void main(String[] args) {

        //String myString = args[0];
        String myString = "Hello!WhereAreYou";
        System.out.println(myString.substring(0,myString.length()/2));
        System.out.println(myString.substring(myString.length()/2,myString.length()));

        /*

        There is another solution for that also:


        int mid = myString.length() / 2;

            for (int i = 0; i < mid; i++) {
            System.out.print(myString.charAt(i));
            }
                System.out.println();

            for (int j = mid; j < myString.length(); j++) {
                    System.out.print(myString.charAt(j));
            }
                    System.out.println();

        */

    }
}
