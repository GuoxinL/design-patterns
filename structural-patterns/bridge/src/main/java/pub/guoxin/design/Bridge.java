package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-11.
 */
public class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

}
