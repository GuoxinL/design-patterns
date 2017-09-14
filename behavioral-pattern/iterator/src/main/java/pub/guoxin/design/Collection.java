package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public interface Collection {

    Iterator iterator();

    Object get(int i);

    int size();
}
