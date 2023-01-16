package ReadWrite;

import com.opencsv.CSVReader;

import java.io.FileReader;
class Exercise2 {
    public static void main(String args[]) {

        String path = "src/studentFolder/csv/Exercise2.csv";

                try {
                    CSVReader reader = new CSVReader(new FileReader(path));
                    double column0 = 0.0;
                    double column1 = 0.0;
                    double column2 = 0.0;
                    double column3 = 0.0;
                    int rows = 0;

                    for (String[] row : reader) {
                        rows++;
                        for (int i = 0; i < 4; i++) {
                            if (i == 0) {
                                column0 += Float.parseFloat(row[i]);
                            } else if (i == 1) {
                                column1 += Float.parseFloat(row[i]);
                            } else if (i == 2) {
                                column2 += Float.parseFloat(row[i]);
                            } else if (i == 3) {
                                column3 += Float.parseFloat(row[i]);
                            }
                        }
                    }
                    System.out.print(String.valueOf(column0/rows) + " ");
                    System.out.print(String.valueOf(column1/rows) + " ");
                    System.out.print(String.valueOf(column2/rows) + " ");
                    System.out.println(column3/rows);
                    reader.close();
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    System.out.println("Finished reading a CSV");
                }
            }
        }


