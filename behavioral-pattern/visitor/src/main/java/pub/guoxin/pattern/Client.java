package pub.guoxin.pattern;

/**
 * Created by guoxin on 17-9-29.
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new NodeA());
        objectStructure.add(new NodeB());

        Visitor visitor = new VisitorA();
        objectStructure.action(visitor);
    }
}
