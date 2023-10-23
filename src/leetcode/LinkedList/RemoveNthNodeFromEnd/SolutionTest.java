package leetcode.LinkedList.RemoveNthNodeFromEnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

    @Test
    void shouldRemoveNthFromEnd() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = solution.removeNthFromEnd(head, 2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }

    @Test
    void shouldRemoveLastNode() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);

        ListNode result = solution.removeNthFromEnd(head, 1);

        assertNull(result);
    }

    @Test
    void shouldRemoveFirstNode() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode result = solution.removeNthFromEnd(head, 2);

        assertEquals(2, result.val);
        assertNull(result.next);
    }

    @Test
    void shouldRemoveLastOfTwoNodes() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode result = solution.removeNthFromEnd(head, 1);

        assertEquals(1, result.val);
        assertNull(result.next);
    }
}
