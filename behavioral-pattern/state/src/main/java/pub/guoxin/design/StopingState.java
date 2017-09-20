package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-19.
 */
public class StopingState extends LiftState{

    @Override
    public void open() {
        this.context.setLiftState(Context.OPENING_DOOR);
        this.context.open();
    }

    @Override
    public void close() {
        // do noting
    }

    @Override
    public void run() {
        this.context.setLiftState(Context.RUNNING_LIFT);
        this.context.run();
    }

    @Override
    public void stop() {
        System.out.println("Lift stop");
    }
}
