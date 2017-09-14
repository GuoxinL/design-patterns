package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public interface Iterator {

    Object previous();

    Object next();

    boolean hasNext();

    Object first();
}
