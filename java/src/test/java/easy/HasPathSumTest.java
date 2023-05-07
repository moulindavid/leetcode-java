package easy;

import static org.assertj.core.api.Assertions.assertThat;

import model.TreeNode;
import org.junit.jupiter.api.Test;

class HasPathSumTest {

    @Test
    void hasPathSum() {
        //[5,4,8,11,null,13,4,7,2,null,null,null,1]
        //22

        assertThat(HasPathSum.hasPathSum(
                new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                        new TreeNode(8,
                                new TreeNode(13),
                                new TreeNode(4, null,
                                        new TreeNode(1)))), 22)).isTrue();

        assertThat(HasPathSum.hasPathSum(
                new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                        new TreeNode(8,
                                new TreeNode(13),
                                new TreeNode(4, null,
                                        new TreeNode(1)))), 55)).isFalse();

        assertThat(HasPathSum.hasPathSum(
                new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                        new TreeNode(8,
                                new TreeNode(13),
                                new TreeNode(4, null,
                                        new TreeNode(1)))), 26)).isTrue();
    }
}