package iterator;

import java.util.Vector;

public class ConcreteIterator implements  Iterator {
    private Vector vector;
    public int cursor=0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    public Object next() {
        Object result=null;
        if (this.hasNext()){
            result =this.vector.get(cursor++);
        }
        return result;
    }

    public void remove() {
        this.vector.remove(this.next());
    }

    public boolean hasNext() {
        return !(cursor==vector.size());
    }
}
