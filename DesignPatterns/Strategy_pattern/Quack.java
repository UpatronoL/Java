package DesignPatterns.Strategy_pattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Quack");
    }
}
