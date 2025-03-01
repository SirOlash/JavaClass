package television;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television television;
    @BeforeEach
    void setUp() {
        television = new Television();
    }
    @Test
    public void testThatTelevisionIsInitiallyOff() {
        assertFalse(television.isOn());
    }
    @Test
    public void testThatTelevisionCanBeSwitchedOnAndOff() {
        assertFalse(television.isOn());
        television.turnOn();
        assertTrue(television.isOn());
        television.turnOff();
        assertFalse(television.isOn());
    }
    @Test
    public void testThatYouCanIncreaseTVVolume() {
        television.turnOn();
        int initialVolume = television.getVolume();
        television.increaseVolume();
        assertEquals(initialVolume + 1,television.getVolume());
    }
    @Test
    public void testThatYouCanDecreaseTVVolume() {
        television.turnOn();
        television.increaseVolume();
        int initialVolume = television.getVolume();
        television.decreaseVolume();
        assertEquals(initialVolume - 1,television.getVolume());
    }
    @Test
    public void testThatVolumeCantGoBeyondOAnd100() {
        television.turnOn();
        television.decreaseVolume();
        assertEquals(0,television.getVolume());
        for (int index = 0; index < 110; index++) {
            television.increaseVolume();
        }
        assertEquals(100,television.getVolume());
    }
    @Test
    public void testThatYouCanRaiseChannel(){
        television.turnOn();
        int initialChannel = television.getChannelNumber();
        television.raiseChannelNumber();
        assertEquals(initialChannel + 1,television.getChannelNumber());
    }
    @Test
    public void testThatYouCanDecreaseChannel(){
        television.turnOn();
        television.raiseChannelNumber();
        int initialChannel = television.getChannelNumber();
        television.decreaseChannelNumber();
        assertEquals(initialChannel - 1,television.getChannelNumber());
    }
    @Test
    public void testThatYouCanSetChannel(){
        television.turnOn();
        television.setChannel(24);
        assertEquals(24,television.getChannelNumber());
    }
    @Test
    public void testThatYouCanMuteVolume(){
        television.turnOn();
        television.increaseVolume();
        assertEquals(1,television.getVolume());
        television.mute();
        assertEquals(0,television.getVolume());
    }
    @Test
    public void testThatYouCanUnMuteVolume(){
        television.turnOn();
        for (int index = 0; index < 30; index++) {
            television.increaseVolume();
        }
        assertEquals(30,television.getVolume());
        television.mute();
        assertEquals(0,television.getVolume());
        television.unMute();
        assertEquals(30,television.getVolume());
    }
    @Test
    public void test(){
        television.turnOn();
        television.increaseVolume();
        television.unMute();
        assertEquals(1,television.getVolume());


    }

}
