package pub.guoxin.pattern;

/**
 * Created by guoxin on 17-9-29.
 */
public interface Visitor {

    /**
     * 对应NodeA的访问者操作
     *
     * @param node
     */
    void visit(NodeA node);

    /**
     * 对应NodeB的访问者操作
     * @param node
     */
    void visit(NodeB node);
}
