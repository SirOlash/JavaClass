import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

public class  ContainsAlphabet{
	
	@Test
	public void getPrimeNumbersBeforeInputTest(){

	PangramChecker pangramchecker = new pangramchecker();

	String sentence = "The quick brown fox jumps over the lazy dog"
	boolean  alphab= pangramchecker.checkAlphabet(sentence);
	
	Boolean expected = true;
	assertTrue(expected,alphab);
}

	
	