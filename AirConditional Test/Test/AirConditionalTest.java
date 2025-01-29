import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionalTest {
    AirConditional ac = new AirConditional();
    @Test
    public void testForFunction(){
        assertFalse(ac.getStatus());
    }
    @Test
    public void testThatAcIsOn(){
        ac.setOn();
        assertTrue(ac.getStatus());
    }
    @Test
    public void testThatAcIsOff(){
        ac.setOff();
        assertFalse(ac.getStatus());
    }
    @Test
    public void testThatStatusTemperatureIncreases(){
        int initialTemperature = ac.getTemperature();
        ac.increaseTemperature();
        assertEquals(initialTemperature + 1,ac.getTemperature());
    }
    @Test
    public void testThatStatusTemperatureDecreases(){
        int initialTemperature = ac.getTemperature();
        ac.decreaseTemperature();
        assertEquals(initialTemperature - 1, ac.getTemperature());
    }
    @Test
    public void testThatStatusTemperatureDoNotIncreasesPass30(){
        for (int index=0; index<30; index++){
            ac.increaseTemperature();
        }
        assertEquals(30,ac.getTemperature() );
    }
    @Test
    public void testThatStatusTemperatureDoNotDecreaseBelow16(){
        for (int index=0; index<16; index++){
            ac.decreaseTemperature();
        }
        assertEquals(16, ac.getTemperature() );
    }


}
