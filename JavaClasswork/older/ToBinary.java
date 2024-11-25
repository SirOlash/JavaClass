import java.util.Scanner;
  public class ToBinary{
  public static void main(String[] args){
  Scanner input= new Scanner(System.in);

  System.out.print("Enter an integer");
  int integer = input.nextInt();
  
     do{int last = integer % 2;
	System.out.print(last);
	int firstDivision = integer/2; } 

     while(integer/2 < 2);	
}
}
	 