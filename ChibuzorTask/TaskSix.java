/*public class TaskSix{
  public static void main(String[] args){
	for(int count = 4; count <=10; count+=4){
			for(int multiple = 1; multiple <= 5; multiple++){
				int answer = (int) Math.pow(count,multiple);
				System.out.print(answer);
				System.out.print(" ");}
		
		System.out.print("  ");	
}
}
} */

public class TaskSix{
  public static void main(String[] args){
	int sum = 0;
	int sumB = 0;
	int mult = 1;
	for(int count = 1; count <=10; count++){
		// if (count % 4 == 0) {
			if (count == 4) {
			for(int multiple = 1; multiple <= 5; multiple++){
				int answer = (int) Math.pow(count,multiple);
				sum += answer;
			}
			System.out.print(sum);


		} else if (count == 8) {
			for(int multiple = 1; multiple <= 5; multiple++){
				mult *= count;
				sumB += mult;
			}
				System.out.print(sumB);

			
		}
		
		System.out.print(" ");	
// }
	}
}
} 