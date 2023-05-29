package medium;

import model.ListNode;

/**
 * https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 */
public class DeleteMiddleNodeInLinkList {
    private DeleteMiddleNodeInLinkList() {
    }
    //⌊n / 2⌋th = middle node.
    public static ListNode deleteMiddle(ListNode head) {
        if (head.next == null){
            return null;
        }
        //Fast pointer need to iterate twice as fast.
        ListNode slowNode = head;
        ListNode fastNode = head.next.next;
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        slowNode.next = slowNode.next.next;
        return head;
    }
}
