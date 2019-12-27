package day5;

import day2.Day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day5 {
    private Integer[] opcodeIntArray = Day2.prepareArray(new File("C:\\Users\\teholm\\Downloads\\Advent-of-code-2019\\src\\main\\resources\\Day5.txt"));
    private Opcode opcode = new Opcode(0);
    private List<Integer> output = new ArrayList<>();

    public Day5() throws IOException {
    }

    public Integer solveDay5() {
        int input = 1;
        int currentPosition = 0;
        while (currentPosition < opcodeIntArray.length) {
            opcode = new Opcode(opcodeIntArray[currentPosition]);
            switch (opcode.getOpcode()) {
                case 1:
                case 2:
                    currentPosition = solveOpcodeForThreeParameters(currentPosition);
                    break;
                case 3:
                case 4:
                    currentPosition = solveOpcodeForOneParameter(currentPosition, input);
                    break;
                default:
                    currentPosition = opcodeIntArray.length + 1;
            }
        }
        int result = output.size() > 0 ? output.get(output.size() - 1) : -1;
        return result;
    }

    private int solveOpcodeForOneParameter(int currentPosition, int input) {
        if (opcode.getOpcode() == 3) {
            opcodeIntArray[opcodeIntArray[currentPosition + 1]] = input;
        } else {
            output.add(opcodeIntArray[opcodeIntArray[currentPosition + 1]]);
        }
        return currentPosition + 2;
    }

    private int solveOpcodeForThreeParameters(int currentPosition) {
        int par1 = opcode.getFirstParameterMode() == 0 ? opcodeIntArray[opcodeIntArray[currentPosition + 1]] : opcodeIntArray[currentPosition + 1];
        int par2 = opcode.getSecondParameterMode() == 0 ? opcodeIntArray[opcodeIntArray[currentPosition + 2]] : opcodeIntArray[currentPosition + 2];
        opcodeIntArray[opcodeIntArray[currentPosition + 3]] = opcode.getOpcode() == 1 ? par1 + par2 : par1 * par2;
        return currentPosition + 4;
    }


}

