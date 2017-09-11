package pub.guoxin.design.adapter.wrapper1;

/**
 * Created by guoxin on 17-9-11.
 */
public class WrapperApplication {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method2();
        targetable.method1();
    }
}
