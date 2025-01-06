import java.util.ArrayList;

public class Diary{
	private ArrayList<DiaryEntry> entries;
	private Boolean isLocked;

	public Diary(){
		entries = new ArrayList<>();
		isLocked = false;
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
	
	public void createDiary() {
       		System.out.println("new diary created");
    	}

	public void unlockDiary() {
        	isLocked = false;
        	System.out.println("dairy has been unlocked");
   	}
    
	public void lockDiary() {
        	isLocked = true;
        	System.out.println("dairy has been locked");
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
		else {System.out.println("entry is null or diary is locked");}
	}
	
	public void deleteEntry(String id){
		DiaryEntry entry = findEntryById(id);
		if (entry != null && !isLocked) {
			entries.remove(entry);
			System.out.println("entry has been deleted");
      		} 
		else {System.out.println("entry is null or diary is locked");}
		
	}
	public void viewEntry(String id) {
       	 	DiaryEntry entry = findEntryById(id);
        	if (entry != null && !isLocked) {
            		System.out.printf("entry %s: %s", entry.getId(), entry.getContent());
		} 
		else {System.out.println("entry is null or diary is locked");}
	}

	
}
	