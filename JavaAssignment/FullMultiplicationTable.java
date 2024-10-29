public class FullMultiplicationTable{
   public static void main(String [] args){
	for(int multiple = 1; multiple < 10; multiple++){
		for(int times = 1; times < 10; times++){
			int product = multiple * times;
			System.out.printf("%d * %d = %d\t",times,multiple,product);
			}
			System.out.println();
		}
	}
}