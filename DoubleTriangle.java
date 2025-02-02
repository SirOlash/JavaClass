public class DoubleTriangle{
public static void main(String... args){
	twoTriangle(8e);
	
}
public static void printStar(){
	System.out.print("*");
}

public static void printLine(){
	System.out.println();
}

public static void printStar(int numberOfTimes){
	for(int count = 1;count <= numberOfTimes; count++){
 		printStar();
	}
}

public static void upperTriangle(int numberOfTime){
	for(int counter = 1;counter <= numberOfTime; counter++){
 		printStar(counter);
		printLine();
	}
}

public static void lowerTriangle(int numberOfTime){
	for(int counter = numberOfTime; counter > 0; counter--){
 		printStar(counter);
		printLine();
	}
}

public static void twoTriangle(int length){
	upperTriangle(length);
	lowerTriangle(length);
}
	

}