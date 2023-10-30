package leetcode.HashTable.DesignHashSet;

import java.util.LinkedList;

class MyHashSet {

    private final int capacity = 13337;

    private final Bucket[] buckets = new Bucket[capacity];

    public MyHashSet() {
    }

    public void add(int key) {
        int bucketIndex = hash(key);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new Bucket(key);
        } else {
            buckets[bucketIndex].insert(key);
        }
    }

    public void remove(int key) {
        int bucketIndex = hash(key);
        if (buckets[bucketIndex] != null) {
            buckets[bucketIndex].delete(key);
        }
    }

    public boolean contains(int key) {
        int bucketIndex = hash(key);
        return buckets[bucketIndex] != null && buckets[bucketIndex].exists(key);
    }

    private int hash(int key) {
        return key % capacity;
    }
}

class Bucket {
    private final LinkedList<Integer> container = new LinkedList<>();

    public Bucket(Integer key) {
        insert(key);
    }

    public void insert(Integer key) {
        int index = container.indexOf(key);
        if (index == -1) {
            container.addFirst(key);
        }
    }

    public void delete(Integer key) {
        container.remove(key);
    }

    public boolean exists(Integer key) {
        int index = container.indexOf(key);
        return (index != -1);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
