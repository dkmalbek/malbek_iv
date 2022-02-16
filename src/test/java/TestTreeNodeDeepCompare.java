import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTreeNodeDeepCompare {

    @Test
    // Verify that two identical trees are equal
    public void testDeepEquals() {
        assertTrue(testTree1().deepEquals(testTree1()));
        assertFalse(testTree1().deepEquals(testTree2()));
    }

    // TODO: What additional tests would be helpful

    // Utility methods to create TreeNode trees

    private static TreeNode testTree1() {
        return new TreeNode(
                "a",
                new TreeNode("b",
                        new TreeNode("y"),
                        new TreeNode("z")),
                new TreeNode("c"));
    }

    private static TreeNode testTree2() {
        return new TreeNode(
                "a",
                new TreeNode("b",
                        new TreeNode("y"),
                        new TreeNode("q")),
                new TreeNode("c"));
    }

}
