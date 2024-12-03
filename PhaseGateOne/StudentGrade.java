import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrade{
 public static void main(String... args){
	Scanner input = new Scanner(System.in);

	  //ArrayList <Integer> subject = new ArrayList<Integer>();
	
	System.out.print("How many students do you have?: ");
	int amountOfStudents = input.nextInt();
	
	System.out.print("How many subjects do they offer?: ");
	int subjectOffered = input.nextInt();

	int[][] studentGrades = new int[amountOfStudents][subjectOffered]; 

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully!!!");
	System.out.println();

	for(int student = 1; student <= amountOfStudents; student++){
		for(int subjects = 1;subjects <= subjectOffered;subjects++ ){
			System.out.println("Entering score for student " + student);
			System.out.print("Enter score for subject " + subjects+ " : ");
			//int studentScore = input.nextInt();
			studentGrades [student - 1][subjects-1] = input.nextInt();

			System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved successfully!!!");
			System.out.println();
	
		}
	}

	displayScore(amountOfStudents, subjectOffered,studentGrades);



 }

	public static void displayScore(int amountOfStudents, int subjectOffered,int[][] studentGrades ){
		System.out.println("========================================================");
	System.out.print("STUDENT\t\t");
		for(int counter = 1; counter <= subjectOffered; counter++){  
			System.out.print("SUB"+ counter + "\t");
		}		
	System.out.println("TOTAL");

	System.out.println("========================================================");
	int total = 0;
	for(int count = 1; count <= amountOfStudents; count++){
		System.out.print("Student" + count +"\t");
		for(int counts = 1; counts <= subjectOffered; counts++){
			System.out.print(studentGrades[count - 1][counts -1 ] + "\t" );
			total += studentGrades[count - 1][counts -1 ];
	}
		System.out.print(total);
		System.out.println("");
	

	}


   


   }




} 