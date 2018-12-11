package adapter;

public class Adapter extends Adaptee implements Target {
    public void dosomething() {
        super.doOtherthing();
    }
}
