package leetcode.ArrayAndString.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> upperRow = null;
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>(rowNum + 1);
            for (int column = 0; column <= rowNum; column++) {
                if (column == 0 || column == rowNum) {
                    row.add(1);
                } else {
                    row.add(upperRow.get(column - 1) + upperRow.get(column));
                }
            }
            result.add(row);
            upperRow = row;
        }
        return result;
    }
}
