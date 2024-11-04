import java.util.Scanner;
public class LeapYear{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a year: ");
    int year = input.nextInt();
    
    if (year % 4 == 0) System.out.printf("%d is a leap year",year);
    
    else {System.out.printf("%d is not a leap year",year);}
    

}
}