import java.util.Scanner;
 public class CollectAndSum{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

    System.out.print("Enter first number");
    double firstNumber = input.nextDouble();

    System.out.print("Enter second number");
    double secondNumber = input.nextDouble();

    System.out.print("Enter third number");
    double thirdNumber = input.nextDouble();

    double sum= firstNumber + secondNumber + thirdNumber;

    System.out.printf("The sum is %.2f",sum); 


}
}