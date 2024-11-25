public class FindDuplicates{
public static void main(String[] args) {
        int[] numbers = {4,3,5,2,5,8,7,4,6,9,7};

        System.out.println("Duplicate values:");
        for (int first = 0; first < numbers.length; first++) {
            for (int second = first + 1; second < numbers.length; second++) {
                if (numbers[first] == numbers[second]) {
                    System.out.println(numbers[first]);
                    break;
             }
          }
      }
}
}
