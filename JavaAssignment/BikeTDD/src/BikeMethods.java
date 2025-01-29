public class BikeMethods {

    private int bikeSpeed;
    private int bikeGear;

    public BikeMethods() {
       this.bikeStatus = false;
       this.bikeSpeed = 0;
       this.bikeGear = 1;
    }
    private boolean bikeStatus;

    public boolean getStatus() {
        return bikeStatus;
    }

    public void isOn() {
        bikeStatus = true;
    }

    public void isOff() {
        bikeStatus = false;
    }
    public int getBikeSpeed() {
        return bikeSpeed;
    }

    public void accelerate() {
        if (bikeGear == 1)bikeSpeed ++;
        else if (bikeGear == 2) bikeSpeed += 2;
        else if (bikeGear == 3) bikeSpeed += 3;
        else bikeSpeed += 4;
        updateGear();

    }

    public void decelerate() {
        if (bikeGear == 1)bikeSpeed--;
        else if (bikeGear == 2)bikeSpeed -=2;
        else if (bikeGear == 3) bikeSpeed -=3;
        else bikeSpeed -= 4;
        updateGear();
    }
    public void updateGear(){
        if (bikeSpeed > 20 && bikeSpeed < 30)bikeGear = 2;
        else if (bikeSpeed > 30 && bikeSpeed < 40)bikeGear = 3;
        else if (bikeSpeed > 40)bikeGear = 4;
    }

    public int getGear() {
        return bikeGear;
    }
}