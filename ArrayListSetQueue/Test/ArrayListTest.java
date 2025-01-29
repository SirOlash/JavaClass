import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private MyArrayList myArrayList;

    @BeforeEach
    public void setUp() {
        myArrayList = new MyArrayList();
    }

    @Test
    public void testThatListIsEmpty() {
        //MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testForSize() {
        assertEquals(0,myArrayList.size());
    }

    @Test
    public void testThatAddMethodWorks() {
        assertEquals(0,myArrayList.size());
        myArrayList.add("Bruno");
        assertEquals(1,myArrayList.size());
    }

    @Test
    public void testThatYouCanAddMoreElements() {
        myArrayList.add("Bruno");
        myArrayList.add("Amad");
        myArrayList.add("Bruno");
        myArrayList.add("ugarte");
        assertEquals(4,myArrayList.size());
    }

    @Test
    public void testThatYouCanCheckIfAnElementExists() {
        myArrayList.add("Bruno");
        myArrayList.add("Amad");
        myArrayList.add("Agarte");
        assertTrue(myArrayList.contains("Amad"));
    }

    @Test
    public void testThatCapacityDoublesAfterArrayIsFull() {
        myArrayList.add("Bruno");
        myArrayList.add("Amad");
        myArrayList.add("Bruno");
        myArrayList.add("Deligt");
        myArrayList.add("ugarte");
        assertEquals(6,myArrayList.capacity());
    }

    @Test
    public void testThatGetElementByIndexMethodWorks() {
        myArrayList.add("Bruno");
        myArrayList.add("Amad");
        myArrayList.add("Maino");
        assertEquals("Amad",myArrayList.getElementByIndex(1));
    }

    @Test
    public void testThatGetIndexByElementMethodWorks() {
        myArrayList.add("Bruno");
        myArrayList.add("Amad");
        myArrayList.add("Maino");
        assertEquals(2,myArrayList.getIndexByElement("Maino"));
    }

    @Test
    public void testThatRemoveMethodWorks() {
        myArrayList.add("Bruno");
        myArrayList.add("Amad");
        myArrayList.add("Maino");
        assertEquals(3,myArrayList.size());
        myArrayList.remove("Amad");
        myArrayList.remove("Maino");
        assertEquals(1,myArrayList.size());
    }

    @Test
    public void testThatYouCanAddXYZRemoveYAndReturnIndexOfZ(){
        myArrayList.add("Bruno");
        myArrayList.add("Amad");
        myArrayList.add("Maino");
        assertEquals(3,myArrayList.size());
        myArrayList.remove("Amad");
        assertEquals("Maino",myArrayList.getElementByIndex(1));
    }
    @Test
    public void testThatWhenYouCanAddAnElementAtASpecificIndex(){
        myArrayList.add("Bruno");
        myArrayList.add("Amad");
        myArrayList.addAtIndex("Maino",1);
        assertEquals(3,myArrayList.size());
        assertEquals("Amad",myArrayList.getElementByIndex(2));
    }


}
