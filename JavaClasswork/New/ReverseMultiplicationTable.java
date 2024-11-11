public class ReverseMultiplicationTable{
   public static void main(String [] args){
	for(int number = 12; number >= 1; number--){
		for(int times = 12; times >= 1; times--){
			int product = number * times;
			System.out.printf("%d * %d = %d\t",times,number,product);
			}
			System.out.println();
		}
	}
}