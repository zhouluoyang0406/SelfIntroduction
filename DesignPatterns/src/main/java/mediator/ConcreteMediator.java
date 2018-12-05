package mediator;

public class ConcreteMediator extends Mediator {
    public ConcreteMediator(ConcreteColleagueOne concreteColleagueOne, ConcreteColleagueTwo concreteColleagueTwo, ConcreteColleagueThree concreteColleagueThree) {
        super(concreteColleagueOne, concreteColleagueTwo, concreteColleagueThree);
    }

    public void exec(String str) {
        if (str=="TwoAndThree"){
            doTwoAndThree();
        }
        if (str=="OneAndTwo"){
            doOneAndTwo();
        }
        if (str=="OneAndThree"){
            doOneAndThree();
        }
    }
    public void doTwoAndThree(){
        concreteColleagueTwo.doTwo();
        concreteColleagueThree.doThree();
    }
    public void doOneAndTwo(){
        concreteColleagueOne.doOne();
        concreteColleagueTwo.doTwo();
    }
    public void doOneAndThree(){
        concreteColleagueOne.doOne();
        concreteColleagueThree.doThree();
    }
}
