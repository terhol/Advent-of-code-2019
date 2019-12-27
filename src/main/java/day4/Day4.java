package day4;

import java.util.ArrayList;
import java.util.List;

public class Day4 {
    int firstNumber = 128392;
    int lastNumber = 643281;

    public int solveDayFour() {
        List<Integer> listOfPossiblePasswords = makeListOfPossiblePasswords();
        return listOfPossiblePasswords.size();
    }

    public int solveDayFourPartTwo() {
        List<Integer> updatedListOfPossiblePasswords = new ArrayList<>();
        List<Integer> listOfPossiblePasswords = makeListOfPossiblePasswords();
        for (Integer number : listOfPossiblePasswords) {
            if (numberUtils.hasExactlyTwoDigitsSame(number)) {
                updatedListOfPossiblePasswords.add(number);
            }
        }
        return updatedListOfPossiblePasswords.size();

    }

    private List<Integer> makeListOfPossiblePasswords() {
        List<Integer> listOfPossiblePasswords = new ArrayList<>();
        for (int i = firstNumber; i <= lastNumber; i++) {
            if (numberUtils.hasTwoSameDigits(i) && numberUtils.isIncreasing(i)) {
                listOfPossiblePasswords.add(i);
            }
        }

        return listOfPossiblePasswords;
    }
}

