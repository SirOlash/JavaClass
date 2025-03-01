package Arrays;

import java.util.ArrayList;

public class MorningTask {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5};
        ArrayList<Integer> result = missingNumber(numbers);
        System.out.printf(String.valueOf(result));
    }

    public static ArrayList<Integer> missingNumber(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = numbers[0]; i < numbers.length; i++) {
            for(int number : numbers ) {
                if (number != i){
                    result.add(i);
                }
            }
        }
        return result;
    }
}
