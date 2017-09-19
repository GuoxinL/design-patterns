package pub.guoxin.design.old;

/**
 * Created by guoxin on 17-9-19.
 */
public abstract class Lift {
    public static final int OPENING_DOOR = 0; // 开门
    public static final int CLOSING_DOOR = 1; // 关门
    public static final int RUNNING_LIFT = 2; // 电梯运行
    public static final int STOPING_LIFT = 3; // 电梯停止

    //设置电梯的状态
    public abstract void setState(int state);

    public abstract void open(); // 开门
    public abstract void close(); //关门

    public abstract void run(); //电梯电梯
    public abstract void stop(); //停止电梯
}
