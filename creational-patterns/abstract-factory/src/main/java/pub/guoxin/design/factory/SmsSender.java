package pub.guoxin.design.factory;

/**
 * Created by guoxin on 17-9-8.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender");
    }
}
