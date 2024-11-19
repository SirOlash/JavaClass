// import java.util.Arrays;
public class Intersection{
   public static void main(String[] args){

	int[] array1 = {1,2,3,4};
	int[] array2 = {3,4,5,6,3};  

	for(int count = 0;count < array1.length;count++){
		for(int counter = 0; counter < array2.length; counter++){
			if (array1[count] == array2[counter]){
				System.out.print(array1[count]+ " ");
				break;}
		}				
	}
}
}