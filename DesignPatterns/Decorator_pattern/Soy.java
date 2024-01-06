package Decorator_pattern;

public class Soy extends CondamentDecorator {
    Beverage beverage;

    public Soy(Beverage b) {
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return this.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return this.cost() + .15;
    }
}
