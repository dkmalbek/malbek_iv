/**
 * A simple binary tree with String values.
 */
public class TreeNode {
    private String contents;
    private TreeNode left;
    private TreeNode right;

    /**
     * Performs a deep comparison with another TreeNode.
     */
    public boolean deepCompare(TreeNode tn2) {

        return false; // TODO: Implement
    }

    // -----------------------------------------------------------------------

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
