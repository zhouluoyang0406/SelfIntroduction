package abstractfactory;

public  class CreatorB  extends AbstractCreator {

    public AbstractProductA createProductA() {
        return new ProductAtwo();
    }

    public AbstractProductB createProductB() {
        return new ProductBtwo();
    }
}
