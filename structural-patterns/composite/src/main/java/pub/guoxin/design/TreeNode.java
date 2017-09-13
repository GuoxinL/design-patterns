package pub.guoxin.design;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by guoxin on 17-9-13.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public void add(TreeNode node){
        children.add(node);
    }

    public void remove(TreeNode node){
        children.remove(node);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }
}
