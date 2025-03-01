package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    void setUp() {
        diary = new Diary("Olash Emman","1234");
    }

    @Test
    public void testThatDiaryIsUnlocked() {
        assertFalse(diary.isLocked());
    }
    @Test
    public void testThatYouCanLockDiary() {
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }
    @Test
    public void testThatYouCanUnlockDiary() {
        diary.lockDiary();
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatYouCanCreateEntry(){
        diary.createEntry("title","body");
        assertEquals(1,diary.getSize());
    }
    @Test
    public void testThatYouCanDeleteEntry(){
        diary.createEntry("title","body");
        assertEquals(1,diary.getSize());
        diary.deleteEntry(1);
        assertEquals(0,diary.getSize());
    }
    @Test
    public void testThatYouCanFindEntryBYiD(){
        diary.createEntry("title","body");
        assertEquals("title",diary.getEntryById(1).getTitle());
    }
    @Test
    public void testThatYouCanUpdateEntry(){
        diary.createEntry("title","body");
        assertEquals("title",diary.getEntryById(1).getTitle());
        diary.updateTitle(1,"newTitle");
        assertEquals("newTitle",diary.getEntryById(1).getTitle());
        diary.updateBody(1,"newBody");
        assertEquals("newBody",diary.getEntryById(1).getBody());

    }


}
