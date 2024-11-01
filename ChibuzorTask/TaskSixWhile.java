public class TaskSixWhile{
  public static void main(String[] args){
	
	int number = 1;
	int count = 1;
	int counter = 1;
	
	while(number <= 10){
		if (number == 4){
			while (count < 6){ 
				int multipleOne =(int) Math.pow(number, count);
				System.out.print(multipleOne);
				System.out.print(" ");
			count++;
			}
			System.out.print(" ");
		}
	
		if (number == 8){
			while (counter < 6){ 
				int multipleTwo =(int) Math.pow(number, counter);
				System.out.print(multipleTwo);
				System.out.print(" ");
			counter++;
			}
		}
	
	number++;
	}
}
}