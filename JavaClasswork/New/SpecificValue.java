import java.util.Scanner;
public class SpecificValue{
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
	System.out.print("Enter the value you want to check: ");
	int value = input.nextInt();
	
	int [] numbers = {23,43,20,10,30};
	for (int numb = 0; numb < numbers.length; numb++){
		if (value == numbers[numb])System.out.print("The array contains the value " + value);}

}
}