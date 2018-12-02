package template;

public class Client {
    public static void main(String[] args) {
        AbstractClass a=new ConcreteClassA();
        AbstractClass b=new ConcreteClassB();
        a.templateMethod();
        b.templateMethod();
    }
}
