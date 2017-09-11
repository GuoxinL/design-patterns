package pub.guoxin.design.adapter.wrapper1;

/**
 * Adapter类继承Source类，实现Targetable接口，这样Targetable接口的实现类就具有了Source类的功能。
 * <p>
 * Created by guoxin on 17-9-11.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

}
