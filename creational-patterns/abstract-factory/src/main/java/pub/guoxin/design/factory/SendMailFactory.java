package pub.guoxin.design.factory;

/**
 * Created by guoxin on 17-9-8.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }

}
