//import java.util.ArrayList;
//public class MorningTask {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 5};
//        ArrayList<Integer> result = missingNumber(numbers);
//        System.out.printf(String.valueOf(result));
//    }
//
//    public static ArrayList<Integer> missingNumber(int[] numbers) {
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i = numbers[0]; i < numbers.length; i++) {
//            for(int number : numbers ) {
//                if (i == number){
//                    break;
//                }
//            }
//            result.add(i);
//
//        }
//        return result;
//    }
//}
//
//public int[] findMissingNumbers(int[] numbers) {
//    Arrays.sort(numbers);
//    ArrayList<Integer> missingNumbersList = new ArrayList<>();
//
//    for (int index = 0; index < numbers.length - 1; index++) {
//        for (int num = numbers[index] + 1; num < numbers[index + 1]; num++) {
//            missingNumbersList.add(num);
//        }
//    }
//
//    int[] missingNumbers = new int[missingNumbersList.size()];
//    for (int element = 0; element < missingNumbersList.size(); element++) {
//        missingNumbers[element] = missingNumbersList.get(element);
//    }
//
//    return missingNumbers;
//}
