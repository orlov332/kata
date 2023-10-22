package leetcode.LinkedList.IntersectionTwoLinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getIntersectionNode() {
        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = new ListNode(8);
        listA.next.next.next = new ListNode(4);
        listA.next.next.next.next = new ListNode(5);

        ListNode listB = new ListNode(5);
        listB.next = new ListNode(6);
        listB.next.next = new ListNode(1);
        listB.next.next.next = listA.next.next;

        Solution solution = new Solution();
        ListNode intersectionNode = solution.getIntersectionNode(listA, listB);

        assertEquals(8, intersectionNode.val);
    }
}
