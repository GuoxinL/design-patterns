package pub.guoxin.design;

/**
 * 电梯门开启状态
 * Created by guoxin on 17-9-19.
 */
public class OpenningState extends LiftState{
    @Override
    public void open() {
        System.out.println("Lift open");
    }

    @Override
    public void close() {
        this.context.setLiftState(Context.CLOSING_DOOR);
        this.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
