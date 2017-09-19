package pub.guoxin.design.factory.main;

import pub.guoxin.design.factory.SendFactory;

/**
 * 多工厂
 * Created by guoxin on 17-9-8.
 */
public class MultipleFactoryApplication {

    /**
     * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果
     * 传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方
     * 法，分别创建对象。
     *
     * @param args
     */
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        sendFactory.produceMail().send();
        sendFactory.produceSms().send();

    }
}
