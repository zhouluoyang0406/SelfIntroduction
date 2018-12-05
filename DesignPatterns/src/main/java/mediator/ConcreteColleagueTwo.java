package mediator;

public class ConcreteColleagueTwo extends Colleague {
    public ConcreteColleagueTwo(Mediator mediator) {
        super(mediator);
    }
    public ConcreteColleagueTwo() {
        super();
    }

    public void doWithOneAndThree() {
        this.mediator.exec("OneAndThree");
    }

    public void doTwo() {
        System.out.println("Two");
    }
}
