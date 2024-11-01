import java.util.Scanner;
public class IncreasingDecreasingLoop{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
	
 int quit = -2; 

  do{  System.out.print("Enter the first number: ");
      	int firstNumber = input.nextInt();
	
   	System.out.print("Enter the second number: ");
    	 int secondNumber = input.nextInt();

    	System.out.print("Enter the third number: ");
    	 int thirdNumber = input.nextInt();   

    	if(firstNumber > secondNumber && firstNumber > thirdNumber && secondNumber > thirdNumber){
      	  System.out.print("The numbers are in decreasing order\n");}
   
    	else if(firstNumber < secondNumber && firstNumber < thirdNumber && secondNumber < thirdNumber){
          System.out.print("The numbers are in increasing order\n");}

    	else{System.out.print("The numbers are not in an order");}
	
	System.out.print("Press any number if you want to continue, Press -2 to quit: ");	
	quit = input.nextInt();
}

  while(quit != -2);

}  
}