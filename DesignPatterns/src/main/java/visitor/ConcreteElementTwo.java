package visitor;

/**
 * Created by appleluo on 2018/9/16.
 */
public class ConcreteElementTwo extends Element {
    void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }

    @Override
    public void dosome() {
        System.out.println(2);
    }
}
