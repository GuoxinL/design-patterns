package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-11.
 */
public class ProxyApplication {

    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
