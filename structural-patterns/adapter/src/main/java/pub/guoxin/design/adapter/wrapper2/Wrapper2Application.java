package pub.guoxin.design.adapter.wrapper2;

/**
 * Created by guoxin on 17-9-11.
 */
public class Wrapper2Application {

    public static void main(String[] args) {
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();
        sourceable1.method1();
        sourceable1.method2();
        sourceable2.method1();
        sourceable2.method2();
    }
}
