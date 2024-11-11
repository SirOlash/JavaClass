import java.util.Scanner;
public class UserAbility{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = input.nextInt();
	
	if (age >= 16 && age <= 17) System.out.println("This User can drive");
	else if (age >=18 && age <=20) System.out.println("This User can drive and vote");
	else if (age >= 21) System.out.print("This user can drive,vote and drink");
	else {System.out.print("Wait for your Time");}
}
}