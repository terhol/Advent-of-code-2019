package day5;

import lombok.Data;

@Data
public class Opcode {
    private int opcode;
    private int firstParameterMode;
    private int secondParameterMode;
    private int thirdParameterMode;

    public Opcode(int opcode) {
        Integer[] opcodeArray = {0, 0, 0, 0, 0};
        opcodeArray = prepareOpcodeArray(opcode, opcodeArray);
        this.opcode = opcodeArray[4];
        this.firstParameterMode = opcodeArray[2];
        this.secondParameterMode = opcodeArray[1];
        this.thirdParameterMode = opcodeArray[0];
    }

    private Integer[] prepareOpcodeArray(int opcode, Integer[] opcodeArray) {

        int opcodeCounter = 4;
        for (int i = String.valueOf(opcode).length() - 1; i >= 0; i--) {
            char newValue = String.valueOf(opcode).charAt(i);
            String newValueString = String.valueOf(newValue);
            opcodeArray[opcodeCounter] = Integer.valueOf(newValueString);
            opcodeCounter--;
        }
        return opcodeArray;
    }


}
