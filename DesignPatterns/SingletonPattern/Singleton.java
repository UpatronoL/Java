package SingletonPattern;

public class Singleton {
    public static Singleton uniqueInstance;
    
    private Singleton() {}

    public static Singleton singletonGetInstace() {
        if (uniqueInstance == null) 
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }
    
}