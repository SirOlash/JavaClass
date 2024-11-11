import java.util.Scanner;
public class PerfectNumber{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

	System.out.print("Enter a Number: "); 
	int number = input.nextInt();

	int sum = 0;
	
	for(int count = 1; count < number; count++){
		if (number % count== 0){
			sum += count;
		}	
	}
	if (sum == number)System.out.printf("Wow %d is a perfect number!!!",number);
	else{System.out.print(number + " Is not a perfect number");}
}
}
		