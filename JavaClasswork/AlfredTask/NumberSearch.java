public class NumberSearch {
	public int search(int[] numbers, int numberCheck){
		int count = 0; 
		for(int index=0; index<numbers.length; index++){
            		if (numberCheck == numbers[index]){
				count =index;
				break;
           	 	}
			//else {return (System.out.print("invalid"));}
		
        	}
		return count;	
	}
} 


