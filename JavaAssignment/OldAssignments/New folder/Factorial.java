import java.util.Scanner;
public class FactorialA{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
					
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	int factorial = 1;
	for(int i = number; i >= 1; i--){
		factorial *= i;
}
		System.out.print(factorial);
}
}