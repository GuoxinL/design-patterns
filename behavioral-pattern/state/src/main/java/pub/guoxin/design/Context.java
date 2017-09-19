package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-19.
 */
public class Context {
    public static LiftState OPENING_DOOR; // 开门
    public static LiftState CLOSING_DOOR; // 关门
    public static LiftState RUNNING_LIFT; // 电梯运行
    public static LiftState STOPING_LIFT; // 电梯停止

    static {

    }

    public Context(){
        OPENING_DOOR = new OpenningState();
        CLOSING_DOOR = new CloseingState();
        RUNNING_LIFT = new RunningState();
        STOPING_LIFT = new StopingState();
    }

    private LiftState liftState = CLOSING_DOOR;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}
