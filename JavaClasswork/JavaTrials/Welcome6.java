 import java.util.Scanner;
public class Welcome6{
public static void main(String[] args){
Scanner input = new Scanner (System.in);
System.out.print("Enter your number in meters:");
double feet = input.nextDouble();
 double meters = 0.305 * feet;
System.out.printf("The answer is %2f%n in meters",meters );
}
}