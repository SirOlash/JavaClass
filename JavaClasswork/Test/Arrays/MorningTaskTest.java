package Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorningTaskTest {

    @Test
    public void testThatMissingNumberIsReturned() {
        MorningTask morningTask = new MorningTask();
        int [] numbers ={1,2,5};
        morningTask(numbers);
        assertEquals(new int[]{3,4},numbers);
    }

    @Test
    public void testThatMissingNumberIsReturned() {
        MorningTask morningTask = new MorningTask();
        int[] numbers = {1, 2, 5};
        int[] missingNumbers = morningTask.missingNumbers(int[] numbers);
        assertArrayEquals(new int[]{3, 4}, missingNumbers);
    }


        @Test
        public void testThatMissingNumberIsReturned() {
            MorningTask morningTask = new MorningTask();
            int[] numbers = {1, 2, 5};
            int[] expectedMissingNumbers = {3, 4};

            ArrayList<Integer> result = morningTask.missingNumber(numbers);

            // Convert the result to an array
            Integer[] resultArray = result.toArray(new Integer[0]);

            // Convert expectedMissingNumbers to a list
            Integer[] expectedArray = Arrays.stream(expectedMissingNumbers).boxed().toArray(Integer[]::new);

            Assertions.assertArrayEquals(expectedArray, resultArray);
        }
    }




}
