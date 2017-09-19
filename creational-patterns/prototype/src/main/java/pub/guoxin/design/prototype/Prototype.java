package pub.guoxin.design.prototype;

/**
 * 原型
 * 名词:原型, 样机, 样板, 榜样
 * Created by guoxin on 17-9-10.
 */
public class Prototype implements Cloneable {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype clone = (Prototype) super.clone();
        return clone;
    }
}
