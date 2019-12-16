package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tereza Holm
 */
public class ReadLinesFromTxt {
    public static List<String> readLines(File file) throws IOException {
        List<String> listOfWords = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            listOfWords.add(line);
        }
        return listOfWords;
    }
}
