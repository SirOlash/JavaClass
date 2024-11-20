import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");
	int number = s.nextInt();
	int answer = number / 100000;
	int reminder = number % 10;
	
		if (reminder != answer) {			
			System.out.println("Not a Palindrome");			

}else 
		System.out.print("Palindrome");


}
}
