import java.util.Arrays;
public class MergedArray{
public static void main(String[] args){

	int[] array1 = {1,3,5};
	int[] array2 = {2,4,6};
	int[] mergedArray = new int[array1.length + array2.length];

	for(int count = 0;count < array1.length; count++)
		mergedArray[count] = array1[count];
	for(int count = 0;count < array2.length; count++)
		mergedArray[array1.length + count] = array2[count];
	
	Arrays.sort(mergedArray);
	System.out.print(Arrays.toString(mergedArray));
}
}
		
