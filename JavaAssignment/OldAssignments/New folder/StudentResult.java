import java.util.Scanner;
public class StudentResult{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

	int passes = 0;
	int failure = 0;
	int studentCounter = 1;
	
	
	while (studentCounter <= 10) {
		System.out.print("Enter result (1 = pass, 2 = fail): ");
		int result = input.nextInt(); 

		if (result == 1 || result == 2){
			if (result == 1) passes += 1;                                                                 
			else{failure += 1;} }              
		else{System.out.println("Enter either 1 or 2!!!");
			studentCounter--;}
	studentCounter++;}
	System.out.printf("Passed: %d%nFailed: %d%n",passes,failure); 

	if (passes > 8)System.out.print("Bonus to Instructor!") ;        

}
}