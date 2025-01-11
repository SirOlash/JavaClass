import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestNumberSearch {

    @Test
    public void testForIndex() {
        NumberSearch numberSearch = new NumberSearch();
         String actual = numberSearch.search(new int[]{12,17,24,32,14}, 32);
        //String expected = "3";
        assertEquals("3", actual);

       // assertEquals(3, new int[]{12,17,24,32,14});
    }
    @Test
    public void testForIndex2() {
        NumberSearch numberSearch = new NumberSearch();
        assertThrows(IllegalArgumentException.class, () -> numberSearch.search(new int[]{12,17,24,32,14}, 9));
    }
}

