public class IndexElement {
public static void main(String[] args) {

	int[] number = {24, 95, 54, 44, 84, 64, 55, 75, 43};
	System.out.println("Index\tValue");

	for (int counter = 0; counter < number.length; counter++) {
		System.out.println(counter + "\t" + number[counter]);
	}
}
}
