package pub.guoxin.design.main;

import pub.guoxin.design.SendFactory;
import pub.guoxin.design.Sender;

/**
 * Created by guoxin on 17-9-8.
 */
public class OrdinaryFactoryApplication {
    /**
     * 普通工厂方法，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
     *
     * @param args
     */
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sms = sendFactory.produce("smss");
        sms.send();
    }
}
