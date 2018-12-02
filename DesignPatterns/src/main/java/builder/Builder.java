package builder;

import abstractfactory.AbstractProductA;
import abstractfactory.AbstractProductB;

public abstract class Builder {
    protected abstract String getColor();
    protected abstract String getWeight();
    protected abstract String getHigh();
    public abstract Product getProduct();
}
