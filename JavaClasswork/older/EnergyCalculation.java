import java.util.Scanner;
public class EnergyCalculation{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of water in kilogram: ");
double amount = input.nextDouble();

System.out.print("Enter the initial temperature: ");
double initialTemp = input.nextDouble();

System.out.print("Enter the final temperature: ");
double finalTemp = input.nextDouble();

double energy = amount * (finalTemp - initialTemp) * 4184;

System.out.printf("The energy needed is %.2f", energy);


}
}