package String;

public class StringExercise3 {
    /*
    Write a program that accepts input from the user and creates another
    string that contains either a u, l, or - for each character of the
    original string. Use u when the character is uppercase, and use l when the
    character is lowercase. If the character is neither uppercase nor lowercase,
    use -. Print the original string first, then print the modified string.
     */

    public static void main(String[] args) {


                //String original = args[0];
                String original = "Hello!";
                String modified = "";
                char ch;
        for (int i = 0; i < original.length(); i++) {
            ch = original.charAt(i);
            if (Character.isUpperCase(ch)) {
                modified += "u";
            }
            else if (Character.isLowerCase(ch)) {
                modified += "l";
            }
            else {
                modified += "-";
            }
        }

        System.out.println(original);
        System.out.println(modified);


                //add code above this line
            }
        }


