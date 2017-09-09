package singleton;

/**
 * 内部类
 * Created by guoxin on 17-9-9.
 */
public class Singleton3 {

    /**
     * 私有化构造方法，防止实例化
     */
    private Singleton3() {

    }

    /**
     * 但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下
     * 降，因为每次调用getInstance()，都要对对象上锁，事实上，只有在第一次创
     * 建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进。{@link Singleton3}
     *
     * @return
     */
    public static Singleton3 getInstance() {
        return SingletonFactory.instance;
    }

    public Object readResolve() {
        return getInstance();
    }

    private static class SingletonFactory {
        private static Singleton3 instance = new Singleton3();
    }

}
