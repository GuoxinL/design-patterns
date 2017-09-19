package pub.guoxin.design;

/**
 * 电梯运行状态
 * <p>
 * Created by guoxin on 17-9-19.
 */
public class RunningState extends LiftState {

    @Override
    public void open() {
        // do noting
    }

    @Override
    public void close() {
        // do noting
    }

    @Override
    public void run() {
        System.out.println("Lift run");
    }

    @Override
    public void stop() {
        this.context.setLiftState(Context.STOPING_LIFT);
        this.context.stop();
    }

}
