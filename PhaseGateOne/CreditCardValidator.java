import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator{
 public static void main(String...Args){

 Scanner input = new Scanner(System.in);
	boolean numberLength = true;

	String creditCardNumber = "";
	while (numberLength){
		System.out.print("Hello, Kindly Enter card details to verify: ");
		creditCardNumber = input.nextLine();

		if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16){
			numberLength = false;
			break;
		}
		else{System.out.println("Enter a valid Credit Card Number!!!!");
			numberLength = true;}	
	}
	
	System.out.println("******************************************");
	System.out.println("**Credit Card Type: " + typeOfCard(creditCardNumber));
	System.out.println("**Credit Card Number: "+ creditCardNumber);
	System.out.println("**Credit Card Digit Length: " + creditCardNumber.length());
	System.out.println("**Credit Card Validity Ststus: " + doubling(creditCardNumber));
	System.out.println("******************************************");

	


}

public static String typeOfCard(String creditCardNumber){
	if (creditCardNumber.startsWith("4")) return ("Visa Card");
	else if (creditCardNumber.startsWith("5")) return ("MasterCard");
	else if (creditCardNumber.startsWith("37")) return ("American Express Cards");
	else if (creditCardNumber.startsWith("6")) return ("Discover cards");
	else {return ("Invalid card!!!");}


}


public static String doubling(String creditCardNumber){
	int [] cardNumber = new int[creditCardNumber.length()];
	int evenSum = 0;	
	int oddSum = 0;

	for (int index = 0; index < creditCardNumber.length(); index +=2) { 
		int evenDigit = Character.getNumericValue(creditCardNumber.charAt(creditCardNumber.length() - 2 - index)); 
		int doubled = evenDigit * 2;
		int sumOfDouble = 0;

		if (doubled >= 10 ){
		doubled = (doubled % 10) + (doubled / 10);
		}
		
		evenSum += doubled; 


		int oddDigit = Character.getNumericValue(creditCardNumber.charAt(creditCardNumber.length() - 1 - index));
		oddSum += oddDigit;
		 
	} 

	int totalSum = oddSum + evenSum;

	if (totalSum % 10 == 0) return ("Valid");
	else{return ("Invalid");}
		 



	}


}