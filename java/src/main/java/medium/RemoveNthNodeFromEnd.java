package medium;

import model.ListNode;

public class RemoveNthNodeFromEnd {
    private RemoveNthNodeFromEnd() {
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode();

        node.next = head;
        ListNode slowNode = node;
        ListNode fastNode = node;

        // fastNode is ahead of slowNode by n - 1.
        for (int i = 1; i <= n; i++) {
            fastNode = fastNode.next;
        }

        //Once fastNode reach the end we stop and remove the slowNode.next node who will be the Nth from end.
        while (fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        //slowNode.next is the value we want to skip.
        //slowNode.next.next is nullable.
        slowNode.next = slowNode.next.next;

        //Return head.
        return node.next;
    }
}





