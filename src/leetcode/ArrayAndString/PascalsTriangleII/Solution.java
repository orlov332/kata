package leetcode.ArrayAndString.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = rowIndex;
        long value = 1;
        do {
            row.add((int) value);
            leftIndex++;
            value = (value * rightIndex) / leftIndex;
            rightIndex--;
        } while (leftIndex <= rowIndex);

        return row;
    }
}
