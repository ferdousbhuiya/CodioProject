package Polymorphism;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * Exercise 5
 * The Substitute class reads a text file and
 * replaces every fifth word with the string HELLO.
 */
public class Substitute {
    private String sourceFile;
    private String answerFile;
    private ArrayList<String[]> wordsList;
    private String wordsString;

    public Substitute(String source, String answer) {
        sourceFile = source;
        answerFile = answer;
        wordsList = new ArrayList<String[]>();
        wordsString = null;
    }

    public ArrayList<String[]> getWordsList() {
        return wordsList;
    }

    public String getWordsString() {
        return wordsString;
    }

    public String getAnswerFile() {
        return answerFile;
    }

    /**
     * Reads the text file stored in sourceFile and converts it to an
     * ArrayList of arrays of strings. Each array represents a sentence,
     * and element represents a word of the sentence. This ArrayList of
     * arrays of strings is stored in the attribute wordsList.
     */
    public void stringToList() {
        try {
            ArrayList<String> lines = new ArrayList<String>();
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            String currentLine = reader.readLine();
            while(currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }
            reader.close();
            for (String line : lines) {
                wordsList.add(line.split(" "));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Takes the ArrayList of arrays of strings and coverts it back into
     * a single string with newline characters. This string is stored
     * in the wordsString attribute.
     */
    public void listToString() {
        ArrayList<String> lines = new ArrayList<String>();
        for (String[] line : wordsList) {
            lines.add(String.join(" ", line));
        }
        wordsString = String.join("\n", lines);
    }

    /**
     * Calls stringToList. Then iterates through the ArrayList of arrays of
     * strings. If it is the fifth word, the element is replaces with
     * "HELLO". This method calls listToString and prints the results.
     */
    public void swapWords() {
        stringToList();
        for (String[] line : wordsList) {
            for (int i = 0; i < line.length; i++) {
                if ((i + 1) % 5 == 0) {
                    line[i] = "HELLO";
                }
            }
        }
        listToString();
        System.out.println(wordsString);
    }
}

//add class definitions below this line
class Stars extends Substitute {
    public Stars(String source, String answer) {
        super(source, answer);
    }

    private String createStars(String s) {
        String stars = "";
        for (int i = 0; i < s.length(); i++) {
            stars += "*";
        }
        return stars;
    }

    public void swapWords() {
        stringToList();
        for (String[] line : getWordsList()) {
            for (int i = 0; i < line.length; i++) {
                if ((i + 1) % 3 == 0) {
                    line[i] = createStars(line[i]);
                }
            }
        }
        listToString();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(getAnswerFile()));
            writer.write(getWordsString());
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}



//add class definitions above this line

