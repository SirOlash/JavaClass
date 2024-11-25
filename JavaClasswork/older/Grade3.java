import java.util.Scanner;
public class Grade3{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
	
	int grade = 0;
	while (grade != -1){
		System.out.print("Enter your grade Press -1 to close: ");
		grade = input.nextInt();
		if (grade < 50) System.out.println("D");
		else if(grade >= 50 && grade <= 60) System.out.println("C");
		else if (grade > 60 && grade <= 80) System.out.println("B");
		else if (grade > 80 && grade <= 100) System.out.println("A");}	
}
}