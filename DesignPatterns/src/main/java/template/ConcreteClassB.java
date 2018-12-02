package template;

import abstractfactory.AbstractProductA;
import abstractfactory.AbstractProductB;
import abstractfactory.ProductAtwo;
import abstractfactory.ProductBtwo;

public  class ConcreteClassB extends AbstractClass {
    protected void doAnything() {
        System.out.println("any B");
    }
    protected void doSomething() {
        System.out.println("some B");
    }
}
