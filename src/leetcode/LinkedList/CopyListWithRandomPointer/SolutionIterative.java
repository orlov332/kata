package leetcode.LinkedList.CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

class SolutionIterative {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> visited = new HashMap<>();

        Node current = head;
        while (current != null) {
            Node newNode = visited.computeIfAbsent(current, this::newNode);
            if (current.random != null)
                newNode.random = visited.computeIfAbsent(current.random, this::newNode);
            if (current.next != null)
                newNode.next = visited.computeIfAbsent(current.next, this::newNode);
            current = current.next;
        }
        return visited.get(head);
    }

    private Node newNode(Node node) {
        return new Node(node.val);
    }
}
