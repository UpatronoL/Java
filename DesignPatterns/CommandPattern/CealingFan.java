package CommandPattern;

public class CealingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CealingFan(String loc) {
        this.location = loc;
        this.speed = 0;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " cealing fun is turened on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " cealing fun is turened on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " cealing fun is turened on low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " cealing fun is turned off");
    }

    public void getSpeed() {
        System.out.println(location + " cealing fun speed is " + speed);
    }

}
