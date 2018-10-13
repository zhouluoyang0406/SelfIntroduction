package factory;

public class Client {
    public static void main(String[] args) {
        Factory.getProject("One").doSomething();
        Factory.getProject("Other").doSomething();
    }
}
