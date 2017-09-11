package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-11.
 */
public class BridgeApplication {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        bridge.setSource(source1);
        bridge.method();

        bridge.setSource(source2);
        bridge.method();
    }

}
