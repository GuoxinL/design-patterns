package pub.guoxin.design;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by guoxin on 17-9-13.
 */
public class FlyweightFactory {
    Map<String, Flyweight> flyweights = Maps.newHashMap();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight("111");
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }
}
