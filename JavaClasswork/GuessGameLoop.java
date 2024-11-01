import java.util.Scanner;
public class GuessGameLoop{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int guessNumber = 30;
  int number;
  
    do{  System.out.print("Guess the number: ");
	number = input.nextInt();

	if (number == guessNumber)System.out.print("Congratulations!!! Your guess is Correct "); 
	if (number < guessNumber)System.out.print("Opps,Too low try again!!");
	 
	if (number > guessNumber)System.out.print("Opps,Too high try again!!");}

     while(number != guessNumber);

}
}