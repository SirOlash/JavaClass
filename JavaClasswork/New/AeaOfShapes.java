import java.util.Scanner;
public class AreaofShapes{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Choose a Shape:\n1. Circle\n2. Rectangle\n3. Triangle\n>>>");
	int answer = input.nextInt();

	switch(answer){
		case 1: System.out.print("Calculate the area of a circle with radius");
			break;
		case 2: System.out.print("Calculate the area of a Rectangle with length and width");
			break;
		case 3: System.out.print("Calculate the area of a Triangle with length and height");}

}
}