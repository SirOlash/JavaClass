import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

public class SemicolonCheckoutApp{
  public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   Date current = new Date();
 
	
  ArrayList <String> productName =new ArrayList<String>();
  ArrayList <Integer> quantity = new ArrayList<Integer>();
  ArrayList <Double> amount = new ArrayList<Double>();

  System.out.print("Enter the customer's name: ");
	String customerName = input.nextLine();

  System.out.println("You will get a 5% discount for purchases above #10000");

  display(customerName,input,productName,quantity,amount);
  
  	
 
  System.out.print("Enter the cashier name: ");
	String cashierName = input.nextLine();
 
 try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
  
  inVoice(customerName,cashierName,input,productName,quantity,amount,current);

  System.out.println();
  System.out.print("How much did the customer pay?:");
  double customerPayment = input.nextDouble(); 


        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


receipt(customerName,cashierName,input,productName,quantity,amount,current,customerPayment);

} 



public static void display(String customerName, Scanner input, ArrayList <String> productName,ArrayList <Integer> quantity, ArrayList <Double> amount){

  boolean userInput = true;
  while (userInput){

	System.out.print("Enter the product bought: ");
	String productBought = input.nextLine();
	productName.add(productBought);

	System.out.print("Enter the number of pieces: ");
	int numberOfPieces = input.nextInt();
	quantity.add(numberOfPieces);	

	System.out.print("Enter the amount per unit: ");
	double amountPerUnit = input.nextDouble();
	amount.add(amountPerUnit);		
	
	input.nextLine();
	
	boolean validInput = false;

	while(!validInput){ 
		System.out.print("Do you want to add more items? yes/no: ");
		String answer = input.nextLine();
	
		if (answer.equalsIgnoreCase("yes")){ 
			userInput = true;
			validInput = true;
		}
		else if (answer.equalsIgnoreCase("no")){
			userInput = false;
			validInput = true;
		}
		else {System.out.println("Invalid input "); }  }
    } 



  }

public static void inVoice(String customerName,String cashierName, Scanner input, ArrayList <String> productName,ArrayList <Integer> quantity, ArrayList <Double> amount,Date current){

System.out.print("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343\n" + current + "\n");

System.out.printf("Cashier: %s%n",cashierName);
System.out.printf("Customer Name: %s%n",customerName);


System.out.println("========================================================");
System.out.println("	ITEM	QTY	PRICE		TOTAL(NGN)");
System.out.println("---------------------------------------------------------");

for(int index = 0; index < quantity.size(); index++){
	double lineTotal = quantity.get(index) * amount.get(index); 

	System.out.printf("	%s	%d	%.2f		%.2f%n",productName.get(index),quantity.get(index),amount.get(index),lineTotal);

	}
double discount = 0.05 * total(quantity,amount);
final double vat = 0.075 * total(quantity,amount);
double billTotal = total(quantity,amount) + vat - discount;

if (total(quantity,amount) > 10000.0){
	System.out.printf("			Sub Total:	%.2f%n",total(quantity,amount));
System.out.printf("			Discount:	%.2f%n",discount);
System.out.printf("			VAT @ 7.50:	%.2f%n",vat);
}

else{System.out.printf("			Sub Total:	%.2f%n			VAT @ 7.50:	%.2f%n" ,total(quantity,amount),vat);
}

System.out.println("========================================================");

System.out.printf("			Bill Total:	%.2f%n",billTotal);

System.out.println("========================================================");
System.out.printf("THIS IS NOT A RECEIPT KINDLY PAY #%.2f%n",billTotal);

System.out.println("========================================================");


  }

public static double total(ArrayList <Integer> quantity,ArrayList <Double> amount){
	double total = 0;
	for(int index = 0; index < quantity.size(); index++)
		total += quantity.get(index) * amount.get(index);
	return total;
   }


//Receipt Funtion

public static void receipt(String customerName,String cashierName, Scanner input, ArrayList <String> productName,ArrayList <Integer> quantity, ArrayList <Double> amount,Date current,Double customerPayment){


System.out.print("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343\n" + current + "\n"

);
System.out.printf("Cashier: %s%n",cashierName);
System.out.printf("Customer Name: %s%n",customerName);


System.out.println("========================================================");
System.out.println("	ITEM	QTY	PRICE		TOTAL(NGN)");
System.out.println("--------------------------------------------------------");

for(int index = 0; index < quantity.size(); index++){
	double lineTotal = quantity.get(index) * amount.get(index); 

	System.out.printf("	%s	%d	%.2f		%.2f%n",productName.get(index),quantity.get(index),amount.get(index),lineTotal);

	}
double discount = 0.05 * total(quantity,amount);
final double vat = 0.075 * total(quantity,amount);
double billTotal = total(quantity,amount) + vat - discount;
double balance = customerPayment - billTotal;

if (total(quantity,amount) > 10000.0){
	System.out.printf("			Sub Total:	%.2f%n",total(quantity,amount));
System.out.printf("			Discount:	%.2f%n",discount);

System.out.printf("			VAT @ 7.50:	%.2f%n",vat);
}

else{System.out.printf("			Sub Total:	%.2f%n			VAT @ 7.50:	%.2f%n" ,total(quantity,amount),vat);
}

System.out.println("========================================================");

System.out.printf("			Bill Total:	%.2f%n",billTotal);

System.out.printf("			Amount Paid:	%.2f%n",customerPayment);

System.out.printf("			Balance:	%.2f%n",balance); 

System.out.println("========================================================");

System.out.println("		THANK YOU FOR YOUR PATRONAGE!!");

System.out.println("========================================================");



  }


}