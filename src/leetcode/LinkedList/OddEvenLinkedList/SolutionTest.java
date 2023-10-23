package leetcode.LinkedList.OddEvenLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

    @Test
    void shouldReturnOddEvenLinkedList5() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = solution.oddEvenList(head);

        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }

    @Test
    void shouldReturnOddEvenLinkedList7() {
        Solution solution = new Solution();
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode result = solution.oddEvenList(head);

        assertEquals(2, result.val);
        assertEquals(3, result.next.val);
        assertEquals(6, result.next.next.val);
        assertEquals(7, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next.next);
    }
}
