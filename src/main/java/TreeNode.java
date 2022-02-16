import java.util.Objects;

/**
 * A simple binary tree with String values.
 */
public class TreeNode {

    private final String value; // Cannot be null
    private TreeNode left; // Can be null
    private TreeNode right; // Can be null

    /**
     * Performs a deep comparison with another TreeNode.
     */
    public boolean deepEquals(TreeNode tn2) {
        return false;  // TODO: Implement
    }

    // -----------------------------------------------------------------------

    /**
     * Shallow comparison only. Returns true if value field is equal.
     * Does not consider left and right fields.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return Objects.equals(value, treeNode.value);
    }

    @Override
    public int hashCode() {
        // Bonus question: Can this be improved?
        return Objects.hash(value);
    }

    // -----------------------------------------------------------------------

    // Constructors, getters, setters

    public TreeNode(String value) {
        // Do not allow null value
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        this.value = value;
    }

    public TreeNode(String value, TreeNode left, TreeNode right) {
        this(value);
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public String getValue() {
        return value;
    }

}
