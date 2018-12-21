package state;

public class RunningState extends LiftState {
    public void open() {

    }

    public void close() {

    }

    public void run() {
        System.out.println("run");
    }

    public void stop() {
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState().stop();
    }
}
