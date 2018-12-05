package mediator;


public class Client {
    public static void main(String[] args) {
        ConcreteColleagueOne concreteColleagueOne=new ConcreteColleagueOne();
        ConcreteColleagueTwo concreteColleagueTwo=new ConcreteColleagueTwo();
        ConcreteColleagueThree concreteColleagueThree=new ConcreteColleagueThree();
        Mediator mediator=new ConcreteMediator(concreteColleagueOne,concreteColleagueTwo,concreteColleagueThree);
        concreteColleagueOne.doWithTwoAndThree();
        concreteColleagueTwo.doWithOneAndThree();
        concreteColleagueThree.doWithOneAndTwo();
    }
}
