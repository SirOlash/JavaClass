import java.util.Scanner;
public class Multiple{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.print("Enter first integer: ");
int first = input.nextInt();
System.out.print("Enter second integer: ");
int second = input.nextInt();
int firsttrippled = first * 3;
int seconddoubled = second * 2;
int answer = firsttrippled % seconddoubled;
if(answer==0){
System.out.printf("%d is a multiple of %d", firsttrippled,seconddoubled);}
else{ 
System.out.printf("%d is a NOT multiple of %d", firsttrippled,seconddoubled);
}
}
}