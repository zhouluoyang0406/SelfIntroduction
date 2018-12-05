package mediator;

public class ConcreteColleagueThree extends Colleague {
    public ConcreteColleagueThree(Mediator mediator) {
        super(mediator);
    }
    public ConcreteColleagueThree() {
        super();
    }

    public void doWithOneAndTwo(){
        this.mediator.exec("OneAndTwo");
    }
    public void doThree(){
        System.out.println("Three");
    }
}
