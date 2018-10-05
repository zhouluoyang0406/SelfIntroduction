package visitor;

/**
 * Created by appleluo on 2018/9/16.
 */
public abstract class Element {
    public void dosome(){

    }
    abstract void accept(Ivisitor ivisitor);
}
