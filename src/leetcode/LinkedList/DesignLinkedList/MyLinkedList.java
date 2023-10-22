package leetcode.LinkedList.DesignLinkedList;

class MyLinkedList {

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;

    public MyLinkedList() {

    }

    public int get(int index) {
        Node node = this.head;
        while (node != null) {
            if (index == 0) {
                return node.val;
            }
            node = node.next;
            index--;
        }
        return -1;
    }

    public void addAtHead(int val) {
        this.head = new Node(val, this.head);
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public void addAtIndex(int index, int val) {
        Node node = this.head;
        Node prev = null;
        while (node != null) {
            if (index == 0) {
                break;
            }
            prev = node;
            node = node.next;
            index--;
        }
        if (node != null || index == 0) {
            Node newNode = new Node(val, node);
            if (prev != null) {
                prev.next = newNode;
            } else {
                this.head = newNode;
            }
        }
    }

    public void deleteAtIndex(int index) {
        Node node = this.head;
        Node prev = null;
        while (node != null) {
            if (index == 0) {
                break;
            }
            prev = node;
            node = node.next;
            index--;
        }
        if (node != null) {
            if (prev != null) {
                prev.next = node.next;
            } else {
                this.head = node.next;
            }
        }
    }
}
