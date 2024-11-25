public class LargestNumber{
public static void main(String... args){
	int[] numbers ={5,6,8,12,34,56};
	int largest = largestElement(numbers);
	System.out.print(largest);
}

public static int largestElement(int [] numbers){
	int largest = numbers[0];
	for(int index = 1; index < numbers.length; index++){
		if (numbers[index] > largest) largest = numbers[index];
}
	return largest;
}

}


