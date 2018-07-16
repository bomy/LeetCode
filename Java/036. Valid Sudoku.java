class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set used = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char val = board[i][j];
                if (val != '.')
                    if (!used.add(val + " row " + i)||!used.add(val + " col " + j) 
                        ||!used.add(val + " subbox " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}
