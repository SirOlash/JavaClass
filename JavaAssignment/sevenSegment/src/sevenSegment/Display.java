package sevenSegment;

import java.util.Scanner;

public class Display {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String choice;
        do {
            String userInput = validInput();
            String onOff = String.valueOf(userInput.charAt(7));
            if (onOff.equals("0")){
                System.out.println("Display is off");
                System.out.println("Do you want to continue? -1 to exit");
                choice = scanner.nextLine();
            }
            else {
                String top = userInput.charAt(0) == '1' ? " #### " : "      ";
                String middle = userInput.charAt(6) == '1' ? " #### " : "      ";
                String bottom = userInput.charAt(3) == '1' ? " #### " : "      ";
                String leftUpper = userInput.charAt(5) == '1' ? "#" : "  ";
                String rightUpper = userInput.charAt(1) == '1' ? "#" : "  ";
                String upperRow = leftUpper + "    " + rightUpper;
                String leftLower = userInput.charAt(4) == '1' ? "#" : "  ";
                String rightLower = userInput.charAt(2) == '1' ? "#" : "  ";
                String lowerRow = leftLower + "    " + rightLower;

                System.out.println(top);
                System.out.println(upperRow);
                System.out.println(upperRow);
                System.out.println(upperRow);
                System.out.println(middle);
                System.out.println(lowerRow);
                System.out.println(lowerRow);
                System.out.println(lowerRow);
                System.out.println(bottom);
                System.out.println("Do you want to continue? -1 to exit");
                choice = scanner.nextLine();
            }

        }
        while (!choice.equals("-1"));
    }

    public static String validInput() {
        while (true){
            System.out.println("Please enter an eight digit binary number: ");
            String binaryInput = scanner.nextLine().trim();
            if (binaryInput.matches("[01]{8}")){
                return binaryInput;
            }
            else System.out.println("Please enter a valid binary number: ");

        }


    }
}
