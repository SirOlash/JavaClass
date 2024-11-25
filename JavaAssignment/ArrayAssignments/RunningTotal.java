import java.util.Arrays;
public class RunningTotal{
public static void main(String... arg){
	int [] numbers = {1,2,3,4};
	int [] newList = running(numbers);
	System.out.print(Arrays.toString(newList));

}
public static int[] running(int[] numbers){
	int[] runnings = new int [numbers.length];
	
	runnings[0] = numbers[0]; 
	for(int index = 1 ; index < numbers.length; index++){
		runnings [index] += runnings[index -1] + numbers[index];
}  
	return runnings;
}
	
	
}