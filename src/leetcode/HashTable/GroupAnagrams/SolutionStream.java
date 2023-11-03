package leetcode.HashTable.GroupAnagrams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SolutionStream {

    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> {
                    char[] ca = str.toCharArray();
                    Arrays.sort(ca);
                    return String.valueOf(ca);
                })).values().stream().toList();
    }
}
