package template;

import abstractfactory.AbstractProductA;
import abstractfactory.AbstractProductB;
import abstractfactory.ProductAone;
import abstractfactory.ProductBone;

public  class ConcreteClassA extends AbstractClass {

    protected void doAnything() {
        System.out.println("any A");
    }
    protected void doSomething() {
        System.out.println("some A");
    }
}
