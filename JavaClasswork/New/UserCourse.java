import java.util.Scanner;
public class UserCourse{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Choose a Course:\n1. Math\n2. Science\n3. History\n>>>");
	int answer = input.nextInt();

	switch(answer){
		case 1: System.out.print("Select your Grade level:\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior\n>>>");
		int answer2 = input.nextInt();
		
		switch(answer2){
			case 1: System.out.print("The instructor for Freshman Math is.....");
				break;
			case 2: System.out.print("The instructor for Sophomore Math is....");
				break;
			case 3: System.out.print("The instructor for Junior Math is.... ");	
				break;
			case 4: System.out.print("The instructor for Senior Math is.... ");}	
				break;
		case 2: System.out.print("Select your Grade level:\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior\n>>>");
		int answer3 = input.nextInt();
		
		switch(answer3){
			case 1: System.out.print("The instructor for Freshman  Science is.....");
				break;
			case 2: System.out.print("The instructor for Sophomore Science is....");
				break;
			case 3: System.out.print("The instructor for Junior Science is.... ");	
				break;
			case 4: System.out.print("The instructor for Senior Science is.... ");}	
				break;
		case 3: System.out.print("Select your Grade level:\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior\n>>>");
		int answer4 = input.nextInt();
		
		switch(answer4){
			case 1: System.out.print("The instructor for Freshman History is.....");
				break;
			case 2: System.out.print("The instructor for Sophomore History is....");
				break;
			case 3: System.out.print("The instructor for Junior Hstory is.... ");	
				break;
			case 4: System.out.print("The instructor for Senior History is.... ");}	
				break;
}

}
}