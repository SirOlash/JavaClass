import java.util.Scanner;
public class MaximunNumber{
public static void main(String[] args){
 Scanner input = new Scanner (System.in);
 
	int i = 0;
	int largest=0;
	
	while (i < 4){
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	largest = number;
		if (number > largest )largest = number;
	 i++;}
	System.out.printf("The largest number is %d",largest);
	

}
}