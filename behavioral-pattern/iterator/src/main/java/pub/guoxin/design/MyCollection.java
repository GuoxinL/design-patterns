package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
