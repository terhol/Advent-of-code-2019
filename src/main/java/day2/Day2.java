package day2;

import utils.InputReader;
import utils.TypeConvertor;

import java.io.File;
import java.io.IOException;


public class Day2 {

    public int solveDayTwo() throws IOException {
        String[] arrayOfStrings = InputReader.readOneLine(new File("C:\\Users\\teholm\\Downloads\\Advent-of-code-2019\\src\\main\\resources\\Day2.txt"));
        Integer[] arrayOfNumbers = TypeConvertor.convertArrayStringToInteger(arrayOfStrings);

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
}
