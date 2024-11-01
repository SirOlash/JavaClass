import java.util.Scanner;
public class GreetLanguage{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Can i greet? Please choose one option:\n1. English\n2. Yoruba\n3. Igbo\n-");
	int answer = input.nextInt();

	switch(answer){
		case 1: System.out.print("Good morning");
			break;
		case 2: System.out.print("Eka a ro");
			break;
		case 3: System.out.print("Otutu oma");}

}
}

		