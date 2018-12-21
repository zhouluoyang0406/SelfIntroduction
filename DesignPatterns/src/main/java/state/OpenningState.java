package state;

public class OpenningState extends LiftState {
    public void open() {
        System.out.println("open");
    }

    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    public void run() {

    }

    public void stop() {
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState().stop();
    }
}
