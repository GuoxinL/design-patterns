package pub.guoxin.design;
/**
 * 迭代子模式（Iterator）
 * <p>
 * Created by guoxin on 17-9-14.
 */
public class IteratorApplication {

    /**
     * 顾名思义，迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，如果
     * 对集合类比较熟悉的话，理解本模式会十分轻松。这句话包含两层意思：一是需要遍历
     * 的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
     *
     * @param args
     */
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}