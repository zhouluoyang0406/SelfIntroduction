package command;

public class Invoker {
    private ICommand command = null;
    public void SetCommand(ICommand command){
        this.command = command;
    }
    public void runCommand(){
        command.exec();
    }
}
