package ReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {

        public static void main(String args[]) {

            String path = args[0];
            //add code below this line
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                int lineCount = 0;
                int characterCount = 0;
                while (reader.ready()) {
                    String line = reader.readLine();
                    lineCount++;
                    characterCount += line.length();
                }
                System.out.println(String.valueOf(lineCount) + " lines");
                System.out.println(String.valueOf(characterCount) + " characters");
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                System.out.println("Finished reading a file.\n");
            }
            //add code above this line
        }
    }

