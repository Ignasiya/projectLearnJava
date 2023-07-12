package patterns.singletonPattern.Singleton;

public class SingletonV3 {
    private volatile static SingletonV3 uniqueInstance;

    private SingletonV3() {}

    public static synchronized SingletonV3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonV3.class) {
                if (uniqueInstance == null) uniqueInstance = new SingletonV3();
            }
        }
        return uniqueInstance;
    }
}
