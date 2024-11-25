import java.util.Arrays;
public class ConcatenatedLists{
public static void main(String... arg){

	String [] listOne = {"a","b","c"};
	String [] listTwo = {"1","2","3"};

	String [] concate = concatenate(listOne, listTwo);
	System.out.print(Arrays.toString(concate));

}
public static String[] concatenate(String[] listOne, String [] listTwo){
	String [] newList = new String [listOne.length + listTwo.length];

	for (int index = 0; index < newList.length; index++){
		if (index < listOne.length)
			newList[index] = listOne[index]; 

		if (index >= listOne.length)
			newList[index] = listTwo[index-listOne.length];
	}
		return newList;
}

}