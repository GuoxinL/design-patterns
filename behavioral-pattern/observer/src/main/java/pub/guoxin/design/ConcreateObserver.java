package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public class ConcreateObserver implements Observer {
    @Override
    public void update() {
        System.out.println("con create observer");
    }
}
