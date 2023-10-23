package leetcode.LinkedList.PalindromeLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isPalindromeTrue() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        assertTrue(new Solution().isPalindrome(head));
    }

    @Test
    void isPalindromeFalse() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(new Solution().isPalindrome(head));
    }

    @Test
    void isPalindromeTrue1() {
        ListNode head = new ListNode(1);
        assertTrue(new Solution().isPalindrome(head));
    }

    @Test
    void isPalindromeFalse2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        assertFalse(new Solution().isPalindrome(head));
    }

    @Test
    void isPalindromeTrue2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        assertTrue(new Solution().isPalindrome(head));
    }
}
