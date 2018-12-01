package abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractCreator creatorA=new CreatorA();
        AbstractCreator creatorB=new CreatorB();
        AbstractProductA productA = creatorA.createProductA();
        AbstractProductB productB = creatorA.createProductB();
        AbstractProductA productA1 = creatorB.createProductA();
        AbstractProductB productB1 = creatorB.createProductB();
    }
}
