package src.main.java.com.memoryFade.observer;

public class Main  {
    public static void main(String[] args) {
//        NumberGenerator generator = new RandomNumberGenerator();
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitalObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new DiagonalObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();

    }
}
