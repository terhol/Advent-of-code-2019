package utils;

public class TypeConvertor {

    public static Integer[] convertArrayStringToInteger(String[] originalArray){
        Integer[] newArray = new Integer[originalArray.length];
        int currentPosition = 0;
        for(String word: originalArray){
            int number = Integer.valueOf(word);
            newArray[currentPosition] = number;
            currentPosition++;
        }
        return newArray;
    }
}
