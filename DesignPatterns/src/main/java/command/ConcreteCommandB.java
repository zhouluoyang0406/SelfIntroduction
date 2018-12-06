package command;

public class ConcreteCommandB implements ICommand {

    private ReceiverA receiverA = null;
    private ReceiverB receiverB = null;

    public ConcreteCommandB(ReceiverA receiverA, ReceiverB receiverB) {
        this.receiverA = receiverA;
        this.receiverB = receiverB;
    }

    public void exec() {
        this.receiverA.doB();
        this.receiverB.doD();
    }
}
