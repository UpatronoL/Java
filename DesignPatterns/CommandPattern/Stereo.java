package CommandPattern;

public class Stereo {
    String location;

    public Stereo(String loc) {
        this.location = loc;
    }

    public void on() {
        System.out.println(location + " the stereo is on");
    }

    public void off() {
        System.out.println(location + " the stereo if off");
    }

    public void setCd() {
        System.out.println(location + " stereo is set for Cd input");
    }

    public void setDvd() {
        System.out.println(location + " stereo is set for Dvd input");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for Radio input");
    }

    public void setVolume(int volume) {
        System.out.println(location + " stereo volume set to " + volume);
    }

}
