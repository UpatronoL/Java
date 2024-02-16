package AdapterPattern;

public class TurkeyAdaptor implements Duck {
    Turkey turkey;
    public TurkeyAdaptor(Turkey turk) {
        this.turkey = turk;
    }

    @Override
    public void quack() {
        turkey.goble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
