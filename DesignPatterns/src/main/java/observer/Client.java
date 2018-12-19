package observer;

public class Client {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        subject.addObsVector(new ConcreteObserverOne());
        subject.addObsVector(new ConcreteObserverTwo());
        ((ConcreteSubject) subject).dosome();
    }
}
