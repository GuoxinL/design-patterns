package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-9.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
