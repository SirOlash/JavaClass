public class NumberPyramid2{
public static void main(String[] args){
	int rowNumber = 7;
	for(int rows = 1; rows <= rowNumber; rows++) {
		for(int space = 6; space >= rows; space--) {
			System.out.print(" ");
			
		}
		for(int number = rows; number >= 1; number--){
			System.out.print(number);
		} 
		for(int numb = 2; numb <= rows; numb++){
			System.out.print(numb);
		} 
		 System.out.println();
	}

	for(int row = 1; row <= rowNumber; row++) {
		for(int space2 = 1 ; space2 <= row; space2++) {
			System.out.print(" ");
			
		}
		for(int number2 = rowNumber - row ; number2 >= 1; number2--){
			System.out.print(number2);
		} 
		for(int numb2 = 2 ; numb2 <= rowNumber-row; numb2++){
			System.out.print(numb2);
		} 
		
		 System.out.println();
	}


}
}