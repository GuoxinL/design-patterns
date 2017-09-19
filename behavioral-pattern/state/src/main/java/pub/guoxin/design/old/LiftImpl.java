package pub.guoxin.design.old;

/**
 *
 * Created by guoxin on 17-9-19.
 */
public class LiftImpl extends Lift{
    private int state;

    public LiftImpl() {
        this.state = STOPING_LIFT;
    }
    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_DOOR:
                break;
            case CLOSING_DOOR:
                this.setState(OPENING_DOOR);
                break;
            case RUNNING_LIFT: // 电梯正在运行不能开门
                // do noting
                break;
            case STOPING_LIFT:
                this.setState(OPENING_DOOR);
                break;
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_DOOR:
                this.setState(CLOSING_DOOR);
                break;
            case CLOSING_DOOR:
                // do noting
                break;
            case RUNNING_LIFT: // 电梯正在运行不能开门
                // do noting
                break;
            case STOPING_LIFT:
                // do noting
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_DOOR:
                break;
            case CLOSING_DOOR:
                this.setState(RUNNING_LIFT);
                break;
            case RUNNING_LIFT: // 电梯正在运行不能开门
                // do noting
                break;
            case STOPING_LIFT:
                this.setState(RUNNING_LIFT);
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_DOOR:
                break;
            case CLOSING_DOOR:
                this.setState(STOPING_LIFT);
                break;
            case RUNNING_LIFT: // 电梯正在运行不能开门
                this.setState(STOPING_LIFT);
                break;
            case STOPING_LIFT:
                break;
        }
    }
}
