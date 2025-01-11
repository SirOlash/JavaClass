import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class NumberSearchTest {
@Test
public void testCompare() {
NumberSearch numb = new NumberSearch();
assertEquals(0, numb.search({12,17,24,32,14}, 12));
//assertEquals(-1, basics.compare(1, 2));
}
}
