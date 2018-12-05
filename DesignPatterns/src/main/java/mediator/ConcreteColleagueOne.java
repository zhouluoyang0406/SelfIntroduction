package mediator;

public class ConcreteColleagueOne extends Colleague{
    public ConcreteColleagueOne(Mediator mediator) {
        super(mediator);
    }
    public ConcreteColleagueOne() {
        super();
    }
    public void doWithTwoAndThree(){
        this.mediator.exec("TwoAndThree");
    }
    public void doOne(){
        System.out.println("one");
    }
}
