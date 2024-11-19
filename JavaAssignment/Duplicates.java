public class Duplicates{
public static void main(String[] args){

	int[] values = {1,2,3,2,3,4};
	int[] frequency = new int[6];

	for(int count = 0; count < values.length; count++){
		++frequency[values[count]];}
	for (int rating = 0; rating < frequency.length; rating++) {
		if (frequency[rating] > 1)System.out.println(rating); }
	

}
}