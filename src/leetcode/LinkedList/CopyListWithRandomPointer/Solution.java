package leetcode.LinkedList.CopyListWithRandomPointer;

class Solution {

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        current = head;
        while (current != null) {
            current.next.random = current.random == null ? null : current.random.next;
            current = current.next.next;
        }

        current = head;
        Node newHead = head.next;
        Node newCurrent = newHead;
        while (current != null) {
            current.next = current.next.next;
            current = current.next;
            newCurrent.next = current == null ? null : current.next;
            newCurrent = newCurrent.next;
        }

        return newHead;
    }
}
