package patterns.singletonPattern.Singleton;

public class SingletonV2 {
    private final static SingletonV2 uniqueInstance = new SingletonV2();

    private SingletonV2() {}

    public static synchronized SingletonV2 getInstance() {
        return uniqueInstance;
    }
}
