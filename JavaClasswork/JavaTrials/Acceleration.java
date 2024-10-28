 import java.util.Scanner;
public class Acceleration{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print ("Enter the starting velocity in 	meters/seconds:");
	double starting = input.nextDouble();

	System.out.print("Enter the ending velocity in 	meters/seconds:");
	double ending = input.nextDouble();

	System.out.print("Enter the time span in seconds:");
	double time = input.nextDouble();

	double accelerate = (ending - starting)/time;

	System.out.printf("The average acceleration is %2f%n ", 	accelerate );
}
}