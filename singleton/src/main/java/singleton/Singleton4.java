package singleton;

/**
 * 双重锁
 * Created by guoxin on 17-9-9.
 */
public class Singleton4 {

    private static volatile Singleton4 instance = null;

    private Singleton4() {
        //do something
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
