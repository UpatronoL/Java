package DesignPatterns.Strategy_pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MalardDuck();
        System.out.println();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
