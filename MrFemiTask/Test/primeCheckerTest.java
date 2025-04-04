import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupital.api.Assertions.assertThrows;

public class  PrimeCheckerStandardTest{
	
		@Test
		public void getPrimeNumbersBeforeInputTest(){
			
			//given (pre-conditions)
			PrimeChecker primeChecker = new PrimeChecker();
	
			//action (the functionality being tested)
			int input = 25;
			int[] primeNumbers = primeChecker.getPrimeNumbersBefore(input);
			System.out.println("actual: "+ Arrays.toString(primeNumbers));
			//check
			int[] expected = {2,3,5,7,11,13,17,19,23};
			assertArrayEquals(expected,primeNumbers);

	


@Test
public void testThatGetPrimeNumbersFailsForNegativeValues(){

	//given
	PrimeChecker primeChecker = new PrimeChecker(); //instantiate the method of the class PrimeChecker
	int negativeInputValue = -9;
	
	//action
	//primeChecker.getPrimeNumbersBefore(negativeInputValue);
	
	//check
	assertThrows(IllegalArgumentException.class,()->primeChecker.getPrimeNumbersBefore(negativeInputValue));

}