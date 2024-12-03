import java.util.Scanner;

public class StudentGrade{
 public static void main(String... args){
	Scanner input = new Scanner(System.in);

	
	
	System.out.print("How many students do you have?: ");
	int amountOfStudents = input.nextInt();
	
	System.out.print("How many subjects do they offer?: ");
	int subjectOffered = input.nextInt();

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully!!!");
	System.out.println();

	for(int student = 1; student <= amountOfStudents; student++){
		for(int subject = 1;subject <= subjectOffered;subject++ ){
			System.out.println("Entering score for student " + student);
			System.out.print("Enter score for subject " + subject+ " : ");
			int studentScore = input.nextInt();
			System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved successfully!!!");
	
		}


	}
	



 }

} 