import java.util.Scanner;
public class MaxNumber{
public static void main(String[] args){
 Scanner input = new Scanner (System.in);
 
  System.out.print("Enter first number: ");
  int firstNumber = input.nextInt();

  System.out.print("Enter second number: ");
  int secondNumber = input.nextInt();

  System.out.print("Enter third number: ");
  int thirdNumber = input.nextInt();

  if (firstNumber > secondNumber && firstNumber > thirdNumber){
	System.out.printf("The Maximum number is %d",firstNumber);}

 else if (secondNumber > firstNumber && secondNumber > thirdNumber){
	System.out.printf("The Maximum number is %d",secondNumber);}

  else if (thirdNumber > secondNumber && thirdNumber > firstNumber){
	System.out.printf("The Maximum number is %d",thirdNumber);}
	

}
}