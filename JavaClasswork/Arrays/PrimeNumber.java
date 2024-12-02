import java.util.Arrays;
public class PrimeNumber{
public static void main(String... args){
	int number = 11;
	System.out.print(primeNumber(number));

}
public static int primeNumber(int number){

	for(int index = 2;index < number; index++){
		if (number % index != 0)
			return number;
	}
		
	}

/*public static int[] primeNumb(int integer){
	int count = 0;
	for(int counter = 1; counter < integer; counter++)
		int [] tryy = new int[4];
		tryy[0] = primeNumber(counter);

}
	return tryy;*/

} 




