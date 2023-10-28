package leetcode.LinkedList.RotateList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;

        ListNode tail = head;
        ListNode newTail = head;
        int shiftLeg = k;
        int lenght = 1;
        while (tail.next != null) {
            if (shiftLeg > 0) {
                shiftLeg--;
            } else {
                newTail = newTail.next;
            }
            tail = tail.next;
            lenght++;
        }
        if (shiftLeg > 0) {
            shiftLeg = k % lenght;

            if (shiftLeg == 0) return head;

            shiftLeg--;
            while (shiftLeg > 0) {
                newTail = newTail.next;
                shiftLeg--;
            }
        }
        tail.next = head;
        head = newTail.next;
        newTail.next = null;

        return head;
    }
}
