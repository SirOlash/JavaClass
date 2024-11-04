import java.util.Scanner;
public class LargestNumber{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

	int largest = 0;
	for(int counter = 1; counter <= 10; counter++){
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		if (integer > largest)largest = integer;}
	System.out.print("The largest number is " + largest);
}
}
		
		
	
	