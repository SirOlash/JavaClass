import java.util.Arrays;
public class ReverseList{
public static void main(String... args){
	int[] numbers ={5,6,8,12,34,56};
	int[] reversedList = reverse(numbers);
	System.out.println(Arrays.toString(reversedList));

}
public static int[] reverse(int[] numbers){
	int [] reversedNumbers = new int[numbers.length];
	for(int index = 0; index < numbers.length; index++){
		reversedNumbers[index] = numbers[numbers.length-1-index];}
		
	return reversedNumbers; 

}
}	