import java.util.Scanner;
public class TaxBracket{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your Annual Income: ");
	int annualIncome = input.nextInt();
	
	if (annualIncome < 9875) System.out.print("10%");
	else if (annualIncome >=9876 && annualIncome <= 40125) System.out.print("12%");
	else if (annualIncome >= 40126 && annualIncome <= 85535  ) System.out.print("22%");
	else if (annualIncome >= 85526 ) System.out.print("24%");
}
}