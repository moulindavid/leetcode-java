package medium;

import static org.assertj.core.api.Assertions.assertThat;

import model.ListNode;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndTest {

    @Test
    void removeNthFromEnd() {
        //[1,2,3,4,5]
        //2
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(RemoveNthNodeFromEnd.removeNthFromEnd(node, 2).next.next.next.val).isEqualTo(5);
    }

    @Test
    void removeNthFromEnd_1() {
        //[1]
        //1
        ListNode node = new ListNode(1);
        assertThat(RemoveNthNodeFromEnd.removeNthFromEnd(node, 1)).isNull();
    }

}