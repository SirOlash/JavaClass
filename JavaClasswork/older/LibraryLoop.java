import java.util.Scanner;
public class LibraryLoop{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
	int quit = -2;

  do{ 	System.out.print("Enter the number of days late: ");
    	int daysLate = input.nextInt();
    
    	if (daysLate < 5 ) System.out.println("Your fine is 50 paise");

    	if (daysLate > 5 && daysLate <= 10)System.out.println("Your fine is 1 rupee");
    	if (daysLate > 10 && daysLate <=30 )System.out.println("Your fine is 5 rupees");
    	if (daysLate > 30 )System.out.println("Your membership has been cancelled");
	
	System.out.print("Press any number if you want to continue, Press -2 to quit: ");
	quit = input.nextInt();}

	while(quit!= -2);


}  
}