package pub.guoxin.design.factory;

/**
 * 抽象
 * 名词: 抽象, 摘要, 文摘, 提要, 撮要, 大要
 * 动词: 提取, 提炼, 抽炼, 提出物
 * 形容词: 抽象的


 * Created by guoxin on 17-9-9.
 */
public class AbstractFactoryApplication {

    /**
     * 其实这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则
     * 只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider
     * 接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
     *
     * @param args
     */
    public static void main(String[] args) {
        Provider mailFactory = new SendMailFactory();
        Sender sender = mailFactory.produce();
        sender.send();

        SendSmsFactory smsFactory = new SendSmsFactory();
        Sender produce = smsFactory.produce();
        produce.send();

    }
}
