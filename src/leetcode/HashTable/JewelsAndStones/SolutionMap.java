package leetcode.HashTable.JewelsAndStones;

import java.util.HashMap;
import java.util.Map;

class SolutionMap {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> stonesGroups = new HashMap<>(stones.length());
        for (char stone : stones.toCharArray()) {
            stonesGroups.compute(stone, (key, value) -> value == null ? 1 : value + 1);
        }

        int count = 0;
        for (char jewel : jewels.toCharArray()) {
            count += stonesGroups.getOrDefault(jewel, 0);
        }
        return count;
    }
}
