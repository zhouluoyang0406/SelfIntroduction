package mediator;

public abstract class Mediator {
    protected ConcreteColleagueOne concreteColleagueOne;
    protected ConcreteColleagueTwo concreteColleagueTwo;
    protected ConcreteColleagueThree concreteColleagueThree;

    public Mediator(ConcreteColleagueOne concreteColleagueOne,ConcreteColleagueTwo concreteColleagueTwo,ConcreteColleagueThree concreteColleagueThree) {
        this.concreteColleagueOne = concreteColleagueOne;
        this.concreteColleagueOne.mediator=this;
        this.concreteColleagueTwo = concreteColleagueTwo;
        this.concreteColleagueTwo.mediator=this;
        this.concreteColleagueThree = concreteColleagueThree;
        this.concreteColleagueThree.mediator=this;
    }
    public abstract void exec(String str);
}
