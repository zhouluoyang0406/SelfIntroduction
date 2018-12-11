package adapter;

public class Client {
    public static void main(String[] args) {
        Target target=new ConcreteTarget();
        target.dosomething();
        Target target1=new Adapter();
        target1.dosomething();
    }
}
