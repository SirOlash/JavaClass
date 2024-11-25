import java.util.Scanner;
public class GreetLanguage2{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Can i greet? Please choose one option:\n1. English\n2. Yoruba\n3. Igbo\n-");
	int answer = input.nextInt();

	switch(answer){
		case 1: System.out.print("Choose One:\n1. Morning\n2. Afternoon\n3. Evening");
	int answerTwo = input.nextInt();
	switch(answerTwo){case 1:System.out.println("Morning Greeting in English");
				break;
			case 2: System.out.println("Afternoon Greeting in English");
				break;
			case 3: System.out.println("Evening Greeting in English");}
				break;
	case 2: System.out.println("Choose One:\n1. Aaro\n2. Osan\n3. Irole");
	int answerThree = input.nextInt();
	switch(answerThree){case 1:System.out.println("Eka a ro");
				break;
			case 2: System.out.println("Eka san");
				break;
			case 3: System.out.println("Ekurole");}
				break;

	case 3: System.out.println("Choose One:\n1. Morning\n2. Afternoon\n3. Evening");
	int answerfour = input.nextInt();
	switch(answerfour){case 1:System.out.println("Morning Greeting in Igbo");
				break;
			case 2: System.out.println("Afternoon Greeting in Igbo");
				break;
			case 3: System.out.println("Evening Greeting in Igbo");}
				break;
	
}
}
}