package ReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMultiline {
    public static void main(String[] args) {
        String path = "src/studentFolder/text/practice2.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            String text1 = "Hello there\n";
            String text2 = "my friend";
            writer.write(text1);
            writer.write(text2);
            writer.write(text1, 12, 1); // there is an error because
            //The sum of the integers cannot be longer than the length of the string. text1 has a length of 12 and 12 + 1 is 13.
            writer.newLine();
            writer.write(text2, 0, 4);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished writing to a file.");
        }
    }
}
