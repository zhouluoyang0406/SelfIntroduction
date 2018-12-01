package abstractfactory;

public  class CreatorA extends AbstractCreator {

    public AbstractProductA createProductA() {
        return new ProductAone();
    }

    public AbstractProductB createProductB() {
        return new ProductBone();
    }
}
