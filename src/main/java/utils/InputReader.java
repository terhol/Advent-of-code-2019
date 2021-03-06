package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tereza Holm
 */
public class InputReader {
    public static List<String> readLines(File file) throws IOException {
        List<String> listOfWords = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            listOfWords.add(line);
        }
        return listOfWords;
    }

    public static String[] readOneLine(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        String[] arrayOfWords = line.split(",");
        return arrayOfWords;
    }
}
