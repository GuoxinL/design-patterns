package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-20.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        context.open();
        context.close();
        context.run();
        context.close();
    }
}
