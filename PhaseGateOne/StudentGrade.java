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
			
			System.out.print("Enter score for subject " + subjects + " : ");

			int studentScore = input.nextInt();

			if  (studentScore >= 0 &&  studentScore <= 100){
				studentGrades [student - 1][subjects-1] = studentScore;

				System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
				System.out.println("Saved successfully!!!");
				System.out.println();}
			else {System.out.println("Invalid Score!!!");
				subjects--;
			};
	
		}
	}

	displayScore(amountOfStudents, subjectOffered,studentGrades);

	subjectSummary(subjectOffered,amountOfStudents,studentGrades);



 }



	public static void displayScore(int amountOfStudents, int subjectOffered,int[][] studentGrades ){
		System.out.println("========================================================");
	System.out.print("STUDENT		");
		for(int counter = 1; counter <= subjectOffered; counter++){  
			System.out.print("SUB"+ counter + "\t");
		}		
	System.out.print("TOT\t");
	System.out.print("AVE\t");
	System.out.println("POS\t");

	System.out.println("========================================================");
	int total = 0;
	
	for(int count = 1; count <= amountOfStudents; count++){
		System.out.print("Student" + count +"\t");
		for(int counts = 1; counts <= subjectOffered; counts++){
			System.out.print(studentGrades[count - 1][counts -1 ] + "\t" );
			total += studentGrades[count - 1][counts -1];
			 
	}
		
		System.out.print(total + "\t");
		double average = total / subjectOffered;
		System.out.printf("%.2f\t", average);
		//System.out.print("%.2f\t", average);
		
		//int position = average;
		
		
		System.out.println();
	

	}
	
	System.out.println("========================================================");
	System.out.println();
	System.out.println("========================================================");


   


   }

	public static void subjectSummary(int subjectOffered,int amountOfStudents,int[][] studentGrades){
	System.out.println("SUBJECT SUMMARY");
	

	int highestSubject = studentGrades [0][0];
	for (int sub = 0;sub < subjectOffered;sub++){
		for(int stud = 0; stud < amountOfStudents; stud++){
			if (highestSubject < studentGrades [sub][stud]){
				highestSubject = studentGrades [sub][stud];
			}
			//System.out.println(highestSubject);
		}
		
		//System.out.println(sub);
		//System.out.print(stud);

	}

	/*for (int summary = 1; summary <= subjectOffered; summary++){
		System.out.print("Subject" + summary);
		System.out.print("Highest scoring student is: Student" + summary);		
	
	}*/

	}



} 