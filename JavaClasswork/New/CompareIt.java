import java.util.Scanner;
public class CompareIt{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);


	System.out.print("Enter first Integer:");
	int firstInteger = input.nextInt();
	
	int lastFirstNumber = firstInteger % 10;
	int lastTwoFirstNumber = firstInteger % 100;
	
	System.out.print("Enter second Integer:");
	int secondInteger = input.nextInt();
	
	int lastSecondNumber = secondInteger % 10;
	int lastTwoSecondNumber = secondInteger % 100;

	
	System.out.print("Enter third Integer:");
	int thirdInteger = input.nextInt();
	
	int lastThirdNumber = thirdInteger % 10;
	int lasTwoThirdNumber = thirdInteger % 100;


	if (lastFirstNumber == lastSecondNumber) System.out.print("true") ; 
	else if (lastSecondNumber == lastThirdNumber) System.out.print("true") ; 
	else if (lastFirstNumber == lastThirdNumber) System.out.print("true") ; 
	else {System.out.print("false"); }


}
}