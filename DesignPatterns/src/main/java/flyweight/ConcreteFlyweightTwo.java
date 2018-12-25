package flyweight;

public class ConcreteFlyweightTwo extends Flyweight {
    public ConcreteFlyweightTwo(String extrinsic) {
        super(extrinsic);
    }

    public void operate() {
        System.out.println("two");
    }
}
