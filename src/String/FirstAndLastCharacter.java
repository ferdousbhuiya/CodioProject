package String;

public class FirstAndLastCharacter {
    public static void main(String[] args) {

        String myString = "Basketball";
        char first = myString.charAt(0);
        char last = myString.charAt(myString.length()-1);
        //System.out.println(subString.args(0));
        System.out.println(first + " is the first character and " + last + " is the last character");
    }
}
