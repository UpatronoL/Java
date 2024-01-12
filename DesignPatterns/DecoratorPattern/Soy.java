package DecoratorPattern;

public class Soy extends CondamentDecorator {
    Beverage beverage;

    public Soy(Beverage b) {
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
