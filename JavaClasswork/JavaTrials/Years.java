 import java.util.Scanner;
public class Years{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print ("Enter the minutes:");
	int minutes = input.nextInt();
	
	int years = minutes/525600;
	int day = minutes%525600;
	int days = day/1440;

	System.out.printf("The year is %2s and %s days ", years, days );
}
}