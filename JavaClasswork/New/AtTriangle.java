import java.util.Scanner;
public class AtTriangle{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int rowNumber = input.nextInt();
	
	for(int rows = 1; rows <= rowNumber; rows++){
		for(int space = 1; space <= rowNumber - rows; space++){
			System.out.print(" ");
		}
		for(int at = 1; at <=rows; at++){
			System.out.print("@");
		} 
			System.out.println();
	}

}
}