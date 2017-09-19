package pub.guoxin.design;

/**
 * 电梯门关闭
 * <p>
 * Created by guoxin on 17-9-19.
 */
public class CloseingState extends LiftState {
    @Override
    public void open() {
        this.context.setLiftState(Context.OPENING_DOOR);
        this.context.open();
    }

    @Override
    public void close() {
        System.out.println("Lift close");
    }

    @Override
    public void run() {
        this.context.setLiftState(Context.RUNNING_LIFT);
        this.context.run();
    }

    @Override
    public void stop() {
        this.context.setLiftState(Context.STOPING_LIFT);
    }
}
