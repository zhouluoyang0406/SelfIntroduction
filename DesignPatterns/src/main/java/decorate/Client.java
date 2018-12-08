package decorate;

public class Client {
    public static void main(String[] args) {
        Component component=new ConcreateDecorator(new ConcreateComponent());
        component.operate();
    }
}
