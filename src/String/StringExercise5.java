package String;

public class StringExercise5 {
    /*

    Write a program that captures input from the user and swaps the
    letters two at a time in the string. The first two characters
    change places, the third and fourth characters change places, etc.
    If the string has an odd number of characters, the last
    character will remain as it is. Assume that the program will
    only take an even number of characters, otherwise, there will
     be an error.

     */
    public static void main(String[] args) {

        //String myString = args[0];
        String myString = "WelcomeToTheUSA";
        char[] ch = myString.toCharArray();

        for (int i = 0; i < ch.length - 1; i += 2) {

            // Swapping the characters
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        System.out.println(ch);
    }
}


/*

Another way to solve the problem:

for (int i = 0; i < myString.length(); i++) {
  if (i % 2 == 0) {
    System.out.print(myString.charAt(i + 1));
  }
  else {
    System.out.print(myString.charAt(i - 1));
  }
}


 */