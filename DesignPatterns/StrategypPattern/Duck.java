package StrategypPattern;

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

    public void setFlyBehavior(FlyBehavior fb) {
        flybehaviour = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackbehavior = qb;
    }
}