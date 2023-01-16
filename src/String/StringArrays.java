package String;

public class StringArrays {
    /*
    String Array, if we want to change the value of an index then we can write
    arrayname[i]="value";
     */

    public static void main(String[] args) {
        String[] classes = {"Math", "English", "Science", "Social Studies", "Spanish"};

        classes[4] = "French";

        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }
}
