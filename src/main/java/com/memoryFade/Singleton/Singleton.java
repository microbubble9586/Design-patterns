package src.main.java.com.memoryFade.Singleton;


public class Singleton {
    public Singleton() {
    }

    private volatile static Singleton uniqueInstance;

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
