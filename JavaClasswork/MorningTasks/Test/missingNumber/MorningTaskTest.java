package missingNumber;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MorningTaskTest {
    @Test
    public void testThatFunctionReturnsMissingValue() {
//        MorningTask morningTask = new MorningTask();
        int[] numbers = {1,2,5};
        int[] expectedValues = {3,4};
        int[] values = MorningTask.missingNumbers(numbers);
        assertArrayEquals(values,expectedValues);
    }
    @Test
    public void testThatFunctionReturnsMultiple() {
        int firstNumber = 1;
        int secondNumber = 6;
        int thirdNumber = 2;
        int[] numbers =MorningTask.multiplesOfC(firstNumber,secondNumber,thirdNumber);
        int[] expectedValues = {2,4,6};
        assertArrayEquals(expectedValues,numbers);
    }
    @Test
    public void testThatRangeMustBeInIncreasingOrder() {
        int firstNumber  = 5;
        int secondNumber = 1;
        int thirdNumber = 2;
        assertNull(MorningTask.multiplesOfC(firstNumber,secondNumber,thirdNumber));
    }

}
