import java.util.Scanner;
public class GasMillage{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  int gallons_used = 1;
  while (gallons_used != -1){
	System.out.print("Enter the amount of gallons used. -1 to end: ");
	gallons_used = input.nextInt();
	
	if(gallons_used != -1){
	System.out.print("Enter the amount of miles driven: ");
	int miles_driven = input.nextInt();

	double miles_gallon = miles_driven / gallons_used;
	System.out.println("The miles/gallon for this tank was " + miles_gallon);}
}


}
}