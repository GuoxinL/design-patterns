package pub.guoxin.pattern;

/**
 * Created by guoxin on 17-9-29.
 */
public abstract class Node {

    /**
     * 接受操作
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
