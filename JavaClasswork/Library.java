import java.util.Scanner;
public class Library{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of days late: ");
    int daysLate = input.nextInt();
    
    if (daysLate < 5 ) System.out.print("Your fine is 50 paise");

    if (daysLate > 5 && daysLate <= 10)System.out.print("Your fine is 1 rupee");

    if (daysLate > 10 && daysLate <=30 )System.out.print("Your fine is 5 rupees");

    if (daysLate > 30 )System.out.print("Your membership has been cancelled");


}  
}