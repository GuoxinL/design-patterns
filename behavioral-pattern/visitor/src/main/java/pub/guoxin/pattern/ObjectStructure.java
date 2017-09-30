package pub.guoxin.pattern;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by guoxin on 17-9-29.
 */
public class ObjectStructure {

    private List<Node> nodes = Lists.newArrayList();

    public void action(Visitor visitor) {
        for (Node node : nodes) {
            node.accept(visitor);
        }
    }

    public void add(Node node) {
        nodes.add(node);
    }
}
