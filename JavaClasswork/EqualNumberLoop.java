import java.util.Scanner;
public class EqualNumberLoop{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String answer;
    do{ System.out.print("Enter first Number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Enter second Number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third Number: ");
	int thirdNumber = input.nextInt();

	if (firstNumber == secondNumber && firstNumber == thirdNumber){
		System.out.println("The numbers are Equal");}

	else{System.out.println("The Numbers are not Equal");}

	 System.out.print("Do you want to add another number? Yes/No: ");
	 input.nextLine();	
	 answer = input.nextLine();}

    while(answer.equalsIgnoreCase("Yes"));

}
}







