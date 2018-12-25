package flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<String,Flyweight> pool=new HashMap<String, Flyweight>();
    public static Flyweight getFlyweight(String key){
        if (pool.containsKey(key)){
            return pool.get(key);
        }else {
            ConcreteFlyweightOne flyweightOne = new ConcreteFlyweightOne("key");
            pool.put(key,flyweightOne);
            return flyweightOne;
        }
    }
}
