package flyweight;

public class ConcreteFlyweightOne extends Flyweight {
    public ConcreteFlyweightOne(String extrinsic) {
        super(extrinsic);
    }

    public void operate() {
        System.out.println("one");
    }
}
