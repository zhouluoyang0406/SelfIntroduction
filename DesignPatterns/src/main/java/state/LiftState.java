package state;

public abstract class LiftState {
    protected Context context;
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
    public void setContext(Context context) {
        this.context = context;
    }
}
