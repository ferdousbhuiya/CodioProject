package ReadWrite;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WritingCSV {
    public static void main(String[] args) {

        //add code below this line
        String path = "src/studentFolder/csv/writePractice.csv";
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(path));

            String[] header = {"Greeting", "Language"};
            String[] row1 = {"Hello", "English"};
            String[] row2 = {"Bonjour", "French"};
            String[] row3 = {"Hola", "Spanish"};
            String[] row4 = {"Namaste", "Hindi"};

            writer.writeNext(header);
            writer.writeNext(row1);
            writer.writeNext(row2);
            writer.writeNext(row3);
            writer.writeNext(row4);

            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished writing to a CSV");
        }
        //add code above this line

    }
}
