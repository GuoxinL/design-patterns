package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-14.
 */
public class MementoApplication {

    public static void main(String[] args) {
        Original original = new Original("egg");
        Storage storage = new Storage(original.createMemento());
        System.out.println("初始化柱状图为：" + original.getValue());
        original.setValue("niu");
        System.out.println("修改后的状态为：" + original.getValue());
        // 回复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + original.getValue());
    }

}
