/**
 * A simple binary tree with String values.
 */
public class TreeNode {

    private final String contents; // Cannot be null

    private TreeNode left;
    private TreeNode right;

    /**
     * Performs a deep comparison with another TreeNode.
     */
    public boolean deepCompare(TreeNode tn2) {
        return this.contents.equals(tn2.contents) &&
                (((this.left == null) && (tn2.left == null)) ||
                        (((this.left != null)) && this.left.deepCompare(tn2.left))) &&
                (((this.right == null) && (tn2.right == null)) ||
                        (((this.right != null)) && this.right.deepCompare(tn2.right)));
    }

    // -----------------------------------------------------------------------

    public TreeNode(String contents) {
        // Do not allow null value
        if (contents == null) {
            throw new IllegalArgumentException("Contents cannot be null");
        }
        this.contents = contents;
    }

    public TreeNode(String contents, TreeNode left, TreeNode right) {
        this(contents);
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public String getContents() {
        return contents;
    }
}
