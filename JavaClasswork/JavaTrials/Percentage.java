 import java.util.Scanner;
public class Percentage{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print ("Enter the Balance:");
	double balance = input.nextDouble();
	System.out.print("Enter the annual percentage interest rate:");
	double percentage = input.nextDouble();
	double interest = balance * (percentage/1200);

	System.out.printf("The interest is %2f%n ", interest );
}
}