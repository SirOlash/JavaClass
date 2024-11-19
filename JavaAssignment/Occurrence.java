public class Occurrence{
public static void main(String[] args){

	int[] values = {2,4,5,4,3,1,7,5,8,8,4,6,2,0};
	int[] frequency = new int[9];

	for(int count = 0; count < values.length; count++){
		++frequency[values[count]];}
	for (int rating = 0; rating < frequency.length; rating++) {
        System.out.println("value " + rating +" contains " + frequency[rating]);} 
	
}
}