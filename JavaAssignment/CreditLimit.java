import java.util.Scanner;
public class CreditLimit{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

	System.out.print("Enter your account Number: ");
	int accountNumber = input.nextInt();

	System.out.print("Enter your balance at the beginning of the month: ");
	double balance = input.nextDouble();

	System.out.print("Enter the total of all items charged by the customer this month: ");
	double itemsCharged = input.nextDouble();
	
	System.out.print("Enter the total of all credits applied to the customer's account this month: ");
	double credit = input.nextDouble();

	double newBalance = balance + itemsCharged - credit;
	
	if (newBalance < 0)System.out.printf("Hello account number (%d), Your new balance is $%.2f Your Credit Limit has Exceeded!!!", accountNumber,newBalance);

	else{System.out.printf("Hello account number (%d), Your new balance is $%.2f.", accountNumber,newBalance);}

}
}
