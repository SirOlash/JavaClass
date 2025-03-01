package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiariesTest {
    Diaries diaries;
    @BeforeEach
    void setUp() {
        diaries = new Diaries();
    }
    @Test
    public void testThatYouCanCreateDiary() {
        diaries.createDiary("Olash","correctPassword");
        assertEquals(1,diaries.getSize());
    }
}
