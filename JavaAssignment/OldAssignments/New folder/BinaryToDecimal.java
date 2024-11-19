import java.util.Scanner;
public class BinaryToDecimal{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
	System.out.print("Enter a binary number: ");
	int binaryNumber = input.nextInt();
	
	int decimalNumber = 0;
	int position =  1;
	
	while(binaryNumber > 0){
		int lastNumber = binaryNumber % 10; 
		decimalNumber += lastNumber * position;
		position *= 2;
		binaryNumber /= 10;}
	
	System.out.print("The decimal number is " + decimalNumber);


}
}

