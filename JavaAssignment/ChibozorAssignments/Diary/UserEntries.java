import java.util.Scanner;
public class UserEntries{
public static void main(String[] args) {
	Diary diary = new Diary(); 
	Scanner scanner = new Scanner(System.in); 
	boolean running = true;
	String id;
	String content;
	while (running) {

		while (true) {
			try {
				System.out.println("\nDiary Menu:");
				System.out.println("1. Create New Entry");
				System.out.println("2. View Entry");
				System.out.println("3. Update Entry");
				System.out.println("4. Delete Entry");
				System.out.println("5. Lock Diary");
				System.out.println("6. Unlock Diary");
				System.out.println("7. Create Password");
				System.out.println("8. Change Password");
				System.out.println("9. Exit");
				System.out.print("Choose an option: ");
		
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
					case 1:
						System.out.print("Enter entry ID: ");
						id = scanner.nextLine();
						System.out.print("Enter entry content: ");

						content = scanner.nextLine();
						diary.createNewEntry(id, content);
						break;

					case 2:
						System.out.print("Enter entry ID to view: ");
						id = scanner.nextLine();
						diary.viewEntry(id);
						break;

					case 3:
						System.out.print("Enter entry ID to update: ");
						id = scanner.nextLine();
						System.out.print("Enter new content: ");
						content = scanner.nextLine();
						diary.updateEntry(id, content);
						break;
					case 4:
						System.out.print("Enter entry ID to delete: ");
						id = scanner.nextLine();
						diary.deleteEntry(id);
						break;
					case 5:
						diary.lockDiary();
						break;
					case 6:
						diary.unlockDiary();
						break;
					case 7:
						diary.createPassword();
						break;
					case 8:
						diary.changePassword();
						break;
					case 9:
						running = false;
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Invalid choice. Please try again.");
					break;
				}
			} catch (Exception e) {System.out.println("Invalid entry");
					scanner.nextLine();
				}
		}
	}
}


}

