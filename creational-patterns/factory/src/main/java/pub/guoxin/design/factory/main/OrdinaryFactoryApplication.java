package pub.guoxin.design.factory.main;

import pub.guoxin.design.factory.SendFactory;
import pub.guoxin.design.factory.Sender;

/**
 * 普通
 * 形容词:普通, 一般, 通常, 平凡, 正常, 平常, 寻常, 凡, 等闲, 庶, 庸, 便, 鄙, 简单的
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
