package leetcode.QueueStack.DesignCircularQueue;

class MyCircularQueue {

    private final int[] queue;
    private final int capacity;

    private int head = 0;
    private int tail = -1;

    public MyCircularQueue(int k) {
        capacity = k;
        queue = new int[capacity];
    }

    private int nextIndex(int index) {
        return (index + 1) % capacity;
    }


    public boolean enQueue(int value) {
        if (!isFull()) {
            tail = nextIndex(tail);
            queue[tail] = value;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            if (head == tail) {
                head = 0;
                tail = -1;
            } else
                head = nextIndex(head);
            return true;
        }
        return false;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[head];
    }

    public int Rear() {
        return isEmpty() ? -1 : queue[tail];
    }

    public boolean isEmpty() {
        return tail < 0;
    }

    public boolean isFull() {
        return !isEmpty() && nextIndex(tail) == head;
    }
}
