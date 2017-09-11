package pub.guoxin.design.factory;

/**
 * Created by guoxin on 17-9-8.
 */
public class SendFactory {

    public static Sender produceMailStatic() {
        return new MailSender();
    }

    public static Sender produceSmsStatic() {
        return new SmsSender();
    }

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            throw new RuntimeException("请输入正确类型");
        }
    }

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
