import java.util.Scanner;
public class FutureInvestment{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the investment amount ");
	double investment = input.nextDouble();
	
	System.out.print("Enter annual interest rate: ");
	double interest = input.nextDouble();

	System.out.print("Enter number of years: ");
	double years = input.nextDouble();

	double monthlyInterestRate = (interest/100)/12;

	double power = years * 12;
	
	double future = investment * Math.pow(1 + monthlyInterestRate,power);

	System.out.printf("The future investment is: %.2f", future);

}
}