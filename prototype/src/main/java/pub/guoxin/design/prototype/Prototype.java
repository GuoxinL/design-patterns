package pub.guoxin.design.prototype;

/**
 * Created by guoxin on 17-9-10.
 */
public class Prototype implements Cloneable {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype clone = (Prototype) super.clone();
        return clone;
    }
}
