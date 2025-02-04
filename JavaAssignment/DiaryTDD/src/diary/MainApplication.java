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
                Welcome!!! What would you like to do?
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
    private static void diaryMenu(String userName) {
        System.out.println(" Welcome to your Diary "+ userName +
                "\n1. Create a new Entry\n2. View Entry\n3. Delete Entry" +
                "\n4. Lock Diary\n5. Unlock Diary\n6. Update Existing Entry" +
                "\n7. Change Password\n8. Go To Main Menu");

        int choice = intInput("Enter your choice: ");
        switch (choice) {
            case 1: createEntry(userName);
                break;
            case 2: viewEntry(userName);
                break;
            case 3: deleteEntry(userName);
                break;
            case 4: lockDiary(userName);
                break;
            case 5: unlockDiary(userName);
                break;
            case 6:  updateDiary(userName);
                break;
            case 7: changePassword(userName);
                break;
            case 8: goToMainMenu();
                break;
            default: System.out.println("Invalid choice");
        }
    }
    private static void changePassword(String userName) {
        Diary diary = diaries.getDiaryByUserName(userName);
        String oldPassword = passwordInput("Enter your old password: ");
        if (diary.isCorrectPassword(oldPassword)){
            String newPassword = passwordInput("Enter your new password: ");
            diary.changePassword(oldPassword, newPassword);
            System.out.println("Password changed successfully");
            diaryMenu(userName);
        }
        else {System.out.println("Incorrect password!!!");}
            diaryMenu(userName);


    }
    private static void updateDiary(String userName) {
        Diary diary = diaries.getDiaryByUserName(userName);
        System.out.println("Select the Entry you would like to Edit\n" +
                "1. Title \n2. Content\n3. Go Back To Diary Menu\n>>>");
        int choice = intInput("Enter your choice: ");
        switch (choice) {
            case 1: int id = intInput("Enter Entry ID you want to edit: ");
                if (diary.getEntryById(id) != null) {
                    String newTitle = stringInput("Enter New Title: ",null,"Title cannot be empty");
                    diary.updateTitle(id, newTitle);
                    System.out.println("Title updated to " + newTitle + "Successfully");
                    updateDiary(userName);
                }
                else {System.out.println("Id does not exist");}
                    updateDiary(userName);
                    break;
            case 2: int idTwo = intInput("Enter Entry ID you want to edit: ");
                if (diary.getEntryById(idTwo) != null) {
                    String newContent = stringInput("Enter New Content: ",null,"Content cannot be empty");
                    diary.updateBody(idTwo, newContent);
                    System.out.println("Content updated to " + newContent + "Successfully");
                    updateDiary(userName);
                }
                else {System.out.println("Id does not exist");}
                    updateDiary(userName);
                    break;
            case 3: diaryMenu(userName);
                    break;
            default: System.out.println("Invalid choice");

        }
    }
    private static void lockDiary(String userName) {
        Diary diary = diaries.getDiaryByUserName(userName);
        diary.lockDiary();
        System.out.println("Diary has been locked successfully");
        diaryMenu(userName);
    }
    private static void unlockDiary(String userName) {
        Diary diary = diaries.getDiaryByUserName(userName);
        String password = passwordInput("Enter your password");
        diary.unlockDiary(password);
        System.out.println("Diary has been unlocked successfully");
        diaryMenu(userName);
    }
    private static void deleteEntry(String userName) {
        Diary diary = diaries.getDiaryByUserName(userName);
        if (!diary.isLocked()) {
            int id = intInput("Enter the Entry ID you would like to delete: ");
            if (diary.getEntryById(id) == null) {
                System.out.println("Entry not found");
                diaryMenu(userName);
            }
            else {
                diary.deleteEntry(id);
                System.out.println("Entry deleted successfully");
                diaryMenu(userName);
            }
        }
        else {
            System.out.println("Diary is locked. Please unlock to continue!");
            diaryMenu(userName);
        }
    }
    private static void viewEntry(String userName) {
        Diary diary = diaries.getDiaryByUserName(userName);
        if (!diary.isLocked()){
            int id = intInput("Enter Entry ID: ");
            Entry entry = diary.getEntryById(id);
            if (entry == null) {
                System.out.println("Entry not found");
                diaryMenu(userName);
            }
            System.out.println(entry);
            diaryMenu(userName);
        }
        else {
            System.out.println("Diary is locked. Please unlock to continue!");
            diaryMenu(userName);
        }
    }

    private static void createEntry(String userName) {
        Diary diary = diaries.getDiaryByUserName(userName);
        if (!diary.isLocked()){
            String title = stringInput("Enter the title of your Entry: ",null,"Title cannot be empty");
            String body = stringInput("Enter the body of your Entry: ",null,"Body cannot be empty");
            Entry entry = diary.createEntry(title,body);
            System.out.println("Your entry with ID: " + entry.getId() + " has been saved successfully");
            diaryMenu(userName);
        }
        else {
            System.out.println("Diary is locked. Please unlock to continue!");
            diaryMenu(userName);
        }
    }

    private static void deleteDiary() {
        String userName = nameInput();
        String password = passwordInput("Enter your password");
        diaries.deleteDiaryByUserName(userName,password);
        goToMainMenu();

    }

    private static void enterDiary() {
        String userName = nameInput();
        Diary diary = diaries.getDiaryByUserName(userName);
        if (diary == null) {
            System.out.println("Diary does not exist");
            goToMainMenu();
        }
        diaryMenu(userName);
    }

    private static void createDiary() {
        String userName = nameInput();
        String password = passwordInput("Enter your password");
        diaries.createDiary(userName, password);
        diaryMenu(userName);
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
    private static String passwordInput(String prompt) {
        return stringInput(
                prompt,
                "^[a-zA-Z0-9]{4,}$",
                "PIN should contain a minimum of 4 characters (letters or numbers)!"
        );
    }
    private static String nameInput() {
        return stringInput(
                "Enter your Name: ",
                "^[a-zA-Z]+( [a-zA-Z]+)?$",
                "Name can't be empty or contain numbers!"
        );
    }

}
