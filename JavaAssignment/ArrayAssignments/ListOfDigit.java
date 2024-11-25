import java.util.Arrays;
public class ListOfDigit{
public static void main(String... arg){
	int number = 2342;
	int[] digit = digitLists(number);
	System.out.print(Arrays.toString(digit));
}

public static int[] digitLists(int number){
	int count = 0;
	int numb = number;
	while (numb > 0){
		count++;
		numb /= 10;	
	}

	int [] digits = new int[count];

	for(int index = count-1; index >= 0; index-- ){
		digits[index] = number % 10;
		number /= 10;
	}
	return digits;
}
}