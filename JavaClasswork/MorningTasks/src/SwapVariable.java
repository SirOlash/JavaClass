import java.util.Scanner;

public class SwapVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();

        firstNumber = (firstNumber + secondNumber) - firstNumber ;
        secondNumber = (secondNumber + firstNumber) - secondNumber ;

        System.out.println("firstNumber: " + firstNumber + " " +  secondNumber);

    }
}
