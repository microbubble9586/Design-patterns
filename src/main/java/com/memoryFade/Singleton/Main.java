package src.main.java.com.memoryFade.Singleton;

/**
 * @author memoryFade
 * @version 1.0
 * @date 2022/3/9 10:31
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if (singleton == singleton1){
            System.out.println("同一个实例");
        } else {
            System.out.println("不同实例");
        }
        System.out.println("End.");
    }
}
