import java.util.Scanner;

public class NumberPattern{
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	for(int vertical = 1; vertical < number; vertical++) {
		System.out.println();

		for(int horizontal = 1; horizontal <= vertical ; horizontal++){
			System.out.print(horizontal);
			}
		}
	
	for(int verticalTwo = number; verticalTwo >= 1; verticalTwo--) {
		System.out.println();

		for(int horizontalTwo = 1; horizontalTwo <= verticalTwo; horizontalTwo++){
			System.out.print(horizontalTwo);
			}
		}

}
}
