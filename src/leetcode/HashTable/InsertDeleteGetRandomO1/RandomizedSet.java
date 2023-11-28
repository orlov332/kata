package leetcode.HashTable.InsertDeleteGetRandomO1;

import java.util.*;

class RandomizedSet {

    private final Map<Integer, Integer> container = new HashMap<>(200000);
    private final List<Integer> list = new ArrayList<>(200000);
    private final Random random = new Random();

    public boolean insert(int val) {
        boolean exist = container.containsKey(val);
        if (!exist) {
            container.put(val, list.size());
            list.add(val);
        }
        return !exist;
    }

    public boolean remove(int val) {
        Integer index = container.get(val);
        if (index != null) {
            container.remove(val);
            int lastIndex = list.size() - 1;
            if (index < lastIndex) {
                var lastValue = list.get(lastIndex);
                list.set(index, lastValue);
                container.put(lastValue, index);
            }
            list.remove(lastIndex);
        }
        return index != null;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
