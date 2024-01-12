package StrategypPattern;

public class MalardDuck extends Duck {

    public MalardDuck() {
        quackbehavior = new Quack();
        flybehaviour = new FlyWithWings();
    }
    
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
