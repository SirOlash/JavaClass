import java.util.ArrayList;
import java.util.Scanner;

public class Diary{
	private final ArrayList<DiaryEntry> entries;
	private Boolean isLocked;
	private String password;
	Scanner input = new Scanner(System.in);
	

	public Diary(){
		entries = new ArrayList<>();
		isLocked = true;
	}

	public void createNewEntry(String id, String content){
		id = id.trim();
		if (!isLocked){
			DiaryEntry entry = new DiaryEntry(id,content);
			entries.add(entry);
			System.out.print("You have added a new entry!!!");
		}
		else{System.out.print("Your diary is Locked, unlock diary to add entry!!!");}
		
	}

	public void unlockDiary() {
		
		System.out.println("Enter your password!!");
		String checkPassword = input.nextLine();
		if (password != null && password.equals(checkPassword)){
        		isLocked = false;
        		System.out.println("dairy has been unlocked");}
		else{System.out.print("Password is either incorrect or You have to Create a new password");}
   	}
    
	public void lockDiary() {
        	isLocked = true;
        	System.out.println("dairy has been locked");
		
    	}
	public void createPassword(){
		if (password == null){
			System.out.println("Create a password");
			String password = input.nextLine();
			//password = password.trim();
			this.password = password.trim();
			//System.out.printf("Password is %s",password);
			System.out.println("Password has been created");
		}
		else{System.out.println("There is already a password created. Change the password");}
	}
	
	public void changePassword() {
		if (password != null){
			System.out.println("Enter Your previous password");
			String oldPassword = input.nextLine();
			if (oldPassword.equalsIgnoreCase(password)){
				System.out.println("Create a password");
                this.password = input.nextLine();
			}
			else{System.out.print("Wrong Password!!!!");}
		}
		else {System.out.print("First Create a password");}
	}
	
	public DiaryEntry findEntryById(String id){
		for (DiaryEntry entry: entries){
			if (entry.getId().equalsIgnoreCase(id)){
				return entry;
			}
		}
		return null;
	}
	
	
	public void updateEntry(String id, String content){
		DiaryEntry entry = findEntryById(id);
		if (entry != null && !isLocked) {
			entry.setContent(content);
			 System.out.println("entry has been updated\nentry: " + content);
		}
		else {System.out.println("entry does not exist or diary is locked");}
	}
	
	public void deleteEntry(String id){
		DiaryEntry entry = findEntryById(id);
		if (entry != null && !isLocked) {
			entries.remove(entry);
			System.out.println("entry has been deleted");
      		} 
		else {System.out.println("entry does not exist or diary is locked");}
		
	}
	public void viewEntry(String id) {
       	 	DiaryEntry entry = findEntryById(id);
        	if (entry != null && !isLocked) {
            		System.out.printf("entry %s: %s", entry.getId(), entry.getContent());
		} 
		else {System.out.println("entry does not exist or diary is locked");}
	}

	
}
	