package bridge;

public abstract class Abstraction {
    private Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    public void request(){
        this.implementor.doAnything();
        this.implementor.doSomething();
    }


}
