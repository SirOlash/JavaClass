import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue myQueue;

    @BeforeEach
    public void setUp() {
        myQueue = new Queue();
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void testThatYouCanAddItemToTheQueue() {
        myQueue.add("bruno");
        assertFalse(myQueue.isEmpty());
    }
    @Test
    public void testThatYouCanAddMoreItemsToTheQueue() {
        myQueue.add("bruno");
        myQueue.add("amad");
        myQueue.add("martinez");
        myQueue.offer("fty");
        assertEquals(3,myQueue.size());
    }
    @Test
    public void testThatOfferFunctionWorks() {
        myQueue.offer("bruno");
        myQueue.offer("amad");
        myQueue.offer("martinez");
        assertEquals(3,myQueue.size());
        assertFalse( myQueue.offer("ugarte"));
    }
    @Test
    public void testThatPollFunctionWorks() {
        myQueue.offer("bruno");
        myQueue.offer("amad");
        myQueue.offer("martinez");
        assertEquals(3,myQueue.size());
        myQueue.poll();
        assertEquals(2,myQueue.size());

    }
    @Test
    public void testThatPollFunctionReturnsNull() {
        assertNull(myQueue.poll());
    }
    @Test
    public void testThatPeekFunctionWorks() {
        myQueue.offer("bruno");
        myQueue.offer("amad");
        myQueue.offer("martinez");
        myQueue.poll();
        myQueue.peek();
        assertEquals("amad",myQueue.peek());
    }
}
