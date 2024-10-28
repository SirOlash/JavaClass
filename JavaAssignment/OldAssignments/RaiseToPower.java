 import java.util.Scanner;
public class RaiseToPower{
  public static void main(String[] args){
   Scanner input= new Scanner(System.in);

	System.out.print("Input first number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Input second number: ");
	int secondNumber = input.nextInt();
	
	int i= 0;
	int raiseToPower = 1;

	while(i<secondNumber){
	raiseToPower = raiseToPower * firstNumber;
	i++;}
	System.out.print(firstNumber + " Raised to the power of " + secondNumber + " is " + raiseToPower);

}
}