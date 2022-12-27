package src.main.java.com.memoryFade.observer;

public class IncrementalNumberGenerator extends NumberGenerator{
    private int startNum;
    private int endNum;
    private int step;
    private int number;

    public IncrementalNumberGenerator(int startNum, int endNum, int step) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (number = startNum;number<=endNum;number+=step){
            notifyObservers();
        }
    }
}
