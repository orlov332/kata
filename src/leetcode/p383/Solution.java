package leetcode.p383;

import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Integer, Long> magazineMap = magazine.chars()
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return ransomNote.chars()
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .allMatch(entry -> magazineMap.getOrDefault(entry.getKey(), 0L) >= entry.getValue());
    }
}
