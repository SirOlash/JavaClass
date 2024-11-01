public class TaskEightWhile{
  public static void main(String[] args){
	
	int number = 1;
	int count = 1;
	int counter = 1;
	int sumOne = 0;
	int sumTwo = 0;
	
	while(number <= 10){
		if (number == 4){
			while (count < 6){ 
				int multipleOne =(int) Math.pow(number, count);
				sumOne += multipleOne;
			count++;
			}
		}
	
		if (number == 8){
			while (counter < 6){ 
				int multipleTwo =(int) Math.pow(number, counter);
				sumTwo += multipleTwo;
			counter++;
			}
		}
	number++;
	}
		int sumTotal = sumOne + sumTwo;
		System.out.print(sumTotal);
}
}