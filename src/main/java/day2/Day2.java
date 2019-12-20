package day2;

import utils.InputReader;
import utils.TypeConvertor;

import java.io.File;
import java.io.IOException;


public class Day2 {
    public int solveDayTwo(Integer[] arrayOfNumbers) throws IOException {
        int currentPosition = 0;
        while (currentPosition < arrayOfNumbers.length) {
            if (arrayOfNumbers[currentPosition] == 99) {
                break;
            }
            if (arrayOfNumbers[currentPosition] == 1 || arrayOfNumbers[currentPosition] == 2) {
                int firstNumber = arrayOfNumbers[(arrayOfNumbers[currentPosition + 1])];
                int secondNumber = arrayOfNumbers[(arrayOfNumbers[currentPosition + 2])];
                int newPosition = arrayOfNumbers[currentPosition + 3];
                if (arrayOfNumbers[currentPosition] == 1) {
                    arrayOfNumbers[newPosition] = firstNumber + secondNumber;
                } else {
                    arrayOfNumbers[newPosition] = firstNumber * secondNumber;

                }
            }
            currentPosition = currentPosition + 4;
        }
        return arrayOfNumbers[0];
    }

    public int solveDayTwoPartTwo() throws IOException {
        int[] nounAndVerb = prepareNounAndVerb();
        int noun = nounAndVerb[0];
        int verb = nounAndVerb[1];
        return 100 * noun + verb;

    }

    private int[] prepareNounAndVerb() throws IOException {
        Integer[] arrayOfNumbers;
        int targetedResult = 19690720;
        int[] nounAndVerb = new int[2];

        for (int i = 0; i <= 99; i++) {
            for (int j = 0; j <= 99; j++) {
                arrayOfNumbers = prepareArray(new File("C:\\Users\\teholm\\Downloads\\Advent-of-code-2019\\src\\main\\resources\\Day2.txt"));
                arrayOfNumbers[1] = i;
                arrayOfNumbers[2] = j;
                if (solveDayTwo(arrayOfNumbers) == targetedResult) {
                    nounAndVerb[0] = i;
                    nounAndVerb[1] = j;
                    break;
                }
            }
        }
        return nounAndVerb;

    }

    public Integer[] prepareArray(File file) throws IOException {
        String[] arrayOfStrings = InputReader.readOneLine(file);
        return TypeConvertor.convertArrayStringToInteger(arrayOfStrings);
    }
}
