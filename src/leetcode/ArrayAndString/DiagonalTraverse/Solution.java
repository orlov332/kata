package leetcode.ArrayAndString.DiagonalTraverse;

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int resLength = m * n;
        int[] res = new int[resLength];
        int resIndex = 0;

        int i = 0, iStep = -1;
        int j = 0, jStep = 1;
        while (resIndex < resLength) {
            while (i >= 0 && j < n && j >= 0 && i < m) {
                res[resIndex] = matrix[i][j];
                resIndex++;
                i += iStep;
                j += jStep;
            }
            if (jStep > 0 && j < n || iStep > 0 && i >= m)
                j++;
            else
                i++;

            iStep = -iStep;
            jStep = -jStep;

            i += iStep;
            j += jStep;
        }
        return res;
    }
}
