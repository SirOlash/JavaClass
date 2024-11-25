import java.util.Scanner;
public class ClassTask2{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();
  
  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();

  System.out.println(firstNumber > secondNumber? "Great":"Not Great");
  System.out.println("You are doing well");

  int sum = firstNumber + secondNumber;
  
	System.out.println(sum > 50? "Even sum is Greater":"Sum is not greater");

}
}