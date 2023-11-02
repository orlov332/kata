package leetcode.HashTable.MinimumIndexSumOfTwoLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list1Map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            list1Map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (list1Map.containsKey(list2[i])) {
                int sum = i + list1Map.get(list2[i]);
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[i]);
                } else if (sum == minSum) {
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
