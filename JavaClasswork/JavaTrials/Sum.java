import java.util.Scanner;
public class Sum{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.print("Enter first number: ");
double first=input.nextDouble();
System.out.print("Enter second number: ");
double second=input.nextDouble();
double sum= first + second;
System.out.printf("The sum is %f", sum);

}
}