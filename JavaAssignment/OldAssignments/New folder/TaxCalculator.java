import java.util.Scanner;
public class TaxCalculator{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

	
   for(int counter = 1; counter < 4; counter++){
	System.out.print("Enter your name: ");
    	String citizen  = input.nextLine();

   	System.out.print("Enter your earnings in USD: ");
   	double earnings  = input.nextDouble();

   	if (earnings > 30000){ 
		double tax = 0.2 * earnings;
		System.out.printf("Hello %s, Your tax is $%.3f%n",citizen,tax);}

	else {double tax = 0.15 * earnings;
		System.out.printf("Hello %s, Your tax is $%.3f%n",citizen,tax);}	
}
	 
}
}