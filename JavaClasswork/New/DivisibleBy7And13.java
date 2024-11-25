import java.util.Scanner;
public class DivisibleBy7And13{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

	System.out.print("Enter first Number: "); 
	int firstNumber = input.nextInt();
	
	int number = 0;
	System.out.print("Enter second Number: "); 
	int secondNumber = input.nextInt();

	for (int range = firstNumber; range <= secondNumber; range++){
		if(range % 7 == 0 && range % 13 == 0){
			System.out.println("The number divisible by both is " + range);
			break;}
			
		else If (range % 7 != 0 && range % 13 != 0) System.out.print("No number is divisible");
		
}

}
}

	