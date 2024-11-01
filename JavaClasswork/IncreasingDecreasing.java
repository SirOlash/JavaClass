import java.util.Scanner;
public class IncreasingDecreasing{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int firstNumber = input.nextInt();
	
    System.out.print("Enter the second number: ");
    int secondNumber = input.nextInt();

    System.out.print("Enter the third number: ");
    int thirdNumber = input.nextInt();   

   if(firstNumber > secondNumber && firstNumber > thirdNumber && secondNumber > thirdNumber){
      System.out.print("The numbers are in decreasing order");}
   
  else if(firstNumber < secondNumber && firstNumber < thirdNumber && secondNumber < thirdNumber){
      System.out.print("The numbers are in increasing order");}
    
 else if(firstNumber > secondNumber && firstNumber > secondNumber){
      System.out.print("The numbers are in decreasing order");}

  else{System.out.print("The numbers are not in an order");}

}  
}