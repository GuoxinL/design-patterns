package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public class Storage {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Storage(Memento memento) {
        this.memento = memento;
    }

}
