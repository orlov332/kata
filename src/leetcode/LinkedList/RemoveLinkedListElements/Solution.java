package leetcode.LinkedList.RemoveLinkedListElements;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        ListNode prev = null;

        while (node != null) {
            if (node.val == val) {
                if (prev == null) {
                    head = head.next;
                } else {
                    prev.next = node.next;
                }
            } else {
                prev = node;
            }
            node = node.next;
        }

        return head;
    }
}
