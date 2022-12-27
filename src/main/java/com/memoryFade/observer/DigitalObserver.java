package src.main.java.com.memoryFade.observer;

public class DigitalObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitalObserver:" + numberGenerator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
