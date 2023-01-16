package ReadWrite;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVFilesExamples {
    public static void main(String[] args) {
        String path = "src/studentFolder/csv/homeRuns.csv";
        try {
            CSVReader reader = new CSVReader(new FileReader(path));
            for (String[] row : reader) {
                for (String item : row) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished reading a CSV");
        }

    }
}