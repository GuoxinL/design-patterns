package pub.guoxin.design;

import java.util.Vector;

/**
 * Created by guoxin on 17-9-13.
 */
public class Tree {
    private TreeNode root;

    public Tree(String name) {
        root = new TreeNode(name);

    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
