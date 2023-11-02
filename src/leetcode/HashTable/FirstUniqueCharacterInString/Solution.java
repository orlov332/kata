package leetcode.HashTable.FirstUniqueCharacterInString;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> occuranceMap = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            occuranceMap.compute(c, (key, value) -> value == null ? 1 : value + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (occuranceMap.get(c) == 1)
                return i;
        }
        return -1;
    }
}
