package iterator;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {
    private Vector vector=new Vector();
    public void add(Object object) {
        vector.add(object);
    }

    public void remove(Object object) {
        vector.remove(object);
    }

    public Iterator iterator() {
        return null;
    }
}
