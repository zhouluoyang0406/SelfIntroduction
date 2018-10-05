package visitor;

/**
 * Created by appleluo on 2018/9/16.
 */
public class Visitor implements Ivisitor {
    public void visit(ConcreteElementOne concreteElementOne) {
        concreteElementOne.dosome();
    }

    public void visit(ConcreteElementTwo concreteElementTwo) {
        concreteElementTwo.dosome();
    }
}
