import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class BikeTest {
    BikeMethods bike;

    @BeforeEach
    void setUp() {
        bike = new BikeMethods();
    }

    @Test
    void testThatBikeIsOffOriginally() {
        Assertions.assertFalse(bike.getStatus());
    }

    @Test
    public void testThatBikeCanBeTurnedOn() {
        bike.isOn();
        Assertions.assertTrue(bike.getStatus());
    }

    @Test
    public void testThatBikeCanBeTurnedOff() {
        bike.isOff();
        Assertions.assertFalse(bike.getStatus());
    }

    @Test
    public void testThatYouBikeCanBeAccelerated(){
        int currentSpeed = bike.getBikeSpeed();
        bike.accelerate();
        Assertions.assertEquals(bike.getBikeSpeed(), currentSpeed + 1);
    }
    @Test
    public void testThatYouBikeCanBeDecelerated(){
        int currentSpeed = bike.getBikeSpeed();
        bike.decelerate();
        Assertions.assertEquals(currentSpeed - 1,bike.getBikeSpeed());
    }
    @Test
    public void testThatGearIncreasesWhenSpeedIs21(){
        for (int i=1; i<=21; i++){
            bike.accelerate();
        }
        Assertions.assertEquals( 21,bike.getBikeSpeed());
        Assertions.assertEquals(2, bike.getGear());
        int currentSpeed = bike.getBikeSpeed();
        bike.accelerate();
        Assertions.assertEquals(currentSpeed+2, bike.getBikeSpeed());

    }
    @Test
    public void testThatGearIncreasesWhenSpeedIs31(){
        for (int i=1; i<=31; i++){
            bike.accelerate();
        }
        Assertions.assertEquals( 47,bike.getBikeSpeed());
        Assertions.assertEquals(4, bike.getGear());
        int currentSpeed = bike.getBikeSpeed();
        bike.accelerate();
        Assertions.assertEquals(currentSpeed +4, bike.getBikeSpeed());
    }

    @Test
    public void testThatGearDecreasesWhenSpeedIsReduced(){
        for (int i=1; i<=31; i++){
            bike.accelerate();
        }
        Assertions.assertEquals( 47,bike.getBikeSpeed());
        Assertions.assertEquals(4, bike.getGear());

        for (int j = 1; j<=5; j++){
            bike.decelerate();
        }
        Assertions.assertEquals( 30,bike.getBikeSpeed());
        Assertions.assertEquals(3, bike.getGear());

    }

}
