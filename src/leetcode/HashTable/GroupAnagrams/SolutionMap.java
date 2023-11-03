package leetcode.HashTable.GroupAnagrams;

import java.util.*;

class SolutionMap {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>(strs.length);
        for (String str : strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String groupKey = String.valueOf(ca);
            group.computeIfAbsent(groupKey, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(group.values());
    }
}
