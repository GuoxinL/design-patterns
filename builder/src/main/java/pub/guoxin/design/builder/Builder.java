package pub.guoxin.design.builder;


import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by guoxin on 17-9-9.
 */
public class Builder {

    private List<Sender> list = Lists.newArrayList();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
