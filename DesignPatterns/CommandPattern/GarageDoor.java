package CommandPattern;

public class GarageDoor {
    String location;

    public GarageDoor(String loc) {
        this.location = loc;
    }
    
    public void Open() {
        System.out.println(location + " garagde door is open");
    }

    public void Close() {
        System.out.println(location + " garagde door is closed");
    }

    public void stop() {
        System.out.println(location + " garagde door stopped");
    }

    public void garageLightOn() {
        System.out.println(location + " garage light is on");
    }

    public void garageLightOff() {
        System.out.println(location + " garage light is off");
    }
}
