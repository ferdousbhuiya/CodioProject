package String;

public class StringWhileLoop {

    public static void main(String[] args) {


        String myString = "Calvin and Hobbes";
        int i = 0;

        while (i < myString.length()) {
            System.out.print(myString.charAt(i));
            i++;

        }

        String myString1 = "Java";

        for (int ii = 0; ii < myString1.length(); ii++) {
            System.out.print(myString1.charAt(ii));
        }


        String myString2 = "Codio";
        int len =myString2.length();
        int i2 = 0;
        while (i2 < len) {
            System.out.print(myString2.charAt (i2));
            i2++;
        }
    }


}
