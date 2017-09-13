package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-13.
 */
public class Flyweight {

    //内部状态作为成员属性
    private String intrinsicState;

    public Flyweight(String intrinsicState)
    {
        this.intrinsicState = intrinsicState;
    }

    public void operation(String extrinsicState)
    {
    }
}
