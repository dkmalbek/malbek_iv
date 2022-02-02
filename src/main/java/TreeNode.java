import com.sun.source.tree.Tree;

public class TreeNode {
    private String contents;
    private TreeNode left;
    private TreeNode right;

    public boolean deepCompare(TreeNode tn2) {
       // TODO
        return false;
    }

    public TreeNode(String contents) {
        this.contents = contents;
    }

    public TreeNode(String contents, TreeNode left, TreeNode right) {
        this.contents = contents;
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
