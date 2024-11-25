import java.util.Scanner;
public class WorkEfficiency{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the time taken by the Worker: ");
	int timeTaken = input.nextInt();
	
	if (timeTaken < 3) System.out.print("This Worker is highly efficient");

	if (timeTaken >= 3 && timeTaken <= 4) {
	System.out.print("This Worker should improve speed");}

	if (timeTaken >= 4 && timeTaken <= 5) {
	System.out.print("This Worker should undergo training to improve speed");}

	if (timeTaken > 5) System.out.print("This Worker must leave the company");

}
}