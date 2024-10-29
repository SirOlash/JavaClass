import java.util.Scanner;

public class QuadraticEquation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();

        double determinant = b * b - 4 * a * c;
        double root1;
	double root2;

        if (determinant > 0) {
         
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (determinant == 0) {
           
            root1 = -b / (2 * a);
            System.out.println("The roots are both " + root1 );
        } else {

            System.out.println("The roots are not real numbers.");
        }
    }
}
