package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public class ConcreteSubject extends Subject {

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //实现通知方法
    public void notification() {
        // 遍历观察者集合，调用每一个观察者的响应方法
        for (Observer observers : observers) {
            observers.update();
        }
    }
}
