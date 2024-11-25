import java.util.Arrays;
public class EvenElements{
public static void main(String... args){
	int [] array = {2,3,4,5,6,7,8,9};
	int []even = evenPositions(array);
	System.out.print(Arrays.toString(even));
}
public static int[] evenPositions(int[] array){
	int count = 0;
	for(int index = 2;index < array.length; index +=2){
			count++;
	}
	int[] newList = new int[count];
	int newIndex = 0 ;
	for(int index = 2;index < array.length; index +=2){
			newList[newIndex++] = array[index];
	}
	return newList;
}
}