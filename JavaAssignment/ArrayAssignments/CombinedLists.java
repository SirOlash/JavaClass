import java.util.Arrays;
public class CombinedLists{
public static void main(String... arg){

	String [] listOne = {"a","b","c"};
	String [] listTwo = {"1","2","3","4"};

	String [] merged = combine(listOne,listTwo);
	System.out.print(Arrays.toString(merged));

}
public static String[] combine(String[] listOne, String [] listTwo){

	int maxLength = Math.max(listOne.length,listTwo.length);
	String [] mergedList = new String [listOne.length + listTwo.length];
	
	int count = 0;
	for(int index = 0; index < maxLength; index ++){
		if (index < listOne.length)
			mergedList[count++] = listOne[index]; 	
		
		if (index < listTwo.length)
			mergedList[count++] = listTwo[index]; 

	}
	return mergedList;
}

}