import day1.Day1;
import day2.Day2;

import java.io.IOException;

public class Solution {

    public static void main(String[] args)throws IOException {
        Day1 day1 = new Day1();
        System.out.println("Solution of Day 1, part 1 is:" + day1.solveDayOne());
        System.out.println("Solution of Day 1, part 2 is:" + day1.solveDayOnePartTwo());
        Day2 day2 = new Day2();
        System.out.println("Solution of Day 2, part 1 is:" + day2.solveDayTwo());
    }
}
