package leetcode.HashTable.ValidSudoku;

class Solution {

    private static final int BOARD_SIZE = 9;
    private static final int BOX_SIZE = 3;

    public boolean isValidSudoku(char[][] board) {
        int[] colAppearMap = new int[BOARD_SIZE];
        int[] rowAppearMap = new int[BOARD_SIZE];
        int[] boxAppearMap = new int[BOARD_SIZE];

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] != '.') {
                    int boxIndex = i / BOX_SIZE + (j / BOX_SIZE) * BOX_SIZE;
                    int key = 1 << (board[i][j] - '1');
                    if ((rowAppearMap[i] & key) == 0
                            && (colAppearMap[j] & key) == 0
                            && (boxAppearMap[boxIndex] & key) == 0) {
                        rowAppearMap[i] |= key;
                        colAppearMap[j] |= key;
                        boxAppearMap[boxIndex] |= key;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
