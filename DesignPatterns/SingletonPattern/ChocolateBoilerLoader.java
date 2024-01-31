package SingletonPattern;

public class ChocolateBoilerLoader {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boiled();
        boiler.drain();
    }
}
