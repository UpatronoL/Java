package Decorator_pattern;

public class Whip extends CondamentDecorator {
    Beverage beverage;

    public Whip(Beverage b) {
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
