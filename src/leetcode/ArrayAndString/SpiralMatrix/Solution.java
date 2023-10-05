package leetcode.ArrayAndString.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int resLength = m * n;
        List<Integer> res = new ArrayList<>(resLength);

        int eastBorder = n - 1;
        int southBorder = m - 1;
        int westBorder = 0;
        int northBorder = 0;
        while (res.size() < resLength) {
            if (westBorder <= eastBorder) {
                for (int toEast = westBorder; toEast <= eastBorder; toEast++) {
                    res.add(matrix[northBorder][toEast]);
                }
                northBorder++;
                if (northBorder <= southBorder) {
                    for (int toSouth = northBorder; toSouth <= southBorder; toSouth++) {
                        res.add(matrix[toSouth][eastBorder]);
                    }
                    eastBorder--;
                    if (eastBorder >= westBorder) {
                        for (int toWest = eastBorder; toWest >= westBorder; toWest--) {
                            res.add(matrix[southBorder][toWest]);
                        }
                        southBorder--;
                        if (southBorder >= northBorder) {
                            for (int toNorth = southBorder; toNorth >= northBorder; toNorth--) {
                                res.add(matrix[toNorth][westBorder]);
                            }
                            westBorder++;
                        }
                    }
                }
            }
        }

        return res;
    }
}
