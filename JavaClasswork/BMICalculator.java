import java.util.Scanner;
  public class BMICalculator{
  public static void main(String[] args){
  Scanner input= new Scanner(System.in);

	System.out.print("Enter your weight in pounds: ");
	double weightPounds =input.nextDouble();

	System.out.print("Enter your height in inches: ");
	double heightInches = input.nextDouble();

	double weightKilogram = weightPounds * 0.45359237;
	double heightMeters = heightInches * 0.0254;
	double heightMetersSquared = heightMeters * heightMeters;
	
	double bmi= weightKilogram/heightMetersSquared;

	System.out.printf("Your BMI is:%.3f",bmi);
}
}