package leetcode.LinkedList.CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

class SolutionRecursive {
    public Node copyRandomList(Node head) {
        Map<Node, Node> visited = new HashMap<>();
        return copyRandomList(head, visited);
    }

    private Node copyRandomList(Node node, Map<Node, Node> visited) {
        if (node == null) {
            return null;
        }
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node newNode = new Node(node.val);
        visited.put(node, newNode);
        newNode.next = copyRandomList(node.next, visited);
        newNode.random = copyRandomList(node.random, visited);
        return newNode;
    }
}
