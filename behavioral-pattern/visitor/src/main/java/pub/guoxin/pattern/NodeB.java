package pub.guoxin.pattern;

/**
 * Created by guoxin on 17-9-29.
 */
public class NodeB extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "NodeB";
    }
}
