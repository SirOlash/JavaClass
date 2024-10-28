import java.util.Scanner;
public class EvenOdd{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int integer = input.nextInt();
	if (integer%2==0) System.out.printf("1");
	
	if (integer % 2 > 0) System.out.printf("0");

}
}