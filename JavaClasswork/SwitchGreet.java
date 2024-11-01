import java.util.Scanner;
public class SwitchGreet{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Can i greet you? Please press:\n1. To get a greeting\n2. To shut me up\n-");
	int answer = input.nextInt();
	
	switch(answer){
		case 1: System.out.println("Hello There!!!");
			break;
		case 2: System.out.print("Okay then bye");}



}
}