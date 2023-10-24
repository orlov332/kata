package leetcode.LinkedList.AddTwoNumbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode beforeHead = new ListNode();
        ListNode current = beforeHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);

            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return beforeHead.next;
    }

}
