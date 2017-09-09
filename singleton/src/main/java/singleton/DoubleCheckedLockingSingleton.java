package singleton;

/**
 * 双重锁
 * Created by guoxin on 17-9-9.
 */
public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance = null;

    private DoubleCheckedLockingSingleton() {
        //do something
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
