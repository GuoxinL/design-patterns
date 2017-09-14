package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exec();
    }
}
