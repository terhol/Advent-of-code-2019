package day4;

public class numberUtils {


    public static boolean hasTwoSameDigits(int number) {
        boolean hasSameDigits = false;
        String currentNumber = String.valueOf(number);
        for (int i = 0; i < currentNumber.length() - 1; i++) {
            if (currentNumber.charAt(i) == currentNumber.charAt(i + 1)) {
                hasSameDigits = true;
            }
        }
        return hasSameDigits;
    }

    public static boolean isIncreasing(int number) {
        boolean isNumberIncreasing = true;
        String currentNumber = String.valueOf(number);
        for (int i = 0; i < currentNumber.length() - 1; i++) {
            if (currentNumber.charAt(i) > currentNumber.charAt(i + 1)) {
                isNumberIncreasing = false;
            }
        }
        return isNumberIncreasing;

    }

    public static boolean hasExactlyTwoDigitsSame(int number) {
        boolean hasExactlyTwoSameDigits = false;
        String currentNumber = String.valueOf(number);
        int counter = 1;
        char countedNumber = 'a';
        for (int i = 0; i < currentNumber.length(); i++) {
            if (currentNumber.charAt(i) == countedNumber) {
                counter++;
            } else {
                if (counter == 2) {
                    hasExactlyTwoSameDigits = true;
                    break;
                } else {
                    counter = 1;
                    countedNumber = currentNumber.charAt(i);
                }
            }
        }
        if (counter == 2) {
            hasExactlyTwoSameDigits = true;
        }
        return hasExactlyTwoSameDigits;
    }

    private static boolean twoSameDigitsPrevious(String number, int position) {
        return number.charAt(position) == number.charAt(position - 1);
    }

    private static boolean twoSameDigitsNext(String number, int position) {
        return number.charAt(position) == number.charAt(position + 1);
    }


    public static void main(String[] args) {
        System.out.println(hasExactlyTwoDigitsSame(112222));
    }
}
