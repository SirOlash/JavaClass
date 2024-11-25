public class Kata{
public static void main(String... args){
	int number = 5;
	System.out.print(squareOf(number));
}
public static boolean isEven(int integer){
	if (integer % 2 == 0)
		return true;
	return false;
} 

public static boolean isPrimeNumber(int integer){
	if (integer == 2)return true;
	for(int index = 2; index < integer; index++){
		if (integer % index == 0)return false;
	}

	return true;
}

public static int subtract(int numberOne, int numberTwo ){
	int result = numberOne - numberTwo;  
	return Math.abs(result);
}

public static float divide(int numberOne, int numberTwo ){
	if (numberTwo == 0) return 0;
	float result = numberOne / numberTwo;
	return result;

}

public static int factorOf(int number){
	int count = 0;
	for(int index = 1; index <= number; index++){ 
		if(number % index == 0)count++;
	}
	return count;

}

public static boolean isSquare(int number){
	int sqrt =(int) Math.sqrt(number);
	if (sqrt * sqrt == number) return true;
	else return false;

}

public static boolean isPalindrome(int number){
	int reversedNumber = number;
	int reversed = 0;

	while(number > 0){
		int lastNumber = number % 10;
		reversed = reversed * 10 + lastNumber;
		number /= 10;
	}
	if (reversedNumber == reversed)return true;
	else return false;

}

public static long factorialOf(int number){
	long factorial = 1;
	for(int index = number;index >= 1; index--)
		factorial *= index;
	return factorial;

}

public static long squareOf(int number){
	int square = number * number ;
	return square;

}



}