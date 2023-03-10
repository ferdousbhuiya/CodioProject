package ReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise3_1 {
        public static void main(String args[]) {

            String path = args[0];
            //add code below this line
            ArrayList<String> text = new ArrayList<String>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                while (reader.ready()) {
                    text.add(reader.readLine());
                }
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                System.out.println("Finished reading a file.\n");
            }
            for (int i = text.size() - 1; i >= 0; i--) {
                System.out.println(text.get(i));
            }
            //add code above this line
        }
    }

