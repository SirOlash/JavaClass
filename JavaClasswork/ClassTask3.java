import java.util.Scanner;
public class ClassTask3{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();

  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();

  System.out.print("Enter Third Number: ");
  int thirdNumber = input.nextInt();

  if (firstNumber > secondNumber && firstNumber > thirdNumber);
  System.out.println(firstNumber + " is the Highest"); 
 
  if (firstNumber > secondNumber || firstNumber > thirdNumber);
  System.out.println(firstNumber + " is definitely higher than at least one ");

  if (firstNumber > secondNumber & firstNumber > thirdNumber);
  System.out.println(firstNumber + " is the Highest Bitwise and");

  if (firstNumber > secondNumber | firstNumber > thirdNumber);
  System.out.println(firstNumber + " is the Highest bitwise or");   

 if (firstNumber > secondNumber ^ firstNumber > thirdNumber);
  System.out.println(firstNumber + " Bitwise ^");   




}
}