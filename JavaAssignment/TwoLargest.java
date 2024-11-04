import java.util.Scanner;
public class TwoLargest{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

	int largest = 0;
	int secondLargest = 0;

	for (int i = 1;i <= 10; i++){		
		System.out.print("Enter a number: ");;
		int number = input.nextInt();
		if (number > largest){
			secondLargest = largest;
			largest = number;}
		else if (number > secondLargest) secondLargest = number;

	}
	System.out.printf("The largest number is %d\nThe second largest number is %d",largest,secondLargest);
}
}