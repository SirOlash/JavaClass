import java.util.Scanner;
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class MenstralApp{
 public static void main(String...Args){

  Scanner input = new Scanner(System.in);
	

	System.out.print("Hello, Please Enter your Name: ");
	String userName = input.nextLine();

	System.out.print("Please Enter your Age: ");
	int userAge = input.nextInt();
	
	System.out.println("");
	
	if (userAge >= 11 && userAge <= 50 ){
		System.out.println("***This is just a prediction, it is not entirely accurate. This calendar method and would mostly work for periods that are regular and menstrual cycles that falls within the range of 26 - 30days.***");
	input.nextLine();
	System.out.println("");

	LocalDate date = null;
	
	while(date == null){
	try{
		System.out.println("Enter the date you started your period: (yyyy-MM-dd):"); 
		String dateInput = input.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
		date = LocalDate.parse(dateInput, formatter);	}
	catch (DateTimeParseException e){
                System.out.println("Invalid date format. Please use the format yyyy-MM-dd.");
	}
	}

	System.out.println("How many days was your last menstral cycle: "); 
	int cycleLength = input.nextInt();		

	int[] results = calenderCalculation(cycleLength);

	System.out.println("Hello " + userName);

	System.out.println("");

	System.out.println("Your first safe date should start from " + date + " And end at "+date.plusDays(results[2]) );

	System.out.println("");

	System.out.println("Your Unsafe period starts from " + date.plusDays(results[0]) + "  And ends at " + date.plusDays(results[1]));

	System.out.println("");
	
	System.out.println("Your Ovulation period starts from " + date.plusDays(results[3]) + "  And ends at " + date.plusDays(results[4]));

	System.out.println("");
	
	System.out.println("Your second safe date should start from " + date.plusDays(results[5]) + " And end at " + date.plusDays(results[6]));

	System.out.println("");

	System.out.println("Your next period should start on the  " + date.plusDays(cycleLength));

	
	}
	else {System.out.print("You shouldn't be Mensurating, See a doctor!!!");}
	



}

public static int[] calenderCalculation(int cycleLength){
	
	/*int startUnsafe = shortCycleLength - 19;
	int stopUnsafe = shortCycleLength - 12;

	int stopSafe =  startUnsafe - 1;
	
	int startOvulation = startUnsafe + 5;
	int stopOvulation = startOvulation + 1;
	
	int secondStartSave = stopUnsafe + 1; */

	int[] results = new int[7];

        results[0] = cycleLength - 19; // startUnsafe
        results[1] = results[0] + 11; // stopUnsafe

        results[2] =  results[0] - 1;        // stopSafe

        results[3] = results[0] + 5;        // startOvulation
        results[4] =  results[3] + 1;        // stopOvulation

        results[5] =  results[1] + 1;        // secondStartSafe
	results[6] = cycleLength + results[2]; // stopSecondSafe

        return results; 


}


}