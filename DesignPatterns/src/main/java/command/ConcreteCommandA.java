package command;

public class ConcreteCommandA implements ICommand {
    private ReceiverA receiverA = null;
    private ReceiverB receiverB = null;

    public ConcreteCommandA(ReceiverA receiverA, ReceiverB receiverB) {
        this.receiverA = receiverA;
        this.receiverB = receiverB;
    }

    public void exec() {
        this.receiverA.doA();
        this.receiverB.doC();
    }
}
