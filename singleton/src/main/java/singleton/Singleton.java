package singleton;

/**
 * 懒汉式，非线程安全
 * Created by guoxin on 17-9-9.
 */
public class Singleton {

    /**
     * 持有私有静态实例防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static Singleton instance = null;

    private Singleton() {

    }

    /**
     * 懒汉式，非线程安全
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public Object readResolve() {
        return instance;
    }
}
