package DesignPatterns.Strategy_pattern;

public abstract class Duck {
    QuackBehavior quackbehavior;
    FlyBehavior flybehaviour;

    public Duck() {}

    public abstract void display();

    public void performQuack() {
        quackbehavior.quack();
    }

    public void performFly() {
        flybehaviour.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}