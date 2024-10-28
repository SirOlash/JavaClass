import java.util.Scanner;
 public class HighestNumber{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();
	int largest = firstNumber;

	
	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

	/* if (firstNumber == secondNumber && firstNumber == thirdNumber) {
	largest=firstNumber;} */
	if (firstNumber > secondNumber && firstNumber > thirdNumber) {	largest=firstNumber;}

	else if (secondNumber > firstNumber && secondNumber > thirdNumber) {	largest=secondNumber;}

	else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {	largest=thirdNumber;}
	

	System.out.printf("The greatest is %d",largest);
	


}
}