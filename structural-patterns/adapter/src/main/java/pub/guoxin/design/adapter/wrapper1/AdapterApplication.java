package pub.guoxin.design.adapter.wrapper1;

/**
 * Created by guoxin on 17-9-11.
 */
public class AdapterApplication {

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
