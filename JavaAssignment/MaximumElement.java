import java.util.Scanner;
public class MaximumElement{
   public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of elements you want to store: "); 
	int largest = 0;
	int size = input.nextInt(); 
	int[] numbers = new int[size]; 

	System.out.println("Enter " + size + " integers: "); 
	for (int count = 0; count < size; count++) {
		numbers[count] = input.nextInt();
		// System.out.print(numbers[count]);
		if (numbers[count] > largest)largest = numbers[count];}
	
	System.out.print("The largest number is: " + largest);
}
}