import java.util.Scanner;
public class TabularOutput{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
	
	int total = 0;
	System.out.println("N	N^2	N^3	N^4");
	for(int number = 1;number <= 5;number++){
		for(int i = 1; i <= 4; i++){
			total =(int) Math.pow(number,i);
			System.out.print(total);
			System.out.print("	");
}
			System.out.println();
}

}
}
			