package chain;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void exec(Request request) {
        if (request.getLevel() == getLevel()) {
            doSomething(request);
        } else if (nextHandler == null) {
            System.out.println("end"+request.getMessage());
        } else {
            nextHandler.exec(request);
        }
    }

    protected abstract int getLevel();

    protected abstract int doSomething(Request request);
}
