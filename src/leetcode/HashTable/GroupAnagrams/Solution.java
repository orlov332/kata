package leetcode.HashTable.GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>(strs.length);
        for (String str : strs) {
            int[] letterCountMap = new int[26];
            for (char letter : str.toCharArray()) letterCountMap[letter - 'a']++;
            StringBuilder groupKey = new StringBuilder();
            for (int letterCount : letterCountMap) {
                groupKey.append(letterCount);
                groupKey.append('#');
            }
            group.computeIfAbsent(groupKey.toString(), k -> new ArrayList<>()).add(str);
        }
        return List.copyOf(group.values());
    }
}
