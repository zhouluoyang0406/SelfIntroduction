package observer;

import java.util.Vector;

public abstract class Subject {
    private Vector<Observer> obsVector=new Vector<Observer>();

    public void addObsVector(Observer o) {
        obsVector.add(o);
    }

    public void delObsVector(Observer o) {
        obsVector.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : obsVector) {
            observer.update();
        }
    }
}
