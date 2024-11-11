import java.util.Scanner;
public class SumOfEven{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

	System.out.print("Enter first Number: ");
	int firstNumber = input.nextInt();
	System.out.print("Enter second Number: ");
	int secondNumber = input.nextInt();
	
	int sum = 0;
	
	if (secondNumber > firstNumber){
		for(int count = firstNumber; count <= secondNumber; count++){
			if (count % 2 == 0){
				sum += count;}}

	System.out.print(sum);
	}
	else{System.out.print("Your first number should be lower than second number");}

}
}

	