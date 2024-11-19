import java.util.Scanner;
public class Comparator{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
					
		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
	
		if (firstNumber == secondNumber) System.out.print("0");
		if (firstNumber > secondNumber) System.out.print(1);
		if (firstNumber < secondNumber) System.out.print(-1);

}
}

