package leetcode.LinkedList.FlattenMultilevelDoublyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void flatten() {
        Solution solution = new Solution();
        Node node = new Node(1);
        node.child = new Node(2);
        node.child.child = new Node(3);

        Node res = solution.flatten(node);

        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
        assertEquals(3, res.next.next.val);
    }
}
