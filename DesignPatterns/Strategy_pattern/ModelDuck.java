package DesignPatterns.Strategy_pattern;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flybehaviour = new FlyWithWings();
        quackbehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
