import java.util.Scanner;
 public class PositiveNegative{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if(number>0)System.out.printf("%d is positive",number);
	if(number<0)System.out.printf("%d is negative",number);
	if(number==0)System.out.printf("%d is Neutral",number);

}
}