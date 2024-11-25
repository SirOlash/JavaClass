import java.util.Scanner;
public class DepartmentRole{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Choose a department:\n1. IT\n2. HR\n3. Finance\n>>>");
	int answer = input.nextInt();

	switch(answer){
		case 1: System.out.print("Select your Role:\n1. Manager\n2. Analyst\n3. Intern\n>>>");
		int answer2 = input.nextInt();
		
		switch(answer2){
			case 1: System.out.print("You are the Manager in the IT department");
				break;
			case 2: System.out.print("You are the Analyst in the IT department");
				break;
			case 3: System.out.print("You are an Intern in the IT department");}	
				break;
		case 2: System.out.print("Select your Role:\n1. Manager\n2. Analyst\n3. Intern\n>>>");
		int answer3 = input.nextInt();
		
		switch(answer3){
			case 1: System.out.print("You are the Manager in the HR department");
				break;
			case 2: System.out.print("You are the Analyst in the HR department");
				break;
			case 3: System.out.print("You are an Intern in the HR department");}	
				break;
		case 3:  System.out.print("Select your Role:\n1. Manager\n2. Analyst\n3. Intern\n>>>");
		int answer4 = input.nextInt();
		
		switch(answer4){
			case 1: System.out.print("You are the Manager in the Finance department");
				break;
			case 2: System.out.print("You are the Analyst in the Finance department");
				break;
			case 3: System.out.print("You are an Intern in the Finance department");}	
				break;

}

}
}