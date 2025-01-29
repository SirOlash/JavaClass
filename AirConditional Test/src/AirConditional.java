public class AirConditional {
    public AirConditional() {
        this.status = false;
        this.temperature = 20;
    }
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public int getTemperature() {
        return temperature;
    }

    private int temperature;

    public boolean getStatus() {
        return status;
    }
    
    public void setOn() {
        status = true;
    }
    
    public void setOff() {
        status = false;
    }


    public void increaseTemperature() {
        if (temperature < 30) {
            temperature++;
        }
    }
    public void decreaseTemperature() {
        if (temperature > 16) {
        temperature--;
        }
    }
}