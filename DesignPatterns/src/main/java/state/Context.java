package state;

public class Context {
    public static final ClosingState closingState=new ClosingState();
    public static final OpenningState openningState=new OpenningState();
    public static final StopingState stopingState=new StopingState();
    public static final RunningState runningState=new RunningState();

    private LiftState liftState;
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();

    }

    public void run() {
        liftState.run();
    }

    public void stop() {
        liftState.stop();
    }
}
