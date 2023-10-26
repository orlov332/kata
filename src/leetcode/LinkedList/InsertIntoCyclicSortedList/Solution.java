package leetcode.LinkedList.InsertIntoCyclicSortedList;

class Solution {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node node = new Node(insertVal);
            node.next = node;
            return node;
        }

        Node curr = head;
        while (curr.next != head) {
            int curVal = curr.val;
            int nextVal = curr.next.val;
            if (curVal <= nextVal) {
                if (curVal <= insertVal && insertVal <= nextVal) {
                    break;
                }
            } else {
                if (curVal <= insertVal || insertVal <= nextVal) {
                    break;
                }
            }
            curr = curr.next;
        }

        Node node = new Node(insertVal);
        node.next = curr.next;
        curr.next = node;

        return head;
    }
}
