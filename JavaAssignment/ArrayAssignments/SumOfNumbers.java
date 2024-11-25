public class SumOfNumbers{
public static void main(String... arg){
	int [] numbers = {1,2,3,4};
	int total =  numbersSumDoWhile(numbers);
	System.out.print(total);
}

public static int numbersSumFor(int[] numbers){
	int sum = 0;
	for(int index = 0; index < numbers.length; index++){
		sum += numbers[index];
} 

	return sum;
}

public static int numbersSumWhile(int[] numbers){
	int sum = 0;
	int index = 0;
	while (index < numbers.length){
		sum += numbers[index];
	index++;
	}
	return sum;
}

public static int numbersSumDoWhile(int[] numbers){
	int sum = 0;
	int index = 0;
	do{sum += numbers[index];
		index++;
	}
	while(index < numbers.length);
	return sum;
}

}