import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTreeNodeDeepCompare {

    @Test
    public void testEquals() {
        assertTrue(testTree1().deepCompare(testTree1()));
    }

    @Test
    public void testNotEquals() {
        assertFalse(testTree1().deepCompare(testTree2()));
    }

    // Todo additional tests?

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
