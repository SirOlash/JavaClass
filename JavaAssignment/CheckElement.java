import java.util.Scanner;
public class CheckElement{
public static void main(String[] args){
	Scanner input = new Scanner(System.in); 

	System.out.print("Enter the number of elements in the array: ");
	int size = input.nextInt();
	int[] numbers = new int[size];
	
	boolean found = false;
	System.out.println("Enter " + size +" integers: ");
	for (int count = 0;count < numbers.length; count++)numbers[count] = input.nextInt();

	System.out.print("Enter the element you want to check for: ");
	int element = input.nextInt();
	for (int counter = 0;counter < numbers.length; counter++)
		if (element == numbers[counter]){
			found = true; 
			break;}

	if (found)System.out.print(true);
	else{System.out.print(false);}	
	
}
}