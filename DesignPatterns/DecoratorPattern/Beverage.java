package DecoratorPattern;

public abstract class Beverage {
    String description = "Unknow Baverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
