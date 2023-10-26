package leetcode.LinkedList.InsertIntoCyclicSortedList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Timeout(value = 1, unit = TimeUnit.SECONDS)
class SolutionTest {

    @Test
    void insert() {
        Solution solution = new Solution();
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = head;

        Node node = solution.insert(head, 2);

        assertEquals(3, node.val);
        assertEquals(4, node.next.val);
        assertEquals(1, node.next.next.val);
        assertEquals(2, node.next.next.next.val);
        assertEquals(3, node.next.next.next.next.val);
        assertEquals(4, node.next.next.next.next.next.val);
        assertEquals(1, node.next.next.next.next.next.next.val);
        assertEquals(2, node.next.next.next.next.next.next.next.val);
        assertEquals(3, node.next.next.next.next.next.next.next.next.val);
        assertEquals(4, node.next.next.next.next.next.next.next.next.next.val);
    }

    @Test
    void insert1() {
        Solution solution = new Solution();
        Node head = new Node(3);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = head;

        Node node = solution.insert(head, 0);

        assertEquals(3, node.val);
        assertEquals(3, node.next.val);
        assertEquals(5, node.next.next.val);
        assertEquals(0, node.next.next.next.val);
        assertEquals(3, node.next.next.next.next.val);
        assertEquals(3, node.next.next.next.next.next.val);
        assertEquals(5, node.next.next.next.next.next.next.val);
        assertEquals(0, node.next.next.next.next.next.next.next.val);
    }

    @Test
    void insert0() {
        Solution solution = new Solution();
        Node head = new Node(1);
        head.next = head;

        Node node = solution.insert(head, 0);

        assertEquals(1, node.val);
        assertEquals(0, node.next.val);
        assertEquals(1, node.next.next.val);
        assertEquals(0, node.next.next.next.val);
    }
}
