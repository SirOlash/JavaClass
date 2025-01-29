import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class mapTest {
    MyMap myMap;

    @BeforeEach
    public void setUp() {
        myMap = new MyMap();
    }

    @Test
    public void testThatPutFunctionWorks() {
        myMap.put("class","23");
        assertEquals(1, myMap.size());

    }

    @Test
    public void testThatGetFunctionWorks() {
        myMap.put("class","23");
        myMap.put("class2","24");
        myMap.put("class3","25");
        assertEquals("24", myMap.get("class2"));
    }

    @Test
    public void testThatYouCanUpdateTheValuesIfKeyExists() {
        myMap.put("class","23");
        myMap.put("class2","24");
        myMap.put("class","25");
        assertEquals(2, myMap.size());
        assertEquals("25", myMap.get("class"));

    }
    @Test
    public void testThatContainsKeyMethodWorks() {
        myMap.put("class","23");
        myMap.put("class2","24");
        myMap.put("class3","25");
        myMap.put("class4","26");
        assertTrue(myMap.containsKey("class"));

    }
    @Test
    public void testThatContainsValueMethodWorks() {
        myMap.put("class","23");
        myMap.put("class2","24");
        myMap.put("class3","25");
        myMap.put("class4","26");
        assertTrue(myMap.containsValue("23"));
    }

    @Test
    public void testThatRemoveMethodWorks() {
        myMap.put("class","23");
        myMap.put("class2","24");
        myMap.put("class3","25");
        myMap.remove("class2");
        assertEquals(2, myMap.size());
        assertNull(myMap.get("class2"));
    }


}
