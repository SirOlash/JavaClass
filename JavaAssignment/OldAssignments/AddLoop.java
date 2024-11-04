import java.util.Scanner;
public class LoopRepeat{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String answer;
	do{ 
	  System.out.print("Enter first number: ");
	  int firstNumber= input.nextInt();

	  System.out.print("Enter second number: ");
	  int secondNumber = input.nextInt();

	  int sum = firstNumber + secondNumber;
	  System.out.println("The sum is: " + sum);

	  System.out.print("Do you want to perform the operation again?:");
	   input.nextLine(); //it would collect the leftover newline character 
	  answer = input.nextLine();
}
	 while (answer.equalsIgnoreCase("yes"));
}
}