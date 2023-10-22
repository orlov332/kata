package leetcode.LinkedList.LinkedListCycleII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void detectCycle() {
        Solution solution = new Solution();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        ListNode result = solution.detectCycle(head);

        assertEquals(2, result.val);
    }
}
