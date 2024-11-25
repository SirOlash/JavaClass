import java.util.Scanner;
public class GuessTheCode{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int randomNumber = 1000 + (int) (Math.random() * 9000);
	

        System.out.println("A secret 4-digit code has been generated. Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You've guessed the code correctly.");
                break;
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
        }
    }
}
