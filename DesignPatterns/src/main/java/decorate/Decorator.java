package decorate;

public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operate() {
        this.component.operate();
    }
}
