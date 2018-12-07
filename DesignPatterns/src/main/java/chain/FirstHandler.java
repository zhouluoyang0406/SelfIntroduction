package chain;

public class FirstHandler extends AbstractHandler{
    protected int getLevel() {
        return 1;
    }

    protected int doSomething(Request request) {
        System.out.println("level 1"+request.getMessage());
        return 0;
    }
}
