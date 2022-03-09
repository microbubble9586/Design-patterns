package src.main.java.com.memoryFade.Singleton;

/**
 * @author memoryFade
 * @version 1.0
 * @date 2022/3/9 10:24
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
