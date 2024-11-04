import java.util.Scanner;
public class SalesCommision{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount of sales made last week: ");
	double sales = input.nextDouble();

	double total =((0.09 * sales) + 200);
	System.out.printf("Your total earnings for last week is %.3f", total);

}
}