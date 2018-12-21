package state;

public class StopingState extends LiftState {
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    public void close() {

    }

    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    public void stop() {
        System.out.println("stop");
    }
}
