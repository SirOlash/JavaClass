package diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diarylist = new ArrayList<>();

    public void createDiary(String userName, String password) {
        if (userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        diarylist.add(new Diary(userName, password));
    }
    public int getSize(){
        return diarylist.size();
    }

    public Diary getDiaryByUserName(String userName) {
        for (Diary diary : diarylist) {
            if (diary.getUserName().equals(userName)) {
                return diary;
            }
        }
        return null;
    }

    public void deleteDiaryByUserName(String userName,String password) {
        Diary diary = getDiaryByUserName(userName);
        if (diary != null && diary.isCorrectPassword(password)) {
            diarylist.remove(diary);
            System.out.println("Diary deleted successfully");
        }
        else {System.out.println("Invalid username or password");}
    }


}
