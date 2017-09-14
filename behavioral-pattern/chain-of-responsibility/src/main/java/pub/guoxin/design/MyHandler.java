package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + " deal!");

        if (getHandler() != null){
            getHandler().operator();
        }
    }
}
