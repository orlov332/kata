package leetcode.HashTable.TwoSumIIIDataStructureDesign;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

    private final Map<Integer, Integer> numCount = new HashMap<>(10000);

    public void add(int number) {
        numCount.compute(number, (k, v) -> v == null ? 1 : v + 1);
    }

    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (numCount.containsKey(value - num) && (value - num != num || count > 1)) {
                return true;
            }
        }
        return false;
    }
}
