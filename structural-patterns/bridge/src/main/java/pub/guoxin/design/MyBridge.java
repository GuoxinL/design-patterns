package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-11.
 */
public class MyBridge extends Bridge{

    @Override
    public void method() {
        getSource().method();
    }
}
