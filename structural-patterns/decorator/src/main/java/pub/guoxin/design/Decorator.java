package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-11.
 */
public class Decorator implements Sourceable{

    private  Sourceable sourceable;

    public Decorator(Sourceable sourceable){
        super();
        this.sourceable = sourceable;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
