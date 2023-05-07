package medium;

import model.ListNode;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeInLinkList {
    private DeleteNodeInLinkList() {
    }

    public static void deleteNode(ListNode node) {
        //We replace current node value and next pointer to the next node.
        ListNode nextNode = node.next;
        node.next = nextNode.next;
        node.val = nextNode.val;
    }
}
