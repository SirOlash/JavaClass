public class TaskEight{
  public static void main(String[] args){
	int numbOne = 0;
	int numbTwo = 0;
	for(int count = 4; count <=10; count+=4){
		 if(count == 4){
			for(int multiple = 1; multiple <= 5; multiple++){
				int answer = (int) Math.pow(count,multiple);
				numbOne += answer;			
			}
		}

		  if(count == 8){
			for(int multiple = 1; multiple <= 5; multiple++){
				int answer2 = (int) Math.pow(count,multiple);
				numbTwo += answer2;				
			}
				
		}
			
			
	}	
			int sum = numbOne + numbTwo;
			System.out.print(sum);						
}
} 