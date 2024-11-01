import java.util.Scanner;
public class ClassTask{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();
  
  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();

  if(firstNumber > secondNumber) System.out.println("Greater");
  System.out.println("You are doing well");

  int sum = firstNumber + secondNumber;
  
   if(sum > 50){
	System.out.print("Even sum is Greater");}

}
}
  

   
  