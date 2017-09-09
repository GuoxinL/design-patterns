package pub.guoxin.design.builder;

/**
 * Created by guoxin on 17-9-9.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MailSender");
    }
}
