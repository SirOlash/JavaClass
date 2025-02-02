package diary;

import java.util.Scanner;

public class MainApplication {
    private static final Scanner scanner = new Scanner(System.in);
    private static Diaries diaries = new Diaries();

    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu() {
        System.out.println("""
                Welcome to Your Diary
                1. Create a new diary
                2. Enter Your Diary
                3. Delete Your Diary
                4. Exit\s
               \s""");
        int choice = intInput("Enter your choice: ");
        switch (choice) {
            case 1: createDiary();
                break;
            case 2: enterDiary();
                break;
            case 3: deleteDiary();
                break;
            case 4: System.out.println("Goodbye!");
                System.exit(0);
                break;
            default: System.out.println("Invalid choice");
        }
    }

    private static void enterDiary() {

    }

    private static void createDiary() {
        String userName = nameInput();
        String password = passwordInput();
        diaries.createDiary(userName, password);
        System.out.println("Your Diary has been Successfully created!");
        goToMainMenu();
    }

    private static String stringInput(String prompt, String regex, String errorMessage) {
        while (true) {
            System.out.print(prompt);
            String userInput = scanner.nextLine().trim();

            if (!userInput.isEmpty() && (regex == null || userInput.matches(regex))) {
                return userInput;
            } else {
                System.out.println(errorMessage);
            }
        }
    }
    private static int intInput(String message) {
        System.out.print(message + " ");
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a Whole Number");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    private static String passwordInput() {
        return stringInput(
                "Enter your Password: ",
                "^[a-zA-Z0-9]{4,}$",
                "PIN should contain a minimum of 4 characters (letters or numbers)!"
        );
    }
    private static String nameInput() {
        return stringInput(
                "Enter your Name: ",
                "^[a-zA-Z]+( [a-zA-Z]+)?$",
                "Name can't contain numbers!"
        );
    }

}
