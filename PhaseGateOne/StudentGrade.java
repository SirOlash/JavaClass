import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentGrade{
 public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
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
	
	double [] sortedAverages = new double[amountOfStudents];
	double [] average_array = new double [amountOfStudents]; 

		

	for(int count = 1; count <= amountOfStudents; count++){
		System.out.print("Student" + count +"\t");
		int total = 0;
		for(int counts = 1; counts <= subjectOffered; counts++){
			System.out.print(studentGrades[count - 1][counts -1 ] + "\t" );
			total += studentGrades[count - 1][counts -1];
			 
		}
		
		
		System.out.print(total + "\t");
		double average = total / subjectOffered;
		
		System.out.printf("%.2f\t", average);
		
		sortedAverages[count-1] = average;
		average_array[count-1] = average;
		
		
	
		System.out.println();
		


	}
	position(amountOfStudents,subjectOffered,studentGrades, sortedAverages,average_array);
	
	
	
	

	
	System.out.println("========================================================");
	System.out.println();
	System.out.println("========================================================");


   


   }



	public static void subjectSummary(int subjectOffered,int amountOfStudents,int[][] studentGrades){
	System.out.println("SUBJECT SUMMARY");
	

	int highestScore = -1;
	int lowestScore = 101;
	for (int i = 0;i < subjectOffered; i++){
		System.out.printf("SUBJECT: %d%n", i+1);
		int high = 0;
		for( high = 0; high < amountOfStudents; high++){
			if (highestScore < studentGrades [high][i]){
				highestScore = studentGrades [high][i];
			}
			if (lowestScore > studentGrades [high][i]){
				lowestScore = studentGrades [high][i];
			}
		}
		int low = 101;
		for( low = 0; low < amountOfStudents; low++){
			if (lowestScore > studentGrades [low][i]){
				lowestScore = studentGrades [low][i];
			}
		}
			
		System.out.printf("Highest scoring student is: Student %d scoring %d%n",high,highestScore);
		System.out.printf("Lowest scoring student is: Student %d scoring %d%n",low,lowestScore);
		//System.out.printf("%d,%d%n",highestScore, low);
		
	}

	/*for (int summary = 1; summary <= subjectOffered; summary++){
		System.out.print("Subject" + summary);
		System.out.print("Highest scoring student is: Student" + summary);		
	
	}*/

	}




	public static void position(int amountOfStudents, int subjectOffered,int[][] studentGrades,double[] sortedAverages,double []average_array){
		int[] ranks = new int[amountOfStudents];
		Arrays.sort(sortedAverages);
	for (int i = 0; i < amountOfStudents; i++){
		for (int j = 0; j < amountOfStudents; j++){
			if (average_array[i] == sortedAverages[j] ){
				ranks[i] = amountOfStudents - j;
				break;
			} 
		}
			
	}
		System.out.println("Student Averages and Positions: ");
		for (int count = 0; count < amountOfStudents;count++ ){
			 System.out.printf("Student %d: Average: %.2f, Position: %d\n", 
                              count + 1, average_array[count], ranks[count]);
		}

	}



} 