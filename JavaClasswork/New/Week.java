import java.util.Scanner;
public class Week{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Choose a week:\n1. Week 1\n2. Week 2\n3. Week 3\n>>>");
	int answer = input.nextInt();

	switch(answer){
		case 1: System.out.print("Choose 1: \n1. Date\n2. Date\n3. Date\n>>>");
		int answer2 = input.nextInt();
		switch(answer2){
			case 1: System.out.print("2");
				break;
			case 2: System.out.print("4");
				break;
			case 3: System.out.print("6");}
				break;
		case 2: System.out.print("Choose 1: \n1. Date\n2. Date\n3. Date\n>>>");
		int answer3 = input.nextInt();
		switch(answer3){
			case 1: System.out.print("2");
				break;
			case 2: System.out.print("4");
				break;
			case 3: System.out.print("6");}
				break;
		case 3: System.out.print("Choose 1: \n1. Date\n2. Date\n3. Date\n>>>");
		int answer4 = input.nextInt();
		switch(answer4){
			case 1: System.out.print("2");
				break;
			case 2: System.out.print("4");
				break;
			case 3: System.out.print("6");}
				

}
		

}
}