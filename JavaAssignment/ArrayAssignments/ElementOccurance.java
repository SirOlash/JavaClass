
public class CheckElement{
public static void main(String... arg){
	int element = 2;
	int [] array = {4,5,6,7,2,7};
	boolean result = elementOccurance(array, element );
	System.out.print(result);

}

public static boolean elementOccurance(int[] array, int element ){ 
	for (int index = 0; index < array.length; index++){
		if (element == array[index]){
			return true;}
}
	return false;

}

} 