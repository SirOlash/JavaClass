import java.util.Scanner;
public class FloatingPoint{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
	
  System.out.print("Enter the first floating-point number: ");
  float firstFloat = input.nextFloat();
  
  System.out.print("Enter the second floating-point number: ");
  float secondFloat = input.nextFloat();

	if (firstFloat == secondFloat) System.out.print("They are the same");
	
	else{System.out.print("They are different");}


	



}
}