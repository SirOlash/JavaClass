import java.util.Scanner;
public class MultiplicationTable{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter number to be calculated: ");
   int number = input.nextInt();

   System.out.print("Enter number of terms: ");
   int terms = input.nextInt();
	
   int i = 0;
   while(i <= terms){
	int table = number * i;
	System.out.println(number + " * " + i + " = " + table);	
	i++;}

}
}