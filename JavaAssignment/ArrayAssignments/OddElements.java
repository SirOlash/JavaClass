import java.util.Arrays;
public class OddElements{
public static void main(String... args){
	int [] array = {2,3,4,5,6,7,8,9};
	int []odd = oddPositions(array);
	System.out.print(Arrays.toString(odd));
}
public static int[] oddPositions(int[] array){
	int count = 0;
	for(int index = 1;index < array.length; index +=2){
			count++;
	}
	int[] newList = new int[count];
	int newIndex = 0 ;
	for(int index = 1;index < array.length; index +=2){
			newList[newIndex++] = array[index];
	}
	return newList;
}
}