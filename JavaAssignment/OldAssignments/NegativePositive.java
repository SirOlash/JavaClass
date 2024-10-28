import java.util.Scanner;
public class NegativePositive{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first Number: ");
int first= input.nextInt();
System.out.print("Enter second Number: ");
int second= input.nextInt();
System.out.print("Enter third Number: ");
int third= input.nextInt();
System.out.print("Enter fourth Number: ");
int fourth= input.nextInt();
System.out.print("Enter fifth Number: ");
int fifth= input.nextInt();

int negative = 0;
int positive = 0;
int zero = 0;

if (first<0){  /** selection statements */
negative++;}
  if(second<0){negative++;} /* traditional comments */
   if(third<0){negative++;} 
   if(fourth<0){negative++;}
   if(fifth<0){negative++;}

 if (first>0){positive++;}// increment operator
 if(second>0){positive++;}
  if(third>0){positive++;}
   if(fourth>0){positive++;}
    if(fifth>0){positive++;}

  if (first==0){zero++;}// increment operator
 if(second==0){zero++;}
  if(third==0){zero++;}
   if(fourth==0){zero++;}
    if(fifth==0){zero++;}

     System.out.printf("The total number of negatives are: %d%n The total number of positives are: %d%n The total number of negatives are: %d", negative,positive,zero);
 



}
}