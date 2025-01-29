import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class mySetTest {
    private Set mySet;

    @BeforeEach
    void setUp() {
        mySet = new Set();
    }

    @Test
    public void testThatSetIsEmpty() {
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void testThatYouCanAddElement() {
        mySet.add("bruno");
        mySet.add("amad");
        assertEquals(2, mySet.size());
    }
    @Test
    public void testThatYouCantAddSimilarElements() {
        mySet.add("bruno");
        mySet.add("amad");
        mySet.add("bruno");
        assertEquals(2, mySet.size());
    }
    @Test
    public void testThatYouCanRemoveElement() {
        mySet.add("bruno");
        mySet.add("amad");
        mySet.add("casemiro");
        assertEquals(3, mySet.size());
        mySet.remove("bruno");
        assertEquals(2, mySet.size());
        assertEquals("amad", mySet.getElementByIndex(0));
    }
    @Test
    public void testThatSetContainsAParticularElement() {
        mySet.add("bruno");
        mySet.add("amad");
        assertTrue(mySet.contains("bruno"));

    }

    @Test
    public void testThatClearFunctionWorks() {
        mySet.add("bruno");
        mySet.add("amad");
        mySet.add("u");
        assertEquals(3, mySet.size());
        mySet.clear();
        assertEquals(0, mySet.size());
    }

}
