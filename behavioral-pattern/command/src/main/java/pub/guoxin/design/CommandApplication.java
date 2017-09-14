package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public class CommandApplication {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
