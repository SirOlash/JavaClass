import java.util.Scanner;
public class RunwayLength{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

	System.out.print("Enter the acceleration of the airplane in meters/seconds squared: ");
	double accelerate = input.nextDouble();

	System.out.print("speed of the airplane in meters/seconds: ");
	double speed = input.nextDouble();

	double speedSquared = speed * speed;
	double acceleration = 2 * accelerate;
	
	double length = speedSquared/acceleration;

	System.out.printf("The minimum runway length for this airplane is: %.3f",length);
	
	
}
}