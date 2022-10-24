package medium;

import static org.assertj.core.api.Assertions.assertThat;

import model.ListNode;
import org.junit.jupiter.api.Test;


class DeleteMiddleNodeInLinkListTest {

    @Test
    void deleteMiddle() {
        //[1,2,3,4,5]
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(DeleteMiddleNodeInLinkList.deleteMiddle(node).next.next.val).isEqualTo(4);
    }
}
