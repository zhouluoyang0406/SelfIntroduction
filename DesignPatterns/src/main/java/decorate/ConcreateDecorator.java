package decorate;

public class ConcreateDecorator extends Decorator {
    public ConcreateDecorator(Component component) {
        super(component);
    }
    private void doSome(){
        System.out.println("decorator do");
    }

    @Override
    public void operate() {
        doSome();
        super.operate();
    }
}
