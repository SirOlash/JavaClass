public class TaskFiveWhile{
  public static void main(String[] args){
	
	int number = 1;
	int count = 1;
	int counter = 1;
	
	while(number <= 10){
		if (number == 4){
			while (count < 6){ 
				System.out.print(number);
			count++;
			}
			System.out.print(" ");
		}
	
		if (number == 8){
			while (counter < 6){ 
				System.out.print(number);
			counter++;
			}
		}
	
	number++;
	}
}
}

