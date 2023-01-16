package ReadWrite;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;

public class Exercise5_1 {

        public static void main(String args[]) {

            String path = args[0];
            //add code below this line
            ArrayList<String> cities = new ArrayList<String>();
            try {
                CSVReader reader = new CSVReader(new FileReader(path));
                reader.skip(1);
                for (String[] row : reader) {
                    if (Integer.parseInt(row[2]) < 0) {
                        cities.add(row[0]);
                    }
                }
                System.out.print("The following cities are in the Southern Hemisphere: ");
                for (String city : cities) {
                    int lastCity = cities.size() - 1;
                    if (city.equals(cities.get(lastCity))) {
                        System.out.println(city + ".");
                    } else {
                        System.out.print(city + ", ");
                    }
                }
                reader.close();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Finished reading a CSV");
            }
            //add code above this line
        }
    }

