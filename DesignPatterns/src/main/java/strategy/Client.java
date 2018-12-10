package strategy;


public class Client {
    public static void main(String[] args) {
        Strategy strategy=new ConcreteStrategy();
        Context context=new Context();
        context.setStrategy(strategy);
        context.doAnyThing();
    }
}
