package leetcode.LinkedList.CopyListWithRandomPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void copyRandomList() {
        Solution solution = new Solution();
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);

        head.random = head.next.next.next;
        head.next.random = head.next.next.next.next;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        Node copy = solution.copyRandomList(head);

        assertEquals(7, copy.val);
        assertEquals(10, copy.random.val);
        assertEquals(13, copy.next.val);
        assertEquals(1, copy.next.random.val);
        assertEquals(11, copy.next.next.val);
        assertEquals(10, copy.next.next.random.val);
        assertEquals(10, copy.next.next.next.val);
        assertEquals(11, copy.next.next.next.random.val);
        assertEquals(1, copy.next.next.next.next.val);
        assertEquals(7, copy.next.next.next.next.random.val);
    }
}
