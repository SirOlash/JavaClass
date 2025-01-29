import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack myStack;

    @BeforeEach
    public void setUp() {
        myStack = new Stack();
    }

    @Test
    public void testThatStackIsEmpty() {
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatPushMethodWorks() {
        myStack.push("bruno");
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void testThatPeekMethodWorks() {
        myStack.push("bruno");
        assertTrue(myStack.peek().equals("bruno"));
    }

    @Test
    public void testThatPushMethodAddsElementToTheTopOfStack() {
        myStack.push("onana");
        myStack.push("martinez");
        myStack.push("amad");
        myStack.push("bruno");
        assertEquals(4, myStack.size());
        assertEquals("bruno",myStack.peek());

    }
    @Test
    public void testThatPopMethodWorks() {
        myStack.push("bruno");
        myStack.push("martinez");
        myStack.push("amad");
        myStack.pop();
        assertEquals("martinez",myStack.peek());
    }

    @Test
    public void testThatSearchMethodWorks() {
        myStack.push("bruno");
        myStack.push("martinez");
        myStack.push("amad");
        assertEquals(2,myStack.search("martinez"));
    }


}
