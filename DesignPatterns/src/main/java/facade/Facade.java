package facade;

public class Facade {
    private ModuleOne moduleOne=new ModuleOne();
    private ModuleTwo moduleTwo=new ModuleTwo();
    private ModuleThree moduleThree=new ModuleThree();
    public void methodOne(){moduleOne.doSomeThing();}
    public void methodTwo(){moduleTwo.doSomeThing();}
    public void methodThree(){moduleThree.doSomeThing();}
}
