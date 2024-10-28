import java.util.Scanner;
public class Convert{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter your number in feet: ");
double feet=input.nextDouble();
double meters = 0.305 * feet;
System.out.printf("The value in meters is %f",meters);

}
}