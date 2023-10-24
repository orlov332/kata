package leetcode.LinkedList.FlattenMultilevelDoublyLinkedList;

class Solution {
    public Node flatten(Node head) {
        flatListGetTail(head);
        return head;
    }

    private Node flatListGetTail(Node node) {
        Node tail = node;
        while (node != null) {
            tail = node;
            Node next = node.next;
            if (node.child != null) {
                node.next = node.child;
                node.child.prev = node;
                Node childTail = flatListGetTail(node.child);
                tail = childTail;
                node.child = null;
                childTail.next = next;
                if (next != null) {
                    next.prev = childTail;
                }
            }
            node = next;
        }
        return tail;
    }
}
