import java.util.Scanner;
public class NegativePositiveZero{
public static void main(String[] args){
 Scanner input = new Scanner (System.in);
 int answer; 

 do{System.out.print("Enter a number: ");
    int number = input.nextInt();
    if (number > 0)System.out.println(number + " is a positive number");
    if (number < 0)System.out.println(number + " is a negative number");
    if (number == 0)System.out.println("Number is Zero");

	System.out.print("Enter a number: ");
     number = input.nextInt();
    if (number > 0)System.out.println(number + " is a positive number");
    if (number < 0)System.out.println(number + " is a negative number");
    if (number == 0)System.out.println("Number is Zero");

	System.out.print("Enter a number: ");
     number = input.nextInt();
    if (number > 0)System.out.println(number + " is a positive number");
    if (number < 0)System.out.println(number + " is a negative number");
    if (number == 0)System.out.println("Number is Zero");
    
     System.out.print("Do you want to perform the operation again?: ");
     input.nextLine();
     answer = input.nextInt();}

     while (answer != -1);


}
}