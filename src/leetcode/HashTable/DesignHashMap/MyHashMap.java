package leetcode.HashTable.DesignHashMap;


class MyHashMap {

    private final int capacity = 13337;

    private final Bucket[] buckets = new Bucket[capacity];

    public void put(int key, int value) {
        int bucketIndex = hash(key);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new Bucket(key, value);
        } else {
            buckets[bucketIndex].put(key, value);
        }
    }

    public int get(int key) {
        int bucketIndex = hash(key);
        return buckets[bucketIndex] != null ? buckets[bucketIndex].get(key) : -1;
    }

    public void remove(int key) {
        int bucketIndex = hash(key);
        if (buckets[bucketIndex] != null) {
            buckets[bucketIndex].delete(key);
        }
    }

    private int hash(int key) {
        return key % capacity;
    }
}

class EntryNode {
    int key;
    int val;
    EntryNode next;

    EntryNode(int key, int val, EntryNode next) {
        this.key = key;
        this.val = val;
        this.next = next;
    }
}

class Bucket {

    private EntryNode head;

    public Bucket(Integer key, int value) {
        put(key, value);
    }

    public void put(Integer key, int value) {
        EntryNode node = head;
        while (node != null) {
            if (node.key == key) {
                node.val = value;
                return;
            }
            node = node.next;
        }
        head = new EntryNode(key, value, head);
    }

    public void delete(int key) {
        EntryNode node = head;
        EntryNode prev = null;
        while (node != null) {
            if (node.key == key) {
                if (prev == null) head = node.next;
                else prev.next = node.next;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    public int get(int key) {
        EntryNode node = head;
        while (node != null) {
            if (node.key == key) return node.val;
            node = node.next;
        }
        return -1;
    }
}
