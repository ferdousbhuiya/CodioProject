package ReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Delimiters {
    public static void main(String[] args) {


        //add code below this line
        String path = "src/studentFolder/csv/dataWithTabs.csv";
        String delimiter = "\t";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (reader.ready()) {
                String line = reader.readLine();
                String[] tokens = line.split(delimiter);
                for (String token : tokens) {
                    System.out.print(String.format("%-10s", token));
                }
                System.out.println();
            }
            reader.close();
        } catch (
                IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished reading a CSV");
        }
        //add code above this line
    }
}
