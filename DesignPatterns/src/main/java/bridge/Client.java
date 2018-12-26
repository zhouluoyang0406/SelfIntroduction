package bridge;

public class Client {
    public static void main(String[] args) {
        Implementor implementor=new ConcreteImplementorOne();
        RefinedAbstraction refinedAbstraction=new RefinedAbstraction(implementor);
        refinedAbstraction.request();
    }
}
