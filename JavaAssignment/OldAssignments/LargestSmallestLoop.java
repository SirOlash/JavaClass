import java.util.Scanner;
public class LargestSmallestLoop{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     int largest = Integer.MIN_VALUE;
     int smallest = Integer.MAX_VALUE;
     String answer;

     do {System.out.print("Enter a number: ");
	 int number = input.nextInt();

	if (number > largest) largest = number;
	if (number < smallest) smallest = number;  

	input.nextLine();
	System.out.print("Do you want to add more numbers? yes/no: ");
	answer=input.nextLine();}

       while (answer.equalsIgnoreCase("yes"));


      System.out.printf("The Largest number is: %d%n The Smallest number is: %d", largest,smallest); 	
	
}
}