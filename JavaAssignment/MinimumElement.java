import java.util.Scanner;
public class MaximumElement{
   public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of elements you want to store: "); 
	int minimum = 999999;
	int size = input.nextInt(); 
	int[] numbers = new int[size]; 

	System.out.println("Enter " + size + " integers: "); 
	for (int count = 0; count < size; count++) {
		numbers[count] = input.nextInt();
		if (numbers[count] < minimum)minimum = numbers[count];}
	
	System.out.print("The Minimum number is: " + minimum);
}
}