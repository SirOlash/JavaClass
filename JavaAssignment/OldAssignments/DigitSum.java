import java.util.Scanner;   // End of line
public class DigitSum{
public static void main(String[] args){   /*traditional: Used for multiple lines */
Scanner input = new Scanner (System.in);
System.out.print("Enter a number from 0-1000:"); /** javadoc: it is Used to generate API documentation.Tags and Annotations: Supports tags like @param, @return */
int Integer = input.nextInt();
int LastNumber = Integer%10;
int FirstTwo = Integer/10;
if (FirstTwo==0){
System.out.printf("The sum is %d",LastNumber);}
if (FirstTwo !=0){
int MiddleNumber= FirstTwo%10;
int FirstNumber=FirstTwo/10;
if (FirstNumber==0){
int SumOfTwo= MiddleNumber + LastNumber;
System.out.printf("The sum is %d",SumOfTwo);}
if(FirstNumber!=0){
int SumOfThree = FirstNumber+MiddleNumber+LastNumber;
System.out.printf("The sum is %d",SumOfThree);}
}
}
}