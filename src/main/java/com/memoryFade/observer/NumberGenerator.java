package src.main.java.com.memoryFade.observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private final ArrayList<Object> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        Iterator<Object> it = observers.iterator();
        while(it.hasNext()){
            Observer next = (Observer) it.next();
            next.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
