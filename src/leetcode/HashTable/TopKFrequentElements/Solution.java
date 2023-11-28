package leetcode.HashTable.TopKFrequentElements;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        var frequencies = new HashMap<Integer, Integer>(nums.length);
        for (int num : nums) {
            frequencies.compute(num, (key, value) -> value == null ? 0 : value + 1);
        }

        var queue = new PriorityQueue<Integer>(frequencies.size(), Comparator.comparingInt(frequencies::get));
        for (Integer num : frequencies.keySet()) {
            queue.add(num);
            if (queue.size() > k)
                queue.poll();
        }

        int[] top = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            top[i] = queue.poll();
        }
        return top;
    }
}
