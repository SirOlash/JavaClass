import java.util.Scanner;
public class ReverseInteger{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	int[] integer = new int[number];
	for (int count = integer.length;count >= 0; count--)			
	System.out.print(count);		
	
}
}