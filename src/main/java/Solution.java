import day3.Day3;
import utils.InputReader;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        /*Day1 day1 = new Day1();
        System.out.println("Solution of Day 1, part 1 is:" + day1.solveDayOne());
        System.out.println("Solution of Day 1, part 2 is:" + day1.solveDayOnePartTwo());
        Day2 day2 = new Day2();
        System.out.println("Solution of Day 2, part 1 is:" + day2.solveDayTwo(day2.prepareArray(new File("C:\\Users\\teholm\\Downloads\\Advent-of-code-2019\\src\\main\\resources\\Day2.txt"))));
        System.out.println("Solution of Day 2, part 2 is:" + day2.solveDayTwoPartTwo());*/
        Day3 day3 = new Day3();
        System.out.println("Solution of Day 3, part 1 is:" + day3.solveDayThree());
        System.out.println("Solution of Day 3, part 2 is:" + day3.solveDayThreePartTwo());

    }
}
