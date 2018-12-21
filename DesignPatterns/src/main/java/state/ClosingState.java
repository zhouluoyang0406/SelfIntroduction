package state;

public class ClosingState extends LiftState {
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    public void close() {
        System.out.println("close");
    }

    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    public void stop() {
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState().stop();
    }
}
