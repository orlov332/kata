package leetcode.HashTable.GroupShiftedStrings;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<BigInteger, List<String>> group = new HashMap<>(strings.length);
        for (String str : strings) {
            char base = str.charAt(0);
            char[] charArray = str.toCharArray();
            BigInteger groupKey = BigInteger.ZERO;
            for (int i = 0; i < charArray.length; i++) {
                char letter = charArray[i];
                BigInteger mark = BigInteger.valueOf(1 + (letter < base ? letter + 26 - base : letter - base));
                groupKey = groupKey.or(mark.shiftLeft(i * 5));
            }
            group.computeIfAbsent(groupKey, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(group.values());
    }
}
