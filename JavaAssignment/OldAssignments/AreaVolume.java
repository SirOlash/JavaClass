import java.util.Scanner;
public class AreaVolume{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter length of sides: ");
	double length =input.nextDouble();

	System.out.print("Enter height of the triangle: ");
	double height =input.nextDouble(); 
	double area =  (1.73/4)* length * length;
	double volume = area * height;

	System.out.printf("The area is %.3f%nThe volume of the triangular prism is 	%.3f", area,volume);
}
}