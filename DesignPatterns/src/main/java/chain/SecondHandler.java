package chain;

public class SecondHandler extends AbstractHandler {
    protected int getLevel() {
        return 2;
    }

    protected int doSomething(Request request) {
        System.out.println("level 2"+request.getMessage());
        return 0;
    }
}
