import java.util.Scanner;
public class AreaofShapes{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Choose a Shape you want to calculate the area for:\n1. Circle\n2. Rectangle\n3. Triangle\n>>>");
	int answer = input.nextInt();

	switch(answer){
		case 1: System.out.print("Enter the radius: ");
			double radius = input.nextDouble();
			double areaCircle = 3.14 * radius * radius;
			System.out.printf("The area of the circle is %.2f",areaCircle);
			break;
		case 2: System.out.print("Enter the length: ");
			double length = input.nextDouble();
			System.out.print("Enter the Width: ");
			double width = input.nextDouble();
			double areaRectangle = length * width;
			System.out.printf("The area of the Rectangle is %.2f",areaRectangle);
			break;
		case 3: System.out.print("Enter the base of the triangle: ");
			double base = input.nextDouble();
			System.out.print("Enter the Height: ");
			double height = input.nextDouble();
			double areaTriangle = 0.5 * base * height;
			System.out.printf("The area of the Triangle is %.2f",areaTriangle);
			
}

}
}