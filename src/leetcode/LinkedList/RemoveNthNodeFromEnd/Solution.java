package leetcode.LinkedList.RemoveNthNodeFromEnd;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int leg = n;
        while (fast != null) {
            if (leg >= 0) {
                leg--;
            } else {
                slow = slow.next;
            }
            fast = fast.next;
        }
        if (slow == head && leg == 0) {
            return head.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
