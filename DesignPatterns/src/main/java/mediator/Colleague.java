package mediator;

public abstract class Colleague {
    public Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }
    public Colleague(){
    }
}
