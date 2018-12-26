package bridge;

public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    @Override
    public void request(){
        super.request();
    }
}
