import java.util.Scanner;
public class EqualNumber{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first Number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Enter second Number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third Number: ");
	int thirdNumber = input.nextInt();

	
	if (firstNumber == secondNumber && firstNumber == thirdNumber){
		System.out.print("The numbers are Equal");}

	else{System.out.print("The Numbers are not Equal");}
	


}
}
