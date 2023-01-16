package ReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Tokens {
    public static void main(String[] args) {
        String path = "src/studentFolder/text/practice3.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            StringTokenizer tokens = new StringTokenizer(line, " ");
            while (tokens.hasMoreTokens()) {
                System.out.println(tokens.nextToken());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
