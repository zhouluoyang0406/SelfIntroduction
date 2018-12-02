package template;

import abstractfactory.AbstractProductA;
import abstractfactory.AbstractProductB;

public abstract class AbstractClass {
    protected abstract void doAnything();

    protected abstract void doSomething();

    public void templateMethod() {
        doAnything();
        doSomething();
    }
}
