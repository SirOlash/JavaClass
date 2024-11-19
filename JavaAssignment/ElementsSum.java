import java.util.Scanner;
public class ElementsSum{
   public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of elements you want to store: "); 
	int sum = 0;
	int size = input.nextInt(); 
	int[] numbers = new int[size]; 
	System.out.println("Enter " + size + " integers: "); 
	for (int count = 0; count < size; count++) {
		numbers[count] = input.nextInt();
		sum += numbers[count];}
	System.out.print("The Sum is: " + sum);
}
}