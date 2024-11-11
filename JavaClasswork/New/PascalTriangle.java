public class PascalTriangle{
	public static void main(String... args) {

		int totalRows = 5;
		for (int rows = 1; rows <= totalRows; rows++) {
			for (int space = 1; space <= totalRows - rows; space++) {
				System.out.print(" ");
			}

			for (int num = rows; num >= 1; num--) {
				System.out.print(num + " ");
			}
		System.out.println();
	}
}
}