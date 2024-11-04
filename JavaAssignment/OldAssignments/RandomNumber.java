import java.util.Scanner;
public class RandomNumber{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
	
   int randomNumber = (int) (Math.random() * 10);
   int guess;
	
   do{
	System.out.print("Guess the number: ");
	guess = input.nextInt();
	
	if (guess < randomNumber) System.out.println("Too low, try again");
	if (guess > randomNumber) System.out.println("Too high, try again");
	if (guess == randomNumber) System.out.println("Congratulations!!! you are correct");}

    while (guess != randomNumber);

}
}