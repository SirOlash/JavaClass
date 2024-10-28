import java.util.Scanner;
public class NegativePositiveLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int positive = 0;
int negative = 0;
int zero = 0;
int i= 0;

while(i<5){
System.out.print("Enter an integer: ");
	int number = input.nextInt();
	if(number>0) positive++;
	else if(number<0) negative++;
	else {zero++;}
	i++;
}
System.out.printf("The number of negatives are: %d%nThe number of positives are: %d%nThe number of zeros are: %d", negative,positive,zero); 

}
}