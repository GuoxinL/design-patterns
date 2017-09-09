package pub.guoxin.design.singleton;

/**
 * Created by guoxin on 17-9-9.
 */
public class Singleton2 {

    /**
     * 持有私有静态实例防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static Singleton2 instance = null;

    private Singleton2() {

    }

    /**
     * 但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下
     * 降，因为每次调用getInstance()，都要对对象上锁，事实上，只有在第一次创
     * 建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进。{@link Singleton2}
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        synchronized (instance) {
            if (instance == null) {
                instance = new Singleton2();
            }
        }
        return instance;
    }


    public Object readResolve() {
        return instance;
    }
}
