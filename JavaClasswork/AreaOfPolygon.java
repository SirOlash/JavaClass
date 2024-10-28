import java.util.Scanner;
  public class AreaOfPolygon{
  public static void main(String[] args){
	Scanner input= new Scanner(System.in);
  		
  	System.out.print("Enter number of sides on the polygon: ");
  	double numberOfSides = input.nextDouble();

	
	System.out.print("Enter the length of a side: ");
	double length = input.nextDouble();
	
	double lengthSquared = length * length;
	double area = (numberOfSides * lengthSquared) / (4 * 	Math.tan(3.14/numberOfSides));
	
	System.out.printf("The area is %.2f",area);
	
}
}