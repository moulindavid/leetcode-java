package medium;

import static org.assertj.core.api.Assertions.assertThat;

import model.ListNode;
import org.junit.jupiter.api.Test;

class DeleteNodeInLinkListTest {

    @Test
    void deleteNode() {
        //[4,5,1,9]
        //5
        ListNode node5 = new ListNode(5, new ListNode(1, new ListNode(9)));
        ListNode node = new ListNode(4, node5 );
        DeleteNodeInLinkList.deleteNode(node5);
        assertThat(node.next.val).isEqualTo(1);
    }

}