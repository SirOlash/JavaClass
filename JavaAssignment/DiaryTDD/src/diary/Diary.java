package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    private final List <Entry> entries;

    private int id = 1;

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLocked = false;
        this.entries = new ArrayList<>();
    }
    public boolean isCorrectPassword(String password) {
        return this.password.equals(password);
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public void unlockDiary(String password) {
        if (password.equals(this.password)) {
            this.isLocked = false;
        }
        else {System.out.println("Incorrect password");}
    }
    public int getSize(){
        return entries.size();
    }
    public String getUserName() {
        return userName;
    }
    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword) && newPassword.matches("^[a-zA-Z0-9]{4,}$")) {
            this.password = newPassword;
        }
        else {
            System.out.println("Incorrect password");
        }
    }

    public Entry createEntry(String title, String body) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (body == null || body.trim().isEmpty()) {
            throw new IllegalArgumentException("Body cannot be null or empty");
        }
        Entry entry = new Entry(id, title, body);
        entries.add(entry);
        id++;
        return entry;
    }


    public void deleteEntry(int id) {
        Entry entry = getEntryById(id);
        entries.remove(entry);
    }

    public Entry getEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }
    public void updateTitle(int id, String title) {
        Entry entry = getEntryById(id);
        entry.setTitle(title);
    }
    public void updateBody(int id, String body) {
        Entry entry = getEntryById(id);
        entry.setBody(body);
    }
}
