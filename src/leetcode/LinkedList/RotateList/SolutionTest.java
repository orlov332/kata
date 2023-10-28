package leetcode.LinkedList.RotateList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

    @Test
    void rotateRight() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = solution.rotateRight(head, 2);

        assertEquals(4, result.val);
        assertEquals(5, result.next.val);
        assertEquals(1, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(3, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }


    @Test
    void rotateRight2() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode result = new Solution().rotateRight(head, 4);

        assertEquals(2, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void rotateRight5() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode result = new Solution().rotateRight(head, 2000000000);

        assertEquals(2, result.val);
        assertEquals(3, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void rotateRight3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode result = new Solution().rotateRight(head, 2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    void rotateRight4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode result = new Solution().rotateRight(head, 3);

        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }
}
