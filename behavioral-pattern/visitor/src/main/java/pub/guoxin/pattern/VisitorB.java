package pub.guoxin.pattern;

/**
 * 具体访问者VisitorB类
 * <p>
 * Created by guoxin on 17-9-29.
 */
public class VisitorB implements Visitor {

    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
