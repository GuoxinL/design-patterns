package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-13.
 */
public class TreeApplication {

    /**
     * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
     * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
     * @param args
     */
    public static void main(String[] args) {
        Tree tree = new Tree("root");
        TreeNode treeNode = new TreeNode("A");
        TreeNode treeNode1 = new TreeNode("B");

        tree.getRoot().add(treeNode);
        tree.getRoot().add(treeNode1);
    }
}
