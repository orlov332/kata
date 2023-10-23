package leetcode.LinkedList.ReverseLinkedList;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode resultHead = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = resultHead;
            resultHead = current;
            current = next;
        }

        return resultHead;
    }
}
