package CommandPattern;

public class CealingFan {
    String location;
    int speed;

    public CealingFan(String loc) {
        this.location = loc;
        this.speed = 0;
    }

    public void high() {
        speed = 10;
        System.out.println(location + " cealing fun is turened on high");
    }

    public void medium() {
        speed = 5;
        System.out.println(location + " cealing fun is turened on medium");
    }

    public void low() {
        speed = 2;
        System.out.println(location + " cealing fun is turened on low");
    }

    public void off() {
        speed = 0;
        System.out.println(location + " cealing fun is turned off");
    }

    public void getSpeed() {
        System.out.println(location + " cealing fun speed is " + speed);
    }

}
