package missingNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class MorningTask {

    public static int[] missingNumbers(int[] numbers) {
        Arrays.sort(numbers);
        ArrayList<Integer> missingNumbersList = new ArrayList<>();

        for (int index = 0; index < numbers.length - 1; index++) {
            for (int num = numbers[index] + 1; num < numbers[index + 1]; num++) {
                missingNumbersList.add(num);
            }
        }

        int[] missingNumbers = new int[missingNumbersList.size()];
        for (int element = 0; element < missingNumbersList.size(); element++) {
            missingNumbers[element] = missingNumbersList.get(element);
        }

        return missingNumbers;
    }

    public static String multiplesOfC(int firstNumber, int secondNumber, int thirdNumber) {
        if (secondNumber > firstNumber && firstNumber > 0 ) {
            ArrayList<Integer> multiples = new ArrayList<>();
            for (int index = firstNumber; index <= secondNumber; index++) {
                if (index % thirdNumber == 0) {
                    multiples.add(index);
                }
            }

            int[] multiple = new int[multiples.size()];
            for (int i = 0; i < multiples.size(); i++) {
                multiple[i] = multiples.get(i);
            }
            return Arrays.toString(multiple);
        }
        else return null;
    }
}
