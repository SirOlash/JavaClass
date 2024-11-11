import java.util.Scanner;
public class Rank{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number from 1-7: ");
	int number = input.nextInt();
	
	switch(number){
		case 1: System.out.print("Gold Medal!!!");
			break;
		case 2: System.out.print("Silver Medal!!!");
			break;
		case 3: System.out.print("Bronze Medal!!!");
			break;
		case 4: System.out.print("Participant Ribbon!!!");
			break;}

}
}