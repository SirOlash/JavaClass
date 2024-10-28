import java.util.Scanner;
 public class DaysInMonth{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter month number: ");
	int monthNumber = input.nextInt();
	
	System.out.print("Enter year: ");
	int year = input.nextInt();
	
	
	if(monthNumber == 1) {
	System.out.printf("January %d has 31 days", year);}

	else if(monthNumber == 2 && year % 4==0) {
	System.out.printf("Feburary %d has 29 days", year);}	

	else if(monthNumber == 2 && year % 4 != 0) {
	System.out.printf("Feburary %d has 28 days", year);}

	else if(monthNumber == 3) {
	System.out.printf("March %d has 31 days", year);}

	else if(monthNumber == 4) {
	System.out.printf("April %d has 30 days", year);}

	else if(monthNumber == 5) {
	System.out.printf("May %d has 31 days", year);}

	else if(monthNumber == 6) {
	System.out.printf("June %d has 30 days", year);}
	else if(monthNumber == 7) {
	System.out.printf("July %d has 31 days", year);}
	else if(monthNumber == 8) {
	System.out.printf("August %d has 31 days", year);}
	else if(monthNumber == 9) {
	System.out.printf("September %d has 30 days", year);}
	else if(monthNumber == 10) {
	System.out.printf("October %d has 31 days", year);}
	else if(monthNumber == 11) {
	System.out.printf("November %d has 30 days", year);}
	else if(monthNumber == 12) {
	System.out.printf("December %d has 31 days", year);}
	

}
}
