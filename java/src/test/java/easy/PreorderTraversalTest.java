package easy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;

import model.TreeNode;
import org.junit.jupiter.api.Test;

class PreorderTraversalTest {

    @Test
    void preorderTraversal() {
        List<Integer> preorderedTraversal = PreorderTraversal.preorderTraversal(
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3, null, null),
                                null),
                        null));

        assertThat(preorderedTraversal).isEqualTo(List.of(1,2,3));
    }
}