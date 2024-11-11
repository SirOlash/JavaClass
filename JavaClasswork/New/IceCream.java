import java.util.Scanner;
public class IceCream{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Choose a dessert:\n1. Ice Cream\n2. Sundae\n3. Shake\n>>>");
	int answer = input.nextInt();

	switch(answer){
		case 1: System.out.print("Select your flavor :\n1. Chocolate\n2. vanila\n3. Strawberry\n>>>");
		int answer2 = input.nextInt();
		
		switch(answer2){
			case 1: System.out.print("You have chosen Ice cream with Chocolate flavor!!!");
				break;
			case 2: System.out.print("You have chosen Ice cream with Vanilla flavor!!!");
				break;
			case 3: System.out.print("You have chosen Ice cream with Strawberry flavor!!!");}	
				break;
		case 2: System.out.print("Select your flavor :\n1. Chocolate\n2. vanila\n3. Strawberry\n>>>");
		int answer3 = input.nextInt();
		
		switch(answer3){
			case 1: System.out.print("You have chosen Sundae with Chocolate flavor!!!");
				break;
			case 2: System.out.print("You have chosen Sundae with Vanilla flavor!!!");
				break;
			case 3: System.out.print("You have chosen Sundae with Strawberry flavor!!!");}	
				break;

		case 3: System.out.print("Select your flavor :\n1. Chocolate\n2. vanila\n3. Strawberry\n>>>");
		int answer4 = input.nextInt();
		
		switch(answer4){
			case 1: System.out.print("You have chosen Shake with Chocolate flavor!!!");
				break;
			case 2: System.out.print("You have chosen Shake with Vanilla flavor!!!");
				break;
			case 3: System.out.print("You have chosen Shake with Strawberry flavor!!!");}	
				break;

}

}
}