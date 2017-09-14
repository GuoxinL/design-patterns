package pub.guoxin.design;

/**
 * 观察者模式
 * <p>
 * Created by guoxin on 17-9-14.
 */
public class ObserverApplication {

    /**
     * 软件系统：一个对象的状态或行为的变化将导致其他对象的状态或行为也发生改变，它们之间将产生联动
     * 观察者模式：
     * 定义了对象之间一种一对多的依赖关系，让一个对象的改变能够影响其他对象
     * 发生改变的对象称为观察目标，被通知的对象称为观察者
     * 一个观察目标可以对应多个观察者
     * <p>
     * 别名：
     * 发布-订阅(Publish/Subscribe)模式
     * 模型-视图(Model/View)模式
     * 源-监听器(Source/Listener)模式
     * 从属者(Dependents)模式
     *
     * @param args
     */
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreateObserver();
        Observer observer2 = new ConcreateObserver();
        Observer observer3 = new ConcreateObserver();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.notification();
    }
}
