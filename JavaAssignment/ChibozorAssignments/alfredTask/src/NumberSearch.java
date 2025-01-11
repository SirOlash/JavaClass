public class NumberSearch {

    public static void main(String[] args) {
        int [] numbers ;
        int searchedNumber;

    }
        public String search ( int[] numbers, int searchedNumber){
            //int count = 0;
            for (int index = 0; index < numbers.length; index++) {
                if (searchedNumber == numbers[index]) {
                    System.out.println("Number found at index is: " + index);
                    return ""+index;
                }
            }
            throw new IllegalArgumentException("Not found");
        }

} 