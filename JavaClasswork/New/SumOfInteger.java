import java.util.Scanner;
public class SumOfInteger{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

	System.out.print("Enter an Integer: ");
	int integer = input.nextInt();
	int sum = 0;
	while (integer > 0){
		int lastNumber = integer % 10;
		sum += lastNumber; 
		integer /= 10;}
	System.out.print(sum);

}
}