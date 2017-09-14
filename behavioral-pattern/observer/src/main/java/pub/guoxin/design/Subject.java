package pub.guoxin.design;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoxin on 17-9-14.
 */
public abstract class Subject {

    protected List<Observer> observers = Lists.newArrayList();

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notification();
}
