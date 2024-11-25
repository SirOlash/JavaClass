import java.util.Scanner;
public class GuessGame{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int guessNumber = 30;
  
	System.out.print("Guess the number from 0-100: ");
	int number = input.nextInt();

	if (number == guessNumber)System.out.print("Congratulations!!! Your guess is Correct "); 
	if (number < guessNumber)System.out.print("Opps,Too Low ");
	 
	if (number > guessNumber)System.out.print("Opps,Too High");

}
}