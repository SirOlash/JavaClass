package television;

public class Television {
    private boolean isOn;
    private int volumeLevel;
    private int channelNumber;
    private int tempVolume = 0;

    public Television() {
        this.isOn = false;
        this.volumeLevel = 0;
        this.channelNumber = 1;
    }
    public boolean isOn() {
        return this.isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }

    public int getVolume() {
        return volumeLevel;
    }

    public void increaseVolume() {
        if (isOn && volumeLevel < 100) volumeLevel++;
    }
    public void decreaseVolume() {
        if (isOn && volumeLevel > 0) volumeLevel--;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void raiseChannelNumber() {
        if (isOn && channelNumber < 100) channelNumber++;
    }

    public void decreaseChannelNumber() {
        if (isOn && channelNumber > 1) channelNumber--;
    }

    public void setChannel(int number) {
        if (isOn) this.channelNumber = number;
    }

    public void mute() {
        if (isOn){
        this.tempVolume = getVolume();
        this.volumeLevel = 0;
        }
    }

    public void unMute() {
        if (isOn && this.tempVolume > 0){
            this.volumeLevel  = tempVolume;
            this.tempVolume = 0;
        }
    }
}
