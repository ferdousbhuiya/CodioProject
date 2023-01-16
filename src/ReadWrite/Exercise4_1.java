package ReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise4_1 {
        public static void main(String args[]) {

            String path = args[0];
            //add code below this line
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String delimiter = "\t";
                int oldestAge = 0;
                String oldestName = "";
                while(reader.ready()) {
                    String line = reader.readLine();
                    String[] tokens = line.split(delimiter);
                    if (Integer.parseInt(tokens[1]) > oldestAge) {
                        oldestAge = Integer.parseInt(tokens[1]);
                        oldestName = tokens[0];
                    }
                }
                System.out.println("The oldest person is " + oldestName + ".");
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                System.out.println("Finished reading a CSV");
            }
            //add code above this line
        }
    }

