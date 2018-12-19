package observer;

public class ConcreteSubject extends Subject {
    public void dosome(){
        System.out.println("dosome");
        notifyObservers();
    }
}
