import java.util.Scanner;
public class GuessGameRandom{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int guessNumber = (int) (Math.random() * 100);
  int number;
  
    do{  System.out.print("Guess a number from 0-100: ");
	number = input.nextInt();

	if (number == guessNumber)System.out.print("Congratulations!!! Your guess is Correct "); 
	if (number < guessNumber)System.out.print("Opps,Too low try again!!");
	 
	if (number > guessNumber)System.out.print("Opps,Too high try again!!");}

     while(number != guessNumber);

}
}