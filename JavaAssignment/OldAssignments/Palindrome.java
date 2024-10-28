import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

System.out.print("Enter a three digit integer: ");
	int integer = input.nextInt();
	int lastNumber = integer%10;
	int firstNumber = integer/100;
	int firstTwo = integer/10;
	int middleNumber = firstTwo%10;

if (lastNumber==firstNumber){
System.out.printf("%d is a palindrome", integer);}
else{System.out.printf("%d is not a palindrome", integer);}

}
}