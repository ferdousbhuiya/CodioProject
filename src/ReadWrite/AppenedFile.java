package ReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppenedFile {
    public static void main(String[] args) {
        //add code below this line
        String path = "src/studentFolder/text/practice3.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            String text = "Nothing left to do";
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished writing to a file.");
        }
        //add code above this line

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String text = "but smile, smile, smile";
            writer.newLine();
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished writing to a file.");
        }
        //add code above this line
    }
}
