package day1;

import utils.InputReader;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Tereza Holm
 */
public class Day1 {

    public int solveDayOne() throws IOException {
        List<String> listOfMass = InputReader.readLines(new File("C:\\Users\\teholm\\Downloads\\Advent-of-code-2019\\src\\main\\resources\\Day1.txt"));
        return countFuelForAllMass(listOfMass);
    }

    public int solveDayOnePartTwo() throws IOException {
        List<String> listOfMass = InputReader.readLines(new File("C:\\Users\\teholm\\Downloads\\Advent-of-code-2019\\src\\main\\resources\\Day1.txt"));
        return countExtraFuelForAllMass(listOfMass);
    }

    private int countFuel(String mass) {
        int givenMass = Integer.valueOf(mass);
        int fuel = (givenMass / 3) - 2;
        return fuel;
    }

    private int countFuelForAllMass(List<String> listOfMass) {
        int finalFuel = 0;
        for (String mass : listOfMass) {
            finalFuel = finalFuel + countFuel(mass);
        }
        return finalFuel;
    }

    private int countExtraFuel(String mass) {
        int fuel = countFuel(mass);
        int totalFuel = countFuel(mass);
        while ((fuel = countFuel(String.valueOf(fuel))) > 0) {
            totalFuel = totalFuel + fuel;
        }
        return totalFuel;
    }

    private int countExtraFuelForAllMass(List<String> listOfMass) {
        int finalFuel = 0;
        for (String mass : listOfMass) {
            finalFuel = finalFuel + countExtraFuel(mass);
        }
        return finalFuel;
    }
}
