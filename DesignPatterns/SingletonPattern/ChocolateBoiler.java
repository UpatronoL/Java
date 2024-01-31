package SingletonPattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if(instance == null) 
            instance = new ChocolateBoiler();
        return instance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
        System.out.println("filling the boiler");
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
        System.out.println("drainning the boiler");
    }

    public void boiled() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
        System.out.println("boiling the mixture");
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
    
}
