public class ArrayMaxMin{
public static void main(String [] args){
	
	int [] value = {23,43,54,67,54,99};
	int max = value[0];
	int min = value[0];
	for(int numb = 0; numb < value.length; numb++){
		if (value[numb] > max)max = value[numb];
		if (value[numb] < min)min = value[numb];}  
	System.out.printf("The max is %d\nThe min is %d",max,min);
			 
}
} 