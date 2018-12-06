package command;

public class Client {
    public static void main(String[] args) {
        ReceiverA receiver = new ReceiverA();
        ReceiverB receiverB = new ReceiverB();
        Invoker invoker = new Invoker();
        invoker.SetCommand(new ConcreteCommandA(receiver,receiverB));
        invoker.runCommand();
        invoker.SetCommand(new ConcreteCommandB(receiver,receiverB));
        invoker.runCommand();
    }
}
