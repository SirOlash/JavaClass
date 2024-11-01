import java.util.Scanner;
public class LibraryLoopCounter{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  int counter = 1;

  while (counter <=3){
	System.out.print("Enter the number of days late: ");
    	int daysLate = input.nextInt();
    
    	if (daysLate <= 5 ) System.out.println("Your fine is 50 paise");

    	if (daysLate > 5 && daysLate <= 10)System.out.println("Your fine is 1 rupee");
    	if (daysLate > 10 && daysLate <=30 )System.out.println("Your fine is 5 rupees");
    	if (daysLate > 30 )System.out.println("Your membership has been cancelled");
	counter++;}

}
}